package com.leanplum;

import android.app.IntentService;
import android.content.Intent;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;

public class LeanplumLocalPushListenerService extends IntentService {
    public LeanplumLocalPushListenerService() {
        super("LeanplumLocalPushListenerService");
    }

    protected void onHandleIntent(Intent intent) {
        if (intent == null) {
            try {
                ao.a(new Object[]{"The intent cannot be null"});
                return;
            } catch (Intent intent2) {
                bo.a(intent2);
                return;
            }
        }
        intent2 = intent2.getExtras();
        if (intent2 != null && intent2.containsKey("lp_message")) {
            LeanplumPushService.a(this, intent2);
        }
    }
}
