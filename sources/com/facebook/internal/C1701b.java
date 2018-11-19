package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.FacebookException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.b */
public class C1701b {
    /* renamed from: a */
    private static final String f4697a = C1701b.class.getCanonicalName();
    /* renamed from: g */
    private static C1701b f4698g;
    /* renamed from: b */
    private String f4699b;
    /* renamed from: c */
    private String f4700c;
    /* renamed from: d */
    private String f4701d;
    /* renamed from: e */
    private boolean f4702e;
    /* renamed from: f */
    private long f4703f;

    /* renamed from: com.facebook.internal.b$a */
    private static final class C1699a implements IInterface {
        /* renamed from: a */
        private IBinder f4694a;

        C1699a(IBinder iBinder) {
            this.f4694a = iBinder;
        }

        public IBinder asBinder() {
            return this.f4694a;
        }

        /* renamed from: a */
        public String m5864a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f4694a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                return readString;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: b */
        public boolean m5865b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f4694a.transact(2, obtain, obtain2, 0);
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

    /* renamed from: com.facebook.internal.b$b */
    private static final class C1700b implements ServiceConnection {
        /* renamed from: a */
        private AtomicBoolean f4695a;
        /* renamed from: b */
        private final BlockingQueue<IBinder> f4696b;

        public void onServiceDisconnected(ComponentName componentName) {
        }

        private C1700b() {
            this.f4695a = new AtomicBoolean(false);
            this.f4696b = new LinkedBlockingDeque();
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
            if (r2 == 0) goto L_0x0007;
        L_0x0002:
            r1 = r0.f4696b;	 Catch:{ InterruptedException -> 0x0007 }
            r1.put(r2);	 Catch:{ InterruptedException -> 0x0007 }
        L_0x0007:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.b.b.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        /* renamed from: a */
        public IBinder m5866a() throws InterruptedException {
            if (!this.f4695a.compareAndSet(true, true)) {
                return (IBinder) this.f4696b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }
    }

    /* renamed from: b */
    private static C1701b m5869b(Context context) {
        C1701b c = C1701b.m5870c(context);
        if (c != null) {
            return c;
        }
        c = C1701b.m5871d(context);
        return c == null ? new C1701b() : c;
    }

    /* renamed from: c */
    private static C1701b m5870c(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new FacebookException("getAndroidId cannot be called on the main thread.");
            }
            Method a = Utility.m5764a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (a == null) {
                return null;
            }
            Object a2 = Utility.m5752a(null, a, context);
            if (a2 instanceof Integer) {
                if (((Integer) a2).intValue() == 0) {
                    a = Utility.m5764a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                    if (a == null) {
                        return null;
                    }
                    Object a3 = Utility.m5752a(null, a, context);
                    if (a3 == null) {
                        return null;
                    }
                    a = Utility.m5763a(a3.getClass(), "getId", new Class[0]);
                    Method a4 = Utility.m5763a(a3.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (a != null) {
                        if (a4 != null) {
                            C1701b c1701b = new C1701b();
                            c1701b.f4700c = (String) Utility.m5752a(a3, a, new Object[0]);
                            c1701b.f4702e = ((Boolean) Utility.m5752a(a3, a4, new Object[0])).booleanValue();
                            return c1701b;
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Exception e) {
            Utility.m5777a("android_id", e);
            return null;
        }
    }

    /* renamed from: d */
    private static C1701b m5871d(Context context) {
        ServiceConnection c1700b = new C1700b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        C1701b c1701b = true;
        if (context.bindService(intent, c1700b, 1)) {
            try {
                C1699a c1699a = new C1699a(c1700b.m5866a());
                c1701b = new C1701b();
                c1701b.f4700c = c1699a.m5864a();
                c1701b.f4702e = c1699a.m5865b();
                return c1701b;
            } catch (Exception e) {
                c1701b = "android_id";
                Utility.m5777a((String) c1701b, e);
            } finally {
                context.unbindService(c1700b);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C1701b m5867a(Context context) {
        Cursor cursor;
        StringBuilder stringBuilder;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.e(f4697a, "getAttributionIdentifiers should not be called from the main thread");
        }
        if (f4698g != null && System.currentTimeMillis() - f4698g.f4703f < 3600000) {
            return f4698g;
        }
        C1701b b = C1701b.m5869b(context);
        Cursor cursor2 = null;
        String e;
        try {
            Uri parse;
            Uri uri;
            int columnIndex;
            int columnIndex2;
            int columnIndex3;
            String[] strArr = new String[]{"aid", "androidid", "limit_tracking"};
            if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) != null) {
                parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
            } else if (context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) != null) {
                parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
            } else {
                uri = null;
                e = C1701b.m5872e(context);
                if (e != null) {
                    b.f4701d = e;
                }
                if (uri == null) {
                    return C1701b.m5868a(b);
                }
                context = context.getContentResolver().query(uri, strArr, null, null, null);
                if (context != null) {
                    try {
                        if (!context.moveToFirst()) {
                            columnIndex = context.getColumnIndex("aid");
                            columnIndex2 = context.getColumnIndex("androidid");
                            columnIndex3 = context.getColumnIndex("limit_tracking");
                            b.f4699b = context.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && b.m5874b() == null) {
                                b.f4700c = context.getString(columnIndex2);
                                b.f4702e = Boolean.parseBoolean(context.getString(columnIndex3));
                            }
                            if (context != null) {
                                context.close();
                            }
                            return C1701b.m5868a(b);
                        }
                    } catch (Exception e2) {
                        Exception exception = e2;
                        cursor = context;
                        context = exception;
                        try {
                            e = f4697a;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Caught unexpected exception in getAttributionId(): ");
                            stringBuilder.append(context.toString());
                            Log.d(e, stringBuilder.toString());
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            context = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw context;
                        }
                    } catch (Throwable th2) {
                        cursor2 = context;
                        context = th2;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw context;
                    }
                }
                b = C1701b.m5868a(b);
                if (context != null) {
                    context.close();
                }
                return b;
            }
            uri = parse;
            e = C1701b.m5872e(context);
            if (e != null) {
                b.f4701d = e;
            }
            if (uri == null) {
                return C1701b.m5868a(b);
            }
            context = context.getContentResolver().query(uri, strArr, null, null, null);
            if (context != null) {
                if (!context.moveToFirst()) {
                    columnIndex = context.getColumnIndex("aid");
                    columnIndex2 = context.getColumnIndex("androidid");
                    columnIndex3 = context.getColumnIndex("limit_tracking");
                    b.f4699b = context.getString(columnIndex);
                    b.f4700c = context.getString(columnIndex2);
                    b.f4702e = Boolean.parseBoolean(context.getString(columnIndex3));
                    if (context != null) {
                        context.close();
                    }
                    return C1701b.m5868a(b);
                }
            }
            b = C1701b.m5868a(b);
            if (context != null) {
                context.close();
            }
            return b;
        } catch (Exception e3) {
            context = e3;
            cursor = null;
            e = f4697a;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Caught unexpected exception in getAttributionId(): ");
            stringBuilder.append(context.toString());
            Log.d(e, stringBuilder.toString());
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            context = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw context;
        }
    }

    /* renamed from: a */
    private static C1701b m5868a(C1701b c1701b) {
        c1701b.f4703f = System.currentTimeMillis();
        f4698g = c1701b;
        return c1701b;
    }

    /* renamed from: a */
    public String m5873a() {
        return this.f4699b;
    }

    /* renamed from: b */
    public String m5874b() {
        return this.f4700c;
    }

    /* renamed from: c */
    public String m5875c() {
        return this.f4701d;
    }

    /* renamed from: d */
    public boolean m5876d() {
        return this.f4702e;
    }

    @Nullable
    /* renamed from: e */
    private static String m5872e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager != null ? packageManager.getInstallerPackageName(context.getPackageName()) : null;
    }
}
