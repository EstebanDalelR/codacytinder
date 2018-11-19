package com.foursquare.pilgrim;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

public class PilgrimBootReceiver extends az {
    @NonNull
    protected String getExpectedIntentString() {
        return "android.intent.action.BOOT_COMPLETED";
    }

    public void onIntentReceived(@NonNull Context context, @NonNull Intent intent) {
        try {
            if (bh.m7123c() != null) {
                PilgrimSdk.m6874a(context, true);
            }
        } catch (Context context2) {
            new RealExceptionReporter().reportException(context2);
        }
    }
}
