package com.leanplum;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.leanplum.p069a.ak;
import com.leanplum.p069a.al;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;
import java.util.Collections;

/* renamed from: com.leanplum.d */
final class C7044d extends C5731c {
    public final boolean isInitialized() {
        return true;
    }

    C7044d() {
    }

    public final String getRegistrationId() {
        return FirebaseInstanceId.getInstance().getToken();
    }

    public final boolean isManifestSetup() {
        Context context = Leanplum.getContext();
        if (context == null) {
            return false;
        }
        try {
            boolean a = ak.m25037a(al.RECEIVER, "com.leanplum.LeanplumPushReceiver", false, null, Collections.singletonList("com.leanplum.LeanplumPushFirebaseMessagingService"), context.getPackageName());
            Object obj = (ak.m25037a(al.SERVICE, "com.leanplum.LeanplumPushFirebaseMessagingService", false, null, Collections.singletonList("com.google.firebase.MESSAGING_EVENT"), context.getPackageName()) && ak.m25037a(al.SERVICE, "com.leanplum.LeanplumPushFcmListenerService", false, null, Collections.singletonList("com.google.firebase.INSTANCE_ID_EVENT"), context.getPackageName()) && ak.m25037a(al.SERVICE, LeanplumPushRegistrationService.class.getName(), false, null, null, context.getPackageName())) ? 1 : null;
            if (a && obj != null) {
                ao.c(new Object[]{"Firebase Messaging is setup correctly."});
                return true;
            }
        } catch (Throwable th) {
            bo.a(th);
        }
        ao.a(new Object[]{"Failed to setup Firebase Messaging, check your manifest configuration."});
        return false;
    }

    public final void unregister() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = 0;
        r1 = 1;
        r2 = com.google.firebase.iid.FirebaseInstanceId.getInstance();	 Catch:{ Exception -> 0x0013 }
        r2.deleteInstanceId();	 Catch:{ Exception -> 0x0013 }
        r2 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0013 }
        r3 = "Application was unregistered from FCM.";	 Catch:{ Exception -> 0x0013 }
        r2[r0] = r3;	 Catch:{ Exception -> 0x0013 }
        com.leanplum.p069a.ao.c(r2);	 Catch:{ Exception -> 0x0013 }
        return;
    L_0x0013:
        r1 = new java.lang.Object[r1];
        r2 = "Failed to unregister from FCM.";
        r1[r0] = r2;
        com.leanplum.p069a.ao.a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.d.unregister():void");
    }
}
