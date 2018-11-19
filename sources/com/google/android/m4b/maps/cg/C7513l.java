package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.cg.bd.C5147a;
import com.google.android.m4b.maps.cg.bg.C5148a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.CircleOptions;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.internal.ICircleDelegate;
import com.google.android.m4b.maps.model.internal.ICircleDelegate.Stub;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.m4b.maps.cg.l */
public final class C7513l extends Stub implements C5147a, bg {
    /* renamed from: a */
    private static final CircleOptions f28028a = new CircleOptions();
    /* renamed from: b */
    private static final AtomicInteger f28029b = new AtomicInteger(0);
    /* renamed from: c */
    private final String f28030c = String.format("ci%d", new Object[]{Integer.valueOf(f28029b.getAndIncrement())});
    /* renamed from: d */
    private final bd f28031d;
    /* renamed from: e */
    private final cb f28032e;
    /* renamed from: f */
    private C5148a f28033f;
    /* renamed from: g */
    private LatLng f28034g;
    /* renamed from: h */
    private double f28035h;
    /* renamed from: i */
    private ae<LatLng> f28036i;
    /* renamed from: j */
    private int f28037j;
    /* renamed from: k */
    private int f28038k;
    /* renamed from: l */
    private float f28039l;
    /* renamed from: m */
    private float f28040m;
    /* renamed from: n */
    private boolean f28041n;
    /* renamed from: o */
    private boolean f28042o;
    /* renamed from: p */
    private final aa f28043p;

    C7513l(CircleOptions circleOptions, bd bdVar, cb cbVar, aa aaVar) {
        this.f28031d = (bd) C5571j.m24292a((Object) bdVar);
        this.f28032e = (cb) C5571j.m24292a((Object) cbVar);
        this.f28043p = (aa) C5571j.m24292a((Object) aaVar);
        boolean z = true;
        C5571j.m24298a(circleOptions.getStrokeWidth() >= null ? true : null, (Object) "line width is negative");
        C5571j.m24292a(circleOptions.getCenter());
        if (circleOptions.getRadius() < 0.0d) {
            z = null;
        }
        C5571j.m24298a(z, (Object) "radius is negative");
        this.f28034g = circleOptions.getCenter();
        this.f28035h = circleOptions.getRadius();
        this.f28039l = circleOptions.getStrokeWidth();
        this.f28037j = circleOptions.getStrokeColor();
        this.f28038k = circleOptions.getFillColor();
        this.f28040m = circleOptions.getZIndex();
        this.f28041n = circleOptions.isVisible();
        this.f28036i = C5187r.m23180a(this.f28034g, this.f28035h, 100);
        if (circleOptions.getFillColor() != f28028a.getFillColor()) {
            this.f28032e.mo5310b(C5164a.CIRCLE_FILL_COLOR);
        }
        if (circleOptions.getStrokeColor() != f28028a.getStrokeColor()) {
            this.f28032e.mo5310b(C5164a.CIRCLE_STROKE_COLOR);
        }
        if (circleOptions.getStrokeWidth() != f28028a.getStrokeWidth()) {
            this.f28032e.mo5310b(C5164a.CIRCLE_WIDTH);
        }
        if (circleOptions.isVisible() != f28028a.isVisible()) {
            this.f28032e.mo5310b(C5164a.CIRCLE_VISIBILITY);
        }
        if (circleOptions.getZIndex() != f28028a.getZIndex()) {
            this.f28032e.mo5310b(C5164a.CIRCLE_Z_INDEX);
        }
    }

    /* renamed from: a */
    final void m33025a(C5148a c5148a) {
        this.f28033f = c5148a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m33023a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f28042o;	 Catch:{ all -> 0x0012 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        return;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        r0 = r1.f28033f;
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r1.f28033f;
        r0.mo4985a(r2);
    L_0x0011:
        return;
    L_0x0012:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.l.a(int):void");
    }

    public final void remove() {
        this.f28043p.mo4875a();
        this.f28032e.mo5310b(C5164a.CIRCLE_REMOVE);
        mo7180a();
        this.f28031d.m22949b(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo7180a() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f28042o;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        return;
    L_0x0007:
        r0 = 1;
        r1.f28042o = r0;	 Catch:{ all -> 0x0015 }
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        r0 = r1.f28033f;
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r1.f28033f;
        r0.mo4984a();
    L_0x0014:
        return;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.l.a():void");
    }

    public final String getId() {
        return this.f28030c;
    }

    public final void setCenter(LatLng latLng) {
        this.f28043p.mo4875a();
        this.f28032e.mo5310b(C5164a.CIRCLE_SET_CENTER);
        synchronized (this) {
            this.f28034g = latLng;
            this.f28036i = C5187r.m23180a(latLng, this.f28035h, 100);
        }
        m33023a(1);
    }

    public final synchronized LatLng getCenter() {
        this.f28043p.mo4875a();
        return this.f28034g;
    }

    public final void setRadius(double d) {
        this.f28043p.mo4875a();
        this.f28032e.mo5310b(C5164a.CIRCLE_SET_RADIUS);
        synchronized (this) {
            this.f28035h = d;
            this.f28036i = C5187r.m23180a(this.f28034g, d, 100);
        }
        m33023a((int) Double.MIN_VALUE);
    }

    public final synchronized double getRadius() {
        this.f28043p.mo4875a();
        return this.f28035h;
    }

    /* renamed from: b */
    public final synchronized ae<LatLng> mo7181b() {
        return this.f28036i;
    }

    /* renamed from: c */
    public final synchronized ae<ae<LatLng>> mo7182c() {
        return ae.m27685e();
    }

    public final void setStrokeColor(int i) {
        this.f28043p.mo4875a();
        this.f28032e.mo5310b(C5164a.CIRCLE_STROKE_COLOR);
        synchronized (this) {
            this.f28037j = i;
        }
        m33023a(8);
    }

    public final synchronized int getStrokeColor() {
        this.f28043p.mo4875a();
        return mo7183d();
    }

    /* renamed from: d */
    public final synchronized int mo7183d() {
        return this.f28037j;
    }

    public final void setFillColor(int i) {
        this.f28043p.mo4875a();
        this.f28032e.mo5310b(C5164a.CIRCLE_FILL_COLOR);
        synchronized (this) {
            this.f28038k = i;
        }
        m33023a(16);
    }

    public final synchronized int getFillColor() {
        this.f28043p.mo4875a();
        return mo7184e();
    }

    /* renamed from: e */
    public final synchronized int mo7184e() {
        return this.f28038k;
    }

    public final void setStrokeWidth(float f) {
        this.f28043p.mo4875a();
        this.f28032e.mo5310b(C5164a.CIRCLE_WIDTH);
        C5571j.m24298a(f >= 0.0f, (Object) "line width is negative");
        synchronized (this) {
            this.f28039l = f;
        }
        m33023a((int) 5.6E-45f);
    }

    public final synchronized float getStrokeWidth() {
        this.f28043p.mo4875a();
        return mo7185f();
    }

    /* renamed from: f */
    public final synchronized float mo7185f() {
        return this.f28039l;
    }

    public final void setZIndex(float f) {
        this.f28043p.mo4875a();
        this.f28032e.mo5310b(C5164a.CIRCLE_Z_INDEX);
        synchronized (this) {
            this.f28040m = f;
        }
        m33023a((int) 9.0E-44f);
    }

    public final synchronized float getZIndex() {
        this.f28043p.mo4875a();
        return mo7186g();
    }

    /* renamed from: g */
    public final synchronized float mo7186g() {
        return this.f28040m;
    }

    public final void setVisible(boolean z) {
        this.f28043p.mo4875a();
        this.f28032e.mo5310b(C5164a.CIRCLE_VISIBILITY);
        synchronized (this) {
            this.f28041n = z;
        }
        m33023a((int) true);
    }

    public final synchronized boolean isVisible() {
        this.f28043p.mo4875a();
        return mo7187h();
    }

    /* renamed from: h */
    public final synchronized boolean mo7187h() {
        return this.f28041n;
    }

    public final boolean equalsRemote(ICircleDelegate iCircleDelegate) {
        return equals(iCircleDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }
}
