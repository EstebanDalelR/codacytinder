package com.leanplum;

import android.content.Context;

public class LeanplumManualProvider extends C5731c {
    public boolean isInitialized() {
        return true;
    }

    public boolean isManifestSetup() {
        return true;
    }

    public void unregister() {
    }

    public /* bridge */ /* synthetic */ void storePreferences(Context context) {
        super.storePreferences(context);
    }

    LeanplumManualProvider(Context context, String str) {
        m25189a(context, str);
    }

    public String getRegistrationId() {
        return C5731c.m25187a();
    }
}
