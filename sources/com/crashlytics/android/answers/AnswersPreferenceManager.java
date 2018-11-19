package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.services.persistence.C17347b;
import io.fabric.sdk.android.services.persistence.PreferenceStore;

class AnswersPreferenceManager {
    static final String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
    static final String PREF_STORE_NAME = "settings";
    private final PreferenceStore prefStore;

    public static AnswersPreferenceManager build(Context context) {
        return new AnswersPreferenceManager(new C17347b(context, PREF_STORE_NAME));
    }

    AnswersPreferenceManager(PreferenceStore preferenceStore) {
        this.prefStore = preferenceStore;
    }

    @SuppressLint({"CommitPrefEdits"})
    public void setAnalyticsLaunched() {
        this.prefStore.save(this.prefStore.edit().putBoolean(PREFKEY_ANALYTICS_LAUNCHED, true));
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean hasAnalyticsLaunched() {
        return this.prefStore.get().getBoolean(PREFKEY_ANALYTICS_LAUNCHED, false);
    }
}
