package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.protocol.C1522c;
import com.tinder.api.ManagerWebServices;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.k.h */
public class C1490h {
    /* renamed from: a */
    private static final String f4123a = "h";
    /* renamed from: b */
    private static final Map<AdSize, C1522c> f4124b = new HashMap();

    /* renamed from: com.facebook.ads.internal.k.h$a */
    public static class C1489a {
        /* renamed from: a */
        public String f4120a;
        /* renamed from: b */
        public String f4121b;
        /* renamed from: c */
        public boolean f4122c;

        public C1489a(String str, String str2, boolean z) {
            this.f4120a = str;
            this.f4121b = str2;
            this.f4122c = z;
        }
    }

    static {
        f4124b.put(AdSize.RECTANGLE_HEIGHT_250, C1522c.WEBVIEW_BANNER_250);
        f4124b.put(AdSize.BANNER_HEIGHT_90, C1522c.WEBVIEW_BANNER_90);
        f4124b.put(AdSize.BANNER_HEIGHT_50, C1522c.WEBVIEW_BANNER_50);
    }

    /* renamed from: a */
    public static <P, PR, R> AsyncTask<P, PR, R> m5236a(Executor executor, AsyncTask<P, PR, R> asyncTask, P... pArr) {
        if (VERSION.SDK_INT >= 11) {
            asyncTask.executeOnExecutor(executor, pArr);
            return asyncTask;
        }
        asyncTask.execute(pArr);
        return asyncTask;
    }

    /* renamed from: a */
    public static com.facebook.ads.internal.p047k.C1490h.C1489a m5237a(android.content.ContentResolver r11) {
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
        r1 = 0;
        r2 = "aid";	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r3 = "androidid";	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r4 = "limit_tracking";	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r7 = new java.lang.String[]{r2, r3, r4};	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r2 = "content://com.facebook.katana.provider.AttributionIdProvider";	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r6 = android.net.Uri.parse(r2);	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r8 = 0;	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r9 = 0;	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r10 = 0;	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r5 = r11;	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r11 = r5.query(r6, r7, r8, r9, r10);	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        if (r11 == 0) goto L_0x0054;
    L_0x001c:
        r2 = r11.moveToFirst();	 Catch:{ Exception -> 0x0063 }
        if (r2 != 0) goto L_0x0023;	 Catch:{ Exception -> 0x0063 }
    L_0x0022:
        goto L_0x0054;	 Catch:{ Exception -> 0x0063 }
    L_0x0023:
        r2 = "aid";	 Catch:{ Exception -> 0x0063 }
        r2 = r11.getColumnIndex(r2);	 Catch:{ Exception -> 0x0063 }
        r2 = r11.getString(r2);	 Catch:{ Exception -> 0x0063 }
        r3 = "androidid";	 Catch:{ Exception -> 0x0063 }
        r3 = r11.getColumnIndex(r3);	 Catch:{ Exception -> 0x0063 }
        r3 = r11.getString(r3);	 Catch:{ Exception -> 0x0063 }
        r4 = "limit_tracking";	 Catch:{ Exception -> 0x0063 }
        r4 = r11.getColumnIndex(r4);	 Catch:{ Exception -> 0x0063 }
        r4 = r11.getString(r4);	 Catch:{ Exception -> 0x0063 }
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ Exception -> 0x0063 }
        r5 = new com.facebook.ads.internal.k.h$a;	 Catch:{ Exception -> 0x0063 }
        r4 = r4.booleanValue();	 Catch:{ Exception -> 0x0063 }
        r5.<init>(r2, r3, r4);	 Catch:{ Exception -> 0x0063 }
        if (r11 == 0) goto L_0x0053;
    L_0x0050:
        r11.close();
    L_0x0053:
        return r5;
    L_0x0054:
        r2 = new com.facebook.ads.internal.k.h$a;	 Catch:{ Exception -> 0x0063 }
        r2.<init>(r1, r1, r0);	 Catch:{ Exception -> 0x0063 }
        if (r11 == 0) goto L_0x005e;
    L_0x005b:
        r11.close();
    L_0x005e:
        return r2;
    L_0x005f:
        r0 = move-exception;
        r11 = r1;
        goto L_0x006f;
    L_0x0062:
        r11 = r1;
    L_0x0063:
        r2 = new com.facebook.ads.internal.k.h$a;	 Catch:{ all -> 0x006e }
        r2.<init>(r1, r1, r0);	 Catch:{ all -> 0x006e }
        if (r11 == 0) goto L_0x006d;
    L_0x006a:
        r11.close();
    L_0x006d:
        return r2;
    L_0x006e:
        r0 = move-exception;
    L_0x006f:
        if (r11 == 0) goto L_0x0074;
    L_0x0071:
        r11.close();
    L_0x0074:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.h.a(android.content.ContentResolver):com.facebook.ads.internal.k.h$a");
    }

    /* renamed from: a */
    public static C1522c m5238a(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return C1490h.m5253a(i, i2) ? C1522c.WEBVIEW_INTERSTITIAL_TABLET : i2 > i ? C1522c.WEBVIEW_INTERSTITIAL_VERTICAL : C1522c.WEBVIEW_INTERSTITIAL_HORIZONTAL;
    }

    /* renamed from: a */
    public static C1522c m5239a(AdSize adSize) {
        C1522c c1522c = (C1522c) f4124b.get(adSize);
        return c1522c == null ? C1522c.WEBVIEW_BANNER_LEGACY : c1522c;
    }

    /* renamed from: a */
    public static java.lang.Object m5240a(java.lang.Object r0, java.lang.reflect.Method r1, java.lang.Object... r2) {
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
        r0 = r1.invoke(r0, r2);	 Catch:{ Exception -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.h.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: a */
    public static String m5241a(double d) {
        return String.format(Locale.US, "%.3f", new Object[]{Double.valueOf(d)});
    }

    /* renamed from: a */
    public static String m5242a(long j) {
        return C1490h.m5241a(((double) j) / 1000.0d);
    }

    /* renamed from: a */
    public static String m5243a(InputStream inputStream) {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read != -1) {
                stringWriter.write(cArr, 0, read);
            } else {
                String stringWriter2 = stringWriter.toString();
                stringWriter.close();
                inputStreamReader.close();
                return stringWriter2;
            }
        }
    }

    /* renamed from: a */
    public static String m5244a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m5245a(JSONObject jSONObject, String str) {
        return C1490h.m5246a(jSONObject, str, null);
    }

    /* renamed from: a */
    public static String m5246a(JSONObject jSONObject, String str, String str2) {
        String optString = jSONObject.optString(str, str2);
        return ManagerWebServices.NULL_STRING_VALUE.equals(optString) ? null : optString;
    }

    /* renamed from: a */
    public static String m5247a(byte[] bArr) {
        try {
            InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            InputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            String a = C1490h.m5243a(gZIPInputStream);
            gZIPInputStream.close();
            byteArrayInputStream.close();
            return a;
        } catch (Throwable e) {
            C1482c.m5218a(C1481b.m5215a(e, "Error decompressing data"));
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static java.lang.reflect.Method m5248a(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.h.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    public static java.lang.reflect.Method m5249a(java.lang.String r0, java.lang.String r1, java.lang.Class<?>... r2) {
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
        r0 = com.facebook.ads.internal.p047k.C1490h.m5248a(r0, r1, r2);	 Catch:{ ClassNotFoundException -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.h.a(java.lang.String, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    public static void m5250a(Context context, String str) {
        if (AdSettings.isTestMode(context)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" (displayed for test ads only)");
            Log.d("FBAudienceNetworkLog", stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static void m5251a(DisplayMetrics displayMetrics, View view, AdSize adSize) {
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= adSize.getWidth() ? displayMetrics.widthPixels : (int) Math.ceil((double) (((float) adSize.getWidth()) * displayMetrics.density)), (int) Math.ceil((double) (((float) adSize.getHeight()) * displayMetrics.density)));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static void m5252a(com.facebook.ads.internal.p047k.ak r3, android.content.Context r4, android.net.Uri r5, java.lang.String r6) {
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
        r0 = r5.getScheme();
        r0 = com.facebook.ads.internal.view.p050a.C3325d.m12836a(r0);
        if (r0 == 0) goto L_0x0018;
    L_0x000a:
        r0 = r5.getHost();
        r1 = "play.google.com";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0018;
    L_0x0016:
        r0 = 1;
        goto L_0x0019;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        r1 = r5.getScheme();
        r2 = "market";
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x002c;
    L_0x0025:
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        goto L_0x002c;
    L_0x0028:
        r3.m5196a(r4, r5, r6);
        return;
    L_0x002c:
        r3.m5195a(r4, r5);	 Catch:{ u -> 0x0028 }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.h.a(com.facebook.ads.internal.k.ak, android.content.Context, android.net.Uri, java.lang.String):void");
    }

    /* renamed from: a */
    public static boolean m5253a(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    /* renamed from: a */
    public static boolean m5254a(android.content.Context r3) {
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
        r1 = "activity";	 Catch:{ Throwable -> 0x0053 }
        r3 = r3.getSystemService(r1);	 Catch:{ Throwable -> 0x0053 }
        r3 = (android.app.ActivityManager) r3;	 Catch:{ Throwable -> 0x0053 }
        r1 = 2;	 Catch:{ Throwable -> 0x0053 }
        r3 = r3.getRunningTasks(r1);	 Catch:{ Throwable -> 0x0053 }
        r3 = r3.get(r0);	 Catch:{ Throwable -> 0x0053 }
        r3 = (android.app.ActivityManager.RunningTaskInfo) r3;	 Catch:{ Throwable -> 0x0053 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0053 }
        r1.<init>();	 Catch:{ Throwable -> 0x0053 }
        r2 = r3.topActivity;	 Catch:{ Throwable -> 0x0053 }
        r2 = r2.getPackageName();	 Catch:{ Throwable -> 0x0053 }
        r1.append(r2);	 Catch:{ Throwable -> 0x0053 }
        r2 = ".UnityPlayerActivity";	 Catch:{ Throwable -> 0x0053 }
        r1.append(r2);	 Catch:{ Throwable -> 0x0053 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x0053 }
        r3 = r3.topActivity;	 Catch:{ Throwable -> 0x0053 }
        r3 = r3.getClassName();	 Catch:{ Throwable -> 0x0053 }
        if (r3 == r1) goto L_0x003c;	 Catch:{ Throwable -> 0x0053 }
    L_0x0033:
        r3 = com.facebook.ads.internal.p047k.C1490h.m5257b(r1);	 Catch:{ Throwable -> 0x0053 }
        if (r3 == 0) goto L_0x003a;	 Catch:{ Throwable -> 0x0053 }
    L_0x0039:
        goto L_0x003c;	 Catch:{ Throwable -> 0x0053 }
    L_0x003a:
        r3 = 0;	 Catch:{ Throwable -> 0x0053 }
        goto L_0x003d;	 Catch:{ Throwable -> 0x0053 }
    L_0x003c:
        r3 = 1;	 Catch:{ Throwable -> 0x0053 }
    L_0x003d:
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ Throwable -> 0x0053 }
        r1 = "IS_UNITY";	 Catch:{ Throwable -> 0x0053 }
        r2 = r3.booleanValue();	 Catch:{ Throwable -> 0x0053 }
        r2 = java.lang.Boolean.toString(r2);	 Catch:{ Throwable -> 0x0053 }
        android.util.Log.d(r1, r2);	 Catch:{ Throwable -> 0x0053 }
        r3 = r3.booleanValue();	 Catch:{ Throwable -> 0x0053 }
        return r3;
    L_0x0053:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.h.a(android.content.Context):boolean");
    }

    /* renamed from: a */
    public static boolean m5255a(java.lang.String r1, java.lang.String r2) {
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
        r0 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0019 }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x0019 }
        r0.append(r1);	 Catch:{ ClassNotFoundException -> 0x0019 }
        r1 = ".";	 Catch:{ ClassNotFoundException -> 0x0019 }
        r0.append(r1);	 Catch:{ ClassNotFoundException -> 0x0019 }
        r0.append(r2);	 Catch:{ ClassNotFoundException -> 0x0019 }
        r1 = r0.toString();	 Catch:{ ClassNotFoundException -> 0x0019 }
        java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0019 }
        r1 = 1;
        return r1;
    L_0x0019:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.h.a(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static byte[] m5256a(String str) {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return toByteArray;
        } catch (Throwable e) {
            C1482c.m5218a(C1481b.m5215a(e, "Error compressing data"));
            e.printStackTrace();
            return new byte[0];
        }
    }

    /* renamed from: b */
    public static boolean m5257b(java.lang.String r0) {
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
        java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x0005 }
        r0 = 1;
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.h.b(java.lang.String):boolean");
    }
}
