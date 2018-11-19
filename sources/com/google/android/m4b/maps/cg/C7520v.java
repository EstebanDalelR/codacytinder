package com.google.android.m4b.maps.cg;

import android.content.res.Resources;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.cg.C5176g.C5175a;
import com.google.android.m4b.maps.cg.bd.C5147a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.GroundOverlayOptions;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate;
import com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate.Stub;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.m4b.maps.cg.v */
public final class C7520v extends Stub implements C5147a {
    /* renamed from: a */
    private static final GroundOverlayOptions f28094a = new GroundOverlayOptions();
    /* renamed from: w */
    private static AtomicInteger f28095w = new AtomicInteger(0);
    /* renamed from: b */
    private final String f28096b = String.format("go%d", new Object[]{Integer.valueOf(f28095w.getAndIncrement())});
    /* renamed from: c */
    private final bd f28097c;
    /* renamed from: d */
    private final cb f28098d;
    /* renamed from: e */
    private LatLngBounds f28099e;
    /* renamed from: f */
    private float f28100f;
    /* renamed from: g */
    private float f28101g;
    /* renamed from: h */
    private LatLng f28102h;
    /* renamed from: i */
    private float f28103i;
    /* renamed from: j */
    private int f28104j;
    /* renamed from: k */
    private int f28105k;
    /* renamed from: l */
    private C5174f f28106l;
    /* renamed from: m */
    private float f28107m;
    /* renamed from: n */
    private C5193a f28108n;
    /* renamed from: o */
    private float f28109o;
    /* renamed from: p */
    private float f28110p;
    /* renamed from: q */
    private final C5176g f28111q;
    /* renamed from: r */
    private float f28112r;
    /* renamed from: s */
    private boolean f28113s;
    /* renamed from: t */
    private boolean f28114t;
    /* renamed from: u */
    private final aa f28115u;
    /* renamed from: v */
    private final Resources f28116v;

    /* renamed from: com.google.android.m4b.maps.cg.v$a */
    public interface C5193a {
        /* renamed from: a */
        void mo4949a();

        /* renamed from: a */
        void mo4950a(int i);
    }

    public C7520v(GroundOverlayOptions groundOverlayOptions, bd bdVar, C5176g c5176g, cb cbVar, aa aaVar, Resources resources) {
        this.f28097c = (bd) C5571j.m24292a((Object) bdVar);
        this.f28098d = (cb) C5571j.m24292a((Object) cbVar);
        boolean z = true;
        this.f28111q = c5176g;
        this.f28115u = aaVar;
        this.f28116v = resources;
        C5571j.m24298a(groundOverlayOptions.getWidth() >= null ? true : null, (Object) "line width is negative");
        C5571j.m24298a(groundOverlayOptions.getImage() != null ? true : null, (Object) "Options doesn't specify an image");
        this.f28109o = groundOverlayOptions.getAnchorU();
        this.f28110p = groundOverlayOptions.getAnchorV();
        this.f28113s = groundOverlayOptions.isVisible();
        this.f28112r = groundOverlayOptions.getZIndex();
        this.f28107m = groundOverlayOptions.getTransparency();
        this.f28106l = C5174f.m23122a(groundOverlayOptions.getImage(), this.f28116v);
        this.f28111q.m23130a(this.f28106l);
        this.f28104j = this.f28111q.m23131b(this.f28106l).m23127c().getHeight();
        this.f28105k = this.f28111q.m23131b(this.f28106l).m23127c().getWidth();
        if (groundOverlayOptions.getLocation() == null) {
            if (groundOverlayOptions.getBounds() == null) {
                z = null;
            }
        }
        C5571j.m24298a(z, (Object) "Options doesn't specify a position");
        if (groundOverlayOptions.getBounds() != null) {
            this.f28099e = groundOverlayOptions.getBounds();
            m33166j();
        } else {
            this.f28102h = groundOverlayOptions.getLocation();
            this.f28100f = groundOverlayOptions.getWidth();
            if (groundOverlayOptions.getHeight() != -1082130432) {
                bdVar = groundOverlayOptions.getHeight();
            } else {
                bdVar = (((float) this.f28104j) / ((float) this.f28105k)) * this.f28100f;
            }
            this.f28101g = bdVar;
            m33167k();
        }
        this.f28103i = groundOverlayOptions.getBearing();
        if (groundOverlayOptions.getBearing() != f28094a.getBearing()) {
            this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_BEARING);
        }
        if (groundOverlayOptions.getTransparency() != f28094a.getTransparency()) {
            this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_TRANSPARENCY);
        }
        if (groundOverlayOptions.isVisible() != f28094a.isVisible()) {
            this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_VISIBILITY);
        }
        if (groundOverlayOptions.getZIndex() != f28094a.getZIndex()) {
            this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_Z_INDEX);
        }
    }

    /* renamed from: a */
    public final void m33169a(C5193a c5193a) {
        this.f28108n = c5193a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m33164a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f28114t;	 Catch:{ all -> 0x0012 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        return;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        r0 = r1.f28108n;
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r1.f28108n;
        r0.mo4950a(r2);
    L_0x0011:
        return;
    L_0x0012:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.v.a(int):void");
    }

    public final String getId() {
        return this.f28096b;
    }

    public final void remove() {
        this.f28115u.mo4875a();
        this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_REMOVE);
        mo7180a();
        this.f28097c.m22949b(this);
    }

    /* renamed from: a */
    public final void mo7180a() {
        if (this.f28108n != null) {
            this.f28108n.mo4949a();
        }
        synchronized (this) {
            if (this.f28114t) {
                return;
            }
            this.f28114t = true;
            this.f28111q.m23132c(this.f28106l);
        }
    }

    public final void setBearing(float f) {
        this.f28115u.mo4875a();
        this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_BEARING);
        synchronized (this) {
            this.f28103i = f;
        }
        m33164a((int) Float.MIN_VALUE);
    }

    public final synchronized float getBearing() {
        this.f28115u.mo4875a();
        return m33170b();
    }

    /* renamed from: b */
    public final synchronized float m33170b() {
        return this.f28103i;
    }

    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        this.f28115u.mo4875a();
        synchronized (this) {
            this.f28099e = latLngBounds;
            m33166j();
        }
        m33164a(16);
    }

    public final synchronized LatLngBounds getBounds() {
        this.f28115u.mo4875a();
        return m33171c();
    }

    /* renamed from: c */
    public final synchronized LatLngBounds m33171c() {
        return this.f28099e;
    }

    /* renamed from: j */
    private synchronized void m33166j() {
        LatLngBounds latLngBounds = this.f28099e;
        double d = latLngBounds.northeast.latitude;
        double d2 = latLngBounds.southwest.latitude;
        double d3 = latLngBounds.northeast.longitude;
        double d4 = latLngBounds.southwest.longitude;
        if (d3 < d4) {
            d3 += 360.0d;
        }
        float f = this.f28109o;
        float f2 = this.f28110p;
        this.f28102h = new LatLng((((double) (1.0f - f2)) * d) + (((double) f2) * d2), (((double) (1.0f - f)) * d4) + (((double) f) * d3));
        this.f28100f = m33163a(this.f28099e);
        this.f28101g = m33165b(this.f28099e);
    }

    /* renamed from: a */
    private synchronized float m33163a(LatLngBounds latLngBounds) {
        LatLng latLng;
        double a;
        latLng = this.f28102h;
        a = C5187r.m23178a(latLngBounds.northeast.longitude, latLngBounds.southwest.longitude);
        return (float) ((Math.toRadians(a) * 6371009.0d) * Math.cos(Math.toRadians(latLng.latitude)));
    }

    /* renamed from: b */
    private synchronized float m33165b(LatLngBounds latLngBounds) {
        return (float) (Math.toRadians(latLngBounds.northeast.latitude - latLngBounds.southwest.latitude) * 6371009.0d);
    }

    public final void setPosition(LatLng latLng) {
        this.f28115u.mo4875a();
        this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_SET_LOCATION);
        synchronized (this) {
            this.f28102h = latLng;
            m33167k();
        }
        m33164a(16);
    }

    public final synchronized LatLng getPosition() {
        this.f28115u.mo4875a();
        return this.f28102h;
    }

    public final void setDimensions(float f) {
        setDimensionsWithHeight(f, -1.0f);
    }

    public final void setDimensionsWithHeight(float f, float f2) {
        this.f28115u.mo4875a();
        this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_SET_DIMENSIONS);
        synchronized (this) {
            this.f28100f = f;
            if (f2 == -1.0f) {
                f2 = (((float) this.f28104j) / ((float) this.f28105k)) * f;
            }
            this.f28101g = f2;
            m33167k();
        }
        m33164a((int) 2.8E-45f);
    }

    public final synchronized float getHeight() {
        this.f28115u.mo4875a();
        return this.f28101g;
    }

    public final synchronized float getWidth() {
        this.f28115u.mo4875a();
        return this.f28100f;
    }

    /* renamed from: k */
    private synchronized void m33167k() {
        this.f28099e = C5187r.m23182a(this.f28102h, (double) this.f28109o, (double) this.f28110p, C5187r.m23177a((double) this.f28101g), C5187r.m23179a(this.f28102h, (double) this.f28100f));
    }

    /* renamed from: d */
    public final synchronized float m33172d() {
        return this.f28109o;
    }

    /* renamed from: e */
    public final synchronized float m33173e() {
        return this.f28110p;
    }

    public final void setTransparency(float f) {
        this.f28115u.mo4875a();
        this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_TRANSPARENCY);
        boolean z = f >= 0.0f && f <= 1.0f;
        C5571j.m24298a(z, (Object) "Transparency must be in the range [0..1]");
        synchronized (this) {
            this.f28107m = f;
        }
        m33164a((int) 9.0E-44f);
    }

    public final synchronized float getTransparency() {
        this.f28115u.mo4875a();
        return m33174f();
    }

    /* renamed from: f */
    public final synchronized float m33174f() {
        return this.f28107m;
    }

    public final void setZIndex(float f) {
        this.f28115u.mo4875a();
        this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_Z_INDEX);
        synchronized (this) {
            this.f28112r = f;
        }
        m33164a((int) 1.1E-44f);
    }

    public final synchronized float getZIndex() {
        this.f28115u.mo4875a();
        return m33175g();
    }

    /* renamed from: g */
    public final synchronized float m33175g() {
        return this.f28112r;
    }

    public final void setVisible(boolean z) {
        this.f28115u.mo4875a();
        this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_VISIBILITY);
        synchronized (this) {
            this.f28113s = z;
        }
        m33164a((int) true);
    }

    public final synchronized boolean isVisible() {
        this.f28115u.mo4875a();
        return m33176h();
    }

    /* renamed from: h */
    public final synchronized boolean m33176h() {
        return this.f28113s;
    }

    public final void setImage(C5484b c5484b) {
        this.f28115u.mo4875a();
        this.f28098d.mo5310b(C5164a.GROUND_OVERLAY_SET_IMAGE);
        synchronized (this) {
            this.f28111q.m23132c(this.f28106l);
            this.f28106l = C5174f.m23123a(c5484b, this.f28116v);
            this.f28111q.m23130a(this.f28106l);
            this.f28104j = this.f28111q.m23131b(this.f28106l).m23127c().getHeight();
            this.f28105k = this.f28111q.m23131b(this.f28106l).m23127c().getWidth();
        }
        m33164a(4);
    }

    /* renamed from: i */
    public final synchronized C5175a m33177i() {
        return this.f28111q.m23131b(this.f28106l);
    }

    public final boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate) {
        return equals(iGroundOverlayDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }
}
