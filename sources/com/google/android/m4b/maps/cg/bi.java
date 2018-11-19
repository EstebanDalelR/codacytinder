package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.cg.bd.C5147a;
import com.google.android.m4b.maps.cg.bg.C5148a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.PolylineOptions;
import com.google.android.m4b.maps.model.internal.IPolylineDelegate;
import com.google.android.m4b.maps.model.internal.IPolylineDelegate.Stub;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class bi extends Stub implements C5147a, bg {
    /* renamed from: a */
    private static final PolylineOptions f27956a = new PolylineOptions();
    /* renamed from: b */
    private static AtomicInteger f27957b = new AtomicInteger(0);
    /* renamed from: c */
    private final String f27958c = String.format("pl%d", new Object[]{Integer.valueOf(f27957b.getAndIncrement())});
    /* renamed from: d */
    private final bd f27959d;
    /* renamed from: e */
    private final cb f27960e;
    /* renamed from: f */
    private C5148a f27961f;
    /* renamed from: g */
    private final aa f27962g;
    /* renamed from: h */
    private ae<LatLng> f27963h;
    /* renamed from: i */
    private ae<LatLng> f27964i;
    /* renamed from: j */
    private int f27965j;
    /* renamed from: k */
    private float f27966k;
    /* renamed from: l */
    private boolean f27967l;
    /* renamed from: m */
    private float f27968m;
    /* renamed from: n */
    private boolean f27969n;
    /* renamed from: o */
    private boolean f27970o;

    /* renamed from: e */
    public final int mo7184e() {
        return 0;
    }

    public final /* synthetic */ List getPoints() {
        return m32916i();
    }

    bi(PolylineOptions polylineOptions, bd bdVar, cb cbVar, aa aaVar) {
        this.f27959d = (bd) C5571j.m24292a((Object) bdVar);
        this.f27960e = (cb) C5571j.m24292a((Object) cbVar);
        this.f27962g = (aa) C5571j.m24292a((Object) aaVar);
        boolean z = true;
        if (polylineOptions.getWidth() < null) {
            z = null;
        }
        C5571j.m24298a(z, (Object) "line width is negative");
        this.f27966k = polylineOptions.getWidth();
        this.f27965j = polylineOptions.getColor();
        this.f27968m = polylineOptions.getZIndex();
        this.f27970o = polylineOptions.isVisible();
        this.f27969n = polylineOptions.isGeodesic();
        this.f27963h = ae.m27681a(polylineOptions.getPoints());
        m32917j();
        if (polylineOptions.getColor() != f27956a.getColor()) {
            this.f27960e.mo5310b(C5164a.POLYLINE_COLOR);
        }
        if (polylineOptions.getWidth() != f27956a.getWidth()) {
            this.f27960e.mo5310b(C5164a.POLYLINE_WIDTH);
        }
        if (polylineOptions.isGeodesic() != f27956a.isGeodesic()) {
            this.f27960e.mo5310b(C5164a.POLYLINE_GEODESIC);
        }
        if (polylineOptions.isVisible() != f27956a.isVisible()) {
            this.f27960e.mo5310b(C5164a.POLYLINE_VISIBILITY);
        }
        if (polylineOptions.getZIndex() != f27956a.getZIndex()) {
            this.f27960e.mo5310b(C5164a.POLYLINE_Z_INDEX);
        }
    }

    /* renamed from: a */
    final void m32919a(C5148a c5148a) {
        this.f27961f = c5148a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m32915a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f27967l;	 Catch:{ all -> 0x0012 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        return;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        r0 = r1.f27961f;
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r1.f27961f;
        r0.mo4985a(r2);
    L_0x0011:
        return;
    L_0x0012:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.bi.a(int):void");
    }

    public final void remove() {
        this.f27962g.mo4875a();
        this.f27960e.mo5310b(C5164a.POLYLINE_REMOVE);
        mo7180a();
        this.f27959d.m22949b(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo7180a() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f27967l;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        return;
    L_0x0007:
        r0 = 1;
        r1.f27967l = r0;	 Catch:{ all -> 0x0015 }
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        r0 = r1.f27961f;
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r1.f27961f;
        r0.mo4984a();
    L_0x0014:
        return;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.bi.a():void");
    }

    public final String getId() {
        return this.f27958c;
    }

    public final void setPoints(List<LatLng> list) {
        this.f27962g.mo4875a();
        this.f27960e.mo5310b(C5164a.POLYLINE_SET_POINTS);
        synchronized (this) {
            this.f27963h = ae.m27681a((Collection) list);
            m32917j();
        }
        m32915a(1);
    }

    /* renamed from: i */
    private synchronized ae<LatLng> m32916i() {
        this.f27962g.mo4875a();
        return this.f27963h;
    }

    /* renamed from: j */
    private synchronized void m32917j() {
        this.f27964i = this.f27969n ? C5187r.m23181a(this.f27963h) : this.f27963h;
    }

    /* renamed from: b */
    public final synchronized ae<LatLng> mo7181b() {
        return this.f27964i;
    }

    public final void setColor(int i) {
        this.f27962g.mo4875a();
        this.f27960e.mo5310b(C5164a.POLYLINE_COLOR);
        synchronized (this) {
            this.f27965j = i;
        }
        m32915a(8);
    }

    public final synchronized int getColor() {
        this.f27962g.mo4875a();
        return mo7183d();
    }

    /* renamed from: d */
    public final synchronized int mo7183d() {
        return this.f27965j;
    }

    public final void setWidth(float f) {
        this.f27962g.mo4875a();
        this.f27960e.mo5310b(C5164a.POLYLINE_WIDTH);
        C5571j.m24298a(f >= 0.0f, (Object) "line width is negative");
        synchronized (this) {
            this.f27966k = f;
        }
        m32915a((int) 5.6E-45f);
    }

    public final synchronized float getWidth() {
        this.f27962g.mo4875a();
        return mo7185f();
    }

    /* renamed from: f */
    public final synchronized float mo7185f() {
        return this.f27966k;
    }

    public final void setZIndex(float f) {
        this.f27962g.mo4875a();
        this.f27960e.mo5310b(C5164a.POLYLINE_Z_INDEX);
        synchronized (this) {
            this.f27968m = f;
        }
        m32915a((int) 9.0E-44f);
    }

    public final synchronized float getZIndex() {
        this.f27962g.mo4875a();
        return mo7186g();
    }

    /* renamed from: g */
    public final synchronized float mo7186g() {
        return this.f27968m;
    }

    public final void setGeodesic(boolean z) {
        this.f27962g.mo4875a();
        this.f27960e.mo5310b(C5164a.POLYLINE_GEODESIC);
        synchronized (this) {
            this.f27969n = z;
            m32917j();
        }
        m32915a((int) true);
    }

    public final synchronized boolean isGeodesic() {
        this.f27962g.mo4875a();
        return this.f27969n;
    }

    public final void setVisible(boolean z) {
        this.f27962g.mo4875a();
        this.f27960e.mo5310b(C5164a.POLYLINE_VISIBILITY);
        synchronized (this) {
            this.f27970o = z;
        }
        m32915a((int) true);
    }

    public final synchronized boolean isVisible() {
        this.f27962g.mo4875a();
        return mo7187h();
    }

    /* renamed from: h */
    public final synchronized boolean mo7187h() {
        return this.f27970o;
    }

    public final boolean equalsRemote(IPolylineDelegate iPolylineDelegate) {
        return equals(iPolylineDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }

    /* renamed from: c */
    public final ae<ae<LatLng>> mo7182c() {
        return ae.m27685e();
    }
}
