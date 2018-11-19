package com.google.android.m4b.maps.bm;

import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bm.C4824c.C4823a;
import com.google.android.m4b.maps.bm.C6478b.C4822b;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bq.C4870j;
import com.google.android.m4b.maps.bq.C4870j.C4869a;
import com.google.android.m4b.maps.bq.C4872l;
import com.google.android.m4b.maps.bq.C6534d;
import com.google.android.m4b.maps.bw.C4976e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.m4b.maps.bm.k */
public final class C6490k implements C4822b, C4824c {
    /* renamed from: b */
    private final C4870j f24065b;
    /* renamed from: c */
    private final C6534d f24066c;
    /* renamed from: d */
    private final C4869a f24067d;
    /* renamed from: e */
    private final Map<ba, C6478b> f24068e = ax.m20623b();
    /* renamed from: f */
    private final C4976e<ba, Collection<C4820a>> f24069f = new C4976e(48);
    /* renamed from: g */
    private final Set<C4823a> f24070g = new CopyOnWriteArraySet();
    /* renamed from: h */
    private volatile int f24071h;
    /* renamed from: i */
    private volatile int f24072i;
    /* renamed from: j */
    private volatile int f24073j;

    /* renamed from: com.google.android.m4b.maps.bm.k$1 */
    class C64891 implements C4869a {
        /* renamed from: a */
        private /* synthetic */ C6490k f24064a;

        C64891(C6490k c6490k) {
            this.f24064a = c6490k;
        }

        /* renamed from: a */
        public final void mo5092a() {
            this.f24064a.m28523a();
        }

        /* renamed from: a */
        public final void mo5093a(az azVar) {
            synchronized (this.f24064a.f24068e) {
                C6478b c6478b = (C6478b) this.f24064a.f24068e.remove(azVar.mo5099d());
            }
            synchronized (this.f24064a.f24069f) {
                Collection collection = (Collection) this.f24064a.f24069f.m22254c(azVar.mo5099d());
            }
            if (c6478b != null || collection != null) {
                if (C4728u.m21050a("TileBasedBuildingBoundProvider", 3)) {
                    azVar = String.valueOf(azVar.mo5099d());
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(azVar).length() + 33);
                    stringBuilder.append("Removed data for ");
                    stringBuilder.append(azVar);
                    stringBuilder.append(" from the cache ");
                    Log.d("TileBasedBuildingBoundProvider", stringBuilder.toString());
                }
                this.f24064a.m28520b();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5084a(C4699a c4699a) {
        return false;
    }

    public C6490k() {
        if (C4872l.m21829a(bg.f17745a)) {
            this.f24065b = C4872l.m21830b(bg.f17745a);
            this.f24066c = C6534d.m28802a();
            this.f24067d = new C64891(this);
            this.f24065b.mo7080a(this.f24067d);
            return;
        }
        this.f24065b = null;
        this.f24066c = null;
        this.f24067d = null;
    }

    /* renamed from: a */
    public final Collection<C4820a> mo5082a(ba baVar) {
        this.f24071h++;
        Object a = baVar.m21619b() > 14 ? baVar.m21612a(14) : baVar;
        synchronized (this.f24069f) {
            Collection collection = (Collection) this.f24069f.m22251b(a);
        }
        if (collection != null) {
            this.f24072i++;
            return C4820a.m21385a(collection, baVar.m21626i());
        }
        baVar = null;
        synchronized (this.f24068e) {
            C6478b c6478b = (C6478b) this.f24068e.get(a);
            if (c6478b == null) {
                c6478b = new C6478b(this.f24065b, this.f24066c, a);
                this.f24068e.put(a, c6478b);
                baVar = true;
            }
        }
        if (baVar != null) {
            c6478b.m28431a((C4822b) this);
            this.f24073j += 1;
        }
        return C4824c.f17615a;
    }

    /* renamed from: a */
    public final void m28523a() {
        synchronized (this.f24068e) {
            this.f24068e.clear();
        }
        synchronized (this.f24069f) {
            this.f24069f.m22247a();
        }
        m28520b();
    }

    /* renamed from: b */
    private void m28520b() {
        for (C4823a a : this.f24070g) {
            a.mo7553a();
        }
    }

    /* renamed from: a */
    public final void mo5083a(C4823a c4823a) {
        this.f24070g.add(c4823a);
    }

    /* renamed from: b */
    public final void mo5085b(C4823a c4823a) {
        this.f24070g.remove(c4823a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo5095a(com.google.android.m4b.maps.bm.C6478b r4, java.util.Collection<com.google.android.m4b.maps.bm.C4820a> r5) {
        /*
        r3 = this;
        r0 = r3.f24068e;
        monitor-enter(r0);
        r1 = r3.f24068e;	 Catch:{ all -> 0x0034 }
        r2 = r4.m28429a();	 Catch:{ all -> 0x0034 }
        r1 = r1.get(r2);	 Catch:{ all -> 0x0034 }
        r1 = (com.google.android.m4b.maps.bm.C6478b) r1;	 Catch:{ all -> 0x0034 }
        if (r1 == r4) goto L_0x0013;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        return;
    L_0x0013:
        r1 = r3.f24068e;	 Catch:{ all -> 0x0034 }
        r2 = r4.m28429a();	 Catch:{ all -> 0x0034 }
        r1.remove(r2);	 Catch:{ all -> 0x0034 }
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        if (r5 == 0) goto L_0x0033;
    L_0x001f:
        r0 = r3.f24069f;
        monitor-enter(r0);
        r1 = r3.f24069f;	 Catch:{ all -> 0x0030 }
        r4 = r4.m28429a();	 Catch:{ all -> 0x0030 }
        r1.m22255c(r4, r5);	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        r3.m28520b();
        goto L_0x0033;
    L_0x0030:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r4;
    L_0x0033:
        return;
    L_0x0034:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bm.k.a(com.google.android.m4b.maps.bm.b, java.util.Collection):void");
    }
}
