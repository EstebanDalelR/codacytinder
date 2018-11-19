package com.leanplum;

import android.annotation.SuppressLint;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.leanplum.p069a.ao;

@SuppressLint({"Registered"})
public class LeanplumPushFcmListenerService extends FirebaseInstanceIdService {
    public void onTokenRefresh() {
        ao.c(new Object[]{"FCM InstanceID token needs an update"});
        startService(new Intent(this, LeanplumPushRegistrationService.class));
    }
}
