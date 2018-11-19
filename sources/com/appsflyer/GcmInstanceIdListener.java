package com.appsflyer;

import com.google.android.gms.iid.C2553a;
import com.google.android.gms.iid.InstanceIDListenerService;

public class GcmInstanceIdListener extends InstanceIDListenerService {
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String a = AppsFlyerProperties.m3086a().m3090a("gcmProjectNumber");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            a = C2553a.m9296c(getApplicationContext()).m9301b(a, "GCM", null);
        } catch (Throwable th) {
            AFLogger.m3073a("Error registering for uninstall tracking", th);
            a = null;
        }
        if (a != null) {
            StringBuilder stringBuilder = new StringBuilder("GCM Refreshed Token = ");
            stringBuilder.append(a);
            AFLogger.m3083d(stringBuilder.toString());
            C0947q a2 = C0947q.m3235a(AppsFlyerProperties.m3086a().m3090a("afUninstallToken"));
            C0947q c0947q = new C0947q(currentTimeMillis, a);
            if (a2 != null && a2.m3241a(c0947q)) {
                C0932h.m3175a(getApplicationContext(), c0947q);
            }
        }
    }
}
