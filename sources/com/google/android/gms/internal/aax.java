package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class aax implements aqh {
    /* renamed from: a */
    private final Map<String, List<aom<?>>> f22871a = new HashMap();
    /* renamed from: b */
    private final tq f22872b;

    aax(tq tqVar) {
        this.f22872b = tqVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final synchronized boolean m26981b(com.google.android.gms.internal.aom<?> r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r6.m19392e();	 Catch:{ all -> 0x0052 }
        r1 = r5.f22871a;	 Catch:{ all -> 0x0052 }
        r1 = r1.containsKey(r0);	 Catch:{ all -> 0x0052 }
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x003a;
    L_0x000f:
        r1 = r5.f22871a;	 Catch:{ all -> 0x0052 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0052 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0052 }
        if (r1 != 0) goto L_0x001e;
    L_0x0019:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0052 }
        r1.<init>();	 Catch:{ all -> 0x0052 }
    L_0x001e:
        r4 = "waiting-for-response";
        r6.m19388b(r4);	 Catch:{ all -> 0x0052 }
        r1.add(r6);	 Catch:{ all -> 0x0052 }
        r6 = r5.f22871a;	 Catch:{ all -> 0x0052 }
        r6.put(r0, r1);	 Catch:{ all -> 0x0052 }
        r6 = com.google.android.gms.internal.cg.f15916a;	 Catch:{ all -> 0x0052 }
        if (r6 == 0) goto L_0x0038;
    L_0x002f:
        r6 = "Request for cacheKey=%s is in flight, putting on hold.";
        r1 = new java.lang.Object[r3];	 Catch:{ all -> 0x0052 }
        r1[r2] = r0;	 Catch:{ all -> 0x0052 }
        com.google.android.gms.internal.cg.m19569b(r6, r1);	 Catch:{ all -> 0x0052 }
    L_0x0038:
        monitor-exit(r5);
        return r3;
    L_0x003a:
        r1 = r5.f22871a;	 Catch:{ all -> 0x0052 }
        r4 = 0;
        r1.put(r0, r4);	 Catch:{ all -> 0x0052 }
        r6.m19382a(r5);	 Catch:{ all -> 0x0052 }
        r6 = com.google.android.gms.internal.cg.f15916a;	 Catch:{ all -> 0x0052 }
        if (r6 == 0) goto L_0x0050;
    L_0x0047:
        r6 = "new request, sending to network %s";
        r1 = new java.lang.Object[r3];	 Catch:{ all -> 0x0052 }
        r1[r2] = r0;	 Catch:{ all -> 0x0052 }
        com.google.android.gms.internal.cg.m19569b(r6, r1);	 Catch:{ all -> 0x0052 }
    L_0x0050:
        monitor-exit(r5);
        return r2;
    L_0x0052:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aax.b(com.google.android.gms.internal.aom):boolean");
    }

    /* renamed from: a */
    public final synchronized void mo4168a(aom<?> aom) {
        String e = aom.m19392e();
        List list = (List) this.f22871a.remove(e);
        if (!(list == null || list.isEmpty())) {
            if (cg.f15916a) {
                cg.m19567a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), e);
            }
            aom aom2 = (aom) list.remove(0);
            this.f22871a.put(e, list);
            aom2.m19382a((aqh) this);
            try {
                this.f22872b.f16540c.put(aom2);
            } catch (InterruptedException e2) {
                cg.m19570c("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f22872b.m20190a();
            }
        }
    }

    /* renamed from: a */
    public final void mo4169a(aom<?> aom, asu<?> asu) {
        if (asu.f15690b != null) {
            if (!asu.f15690b.m20148a()) {
                List<aom> list;
                String e = aom.m19392e();
                synchronized (this) {
                    list = (List) this.f22871a.remove(e);
                }
                if (list != null) {
                    if (cg.f15916a) {
                        cg.m19567a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), e);
                    }
                    for (aom zzb : list) {
                        this.f22872b.f16542e.zzb(zzb, asu);
                    }
                }
                return;
            }
        }
        mo4168a(aom);
    }
}
