package com.leanplum;

import android.content.Context;
import com.google.android.gms.iid.C2553a;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;
import com.leanplum.utils.SharedPreferencesUtil;

/* renamed from: com.leanplum.e */
final class C7045e extends C5731c {
    /* renamed from: a */
    private static final String f25641a = "TIMEOUT";
    /* renamed from: b */
    private static final String f25642b = "INVALID_SENDER";
    /* renamed from: c */
    private static final String f25643c = "AUTHENTICATION_FAILED";
    /* renamed from: d */
    private static final String f25644d = "PHONE_REGISTRATION_ERROR";
    /* renamed from: e */
    private static final String f25645e = "TOO_MANY_REGISTRATIONS";
    /* renamed from: f */
    private static String f25646f;

    C7045e() {
    }

    /* renamed from: a */
    static void m30612a(String str) {
        f25646f = str;
    }

    public final void storePreferences(Context context) {
        super.storePreferences(context);
        ao.d(new Object[]{"Saving GCM sender ID"});
        SharedPreferencesUtil.setString(context, "__leanplum_push__", "sender_ids", f25646f);
    }

    public final String getRegistrationId() {
        String str = null;
        try {
            C2553a c = C2553a.c(Leanplum.getContext());
            if (f25646f != null) {
                if (c != null) {
                    str = c.b(f25646f, "GCM", null);
                    return str;
                }
            }
            ao.b(new Object[]{"There was a problem setting up GCM, please make sure you follow instructions on how to set it up."});
            return null;
        } catch (Throwable e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage())) {
                ao.b(new Object[]{"GCM service is not available. Will try to register again next time the app starts."});
            } else if (f25641a.equals(e.getMessage())) {
                ao.b(new Object[]{"Retrieval of GCM registration token timed out. Will try to register again next time the app starts."});
            } else if (f25642b.equals(e.getMessage())) {
                ao.a(new Object[]{"The GCM sender account is not recognized. Please be sure to call LeanplumPushService.setGsmSenderId() with a valid GCM sender id."});
            } else if (f25643c.equals(e.getMessage())) {
                ao.b(new Object[]{"Bad Google Account password."});
            } else if (f25644d.equals(e.getMessage())) {
                ao.b(new Object[]{"This phone doesn't currently support GCM."});
            } else if (f25645e.equals(e.getMessage())) {
                ao.b(new Object[]{"This phone has more than the allowed number of apps that are registered with GCM."});
            } else {
                ao.a(new Object[]{"Failed to complete registration token refresh."});
                bo.a(e);
            }
        } catch (Throwable e2) {
            ao.b(new Object[]{"There was a problem setting up GCM, please make sure you follow instructions on how to set it up. Please verify that you are using correct version of Google Play Services and Android Support Library v4."});
            bo.a(e2);
        }
    }

    public final boolean isInitialized() {
        if (f25646f == null) {
            if (C5731c.m25187a() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isManifestSetup() {
        /*
        r13 = this;
        r0 = com.leanplum.Leanplum.getContext();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = 1;
        r3 = "com.google.android.c2dm.permission.RECEIVE";
        r3 = com.leanplum.p069a.ak.m25038a(r3, r1, r2);	 Catch:{ Throwable -> 0x00d0 }
        if (r3 == 0) goto L_0x0049;
    L_0x0011:
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00d0 }
        r3.<init>();	 Catch:{ Throwable -> 0x00d0 }
        r4 = r0.getPackageName();	 Catch:{ Throwable -> 0x00d0 }
        r3.append(r4);	 Catch:{ Throwable -> 0x00d0 }
        r4 = ".gcm.permission.C2D_MESSAGE";
        r3.append(r4);	 Catch:{ Throwable -> 0x00d0 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x00d0 }
        r3 = com.leanplum.p069a.ak.m25038a(r3, r2, r1);	 Catch:{ Throwable -> 0x00d0 }
        if (r3 != 0) goto L_0x0047;
    L_0x002c:
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00d0 }
        r3.<init>();	 Catch:{ Throwable -> 0x00d0 }
        r4 = r0.getPackageName();	 Catch:{ Throwable -> 0x00d0 }
        r3.append(r4);	 Catch:{ Throwable -> 0x00d0 }
        r4 = ".permission.C2D_MESSAGE";
        r3.append(r4);	 Catch:{ Throwable -> 0x00d0 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x00d0 }
        r3 = com.leanplum.p069a.ak.m25038a(r3, r2, r2);	 Catch:{ Throwable -> 0x00d0 }
        if (r3 == 0) goto L_0x0049;
    L_0x0047:
        r3 = 1;
        goto L_0x004a;
    L_0x0049:
        r3 = 0;
    L_0x004a:
        r4 = com.leanplum.p069a.al.RECEIVER;	 Catch:{ Throwable -> 0x00d0 }
        r5 = "com.google.android.gms.gcm.GcmReceiver";
        r6 = 1;
        r7 = "com.google.android.c2dm.permission.SEND";
        r8 = "com.google.android.c2dm.intent.RECEIVE";
        r9 = "com.google.android.c2dm.intent.REGISTRATION";
        r8 = new java.lang.String[]{r8, r9};	 Catch:{ Throwable -> 0x00d0 }
        r8 = java.util.Arrays.asList(r8);	 Catch:{ Throwable -> 0x00d0 }
        r9 = r0.getPackageName();	 Catch:{ Throwable -> 0x00d0 }
        r4 = com.leanplum.p069a.ak.m25037a(r4, r5, r6, r7, r8, r9);	 Catch:{ Throwable -> 0x00d0 }
        r5 = com.leanplum.p069a.al.RECEIVER;	 Catch:{ Throwable -> 0x00d0 }
        r6 = "com.leanplum.LeanplumPushReceiver";
        r7 = 0;
        r8 = 0;
        r9 = "com.leanplum.LeanplumPushListenerService";
        r9 = java.util.Collections.singletonList(r9);	 Catch:{ Throwable -> 0x00d0 }
        r10 = r0.getPackageName();	 Catch:{ Throwable -> 0x00d0 }
        r5 = com.leanplum.p069a.ak.m25037a(r5, r6, r7, r8, r9, r10);	 Catch:{ Throwable -> 0x00d0 }
        if (r4 == 0) goto L_0x007f;
    L_0x007b:
        if (r5 == 0) goto L_0x007f;
    L_0x007d:
        r4 = 1;
        goto L_0x0080;
    L_0x007f:
        r4 = 0;
    L_0x0080:
        r5 = com.leanplum.p069a.al.SERVICE;	 Catch:{ Throwable -> 0x00d0 }
        r6 = "com.leanplum.LeanplumPushListenerService";
        r7 = 0;
        r8 = 0;
        r9 = "com.google.android.c2dm.intent.RECEIVE";
        r9 = java.util.Collections.singletonList(r9);	 Catch:{ Throwable -> 0x00d0 }
        r10 = r0.getPackageName();	 Catch:{ Throwable -> 0x00d0 }
        r5 = com.leanplum.p069a.ak.m25037a(r5, r6, r7, r8, r9, r10);	 Catch:{ Throwable -> 0x00d0 }
        r6 = com.leanplum.p069a.al.SERVICE;	 Catch:{ Throwable -> 0x00d0 }
        r7 = "com.leanplum.LeanplumPushInstanceIDService";
        r8 = 0;
        r9 = 0;
        r10 = "com.google.android.gms.iid.InstanceID";
        r10 = java.util.Collections.singletonList(r10);	 Catch:{ Throwable -> 0x00d0 }
        r11 = r0.getPackageName();	 Catch:{ Throwable -> 0x00d0 }
        r6 = com.leanplum.p069a.ak.m25037a(r6, r7, r8, r9, r10, r11);	 Catch:{ Throwable -> 0x00d0 }
        r7 = com.leanplum.p069a.al.SERVICE;	 Catch:{ Throwable -> 0x00d0 }
        r8 = "com.leanplum.LeanplumPushRegistrationService";
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = r0.getPackageName();	 Catch:{ Throwable -> 0x00d0 }
        r0 = com.leanplum.p069a.ak.m25037a(r7, r8, r9, r10, r11, r12);	 Catch:{ Throwable -> 0x00d0 }
        if (r5 == 0) goto L_0x00bf;
    L_0x00b9:
        if (r6 == 0) goto L_0x00bf;
    L_0x00bb:
        if (r0 == 0) goto L_0x00bf;
    L_0x00bd:
        r0 = 1;
        goto L_0x00c0;
    L_0x00bf:
        r0 = 0;
    L_0x00c0:
        if (r3 == 0) goto L_0x00d4;
    L_0x00c2:
        if (r4 == 0) goto L_0x00d4;
    L_0x00c4:
        if (r0 == 0) goto L_0x00d4;
    L_0x00c6:
        r0 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x00d0 }
        r3 = "Google Cloud Messaging is setup correctly.";
        r0[r1] = r3;	 Catch:{ Throwable -> 0x00d0 }
        com.leanplum.p069a.ao.c(r0);	 Catch:{ Throwable -> 0x00d0 }
        return r2;
    L_0x00d0:
        r0 = move-exception;
        com.leanplum.p069a.bo.a(r0);
    L_0x00d4:
        r0 = new java.lang.Object[r2];
        r2 = "Failed to setup Google Cloud Messaging, check your manifest configuration.";
        r0[r1] = r2;
        com.leanplum.p069a.ao.a(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.e.isManifestSetup():boolean");
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
        r2 = com.leanplum.Leanplum.getContext();	 Catch:{ Exception -> 0x0017 }
        r2 = com.google.android.gms.iid.C2553a.c(r2);	 Catch:{ Exception -> 0x0017 }
        r2.b();	 Catch:{ Exception -> 0x0017 }
        r2 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0017 }
        r3 = "Application was unregistered from GCM.";	 Catch:{ Exception -> 0x0017 }
        r2[r0] = r3;	 Catch:{ Exception -> 0x0017 }
        com.leanplum.p069a.ao.c(r2);	 Catch:{ Exception -> 0x0017 }
        return;
    L_0x0017:
        r1 = new java.lang.Object[r1];
        r2 = "Failed to unregister from GCM.";
        r1[r0] = r2;
        com.leanplum.p069a.ao.a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.e.unregister():void");
    }
}
