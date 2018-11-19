package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.GoogleMotionReading;
import com.foursquare.api.types.TrailPoint;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.network.request.FoursquareRequest.C1935a;
import com.foursquare.internal.util.C1939a;
import com.foursquare.internal.util.C1948m;
import com.foursquare.internal.util.CollectionUtils;
import com.foursquare.internal.util.Func1;
import com.foursquare.pilgrim.ad.C1963a;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.List;

final class al {
    /* renamed from: a */
    private static final String f5301a = "al";

    /* renamed from: com.foursquare.pilgrim.al$1 */
    class C35251 implements Func1<ac, TrailPoint> {
        /* renamed from: a */
        final /* synthetic */ boolean f10612a;
        /* renamed from: b */
        final /* synthetic */ boolean f10613b;
        /* renamed from: c */
        final /* synthetic */ boolean f10614c;

        C35251(boolean z, boolean z2, boolean z3) {
            this.f10612a = z;
            this.f10613b = z2;
            this.f10614c = z3;
        }

        public /* synthetic */ Object call(Object obj) {
            return m13317a((ac) obj);
        }

        /* renamed from: a */
        public TrailPoint m13317a(ac acVar) {
            return acVar.m6896b().filteredForPrivacySettings(this.f10612a, this.f10613b, this.f10614c);
        }
    }

    /* renamed from: com.foursquare.pilgrim.al$2 */
    class C35262 extends TypeToken<List<TrailPoint>> {
        C35262() {
        }
    }

    al() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static java.lang.String m6930a() {
        /*
        r0 = new java.lang.StringBuilder;
        r1 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r0.<init>(r1);
        r1 = com.foursquare.pilgrim.PilgrimSdk.get();
        r1 = r1.f5255c;
        r1 = r1.m6995d();
        r1 = r1.iterator();
        r2 = 0;
        r3 = 0;
        r4 = 0;
    L_0x0018:
        r5 = r1.hasNext();
        if (r5 == 0) goto L_0x0052;
    L_0x001e:
        r5 = r1.next();
        r5 = (com.foursquare.pilgrim.NearbyTrigger) r5;
        r6 = com.foursquare.pilgrim.al.C19663.f5300a;
        r7 = r5.a;
        r7 = r7.ordinal();
        r6 = r6[r7];
        r7 = 10;
        switch(r6) {
            case 1: goto L_0x0040;
            case 2: goto L_0x0039;
            case 3: goto L_0x0034;
            default: goto L_0x0033;
        };
    L_0x0033:
        goto L_0x0018;
    L_0x0034:
        r4 = r4 + 1;
        if (r4 <= r7) goto L_0x0045;
    L_0x0038:
        goto L_0x0018;
    L_0x0039:
        r3 = r3 + 1;
        r6 = 20;
        if (r3 <= r6) goto L_0x0045;
    L_0x003f:
        goto L_0x0018;
    L_0x0040:
        r2 = r2 + 1;
        if (r2 <= r7) goto L_0x0045;
    L_0x0044:
        goto L_0x0018;
    L_0x0045:
        r5 = r5.toString();
        r0.append(r5);
        r5 = ";";
        r0.append(r5);
        goto L_0x0018;
    L_0x0052:
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.al.a():java.lang.String");
    }

    /* renamed from: a */
    static void m6933a(C1935a<?> c1935a, FoursquareLocation foursquareLocation, int i) {
        if (ax.m7003a().m7043m()) {
            String a = C3550e.m13380a();
            C3550e.m13383b();
            c1935a.m6781a("batteryHistory", a);
        }
        if (ax.m7003a().m7040j() || ax.m7003a().m7042l() || ax.m7003a().m7041k()) {
            List a2 = ad.m13306a(new C1963a().m6899b().m6898a(i));
            Collections.reverse(a2);
            if (a2.size() > 0 && ((ac) a2.get(0)).m6895a().getTime() == foursquareLocation.getTime()) {
                a2.remove(0);
            }
            if (ax.m7003a().m7052v() != null) {
                c1935a.m6781a("trails", m6932a(a2));
            }
            String str = null;
            c1935a.m6781a("history", ax.m7003a().m7042l() ? m6936b(a2) : null);
            foursquareLocation = "motionHistory";
            if (ax.m7003a().m7040j()) {
                str = m6937c(a2);
            }
            c1935a.m6781a(foursquareLocation, str);
        }
    }

    @Nullable
    /* renamed from: a */
    private static String m6932a(@NonNull List<ac> list) {
        byte[] a = C1948m.m6843a(C1913a.m6653a(CollectionUtils.m6790a((Iterable) list, new C35251(ax.m7003a().m7042l(), ax.m7003a().m7040j(), ax.m7003a().m7041k())), new C35262()));
        if (a == null) {
            return null;
        }
        return new String(C1939a.m6810a(a));
    }

    @Deprecated
    @NonNull
    /* renamed from: b */
    private static String m6936b(@NonNull List<ac> list) {
        StringBuilder stringBuilder = new StringBuilder(list.size() * 40);
        for (ac a : list) {
            FoursquareLocation a2 = a.m6895a();
            stringBuilder.append(a2.getLat());
            stringBuilder.append(',');
            stringBuilder.append(a2.getLng());
            stringBuilder.append(',');
            stringBuilder.append(a2.getAccuracy());
            stringBuilder.append(',');
            stringBuilder.append(String.valueOf(a2.getTime() / 1000));
            stringBuilder.append(',');
            stringBuilder.append(String.valueOf(a2.getElapsedRealtimeNanos()));
            stringBuilder.append(';');
        }
        return stringBuilder.toString();
    }

    @Deprecated
    /* renamed from: c */
    private static String m6937c(List<ac> list) {
        StringBuilder stringBuilder = new StringBuilder(list.size() * 40);
        for (int i = 0; i < list.size(); i++) {
            GoogleMotionReading googleMotionReading = ((ac) list.get(i)).f5276c;
            if (googleMotionReading != null) {
                stringBuilder.append(googleMotionReading.toString());
                stringBuilder.append(';');
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: b */
    static java.lang.String m6935b() {
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
        r0 = "com.foursquare.pilgrimsdk.android:%s:%s:%s:%s:release";	 Catch:{ Exception -> 0x001e }
        r1 = 4;	 Catch:{ Exception -> 0x001e }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x001e }
        r2 = 0;	 Catch:{ Exception -> 0x001e }
        r3 = "1.2.32";	 Catch:{ Exception -> 0x001e }
        r1[r2] = r3;	 Catch:{ Exception -> 0x001e }
        r2 = 1;	 Catch:{ Exception -> 0x001e }
        r3 = "20180604";	 Catch:{ Exception -> 0x001e }
        r1[r2] = r3;	 Catch:{ Exception -> 0x001e }
        r2 = 2;	 Catch:{ Exception -> 0x001e }
        r3 = android.os.Build.VERSION.RELEASE;	 Catch:{ Exception -> 0x001e }
        r1[r2] = r3;	 Catch:{ Exception -> 0x001e }
        r2 = 3;	 Catch:{ Exception -> 0x001e }
        r3 = android.os.Build.MODEL;	 Catch:{ Exception -> 0x001e }
        r1[r2] = r3;	 Catch:{ Exception -> 0x001e }
        r0 = java.lang.String.format(r0, r1);	 Catch:{ Exception -> 0x001e }
        return r0;
    L_0x001e:
        r0 = "com.foursquare.pilgrimsdk.android";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.al.b():java.lang.String");
    }

    @Nullable
    @WorkerThread
    /* renamed from: a */
    static String m6931a(@NonNull Context context) {
        context = m6934b(context);
        if (context == null) {
            return null;
        }
        return context.getId();
    }

    @android.support.annotation.Nullable
    @android.support.annotation.WorkerThread
    /* renamed from: b */
    static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info m6934b(@android.support.annotation.NonNull android.content.Context r1) {
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
        r0 = com.google.android.gms.common.C3813b.m14425a();	 Catch:{ Exception -> 0x000f }
        r0 = r0.mo2566a(r1);	 Catch:{ Exception -> 0x000f }
        if (r0 != 0) goto L_0x000f;	 Catch:{ Exception -> 0x000f }
    L_0x000a:
        r1 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r1);	 Catch:{ Exception -> 0x000f }
        return r1;
    L_0x000f:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.al.b(android.content.Context):com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }
}
