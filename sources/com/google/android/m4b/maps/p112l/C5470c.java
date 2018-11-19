package com.google.android.m4b.maps.p112l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.m4b.maps.p110j.C5439e;
import com.google.android.m4b.maps.p112l.C5472d.C5471a;
import com.google.android.m4b.maps.p113m.C5476b;
import com.google.android.m4b.maps.p113m.C5480g;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.l.c */
public final class C5470c {
    /* renamed from: a */
    private static final Object f20449a = new Object();
    /* renamed from: b */
    private static C5470c f20450b;
    /* renamed from: g */
    private static final ComponentName f20451g = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    /* renamed from: c */
    private final List<String> f20452c;
    /* renamed from: d */
    private final List<String> f20453d;
    /* renamed from: e */
    private final List<String> f20454e;
    /* renamed from: f */
    private final List<String> f20455f;
    /* renamed from: h */
    private C5474f f20456h;

    /* renamed from: a */
    public static C5470c m23820a() {
        synchronized (f20449a) {
            if (f20450b == null) {
                f20450b = new C5470c();
            }
        }
        return f20450b;
    }

    private C5470c() {
        if (C5470c.m23822b() == 0) {
            this.f20452c = Collections.EMPTY_LIST;
            this.f20453d = Collections.EMPTY_LIST;
            this.f20454e = Collections.EMPTY_LIST;
            this.f20455f = Collections.EMPTY_LIST;
            return;
        }
        List list;
        String str = (String) C5471a.f20458b.m23660c();
        if (str == null) {
            list = Collections.EMPTY_LIST;
        } else {
            list = Arrays.asList(str.split(","));
        }
        this.f20452c = list;
        str = (String) C5471a.f20459c.m23660c();
        if (str == null) {
            list = Collections.EMPTY_LIST;
        } else {
            list = Arrays.asList(str.split(","));
        }
        this.f20453d = list;
        str = (String) C5471a.f20460d.m23660c();
        if (str == null) {
            list = Collections.EMPTY_LIST;
        } else {
            list = Arrays.asList(str.split(","));
        }
        this.f20454e = list;
        str = (String) C5471a.f20461e.m23660c();
        if (str == null) {
            list = Collections.EMPTY_LIST;
        } else {
            list = Arrays.asList(str.split(","));
        }
        this.f20455f = list;
        this.f20456h = new C5474f(1024, ((Long) C5471a.f20462f.m23660c()).longValue());
    }

    /* renamed from: a */
    public final void m23823a(Context context, ServiceConnection serviceConnection) {
        m23821a(context, serviceConnection, null, null, 1);
        context.unbindService(serviceConnection);
    }

    /* renamed from: a */
    public final void m23824a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
        m23821a(context, serviceConnection, str, intent, 3);
    }

    /* renamed from: b */
    public final void m23826b(Context context, ServiceConnection serviceConnection) {
        m23821a(context, serviceConnection, null, null, 4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m23821a(android.content.Context r20, android.content.ServiceConnection r21, java.lang.String r22, android.content.Intent r23, int r24) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r7 = r22;
        r2 = r23;
        r5 = r24;
        r3 = com.google.android.m4b.maps.p110j.C5439e.f20393c;
        if (r3 != 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r3 = android.os.Process.myPid();
        r3 = (long) r3;
        r6 = 32;
        r3 = r3 << r6;
        r6 = java.lang.System.identityHashCode(r21);
        r8 = (long) r6;
        r10 = r3 | r8;
        r11 = java.lang.String.valueOf(r10);
        r3 = com.google.android.m4b.maps.p112l.C5470c.m23822b();
        r4 = 4;
        r6 = 1;
        r8 = 0;
        if (r3 == 0) goto L_0x0095;
    L_0x002b:
        r9 = r0.f20456h;
        if (r9 != 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0095;
    L_0x0030:
        if (r5 == r4) goto L_0x008c;
    L_0x0032:
        if (r5 != r6) goto L_0x0035;
    L_0x0034:
        goto L_0x008c;
    L_0x0035:
        r9 = com.google.android.m4b.maps.p112l.C5470c.m23819a(r1, r2);
        if (r9 != 0) goto L_0x0052;
    L_0x003b:
        r3 = "ConnectionTracker";
        r9 = "Client %s made an invalid request %s";
        r10 = 2;
        r10 = new java.lang.Object[r10];
        r10[r8] = r7;
        r12 = r2.toUri(r8);
        r10[r6] = r12;
        r9 = java.lang.String.format(r9, r10);
        android.util.Log.w(r3, r9);
        goto L_0x0095;
    L_0x0052:
        r10 = com.google.android.m4b.maps.p113m.C5480g.m23842a(r20);
        r12 = r9.processName;
        r9 = r9.name;
        r13 = r0.f20452c;
        r13 = r13.contains(r10);
        if (r13 != 0) goto L_0x0095;
    L_0x0062:
        r13 = r0.f20453d;
        r13 = r13.contains(r7);
        if (r13 != 0) goto L_0x0095;
    L_0x006a:
        r13 = r0.f20454e;
        r13 = r13.contains(r12);
        if (r13 != 0) goto L_0x0095;
    L_0x0072:
        r13 = r0.f20455f;
        r9 = r13.contains(r9);
        if (r9 != 0) goto L_0x0095;
    L_0x007a:
        r9 = r12.equals(r10);
        if (r9 == 0) goto L_0x0086;
    L_0x0080:
        r9 = com.google.android.m4b.maps.p112l.C5473e.f20467c;
        r3 = r3 & r9;
        if (r3 == 0) goto L_0x0086;
    L_0x0085:
        goto L_0x0095;
    L_0x0086:
        r3 = r0.f20456h;
        r3.m23827a(r11);
        goto L_0x0094;
    L_0x008c:
        r3 = r0.f20456h;
        r3 = r3.m23828b(r11);
        if (r3 == 0) goto L_0x0095;
    L_0x0094:
        r8 = 1;
    L_0x0095:
        if (r8 != 0) goto L_0x0098;
    L_0x0097:
        return;
    L_0x0098:
        r8 = java.lang.System.currentTimeMillis();
        r3 = 0;
        r10 = com.google.android.m4b.maps.p112l.C5470c.m23822b();
        r12 = com.google.android.m4b.maps.p112l.C5473e.f20466b;
        r10 = r10 & r12;
        if (r10 == 0) goto L_0x00ac;
    L_0x00a6:
        r3 = 3;
        r10 = 5;
        r3 = com.google.android.m4b.maps.p113m.C5480g.m23841a(r3, r10);
    L_0x00ac:
        r10 = r3;
        r12 = 0;
        r3 = com.google.android.m4b.maps.p112l.C5470c.m23822b();
        r14 = com.google.android.m4b.maps.p112l.C5473e.f20468d;
        r3 = r3 & r14;
        if (r3 == 0) goto L_0x00bc;
    L_0x00b8:
        r12 = android.os.Debug.getNativeHeapAllocatedSize();
    L_0x00bc:
        r14 = r12;
        if (r5 == r6) goto L_0x00df;
    L_0x00bf:
        if (r5 != r4) goto L_0x00c2;
    L_0x00c1:
        goto L_0x00df;
    L_0x00c2:
        r2 = com.google.android.m4b.maps.p112l.C5470c.m23819a(r1, r2);
        r16 = new com.google.android.m4b.maps.l.a;
        r6 = com.google.android.m4b.maps.p113m.C5480g.m23842a(r20);
        r12 = r2.processName;
        r13 = r2.name;
        r17 = android.os.SystemClock.elapsedRealtime();
        r2 = r16;
        r3 = r8;
        r8 = r12;
        r9 = r13;
        r12 = r17;
        r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r14);
        goto L_0x00f3;
    L_0x00df:
        r16 = new com.google.android.m4b.maps.l.a;
        r6 = 0;
        r7 = 0;
        r12 = 0;
        r13 = 0;
        r17 = android.os.SystemClock.elapsedRealtime();
        r2 = r16;
        r3 = r8;
        r8 = r12;
        r9 = r13;
        r12 = r17;
        r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r14);
    L_0x00f3:
        r3 = new android.content.Intent;
        r3.<init>();
        r4 = f20451g;
        r3 = r3.setComponent(r4);
        r4 = "com.google.android.gms.common.stats.EXTRA_LOG_EVENT";
        r2 = r3.putExtra(r4, r2);
        r1.startService(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.l.c.a(android.content.Context, android.content.ServiceConnection, java.lang.String, android.content.Intent, int):void");
    }

    /* renamed from: a */
    private static ServiceInfo m23819a(Context context, Intent intent) {
        context = context.getPackageManager().queryIntentServices(intent, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        if (context != null) {
            if (context.size() != 0) {
                if (context.size() > 1) {
                    Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), C5480g.m23841a(3, 20)}));
                    intent = context.iterator();
                    if (intent.hasNext()) {
                        Log.w("ConnectionTracker", ((ResolveInfo) intent.next()).serviceInfo.name);
                        return null;
                    }
                }
                return ((ResolveInfo) context.get(0)).serviceInfo;
            }
        }
        Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), C5480g.m23841a(3, 20)}));
        return null;
    }

    /* renamed from: a */
    public final boolean m23825a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        i = intent.getComponent();
        if (i != 0) {
            if (!C5439e.f20393c || !"com.google.android.gms".equals(i.getPackageName())) {
                i = C5476b.m23832a(context, i.getPackageName());
                if (i == 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
                m23821a(context, serviceConnection, str, intent, 2);
                return context.bindService(intent, serviceConnection, 129);
            }
        }
        i = 0;
        if (i == 0) {
            m23821a(context, serviceConnection, str, intent, 2);
            return context.bindService(intent, serviceConnection, 129);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    /* renamed from: b */
    private static int m23822b() {
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
        r1 = com.google.android.m4b.maps.p110j.C5439e.f20393c;	 Catch:{ SecurityException -> 0x0028 }
        if (r1 == 0) goto L_0x0017;	 Catch:{ SecurityException -> 0x0028 }
    L_0x0005:
        r1 = com.google.android.m4b.maps.p109i.C5435a.m23658b();	 Catch:{ SecurityException -> 0x0028 }
        if (r1 == 0) goto L_0x0017;	 Catch:{ SecurityException -> 0x0028 }
    L_0x000b:
        r1 = com.google.android.m4b.maps.p109i.C5435a.m23653a();	 Catch:{ SecurityException -> 0x0028 }
        r2 = android.os.Process.myUid();	 Catch:{ SecurityException -> 0x0028 }
        if (r1 != r2) goto L_0x0017;	 Catch:{ SecurityException -> 0x0028 }
    L_0x0015:
        r1 = 1;	 Catch:{ SecurityException -> 0x0028 }
        goto L_0x0018;	 Catch:{ SecurityException -> 0x0028 }
    L_0x0017:
        r1 = 0;	 Catch:{ SecurityException -> 0x0028 }
    L_0x0018:
        if (r1 == 0) goto L_0x0027;	 Catch:{ SecurityException -> 0x0028 }
    L_0x001a:
        r1 = com.google.android.m4b.maps.p112l.C5472d.C5471a.f20457a;	 Catch:{ SecurityException -> 0x0028 }
        r1 = r1.m23660c();	 Catch:{ SecurityException -> 0x0028 }
        r1 = (java.lang.Integer) r1;	 Catch:{ SecurityException -> 0x0028 }
        r1 = r1.intValue();	 Catch:{ SecurityException -> 0x0028 }
        return r1;
    L_0x0027:
        return r0;
    L_0x0028:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.l.c.b():int");
    }
}
