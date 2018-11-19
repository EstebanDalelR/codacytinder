package com.tinder.analytics.performance;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.p076a.C2640a;
import com.tinder.core.experiment.AbTestUtility;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeUtils;
import p000a.p001a.C0001a;

public abstract class ag extends AddInstrumentationEvent {
    /* renamed from: a */
    private final Map<String, C6236a> f28654a = new HashMap();

    /* renamed from: com.tinder.analytics.performance.ag$a */
    private class C6236a {
        /* renamed from: a */
        final /* synthetic */ ag f22806a;
        /* renamed from: b */
        private final long f22807b;
        /* renamed from: c */
        private long f22808c;

        C6236a(ag agVar, long j) {
            this.f22806a = agVar;
            this.f22807b = j;
        }

        /* renamed from: a */
        long m26942a() {
            return this.f22807b;
        }

        /* renamed from: b */
        long m26944b() {
            return this.f22808c;
        }

        /* renamed from: a */
        void m26943a(long j) {
            this.f22808c = j;
        }
    }

    ag(@NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility) {
        super(c2630h, abTestUtility);
    }

    /* renamed from: a */
    public synchronized void m33922a(String str) {
        long a = DateTimeUtils.a();
        if (this.f28654a.containsKey(str)) {
            this.f28654a.remove(str);
            C0001a.b("Timer with key {%s} was found and removed. Restarting timer.", new Object[]{str});
        }
        this.f28654a.put(str, new C6236a(this, a));
        C0001a.b("Timer with key {%s} has started.", new Object[]{str});
    }

    /* renamed from: b */
    public synchronized void m33923b(String str) {
        long a = DateTimeUtils.a();
        if (this.f28654a.containsKey(str)) {
            ((C6236a) this.f28654a.get(str)).m26943a(a);
            C0001a.b("Timer with key {%s} has stopped.", new Object[]{str});
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No Timer with key {");
            stringBuilder.append(str);
            stringBuilder.append("} has been started. Please start the Timer before trying to stop it.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public synchronized long m33924c(String str) {
        C6236a c6236a;
        Object obj = this.f28654a.get(str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No Timer with key {");
        stringBuilder.append(str);
        stringBuilder.append("} exists. Please start and stop the Timer before trying to access it's runtime duration.");
        c6236a = (C6236a) C2640a.a(obj, stringBuilder.toString());
        boolean z = c6236a.m26942a() > 0;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Timer with key {");
        stringBuilder2.append(str);
        stringBuilder2.append("} has not be started yet. Please start the timer before trying to access it's runtime duration.");
        C2640a.b(z, stringBuilder2.toString());
        boolean z2 = c6236a.m26944b() > 0;
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Timer with key {");
        stringBuilder3.append(str);
        stringBuilder3.append("} has not be stopped yet. Please stop the timer before trying to access it's runtime duration.");
        C2640a.b(z2, stringBuilder3.toString());
        C0001a.b("Timer with key {%s} ran for %d milliseconds", new Object[]{str, Long.valueOf(c6236a.m26944b() - c6236a.m26942a())});
        return c6236a.m26944b() - c6236a.m26942a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public synchronized boolean m33925d(java.lang.String r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f28654a;	 Catch:{ all -> 0x0026 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0026 }
        r0 = (com.tinder.analytics.performance.ag.C6236a) r0;	 Catch:{ all -> 0x0026 }
        r1 = 1;
        r2 = 0;
        if (r0 != 0) goto L_0x0018;
    L_0x000d:
        r0 = "Timer with key {%s} does not exist.";
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x0026 }
        r1[r2] = r8;	 Catch:{ all -> 0x0026 }
        p000a.p001a.C0001a.b(r0, r1);	 Catch:{ all -> 0x0026 }
        monitor-exit(r7);
        return r2;
    L_0x0018:
        r3 = r0.m26942a();	 Catch:{ all -> 0x0026 }
        r5 = 0;
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r8 <= 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0024;
    L_0x0023:
        r1 = 0;
    L_0x0024:
        monitor-exit(r7);
        return r1;
    L_0x0026:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.analytics.performance.ag.d(java.lang.String):boolean");
    }
}
