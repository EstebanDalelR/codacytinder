package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2521f;
import com.google.android.gms.common.util.C2526k;
import java.util.Locale;

public final class bc {
    /* renamed from: A */
    private String f15871A;
    /* renamed from: B */
    private boolean f15872B;
    /* renamed from: a */
    private int f15873a;
    /* renamed from: b */
    private boolean f15874b;
    /* renamed from: c */
    private boolean f15875c;
    /* renamed from: d */
    private int f15876d;
    /* renamed from: e */
    private int f15877e;
    /* renamed from: f */
    private int f15878f;
    /* renamed from: g */
    private String f15879g;
    /* renamed from: h */
    private int f15880h;
    /* renamed from: i */
    private int f15881i;
    /* renamed from: j */
    private int f15882j;
    /* renamed from: k */
    private boolean f15883k;
    /* renamed from: l */
    private int f15884l;
    /* renamed from: m */
    private double f15885m;
    /* renamed from: n */
    private boolean f15886n;
    /* renamed from: o */
    private String f15887o;
    /* renamed from: p */
    private String f15888p;
    /* renamed from: q */
    private boolean f15889q;
    /* renamed from: r */
    private boolean f15890r;
    /* renamed from: s */
    private String f15891s;
    /* renamed from: t */
    private boolean f15892t;
    /* renamed from: u */
    private boolean f15893u;
    /* renamed from: v */
    private String f15894v;
    /* renamed from: w */
    private String f15895w;
    /* renamed from: x */
    private float f15896x;
    /* renamed from: y */
    private int f15897y;
    /* renamed from: z */
    private int f15898z;

    public bc(Context context) {
        PackageManager packageManager = context.getPackageManager();
        m19557a(context);
        m19559b(context);
        m19560c(context);
        Locale locale = Locale.getDefault();
        boolean z = false;
        this.f15889q = m19555a(packageManager, "geo:0,0?q=donuts") != null;
        if (m19555a(packageManager, "http://www.google.com") != null) {
            z = true;
        }
        this.f15890r = z;
        this.f15891s = locale.getCountry();
        aja.m19216a();
        this.f15892t = hn.m19870a();
        this.f15893u = C2521f.c(context);
        this.f15894v = locale.getLanguage();
        this.f15895w = m19558b(context, packageManager);
        this.f15871A = m19556a(context, packageManager);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.f15896x = displayMetrics.density;
                this.f15897y = displayMetrics.widthPixels;
                this.f15898z = displayMetrics.heightPixels;
            }
        }
    }

    public bc(Context context, bb bbVar) {
        context.getPackageManager();
        m19557a(context);
        m19559b(context);
        m19560c(context);
        this.f15887o = Build.FINGERPRINT;
        this.f15888p = Build.DEVICE;
        boolean z = C2526k.a() && amj.m27136a(context);
        this.f15872B = z;
        this.f15889q = bbVar.f15846b;
        this.f15890r = bbVar.f15847c;
        this.f15891s = bbVar.f15849e;
        this.f15892t = bbVar.f15850f;
        this.f15893u = bbVar.f15851g;
        this.f15894v = bbVar.f15854j;
        this.f15895w = bbVar.f15855k;
        this.f15871A = bbVar.f15856l;
        this.f15896x = bbVar.f15863s;
        this.f15897y = bbVar.f15864t;
        this.f15898z = bbVar.f15865u;
    }

    /* renamed from: a */
    private static ResolveInfo m19555a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            ar.i().m27296a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: a */
    private static java.lang.String m19556a(android.content.Context r3, android.content.pm.PackageManager r4) {
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
        r4 = 0;
        r3 = com.google.android.gms.internal.pl.m20131a(r3);	 Catch:{ Exception -> 0x0032 }
        r0 = "com.android.vending";	 Catch:{ Exception -> 0x0032 }
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x0032 }
        r3 = r3.m20129b(r0, r1);	 Catch:{ Exception -> 0x0032 }
        if (r3 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x0032 }
    L_0x000f:
        r0 = r3.versionCode;	 Catch:{ Exception -> 0x0032 }
        r3 = r3.packageName;	 Catch:{ Exception -> 0x0032 }
        r1 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x0032 }
        r1 = r1.length();	 Catch:{ Exception -> 0x0032 }
        r1 = r1 + 12;	 Catch:{ Exception -> 0x0032 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0032 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0032 }
        r2.append(r0);	 Catch:{ Exception -> 0x0032 }
        r0 = ".";	 Catch:{ Exception -> 0x0032 }
        r2.append(r0);	 Catch:{ Exception -> 0x0032 }
        r2.append(r3);	 Catch:{ Exception -> 0x0032 }
        r3 = r2.toString();	 Catch:{ Exception -> 0x0032 }
        return r3;
    L_0x0032:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bc.a(android.content.Context, android.content.pm.PackageManager):java.lang.String");
    }

    /* renamed from: a */
    private final void m19557a(Context context) {
        ar.e();
        AudioManager i = fk.m19737i(context);
        if (i != null) {
            try {
                this.f15873a = i.getMode();
                this.f15874b = i.isMusicActive();
                this.f15875c = i.isSpeakerphoneOn();
                this.f15876d = i.getStreamVolume(3);
                this.f15877e = i.getRingerMode();
                this.f15878f = i.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                ar.i().m27296a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f15873a = -2;
        this.f15874b = false;
        this.f15875c = false;
        this.f15876d = 0;
        this.f15877e = 0;
        this.f15878f = 0;
    }

    /* renamed from: b */
    private static java.lang.String m19558b(android.content.Context r3, android.content.pm.PackageManager r4) {
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
        r0 = "market://details?id=com.google.android.gms.ads";
        r4 = m19555a(r4, r0);
        r0 = 0;
        if (r4 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r4 = r4.activityInfo;
        if (r4 != 0) goto L_0x000f;
    L_0x000e:
        return r0;
    L_0x000f:
        r3 = com.google.android.gms.internal.pl.m20131a(r3);	 Catch:{ NameNotFoundException -> 0x003f }
        r1 = r4.packageName;	 Catch:{ NameNotFoundException -> 0x003f }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x003f }
        r3 = r3.m20129b(r1, r2);	 Catch:{ NameNotFoundException -> 0x003f }
        if (r3 == 0) goto L_0x003f;	 Catch:{ NameNotFoundException -> 0x003f }
    L_0x001c:
        r3 = r3.versionCode;	 Catch:{ NameNotFoundException -> 0x003f }
        r4 = r4.packageName;	 Catch:{ NameNotFoundException -> 0x003f }
        r1 = java.lang.String.valueOf(r4);	 Catch:{ NameNotFoundException -> 0x003f }
        r1 = r1.length();	 Catch:{ NameNotFoundException -> 0x003f }
        r1 = r1 + 12;	 Catch:{ NameNotFoundException -> 0x003f }
        r2 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x003f }
        r2.<init>(r1);	 Catch:{ NameNotFoundException -> 0x003f }
        r2.append(r3);	 Catch:{ NameNotFoundException -> 0x003f }
        r3 = ".";	 Catch:{ NameNotFoundException -> 0x003f }
        r2.append(r3);	 Catch:{ NameNotFoundException -> 0x003f }
        r2.append(r4);	 Catch:{ NameNotFoundException -> 0x003f }
        r3 = r2.toString();	 Catch:{ NameNotFoundException -> 0x003f }
        return r3;
    L_0x003f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bc.b(android.content.Context, android.content.pm.PackageManager):java.lang.String");
    }

    @TargetApi(16)
    /* renamed from: b */
    private final void m19559b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f15879g = telephonyManager.getNetworkOperator();
        this.f15881i = telephonyManager.getNetworkType();
        this.f15882j = telephonyManager.getPhoneType();
        this.f15880h = -2;
        this.f15883k = false;
        this.f15884l = -1;
        ar.e();
        if (fk.m19706a(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f15880h = activeNetworkInfo.getType();
                this.f15884l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f15880h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.f15883k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: c */
    private final void m19560c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f15885m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f15886n = z;
            return;
        }
        this.f15885m = -1.0d;
        this.f15886n = false;
    }

    /* renamed from: a */
    public final bb m19561a() {
        int i = this.f15873a;
        boolean z = this.f15889q;
        boolean z2 = this.f15890r;
        String str = this.f15879g;
        String str2 = this.f15891s;
        boolean z3 = this.f15892t;
        boolean z4 = this.f15893u;
        boolean z5 = this.f15874b;
        boolean z6 = this.f15875c;
        String str3 = this.f15894v;
        String str4 = this.f15895w;
        String str5 = this.f15871A;
        int i2 = this.f15876d;
        int i3 = this.f15880h;
        int i4 = this.f15881i;
        int i5 = i3;
        int i6 = this.f15882j;
        int i7 = this.f15877e;
        int i8 = this.f15878f;
        float f = this.f15896x;
        int i9 = this.f15897y;
        int i10 = i2;
        int i11 = this.f15898z;
        double d = this.f15885m;
        boolean z7 = this.f15886n;
        boolean z8 = this.f15883k;
        boolean z9 = z7;
        boolean z10 = z8;
        return new bb(i, z, z2, str, str2, z3, z4, z5, z6, str3, str4, str5, i10, i5, i4, i6, i7, i8, f, i9, i11, d, z9, z10, this.f15884l, this.f15887o, this.f15872B, this.f15888p);
    }
}
