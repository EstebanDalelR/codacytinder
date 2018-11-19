package com.leanplum;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.leanplum.p069a.ak;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;

public class LeanplumPushReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            try {
                ao.a(new Object[]{"Received a null intent."});
            } catch (Context context2) {
                bo.a(context2);
            }
        } else {
            String a = ak.m25028a();
            if (a == null) {
                ao.f(new Object[]{"Custom broadcast receiver class not set, using default one."});
                LeanplumPushService.a(context2, intent);
                return;
            }
            ao.f(new Object[]{"Custom broadcast receiver class found, using it to handle push notifications."});
            Intent intent2 = new Intent();
            intent2.setAction(LeanplumPushService.LEANPLUM_NOTIFICATION);
            intent2.setClassName(context2, a);
            intent2.putExtras(intent.getExtras());
            context2.sendBroadcast(intent2);
        }
    }
}
