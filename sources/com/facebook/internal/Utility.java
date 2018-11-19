package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.Log;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.tinder.api.ManagerWebServices;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class Utility {
    /* renamed from: a */
    private static int f4644a = 0;
    /* renamed from: b */
    private static long f4645b = -1;
    /* renamed from: c */
    private static long f4646c = -1;
    /* renamed from: d */
    private static long f4647d = -1;
    /* renamed from: e */
    private static String f4648e = "";
    /* renamed from: f */
    private static String f4649f = "";
    /* renamed from: g */
    private static String f4650g = "NoCarrier";

    /* renamed from: com.facebook.internal.Utility$2 */
    static class C16872 implements FilenameFilter {
        C16872() {
        }

        public boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    public interface GraphMeRequestWithCacheCallback {
        void onFailure(FacebookException facebookException);

        void onSuccess(JSONObject jSONObject);
    }

    public interface Mapper<T, K> {
        K apply(T t);
    }

    public interface Predicate<T> {
        boolean apply(T t);
    }

    /* renamed from: com.facebook.internal.Utility$a */
    public static class C1688a {
        /* renamed from: a */
        List<String> f4642a;
        /* renamed from: b */
        List<String> f4643b;

        public C1688a(List<String> list, List<String> list2) {
            this.f4642a = list;
            this.f4643b = list2;
        }

        /* renamed from: a */
        public List<String> m5745a() {
            return this.f4642a;
        }

        /* renamed from: b */
        public List<String> m5746b() {
            return this.f4643b;
        }
    }

    /* renamed from: a */
    public static <T> boolean m5786a(Collection<T> collection) {
        if (collection != null) {
            if (collection.size() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m5785a(String str) {
        if (str != null) {
            if (str.length() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m5758a(String str, String str2) {
        return m5785a(str) ? str2 : str;
    }

    /* renamed from: a */
    public static <T> Collection<T> m5765a(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    /* renamed from: b */
    public static String m5787b(String str) {
        return m5797c("MD5", str);
    }

    /* renamed from: a */
    public static String m5762a(byte[] bArr) {
        return m5759a("SHA-1", bArr);
    }

    /* renamed from: c */
    private static String m5797c(String str, String str2) {
        return m5759a(str, str2.getBytes());
    }

    /* renamed from: a */
    private static java.lang.String m5759a(java.lang.String r0, byte[] r1) {
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
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0009 }
        r0 = m5760a(r0, r1);
        return r0;
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.a(java.lang.String, byte[]):java.lang.String");
    }

    /* renamed from: a */
    private static String m5760a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        messageDigest = messageDigest.digest();
        bArr = new StringBuilder();
        for (byte b : messageDigest) {
            bArr.append(Integer.toHexString((b >> 4) & 15));
            bArr.append(Integer.toHexString((b >> 0) & 15));
        }
        return bArr.toString();
    }

    /* renamed from: a */
    public static Uri m5750a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str22 : bundle.keySet()) {
                Object obj = bundle.get(str22);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str22, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: c */
    public static Bundle m5795c(String str) {
        Bundle bundle = new Bundle();
        if (!m5785a(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), "");
                    }
                } catch (Exception e) {
                    m5777a("FacebookSDK", e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public static void m5772a(Bundle bundle, String str, String str2) {
        if (!m5785a(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static void m5771a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m5772a(bundle, str, uri.toString());
        }
    }

    /* renamed from: a */
    public static boolean m5782a(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
        } else if (!(obj instanceof JSONObject)) {
            return null;
        } else {
            bundle.putString(str, obj.toString());
        }
        return true;
    }

    /* renamed from: a */
    public static void m5774a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.a(java.io.Closeable):void");
    }

    /* renamed from: a */
    public static void m5779a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    public static String m5755a(Context context) {
        C1749x.m6064a((Object) context, "context");
        FacebookSdk.m3980a(context);
        return FacebookSdk.m3998i();
    }

    /* renamed from: a */
    public static Object m5753a(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject = jSONObject.opt(str);
        if (!(jSONObject == null || (jSONObject instanceof String) == null)) {
            jSONObject = new JSONTokener((String) jSONObject).nextValue();
        }
        if (jSONObject == null || (jSONObject instanceof JSONObject) != null || (jSONObject instanceof JSONArray) != null) {
            return jSONObject;
        }
        if (str2 != null) {
            str = new JSONObject();
            str.putOpt(str2, jSONObject);
            return str;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    /* renamed from: a */
    public static String m5757a(InputStream inputStream) throws IOException {
        Closeable inputStreamReader;
        Throwable th;
        Closeable bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    char[] cArr = new char[ItemAnimator.FLAG_MOVED];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            stringBuilder.append(cArr, 0, read);
                        } else {
                            String stringBuilder2 = stringBuilder.toString();
                            m5774a(bufferedInputStream);
                            m5774a(inputStreamReader);
                            return stringBuilder2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m5774a(bufferedInputStream);
                    m5774a(inputStreamReader);
                    throw th;
                }
            } catch (InputStream inputStream2) {
                th = inputStream2;
                inputStreamReader = null;
                m5774a(bufferedInputStream);
                m5774a(inputStreamReader);
                throw th;
            }
        } catch (InputStream inputStream22) {
            bufferedInputStream = null;
            th = inputStream22;
            inputStreamReader = bufferedInputStream;
            m5774a(bufferedInputStream);
            m5774a(inputStreamReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static int m5748a(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i += read;
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                outputStream = th;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw outputStream;
            }
        } catch (Throwable th2) {
            outputStream = th2;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw outputStream;
        }
    }

    /* renamed from: a */
    private static void m5770a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        context = CookieManager.getInstance();
        String cookie = context.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(split2[0].trim());
                    stringBuilder.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    context.setCookie(str, stringBuilder.toString());
                }
            }
            context.removeExpiredCookie();
        }
    }

    /* renamed from: b */
    public static void m5792b(Context context) {
        m5770a(context, "facebook.com");
        m5770a(context, ".facebook.com");
        m5770a(context, "https://facebook.com");
        m5770a(context, "https://.facebook.com");
    }

    /* renamed from: a */
    public static void m5777a(String str, Exception exception) {
        if (FacebookSdk.m3984a() && str != null && exception != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append(exception.getMessage());
            Log.d(str, stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public static void m5793b(String str, String str2) {
        if (FacebookSdk.m3984a() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m5778a(String str, String str2, Throwable th) {
        if (FacebookSdk.m3984a() && !m5785a(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: a */
    public static <T> boolean m5784a(T t, T t2) {
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null ? true : null;
    }

    /* renamed from: a */
    public static String m5761a(JSONObject jSONObject, String str) {
        return jSONObject != null ? jSONObject.optString(str, "") : "";
    }

    /* renamed from: b */
    public static JSONObject m5790b(JSONObject jSONObject, String str) {
        return jSONObject != null ? jSONObject.optJSONObject(str) : null;
    }

    /* renamed from: c */
    public static JSONArray m5798c(JSONObject jSONObject, String str) {
        return jSONObject != null ? jSONObject.optJSONArray(str) : null;
    }

    /* renamed from: a */
    public static void m5775a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a : listFiles) {
                        m5775a(a);
                    }
                }
            }
            file.delete();
        }
    }

    /* renamed from: b */
    public static <T> List<T> m5788b(T... tArr) {
        List arrayList = new ArrayList();
        for (Object obj : tArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<String> m5768a(JSONArray jSONArray) throws JSONException {
        List arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Set<String> m5789b(JSONArray jSONArray) throws JSONException {
        Set<String> hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static void m5781a(JSONObject jSONObject, C1701b c1701b, String str, boolean z) throws JSONException {
        if (!(c1701b == null || c1701b.m5873a() == null)) {
            jSONObject.put("attribution", c1701b.m5873a());
        }
        if (!(c1701b == null || c1701b.m5874b() == null)) {
            jSONObject.put("advertiser_id", c1701b.m5874b());
            jSONObject.put("advertiser_tracking_enabled", c1701b.m5876d() ^ 1);
        }
        if (!(c1701b == null || c1701b.m5875c() == null)) {
            jSONObject.put("installer_package", c1701b.m5875c());
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", z ^ 1);
    }

    /* renamed from: a */
    public static void m5780a(org.json.JSONObject r7, android.content.Context r8) throws org.json.JSONException {
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
        r0 = new org.json.JSONArray;
        r0.<init>();
        r1 = "a2";
        r0.put(r1);
        m5809f(r8);
        r1 = r8.getPackageName();
        r2 = "";
        r3 = 0;
        r4 = -1;
        r5 = r8.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0023 }
        r5 = r5.getPackageInfo(r1, r3);	 Catch:{ NameNotFoundException -> 0x0023 }
        r6 = r5.versionCode;	 Catch:{ NameNotFoundException -> 0x0023 }
        r4 = r5.versionName;	 Catch:{ NameNotFoundException -> 0x0024 }
        r2 = r4;
        goto L_0x0024;
    L_0x0023:
        r6 = -1;
    L_0x0024:
        r0.put(r1);
        r0.put(r6);
        r0.put(r2);
        r1 = android.os.Build.VERSION.RELEASE;
        r0.put(r1);
        r1 = android.os.Build.MODEL;
        r0.put(r1);
        r1 = r8.getResources();	 Catch:{ Exception -> 0x0042 }
        r1 = r1.getConfiguration();	 Catch:{ Exception -> 0x0042 }
        r1 = r1.locale;	 Catch:{ Exception -> 0x0042 }
        goto L_0x0046;
    L_0x0042:
        r1 = java.util.Locale.getDefault();
    L_0x0046:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = r1.getLanguage();
        r2.append(r4);
        r4 = "_";
        r2.append(r4);
        r1 = r1.getCountry();
        r2.append(r1);
        r1 = r2.toString();
        r0.put(r1);
        r1 = f4648e;
        r0.put(r1);
        r1 = f4650g;
        r0.put(r1);
        r1 = 0;
        r4 = "window";	 Catch:{ Exception -> 0x008f }
        r8 = r8.getSystemService(r4);	 Catch:{ Exception -> 0x008f }
        r8 = (android.view.WindowManager) r8;	 Catch:{ Exception -> 0x008f }
        if (r8 == 0) goto L_0x008f;	 Catch:{ Exception -> 0x008f }
    L_0x007b:
        r8 = r8.getDefaultDisplay();	 Catch:{ Exception -> 0x008f }
        r4 = new android.util.DisplayMetrics;	 Catch:{ Exception -> 0x008f }
        r4.<init>();	 Catch:{ Exception -> 0x008f }
        r8.getMetrics(r4);	 Catch:{ Exception -> 0x008f }
        r8 = r4.widthPixels;	 Catch:{ Exception -> 0x008f }
        r5 = r4.heightPixels;	 Catch:{ Exception -> 0x0090 }
        r4 = r4.density;	 Catch:{ Exception -> 0x0091 }
        r1 = (double) r4;
        goto L_0x0091;
    L_0x008f:
        r8 = 0;
    L_0x0090:
        r5 = 0;
    L_0x0091:
        r0.put(r8);
        r0.put(r5);
        r8 = "%.2f";
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r1 = java.lang.Double.valueOf(r1);
        r4[r3] = r1;
        r8 = java.lang.String.format(r8, r4);
        r0.put(r8);
        r8 = m5747a();
        r0.put(r8);
        r1 = f4646c;
        r0.put(r1);
        r1 = f4647d;
        r0.put(r1);
        r8 = f4649f;
        r0.put(r8);
        r8 = "extinfo";
        r0 = r0.toString();
        r7.put(r8, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.a(org.json.JSONObject, android.content.Context):void");
    }

    /* renamed from: a */
    public static java.lang.reflect.Method m5763a(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) {
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
        r0 = r0.getMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    public static java.lang.reflect.Method m5764a(java.lang.String r0, java.lang.String r1, java.lang.Class<?>... r2) {
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
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0009 }
        r0 = m5763a(r0, r1, r2);	 Catch:{ ClassNotFoundException -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.a(java.lang.String, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    public static java.lang.Object m5752a(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.Object... r3) {
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
        r1 = r2.invoke(r1, r3);	 Catch:{ IllegalAccessException -> 0x0007, InvocationTargetException -> 0x0006 }
        return r1;
    L_0x0006:
        return r0;
    L_0x0007:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: c */
    public static String m5796c(Context context) {
        if (context == null) {
            return ManagerWebServices.NULL_STRING_VALUE;
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    /* renamed from: a */
    public static <T, K> List<K> m5767a(List<T> list, Mapper<T, K> mapper) {
        List<K> list2 = null;
        if (list == null) {
            return null;
        }
        List<K> arrayList = new ArrayList();
        for (T apply : list) {
            Object apply2 = mapper.apply(apply);
            if (apply2 != null) {
                arrayList.add(apply2);
            }
        }
        if (arrayList.size() != null) {
            list2 = arrayList;
        }
        return list2;
    }

    /* renamed from: a */
    public static String m5756a(Uri uri) {
        return uri == null ? null : uri.toString();
    }

    /* renamed from: b */
    public static boolean m5794b(Uri uri) {
        return (uri == null || !("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()) != null)) ? null : true;
    }

    /* renamed from: c */
    public static boolean m5800c(Uri uri) {
        return (uri == null || "content".equalsIgnoreCase(uri.getScheme()) == null) ? null : true;
    }

    /* renamed from: d */
    public static boolean m5804d(Uri uri) {
        return (uri == null || ManagerWebServices.PARAM_FILE.equalsIgnoreCase(uri.getScheme()) == null) ? null : true;
    }

    /* renamed from: e */
    public static long m5805e(Uri uri) {
        Throwable th;
        try {
            uri = FacebookSdk.m3994e().getContentResolver().query(uri, null, null, null, null);
            try {
                int columnIndex = uri.getColumnIndex("_size");
                uri.moveToFirst();
                long j = uri.getLong(columnIndex);
                if (uri != null) {
                    uri.close();
                }
                return j;
            } catch (Throwable th2) {
                th = th2;
                if (uri != null) {
                    uri.close();
                }
                throw th;
            }
        } catch (Uri uri2) {
            th = uri2;
            uri2 = null;
            if (uri2 != null) {
                uri2.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static java.util.Date m5766a(android.os.Bundle r5, java.lang.String r6, java.util.Date r7) {
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
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r5 = r5.get(r6);
        r6 = r5 instanceof java.lang.Long;
        if (r6 == 0) goto L_0x0013;
    L_0x000c:
        r5 = (java.lang.Long) r5;
        r5 = r5.longValue();
        goto L_0x001d;
    L_0x0013:
        r6 = r5 instanceof java.lang.String;
        if (r6 == 0) goto L_0x003f;
    L_0x0017:
        r5 = (java.lang.String) r5;	 Catch:{ NumberFormatException -> 0x003e }
        r5 = java.lang.Long.parseLong(r5);	 Catch:{ NumberFormatException -> 0x003e }
    L_0x001d:
        r0 = 0;
        r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x002e;
    L_0x0023:
        r5 = new java.util.Date;
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r5.<init>(r6);
        return r5;
    L_0x002e:
        r0 = new java.util.Date;
        r1 = r7.getTime();
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r5 * r3;
        r3 = r1 + r5;
        r0.<init>(r3);
        return r0;
    L_0x003e:
        return r0;
    L_0x003f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.a(android.os.Bundle, java.lang.String, java.util.Date):java.util.Date");
    }

    /* renamed from: a */
    public static void m5773a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    /* renamed from: a */
    public static Map<String, String> m5769a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        Map<String, String> hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m5783a(AccessToken accessToken) {
        return (accessToken == null || accessToken.equals(AccessToken.getCurrentAccessToken()) == null) ? null : true;
    }

    /* renamed from: a */
    public static void m5776a(final String str, final GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback) {
        JSONObject a = C1746u.m6051a(str);
        if (a != null) {
            graphMeRequestWithCacheCallback.onSuccess(a);
            return;
        }
        Callback c34091 = new Callback() {
            public void onCompleted(GraphResponse graphResponse) {
                if (graphResponse.m4092a() != null) {
                    graphMeRequestWithCacheCallback.onFailure(graphResponse.m4092a().getException());
                    return;
                }
                C1746u.m6052a(str, graphResponse.m4093b());
                graphMeRequestWithCacheCallback.onSuccess(graphResponse.m4093b());
            }
        };
        str = m5806e(str);
        str.m4052a(c34091);
        str.m4066j();
    }

    /* renamed from: d */
    public static JSONObject m5801d(String str) {
        JSONObject a = C1746u.m6051a(str);
        if (a != null) {
            return a;
        }
        str = m5806e(str).m4065i();
        if (str.m4092a() != null) {
            return null;
        }
        return str.m4093b();
    }

    /* renamed from: e */
    private static GraphRequest m5806e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        return new GraphRequest(null, "me", bundle, HttpMethod.GET, null);
    }

    /* renamed from: a */
    private static int m5747a() {
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
        r0 = f4644a;
        if (r0 <= 0) goto L_0x0007;
    L_0x0004:
        r0 = f4644a;
        return r0;
    L_0x0007:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x001c }
        r1 = "/sys/devices/system/cpu/";	 Catch:{ Exception -> 0x001c }
        r0.<init>(r1);	 Catch:{ Exception -> 0x001c }
        r1 = new com.facebook.internal.Utility$2;	 Catch:{ Exception -> 0x001c }
        r1.<init>();	 Catch:{ Exception -> 0x001c }
        r0 = r0.listFiles(r1);	 Catch:{ Exception -> 0x001c }
        if (r0 == 0) goto L_0x001c;	 Catch:{ Exception -> 0x001c }
    L_0x0019:
        r0 = r0.length;	 Catch:{ Exception -> 0x001c }
        f4644a = r0;	 Catch:{ Exception -> 0x001c }
    L_0x001c:
        r0 = f4644a;
        if (r0 > 0) goto L_0x002f;
    L_0x0020:
        r0 = java.lang.Runtime.getRuntime();
        r0 = r0.availableProcessors();
        r1 = 1;
        r0 = java.lang.Math.max(r0, r1);
        f4644a = r0;
    L_0x002f:
        r0 = f4644a;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.a():int");
    }

    /* renamed from: f */
    private static void m5809f(Context context) {
        if (f4645b == -1 || System.currentTimeMillis() - f4645b >= 1800000) {
            f4645b = System.currentTimeMillis();
            m5791b();
            m5810g(context);
            m5807e();
            m5802d();
        }
    }

    /* renamed from: b */
    private static void m5791b() {
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
        r0 = java.util.TimeZone.getDefault();	 Catch:{ Exception -> 0x001a }
        r1 = new java.util.Date;	 Catch:{ Exception -> 0x001a }
        r1.<init>();	 Catch:{ Exception -> 0x001a }
        r1 = r0.inDaylightTime(r1);	 Catch:{ Exception -> 0x001a }
        r2 = 0;	 Catch:{ Exception -> 0x001a }
        r1 = r0.getDisplayName(r1, r2);	 Catch:{ Exception -> 0x001a }
        f4648e = r1;	 Catch:{ Exception -> 0x001a }
        r0 = r0.getID();	 Catch:{ Exception -> 0x001a }
        f4649f = r0;	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.b():void");
    }

    /* renamed from: g */
    private static void m5810g(android.content.Context r2) {
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
        r0 = f4650g;
        r1 = "NoCarrier";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0018;
    L_0x000a:
        r0 = "phone";	 Catch:{ Exception -> 0x0018 }
        r2 = r2.getSystemService(r0);	 Catch:{ Exception -> 0x0018 }
        r2 = (android.telephony.TelephonyManager) r2;	 Catch:{ Exception -> 0x0018 }
        r2 = r2.getNetworkOperatorName();	 Catch:{ Exception -> 0x0018 }
        f4650g = r2;	 Catch:{ Exception -> 0x0018 }
    L_0x0018:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.g(android.content.Context):void");
    }

    /* renamed from: c */
    private static boolean m5799c() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: d */
    private static void m5802d() {
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
        r0 = m5799c();	 Catch:{ Exception -> 0x002a }
        if (r0 == 0) goto L_0x0021;	 Catch:{ Exception -> 0x002a }
    L_0x0006:
        r0 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ Exception -> 0x002a }
        r1 = new android.os.StatFs;	 Catch:{ Exception -> 0x002a }
        r0 = r0.getPath();	 Catch:{ Exception -> 0x002a }
        r1.<init>(r0);	 Catch:{ Exception -> 0x002a }
        r0 = r1.getAvailableBlocks();	 Catch:{ Exception -> 0x002a }
        r2 = (long) r0;	 Catch:{ Exception -> 0x002a }
        r0 = r1.getBlockSize();	 Catch:{ Exception -> 0x002a }
        r0 = (long) r0;	 Catch:{ Exception -> 0x002a }
        r2 = r2 * r0;	 Catch:{ Exception -> 0x002a }
        f4647d = r2;	 Catch:{ Exception -> 0x002a }
    L_0x0021:
        r0 = f4647d;	 Catch:{ Exception -> 0x002a }
        r0 = (double) r0;	 Catch:{ Exception -> 0x002a }
        r0 = m5749a(r0);	 Catch:{ Exception -> 0x002a }
        f4647d = r0;	 Catch:{ Exception -> 0x002a }
    L_0x002a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.d():void");
    }

    /* renamed from: e */
    private static void m5807e() {
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
        r0 = m5799c();	 Catch:{ Exception -> 0x002a }
        if (r0 == 0) goto L_0x0021;	 Catch:{ Exception -> 0x002a }
    L_0x0006:
        r0 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ Exception -> 0x002a }
        r1 = new android.os.StatFs;	 Catch:{ Exception -> 0x002a }
        r0 = r0.getPath();	 Catch:{ Exception -> 0x002a }
        r1.<init>(r0);	 Catch:{ Exception -> 0x002a }
        r0 = r1.getBlockCount();	 Catch:{ Exception -> 0x002a }
        r2 = (long) r0;	 Catch:{ Exception -> 0x002a }
        r0 = r1.getBlockSize();	 Catch:{ Exception -> 0x002a }
        r0 = (long) r0;	 Catch:{ Exception -> 0x002a }
        r2 = r2 * r0;	 Catch:{ Exception -> 0x002a }
        f4646c = r2;	 Catch:{ Exception -> 0x002a }
    L_0x0021:
        r0 = f4646c;	 Catch:{ Exception -> 0x002a }
        r0 = (double) r0;	 Catch:{ Exception -> 0x002a }
        r0 = m5749a(r0);	 Catch:{ Exception -> 0x002a }
        f4646c = r0;	 Catch:{ Exception -> 0x002a }
    L_0x002a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.e():void");
    }

    /* renamed from: a */
    private static long m5749a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: a */
    public static C1688a m5751a(JSONObject jSONObject) throws JSONException {
        jSONObject = jSONObject.getJSONObject("permissions").getJSONArray(ManagerWebServices.FB_DATA);
        List arrayList = new ArrayList(jSONObject.length());
        List arrayList2 = new ArrayList(jSONObject.length());
        for (int i = 0; i < jSONObject.length(); i++) {
            JSONObject optJSONObject = jSONObject.optJSONObject(i);
            String optString = optJSONObject.optString("permission");
            if (optString != null) {
                if (!optString.equals("installed")) {
                    String optString2 = optJSONObject.optString("status");
                    if (optString2 != null) {
                        if (optString2.equals("granted")) {
                            arrayList.add(optString);
                        } else if (optString2.equals("declined")) {
                            arrayList2.add(optString);
                        }
                    }
                }
            }
        }
        return new C1688a(arrayList, arrayList2);
    }

    /* renamed from: a */
    public static String m5754a(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    /* renamed from: d */
    public static boolean m5803d(Context context) {
        return m5808e(context);
    }

    /* renamed from: e */
    public static boolean m5808e(Context context) {
        boolean z = false;
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (!(autofillManager == null || !autofillManager.isAutofillSupported() || autofillManager.isEnabled() == null)) {
            z = true;
        }
        return z;
    }
}
