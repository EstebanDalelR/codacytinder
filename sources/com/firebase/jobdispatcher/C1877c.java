package com.firebase.jobdispatcher;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.firebase.jobdispatcher.c */
final class C1877c {
    /* renamed from: a */
    private static Boolean f5110a;

    C1877c() {
    }

    /* renamed from: a */
    public Pair<JobCallback, Bundle> m6591a(@Nullable Bundle bundle) {
        if (bundle != null) {
            return C1877c.m6589b(bundle);
        }
        Log.e("FJD.GooglePlayReceiver", "No callback received, terminating");
        return null;
    }

    @Nullable
    @SuppressLint({"ParcelClassLoader"})
    /* renamed from: b */
    private static Pair<JobCallback, Bundle> m6589b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Parcel c = C1877c.m6590c(bundle);
        Pair<JobCallback, Bundle> pair = null;
        if (c.readInt() <= 0) {
            Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
            return pair;
        } else if (c.readInt() != 1279544898) {
            Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
            c.recycle();
            return pair;
        } else {
            int readInt = c.readInt();
            Object obj = pair;
            for (int i = 0; i < readInt; i++) {
                String a = C1877c.m6586a(c);
                if (a != null) {
                    if (obj == null) {
                        if ("callback".equals(a)) {
                            if (c.readInt() != 4) {
                                Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
                                c.recycle();
                                return pair;
                            }
                            if ("com.google.android.gms.gcm.PendingCallback".equals(c.readString())) {
                                try {
                                    obj = new C3488e(c.readStrongBinder());
                                } finally {
                                    c.recycle();
                                }
                            } else {
                                Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
                                c.recycle();
                                return pair;
                            }
                        }
                    }
                    Object readValue = c.readValue(pair);
                    if (readValue instanceof String) {
                        bundle2.putString(a, (String) readValue);
                    } else if (readValue instanceof Boolean) {
                        bundle2.putBoolean(a, ((Boolean) readValue).booleanValue());
                    } else if (readValue instanceof Integer) {
                        bundle2.putInt(a, ((Integer) readValue).intValue());
                    } else if (readValue instanceof ArrayList) {
                        bundle2.putParcelableArrayList(a, (ArrayList) readValue);
                    } else if (readValue instanceof Bundle) {
                        bundle2.putBundle(a, (Bundle) readValue);
                    } else if (readValue instanceof Parcelable) {
                        bundle2.putParcelable(a, (Parcelable) readValue);
                    }
                }
            }
            if (obj == null) {
                Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
                c.recycle();
                return pair;
            }
            Pair<JobCallback, Bundle> create = Pair.create(obj, bundle2);
            c.recycle();
            return create;
        }
    }

    /* renamed from: c */
    private static Parcel m6590c(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return obtain;
    }

    /* renamed from: a */
    private static String m6586a(Parcel parcel) {
        if (C1877c.m6588a()) {
            return parcel.readString();
        }
        parcel = parcel.readValue(null);
        if (parcel instanceof String) {
            return (String) parcel;
        }
        Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
        return null;
    }

    /* renamed from: a */
    private static synchronized boolean m6588a() {
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
        r0 = com.firebase.jobdispatcher.C1877c.class;
        monitor-enter(r0);
        r1 = f5110a;	 Catch:{ all -> 0x0065 }
        if (r1 != 0) goto L_0x005d;	 Catch:{ all -> 0x0065 }
    L_0x0007:
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x0065 }
        r1.<init>();	 Catch:{ all -> 0x0065 }
        r2 = "key";	 Catch:{ all -> 0x0065 }
        r3 = "value";	 Catch:{ all -> 0x0065 }
        r1.putString(r2, r3);	 Catch:{ all -> 0x0065 }
        r1 = com.firebase.jobdispatcher.C1877c.m6590c(r1);	 Catch:{ all -> 0x0065 }
        r2 = r1.readInt();	 Catch:{ RuntimeException -> 0x0054 }
        r3 = 0;	 Catch:{ RuntimeException -> 0x0054 }
        r4 = 1;	 Catch:{ RuntimeException -> 0x0054 }
        if (r2 <= 0) goto L_0x0021;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x001f:
        r2 = 1;	 Catch:{ RuntimeException -> 0x0054 }
        goto L_0x0022;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x0021:
        r2 = 0;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x0022:
        com.firebase.jobdispatcher.C1877c.m6587a(r2);	 Catch:{ RuntimeException -> 0x0054 }
        r2 = r1.readInt();	 Catch:{ RuntimeException -> 0x0054 }
        r5 = 1279544898; // 0x4c444e42 float:5.146036E7 double:6.321791764E-315;	 Catch:{ RuntimeException -> 0x0054 }
        if (r2 != r5) goto L_0x0030;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x002e:
        r2 = 1;	 Catch:{ RuntimeException -> 0x0054 }
        goto L_0x0031;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x0030:
        r2 = 0;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x0031:
        com.firebase.jobdispatcher.C1877c.m6587a(r2);	 Catch:{ RuntimeException -> 0x0054 }
        r2 = r1.readInt();	 Catch:{ RuntimeException -> 0x0054 }
        if (r2 != r4) goto L_0x003b;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x003a:
        r3 = 1;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x003b:
        com.firebase.jobdispatcher.C1877c.m6587a(r3);	 Catch:{ RuntimeException -> 0x0054 }
        r2 = "key";	 Catch:{ RuntimeException -> 0x0054 }
        r3 = r1.readString();	 Catch:{ RuntimeException -> 0x0054 }
        r2 = r2.equals(r3);	 Catch:{ RuntimeException -> 0x0054 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ RuntimeException -> 0x0054 }
        f5110a = r2;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x004e:
        r1.recycle();	 Catch:{ all -> 0x0065 }
        goto L_0x005d;
    L_0x0052:
        r2 = move-exception;
        goto L_0x0059;
    L_0x0054:
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0052 }
        f5110a = r2;	 Catch:{ all -> 0x0052 }
        goto L_0x004e;
    L_0x0059:
        r1.recycle();	 Catch:{ all -> 0x0065 }
        throw r2;	 Catch:{ all -> 0x0065 }
    L_0x005d:
        r1 = f5110a;	 Catch:{ all -> 0x0065 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0065 }
        monitor-exit(r0);
        return r1;
    L_0x0065:
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.c.a():boolean");
    }

    /* renamed from: a */
    private static void m6587a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
