package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.ae.C7397a;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.cg.bd.C5147a;
import com.google.android.m4b.maps.cg.bg.C5148a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.PolygonOptions;
import com.google.android.m4b.maps.model.internal.IPolygonDelegate;
import com.google.android.m4b.maps.model.internal.IPolygonDelegate.Stub;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class bh extends Stub implements C5147a, bg {
    /* renamed from: a */
    private static final PolygonOptions f27938a = new PolygonOptions();
    /* renamed from: b */
    private static AtomicInteger f27939b = new AtomicInteger(0);
    /* renamed from: c */
    private final String f27940c = String.format("pg%d", new Object[]{Integer.valueOf(f27939b.getAndIncrement())});
    /* renamed from: d */
    private final bd f27941d;
    /* renamed from: e */
    private final cb f27942e;
    /* renamed from: f */
    private C5148a f27943f;
    /* renamed from: g */
    private final aa f27944g;
    /* renamed from: h */
    private ae<LatLng> f27945h;
    /* renamed from: i */
    private ae<LatLng> f27946i;
    /* renamed from: j */
    private ae<ae<LatLng>> f27947j;
    /* renamed from: k */
    private ae<ae<LatLng>> f27948k;
    /* renamed from: l */
    private int f27949l;
    /* renamed from: m */
    private int f27950m;
    /* renamed from: n */
    private float f27951n;
    /* renamed from: o */
    private float f27952o;
    /* renamed from: p */
    private boolean f27953p;
    /* renamed from: q */
    private boolean f27954q;
    /* renamed from: r */
    private boolean f27955r;

    bh(PolygonOptions polygonOptions, bd bdVar, cb cbVar, aa aaVar) {
        this.f27941d = (bd) C5571j.m24292a((Object) bdVar);
        this.f27942e = (cb) C5571j.m24292a((Object) cbVar);
        this.f27944g = (aa) C5571j.m24292a((Object) aaVar);
        boolean z = true;
        if (polygonOptions.getStrokeWidth() < null) {
            z = null;
        }
        C5571j.m24298a(z, (Object) "line width is negative");
        this.f27951n = polygonOptions.getStrokeWidth();
        this.f27949l = polygonOptions.getStrokeColor();
        this.f27950m = polygonOptions.getFillColor();
        this.f27952o = polygonOptions.getZIndex();
        this.f27954q = polygonOptions.isVisible();
        this.f27953p = polygonOptions.isGeodesic();
        this.f27945h = m32903a(polygonOptions.getPoints());
        bdVar = ae.m27686g();
        for (List a : polygonOptions.getHoles()) {
            bdVar.m31831c(m32903a(a));
        }
        this.f27947j = bdVar.m31828a();
        m32905i();
        if (polygonOptions.getStrokeColor() != f27938a.getStrokeColor()) {
            this.f27942e.mo5310b(C5164a.POLYGON_STROKE_COLOR);
        }
        if (polygonOptions.getStrokeWidth() != f27938a.getStrokeWidth()) {
            this.f27942e.mo5310b(C5164a.POLYGON_WIDTH);
        }
        if (polygonOptions.isGeodesic() != f27938a.isGeodesic()) {
            this.f27942e.mo5310b(C5164a.POLYGON_GEODESIC);
        }
        if (polygonOptions.isVisible() != f27938a.isVisible()) {
            this.f27942e.mo5310b(C5164a.POLYGON_VISIBILITY);
        }
        if (polygonOptions.getZIndex() != f27938a.getZIndex()) {
            this.f27942e.mo5310b(C5164a.POLYGON_Z_INDEX);
        }
        if (polygonOptions.getHoles() != f27938a.getHoles()) {
            this.f27942e.mo5310b(C5164a.POLYGON_HOLES);
        }
    }

    /* renamed from: a */
    final void m32907a(C5148a c5148a) {
        this.f27943f = c5148a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m32904a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f27955r;	 Catch:{ all -> 0x0012 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        return;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        r0 = r1.f27943f;
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r1.f27943f;
        r0.mo4985a(r2);
    L_0x0011:
        return;
    L_0x0012:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.bh.a(int):void");
    }

    /* renamed from: a */
    private static ae<LatLng> m32903a(List<LatLng> list) {
        C7397a g = ae.m27686g();
        g.m31830b((Iterable) list);
        if (!((LatLng) list.get(0)).equals(list.get(list.size() - 1))) {
            g.m31831c(list.get(0));
        }
        return g.m31828a();
    }

    /* renamed from: i */
    private synchronized void m32905i() {
        if (this.f27953p) {
            this.f27946i = C5187r.m23181a(this.f27945h);
            C7397a g = ae.m27686g();
            Iterator a = this.f27947j.mo4785a();
            while (a.hasNext()) {
                g.m31831c(C5187r.m23181a((ae) a.next()));
            }
            this.f27948k = g.m31828a();
            return;
        }
        this.f27946i = this.f27945h;
        this.f27948k = this.f27947j;
    }

    public final void remove() {
        this.f27944g.mo4875a();
        this.f27942e.mo5310b(C5164a.POLYGON_REMOVE);
        mo7180a();
        this.f27941d.m22949b(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo7180a() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f27955r;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        return;
    L_0x0007:
        r0 = 1;
        r1.f27955r = r0;	 Catch:{ all -> 0x0015 }
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        r0 = r1.f27943f;
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r1.f27943f;
        r0.mo4984a();
    L_0x0014:
        return;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.bh.a():void");
    }

    public final String getId() {
        return this.f27940c;
    }

    public final void setPoints(List<LatLng> list) {
        this.f27944g.mo4875a();
        this.f27942e.mo5310b(C5164a.POLYGON_SET_POINTS);
        synchronized (this) {
            this.f27945h = m32903a((List) list);
            m32905i();
        }
        m32904a(1);
    }

    public final List<LatLng> getPoints() {
        List a;
        this.f27944g.mo4875a();
        synchronized (this) {
            a = au.m20525a(this.f27945h);
        }
        return a;
    }

    /* renamed from: b */
    public final synchronized ae<LatLng> mo7181b() {
        return this.f27946i;
    }

    public final void setHoles(List list) {
        this.f27944g.mo4875a();
        this.f27942e.mo5310b(C5164a.POLYGON_HOLES);
        C7397a g = ae.m27686g();
        for (List a : list) {
            g.m31831c(m32903a(a));
        }
        synchronized (this) {
            this.f27947j = g.m31828a();
            m32905i();
        }
        m32904a(2);
    }

    public final List getHoles() {
        ae aeVar;
        this.f27944g.mo4875a();
        synchronized (this) {
            aeVar = this.f27947j;
        }
        List arrayList = new ArrayList();
        Iterator a = aeVar.mo4785a();
        while (a.hasNext()) {
            arrayList.add(au.m20525a((ae) a.next()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized ae<ae<LatLng>> mo7182c() {
        return this.f27948k;
    }

    public final void setStrokeColor(int i) {
        this.f27944g.mo4875a();
        this.f27942e.mo5310b(C5164a.POLYGON_STROKE_COLOR);
        synchronized (this) {
            this.f27949l = i;
        }
        m32904a(8);
    }

    public final synchronized int getStrokeColor() {
        this.f27944g.mo4875a();
        return mo7183d();
    }

    /* renamed from: d */
    public final synchronized int mo7183d() {
        return this.f27949l;
    }

    public final void setFillColor(int i) {
        this.f27944g.mo4875a();
        this.f27942e.mo5310b(C5164a.POLYGON_FILL_COLOR);
        synchronized (this) {
            this.f27950m = i;
        }
        m32904a(16);
    }

    public final synchronized int getFillColor() {
        this.f27944g.mo4875a();
        return mo7184e();
    }

    /* renamed from: e */
    public final synchronized int mo7184e() {
        return this.f27950m;
    }

    public final void setStrokeWidth(float f) {
        this.f27944g.mo4875a();
        this.f27942e.mo5310b(C5164a.POLYGON_WIDTH);
        C5571j.m24298a(f >= 0.0f, (Object) "line width is negative");
        synchronized (this) {
            this.f27951n = f;
        }
        m32904a((int) 5.6E-45f);
    }

    public final synchronized float getStrokeWidth() {
        this.f27944g.mo4875a();
        return mo7185f();
    }

    /* renamed from: f */
    public final synchronized float mo7185f() {
        return this.f27951n;
    }

    public final void setZIndex(float f) {
        this.f27944g.mo4875a();
        this.f27942e.mo5310b(C5164a.POLYGON_Z_INDEX);
        synchronized (this) {
            this.f27952o = f;
        }
        m32904a((int) 9.0E-44f);
    }

    public final synchronized float getZIndex() {
        this.f27944g.mo4875a();
        return mo7186g();
    }

    /* renamed from: g */
    public final synchronized float mo7186g() {
        return this.f27952o;
    }

    public final void setGeodesic(boolean z) {
        this.f27944g.mo4875a();
        this.f27942e.mo5310b(C5164a.POLYGON_GEODESIC);
        synchronized (this) {
            this.f27953p = z;
            m32905i();
        }
        m32904a((int) true);
    }

    public final synchronized boolean isGeodesic() {
        this.f27944g.mo4875a();
        return this.f27953p;
    }

    public final void setVisible(boolean z) {
        this.f27944g.mo4875a();
        this.f27942e.mo5310b(C5164a.POLYGON_VISIBILITY);
        synchronized (this) {
            this.f27954q = z;
        }
        m32904a((int) true);
    }

    public final synchronized boolean isVisible() {
        this.f27944g.mo4875a();
        return mo7187h();
    }

    /* renamed from: h */
    public final synchronized boolean mo7187h() {
        return this.f27954q;
    }

    public final boolean equalsRemote(IPolygonDelegate iPolygonDelegate) {
        return equals(iPolygonDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }
}
