package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@zzzv
public final class avy implements zzzt {
    /* renamed from: a */
    private static final Object f23216a = new Object();
    /* renamed from: b */
    private static zzzt f23217b;
    /* renamed from: c */
    private final Object f23218c = new Object();
    /* renamed from: d */
    private final Context f23219d;
    /* renamed from: e */
    private final WeakHashMap<Thread, Boolean> f23220e = new WeakHashMap();
    /* renamed from: f */
    private final ExecutorService f23221f = Executors.newCachedThreadPool();
    /* renamed from: g */
    private final zzakd f23222g;

    private avy(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f23219d = context;
        this.f23222g = zzakd.zzrd();
        Thread thread = Looper.getMainLooper().getThread();
        if (thread != null) {
            synchronized (this.f23218c) {
                this.f23220e.put(thread, Boolean.valueOf(true));
            }
            thread.setUncaughtExceptionHandler(new awa(this, thread.getUncaughtExceptionHandler()));
        }
        Thread.setDefaultUncaughtExceptionHandler(new avz(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    /* renamed from: a */
    private final android.net.Uri.Builder m27263a(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
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
        r11 = r7.f23219d;	 Catch:{ Throwable -> 0x000b }
        r11 = com.google.android.gms.internal.pl.m20131a(r11);	 Catch:{ Throwable -> 0x000b }
        r11 = r11.m20127a();	 Catch:{ Throwable -> 0x000b }
        goto L_0x0012;
    L_0x000b:
        r11 = move-exception;
        r0 = "Error fetching instant app info";
        com.google.android.gms.internal.hx.m19912b(r0, r11);
        r11 = 0;
    L_0x0012:
        r0 = "unknown";
        r1 = r7.f23219d;	 Catch:{ Throwable -> 0x001c }
        r1 = r1.getPackageName();	 Catch:{ Throwable -> 0x001c }
        r0 = r1;
        goto L_0x0021;
    L_0x001c:
        r1 = "Cannot obtain package name, proceeding.";
        com.google.android.gms.internal.hx.m19916e(r1);
    L_0x0021:
        r1 = new android.net.Uri$Builder;
        r1.<init>();
        r2 = "https";
        r1 = r1.scheme(r2);
        r2 = "//pagead2.googlesyndication.com/pagead/gen_204";
        r1 = r1.path(r2);
        r2 = "is_aia";
        r11 = java.lang.Boolean.toString(r11);
        r11 = r1.appendQueryParameter(r2, r11);
        r1 = "id";
        r2 = "gmob-apps-report-exception";
        r11 = r11.appendQueryParameter(r1, r2);
        r1 = "os";
        r2 = android.os.Build.VERSION.RELEASE;
        r11 = r11.appendQueryParameter(r1, r2);
        r1 = "api";
        r2 = android.os.Build.VERSION.SDK_INT;
        r2 = java.lang.String.valueOf(r2);
        r11 = r11.appendQueryParameter(r1, r2);
        r1 = "device";
        r2 = android.os.Build.MANUFACTURER;
        r3 = android.os.Build.MODEL;
        r4 = r3.startsWith(r2);
        r5 = 1;
        if (r4 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x008c;
    L_0x0066:
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r4 = r4 + r5;
        r6 = java.lang.String.valueOf(r3);
        r6 = r6.length();
        r4 = r4 + r6;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r4);
        r6.append(r2);
        r2 = " ";
        r6.append(r2);
        r6.append(r3);
        r3 = r6.toString();
    L_0x008c:
        r11 = r11.appendQueryParameter(r1, r3);
        r1 = "js";
        r2 = r7.f23222g;
        r2 = r2.zzcv;
        r11 = r11.appendQueryParameter(r1, r2);
        r1 = "appid";
        r11 = r11.appendQueryParameter(r1, r0);
        r0 = "exceptiontype";
        r8 = r11.appendQueryParameter(r0, r8);
        r11 = "stacktrace";
        r8 = r8.appendQueryParameter(r11, r9);
        r9 = "eids";
        r11 = ",";
        r0 = com.google.android.gms.internal.alo.m19336a();
        r11 = android.text.TextUtils.join(r11, r0);
        r8 = r8.appendQueryParameter(r9, r11);
        r9 = "exceptionkey";
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "cl";
        r10 = "179146524";
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "rc";
        r10 = "dev";
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "session_id";
        r10 = com.google.android.gms.internal.aja.m19218c();
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "sampling_rate";
        r10 = java.lang.Integer.toString(r5);
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "pb_tm";
        r10 = com.google.android.gms.internal.alo.cN;
        r11 = com.google.android.gms.internal.aja.m19221f();
        r10 = r11.m19334a(r10);
        r10 = java.lang.String.valueOf(r10);
        r8 = r8.appendQueryParameter(r9, r10);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.avy.a(java.lang.String, java.lang.String, java.lang.String, int):android.net.Uri$Builder");
    }

    /* renamed from: a */
    public static zzzt m27264a(Context context) {
        synchronized (f23216a) {
            if (f23217b == null) {
                if (((Boolean) aja.m19221f().m19334a(alo.f15450b)).booleanValue()) {
                    f23217b = new avy(context);
                } else {
                    f23217b = new awc();
                }
            }
        }
        return f23217b;
    }

    /* renamed from: a */
    private final void m27265a(List<String> list) {
        for (String str : list) {
            this.f23221f.submit(new awb(this, new hy(), str));
        }
    }

    /* renamed from: a */
    protected final void m27266a(Thread thread, Throwable th) {
        Object obj;
        String str;
        String name;
        String stringWriter;
        Object obj2 = null;
        if (th != null) {
            Throwable th2 = th;
            Object obj3 = null;
            Object obj4 = null;
            while (th2 != null) {
                Object obj5 = obj4;
                obj4 = obj3;
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (hn.m19875b(stackTraceElement.getClassName())) {
                        obj4 = 1;
                    }
                    if (getClass().getName().equals(stackTraceElement.getClassName())) {
                        obj5 = 1;
                    }
                }
                th2 = th2.getCause();
                obj3 = obj4;
                obj4 = obj5;
            }
            if (obj3 != null && obj4 == null) {
                obj = 1;
                if (obj != null) {
                    str = "";
                    if (hn.m19866a(th) != null) {
                        name = th.getClass().getName();
                        Writer stringWriter2 = new StringWriter();
                        zp.m20292a(th, new PrintWriter(stringWriter2));
                        stringWriter = stringWriter2.toString();
                        if (Math.random() < 1.0d) {
                            obj2 = 1;
                        }
                        if (obj2 != null) {
                            List arrayList = new ArrayList();
                            arrayList.add(m27263a(name, stringWriter, str, 1).toString());
                            m27265a(arrayList);
                        }
                    }
                }
            }
        }
        obj = null;
        if (obj != null) {
            str = "";
            if (hn.m19866a(th) != null) {
                name = th.getClass().getName();
                Writer stringWriter22 = new StringWriter();
                zp.m20292a(th, new PrintWriter(stringWriter22));
                stringWriter = stringWriter22.toString();
                if (Math.random() < 1.0d) {
                    obj2 = 1;
                }
                if (obj2 != null) {
                    List arrayList2 = new ArrayList();
                    arrayList2.add(m27263a(name, stringWriter, str, 1).toString());
                    m27265a(arrayList2);
                }
            }
        }
    }

    public final void zza(Throwable th, String str) {
        if (hn.m19866a(th) != null) {
            String name = th.getClass().getName();
            Writer stringWriter = new StringWriter();
            zp.m20292a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if ((Math.random() < 1.0d ? 1 : null) != null) {
                List arrayList = new ArrayList();
                arrayList.add(m27263a(name, stringWriter2, str, 1).toString());
                m27265a(arrayList);
            }
        }
    }
}
