package com.tinder.services;

import android.content.Intent;
import com.google.android.gms.iid.InstanceIDListenerService;

public class InstanceIdUpdateListenerService extends InstanceIDListenerService {
    public void onTokenRefresh() {
        startService(new Intent(this, GCMRegistrationIntentService.class));
    }
}
