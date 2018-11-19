package com.leanplum.p069a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import android.util.TypedValue;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.LeanplumDeviceIdMode;
import com.leanplum.utils.SharedPreferencesUtil;
import io.fabric.sdk.android.services.events.C15645a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.leanplum.a.bo */
public final class bo {
    /* renamed from: a */
    private static final Executor f8005a = Executors.newCachedThreadPool();
    /* renamed from: b */
    private static final Executor f8006b = Executors.newSingleThreadExecutor();
    /* renamed from: c */
    private static final String f8007c = "android.permission.ACCESS_WIFI_STATE";
    /* renamed from: d */
    private static String f8008d = null;
    /* renamed from: e */
    private static String f8009e = null;
    /* renamed from: f */
    private static boolean f8010f = false;
    /* renamed from: g */
    private static boolean f8011g = false;

    /* renamed from: c */
    public static String m9622c() {
        return "Android OS";
    }

    /* renamed from: e */
    private static String m9627e(String str) throws Exception {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(str.getBytes(Charset.forName("UTF-8")));
        str = instance.digest();
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(String.format("%02x", new Object[]{Byte.valueOf(str[i])}));
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m9599a(String str) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        instance.update(str.getBytes(Charset.forName("UTF-8")));
        str = instance.digest();
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(String.format("%02x", new Object[]{Byte.valueOf(str[i])}));
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m9600a(String str, String str2) {
        if (str2 == null || bo.m9623c(str2)) {
            return str2;
        }
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder = new StringBuilder("Invalid device id generated (");
        stringBuilder.append(str);
        stringBuilder.append("): ");
        stringBuilder.append(str2);
        objArr[0] = stringBuilder.toString();
        ao.m9516a(objArr);
        return null;
    }

    @android.support.annotation.RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    /* renamed from: b */
    private static java.lang.String m9615b(android.content.Context r6) {
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
        r0 = "Skipping wifi device id; ";
        r1 = "android.permission.ACCESS_WIFI_STATE";
        r1 = r6.checkCallingOrSelfPermission(r1);
        r2 = 0;
        r3 = 0;
        r4 = 1;
        if (r1 == 0) goto L_0x0026;
    L_0x000d:
        r6 = new java.lang.Object[r4];
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = "no wifi state permissions.";
        r1.append(r0);
        r0 = r1.toString();
        r6[r3] = r0;
        com.leanplum.p069a.ao.m9519d(r6);
        return r2;
    L_0x0026:
        r6 = r6.getApplicationContext();	 Catch:{ Exception -> 0x00bc }
        r1 = "wifi";	 Catch:{ Exception -> 0x00bc }
        r6 = r6.getSystemService(r1);	 Catch:{ Exception -> 0x00bc }
        r6 = (android.net.wifi.WifiManager) r6;	 Catch:{ Exception -> 0x00bc }
        r6 = r6.getConnectionInfo();	 Catch:{ Exception -> 0x00bc }
        if (r6 != 0) goto L_0x0051;	 Catch:{ Exception -> 0x00bc }
    L_0x0038:
        r6 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x00bc }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00bc }
        r1.<init>();	 Catch:{ Exception -> 0x00bc }
        r1.append(r0);	 Catch:{ Exception -> 0x00bc }
        r0 = "null WifiInfo.";	 Catch:{ Exception -> 0x00bc }
        r1.append(r0);	 Catch:{ Exception -> 0x00bc }
        r0 = r1.toString();	 Catch:{ Exception -> 0x00bc }
        r6[r3] = r0;	 Catch:{ Exception -> 0x00bc }
        com.leanplum.p069a.ao.m9518c(r6);	 Catch:{ Exception -> 0x00bc }
        return r2;	 Catch:{ Exception -> 0x00bc }
    L_0x0051:
        r1 = r6.getMacAddress();	 Catch:{ Exception -> 0x00bc }
        if (r1 == 0) goto L_0x00a3;	 Catch:{ Exception -> 0x00bc }
    L_0x0057:
        r5 = r1.isEmpty();	 Catch:{ Exception -> 0x00bc }
        if (r5 == 0) goto L_0x005e;	 Catch:{ Exception -> 0x00bc }
    L_0x005d:
        goto L_0x00a3;	 Catch:{ Exception -> 0x00bc }
    L_0x005e:
        r5 = "02:00:00:00:00:00";	 Catch:{ Exception -> 0x00bc }
        r1 = r5.equals(r1);	 Catch:{ Exception -> 0x00bc }
        if (r1 == 0) goto L_0x007f;	 Catch:{ Exception -> 0x00bc }
    L_0x0066:
        r6 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x00bc }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00bc }
        r1.<init>();	 Catch:{ Exception -> 0x00bc }
        r1.append(r0);	 Catch:{ Exception -> 0x00bc }
        r0 = "Marshmallow and later returns a fake MAC address.";	 Catch:{ Exception -> 0x00bc }
        r1.append(r0);	 Catch:{ Exception -> 0x00bc }
        r0 = r1.toString();	 Catch:{ Exception -> 0x00bc }
        r6[r3] = r0;	 Catch:{ Exception -> 0x00bc }
        com.leanplum.p069a.ao.m9519d(r6);	 Catch:{ Exception -> 0x00bc }
        return r2;	 Catch:{ Exception -> 0x00bc }
    L_0x007f:
        r6 = r6.getMacAddress();	 Catch:{ Exception -> 0x00bc }
        r6 = com.leanplum.p069a.bo.m9627e(r6);	 Catch:{ Exception -> 0x00bc }
        r0 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x00bc }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00bc }
        r5 = "Using wifi device id: ";	 Catch:{ Exception -> 0x00bc }
        r1.<init>(r5);	 Catch:{ Exception -> 0x00bc }
        r1.append(r6);	 Catch:{ Exception -> 0x00bc }
        r1 = r1.toString();	 Catch:{ Exception -> 0x00bc }
        r0[r3] = r1;	 Catch:{ Exception -> 0x00bc }
        com.leanplum.p069a.ao.m9519d(r0);	 Catch:{ Exception -> 0x00bc }
        r0 = "mac address";	 Catch:{ Exception -> 0x00bc }
        r6 = com.leanplum.p069a.bo.m9600a(r0, r6);	 Catch:{ Exception -> 0x00bc }
        return r6;	 Catch:{ Exception -> 0x00bc }
    L_0x00a3:
        r6 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x00bc }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00bc }
        r1.<init>();	 Catch:{ Exception -> 0x00bc }
        r1.append(r0);	 Catch:{ Exception -> 0x00bc }
        r0 = "no mac address returned.";	 Catch:{ Exception -> 0x00bc }
        r1.append(r0);	 Catch:{ Exception -> 0x00bc }
        r0 = r1.toString();	 Catch:{ Exception -> 0x00bc }
        r6[r3] = r0;	 Catch:{ Exception -> 0x00bc }
        com.leanplum.p069a.ao.m9518c(r6);	 Catch:{ Exception -> 0x00bc }
        return r2;
    L_0x00bc:
        r6 = new java.lang.Object[r4];
        r0 = "Error getting wifi MAC address.";
        r6[r3] = r0;
        com.leanplum.p069a.ao.m9517b(r6);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bo.b(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    private static ab m9621c(Context context) throws Exception {
        try {
            context = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (context != null) {
                String a = bo.m9600a("advertising id", context.getId());
                if (a != null) {
                    return new ab(a, context.isLimitAdTrackingEnabled());
                }
            }
        } catch (Context context2) {
            ao.m9516a("Error getting advertising ID. Google Play Services are not available: ", context2);
        }
        return null;
    }

    /* renamed from: d */
    private static String m9626d(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            if (!string.isEmpty()) {
                if ("9774d56d682e549c".equals(string)) {
                    Object[] objArr = new Object[1];
                    StringBuilder stringBuilder = new StringBuilder("Skipping Android device id; got invalid device id: ");
                    stringBuilder.append(string);
                    objArr[0] = stringBuilder.toString();
                    ao.m9519d(objArr);
                    return null;
                }
                Object[] objArr2 = new Object[1];
                StringBuilder stringBuilder2 = new StringBuilder("Using Android device id: ");
                stringBuilder2.append(string);
                objArr2[0] = stringBuilder2.toString();
                ao.m9519d(objArr2);
                return bo.m9600a("android id", string);
            }
        }
        ao.m9518c(new Object[]{"Skipping Android device id; no id returned."});
        return null;
    }

    /* renamed from: k */
    private static String m9635k() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(UUID.randomUUID().toString());
        stringBuilder.append("-LP");
        String stringBuilder2 = stringBuilder.toString();
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder3 = new StringBuilder("Using generated device id: ");
        stringBuilder3.append(stringBuilder2);
        objArr[0] = stringBuilder3.toString();
        ao.m9519d(objArr);
        return stringBuilder2;
    }

    /* renamed from: b */
    private static boolean m9620b(java.lang.String r5, java.lang.String r6) {
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
        r0 = 0;
        r1 = 1;
        r2 = java.nio.charset.Charset.forName(r6);	 Catch:{ UnsupportedCharsetException -> 0x000b }
        r2 = r2.newEncoder();	 Catch:{ UnsupportedCharsetException -> 0x000b }
        goto L_0x0021;
    L_0x000b:
        r2 = new java.lang.Object[r1];
        r3 = new java.lang.StringBuilder;
        r4 = "Unsupported charset: ";
        r3.<init>(r4);
        r3.append(r6);
        r6 = r3.toString();
        r2[r0] = r6;
        com.leanplum.p069a.ao.m9517b(r2);
        r2 = 0;
    L_0x0021:
        if (r2 == 0) goto L_0x003f;
    L_0x0023:
        r6 = r2.canEncode(r5);
        if (r6 != 0) goto L_0x003f;
    L_0x0029:
        r6 = new java.lang.Object[r1];
        r1 = new java.lang.StringBuilder;
        r2 = "Invalid id (contains invalid characters): ";
        r1.<init>(r2);
        r1.append(r5);
        r5 = r1.toString();
        r6[r0] = r5;
        com.leanplum.p069a.ao.m9519d(r6);
        return r0;
    L_0x003f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bo.b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static boolean m9619b(String str) {
        Object[] objArr;
        StringBuilder stringBuilder;
        String str2 = "Invalid user id ";
        if (str != null) {
            if (!str.isEmpty()) {
                if (str.length() > 400) {
                    objArr = new Object[1];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("(too long): ");
                    stringBuilder.append(str);
                    objArr[0] = stringBuilder.toString();
                    ao.m9519d(objArr);
                    return false;
                } else if (str.contains("\n")) {
                    objArr = new Object[1];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("(contains newline): ");
                    stringBuilder.append(str);
                    objArr[0] = stringBuilder.toString();
                    ao.m9519d(objArr);
                    return false;
                } else {
                    if (!str.contains("\"")) {
                        if (!str.contains("'")) {
                            return bo.m9620b(str, "UTF-8");
                        }
                    }
                    objArr = new Object[1];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("(contains quotes): ");
                    stringBuilder.append(str);
                    objArr[0] = stringBuilder.toString();
                    ao.m9519d(objArr);
                    return false;
                }
            }
        }
        objArr = new Object[1];
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append("(sentinel): ");
        stringBuilder.append(str);
        objArr[0] = stringBuilder.toString();
        ao.m9519d(objArr);
        return false;
    }

    /* renamed from: c */
    public static boolean m9623c(String str) {
        Object[] objArr;
        StringBuilder stringBuilder;
        String str2 = "Invalid device id ";
        if (!(str == null || str.isEmpty() || "9774d56d682e549c".equals(str) || "0f607264fc6318a92b9e13c65db7cd3c".equals(str))) {
            if (!"f607264fc6318a92b9e13c65db7cd3c".equals(str)) {
                if (str.length() > 400) {
                    objArr = new Object[1];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("(too long): ");
                    stringBuilder.append(str);
                    objArr[0] = stringBuilder.toString();
                    ao.m9519d(objArr);
                    return false;
                } else if (str.contains("[")) {
                    objArr = new Object[1];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("(contains brackets): ");
                    stringBuilder.append(str);
                    objArr[0] = stringBuilder.toString();
                    ao.m9519d(objArr);
                    return false;
                } else if (str.contains("\n")) {
                    objArr = new Object[1];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("(contains newline): ");
                    stringBuilder.append(str);
                    objArr[0] = stringBuilder.toString();
                    ao.m9519d(objArr);
                    return false;
                } else if (str.contains(",")) {
                    objArr = new Object[1];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("(contains comma): ");
                    stringBuilder.append(str);
                    objArr[0] = stringBuilder.toString();
                    ao.m9519d(objArr);
                    return false;
                } else {
                    if (!str.contains("\"")) {
                        if (!str.contains("'")) {
                            return bo.m9620b(str, "US-ASCII");
                        }
                    }
                    objArr = new Object[1];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("(contains quotes): ");
                    stringBuilder.append(str);
                    objArr[0] = stringBuilder.toString();
                    ao.m9519d(objArr);
                    return false;
                }
            }
        }
        objArr = new Object[1];
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append("(sentinel): ");
        stringBuilder.append(str);
        objArr[0] = stringBuilder.toString();
        ao.m9519d(objArr);
        return false;
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    /* renamed from: a */
    public static ab m9594a(LeanplumDeviceIdMode leanplumDeviceIdMode) {
        Context context = Leanplum.getContext();
        if (leanplumDeviceIdMode.equals(LeanplumDeviceIdMode.ADVERTISING_ID)) {
            try {
                ab c = bo.m9621c(context);
                if (c != null) {
                    return c;
                }
            } catch (Exception e) {
                ao.m9516a("Error getting advertising ID", e);
            }
        }
        if ((bo.m9628e() || leanplumDeviceIdMode.equals(LeanplumDeviceIdMode.ANDROID_ID) != null) && bo.m9626d(context) != null) {
            return new ab(bo.m9626d(context));
        }
        leanplumDeviceIdMode = bo.m9615b(context);
        if (leanplumDeviceIdMode != null) {
            return new ab(leanplumDeviceIdMode);
        }
        leanplumDeviceIdMode = bo.m9626d(context);
        if (leanplumDeviceIdMode != null) {
            return new ab(leanplumDeviceIdMode);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(UUID.randomUUID().toString());
        stringBuilder.append("-LP");
        String stringBuilder2 = stringBuilder.toString();
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder3 = new StringBuilder("Using generated device id: ");
        stringBuilder3.append(stringBuilder2);
        objArr[0] = stringBuilder3.toString();
        ao.m9519d(objArr);
        return new ab(stringBuilder2);
    }

    /* renamed from: a */
    public static java.lang.String m9596a() {
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
        r0 = f8009e;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = f8009e;
        return r0;
    L_0x0007:
        r0 = com.leanplum.Leanplum.getContext();
        r1 = 0;
        r2 = f8009e;	 Catch:{ Exception -> 0x0025 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x0025 }
        if (r2 == 0) goto L_0x002f;	 Catch:{ Exception -> 0x0025 }
    L_0x0014:
        r2 = r0.getPackageManager();	 Catch:{ Exception -> 0x0025 }
        r0 = r0.getPackageName();	 Catch:{ Exception -> 0x0025 }
        r0 = r2.getPackageInfo(r0, r1);	 Catch:{ Exception -> 0x0025 }
        r0 = r0.versionName;	 Catch:{ Exception -> 0x0025 }
        f8009e = r0;	 Catch:{ Exception -> 0x0025 }
        goto L_0x002f;
    L_0x0025:
        r0 = 1;
        r0 = new java.lang.Object[r0];
        r2 = "Could not extract versionName from Manifest or PackageInfo.";
        r0[r1] = r2;
        com.leanplum.p069a.ao.m9517b(r0);
    L_0x002f:
        r0 = f8009e;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bo.a():java.lang.String");
    }

    /* renamed from: b */
    public static String m9614b() {
        if (bo.m9628e()) {
            return "Android Emulator";
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return bo.m9630f(str2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bo.m9630f(str));
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m9598a(Context context) {
        if (f8008d != null) {
            return f8008d;
        }
        int i = context.getApplicationInfo().labelRes;
        if (i == 0) {
            f8008d = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        } else {
            f8008d = context.getString(i);
        }
        return f8008d;
    }

    /* renamed from: f */
    private static String m9630f(String str) {
        if (str != null) {
            if (str.length() != 0) {
                char charAt = str.charAt(0);
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Character.toUpperCase(charAt));
                stringBuilder.append(str.substring(1));
                return stringBuilder.toString();
            }
        }
        return "";
    }

    /* renamed from: d */
    public static String m9625d() {
        return VERSION.RELEASE;
    }

    /* renamed from: e */
    public static boolean m9628e() {
        String toLowerCase = Build.MODEL.toLowerCase(Locale.getDefault());
        if (!(toLowerCase.contains("google_sdk") || toLowerCase.contains("emulator"))) {
            if (!toLowerCase.contains("sdk")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static String m9629f() {
        if (bo.m9628e()) {
            return "Android Emulator";
        }
        return bo.m9614b();
    }

    /* renamed from: g */
    public static String m9631g() {
        String language = Locale.getDefault().getLanguage();
        if ("".equals(language)) {
            language = "xx";
        }
        String country = Locale.getDefault().getCountry();
        if ("".equals(country)) {
            country = "XX";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(language);
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(country);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static String m9617b(Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        Builder builder = new Builder();
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            if (entry.getValue() == null) {
                Object[] objArr = new Object[1];
                StringBuilder stringBuilder = new StringBuilder("Request parameter for key: ");
                stringBuilder.append((String) entry.getKey());
                stringBuilder.append(" is null.");
                objArr[0] = stringBuilder.toString();
                ao.m9517b(objArr);
            } else {
                builder.appendQueryParameter((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return builder.build().getEncodedQuery();
    }

    /* renamed from: a */
    public static HttpURLConnection m9603a(String str, String str2, Map<String, Object> map, String str3, boolean z, int i) throws IOException {
        if ("GET".equals(str3)) {
            if (map != null) {
                str2 = Uri.parse(str2).buildUpon();
                for (Entry entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        str2.appendQueryParameter((String) entry.getKey(), entry.getValue().toString());
                    }
                }
                str2 = str2.build().toString();
            }
        }
        str = bo.m9602a(str, str2, str3, z, i);
        if ("GET".equals(str3) == null) {
            str3 = str.getOutputStream();
            z = new BufferedWriter(new OutputStreamWriter(str3, "UTF-8"));
            z.write(bo.m9617b((Map) map));
            z.close();
            str3.close();
        }
        if (!(C2590h.f8070o == null || C2590h.f8067l == null)) {
            str3 = new Object[1];
            i = new StringBuilder("Sending request at path ");
            i.append(str2);
            i.append(" with parameters ");
            i.append(map);
            str3[false] = i.toString();
            ao.m9521f(str3);
        }
        return str;
    }

    /* renamed from: a */
    private static String m9601a(String str, Map<String, Object> map) {
        if (map == null) {
            return str;
        }
        str = Uri.parse(str).buildUpon();
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            if (entry.getValue() != null) {
                str.appendQueryParameter((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return str.build().toString();
    }

    /* renamed from: a */
    private static void m9612a(Map<String, Object> map, HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection = httpURLConnection.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection, "UTF-8"));
        bufferedWriter.write(bo.m9617b((Map) map));
        bufferedWriter.close();
        httpURLConnection.close();
    }

    /* renamed from: a */
    private static HttpURLConnection m9602a(String str, String str2, String str3, boolean z, int i) throws IOException {
        if (!str2.startsWith("http")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(z ? "https://" : "http://");
            stringBuilder.append(str);
            stringBuilder.append("/");
            stringBuilder.append(str2);
            str2 = stringBuilder.toString();
        }
        return bo.m9604a(str2, str3, z, i);
    }

    /* renamed from: a */
    static HttpURLConnection m9604a(String str, String str2, boolean z, int i) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        if (z) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        }
        i *= AdError.NETWORK_ERROR_CODE;
        httpURLConnection.setReadTimeout(i);
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setDoOutput("GET".equals(str2) ^ 1);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(null);
        httpURLConnection.setInstanceFollowRedirects(true);
        Context context = Leanplum.getContext();
        i = new StringBuilder();
        i.append(bo.m9598a(context));
        i.append("/");
        i.append(bo.m9596a());
        i.append("/");
        i.append(aw.m9560e());
        i.append("/");
        i.append(C2590h.f8064i);
        i.append("/");
        i.append(C2590h.f8063h);
        i.append("/Android OS");
        i.append("/");
        i.append(VERSION.RELEASE);
        i.append("/p");
        httpURLConnection.setRequestProperty("User-Agent", i.toString());
        return httpURLConnection;
    }

    /* renamed from: a */
    public static java.net.HttpURLConnection m9605a(java.lang.String r5, java.util.List<java.io.File> r6, java.util.List<java.io.InputStream> r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10, java.lang.String r11, boolean r12, int r13) throws java.io.IOException {
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
        r13 = 60;
        r8 = com.leanplum.p069a.bo.m9602a(r8, r9, r11, r12, r13);
        r9 = "Content-Type";
        r11 = "multipart/form-data; boundary===================================leanplum";
        r8.setRequestProperty(r9, r11);
        r9 = "Connection";
        r11 = "Keep-Alive";
        r8.setRequestProperty(r9, r11);
        r9 = new java.io.DataOutputStream;
        r11 = r8.getOutputStream();
        r9.<init>(r11);
        r10 = r10.entrySet();
        r10 = r10.iterator();
    L_0x0025:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x005f;
    L_0x002b:
        r11 = r10.next();
        r11 = (java.util.Map.Entry) r11;
        r12 = new java.lang.StringBuilder;
        r13 = "--==================================leanplum\r\nContent-Disposition: form-data; name=\"";
        r12.<init>(r13);
        r13 = r11.getKey();
        r13 = (java.lang.String) r13;
        r12.append(r13);
        r13 = "\"\r\n";
        r12.append(r13);
        r13 = "\r\n";
        r12.append(r13);
        r11 = r11.getValue();
        r12.append(r11);
        r11 = "\r\n";
        r12.append(r11);
        r11 = r12.toString();
        r9.writeBytes(r11);
        goto L_0x0025;
    L_0x005f:
        r10 = 0;
        r11 = 0;
    L_0x0061:
        r12 = r6.size();
        if (r11 >= r12) goto L_0x0142;
    L_0x0067:
        r12 = r6.get(r11);
        r12 = (java.io.File) r12;
        r13 = java.util.Locale.getDefault();
        r0 = "Content-Disposition: form-data; name=\"%s%d\";filename=\"%s\"";
        r1 = 3;
        r1 = new java.lang.Object[r1];
        r1[r10] = r5;
        r2 = java.lang.Integer.valueOf(r11);
        r3 = 1;
        r1[r3] = r2;
        r2 = 2;
        r4 = r12.getName();
        r1[r2] = r4;
        r13 = java.lang.String.format(r13, r0, r1);
        r0 = new java.lang.StringBuilder;
        r1 = "--==================================leanplum\r\n";
        r0.<init>(r1);
        r0.append(r13);
        r13 = "\r\nContent-Type: application/octet-stream";
        r0.append(r13);
        r13 = "\r\n\r\n";
        r0.append(r13);
        r13 = r0.toString();
        r9.writeBytes(r13);
        r13 = r7.size();
        if (r11 >= r13) goto L_0x00b2;
    L_0x00ab:
        r12 = r7.get(r11);
        r12 = (java.io.InputStream) r12;
        goto L_0x00b8;
    L_0x00b2:
        r13 = new java.io.FileInputStream;
        r13.<init>(r12);
        r12 = r13;
    L_0x00b8:
        r13 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r13 = new byte[r13];
    L_0x00bc:
        r0 = r12.read(r13);	 Catch:{ NullPointerException -> 0x00ee }
        r1 = -1;	 Catch:{ NullPointerException -> 0x00ee }
        if (r0 == r1) goto L_0x00c7;	 Catch:{ NullPointerException -> 0x00ee }
    L_0x00c3:
        r9.write(r13, r10, r0);	 Catch:{ NullPointerException -> 0x00ee }
        goto L_0x00bc;
    L_0x00c7:
        if (r12 == 0) goto L_0x00e3;
    L_0x00c9:
        r12.close();	 Catch:{ IOException -> 0x00cd }
        goto L_0x00e3;
    L_0x00cd:
        r12 = move-exception;
        r13 = new java.lang.Object[r3];
        r0 = new java.lang.StringBuilder;
        r1 = "Failed to close InputStream: ";
        r0.<init>(r1);
        r0.append(r12);
        r12 = r0.toString();
        r13[r10] = r12;
        com.leanplum.p069a.ao.m9517b(r13);
    L_0x00e3:
        r12 = "\r\n";
        r9.writeBytes(r12);
        r11 = r11 + 1;
        goto L_0x0061;
    L_0x00ec:
        r5 = move-exception;
        goto L_0x0125;
    L_0x00ee:
        r5 = new java.lang.Object[r3];	 Catch:{ all -> 0x00ec }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ec }
        r8 = "Unable to read file while uploading ";	 Catch:{ all -> 0x00ec }
        r7.<init>(r8);	 Catch:{ all -> 0x00ec }
        r6 = r6.get(r11);	 Catch:{ all -> 0x00ec }
        r7.append(r6);	 Catch:{ all -> 0x00ec }
        r6 = r7.toString();	 Catch:{ all -> 0x00ec }
        r5[r10] = r6;	 Catch:{ all -> 0x00ec }
        com.leanplum.p069a.ao.m9516a(r5);	 Catch:{ all -> 0x00ec }
        if (r12 == 0) goto L_0x0123;
    L_0x0109:
        r12.close();	 Catch:{ IOException -> 0x010d }
        goto L_0x0123;
    L_0x010d:
        r5 = move-exception;
        r6 = new java.lang.Object[r3];
        r7 = new java.lang.StringBuilder;
        r8 = "Failed to close InputStream: ";
        r7.<init>(r8);
        r7.append(r5);
        r5 = r7.toString();
        r6[r10] = r5;
        com.leanplum.p069a.ao.m9517b(r6);
    L_0x0123:
        r5 = 0;
        return r5;
    L_0x0125:
        if (r12 == 0) goto L_0x0141;
    L_0x0127:
        r12.close();	 Catch:{ IOException -> 0x012b }
        goto L_0x0141;
    L_0x012b:
        r6 = move-exception;
        r7 = new java.lang.Object[r3];
        r8 = new java.lang.StringBuilder;
        r9 = "Failed to close InputStream: ";
        r8.<init>(r9);
        r8.append(r6);
        r6 = r8.toString();
        r7[r10] = r6;
        com.leanplum.p069a.ao.m9517b(r7);
    L_0x0141:
        throw r5;
    L_0x0142:
        r5 = "--==================================leanplum--\r\n";
        r9.writeBytes(r5);
        r9.flush();
        r9.close();
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bo.a(java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.util.Map, java.lang.String, boolean, int):java.net.HttpURLConnection");
    }

    /* renamed from: a */
    public static void m9609a(URLConnection uRLConnection, OutputStream outputStream) throws IOException {
        uRLConnection = uRLConnection.getInputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = uRLConnection.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.close();
                return;
            }
        }
    }

    /* renamed from: b */
    private static java.lang.String m9616b(java.net.HttpURLConnection r3) throws java.io.IOException {
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
        r0 = r3.getResponseCode();
        r1 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r0 >= r1) goto L_0x000d;
    L_0x0008:
        r3 = r3.getInputStream();
        goto L_0x0011;
    L_0x000d:
        r3 = r3.getErrorStream();
    L_0x0011:
        r0 = new java.io.BufferedReader;
        r1 = new java.io.InputStreamReader;
        r2 = "UTF-8";
        r1.<init>(r3, r2);
        r0.<init>(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
    L_0x0022:
        r2 = r0.readLine();
        if (r2 == 0) goto L_0x0031;
    L_0x0028:
        r1.append(r2);
        r2 = "\n";
        r1.append(r2);
        goto L_0x0022;
    L_0x0031:
        r3.close();	 Catch:{ Exception -> 0x0037 }
        r0.close();	 Catch:{ Exception -> 0x0037 }
    L_0x0037:
        r3 = r1.toString();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bo.b(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: a */
    public static JSONObject m9607a(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        httpURLConnection = bo.m9616b(httpURLConnection);
        if (C2590h.f8070o && C2590h.f8067l) {
            Object[] objArr = new Object[1];
            StringBuilder stringBuilder = new StringBuilder("Received response ");
            stringBuilder.append(httpURLConnection);
            objArr[0] = stringBuilder.toString();
            ao.m9521f(objArr);
        }
        return new JSONObject(new JSONTokener(httpURLConnection));
    }

    /* renamed from: h */
    public static boolean m9632h() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) Leanplum.getContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        } catch (Exception e) {
            ao.m9516a("Error getting connectivity info", e);
            return false;
        }
    }

    /* renamed from: a */
    public static <T> T m9595a(Map<?, ?> map, Object... objArr) {
        if (map == null) {
            return null;
        }
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            map = map;
            if (!map.containsKey(obj)) {
                return null;
            }
            map = map.get(obj);
        }
        return map;
    }

    /* renamed from: a */
    public static <T> void m9613a(boolean z, AsyncTask<T, ?, ?> asyncTask, T... tArr) {
        if (z) {
            asyncTask.executeOnExecutor(f8006b, tArr);
        } else {
            asyncTask.executeOnExecutor(f8005a, tArr);
        }
    }

    /* renamed from: i */
    public static boolean m9633i() {
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
        r0 = f8010f;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = f8011g;
        return r0;
    L_0x0007:
        r0 = com.leanplum.Leanplum.getContext();
        r0 = r0.getPackageManager();
        r1 = 1;
        r2 = 0;
        r3 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0050 }
        r4 = 64;	 Catch:{ NameNotFoundException -> 0x0050 }
        r3 = r0.getPackageInfo(r3, r4);	 Catch:{ NameNotFoundException -> 0x0050 }
        r4 = r3.versionCode;
        r5 = 4242000; // 0x40ba50 float:5.944308E-39 double:2.0958265E-317;
        if (r4 >= r5) goto L_0x003c;
    L_0x0020:
        r0 = new java.lang.Object[r1];
        r4 = new java.lang.StringBuilder;
        r5 = "Google Play services version is too old: ";
        r4.<init>(r5);
        r3 = r3.versionCode;
        r4.append(r3);
        r3 = r4.toString();
        r0[r2] = r3;
        com.leanplum.p069a.ao.m9518c(r0);
        f8010f = r1;
        f8011g = r2;
        return r2;
    L_0x003c:
        r3 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x004b }
        r0 = r0.getApplicationInfo(r3, r2);	 Catch:{ NameNotFoundException -> 0x004b }
        f8010f = r1;
        r1 = r0.enabled;
        f8011g = r1;
        r0 = r0.enabled;
        return r0;
    L_0x004b:
        f8010f = r1;
        f8011g = r2;
        return r2;
    L_0x0050:
        f8010f = r1;
        f8011g = r2;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bo.i():boolean");
    }

    /* renamed from: j */
    public static boolean m9634j() {
        if (LeanplumActivityHelper.getCurrentActivity() != null) {
            if (!LeanplumActivityHelper.isActivityPaused()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m9610a(Map<String, Object> map) {
        StringBuilder stringBuilder;
        Context context = Leanplum.getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("__leanplum__", 0);
        if (!sharedPreferences.getBoolean("installTimeInitialized", false)) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                stringBuilder = new StringBuilder();
                stringBuilder.append(((double) packageInfo.firstInstallTime) / 1000.0d);
                map.put("installDate", stringBuilder.toString());
            } catch (NameNotFoundException e) {
                Object[] objArr = new Object[1];
                stringBuilder = new StringBuilder("Failed to find package info: ");
                stringBuilder.append(e);
                objArr[0] = stringBuilder.toString();
                ao.m9517b(objArr);
            }
            try {
                File file = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir);
                if (file.exists()) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(((double) file.lastModified()) / 1000.0d);
                    map.put("updateDate", stringBuilder2.toString());
                }
            } catch (Map<String, Object> map2) {
                Object[] objArr2 = new Object[1];
                StringBuilder stringBuilder3 = new StringBuilder("Failed to find package info: ");
                stringBuilder3.append(map2);
                objArr2[0] = stringBuilder3.toString();
                ao.m9517b(objArr2);
            }
            map2 = sharedPreferences.edit();
            map2.putBoolean("installTimeInitialized", true);
            SharedPreferencesUtil.commitChanges(map2);
        }
    }

    /* renamed from: a */
    private static void m9611a(Map<String, Object> map, PackageManager packageManager, String str) {
        try {
            packageManager = packageManager.getPackageInfo(str, 0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((double) packageManager.firstInstallTime) / 1000.0d);
            map.put("installDate", stringBuilder.toString());
        } catch (Map<String, Object> map2) {
            packageManager = new Object[1];
            str = new StringBuilder("Failed to find package info: ");
            str.append(map2);
            packageManager[0] = str.toString();
            ao.m9517b(packageManager);
        }
    }

    /* renamed from: b */
    private static void m9618b(Map<String, Object> map, PackageManager packageManager, String str) {
        try {
            str = new File(packageManager.getApplicationInfo(str, 0).sourceDir);
            if (str.exists() != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(((double) str.lastModified()) / 1000.0d);
                map.put("updateDate", stringBuilder.toString());
            }
        } catch (Map<String, Object> map2) {
            packageManager = new Object[1];
            str = new StringBuilder("Failed to find package info: ");
            str.append(map2);
            packageManager[0] = str.toString();
            ao.m9517b(packageManager);
        }
    }

    /* renamed from: a */
    public static void m9608a(java.lang.Throwable r8) {
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
        r0 = r8 instanceof java.lang.OutOfMemoryError;
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r0 = com.leanplum.p069a.C2590h.f8067l;
        if (r0 == 0) goto L_0x000b;
    L_0x0008:
        r8 = (java.lang.OutOfMemoryError) r8;
        throw r8;
    L_0x000b:
        return;
    L_0x000c:
        r0 = r8 instanceof com.leanplum.LeanplumException;
        if (r0 == 0) goto L_0x0018;
    L_0x0010:
        r0 = com.leanplum.p069a.C2590h.f8067l;
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        r8 = (com.leanplum.LeanplumException) r8;
        throw r8;
    L_0x0017:
        return;
    L_0x0018:
        r0 = 2;
        r1 = new java.lang.Object[r0];
        r2 = "INTERNAL ERROR";
        r3 = 0;
        r1[r3] = r2;
        r2 = 1;
        r1[r2] = r8;
        com.leanplum.p069a.ao.m9516a(r1);
        r1 = com.leanplum.p069a.bo.m9596a();	 Catch:{ Throwable -> 0x002b }
        goto L_0x002d;
    L_0x002b:
        r1 = "(Unknown)";
    L_0x002d:
        r4 = new java.util.HashMap;	 Catch:{ Throwable -> 0x008b }
        r4.<init>();	 Catch:{ Throwable -> 0x008b }
        r5 = "type";	 Catch:{ Throwable -> 0x008b }
        r6 = "sdkError";	 Catch:{ Throwable -> 0x008b }
        r4.put(r5, r6);	 Catch:{ Throwable -> 0x008b }
        r5 = r8.getMessage();	 Catch:{ Throwable -> 0x008b }
        if (r5 == 0) goto L_0x005d;	 Catch:{ Throwable -> 0x008b }
    L_0x003f:
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x008b }
        r6.<init>();	 Catch:{ Throwable -> 0x008b }
        r7 = r8.toString();	 Catch:{ Throwable -> 0x008b }
        r6.append(r7);	 Catch:{ Throwable -> 0x008b }
        r7 = " (";	 Catch:{ Throwable -> 0x008b }
        r6.append(r7);	 Catch:{ Throwable -> 0x008b }
        r6.append(r5);	 Catch:{ Throwable -> 0x008b }
        r5 = 41;	 Catch:{ Throwable -> 0x008b }
        r6.append(r5);	 Catch:{ Throwable -> 0x008b }
        r5 = r6.toString();	 Catch:{ Throwable -> 0x008b }
        goto L_0x0061;	 Catch:{ Throwable -> 0x008b }
    L_0x005d:
        r5 = r8.toString();	 Catch:{ Throwable -> 0x008b }
    L_0x0061:
        r6 = "message";	 Catch:{ Throwable -> 0x008b }
        r4.put(r6, r5);	 Catch:{ Throwable -> 0x008b }
        r5 = new java.io.StringWriter;	 Catch:{ Throwable -> 0x008b }
        r5.<init>();	 Catch:{ Throwable -> 0x008b }
        r6 = new java.io.PrintWriter;	 Catch:{ Throwable -> 0x008b }
        r6.<init>(r5);	 Catch:{ Throwable -> 0x008b }
        r8.printStackTrace(r6);	 Catch:{ Throwable -> 0x008b }
        r8 = "stackTrace";	 Catch:{ Throwable -> 0x008b }
        r5 = r5.toString();	 Catch:{ Throwable -> 0x008b }
        r4.put(r8, r5);	 Catch:{ Throwable -> 0x008b }
        r8 = "versionName";	 Catch:{ Throwable -> 0x008b }
        r4.put(r8, r1);	 Catch:{ Throwable -> 0x008b }
        r8 = "log";	 Catch:{ Throwable -> 0x008b }
        r8 = com.leanplum.p069a.aw.m9544b(r8, r4);	 Catch:{ Throwable -> 0x008b }
        r8.m9579h();	 Catch:{ Throwable -> 0x008b }
        return;
    L_0x008b:
        r8 = move-exception;
        r0 = new java.lang.Object[r0];
        r1 = "Unable to send error report.";
        r0[r3] = r1;
        r0[r2] = r8;
        com.leanplum.p069a.ao.m9516a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bo.a(java.lang.Throwable):void");
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m9606a(K k, V v, Object... objArr) {
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Must supply an even number of values.");
        }
        Map<K, V> hashMap = new HashMap();
        hashMap.put(k, v);
        for (k = null; k < objArr.length; k += 2) {
            hashMap.put(objArr[k], objArr[k + 1]);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m9597a(int i) {
        if (i <= 0) {
            try {
                ao.m9517b(new Object[]{"Provided resource id is invalid."});
                return null;
            } catch (Throwable e) {
                ao.m9517b("Failed to generate resource name from provided resource id: ", e);
                bo.m9608a(e);
                return null;
            }
        }
        Resources resources = Leanplum.getContext().getResources();
        String resourceEntryName = resources.getResourceEntryName(i);
        String resourceTypeName = resources.getResourceTypeName(i);
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        i = typedValue.string.toString().split("\\.(?=[^\\.]+$)");
        String str = "";
        if (i.length == 2) {
            StringBuilder stringBuilder = new StringBuilder(".");
            stringBuilder.append(i[1]);
            str = stringBuilder.toString();
        }
        i = new StringBuilder();
        i.append(resourceTypeName);
        i.append("/");
        i.append(resourceEntryName);
        i.append(str);
        return i.toString();
    }

    /* renamed from: d */
    public static int m9624d(String str) {
        String[] split = str.split("/");
        if (split.length == 2) {
            Resources resources = Leanplum.getContext().getResources();
            Object obj = split[0];
            Object obj2 = split[1];
            String[] split2 = obj2.split("\\.(?=[^\\.]+$)");
            if (split2.length == 2) {
                obj2 = split2[0];
            }
            if (!(TextUtils.isEmpty(obj) || TextUtils.isEmpty(obj2))) {
                return resources.getIdentifier(obj2, obj, Leanplum.getContext().getPackageName());
            }
        }
        ao.m9517b("Could not extract resource id from provided resource name: ", str);
        return 0;
    }
}
