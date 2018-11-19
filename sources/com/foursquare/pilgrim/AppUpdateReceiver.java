package com.foursquare.pilgrim;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

public final class AppUpdateReceiver extends az {
    @NonNull
    protected String getExpectedIntentString() {
        return "android.intent.action.MY_PACKAGE_REPLACED";
    }

    protected void onIntentReceived(@NonNull Context context, @NonNull Intent intent) {
        try {
            aj.m6925b(context, true);
            if (bh.m7123c() != null) {
                C3568u.m13416a().m3756D();
            }
        } catch (Context context2) {
            new RealExceptionReporter().reportException(context2);
        }
    }
}
