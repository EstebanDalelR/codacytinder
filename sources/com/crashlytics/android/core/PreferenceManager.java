package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import io.fabric.sdk.android.services.persistence.C17347b;
import io.fabric.sdk.android.services.persistence.PreferenceStore;

@SuppressLint({"CommitPrefEdits"})
class PreferenceManager {
    static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
    private static final String PREF_MIGRATION_COMPLETE = "preferences_migration_complete";
    private static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT = false;
    private final CrashlyticsCore kit;
    private final PreferenceStore preferenceStore;

    public static PreferenceManager create(PreferenceStore preferenceStore, CrashlyticsCore crashlyticsCore) {
        return new PreferenceManager(preferenceStore, crashlyticsCore);
    }

    public PreferenceManager(PreferenceStore preferenceStore, CrashlyticsCore crashlyticsCore) {
        this.preferenceStore = preferenceStore;
        this.kit = crashlyticsCore;
    }

    void setShouldAlwaysSendReports(boolean z) {
        this.preferenceStore.save(this.preferenceStore.edit().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, z));
    }

    boolean shouldAlwaysSendReports() {
        if (!this.preferenceStore.get().contains(PREF_MIGRATION_COMPLETE)) {
            PreferenceStore c17347b = new C17347b(this.kit);
            Object obj = (this.preferenceStore.get().contains(PREF_ALWAYS_SEND_REPORTS_KEY) || !c17347b.get().contains(PREF_ALWAYS_SEND_REPORTS_KEY)) ? null : 1;
            if (obj != null) {
                this.preferenceStore.save(this.preferenceStore.edit().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, c17347b.get().getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false)));
            }
            this.preferenceStore.save(this.preferenceStore.edit().putBoolean(PREF_MIGRATION_COMPLETE, true));
        }
        return this.preferenceStore.get().getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false);
    }
}
