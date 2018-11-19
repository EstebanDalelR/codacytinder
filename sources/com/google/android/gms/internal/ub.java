package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ub {
    /* renamed from: b */
    private static final String f16549b = "ub";
    /* renamed from: a */
    protected Context f16550a;
    /* renamed from: c */
    private ExecutorService f16551c;
    /* renamed from: d */
    private DexClassLoader f16552d;
    /* renamed from: e */
    private tc f16553e;
    /* renamed from: f */
    private byte[] f16554f;
    /* renamed from: g */
    private volatile AdvertisingIdClient f16555g = null;
    /* renamed from: h */
    private volatile boolean f16556h = false;
    /* renamed from: i */
    private Future f16557i = null;
    /* renamed from: j */
    private boolean f16558j;
    /* renamed from: k */
    private volatile nx f16559k = null;
    /* renamed from: l */
    private Future f16560l = null;
    /* renamed from: m */
    private sp f16561m;
    /* renamed from: n */
    private boolean f16562n = false;
    /* renamed from: o */
    private boolean f16563o = false;
    /* renamed from: p */
    private Map<Pair<String, String>, aar> f16564p;
    /* renamed from: q */
    private boolean f16565q = false;
    /* renamed from: r */
    private boolean f16566r;
    /* renamed from: s */
    private boolean f16567s;

    /* renamed from: com.google.android.gms.internal.ub$a */
    final class C4477a extends BroadcastReceiver {
        /* renamed from: a */
        private /* synthetic */ ub f16548a;

        private C4477a(ub ubVar) {
            this.f16548a = ubVar;
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                this.f16548a.f16566r = true;
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                this.f16548a.f16566r = false;
            }
        }
    }

    private ub(Context context) {
        boolean z = true;
        this.f16566r = true;
        this.f16567s = false;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            z = false;
        }
        this.f16558j = z;
        if (this.f16558j) {
            context = applicationContext;
        }
        this.f16550a = context;
        this.f16564p = new HashMap();
    }

    /* renamed from: a */
    public static com.google.android.gms.internal.ub m20193a(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
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
        r0 = new com.google.android.gms.internal.ub;
        r0.<init>(r8);
        r8 = java.util.concurrent.Executors.newCachedThreadPool();	 Catch:{ zzdj -> 0x0165 }
        r0.f16551c = r8;	 Catch:{ zzdj -> 0x0165 }
        r0.f16556h = r11;	 Catch:{ zzdj -> 0x0165 }
        if (r11 == 0) goto L_0x001c;	 Catch:{ zzdj -> 0x0165 }
    L_0x000f:
        r8 = r0.f16551c;	 Catch:{ zzdj -> 0x0165 }
        r11 = new com.google.android.gms.internal.uc;	 Catch:{ zzdj -> 0x0165 }
        r11.<init>(r0);	 Catch:{ zzdj -> 0x0165 }
        r8 = r8.submit(r11);	 Catch:{ zzdj -> 0x0165 }
        r0.f16557i = r8;	 Catch:{ zzdj -> 0x0165 }
    L_0x001c:
        r8 = r0.f16551c;	 Catch:{ zzdj -> 0x0165 }
        r11 = new com.google.android.gms.internal.ue;	 Catch:{ zzdj -> 0x0165 }
        r11.<init>(r0);	 Catch:{ zzdj -> 0x0165 }
        r8.execute(r11);	 Catch:{ zzdj -> 0x0165 }
        r8 = 0;
        r11 = 1;
        r1 = com.google.android.gms.common.C2490g.b();	 Catch:{ Throwable -> 0x0046 }
        r2 = r0.f16550a;	 Catch:{ Throwable -> 0x0046 }
        r2 = com.google.android.gms.common.C2490g.d(r2);	 Catch:{ Throwable -> 0x0046 }
        if (r2 <= 0) goto L_0x0036;	 Catch:{ Throwable -> 0x0046 }
    L_0x0034:
        r2 = 1;	 Catch:{ Throwable -> 0x0046 }
        goto L_0x0037;	 Catch:{ Throwable -> 0x0046 }
    L_0x0036:
        r2 = 0;	 Catch:{ Throwable -> 0x0046 }
    L_0x0037:
        r0.f16562n = r2;	 Catch:{ Throwable -> 0x0046 }
        r2 = r0.f16550a;	 Catch:{ Throwable -> 0x0046 }
        r1 = r1.a(r2);	 Catch:{ Throwable -> 0x0046 }
        if (r1 != 0) goto L_0x0043;	 Catch:{ Throwable -> 0x0046 }
    L_0x0041:
        r1 = 1;	 Catch:{ Throwable -> 0x0046 }
        goto L_0x0044;	 Catch:{ Throwable -> 0x0046 }
    L_0x0043:
        r1 = 0;	 Catch:{ Throwable -> 0x0046 }
    L_0x0044:
        r0.f16563o = r1;	 Catch:{ Throwable -> 0x0046 }
    L_0x0046:
        r0.m20206a(r8, r11);	 Catch:{ zzdj -> 0x0165 }
        r1 = com.google.android.gms.internal.vk.m20256b();	 Catch:{ zzdj -> 0x0165 }
        if (r1 == 0) goto L_0x0069;	 Catch:{ zzdj -> 0x0165 }
    L_0x004f:
        r1 = com.google.android.gms.internal.alo.bz;	 Catch:{ zzdj -> 0x0165 }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ zzdj -> 0x0165 }
        r1 = r2.m19334a(r1);	 Catch:{ zzdj -> 0x0165 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ zzdj -> 0x0165 }
        r1 = r1.booleanValue();	 Catch:{ zzdj -> 0x0165 }
        if (r1 == 0) goto L_0x0069;	 Catch:{ zzdj -> 0x0165 }
    L_0x0061:
        r8 = new java.lang.IllegalStateException;	 Catch:{ zzdj -> 0x0165 }
        r9 = "Task Context initialization must not be called from the UI thread.";	 Catch:{ zzdj -> 0x0165 }
        r8.<init>(r9);	 Catch:{ zzdj -> 0x0165 }
        throw r8;	 Catch:{ zzdj -> 0x0165 }
    L_0x0069:
        r1 = new com.google.android.gms.internal.tc;	 Catch:{ zzdj -> 0x0165 }
        r2 = 0;	 Catch:{ zzdj -> 0x0165 }
        r1.<init>(r2);	 Catch:{ zzdj -> 0x0165 }
        r0.f16553e = r1;	 Catch:{ zzdj -> 0x0165 }
        r1 = r0.f16553e;	 Catch:{ zzcy -> 0x015e }
        r9 = r1.m20186a(r9);	 Catch:{ zzcy -> 0x015e }
        r0.f16554f = r9;	 Catch:{ zzcy -> 0x015e }
        r9 = r0.f16550a;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r9 = r9.getCacheDir();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        if (r9 != 0) goto L_0x0091;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
    L_0x0081:
        r9 = r0.f16550a;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r1 = "dex";	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r9 = r9.getDir(r1, r8);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        if (r9 != 0) goto L_0x0091;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
    L_0x008b:
        r8 = new com.google.android.gms.internal.zzdj;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r8.<init>();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        throw r8;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
    L_0x0091:
        r1 = "1505450608132";	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r4 = "%s/%s.jar";	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r5 = 2;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r6 = new java.lang.Object[r5];	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r6[r8] = r9;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r6[r11] = r1;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r4 = java.lang.String.format(r4, r6);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r4 = r3.exists();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        if (r4 != 0) goto L_0x00c2;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
    L_0x00ab:
        r4 = r0.f16553e;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r6 = r0.f16554f;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r10 = r4.m20187a(r6, r10);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3.createNewFile();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r4 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r4.<init>(r3);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r6 = r10.length;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r4.write(r10, r8, r6);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r4.close();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
    L_0x00c2:
        r0.m20201b(r9, r1);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r10 = new dalvik.system.DexClassLoader;	 Catch:{ all -> 0x012b }
        r4 = r3.getAbsolutePath();	 Catch:{ all -> 0x012b }
        r6 = r9.getAbsolutePath();	 Catch:{ all -> 0x012b }
        r7 = r0.f16550a;	 Catch:{ all -> 0x012b }
        r7 = r7.getClassLoader();	 Catch:{ all -> 0x012b }
        r10.<init>(r4, r6, r2, r7);	 Catch:{ all -> 0x012b }
        r0.f16552d = r10;	 Catch:{ all -> 0x012b }
        m20195a(r3);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r0.m20196a(r9, r1);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r10 = "%s/%s.dex";	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3 = new java.lang.Object[r5];	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3[r8] = r9;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3[r11] = r1;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r8 = java.lang.String.format(r10, r3);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        m20197a(r8);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r8 = com.google.android.gms.internal.alo.br;	 Catch:{ zzdj -> 0x0165 }
        r9 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ zzdj -> 0x0165 }
        r8 = r9.m19334a(r8);	 Catch:{ zzdj -> 0x0165 }
        r8 = (java.lang.Boolean) r8;	 Catch:{ zzdj -> 0x0165 }
        r8 = r8.booleanValue();	 Catch:{ zzdj -> 0x0165 }
        if (r8 == 0) goto L_0x0121;	 Catch:{ zzdj -> 0x0165 }
    L_0x0101:
        r8 = r0.f16567s;	 Catch:{ zzdj -> 0x0165 }
        if (r8 == 0) goto L_0x0106;	 Catch:{ zzdj -> 0x0165 }
    L_0x0105:
        goto L_0x0121;	 Catch:{ zzdj -> 0x0165 }
    L_0x0106:
        r8 = new android.content.IntentFilter;	 Catch:{ zzdj -> 0x0165 }
        r8.<init>();	 Catch:{ zzdj -> 0x0165 }
        r9 = "android.intent.action.USER_PRESENT";	 Catch:{ zzdj -> 0x0165 }
        r8.addAction(r9);	 Catch:{ zzdj -> 0x0165 }
        r9 = "android.intent.action.SCREEN_OFF";	 Catch:{ zzdj -> 0x0165 }
        r8.addAction(r9);	 Catch:{ zzdj -> 0x0165 }
        r9 = r0.f16550a;	 Catch:{ zzdj -> 0x0165 }
        r10 = new com.google.android.gms.internal.ub$a;	 Catch:{ zzdj -> 0x0165 }
        r10.<init>();	 Catch:{ zzdj -> 0x0165 }
        r9.registerReceiver(r10, r8);	 Catch:{ zzdj -> 0x0165 }
        r0.f16567s = r11;	 Catch:{ zzdj -> 0x0165 }
    L_0x0121:
        r8 = new com.google.android.gms.internal.sp;	 Catch:{ zzdj -> 0x0165 }
        r8.<init>(r0);	 Catch:{ zzdj -> 0x0165 }
        r0.f16561m = r8;	 Catch:{ zzdj -> 0x0165 }
        r0.f16565q = r11;	 Catch:{ zzdj -> 0x0165 }
        return r0;
    L_0x012b:
        r10 = move-exception;
        m20195a(r3);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r0.m20196a(r9, r1);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r2 = "%s/%s.dex";	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3 = new java.lang.Object[r5];	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3[r8] = r9;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3[r11] = r1;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r8 = java.lang.String.format(r2, r3);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        m20197a(r8);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        throw r10;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
    L_0x0142:
        r8 = move-exception;
        r9 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r9.<init>(r8);	 Catch:{ zzdj -> 0x0165 }
        throw r9;	 Catch:{ zzdj -> 0x0165 }
    L_0x0149:
        r8 = move-exception;	 Catch:{ zzdj -> 0x0165 }
        r9 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r9.<init>(r8);	 Catch:{ zzdj -> 0x0165 }
        throw r9;	 Catch:{ zzdj -> 0x0165 }
    L_0x0150:
        r8 = move-exception;	 Catch:{ zzdj -> 0x0165 }
        r9 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r9.<init>(r8);	 Catch:{ zzdj -> 0x0165 }
        throw r9;	 Catch:{ zzdj -> 0x0165 }
    L_0x0157:
        r8 = move-exception;	 Catch:{ zzdj -> 0x0165 }
        r9 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r9.<init>(r8);	 Catch:{ zzdj -> 0x0165 }
        throw r9;	 Catch:{ zzdj -> 0x0165 }
    L_0x015e:
        r8 = move-exception;	 Catch:{ zzdj -> 0x0165 }
        r9 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r9.<init>(r8);	 Catch:{ zzdj -> 0x0165 }
        throw r9;	 Catch:{ zzdj -> 0x0165 }
    L_0x0165:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ub.a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ub");
    }

    /* renamed from: a */
    private static void m20195a(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(f16549b, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    /* renamed from: a */
    private final void m20196a(java.io.File r8, java.lang.String r9) {
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
        r0 = new java.io.File;
        r1 = "%s/%s.tmp";
        r2 = 2;
        r3 = new java.lang.Object[r2];
        r4 = 0;
        r3[r4] = r8;
        r5 = 1;
        r3[r5] = r9;
        r1 = java.lang.String.format(r1, r3);
        r0.<init>(r1);
        r1 = r0.exists();
        if (r1 == 0) goto L_0x001b;
    L_0x001a:
        return;
    L_0x001b:
        r1 = new java.io.File;
        r3 = "%s/%s.dex";
        r2 = new java.lang.Object[r2];
        r2[r4] = r8;
        r2[r5] = r9;
        r8 = java.lang.String.format(r3, r2);
        r1.<init>(r8);
        r8 = r1.exists();
        if (r8 != 0) goto L_0x0033;
    L_0x0032:
        return;
    L_0x0033:
        r2 = r1.length();
        r5 = 0;
        r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r8 > 0) goto L_0x003e;
    L_0x003d:
        return;
    L_0x003e:
        r8 = (int) r2;
        r8 = new byte[r8];
        r2 = 0;
        r3 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00af, IOException -> 0x00af, IOException -> 0x00af, all -> 0x009f }
        r3.<init>(r1);	 Catch:{ IOException -> 0x00af, IOException -> 0x00af, IOException -> 0x00af, all -> 0x009f }
        r5 = r3.read(r8);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        if (r5 > 0) goto L_0x0054;
    L_0x004d:
        r3.close();	 Catch:{ IOException -> 0x0050 }
    L_0x0050:
        m20195a(r1);
        return;
    L_0x0054:
        r5 = new com.google.android.gms.internal.ob;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.<init>();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r6 = r6.getBytes();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.f27037d = r6;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r9 = r9.getBytes();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.f27036c = r9;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r9 = r7.f16553e;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r6 = r7.f16554f;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = r9.m20185a(r6, r8);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = r8.getBytes();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.f27034a = r8;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = com.google.android.gms.internal.pp.m20143a(r8);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.f27035b = r8;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r0.createNewFile();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8.<init>(r0);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r9 = com.google.android.gms.internal.aee.m19058a(r5);	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r0 = r9.length;	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r8.write(r9, r4, r0);	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r8.close();	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r3.close();	 Catch:{ IOException -> 0x0091 }
    L_0x0091:
        r8.close();	 Catch:{ IOException -> 0x0094 }
    L_0x0094:
        m20195a(r1);
        return;
    L_0x0098:
        r9 = move-exception;
        r2 = r8;
        goto L_0x00a1;
    L_0x009b:
        r2 = r8;
        goto L_0x00b0;
    L_0x009d:
        r9 = move-exception;
        goto L_0x00a1;
    L_0x009f:
        r9 = move-exception;
        r3 = r2;
    L_0x00a1:
        if (r3 == 0) goto L_0x00a6;
    L_0x00a3:
        r3.close();	 Catch:{ IOException -> 0x00a6 }
    L_0x00a6:
        if (r2 == 0) goto L_0x00ab;
    L_0x00a8:
        r2.close();	 Catch:{ IOException -> 0x00ab }
    L_0x00ab:
        m20195a(r1);
        throw r9;
    L_0x00af:
        r3 = r2;
    L_0x00b0:
        if (r3 == 0) goto L_0x00b5;
    L_0x00b2:
        r3.close();	 Catch:{ IOException -> 0x00b5 }
    L_0x00b5:
        if (r2 == 0) goto L_0x00ba;
    L_0x00b7:
        r2.close();	 Catch:{ IOException -> 0x00ba }
    L_0x00ba:
        m20195a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ub.a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m20197a(String str) {
        m20195a(new File(str));
    }

    /* renamed from: b */
    private static boolean m20200b(int i, nx nxVar) {
        if (i < 4) {
            if (nxVar == null) {
                return true;
            }
            if (((Boolean) aja.m19221f().m19334a(alo.bC)).booleanValue() && (nxVar.f26988n == null || nxVar.f26988n.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) aja.m19221f().m19334a(alo.bD)).booleanValue() && (nxVar.f26973W == null || nxVar.f26973W.f27038a == null || nxVar.f26973W.f27038a.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m20201b(java.io.File r10, java.lang.String r11) {
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
        r9 = this;
        r0 = new java.io.File;
        r1 = "%s/%s.tmp";
        r2 = 2;
        r3 = new java.lang.Object[r2];
        r4 = 0;
        r3[r4] = r10;
        r5 = 1;
        r3[r5] = r11;
        r1 = java.lang.String.format(r1, r3);
        r0.<init>(r1);
        r1 = r0.exists();
        if (r1 != 0) goto L_0x001b;
    L_0x001a:
        return r4;
    L_0x001b:
        r1 = new java.io.File;
        r3 = "%s/%s.dex";
        r2 = new java.lang.Object[r2];
        r2[r4] = r10;
        r2[r5] = r11;
        r10 = java.lang.String.format(r3, r2);
        r1.<init>(r10);
        r10 = r1.exists();
        if (r10 == 0) goto L_0x0033;
    L_0x0032:
        return r4;
    L_0x0033:
        r10 = 0;
        r2 = r0.length();	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r6 = 0;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        if (r8 > 0) goto L_0x0042;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
    L_0x003e:
        m20195a(r0);	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        return r4;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
    L_0x0042:
        r2 = (int) r2;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r2 = new byte[r2];	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r3 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r3.<init>(r0);	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r6 = r3.read(r2);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r6 > 0) goto L_0x005e;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0050:
        r11 = f16549b;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r1 = "Cannot read the cache data.";	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        android.util.Log.d(r11, r1);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        m20195a(r0);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r3.close();	 Catch:{ IOException -> 0x005d }
    L_0x005d:
        return r4;
    L_0x005e:
        r6 = new com.google.android.gms.internal.ob;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6.<init>();	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r2 = com.google.android.gms.internal.aee.m19056a(r6, r2);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r2 = (com.google.android.gms.internal.ob) r2;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = new java.lang.String;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r7 = r2.f27036c;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6.<init>(r7);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = r11.equals(r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r11 == 0) goto L_0x00ba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0076:
        r11 = r2.f27035b;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = r2.f27034a;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = com.google.android.gms.internal.pp.m20143a(r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r11 == 0) goto L_0x00ba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0084:
        r11 = r2.f27037d;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = r6.getBytes();	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r11 != 0) goto L_0x0093;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0092:
        goto L_0x00ba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0093:
        r11 = r9.f16553e;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r0 = r9.f16554f;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = new java.lang.String;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r2 = r2.f27034a;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6.<init>(r2);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = r11.m20187a(r0, r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r1.createNewFile();	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r10 = r11.length;	 Catch:{ IOException -> 0x00b8, IOException -> 0x00b8, IOException -> 0x00b8, all -> 0x00b5 }
        r0.write(r11, r4, r10);	 Catch:{ IOException -> 0x00b8, IOException -> 0x00b8, IOException -> 0x00b8, all -> 0x00b5 }
        r3.close();	 Catch:{ IOException -> 0x00b1 }
    L_0x00b1:
        r0.close();	 Catch:{ IOException -> 0x00b4 }
    L_0x00b4:
        return r5;
    L_0x00b5:
        r11 = move-exception;
        r10 = r0;
        goto L_0x00c5;
    L_0x00b8:
        r10 = r0;
        goto L_0x00d1;
    L_0x00ba:
        m20195a(r0);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r3.close();	 Catch:{ IOException -> 0x00c0 }
    L_0x00c0:
        return r4;
    L_0x00c1:
        r11 = move-exception;
        goto L_0x00c5;
    L_0x00c3:
        r11 = move-exception;
        r3 = r10;
    L_0x00c5:
        if (r3 == 0) goto L_0x00ca;
    L_0x00c7:
        r3.close();	 Catch:{ IOException -> 0x00ca }
    L_0x00ca:
        if (r10 == 0) goto L_0x00cf;
    L_0x00cc:
        r10.close();	 Catch:{ IOException -> 0x00cf }
    L_0x00cf:
        throw r11;
    L_0x00d0:
        r3 = r10;
    L_0x00d1:
        if (r3 == 0) goto L_0x00d6;
    L_0x00d3:
        r3.close();	 Catch:{ IOException -> 0x00d6 }
    L_0x00d6:
        if (r10 == 0) goto L_0x00db;
    L_0x00d8:
        r10.close();	 Catch:{ IOException -> 0x00db }
    L_0x00db:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ub.b(java.io.File, java.lang.String):boolean");
    }

    /* renamed from: o */
    private final void m20202o() {
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
        r2 = this;
        r0 = r2.f16555g;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        if (r0 != 0) goto L_0x0014;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
    L_0x0004:
        r0 = r2.f16558j;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        if (r0 == 0) goto L_0x0014;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
    L_0x0008:
        r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r1 = r2.f16550a;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r0.<init>(r1);	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r0.start();	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r2.f16555g = r0;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = 0;
        r2.f16555g = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ub.o():void");
    }

    @android.support.annotation.VisibleForTesting
    /* renamed from: p */
    private final com.google.android.gms.internal.nx m20203p() {
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
        r3 = this;
        r0 = r3.f16550a;	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.getPackageManager();	 Catch:{ Throwable -> 0x0024 }
        r1 = r3.f16550a;	 Catch:{ Throwable -> 0x0024 }
        r1 = r1.getPackageName();	 Catch:{ Throwable -> 0x0024 }
        r2 = 0;	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.getPackageInfo(r1, r2);	 Catch:{ Throwable -> 0x0024 }
        r1 = r3.f16550a;	 Catch:{ Throwable -> 0x0024 }
        r2 = r3.f16550a;	 Catch:{ Throwable -> 0x0024 }
        r2 = r2.getPackageName();	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.versionCode;	 Catch:{ Throwable -> 0x0024 }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ Throwable -> 0x0024 }
        r0 = com.google.android.gms.internal.pz.m20151a(r1, r2, r0);	 Catch:{ Throwable -> 0x0024 }
        return r0;
    L_0x0024:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ub.p():com.google.android.gms.internal.nx");
    }

    /* renamed from: a */
    public final Context m20204a() {
        return this.f16550a;
    }

    /* renamed from: a */
    public final Method m20205a(String str, String str2) {
        aar aar = (aar) this.f16564p.get(new Pair(str, str2));
        return aar == null ? null : aar.m18796a();
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m20206a(int i, boolean z) {
        if (this.f16563o) {
            Future submit = this.f16551c.submit(new ud(this, i, z));
            if (i == 0) {
                this.f16560l = submit;
            }
        }
    }

    /* renamed from: a */
    public final boolean m20207a(String str, String str2, Class<?>... clsArr) {
        if (this.f16564p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f16564p.put(new Pair(str, str2), new aar(this, str, str2, clsArr));
        return true;
    }

    @android.support.annotation.VisibleForTesting
    /* renamed from: b */
    final com.google.android.gms.internal.nx m20208b(int r1, boolean r2) {
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
        r0 = this;
        if (r1 <= 0) goto L_0x000a;
    L_0x0002:
        if (r2 == 0) goto L_0x000a;
    L_0x0004:
        r1 = r1 * 1000;
        r1 = (long) r1;
        java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x000a }
    L_0x000a:
        r1 = r0.m20203p();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ub.b(int, boolean):com.google.android.gms.internal.nx");
    }

    /* renamed from: b */
    public final boolean m20209b() {
        return this.f16565q;
    }

    /* renamed from: c */
    public final ExecutorService m20210c() {
        return this.f16551c;
    }

    /* renamed from: d */
    public final DexClassLoader m20211d() {
        return this.f16552d;
    }

    /* renamed from: e */
    public final tc m20212e() {
        return this.f16553e;
    }

    /* renamed from: f */
    public final byte[] m20213f() {
        return this.f16554f;
    }

    /* renamed from: g */
    public final boolean m20214g() {
        return this.f16562n;
    }

    /* renamed from: h */
    public final sp m20215h() {
        return this.f16561m;
    }

    /* renamed from: i */
    public final boolean m20216i() {
        return this.f16563o;
    }

    /* renamed from: j */
    public final boolean m20217j() {
        return this.f16566r;
    }

    /* renamed from: k */
    public final nx m20218k() {
        return this.f16559k;
    }

    /* renamed from: l */
    public final Future m20219l() {
        return this.f16560l;
    }

    /* renamed from: m */
    public final com.google.android.gms.ads.identifier.AdvertisingIdClient m20220m() {
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
        r5 = this;
        r0 = r5.f16556h;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r5.f16555g;
        if (r0 == 0) goto L_0x000d;
    L_0x000a:
        r0 = r5.f16555g;
        return r0;
    L_0x000d:
        r0 = r5.f16557i;
        if (r0 == 0) goto L_0x0023;
    L_0x0011:
        r0 = r5.f16557i;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r2 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r0.get(r2, r4);	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r5.f16557i = r1;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        goto L_0x0023;
    L_0x001d:
        r0 = r5.f16557i;
        r1 = 1;
        r0.cancel(r1);
    L_0x0023:
        r0 = r5.f16555g;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ub.m():com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    /* renamed from: n */
    public final int m20221n() {
        return this.f16561m != null ? sp.m20170a() : Integer.MIN_VALUE;
    }
}
