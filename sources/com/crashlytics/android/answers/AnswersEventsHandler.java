package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.services.events.EventsStorageListener;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.C15656b;
import java.util.concurrent.ScheduledExecutorService;

class AnswersEventsHandler implements EventsStorageListener {
    private final Context context;
    final ScheduledExecutorService executor;
    private final AnswersFilesManagerProvider filesManagerProvider;
    private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    private final C15611g kit;
    private final SessionMetadataCollector metadataCollector;
    private final HttpRequestFactory requestFactory;
    SessionAnalyticsManagerStrategy strategy = new DisabledSessionAnalyticsManagerStrategy();

    /* renamed from: com.crashlytics.android.answers.AnswersEventsHandler$2 */
    class C10762 implements Runnable {
        C10762() {
        }

        public void run() {
            try {
                SessionAnalyticsManagerStrategy sessionAnalyticsManagerStrategy = AnswersEventsHandler.this.strategy;
                AnswersEventsHandler.this.strategy = new DisabledSessionAnalyticsManagerStrategy();
                sessionAnalyticsManagerStrategy.deleteAllEvents();
            } catch (Throwable e) {
                C15608c.h().e(Answers.TAG, "Failed to disable events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.AnswersEventsHandler$3 */
    class C10773 implements Runnable {
        C10773() {
        }

        public void run() {
            try {
                AnswersEventsHandler.this.strategy.sendEvents();
            } catch (Throwable e) {
                C15608c.h().e(Answers.TAG, "Failed to send events files", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.AnswersEventsHandler$4 */
    class C10784 implements Runnable {
        C10784() {
        }

        public void run() {
            try {
                SessionEventMetadata metadata = AnswersEventsHandler.this.metadataCollector.getMetadata();
                SessionAnalyticsFilesManager analyticsFilesManager = AnswersEventsHandler.this.filesManagerProvider.getAnalyticsFilesManager();
                analyticsFilesManager.registerRollOverListener(AnswersEventsHandler.this);
                AnswersEventsHandler.this.strategy = new EnabledSessionAnalyticsManagerStrategy(AnswersEventsHandler.this.kit, AnswersEventsHandler.this.context, AnswersEventsHandler.this.executor, analyticsFilesManager, AnswersEventsHandler.this.requestFactory, metadata, AnswersEventsHandler.this.firebaseAnalyticsApiAdapter);
            } catch (Throwable e) {
                C15608c.h().e(Answers.TAG, "Failed to enable events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.AnswersEventsHandler$5 */
    class C10795 implements Runnable {
        C10795() {
        }

        public void run() {
            try {
                AnswersEventsHandler.this.strategy.rollFileOver();
            } catch (Throwable e) {
                C15608c.h().e(Answers.TAG, "Failed to flush events", e);
            }
        }
    }

    public AnswersEventsHandler(C15611g c15611g, Context context, AnswersFilesManagerProvider answersFilesManagerProvider, SessionMetadataCollector sessionMetadataCollector, HttpRequestFactory httpRequestFactory, ScheduledExecutorService scheduledExecutorService, FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter) {
        this.kit = c15611g;
        this.context = context;
        this.filesManagerProvider = answersFilesManagerProvider;
        this.metadataCollector = sessionMetadataCollector;
        this.requestFactory = httpRequestFactory;
        this.executor = scheduledExecutorService;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter;
    }

    public void processEventAsync(Builder builder) {
        processEvent(builder, false, false);
    }

    public void processEventAsyncAndFlush(Builder builder) {
        processEvent(builder, false, true);
    }

    public void processEventSync(Builder builder) {
        processEvent(builder, true, false);
    }

    public void setAnalyticsSettingsData(final C15656b c15656b, final String str) {
        executeAsync(new Runnable() {
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.setAnalyticsSettingsData(c15656b, str);
                } catch (Throwable e) {
                    C15608c.h().e(Answers.TAG, "Failed to set analytics settings data", e);
                }
            }
        });
    }

    public void disable() {
        executeAsync(new C10762());
    }

    public void onRollOver(String str) {
        executeAsync(new C10773());
    }

    public void enable() {
        executeAsync(new C10784());
    }

    public void flushEvents() {
        executeAsync(new C10795());
    }

    void processEvent(final Builder builder, boolean z, final boolean z2) {
        Runnable c10806 = new Runnable() {
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.processEvent(builder);
                    if (z2) {
                        AnswersEventsHandler.this.strategy.rollFileOver();
                    }
                } catch (Throwable e) {
                    C15608c.h().e(Answers.TAG, "Failed to process event", e);
                }
            }
        };
        if (z) {
            executeSync(c10806);
        } else {
            executeAsync(c10806);
        }
    }

    private void executeSync(Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        } catch (Runnable runnable2) {
            C15608c.h().e(Answers.TAG, "Failed to run events task", runnable2);
        }
    }

    private void executeAsync(Runnable runnable) {
        try {
            this.executor.submit(runnable);
        } catch (Runnable runnable2) {
            C15608c.h().e(Answers.TAG, "Failed to submit events task", runnable2);
        }
    }
}
