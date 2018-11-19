package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import com.google.android.m4b.maps.p123w.C5533a.C6781b;

public class af {
    /* renamed from: a */
    private static volatile String f17316a = null;
    /* renamed from: b */
    private static final String f17317b = "af";

    private af() {
    }

    /* renamed from: a */
    public static String m20938a(Context context) {
        String str = f17316a;
        if (str != null) {
            return str;
        }
        if (VERSION.SDK.equals("deskdroid")) {
            return null;
        }
        str = Secure.getString(context.getContentResolver(), "logging_id2");
        if (str == null) {
            str = C6781b.m30156a(context.getContentResolver(), "logging_id2");
        }
        f17316a = str;
        return str;
    }

    /* renamed from: b */
    public static String m20940b(Context context) {
        context = m20939a(context, "maps_client_id");
        StringBuilder stringBuilder = new StringBuilder();
        if (context != null) {
            if (context.length() != 0) {
                stringBuilder.append(context);
                return stringBuilder.toString();
            }
        }
        stringBuilder.append("Web");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static java.lang.String m20939a(android.content.Context r7, java.lang.String r8) {
        /*
        r0 = 0;
        r1 = r7.getContentResolver();	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r7 = "content://com.google.settings/partner";
        r2 = android.net.Uri.parse(r7);	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r7 = "value";
        r3 = new java.lang.String[]{r7};	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r7 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r4 = java.lang.String.valueOf(r8);	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r4 = r4.length();	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r4 = r4 + 7;
        r7.<init>(r4);	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r4 = "name='";
        r7.append(r4);	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r7.append(r8);	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r4 = "'";
        r7.append(r4);	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r4 = r7.toString();	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        r5 = 0;
        r6 = 0;
        r7 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ Throwable -> 0x0056, all -> 0x0053 }
        if (r7 == 0) goto L_0x004d;
    L_0x0039:
        r1 = r7.moveToFirst();	 Catch:{ Throwable -> 0x004b }
        if (r1 == 0) goto L_0x004d;
    L_0x003f:
        r1 = "value";
        r1 = r7.getColumnIndexOrThrow(r1);	 Catch:{ Throwable -> 0x004b }
        r1 = r7.getString(r1);	 Catch:{ Throwable -> 0x004b }
        r0 = r1;
        goto L_0x004d;
    L_0x004b:
        r1 = move-exception;
        goto L_0x0058;
    L_0x004d:
        if (r7 == 0) goto L_0x0099;
    L_0x004f:
        r7.close();
        goto L_0x0099;
    L_0x0053:
        r8 = move-exception;
        r7 = r0;
        goto L_0x009b;
    L_0x0056:
        r1 = move-exception;
        r7 = r0;
    L_0x0058:
        r2 = f17317b;	 Catch:{ all -> 0x009a }
        r3 = 3;
        r2 = com.google.android.m4b.maps.ay.C4728u.m21050a(r2, r3);	 Catch:{ all -> 0x009a }
        if (r2 == 0) goto L_0x0096;
    L_0x0061:
        r2 = f17317b;	 Catch:{ all -> 0x009a }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x009a }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009a }
        r4 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x009a }
        r4 = r4.length();	 Catch:{ all -> 0x009a }
        r4 = r4 + 45;
        r5 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x009a }
        r5 = r5.length();	 Catch:{ all -> 0x009a }
        r4 = r4 + r5;
        r3.<init>(r4);	 Catch:{ all -> 0x009a }
        r4 = "Error getting distribution channel for key ";
        r3.append(r4);	 Catch:{ all -> 0x009a }
        r3.append(r8);	 Catch:{ all -> 0x009a }
        r8 = ": ";
        r3.append(r8);	 Catch:{ all -> 0x009a }
        r3.append(r1);	 Catch:{ all -> 0x009a }
        r8 = r3.toString();	 Catch:{ all -> 0x009a }
        android.util.Log.d(r2, r8);	 Catch:{ all -> 0x009a }
    L_0x0096:
        if (r7 == 0) goto L_0x0099;
    L_0x0098:
        goto L_0x004f;
    L_0x0099:
        return r0;
    L_0x009a:
        r8 = move-exception;
    L_0x009b:
        if (r7 == 0) goto L_0x00a0;
    L_0x009d:
        r7.close();
    L_0x00a0:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.af.a(android.content.Context, java.lang.String):java.lang.String");
    }
}
