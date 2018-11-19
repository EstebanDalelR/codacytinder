package com.facebook.ads.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.ads.internal.p047k.C1485e;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1490h.C1489a;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.d */
public class C1391d {
    /* renamed from: a */
    public static final String f3780a = "d";
    /* renamed from: b */
    private final String f3781b;
    /* renamed from: c */
    private final boolean f3782c;
    /* renamed from: d */
    private final C1388c f3783d;

    /* renamed from: com.facebook.ads.internal.d$a */
    private static final class C1386a implements IInterface {
        /* renamed from: a */
        private IBinder f3765a;

        C1386a(IBinder iBinder) {
            this.f3765a = iBinder;
        }

        /* renamed from: a */
        public String m4823a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f3765a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                return readString;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f3765a;
        }

        /* renamed from: b */
        public boolean m4824b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f3765a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                obtain2.recycle();
                obtain.recycle();
                return z;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.d$b */
    private static final class C1387b implements ServiceConnection {
        /* renamed from: a */
        private AtomicBoolean f3766a;
        /* renamed from: b */
        private final BlockingQueue<IBinder> f3767b;

        private C1387b() {
            this.f3766a = new AtomicBoolean(false);
            this.f3767b = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public IBinder m4825a() {
            if (!this.f3766a.compareAndSet(true, true)) {
                return (IBinder) this.f3767b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
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
            r1 = r0.f3767b;	 Catch:{ InterruptedException -> 0x0005 }
            r1.put(r2);	 Catch:{ InterruptedException -> 0x0005 }
        L_0x0005:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.d.b.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.facebook.ads.internal.d$c */
    public enum C1388c {
        SHARED_PREFS,
        FB4A,
        DIRECT,
        REFLECTION,
        SERVICE
    }

    private C1391d(String str, boolean z, C1388c c1388c) {
        this.f3781b = str;
        this.f3782c = z;
        this.f3783d = c1388c;
    }

    /* renamed from: a */
    private static com.facebook.ads.internal.C1391d m4829a(android.content.Context r3) {
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
        r3 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r3);	 Catch:{ Throwable -> 0x0016 }
        if (r3 == 0) goto L_0x0016;	 Catch:{ Throwable -> 0x0016 }
    L_0x0006:
        r0 = new com.facebook.ads.internal.d;	 Catch:{ Throwable -> 0x0016 }
        r1 = r3.getId();	 Catch:{ Throwable -> 0x0016 }
        r3 = r3.isLimitAdTrackingEnabled();	 Catch:{ Throwable -> 0x0016 }
        r2 = com.facebook.ads.internal.C1391d.C1388c.DIRECT;	 Catch:{ Throwable -> 0x0016 }
        r0.<init>(r1, r3, r2);	 Catch:{ Throwable -> 0x0016 }
        return r0;
    L_0x0016:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.d.a(android.content.Context):com.facebook.ads.internal.d");
    }

    /* renamed from: a */
    public static C1391d m4830a(Context context, C1489a c1489a) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot get advertising info on main thread.");
        } else if (C1485e.m5227a() && C1485e.m5228b("idfa_override")) {
            return new C1391d(C1485e.m5226a("idfa_override"), false, C1388c.DIRECT);
        } else {
            if (c1489a != null && !TextUtils.isEmpty(c1489a.f4121b)) {
                return new C1391d(c1489a.f4121b, c1489a.f4122c, C1388c.FB4A);
            }
            C1391d a = C1391d.m4829a(context);
            if (a == null || TextUtils.isEmpty(a.m4833a())) {
                a = C1391d.m4831b(context);
            }
            if (a == null || TextUtils.isEmpty(a.m4833a())) {
                a = C1391d.m4832c(context);
            }
            return a;
        }
    }

    /* renamed from: b */
    private static C1391d m4831b(Context context) {
        Method a = C1490h.m5249a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        C1391d c1391d = null;
        if (a == null) {
            return null;
        }
        Object a2 = C1490h.m5240a(null, a, context);
        if (a2 != null) {
            if (((Integer) a2).intValue() != 0) {
                return null;
            }
            a = C1490h.m5249a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
            if (a == null) {
                return null;
            }
            Object a3 = C1490h.m5240a(null, a, context);
            if (a3 == null) {
                return null;
            }
            a = C1490h.m5248a(a3.getClass(), "getId", new Class[0]);
            Method a4 = C1490h.m5248a(a3.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
            if (a != null) {
                if (a4 == null) {
                    return null;
                }
                c1391d = new C1391d((String) C1490h.m5240a(a3, a, new Object[0]), ((Boolean) C1490h.m5240a(a3, a4, new Object[0])).booleanValue(), C1388c.REFLECTION);
            }
        }
        return c1391d;
    }

    /* renamed from: c */
    private static com.facebook.ads.internal.C1391d m4832c(android.content.Context r6) {
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
        r0 = new com.facebook.ads.internal.d$b;
        r1 = 0;
        r0.<init>();
        r2 = new android.content.Intent;
        r3 = "com.google.android.gms.ads.identifier.service.START";
        r2.<init>(r3);
        r3 = "com.google.android.gms";
        r2.setPackage(r3);
        r3 = 1;
        r2 = r6.bindService(r2, r0, r3);
        if (r2 == 0) goto L_0x003d;
    L_0x0019:
        r2 = new com.facebook.ads.internal.d$a;	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r3 = r0.m4825a();	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r3 = new com.facebook.ads.internal.d;	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r4 = r2.m4823a();	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r2 = r2.m4824b();	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r5 = com.facebook.ads.internal.C1391d.C1388c.SERVICE;	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r3.<init>(r4, r2, r5);	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r6.unbindService(r0);
        return r3;
    L_0x0035:
        r1 = move-exception;
        r6.unbindService(r0);
        throw r1;
    L_0x003a:
        r6.unbindService(r0);
    L_0x003d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.d.c(android.content.Context):com.facebook.ads.internal.d");
    }

    /* renamed from: a */
    public String m4833a() {
        return this.f3781b;
    }

    /* renamed from: b */
    public boolean m4834b() {
        return this.f3782c;
    }

    /* renamed from: c */
    public C1388c m4835c() {
        return this.f3783d;
    }
}
