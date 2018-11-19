package com.leanplum;

import android.os.Bundle;
import com.google.android.gms.gcm.GcmListenerService;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;

public class LeanplumPushListenerService extends GcmListenerService {
    public void onMessageReceived(String str, Bundle bundle) {
        try {
            if (bundle.containsKey("lp_message") != null) {
                LeanplumPushService.a(this, bundle);
            }
            str = new Object[1];
            StringBuilder stringBuilder = new StringBuilder("Received: ");
            stringBuilder.append(bundle.toString());
            str[0] = stringBuilder.toString();
            ao.c(str);
        } catch (String str2) {
            bo.a(str2);
        }
    }
}
