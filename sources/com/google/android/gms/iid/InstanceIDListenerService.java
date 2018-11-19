package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.tinder.api.ManagerWebServices;

public class InstanceIDListenerService extends zzb {
    static void zza(Context context, C2565n c2565n) {
        c2565n.m9336b();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    public void handleIntent(Intent intent) {
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            Bundle bundle = null;
            String stringExtra = intent.getStringExtra("subtype");
            if (stringExtra != null) {
                bundle = new Bundle();
                bundle.putString("subtype", stringExtra);
            }
            C2553a a = C2553a.m9292a(this, bundle);
            String stringExtra2 = intent.getStringExtra("CMD");
            if (Log.isLoggable("InstanceID", 3)) {
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(stringExtra).length() + 34) + String.valueOf(stringExtra2).length());
                stringBuilder.append("Service command. subtype:");
                stringBuilder.append(stringExtra);
                stringBuilder.append(" command:");
                stringBuilder.append(stringExtra2);
                Log.d("InstanceID", stringBuilder.toString());
            }
            if ("gcm.googleapis.com/refresh".equals(intent.getStringExtra(ManagerWebServices.PARAM_FROM))) {
                C2553a.m9297d().m9339c(stringExtra);
            } else if ("RST".equals(stringExtra2)) {
                a.m9304c();
            } else {
                if ("RST_FULL".equals(stringExtra2)) {
                    if (!C2553a.m9297d().m9335a()) {
                        C2553a.m9297d().m9336b();
                    }
                } else if ("SYNC".equals(stringExtra2)) {
                    C2553a.m9297d().m9339c(stringExtra);
                    onTokenRefresh();
                }
                return;
            }
            onTokenRefresh();
        }
    }

    public void onTokenRefresh() {
    }
}
