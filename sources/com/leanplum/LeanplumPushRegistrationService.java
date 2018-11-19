package com.leanplum;

import android.app.IntentService;
import android.content.Intent;
import com.leanplum.p069a.ao;

public class LeanplumPushRegistrationService extends IntentService {
    /* renamed from: a */
    private static String f7853a;

    public LeanplumPushRegistrationService() {
        super("LeanplumPushRegistrationService");
    }

    protected void onHandleIntent(Intent intent) {
        intent = LeanplumPushService.m9407a();
        if (intent == null) {
            ao.m9516a("Failed to complete registration token refresh.");
            return;
        }
        String registrationId = intent.getRegistrationId();
        if (registrationId != null) {
            if (!(f7853a == null || registrationId.equals(f7853a))) {
                ao.m9516a("WARNING: It appears your app is registering with GCM/FCM using multiple GCM/FCM sender ids. Please be sure to call LeanplumPushService.setGcmSenderIds() with all of the GCM sender ids that you use, not just the one that you use with Leanplum. Otherwise, GCM/FCM push notifications may not work consistently.");
            }
            f7853a = registrationId;
            intent.a(getApplicationContext(), registrationId);
        }
    }
}
