package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.answers.BackgroundManager.Listener;
import io.fabric.sdk.android.C15606a;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.C15626i;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.C17345b;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.C17346a;
import io.fabric.sdk.android.services.settings.C15656b;
import java.util.concurrent.ScheduledExecutorService;

class SessionAnalyticsManager implements Listener {
    static final String EXECUTOR_SERVICE = "Answers Events Handler";
    static final String ON_CRASH_ERROR_MSG = "onCrash called from main thread!!!";
    final BackgroundManager backgroundManager;
    final AnswersEventsHandler eventsHandler;
    private final long installedAt;
    final C15606a lifecycleManager;
    final AnswersPreferenceManager preferenceManager;

    public void onError(String str) {
    }

    public static SessionAnalyticsManager build(C15611g c15611g, Context context, IdManager idManager, String str, String str2, long j) {
        Context context2 = context;
        SessionMetadataCollector sessionMetadataCollector = new SessionMetadataCollector(context2, idManager, str, str2);
        C15611g c15611g2 = c15611g;
        AnswersFilesManagerProvider answersFilesManagerProvider = new AnswersFilesManagerProvider(context2, new C17346a(c15611g2));
        HttpRequestFactory c17345b = new C17345b(C15608c.h());
        C15606a c15606a = new C15606a(context2);
        ScheduledExecutorService b = C15626i.b(EXECUTOR_SERVICE);
        BackgroundManager backgroundManager = new BackgroundManager(b);
        return new SessionAnalyticsManager(new AnswersEventsHandler(c15611g2, context2, answersFilesManagerProvider, sessionMetadataCollector, c17345b, b, new FirebaseAnalyticsApiAdapter(context2)), c15606a, backgroundManager, AnswersPreferenceManager.build(context2), j);
    }

    SessionAnalyticsManager(AnswersEventsHandler answersEventsHandler, C15606a c15606a, BackgroundManager backgroundManager, AnswersPreferenceManager answersPreferenceManager, long j) {
        this.eventsHandler = answersEventsHandler;
        this.lifecycleManager = c15606a;
        this.backgroundManager = backgroundManager;
        this.preferenceManager = answersPreferenceManager;
        this.installedAt = j;
    }

    public void enable() {
        this.eventsHandler.enable();
        this.lifecycleManager.a(new AnswersLifecycleCallbacks(this, this.backgroundManager));
        this.backgroundManager.registerListener(this);
        if (isFirstLaunch()) {
            onInstall(this.installedAt);
            this.preferenceManager.setAnalyticsLaunched();
        }
    }

    public void disable() {
        this.lifecycleManager.a();
        this.eventsHandler.disable();
    }

    public void onCustom(CustomEvent customEvent) {
        Logger h = C15608c.h();
        String str = Answers.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Logged custom event: ");
        stringBuilder.append(customEvent);
        h.d(str, stringBuilder.toString());
        this.eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customEvent));
    }

    public void onPredefined(PredefinedEvent predefinedEvent) {
        Logger h = C15608c.h();
        String str = Answers.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Logged predefined event: ");
        stringBuilder.append(predefinedEvent);
        h.d(str, stringBuilder.toString());
        this.eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedEvent));
    }

    public void onCrash(String str, String str2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(ON_CRASH_ERROR_MSG);
        }
        C15608c.h().d(Answers.TAG, "Logged crash");
        this.eventsHandler.processEventSync(SessionEvent.crashEventBuilder(str, str2));
    }

    public void onInstall(long j) {
        C15608c.h().d(Answers.TAG, "Logged install");
        this.eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(j));
    }

    public void onLifecycle(Activity activity, Type type) {
        Logger h = C15608c.h();
        String str = Answers.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Logged lifecycle event: ");
        stringBuilder.append(type.name());
        h.d(str, stringBuilder.toString());
        this.eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
    }

    public void onBackground() {
        C15608c.h().d(Answers.TAG, "Flush events when app is backgrounded");
        this.eventsHandler.flushEvents();
    }

    public void setAnalyticsSettingsData(C15656b c15656b, String str) {
        this.backgroundManager.setFlushOnBackground(c15656b.f48458j);
        this.eventsHandler.setAnalyticsSettingsData(c15656b, str);
    }

    boolean isFirstLaunch() {
        return this.preferenceManager.hasAnalyticsLaunched() ^ 1;
    }
}
