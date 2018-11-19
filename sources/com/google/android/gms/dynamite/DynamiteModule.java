package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class DynamiteModule {
    /* renamed from: a */
    public static final zzd f7686a = new C3832b();
    /* renamed from: b */
    public static final zzd f7687b = new C3834d();
    /* renamed from: c */
    public static final zzd f7688c = new C3835e();
    /* renamed from: d */
    public static final zzd f7689d = new C3836f();
    /* renamed from: e */
    public static final zzd f7690e = new C3837g();
    /* renamed from: f */
    private static Boolean f7691f;
    /* renamed from: g */
    private static zzk f7692g;
    /* renamed from: h */
    private static zzm f7693h;
    /* renamed from: i */
    private static String f7694i;
    /* renamed from: j */
    private static final ThreadLocal<C2531a> f7695j = new ThreadLocal();
    /* renamed from: k */
    private static final zzi f7696k = new C3831a();
    /* renamed from: l */
    private static zzd f7697l = new C3833c();
    /* renamed from: m */
    private final Context f7698m;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    static class C2531a {
        /* renamed from: a */
        public Cursor f7685a;

        private C2531a() {
        }
    }

    public static class zzc extends Exception {
        private zzc(String str) {
            super(str);
        }

        private zzc(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface zzd {
        C2533i zza(Context context, String str, zzi zzi) throws zzc;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    static class C3830b implements zzi {
        /* renamed from: a */
        private final int f12075a;
        /* renamed from: b */
        private final int f12076b = 0;

        public C3830b(int i, int i2) {
            this.f12075a = i;
        }

        public final int zzab(Context context, String str) {
            return this.f12075a;
        }

        public final int zzc(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        this.f7698m = (Context) ad.m9045a((Object) context);
    }

    /* renamed from: a */
    public static int m9226a(android.content.Context r5, java.lang.String r6) {
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
        r0 = 0;
        r5 = r5.getApplicationContext();	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r5 = r5.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = "com.google.android.gms.dynamite.descriptors.";	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r2 = "ModuleDescriptor";	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = r3.length();	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = r3 + 1;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4 = java.lang.String.valueOf(r6);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4 = r4.length();	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = r3 + r4;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4 = java.lang.String.valueOf(r2);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4 = r4.length();	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = r3 + r4;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4.<init>(r3);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4.append(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4.append(r6);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = ".";	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4.append(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r4.append(r2);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = r4.toString();	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r5 = r5.loadClass(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = "MODULE_ID";	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = r5.getDeclaredField(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r2 = "MODULE_VERSION";	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r5 = r5.getDeclaredField(r2);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r2 = 0;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = r1.get(r2);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = r3.equals(r6);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        if (r3 != 0) goto L_0x009a;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
    L_0x005b:
        r5 = "DynamiteModule";	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = r1.get(r2);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r2 = r2.length();	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r2 = r2 + 51;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = java.lang.String.valueOf(r6);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = r3.length();	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r2 = r2 + r3;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3.<init>(r2);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r2 = "Module descriptor id '";	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3.append(r2);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3.append(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = "' didn't match expected id '";	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3.append(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3.append(r6);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = "'";	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r3.append(r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        r1 = r3.toString();	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        android.util.Log.e(r5, r1);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        return r0;	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
    L_0x009a:
        r5 = r5.getInt(r2);	 Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x009f }
        return r5;
    L_0x009f:
        r5 = move-exception;
        r6 = "DynamiteModule";
        r1 = "Failed to load module descriptor class: ";
        r5 = r5.getMessage();
        r5 = java.lang.String.valueOf(r5);
        r2 = r5.length();
        if (r2 == 0) goto L_0x00b7;
    L_0x00b2:
        r5 = r1.concat(r5);
        goto L_0x00bc;
    L_0x00b7:
        r5 = new java.lang.String;
        r5.<init>(r1);
    L_0x00bc:
        android.util.Log.e(r6, r5);
        return r0;
    L_0x00c0:
        r5 = "DynamiteModule";
        r1 = java.lang.String.valueOf(r6);
        r1 = r1.length();
        r1 = r1 + 45;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Local module descriptor class for ";
        r2.append(r1);
        r2.append(r6);
        r6 = " not found.";
        r2.append(r6);
        r6 = r2.toString();
        android.util.Log.w(r5, r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String):int");
    }

    /* renamed from: a */
    public static int m9227a(android.content.Context r8, java.lang.String r9, boolean r10) {
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
        r0 = com.google.android.gms.dynamite.DynamiteModule.class;
        monitor-enter(r0);
        r1 = f7691f;	 Catch:{ all -> 0x00e6 }
        if (r1 != 0) goto L_0x00b3;
    L_0x0007:
        r1 = r8.getApplicationContext();	 Catch:{ ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a }
        r1 = r1.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a }
        r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class;	 Catch:{ ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a }
        r2 = r2.getName();	 Catch:{ ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a }
        r1 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a }
        r2 = "sClassLoader";	 Catch:{ ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a }
        r2 = r1.getDeclaredField(r2);	 Catch:{ ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a }
        monitor-enter(r1);	 Catch:{ ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a }
        r3 = 0;
        r4 = r2.get(r3);	 Catch:{ all -> 0x0087 }
        r4 = (java.lang.ClassLoader) r4;	 Catch:{ all -> 0x0087 }
        if (r4 == 0) goto L_0x0038;	 Catch:{ all -> 0x0087 }
    L_0x0029:
        r2 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x0087 }
        if (r4 != r2) goto L_0x0032;	 Catch:{ all -> 0x0087 }
    L_0x002f:
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0087 }
        goto L_0x0084;
    L_0x0032:
        m9232a(r4);	 Catch:{ zzc -> 0x0035 }
    L_0x0035:
        r2 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x0087 }
        goto L_0x0084;	 Catch:{ all -> 0x0087 }
    L_0x0038:
        r4 = "com.google.android.gms";	 Catch:{ all -> 0x0087 }
        r5 = r8.getApplicationContext();	 Catch:{ all -> 0x0087 }
        r5 = r5.getPackageName();	 Catch:{ all -> 0x0087 }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x0087 }
        if (r4 == 0) goto L_0x0050;	 Catch:{ all -> 0x0087 }
    L_0x0048:
        r4 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x0087 }
        r2.set(r3, r4);	 Catch:{ all -> 0x0087 }
        goto L_0x002f;
    L_0x0050:
        r4 = m9236c(r8, r9, r10);	 Catch:{ zzc -> 0x007c }
        r5 = f7694i;	 Catch:{ zzc -> 0x007c }
        if (r5 == 0) goto L_0x0079;	 Catch:{ zzc -> 0x007c }
    L_0x0058:
        r5 = f7694i;	 Catch:{ zzc -> 0x007c }
        r5 = r5.isEmpty();	 Catch:{ zzc -> 0x007c }
        if (r5 == 0) goto L_0x0061;	 Catch:{ zzc -> 0x007c }
    L_0x0060:
        goto L_0x0079;	 Catch:{ zzc -> 0x007c }
    L_0x0061:
        r5 = new com.google.android.gms.dynamite.h;	 Catch:{ zzc -> 0x007c }
        r6 = f7694i;	 Catch:{ zzc -> 0x007c }
        r7 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ zzc -> 0x007c }
        r5.<init>(r6, r7);	 Catch:{ zzc -> 0x007c }
        m9232a(r5);	 Catch:{ zzc -> 0x007c }
        r2.set(r3, r5);	 Catch:{ zzc -> 0x007c }
        r5 = java.lang.Boolean.TRUE;	 Catch:{ zzc -> 0x007c }
        f7691f = r5;	 Catch:{ zzc -> 0x007c }
        monitor-exit(r1);	 Catch:{ all -> 0x0087 }
        monitor-exit(r0);	 Catch:{ all -> 0x00e6 }
        return r4;
    L_0x0079:
        monitor-exit(r1);	 Catch:{ all -> 0x0087 }
        monitor-exit(r0);	 Catch:{ all -> 0x00e6 }
        return r4;
    L_0x007c:
        r4 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x0087 }
        r2.set(r3, r4);	 Catch:{ all -> 0x0087 }
        goto L_0x002f;	 Catch:{ all -> 0x0087 }
    L_0x0084:
        monitor-exit(r1);	 Catch:{ all -> 0x0087 }
        r1 = r2;	 Catch:{ all -> 0x0087 }
        goto L_0x00b1;	 Catch:{ all -> 0x0087 }
    L_0x0087:
        r2 = move-exception;	 Catch:{ all -> 0x0087 }
        monitor-exit(r1);	 Catch:{ all -> 0x0087 }
        throw r2;	 Catch:{ ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a, ClassNotFoundException -> 0x008a }
    L_0x008a:
        r1 = move-exception;
        r2 = "DynamiteModule";	 Catch:{ all -> 0x00e6 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00e6 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00e6 }
        r3 = r3.length();	 Catch:{ all -> 0x00e6 }
        r3 = r3 + 30;	 Catch:{ all -> 0x00e6 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e6 }
        r4.<init>(r3);	 Catch:{ all -> 0x00e6 }
        r3 = "Failed to load module via V2: ";	 Catch:{ all -> 0x00e6 }
        r4.append(r3);	 Catch:{ all -> 0x00e6 }
        r4.append(r1);	 Catch:{ all -> 0x00e6 }
        r1 = r4.toString();	 Catch:{ all -> 0x00e6 }
        android.util.Log.w(r2, r1);	 Catch:{ all -> 0x00e6 }
        r1 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x00e6 }
    L_0x00b1:
        f7691f = r1;	 Catch:{ all -> 0x00e6 }
    L_0x00b3:
        monitor-exit(r0);	 Catch:{ all -> 0x00e6 }
        r0 = r1.booleanValue();
        if (r0 == 0) goto L_0x00e1;
    L_0x00ba:
        r8 = m9236c(r8, r9, r10);	 Catch:{ zzc -> 0x00bf }
        return r8;
    L_0x00bf:
        r8 = move-exception;
        r9 = "DynamiteModule";
        r10 = "Failed to retrieve remote module version: ";
        r8 = r8.getMessage();
        r8 = java.lang.String.valueOf(r8);
        r0 = r8.length();
        if (r0 == 0) goto L_0x00d7;
    L_0x00d2:
        r8 = r10.concat(r8);
        goto L_0x00dc;
    L_0x00d7:
        r8 = new java.lang.String;
        r8.<init>(r10);
    L_0x00dc:
        android.util.Log.w(r9, r8);
        r8 = 0;
        return r8;
    L_0x00e1:
        r8 = m9234b(r8, r9, r10);
        return r8;
    L_0x00e6:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00e6 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    private static Context m9228a(Context context, String str, int i, Cursor cursor, zzm zzm) {
        try {
            return (Context) C4296b.m17262a(zzm.zza(C4296b.m17261a((Object) context), str, i, C4296b.m17261a((Object) cursor)));
        } catch (Exception e) {
            str = "DynamiteModule";
            String str2 = "Failed to load DynamiteLoader: ";
            String valueOf = String.valueOf(e.toString());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static com.google.android.gms.dynamite.DynamiteModule m9229a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.zzd r11, java.lang.String r12) throws com.google.android.gms.dynamite.DynamiteModule.zzc {
        /*
        r0 = f7695j;
        r0 = r0.get();
        r0 = (com.google.android.gms.dynamite.DynamiteModule.C2531a) r0;
        r1 = new com.google.android.gms.dynamite.DynamiteModule$a;
        r2 = 0;
        r1.<init>();
        r3 = f7695j;
        r3.set(r1);
        r3 = f7696k;	 Catch:{ all -> 0x0131 }
        r3 = r11.zza(r10, r12, r3);	 Catch:{ all -> 0x0131 }
        r4 = "DynamiteModule";
        r5 = r3.f7699a;	 Catch:{ all -> 0x0131 }
        r6 = r3.f7700b;	 Catch:{ all -> 0x0131 }
        r7 = java.lang.String.valueOf(r12);	 Catch:{ all -> 0x0131 }
        r7 = r7.length();	 Catch:{ all -> 0x0131 }
        r7 = r7 + 68;
        r8 = java.lang.String.valueOf(r12);	 Catch:{ all -> 0x0131 }
        r8 = r8.length();	 Catch:{ all -> 0x0131 }
        r7 = r7 + r8;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0131 }
        r8.<init>(r7);	 Catch:{ all -> 0x0131 }
        r7 = "Considering local module ";
        r8.append(r7);	 Catch:{ all -> 0x0131 }
        r8.append(r12);	 Catch:{ all -> 0x0131 }
        r7 = ":";
        r8.append(r7);	 Catch:{ all -> 0x0131 }
        r8.append(r5);	 Catch:{ all -> 0x0131 }
        r5 = " and remote module ";
        r8.append(r5);	 Catch:{ all -> 0x0131 }
        r8.append(r12);	 Catch:{ all -> 0x0131 }
        r5 = ":";
        r8.append(r5);	 Catch:{ all -> 0x0131 }
        r8.append(r6);	 Catch:{ all -> 0x0131 }
        r5 = r8.toString();	 Catch:{ all -> 0x0131 }
        android.util.Log.i(r4, r5);	 Catch:{ all -> 0x0131 }
        r4 = r3.f7701c;	 Catch:{ all -> 0x0131 }
        if (r4 == 0) goto L_0x0107;
    L_0x0062:
        r4 = r3.f7701c;	 Catch:{ all -> 0x0131 }
        r5 = -1;
        if (r4 != r5) goto L_0x006b;
    L_0x0067:
        r4 = r3.f7699a;	 Catch:{ all -> 0x0131 }
        if (r4 == 0) goto L_0x0107;
    L_0x006b:
        r4 = r3.f7701c;	 Catch:{ all -> 0x0131 }
        r6 = 1;
        if (r4 != r6) goto L_0x0076;
    L_0x0070:
        r4 = r3.f7700b;	 Catch:{ all -> 0x0131 }
        if (r4 != 0) goto L_0x0076;
    L_0x0074:
        goto L_0x0107;
    L_0x0076:
        r4 = r3.f7701c;	 Catch:{ all -> 0x0131 }
        if (r4 != r5) goto L_0x008d;
    L_0x007a:
        r10 = m9237c(r10, r12);	 Catch:{ all -> 0x0131 }
        r11 = r1.f7685a;
        if (r11 == 0) goto L_0x0087;
    L_0x0082:
        r11 = r1.f7685a;
        r11.close();
    L_0x0087:
        r11 = f7695j;
        r11.set(r0);
        return r10;
    L_0x008d:
        r4 = r3.f7701c;	 Catch:{ all -> 0x0131 }
        if (r4 != r6) goto L_0x00ec;
    L_0x0091:
        r4 = r3.f7700b;	 Catch:{ zzc -> 0x00a6 }
        r4 = m9230a(r10, r12, r4);	 Catch:{ zzc -> 0x00a6 }
        r10 = r1.f7685a;
        if (r10 == 0) goto L_0x00a0;
    L_0x009b:
        r10 = r1.f7685a;
        r10.close();
    L_0x00a0:
        r10 = f7695j;
        r10.set(r0);
        return r4;
    L_0x00a6:
        r4 = move-exception;
        r6 = "DynamiteModule";
        r7 = "Failed to load remote module: ";
        r8 = r4.getMessage();	 Catch:{ all -> 0x0131 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0131 }
        r9 = r8.length();	 Catch:{ all -> 0x0131 }
        if (r9 == 0) goto L_0x00be;
    L_0x00b9:
        r7 = r7.concat(r8);	 Catch:{ all -> 0x0131 }
        goto L_0x00c4;
    L_0x00be:
        r8 = new java.lang.String;	 Catch:{ all -> 0x0131 }
        r8.<init>(r7);	 Catch:{ all -> 0x0131 }
        r7 = r8;
    L_0x00c4:
        android.util.Log.w(r6, r7);	 Catch:{ all -> 0x0131 }
        r6 = r3.f7699a;	 Catch:{ all -> 0x0131 }
        if (r6 == 0) goto L_0x00e4;
    L_0x00cb:
        r6 = new com.google.android.gms.dynamite.DynamiteModule$b;	 Catch:{ all -> 0x0131 }
        r3 = r3.f7699a;	 Catch:{ all -> 0x0131 }
        r7 = 0;
        r6.<init>(r3, r7);	 Catch:{ all -> 0x0131 }
        r11 = r11.zza(r10, r12, r6);	 Catch:{ all -> 0x0131 }
        r11 = r11.f7701c;	 Catch:{ all -> 0x0131 }
        if (r11 != r5) goto L_0x00e4;
    L_0x00db:
        r10 = m9237c(r10, r12);	 Catch:{ all -> 0x0131 }
        r11 = r1.f7685a;
        if (r11 == 0) goto L_0x0087;
    L_0x00e3:
        goto L_0x0082;
    L_0x00e4:
        r10 = new com.google.android.gms.dynamite.DynamiteModule$zzc;	 Catch:{ all -> 0x0131 }
        r11 = "Remote load failed. No local fallback found.";
        r10.<init>(r11, r4);	 Catch:{ all -> 0x0131 }
        throw r10;	 Catch:{ all -> 0x0131 }
    L_0x00ec:
        r10 = new com.google.android.gms.dynamite.DynamiteModule$zzc;	 Catch:{ all -> 0x0131 }
        r11 = r3.f7701c;	 Catch:{ all -> 0x0131 }
        r12 = 47;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0131 }
        r3.<init>(r12);	 Catch:{ all -> 0x0131 }
        r12 = "VersionPolicy returned invalid code:";
        r3.append(r12);	 Catch:{ all -> 0x0131 }
        r3.append(r11);	 Catch:{ all -> 0x0131 }
        r11 = r3.toString();	 Catch:{ all -> 0x0131 }
        r10.<init>(r11);	 Catch:{ all -> 0x0131 }
        throw r10;	 Catch:{ all -> 0x0131 }
    L_0x0107:
        r10 = new com.google.android.gms.dynamite.DynamiteModule$zzc;	 Catch:{ all -> 0x0131 }
        r11 = r3.f7699a;	 Catch:{ all -> 0x0131 }
        r12 = r3.f7700b;	 Catch:{ all -> 0x0131 }
        r3 = 91;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0131 }
        r4.<init>(r3);	 Catch:{ all -> 0x0131 }
        r3 = "No acceptable module found. Local version is ";
        r4.append(r3);	 Catch:{ all -> 0x0131 }
        r4.append(r11);	 Catch:{ all -> 0x0131 }
        r11 = " and remote version is ";
        r4.append(r11);	 Catch:{ all -> 0x0131 }
        r4.append(r12);	 Catch:{ all -> 0x0131 }
        r11 = ".";
        r4.append(r11);	 Catch:{ all -> 0x0131 }
        r11 = r4.toString();	 Catch:{ all -> 0x0131 }
        r10.<init>(r11);	 Catch:{ all -> 0x0131 }
        throw r10;	 Catch:{ all -> 0x0131 }
    L_0x0131:
        r10 = move-exception;
        r11 = r1.f7685a;
        if (r11 == 0) goto L_0x013b;
    L_0x0136:
        r11 = r1.f7685a;
        r11.close();
    L_0x013b:
        r11 = f7695j;
        r11.set(r0);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$zzd, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* renamed from: a */
    private static DynamiteModule m9230a(Context context, String str, int i) throws zzc {
        synchronized (DynamiteModule.class) {
            Boolean bool = f7691f;
        }
        if (bool != null) {
            return bool.booleanValue() ? m9238c(context, str, i) : m9235b(context, str, i);
        } else {
            throw new zzc("Failed to determine which loading route to use.");
        }
    }

    /* renamed from: a */
    private static zzk m9231a(Context context) {
        synchronized (DynamiteModule.class) {
            zzk zzk;
            if (f7692g != null) {
                zzk = f7692g;
                return zzk;
            } else if (C2490g.m9021b().mo2566a(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        zzk = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        zzk = queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new C3838j(iBinder);
                    }
                    if (zzk != null) {
                        f7692g = zzk;
                        return zzk;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m9232a(ClassLoader classLoader) throws zzc {
        try {
            zzm zzm;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzm = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzm = queryLocalInterface instanceof zzm ? (zzm) queryLocalInterface : new C3839k(iBinder);
            }
            f7693h = zzm;
        } catch (Throwable e) {
            throw new zzc("Failed to instantiate dynamite loader", e);
        }
    }

    /* renamed from: b */
    public static int m9233b(Context context, String str) {
        return m9227a(context, str, false);
    }

    /* renamed from: b */
    private static int m9234b(Context context, String str, boolean z) {
        zzk a = m9231a(context);
        if (a == null) {
            return 0;
        }
        try {
            return a.zza(C4296b.m17261a((Object) context), str, z);
        } catch (RemoteException e) {
            str = "DynamiteModule";
            String str2 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return 0;
        }
    }

    /* renamed from: b */
    private static DynamiteModule m9235b(Context context, String str, int i) throws zzc {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder.append("Selected remote version of ");
        stringBuilder.append(str);
        stringBuilder.append(", version >= ");
        stringBuilder.append(i);
        Log.i("DynamiteModule", stringBuilder.toString());
        zzk a = m9231a(context);
        if (a == null) {
            throw new zzc("Failed to create IDynamiteLoader.");
        }
        try {
            IObjectWrapper zza = a.zza(C4296b.m17261a((Object) context), str, i);
            if (C4296b.m17262a(zza) != null) {
                return new DynamiteModule((Context) C4296b.m17262a(zza));
            }
            throw new zzc("Failed to load remote module.");
        } catch (Throwable e) {
            throw new zzc("Failed to load remote module.", e);
        }
    }

    /* renamed from: c */
    private static int m9236c(Context context, String str, boolean z) throws zzc {
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String str2 = z ? "api_force_staging" : "api";
            String str3 = "content://com.google.android.gms.chimera/";
            StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str3).length() + 1) + String.valueOf(str2).length()) + String.valueOf(str).length());
            stringBuilder.append(str3);
            stringBuilder.append(str2);
            stringBuilder.append("/");
            stringBuilder.append(str);
            Cursor query = contentResolver.query(Uri.parse(stringBuilder.toString()), null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int i = query.getInt(0);
                        if (i > 0) {
                            synchronized (DynamiteModule.class) {
                                f7694i = query.getString(2);
                            }
                            C2531a c2531a = (C2531a) f7695j.get();
                            if (c2531a != null && c2531a.f7685a == null) {
                                c2531a.f7685a = query;
                                query = null;
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                        return i;
                    }
                } catch (Throwable e) {
                    Throwable th2 = e;
                    cursor = query;
                    th = th2;
                } catch (Throwable e2) {
                    cursor2 = query;
                    th = e2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new zzc("Failed to connect to dynamite module ContentResolver.");
        } catch (Exception e3) {
            th = e3;
            cursor = null;
            try {
                if (th instanceof zzc) {
                    throw th;
                }
                throw new zzc("V2 version check failed", th);
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    private static DynamiteModule m9237c(Context context, String str) {
        String str2 = "DynamiteModule";
        String str3 = "Selected local version of ";
        str = String.valueOf(str);
        Log.i(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: c */
    private static DynamiteModule m9238c(Context context, String str, int i) throws zzc {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder.append("Selected remote version of ");
        stringBuilder.append(str);
        stringBuilder.append(", version >= ");
        stringBuilder.append(i);
        Log.i("DynamiteModule", stringBuilder.toString());
        synchronized (DynamiteModule.class) {
            zzm zzm = f7693h;
        }
        if (zzm == null) {
            throw new zzc("DynamiteLoaderV2 was not cached.");
        }
        C2531a c2531a = (C2531a) f7695j.get();
        if (c2531a != null) {
            if (c2531a.f7685a != null) {
                context = m9228a(context.getApplicationContext(), str, i, c2531a.f7685a, zzm);
                if (context != null) {
                    return new DynamiteModule(context);
                }
                throw new zzc("Failed to get module context");
            }
        }
        throw new zzc("No result cursor");
    }

    /* renamed from: a */
    public final Context m9239a() {
        return this.f7698m;
    }

    /* renamed from: a */
    public final IBinder m9240a(String str) throws zzc {
        try {
            return (IBinder) this.f7698m.getClassLoader().loadClass(str).newInstance();
        } catch (Throwable e) {
            String str2 = "Failed to instantiate module class: ";
            str = String.valueOf(str);
            throw new zzc(str.length() != 0 ? str2.concat(str) : new String(str2), e);
        }
    }
}
