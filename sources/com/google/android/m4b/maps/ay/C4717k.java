package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.m4b.maps.ay.k */
public final class C4717k {
    /* renamed from: a */
    private static String[] f17334a;
    /* renamed from: b */
    private static String f17335b;

    static {
        String[] strArr = new String[]{"com.google.android.geo.API_KEY", "com.google.android.maps.v2.API_KEY"};
        f17334a = strArr;
        f17335b = strArr[0];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static java.lang.String m20983a(android.content.pm.PackageManager r6, java.lang.String r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 64;
        r1 = 0;
        r6 = r6.getPackageInfo(r7, r0);	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        if (r6 == 0) goto L_0x0060;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x0009:
        r7 = r6.signatures;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        if (r7 == 0) goto L_0x0060;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x000d:
        r7 = r6.signatures;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r7 = r7.length;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        if (r7 == 0) goto L_0x0060;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x0012:
        r7 = r6.signatures;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r0 = 0;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r7 = r7[r0];	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        if (r7 != 0) goto L_0x001a;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x0019:
        goto L_0x0060;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x001a:
        r6 = r6.signatures;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r6 = r6[r0];	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r6 = r6.toByteArray();	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r7 = "SHA-1";	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r7 = java.security.MessageDigest.getInstance(r7);	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        if (r7 != 0) goto L_0x002b;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x002a:
        return r1;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x002b:
        r6 = r7.digest(r6);	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        if (r6 != 0) goto L_0x0032;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x0031:
        return r1;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x0032:
        r7 = 16;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r7 = new char[r7];	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r7 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r2 = new java.lang.StringBuffer;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r3 = r6.length;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r3 = r3 * 2;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r2.<init>(r3);	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r3 = r6.length;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x0042:
        if (r0 >= r3) goto L_0x005b;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x0044:
        r4 = r6[r0];	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r5 = r4 >> 4;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r5 = r5 & 15;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r5 = r7[r5];	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r2.append(r5);	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r4 = r4 >> 0;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r4 = r4 & 15;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r4 = r7[r4];	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r2.append(r4);	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        r0 = r0 + 1;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        goto L_0x0042;	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
    L_0x005b:
        r6 = r2.toString();	 Catch:{ NameNotFoundException -> 0x0062, NoSuchAlgorithmException -> 0x0061 }
        return r6;
    L_0x0060:
        return r1;
    L_0x0061:
        return r1;
    L_0x0062:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.k.a(android.content.pm.PackageManager, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m20982a(Context context, String str) {
        context = C4717k.m20984b(context, str);
        String str2 = null;
        if (context.metaData != null) {
            str = f17334a;
            String str3 = null;
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                String str4 = str[i2];
                if (context.metaData.containsKey(str4)) {
                    str3 = context.metaData.getString(str4);
                    i++;
                }
            }
            if (i > 1) {
                str = String.valueOf("The API key can only be specified once. It is recommended that you use the meta-data tag with the name: ");
                str2 = f17335b;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 52) + String.valueOf(str2).length());
                stringBuilder.append(str);
                stringBuilder.append(str2);
                stringBuilder.append(" in the <application> element of AndroidManifest.xml");
                throw new RuntimeException(stringBuilder.toString());
            }
            str2 = str3;
        }
        if (str2 != null) {
            return str2;
        }
        str = f17335b;
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 143);
        stringBuilder2.append("API key not found.  Check that <meta-data android:name=\"");
        stringBuilder2.append(str);
        stringBuilder2.append("\" android:value=\"your API key\"/> is in the <application> element of AndroidManifest.xml");
        throw new RuntimeException(stringBuilder2.toString());
    }

    /* renamed from: b */
    private static ApplicationInfo m20984b(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        } catch (Context context2) {
            throw new AssertionError(context2);
        }
    }
}
