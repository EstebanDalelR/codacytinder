package com.snapchat.kit.sdk;

import android.content.Context;
import android.support.annotation.NonNull;

public class SnapKit {
    /* renamed from: a */
    private static SnapKit f21556a;
    /* renamed from: b */
    private final SnapKitComponent f21557b;

    public static void start(@NonNull Context context) throws IllegalStateException {
        m25383a(context);
    }

    public static void unlink(@NonNull Context context) {
        getComponent(context).authTokenManager().revokeToken();
    }

    private SnapKit(@android.support.annotation.NonNull android.content.Context r6) throws java.lang.IllegalStateException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r5.<init>();
        r0 = r6.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0065 }
        r1 = r6.getPackageName();	 Catch:{ NameNotFoundException -> 0x0065 }
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0065 }
        r0 = r0.getApplicationInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0065 }
        r0 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0065 }
        if (r0 != 0) goto L_0x001d;	 Catch:{ NameNotFoundException -> 0x0065 }
    L_0x0015:
        r6 = new java.lang.IllegalStateException;	 Catch:{ NameNotFoundException -> 0x0065 }
        r0 = "No metadata for the current app!";	 Catch:{ NameNotFoundException -> 0x0065 }
        r6.<init>(r0);	 Catch:{ NameNotFoundException -> 0x0065 }
        throw r6;	 Catch:{ NameNotFoundException -> 0x0065 }
    L_0x001d:
        r1 = "com.snapchat.kit.sdk.clientId";	 Catch:{ NameNotFoundException -> 0x0065 }
        r1 = r0.getString(r1);	 Catch:{ NameNotFoundException -> 0x0065 }
        r2 = "com.snapchat.kit.sdk.redirectUrl";	 Catch:{ NameNotFoundException -> 0x0065 }
        r3 = "";	 Catch:{ NameNotFoundException -> 0x0065 }
        r2 = r0.getString(r2, r3);	 Catch:{ NameNotFoundException -> 0x0065 }
        r3 = "com.snapchat.kit.sdk.scopes";	 Catch:{ NameNotFoundException -> 0x0065 }
        r4 = 0;	 Catch:{ NameNotFoundException -> 0x0065 }
        r0 = r0.getInt(r3, r4);	 Catch:{ NameNotFoundException -> 0x0065 }
        if (r0 != 0) goto L_0x0037;	 Catch:{ NameNotFoundException -> 0x0065 }
    L_0x0034:
        r0 = new java.lang.String[r4];	 Catch:{ NameNotFoundException -> 0x0065 }
        goto L_0x003f;	 Catch:{ NameNotFoundException -> 0x0065 }
    L_0x0037:
        r3 = r6.getResources();	 Catch:{ NameNotFoundException -> 0x0065 }
        r0 = r3.getStringArray(r0);	 Catch:{ NameNotFoundException -> 0x0065 }
    L_0x003f:
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NameNotFoundException -> 0x0065 }
        if (r3 == 0) goto L_0x004d;	 Catch:{ NameNotFoundException -> 0x0065 }
    L_0x0045:
        r6 = new java.lang.IllegalStateException;	 Catch:{ NameNotFoundException -> 0x0065 }
        r0 = "client id must be set!";	 Catch:{ NameNotFoundException -> 0x0065 }
        r6.<init>(r0);	 Catch:{ NameNotFoundException -> 0x0065 }
        throw r6;	 Catch:{ NameNotFoundException -> 0x0065 }
    L_0x004d:
        r3 = com.snapchat.kit.sdk.C7112b.m30691a();	 Catch:{ NameNotFoundException -> 0x0065 }
        r4 = new com.snapchat.kit.sdk.d;	 Catch:{ NameNotFoundException -> 0x0065 }
        r0 = java.util.Arrays.asList(r0);	 Catch:{ NameNotFoundException -> 0x0065 }
        r4.<init>(r6, r1, r2, r0);	 Catch:{ NameNotFoundException -> 0x0065 }
        r6 = r3.m25397a(r4);	 Catch:{ NameNotFoundException -> 0x0065 }
        r6 = r6.m25396a();	 Catch:{ NameNotFoundException -> 0x0065 }
        r5.f21557b = r6;	 Catch:{ NameNotFoundException -> 0x0065 }
        return;
    L_0x0065:
        r6 = new java.lang.IllegalStateException;
        r0 = "Could not get metadata for current package";
        r6.<init>(r0);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.SnapKit.<init>(android.content.Context):void");
    }

    @NonNull
    /* renamed from: a */
    private static synchronized SnapKit m25383a(@NonNull Context context) {
        synchronized (SnapKit.class) {
            if (f21556a == null) {
                f21556a = new SnapKit(context.getApplicationContext());
            }
            context = f21556a;
        }
        return context;
    }

    static SnapKitComponent getComponent(@NonNull Context context) {
        return m25383a(context).f21557b;
    }
}
