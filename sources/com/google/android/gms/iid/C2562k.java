package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.gms.common.util.C2526k;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.google.android.gms.iid.k */
public final class C2562k {
    /* renamed from: a */
    private static String f7782a = null;
    /* renamed from: b */
    private static boolean f7783b = false;
    /* renamed from: c */
    private static int f7784c;
    /* renamed from: d */
    private static int f7785d;
    /* renamed from: e */
    private static int f7786e;
    /* renamed from: f */
    private static BroadcastReceiver f7787f;
    /* renamed from: g */
    private Context f7788g;
    /* renamed from: h */
    private Map<String, Object> f7789h = new HashMap();
    /* renamed from: i */
    private Messenger f7790i;
    /* renamed from: j */
    private Messenger f7791j;
    /* renamed from: k */
    private MessengerCompat f7792k;
    /* renamed from: l */
    private PendingIntent f7793l;
    /* renamed from: m */
    private long f7794m;
    /* renamed from: n */
    private long f7795n;
    /* renamed from: o */
    private int f7796o;
    /* renamed from: p */
    private int f7797p;
    /* renamed from: q */
    private long f7798q;

    public C2562k(Context context) {
        this.f7788g = context;
    }

    /* renamed from: a */
    public static String m9311a(Context context) {
        if (f7782a != null) {
            return f7782a;
        }
        f7784c = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        if (!C2526k.m9218i()) {
            Object obj;
            for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
                if (C2562k.m9320a(packageManager, resolveInfo.serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                    f7783b = false;
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj != null) {
                return f7782a;
            }
        }
        if (C2562k.m9318a(packageManager)) {
            return f7782a;
        }
        Log.w("InstanceID/Rpc", "Failed to resolve IID implementation package, falling back");
        if (C2562k.m9319a(packageManager, "com.google.android.gms")) {
            f7783b = C2526k.m9218i();
            return f7782a;
        } else if (C2526k.m9216g() || !C2562k.m9319a(packageManager, "com.google.android.gsf")) {
            Log.w("InstanceID/Rpc", "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            f7783b = false;
            return f7782a;
        }
    }

    /* renamed from: a */
    static String m9312a(Intent intent) throws IOException {
        if (intent == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        intent.getLongExtra("Retry-After", 0);
        if (stringExtra != null) {
            return stringExtra;
        }
        stringExtra = intent.getStringExtra("error");
        if (stringExtra != null) {
            throw new IOException(stringExtra);
        }
        String valueOf = String.valueOf(intent.getExtras());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
        stringBuilder.append("Unexpected response from GCM ");
        stringBuilder.append(valueOf);
        Log.w("InstanceID/Rpc", stringBuilder.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: a */
    private static String m9313a(KeyPair keyPair, String... strArr) {
        Throwable e;
        String str;
        String str2;
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes("UTF-8");
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature instance = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                instance.initSign(privateKey);
                instance.update(bytes);
                return C2553a.m9294a(instance.sign());
            } catch (GeneralSecurityException e2) {
                e = e2;
                str = "InstanceID/Rpc";
                str2 = "Unable to sign registration request";
                Log.e(str, str2, e);
                return null;
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            str = "InstanceID/Rpc";
            str2 = "Unable to encode string";
            Log.e(str, str2, e);
            return null;
        }
    }

    /* renamed from: a */
    private final void m9314a() {
        if (this.f7790i == null) {
            C2562k.m9311a(this.f7788g);
            this.f7790i = new Messenger(new C2563l(this, Looper.getMainLooper()));
        }
    }

    /* renamed from: a */
    private final void m9315a(Object obj) {
        synchronized (getClass()) {
            for (String str : this.f7789h.keySet()) {
                Object obj2 = this.f7789h.get(str);
                this.f7789h.put(str, obj);
                C2562k.m9316a(obj2, obj);
            }
        }
    }

    /* renamed from: a */
    private static void m9316a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Failed to send response ");
                stringBuilder.append(valueOf);
                Log.w("InstanceID/Rpc", stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    private final void m9317a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.f7789h.get(str);
            this.f7789h.put(str, obj);
            C2562k.m9316a(obj2, obj);
        }
    }

    /* renamed from: a */
    private static boolean m9318a(PackageManager packageManager) {
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0)) {
            if (C2562k.m9320a(packageManager, resolveInfo.activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                f7783b = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m9319a(android.content.pm.PackageManager r1, java.lang.String r2) {
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
        r1 = r1.getApplicationInfo(r2, r0);	 Catch:{ NameNotFoundException -> 0x000f }
        r2 = r1.packageName;	 Catch:{ NameNotFoundException -> 0x000f }
        f7782a = r2;	 Catch:{ NameNotFoundException -> 0x000f }
        r1 = r1.uid;	 Catch:{ NameNotFoundException -> 0x000f }
        f7785d = r1;	 Catch:{ NameNotFoundException -> 0x000f }
        r1 = 1;
        return r1;
    L_0x000f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.k.a(android.content.pm.PackageManager, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static boolean m9320a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return C2562k.m9319a(packageManager, str);
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 56) + String.valueOf(str2).length());
        stringBuilder.append("Possible malicious package ");
        stringBuilder.append(str);
        stringBuilder.append(" declares ");
        stringBuilder.append(str2);
        stringBuilder.append(" without permission");
        Log.w("InstanceID/Rpc", stringBuilder.toString());
        return false;
    }

    /* renamed from: b */
    private static int m9321b(android.content.Context r2) {
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
        r0 = r2.getPackageManager();
        r2 = com.google.android.gms.iid.C2562k.m9311a(r2);	 Catch:{ NameNotFoundException -> 0x0010 }
        r1 = 0;	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r0.getPackageInfo(r2, r1);	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0010 }
        return r2;
    L_0x0010:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.k.b(android.content.Context):int");
    }

    /* renamed from: b */
    private final android.content.Intent m9322b(android.os.Bundle r10, java.security.KeyPair r11) throws java.io.IOException {
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
        r0 = new android.os.ConditionVariable;
        r0.<init>();
        r1 = com.google.android.gms.iid.C2562k.m9323b();
        r2 = r9.getClass();
        monitor-enter(r2);
        r3 = r9.f7789h;	 Catch:{ all -> 0x0278 }
        r3.put(r1, r0);	 Catch:{ all -> 0x0278 }
        monitor-exit(r2);	 Catch:{ all -> 0x0278 }
        r2 = android.os.SystemClock.elapsedRealtime();
        r4 = r9.f7798q;
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x0054;
    L_0x0020:
        r4 = r9.f7798q;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 > 0) goto L_0x0054;
    L_0x0026:
        r10 = "InstanceID/Rpc";
        r0 = r9.f7798q;
        r4 = r0 - r2;
        r11 = r9.f7797p;
        r0 = 78;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Backoff mode, next request attempt: ";
        r1.append(r0);
        r1.append(r4);
        r0 = " interval: ";
        r1.append(r0);
        r1.append(r11);
        r11 = r1.toString();
        android.util.Log.w(r10, r11);
        r10 = new java.io.IOException;
        r11 = "RETRY_LATER";
        r10.<init>(r11);
        throw r10;
    L_0x0054:
        r9.m9314a();
        r2 = f7782a;
        if (r2 != 0) goto L_0x0063;
    L_0x005b:
        r10 = new java.io.IOException;
        r11 = "MISSING_INSTANCEID_SERVICE";
        r10.<init>(r11);
        throw r10;
    L_0x0063:
        r2 = android.os.SystemClock.elapsedRealtime();
        r9.f7794m = r2;
        r2 = new android.content.Intent;
        r3 = f7783b;
        if (r3 == 0) goto L_0x0072;
    L_0x006f:
        r3 = "com.google.iid.TOKEN_REQUEST";
        goto L_0x0074;
    L_0x0072:
        r3 = "com.google.android.c2dm.intent.REGISTER";
    L_0x0074:
        r2.<init>(r3);
        r3 = f7782a;
        r2.setPackage(r3);
        r3 = r9.f7788g;
        r3 = com.google.android.gms.iid.C2562k.m9321b(r3);
        r4 = "gmsv";
        r3 = java.lang.Integer.toString(r3);
        r10.putString(r4, r3);
        r3 = "osv";
        r4 = android.os.Build.VERSION.SDK_INT;
        r4 = java.lang.Integer.toString(r4);
        r10.putString(r3, r4);
        r3 = "app_ver";
        r4 = r9.f7788g;
        r4 = com.google.android.gms.iid.C2553a.m9291a(r4);
        r4 = java.lang.Integer.toString(r4);
        r10.putString(r3, r4);
        r3 = "app_ver_name";
        r4 = r9.f7788g;
        r4 = com.google.android.gms.iid.C2553a.m9295b(r4);
        r10.putString(r3, r4);
        r3 = "cliv";
        r4 = "iid-11910000";
        r10.putString(r3, r4);
        r3 = "appid";
        r4 = com.google.android.gms.iid.C2553a.m9293a(r11);
        r10.putString(r3, r4);
        r3 = r11.getPublic();
        r3 = r3.getEncoded();
        r3 = com.google.android.gms.iid.C2553a.m9294a(r3);
        r4 = "pub2";
        r10.putString(r4, r3);
        r4 = "sig";
        r5 = 2;
        r5 = new java.lang.String[r5];
        r6 = 0;
        r7 = r9.f7788g;
        r7 = r7.getPackageName();
        r5[r6] = r7;
        r6 = 1;
        r5[r6] = r3;
        r11 = com.google.android.gms.iid.C2562k.m9313a(r11, r5);
        r10.putString(r4, r11);
        r2.putExtras(r10);
        r9.m9324c(r2);
        r10 = android.os.SystemClock.elapsedRealtime();
        r9.f7794m = r10;
        r10 = "kid";
        r11 = java.lang.String.valueOf(r1);
        r11 = r11.length();
        r11 = r11 + 5;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r11);
        r11 = "|ID|";
        r3.append(r11);
        r3.append(r1);
        r11 = "|";
        r3.append(r11);
        r11 = r3.toString();
        r2.putExtra(r10, r11);
        r10 = "X-kid";
        r11 = java.lang.String.valueOf(r1);
        r11 = r11.length();
        r11 = r11 + 5;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r11);
        r11 = "|ID|";
        r3.append(r11);
        r3.append(r1);
        r11 = "|";
        r3.append(r11);
        r11 = r3.toString();
        r2.putExtra(r10, r11);
        r10 = "com.google.android.gsf";
        r11 = f7782a;
        r10 = r10.equals(r11);
        r11 = "useGsf";
        r11 = r2.getStringExtra(r11);
        if (r11 == 0) goto L_0x0155;
    L_0x014f:
        r10 = "1";
        r10 = r10.equals(r11);
    L_0x0155:
        r11 = "InstanceID/Rpc";
        r3 = 3;
        r11 = android.util.Log.isLoggable(r11, r3);
        if (r11 == 0) goto L_0x0186;
    L_0x015e:
        r11 = "InstanceID/Rpc";
        r4 = r2.getExtras();
        r4 = java.lang.String.valueOf(r4);
        r5 = java.lang.String.valueOf(r4);
        r5 = r5.length();
        r5 = r5 + 8;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "Sending ";
        r6.append(r5);
        r6.append(r4);
        r4 = r6.toString();
        android.util.Log.d(r11, r4);
    L_0x0186:
        r11 = r9.f7791j;
        if (r11 == 0) goto L_0x01ad;
    L_0x018a:
        r11 = "google.messenger";
        r4 = r9.f7790i;
        r2.putExtra(r11, r4);
        r11 = android.os.Message.obtain();
        r11.obj = r2;
        r4 = r9.f7791j;	 Catch:{ RemoteException -> 0x019e }
        r4.send(r11);	 Catch:{ RemoteException -> 0x019e }
        goto L_0x0225;
    L_0x019e:
        r11 = "InstanceID/Rpc";
        r11 = android.util.Log.isLoggable(r11, r3);
        if (r11 == 0) goto L_0x01ad;
    L_0x01a6:
        r11 = "InstanceID/Rpc";
        r4 = "Messenger failed, fallback to startService";
        android.util.Log.d(r11, r4);
    L_0x01ad:
        if (r10 == 0) goto L_0x01e9;
    L_0x01af:
        monitor-enter(r9);
        r10 = f7787f;	 Catch:{ all -> 0x01e6 }
        if (r10 != 0) goto L_0x01e4;	 Catch:{ all -> 0x01e6 }
    L_0x01b4:
        r10 = new com.google.android.gms.iid.m;	 Catch:{ all -> 0x01e6 }
        r10.<init>(r9);	 Catch:{ all -> 0x01e6 }
        f7787f = r10;	 Catch:{ all -> 0x01e6 }
        r10 = "InstanceID/Rpc";	 Catch:{ all -> 0x01e6 }
        r10 = android.util.Log.isLoggable(r10, r3);	 Catch:{ all -> 0x01e6 }
        if (r10 == 0) goto L_0x01ca;	 Catch:{ all -> 0x01e6 }
    L_0x01c3:
        r10 = "InstanceID/Rpc";	 Catch:{ all -> 0x01e6 }
        r11 = "Registered GSF callback receiver";	 Catch:{ all -> 0x01e6 }
        android.util.Log.d(r10, r11);	 Catch:{ all -> 0x01e6 }
    L_0x01ca:
        r10 = new android.content.IntentFilter;	 Catch:{ all -> 0x01e6 }
        r11 = "com.google.android.c2dm.intent.REGISTRATION";	 Catch:{ all -> 0x01e6 }
        r10.<init>(r11);	 Catch:{ all -> 0x01e6 }
        r11 = r9.f7788g;	 Catch:{ all -> 0x01e6 }
        r11 = r11.getPackageName();	 Catch:{ all -> 0x01e6 }
        r10.addCategory(r11);	 Catch:{ all -> 0x01e6 }
        r11 = r9.f7788g;	 Catch:{ all -> 0x01e6 }
        r3 = f7787f;	 Catch:{ all -> 0x01e6 }
        r4 = "com.google.android.c2dm.permission.SEND";	 Catch:{ all -> 0x01e6 }
        r5 = 0;	 Catch:{ all -> 0x01e6 }
        r11.registerReceiver(r3, r10, r4, r5);	 Catch:{ all -> 0x01e6 }
    L_0x01e4:
        monitor-exit(r9);	 Catch:{ all -> 0x01e6 }
        goto L_0x021a;	 Catch:{ all -> 0x01e6 }
    L_0x01e6:
        r10 = move-exception;	 Catch:{ all -> 0x01e6 }
        monitor-exit(r9);	 Catch:{ all -> 0x01e6 }
        throw r10;
    L_0x01e9:
        r10 = "google.messenger";
        r11 = r9.f7790i;
        r2.putExtra(r10, r11);
        r10 = "messenger2";
        r11 = "1";
        r2.putExtra(r10, r11);
        r10 = r9.f7792k;
        if (r10 == 0) goto L_0x0216;
    L_0x01fb:
        r10 = android.os.Message.obtain();
        r10.obj = r2;
        r11 = r9.f7792k;	 Catch:{ RemoteException -> 0x0207 }
        r11.send(r10);	 Catch:{ RemoteException -> 0x0207 }
        goto L_0x0225;
    L_0x0207:
        r10 = "InstanceID/Rpc";
        r10 = android.util.Log.isLoggable(r10, r3);
        if (r10 == 0) goto L_0x0216;
    L_0x020f:
        r10 = "InstanceID/Rpc";
        r11 = "Messenger failed, fallback to startService";
        android.util.Log.d(r10, r11);
    L_0x0216:
        r10 = f7783b;
        if (r10 == 0) goto L_0x0220;
    L_0x021a:
        r10 = r9.f7788g;
        r10.sendBroadcast(r2);
        goto L_0x0225;
    L_0x0220:
        r10 = r9.f7788g;
        r10.startService(r2);
    L_0x0225:
        r10 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.block(r10);
        r10 = r9.getClass();
        monitor-enter(r10);
        r11 = r9.f7789h;	 Catch:{ all -> 0x0275 }
        r11 = r11.remove(r1);	 Catch:{ all -> 0x0275 }
        r0 = r11 instanceof android.content.Intent;	 Catch:{ all -> 0x0275 }
        if (r0 == 0) goto L_0x023d;	 Catch:{ all -> 0x0275 }
    L_0x0239:
        r11 = (android.content.Intent) r11;	 Catch:{ all -> 0x0275 }
        monitor-exit(r10);	 Catch:{ all -> 0x0275 }
        return r11;	 Catch:{ all -> 0x0275 }
    L_0x023d:
        r0 = r11 instanceof java.lang.String;	 Catch:{ all -> 0x0275 }
        if (r0 == 0) goto L_0x0249;	 Catch:{ all -> 0x0275 }
    L_0x0241:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0275 }
        r11 = (java.lang.String) r11;	 Catch:{ all -> 0x0275 }
        r0.<init>(r11);	 Catch:{ all -> 0x0275 }
        throw r0;	 Catch:{ all -> 0x0275 }
    L_0x0249:
        r0 = "InstanceID/Rpc";	 Catch:{ all -> 0x0275 }
        r11 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x0275 }
        r1 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x0275 }
        r1 = r1.length();	 Catch:{ all -> 0x0275 }
        r1 = r1 + 12;	 Catch:{ all -> 0x0275 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0275 }
        r2.<init>(r1);	 Catch:{ all -> 0x0275 }
        r1 = "No response ";	 Catch:{ all -> 0x0275 }
        r2.append(r1);	 Catch:{ all -> 0x0275 }
        r2.append(r11);	 Catch:{ all -> 0x0275 }
        r11 = r2.toString();	 Catch:{ all -> 0x0275 }
        android.util.Log.w(r0, r11);	 Catch:{ all -> 0x0275 }
        r11 = new java.io.IOException;	 Catch:{ all -> 0x0275 }
        r0 = "TIMEOUT";	 Catch:{ all -> 0x0275 }
        r11.<init>(r0);	 Catch:{ all -> 0x0275 }
        throw r11;	 Catch:{ all -> 0x0275 }
    L_0x0275:
        r11 = move-exception;	 Catch:{ all -> 0x0275 }
        monitor-exit(r10);	 Catch:{ all -> 0x0275 }
        throw r11;
    L_0x0278:
        r10 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0278 }
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.k.b(android.os.Bundle, java.security.KeyPair):android.content.Intent");
    }

    /* renamed from: b */
    private static synchronized String m9323b() {
        String num;
        synchronized (C2562k.class) {
            int i = f7786e;
            f7786e = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: c */
    private final synchronized void m9324c(Intent intent) {
        if (this.f7793l == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f7793l = PendingIntent.getBroadcast(this.f7788g, 0, intent2, 0);
        }
        intent.putExtra("app", this.f7793l);
    }

    /* renamed from: a */
    final Intent m9325a(Bundle bundle, KeyPair keyPair) throws IOException {
        Intent b = m9322b(bundle, keyPair);
        if (b == null || !b.hasExtra("google.messenger")) {
            return b;
        }
        b = m9322b(bundle, keyPair);
        return (b == null || !b.hasExtra("google.messenger")) ? b : null;
    }

    /* renamed from: a */
    public final void m9326a(Message message) {
        if (message != null) {
            if (message.obj instanceof Intent) {
                Intent intent = (Intent) message.obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.f7792k = (MessengerCompat) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f7791j = (Messenger) parcelableExtra;
                    }
                }
                m9327b((Intent) message.obj);
                return;
            }
            Log.w("InstanceID/Rpc", "Dropping invalid message");
        }
    }

    /* renamed from: b */
    public final void m9327b(Intent intent) {
        if (intent == null) {
            if (Log.isLoggable("InstanceID/Rpc", 3)) {
                Log.d("InstanceID/Rpc", "Unexpected response: null");
            }
            return;
        }
        String action = intent.getAction();
        String str;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
            action = intent.getStringExtra("registration_id");
            if (action == null) {
                action = intent.getStringExtra("unregistered");
            }
            String str2 = null;
            if (action == null) {
                Object stringExtra = intent.getStringExtra("error");
                StringBuilder stringBuilder;
                if (stringExtra == null) {
                    String valueOf = String.valueOf(intent.getExtras());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    stringBuilder.append("Unexpected response, no error or registration id ");
                    stringBuilder.append(valueOf);
                    Log.w("InstanceID/Rpc", stringBuilder.toString());
                    return;
                }
                String str3;
                String valueOf2;
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    String str4 = "InstanceID/Rpc";
                    str3 = "Received InstanceID error ";
                    valueOf2 = String.valueOf(stringExtra);
                    Log.d(str4, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                }
                if (stringExtra.startsWith("|")) {
                    String[] split = stringExtra.split("\\|");
                    if (!"ID".equals(split[1])) {
                        str3 = "InstanceID/Rpc";
                        valueOf2 = "Unexpected structured response ";
                        action = String.valueOf(stringExtra);
                        Log.w(str3, action.length() != 0 ? valueOf2.concat(action) : new String(valueOf2));
                    }
                    if (split.length > 2) {
                        action = split[2];
                        str2 = split[3];
                        if (str2.startsWith(":")) {
                            str2 = str2.substring(1);
                        }
                        String str5 = str2;
                        str2 = action;
                        stringExtra = str5;
                    } else {
                        stringExtra = "UNKNOWN";
                    }
                    intent.putExtra("error", stringExtra);
                }
                if (str2 == null) {
                    m9315a(stringExtra);
                } else {
                    m9317a(str2, stringExtra);
                }
                long longExtra = intent.getLongExtra("Retry-After", 0);
                int i;
                if (longExtra > 0) {
                    this.f7795n = SystemClock.elapsedRealtime();
                    this.f7797p = ((int) longExtra) * AdError.NETWORK_ERROR_CODE;
                    this.f7798q = SystemClock.elapsedRealtime() + ((long) this.f7797p);
                    i = this.f7797p;
                    stringBuilder = new StringBuilder(52);
                    stringBuilder.append("Explicit request from server to backoff: ");
                    stringBuilder.append(i);
                    Log.w("InstanceID/Rpc", stringBuilder.toString());
                    return;
                }
                if (("SERVICE_NOT_AVAILABLE".equals(stringExtra) || "AUTHENTICATION_FAILED".equals(stringExtra)) && "com.google.android.gsf".equals(f7782a)) {
                    this.f7796o++;
                    if (this.f7796o >= 3) {
                        if (this.f7796o == 3) {
                            this.f7797p = new Random().nextInt(AdError.NETWORK_ERROR_CODE) + AdError.NETWORK_ERROR_CODE;
                        }
                        this.f7797p <<= 1;
                        this.f7798q = SystemClock.elapsedRealtime() + ((long) this.f7797p);
                        i = this.f7797p;
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(stringExtra).length() + 31);
                        stringBuilder2.append("Backoff due to ");
                        stringBuilder2.append(stringExtra);
                        stringBuilder2.append(" for ");
                        stringBuilder2.append(i);
                        Log.w("InstanceID/Rpc", stringBuilder2.toString());
                    }
                }
                return;
            }
            this.f7794m = SystemClock.elapsedRealtime();
            this.f7798q = 0;
            this.f7796o = 0;
            this.f7797p = 0;
            if (action.startsWith("|")) {
                String[] split2 = action.split("\\|");
                if (!"ID".equals(split2[1])) {
                    String str6 = "InstanceID/Rpc";
                    String str7 = "Unexpected structured response ";
                    action = String.valueOf(action);
                    Log.w(str6, action.length() != 0 ? str7.concat(action) : new String(str7));
                }
                action = split2[2];
                if (split2.length > 4) {
                    Context context;
                    if ("SYNC".equals(split2[3])) {
                        context = this.f7788g;
                        Intent intent2 = new Intent("com.google.android.gms.iid.InstanceID");
                        intent2.putExtra("CMD", "SYNC");
                        intent2.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
                        context.sendBroadcast(intent2);
                    } else if ("RST".equals(split2[3])) {
                        context = this.f7788g;
                        C2553a.m9296c(this.f7788g);
                        InstanceIDListenerService.zza(context, C2553a.m9297d());
                        intent.removeExtra("registration_id");
                        m9317a(action, (Object) intent);
                        return;
                    }
                }
                str = split2[split2.length - 1];
                if (str.startsWith(":")) {
                    str = str.substring(1);
                }
                intent.putExtra("registration_id", str);
            } else {
                action = null;
            }
            if (action == null) {
                m9315a((Object) intent);
                return;
            } else {
                m9317a(action, (Object) intent);
                return;
            }
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            str = "InstanceID/Rpc";
            action = "Unexpected response ";
            valueOf = String.valueOf(intent.getAction());
            Log.d(str, valueOf.length() != 0 ? action.concat(valueOf) : new String(action));
        }
    }
}
