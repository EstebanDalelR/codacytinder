package com.crashlytics.android.beta;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.C15622f;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.settings.C15660f;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class AbstractCheckForUpdatesController implements UpdatesController {
    static final long LAST_UPDATE_CHECK_DEFAULT = 0;
    static final String LAST_UPDATE_CHECK_KEY = "last_update_check";
    private static final long MILLIS_PER_SECOND = 1000;
    private Beta beta;
    private C15660f betaSettings;
    private BuildProperties buildProps;
    private Context context;
    private CurrentTimeProvider currentTimeProvider;
    private final AtomicBoolean externallyReady;
    private HttpRequestFactory httpRequestFactory;
    private IdManager idManager;
    private final AtomicBoolean initialized;
    private long lastCheckTimeMillis;
    private PreferenceStore preferenceStore;

    public AbstractCheckForUpdatesController() {
        this(false);
    }

    public AbstractCheckForUpdatesController(boolean z) {
        this.initialized = new AtomicBoolean();
        this.lastCheckTimeMillis = 0;
        this.externallyReady = new AtomicBoolean(z);
    }

    public void initialize(Context context, Beta beta, IdManager idManager, C15660f c15660f, BuildProperties buildProperties, PreferenceStore preferenceStore, CurrentTimeProvider currentTimeProvider, HttpRequestFactory httpRequestFactory) {
        this.context = context;
        this.beta = beta;
        this.idManager = idManager;
        this.betaSettings = c15660f;
        this.buildProps = buildProperties;
        this.preferenceStore = preferenceStore;
        this.currentTimeProvider = currentTimeProvider;
        this.httpRequestFactory = httpRequestFactory;
        if (signalInitialized() != null) {
            checkForUpdates();
        }
    }

    protected boolean signalExternallyReady() {
        this.externallyReady.set(true);
        return this.initialized.get();
    }

    boolean signalInitialized() {
        this.initialized.set(true);
        return this.externallyReady.get();
    }

    @SuppressLint({"CommitPrefEdits"})
    protected void checkForUpdates() {
        synchronized (this.preferenceStore) {
            if (this.preferenceStore.get().contains(LAST_UPDATE_CHECK_KEY)) {
                this.preferenceStore.save(this.preferenceStore.edit().remove(LAST_UPDATE_CHECK_KEY));
            }
        }
        long currentTimeMillis = this.currentTimeProvider.getCurrentTimeMillis();
        long j = ((long) this.betaSettings.f48482b) * 1000;
        Logger h = C15608c.h();
        String str = Beta.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Check for updates delay: ");
        stringBuilder.append(j);
        h.d(str, stringBuilder.toString());
        h = C15608c.h();
        str = Beta.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Check for updates last check time: ");
        stringBuilder.append(getLastCheckTimeMillis());
        h.d(str, stringBuilder.toString());
        long lastCheckTimeMillis = getLastCheckTimeMillis() + j;
        Logger h2 = C15608c.h();
        String str2 = Beta.TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Check for updates current time: ");
        stringBuilder2.append(currentTimeMillis);
        stringBuilder2.append(", next check time: ");
        stringBuilder2.append(lastCheckTimeMillis);
        h2.d(str2, stringBuilder2.toString());
        if (currentTimeMillis >= lastCheckTimeMillis) {
            try {
                performUpdateCheck();
            } finally {
                setLastCheckTimeMillis(currentTimeMillis);
            }
        } else {
            C15608c.h().d(Beta.TAG, "Check for updates next check time was not passed");
        }
    }

    private void performUpdateCheck() {
        C15608c.h().d(Beta.TAG, "Performing update check");
        new CheckForUpdatesRequest(this.beta, this.beta.getOverridenSpiEndpoint(), this.betaSettings.f48481a, this.httpRequestFactory, new CheckForUpdatesResponseTransform()).invoke(new C15622f().a(this.context), (String) this.idManager.h().get(DeviceIdentifierType.FONT_TOKEN), this.buildProps);
    }

    void setLastCheckTimeMillis(long j) {
        this.lastCheckTimeMillis = j;
    }

    long getLastCheckTimeMillis() {
        return this.lastCheckTimeMillis;
    }
}
