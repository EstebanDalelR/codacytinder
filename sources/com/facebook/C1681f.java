package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C1738r;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import java.util.Date;
import org.json.JSONException;

/* renamed from: com.facebook.f */
final class C1681f {
    /* renamed from: a */
    private static final String f4610a = "f";
    /* renamed from: b */
    private String f4611b;
    /* renamed from: c */
    private SharedPreferences f4612c;

    public C1681f(Context context) {
        this(context, null);
    }

    public C1681f(Context context, String str) {
        C1749x.m6064a((Object) context, "context");
        if (Utility.m5785a(str)) {
            str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        }
        this.f4611b = str;
        str = context.getApplicationContext();
        if (str != null) {
            context = str;
        }
        this.f4612c = context.getSharedPreferences(this.f4611b, 0);
    }

    /* renamed from: a */
    public Bundle m5695a() {
        Bundle bundle = new Bundle();
        for (String str : this.f4612c.getAll().keySet()) {
            try {
                m5690a(str, bundle);
            } catch (JSONException e) {
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str2 = f4610a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error reading cached value for key: '");
                stringBuilder.append(str);
                stringBuilder.append("' -- ");
                stringBuilder.append(e);
                C1738r.m5976a(loggingBehavior, 5, str2, stringBuilder.toString());
                return null;
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public void m5696b() {
        this.f4612c.edit().clear().apply();
    }

    /* renamed from: a */
    public static boolean m5691a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("com.facebook.TokenCachingStrategy.Token");
        if (string != null) {
            if (string.length() != 0) {
                if (bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m5692b(Bundle bundle) {
        C1749x.m6064a((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.Token");
    }

    /* renamed from: c */
    public static AccessTokenSource m5693c(Bundle bundle) {
        C1749x.m6064a((Object) bundle, "bundle");
        if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
            return (AccessTokenSource) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
        }
        return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") != null ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
    }

    /* renamed from: d */
    public static String m5694d(Bundle bundle) {
        C1749x.m6064a((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }

    /* renamed from: a */
    static Date m5689a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle = bundle.getLong(str, Long.MIN_VALUE);
        if (bundle == -9223372036854775808) {
            return null;
        }
        return new Date(bundle);
    }

    /* renamed from: a */
    private void m5690a(java.lang.String r8, android.os.Bundle r9) throws org.json.JSONException {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r7 = this;
        r0 = r7.f4612c;
        r1 = "{}";
        r0 = r0.getString(r8, r1);
        r1 = new org.json.JSONObject;
        r1.<init>(r0);
        r0 = "valueType";
        r0 = r1.getString(r0);
        r2 = "bool";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0026;
    L_0x001b:
        r0 = "value";
        r0 = r1.getBoolean(r0);
        r9.putBoolean(r8, r0);
        goto L_0x0253;
    L_0x0026:
        r2 = "bool[]";
        r2 = r0.equals(r2);
        r3 = 0;
        if (r2 == 0) goto L_0x004c;
    L_0x002f:
        r0 = "value";
        r0 = r1.getJSONArray(r0);
        r1 = r0.length();
        r1 = new boolean[r1];
    L_0x003b:
        r2 = r1.length;
        if (r3 >= r2) goto L_0x0047;
    L_0x003e:
        r2 = r0.getBoolean(r3);
        r1[r3] = r2;
        r3 = r3 + 1;
        goto L_0x003b;
    L_0x0047:
        r9.putBooleanArray(r8, r1);
        goto L_0x0253;
    L_0x004c:
        r2 = "byte";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0060;
    L_0x0054:
        r0 = "value";
        r0 = r1.getInt(r0);
        r0 = (byte) r0;
        r9.putByte(r8, r0);
        goto L_0x0253;
    L_0x0060:
        r2 = "byte[]";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0086;
    L_0x0068:
        r0 = "value";
        r0 = r1.getJSONArray(r0);
        r1 = r0.length();
        r1 = new byte[r1];
    L_0x0074:
        r2 = r1.length;
        if (r3 >= r2) goto L_0x0081;
    L_0x0077:
        r2 = r0.getInt(r3);
        r2 = (byte) r2;
        r1[r3] = r2;
        r3 = r3 + 1;
        goto L_0x0074;
    L_0x0081:
        r9.putByteArray(r8, r1);
        goto L_0x0253;
    L_0x0086:
        r2 = "short";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x009a;
    L_0x008e:
        r0 = "value";
        r0 = r1.getInt(r0);
        r0 = (short) r0;
        r9.putShort(r8, r0);
        goto L_0x0253;
    L_0x009a:
        r2 = "short[]";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00c0;
    L_0x00a2:
        r0 = "value";
        r0 = r1.getJSONArray(r0);
        r1 = r0.length();
        r1 = new short[r1];
    L_0x00ae:
        r2 = r1.length;
        if (r3 >= r2) goto L_0x00bb;
    L_0x00b1:
        r2 = r0.getInt(r3);
        r2 = (short) r2;
        r1[r3] = r2;
        r3 = r3 + 1;
        goto L_0x00ae;
    L_0x00bb:
        r9.putShortArray(r8, r1);
        goto L_0x0253;
    L_0x00c0:
        r2 = "int";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00d3;
    L_0x00c8:
        r0 = "value";
        r0 = r1.getInt(r0);
        r9.putInt(r8, r0);
        goto L_0x0253;
    L_0x00d3:
        r2 = "int[]";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00f8;
    L_0x00db:
        r0 = "value";
        r0 = r1.getJSONArray(r0);
        r1 = r0.length();
        r1 = new int[r1];
    L_0x00e7:
        r2 = r1.length;
        if (r3 >= r2) goto L_0x00f3;
    L_0x00ea:
        r2 = r0.getInt(r3);
        r1[r3] = r2;
        r3 = r3 + 1;
        goto L_0x00e7;
    L_0x00f3:
        r9.putIntArray(r8, r1);
        goto L_0x0253;
    L_0x00f8:
        r2 = "long";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x010b;
    L_0x0100:
        r0 = "value";
        r0 = r1.getLong(r0);
        r9.putLong(r8, r0);
        goto L_0x0253;
    L_0x010b:
        r2 = "long[]";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0130;
    L_0x0113:
        r0 = "value";
        r0 = r1.getJSONArray(r0);
        r1 = r0.length();
        r1 = new long[r1];
    L_0x011f:
        r2 = r1.length;
        if (r3 >= r2) goto L_0x012b;
    L_0x0122:
        r4 = r0.getLong(r3);
        r1[r3] = r4;
        r3 = r3 + 1;
        goto L_0x011f;
    L_0x012b:
        r9.putLongArray(r8, r1);
        goto L_0x0253;
    L_0x0130:
        r2 = "float";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0144;
    L_0x0138:
        r0 = "value";
        r0 = r1.getDouble(r0);
        r0 = (float) r0;
        r9.putFloat(r8, r0);
        goto L_0x0253;
    L_0x0144:
        r2 = "float[]";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x016a;
    L_0x014c:
        r0 = "value";
        r0 = r1.getJSONArray(r0);
        r1 = r0.length();
        r1 = new float[r1];
    L_0x0158:
        r2 = r1.length;
        if (r3 >= r2) goto L_0x0165;
    L_0x015b:
        r4 = r0.getDouble(r3);
        r2 = (float) r4;
        r1[r3] = r2;
        r3 = r3 + 1;
        goto L_0x0158;
    L_0x0165:
        r9.putFloatArray(r8, r1);
        goto L_0x0253;
    L_0x016a:
        r2 = "double";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x017d;
    L_0x0172:
        r0 = "value";
        r0 = r1.getDouble(r0);
        r9.putDouble(r8, r0);
        goto L_0x0253;
    L_0x017d:
        r2 = "double[]";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x01a2;
    L_0x0185:
        r0 = "value";
        r0 = r1.getJSONArray(r0);
        r1 = r0.length();
        r1 = new double[r1];
    L_0x0191:
        r2 = r1.length;
        if (r3 >= r2) goto L_0x019d;
    L_0x0194:
        r4 = r0.getDouble(r3);
        r1[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0191;
    L_0x019d:
        r9.putDoubleArray(r8, r1);
        goto L_0x0253;
    L_0x01a2:
        r2 = "char";
        r2 = r0.equals(r2);
        r4 = 1;
        if (r2 == 0) goto L_0x01c2;
    L_0x01ab:
        r0 = "value";
        r0 = r1.getString(r0);
        if (r0 == 0) goto L_0x0253;
    L_0x01b3:
        r1 = r0.length();
        if (r1 != r4) goto L_0x0253;
    L_0x01b9:
        r0 = r0.charAt(r3);
        r9.putChar(r8, r0);
        goto L_0x0253;
    L_0x01c2:
        r2 = "char[]";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x01f3;
    L_0x01ca:
        r0 = "value";
        r0 = r1.getJSONArray(r0);
        r1 = r0.length();
        r1 = new char[r1];
        r2 = 0;
    L_0x01d7:
        r5 = r1.length;
        if (r2 >= r5) goto L_0x01ef;
    L_0x01da:
        r5 = r0.getString(r2);
        if (r5 == 0) goto L_0x01ec;
    L_0x01e0:
        r6 = r5.length();
        if (r6 != r4) goto L_0x01ec;
    L_0x01e6:
        r5 = r5.charAt(r3);
        r1[r2] = r5;
    L_0x01ec:
        r2 = r2 + 1;
        goto L_0x01d7;
    L_0x01ef:
        r9.putCharArray(r8, r1);
        goto L_0x0253;
    L_0x01f3:
        r2 = "string";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0205;
    L_0x01fb:
        r0 = "value";
        r0 = r1.getString(r0);
        r9.putString(r8, r0);
        goto L_0x0253;
    L_0x0205:
        r2 = "stringList";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0234;
    L_0x020d:
        r0 = "value";
        r0 = r1.getJSONArray(r0);
        r1 = r0.length();
        r2 = new java.util.ArrayList;
        r2.<init>(r1);
    L_0x021c:
        if (r3 >= r1) goto L_0x0230;
    L_0x021e:
        r4 = r0.get(r3);
        r5 = org.json.JSONObject.NULL;
        if (r4 != r5) goto L_0x0228;
    L_0x0226:
        r4 = 0;
        goto L_0x022a;
    L_0x0228:
        r4 = (java.lang.String) r4;
    L_0x022a:
        r2.add(r3, r4);
        r3 = r3 + 1;
        goto L_0x021c;
    L_0x0230:
        r9.putStringArrayList(r8, r2);
        goto L_0x0253;
    L_0x0234:
        r2 = "enum";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0253;
    L_0x023c:
        r0 = "enumType";	 Catch:{ ClassNotFoundException -> 0x0253, ClassNotFoundException -> 0x0253 }
        r0 = r1.getString(r0);	 Catch:{ ClassNotFoundException -> 0x0253, ClassNotFoundException -> 0x0253 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0253, ClassNotFoundException -> 0x0253 }
        r2 = "value";	 Catch:{ ClassNotFoundException -> 0x0253, ClassNotFoundException -> 0x0253 }
        r1 = r1.getString(r2);	 Catch:{ ClassNotFoundException -> 0x0253, ClassNotFoundException -> 0x0253 }
        r0 = java.lang.Enum.valueOf(r0, r1);	 Catch:{ ClassNotFoundException -> 0x0253, ClassNotFoundException -> 0x0253 }
        r9.putSerializable(r8, r0);	 Catch:{ ClassNotFoundException -> 0x0253, ClassNotFoundException -> 0x0253 }
    L_0x0253:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.f.a(java.lang.String, android.os.Bundle):void");
    }
}
