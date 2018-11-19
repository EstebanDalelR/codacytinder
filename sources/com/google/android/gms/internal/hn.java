package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.C2340b;
import com.google.android.gms.ads.C2363h;
import com.google.android.gms.ads.C3731e;
import com.google.android.gms.ads.doubleclick.C2346b;
import com.google.android.gms.ads.doubleclick.C2347c;
import com.google.android.gms.ads.p068a.C2337b;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.tinder.api.ManagerWebServices;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.LinkedList;
import org.michaelevans.aftermath.Aftermath;

@zzzv
public final class hn {
    /* renamed from: a */
    public static final Handler f16157a = new Handler(Looper.getMainLooper());
    /* renamed from: b */
    private static final String f16158b = C3731e.class.getName();
    /* renamed from: c */
    private static final String f16159c = C2363h.class.getName();
    /* renamed from: d */
    private static final String f16160d = C2346b.class.getName();
    /* renamed from: e */
    private static final String f16161e = C2347c.class.getName();
    /* renamed from: f */
    private static final String f16162f = C2337b.class.getName();
    /* renamed from: g */
    private static final String f16163g = C2340b.class.getName();

    /* renamed from: a */
    public static int m19861a(Context context, int i) {
        return m19862a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m19862a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: a */
    public static String m19863a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
        if (string == null || m19870a()) {
            string = "emulator";
        }
        return m19864a(string);
    }

    /* renamed from: a */
    public static java.lang.String m19864a(java.lang.String r9) {
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
    L_0x0002:
        r2 = 2;
        r3 = 0;
        if (r1 >= r2) goto L_0x002e;
    L_0x0006:
        r2 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2 = java.security.MessageDigest.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r4 = r9.getBytes();	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2.update(r4);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r4 = java.util.Locale.US;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r5 = "%032X";	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r6 = 1;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r7 = new java.lang.Object[r6];	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r8 = new java.math.BigInteger;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2 = r2.digest();	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r8.<init>(r6, r2);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r7[r0] = r8;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2 = java.lang.String.format(r4, r5, r7);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        return r2;
    L_0x002a:
        return r3;
    L_0x002b:
        r1 = r1 + 1;
        goto L_0x0002;
    L_0x002e:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hn.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    /* renamed from: a */
    public static java.lang.String m19865a(java.lang.StackTraceElement[] r5, java.lang.String r6) {
        /*
        r0 = 0;
    L_0x0001:
        r1 = r0 + 1;
        r2 = r5.length;
        r3 = 0;
        if (r1 >= r2) goto L_0x0052;
    L_0x0007:
        r0 = r5[r0];
        r2 = r0.getClassName();
        r0 = r0.getMethodName();
        r4 = "loadAd";
        r0 = r4.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x0050;
    L_0x0019:
        r0 = f16158b;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0021:
        r0 = f16159c;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0029:
        r0 = f16160d;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0031:
        r0 = f16161e;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0039:
        r0 = f16162f;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0041:
        r0 = f16163g;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0050;
    L_0x0049:
        r5 = r5[r1];
        r5 = r5.getClassName();
        goto L_0x0053;
    L_0x0050:
        r0 = r1;
        goto L_0x0001;
    L_0x0052:
        r5 = r3;
    L_0x0053:
        if (r6 == 0) goto L_0x0094;
    L_0x0055:
        r0 = ".";
        r1 = new java.util.StringTokenizer;
        r1.<init>(r6, r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = 2;
        r4 = r1.hasMoreElements();
        if (r4 == 0) goto L_0x008b;
    L_0x0068:
        r6 = r1.nextToken();
        r0.append(r6);
    L_0x006f:
        r6 = r2 + -1;
        if (r2 <= 0) goto L_0x0087;
    L_0x0073:
        r2 = r1.hasMoreElements();
        if (r2 == 0) goto L_0x0087;
    L_0x0079:
        r2 = ".";
        r0.append(r2);
        r2 = r1.nextToken();
        r0.append(r2);
        r2 = r6;
        goto L_0x006f;
    L_0x0087:
        r6 = r0.toString();
    L_0x008b:
        if (r5 == 0) goto L_0x0094;
    L_0x008d:
        r6 = r5.contains(r6);
        if (r6 != 0) goto L_0x0094;
    L_0x0093:
        return r5;
    L_0x0094:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hn.a(java.lang.StackTraceElement[], java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static Throwable m19866a(Throwable th) {
        if (((Boolean) aja.m19221f().m19334a(alo.f15451c)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        th = null;
        while (!linkedList.isEmpty()) {
            Throwable th2 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th2.getClass().getName(), "<filtered>", "<filtered>", 1));
            Object obj = null;
            for (Object obj2 : stackTrace) {
                Object obj22;
                if (m19875b(obj22.getClassName())) {
                    arrayList.add(obj22);
                    obj = 1;
                } else {
                    String className = obj22.getClassName();
                    Object obj3 = (TextUtils.isEmpty(className) || !(className.startsWith(Aftermath.ANDROID_PREFIX) || className.startsWith(Aftermath.JAVA_PREFIX))) ? null : 1;
                    if (obj3 == null) {
                        obj22 = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(obj22);
                }
            }
            if (obj != null) {
                th = th == null ? new Throwable(th2.getMessage()) : new Throwable(th2.getMessage(), th);
                th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th;
    }

    /* renamed from: a */
    public static void m19867a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, zzaju zzaju) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                C2490g.b();
                int d = C2490g.d(context);
                StringBuilder stringBuilder = new StringBuilder(23);
                stringBuilder.append(d);
                stringBuilder.append(".11910000");
                str = stringBuilder.toString();
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str22 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str22, bundle.getString(str22));
        }
        zzaju.zzck(appendQueryParameter.toString());
    }

    /* renamed from: a */
    private final void m19868a(ViewGroup viewGroup, zzjn zzjn, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            View textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            View frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            i = m19861a(context, 3);
            frameLayout.addView(textView, new LayoutParams(zzjn.widthPixels - i, zzjn.heightPixels - i, 17));
            viewGroup.addView(frameLayout, zzjn.widthPixels, zzjn.heightPixels);
        }
    }

    /* renamed from: a */
    public static void m19869a(boolean z, HttpURLConnection httpURLConnection, @Nullable String str) {
        httpURLConnection.setConnectTimeout(ManagerWebServices.TIMEOUT_AUTH_MS);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(ManagerWebServices.TIMEOUT_AUTH_MS);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static boolean m19870a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public static int m19871b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m19872b(displayMetrics, i);
    }

    /* renamed from: b */
    public static int m19872b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    @Nullable
    /* renamed from: b */
    public static String m19873b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
    }

    /* renamed from: b */
    public static boolean m19874b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static boolean m19875b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) aja.m19221f().m19334a(alo.f15452d))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(zzzv.class);
        } catch (Throwable e) {
            String str2 = "Fail to check class type for class ";
            str = String.valueOf(str);
            hx.m19909a(str.length() != 0 ? str2.concat(str) : new String(str2), e);
            return false;
        }
    }

    /* renamed from: c */
    public static java.lang.String m19876c() {
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
        r0 = java.util.UUID.randomUUID();
        r1 = r0.getLeastSignificantBits();
        r1 = java.math.BigInteger.valueOf(r1);
        r1 = r1.toByteArray();
        r2 = r0.getMostSignificantBits();
        r0 = java.math.BigInteger.valueOf(r2);
        r0 = r0.toByteArray();
        r2 = new java.math.BigInteger;
        r3 = 1;
        r2.<init>(r3, r1);
        r2 = r2.toString();
        r4 = 0;
        r5 = r2;
        r2 = 0;
    L_0x0029:
        r6 = 2;
        if (r2 >= r6) goto L_0x0050;
    L_0x002c:
        r6 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = java.security.MessageDigest.getInstance(r6);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6.update(r1);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6.update(r0);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r7 = 8;	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r8 = new byte[r7];	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = r6.digest();	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        java.lang.System.arraycopy(r6, r4, r8, r4, r7);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = new java.math.BigInteger;	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6.<init>(r3, r8);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = r6.toString();	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r5 = r6;
    L_0x004d:
        r2 = r2 + 1;
        goto L_0x0029;
    L_0x0050:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hn.c():java.lang.String");
    }

    /* renamed from: c */
    public static boolean m19877c(Context context) {
        return C2490g.b().a(context) == 0;
    }

    /* renamed from: d */
    public static int m19878d(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: e */
    public static int m19879e(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: f */
    public static boolean m19880f(Context context) {
        int a = C2490g.b().a(context);
        if (a != 0) {
            if (a != 2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m19881g(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @android.annotation.TargetApi(17)
    /* renamed from: h */
    public static boolean m19882h(android.content.Context r6) {
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
        r0 = r6.getResources();
        r0 = r0.getDisplayMetrics();
        r1 = "window";
        r6 = r6.getSystemService(r1);
        r6 = (android.view.WindowManager) r6;
        r6 = r6.getDefaultDisplay();
        r1 = com.google.android.gms.common.util.C2526k.c();
        r2 = 0;
        if (r1 == 0) goto L_0x0023;
    L_0x001b:
        r6.getRealMetrics(r0);
        r1 = r0.heightPixels;
        r3 = r0.widthPixels;
        goto L_0x004f;
    L_0x0023:
        r1 = android.view.Display.class;	 Catch:{ Exception -> 0x005c }
        r3 = "getRawHeight";	 Catch:{ Exception -> 0x005c }
        r4 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x005c }
        r1 = r1.getMethod(r3, r4);	 Catch:{ Exception -> 0x005c }
        r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x005c }
        r1 = r1.invoke(r6, r3);	 Catch:{ Exception -> 0x005c }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x005c }
        r1 = r1.intValue();	 Catch:{ Exception -> 0x005c }
        r3 = android.view.Display.class;	 Catch:{ Exception -> 0x005c }
        r4 = "getRawWidth";	 Catch:{ Exception -> 0x005c }
        r5 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x005c }
        r3 = r3.getMethod(r4, r5);	 Catch:{ Exception -> 0x005c }
        r4 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x005c }
        r3 = r3.invoke(r6, r4);	 Catch:{ Exception -> 0x005c }
        r3 = (java.lang.Integer) r3;	 Catch:{ Exception -> 0x005c }
        r3 = r3.intValue();	 Catch:{ Exception -> 0x005c }
    L_0x004f:
        r6.getMetrics(r0);
        r6 = r0.heightPixels;
        r0 = r0.widthPixels;
        if (r6 != r1) goto L_0x005c;
    L_0x0058:
        if (r0 != r3) goto L_0x005c;
    L_0x005a:
        r6 = 1;
        return r6;
    L_0x005c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hn.h(android.content.Context):boolean");
    }

    /* renamed from: i */
    public static int m19883i(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    /* renamed from: a */
    public final void m19884a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        m19867a(context, null, str2, bundle, true, new ho(this));
    }

    /* renamed from: a */
    public final void m19885a(ViewGroup viewGroup, zzjn zzjn, String str) {
        m19868a(viewGroup, zzjn, str, -16777216, -1);
    }

    /* renamed from: a */
    public final void m19886a(ViewGroup viewGroup, zzjn zzjn, String str, String str2) {
        hx.m19916e(str2);
        m19868a(viewGroup, zzjn, str, -65536, -16777216);
    }
}
