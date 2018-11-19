package com.leanplum;

import android.content.Intent;
import com.google.android.gms.iid.InstanceIDListenerService;
import com.leanplum.p069a.ao;

public class LeanplumPushInstanceIDService extends InstanceIDListenerService {
    public void onTokenRefresh() {
        ao.c(new Object[]{"GCM InstanceID token needs an update"});
        startService(new Intent(this, LeanplumPushRegistrationService.class));
    }
}
