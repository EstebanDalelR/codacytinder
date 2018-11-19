package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.C1745t;

public class FacebookBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    protected void m3971a(String str, String str2, Bundle bundle) {
    }

    /* renamed from: b */
    protected void m3972b(String str, String str2, Bundle bundle) {
    }

    public void onReceive(Context context, Intent intent) {
        context = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        if (context != null && stringExtra != null) {
            Bundle extras = intent.getExtras();
            if (C1745t.m6048f(intent) != null) {
                m3972b(context, stringExtra, extras);
            } else {
                m3971a(context, stringExtra, extras);
            }
        }
    }
}
