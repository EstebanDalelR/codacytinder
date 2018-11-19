package com.google.android.m4b.maps.ci;

import android.content.res.Resources;
import android.os.Handler;
import com.google.android.m4b.maps.af.C4604a;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cg.C5180j;
import com.google.android.m4b.maps.cg.C5180j.C5179a;
import com.google.android.m4b.maps.cg.bj.C5149a;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.ci.C6647k.C5211a;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p124x.C5536d;
import com.google.android.m4b.maps.p124x.C5545m;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.m4b.maps.ci.c */
public final class C6641c implements C5180j {
    /* renamed from: b */
    private final C6642d f24863b;
    /* renamed from: c */
    private final double f24864c;
    /* renamed from: d */
    private final Handler f24865d;
    /* renamed from: e */
    private CameraPosition f24866e = C6641c.m29570b(new CameraPosition(new LatLng(0.0d, 0.0d), 3.0f, 0.0f, 0.0f));
    /* renamed from: f */
    private C5545m f24867f;
    /* renamed from: g */
    private final Collection<C5545m> f24868g = new ArrayList();
    /* renamed from: h */
    private int f24869h;
    /* renamed from: i */
    private int f24870i;
    /* renamed from: j */
    private int f24871j;
    /* renamed from: k */
    private int f24872k;

    /* renamed from: a */
    public final float mo4909a(LatLng latLng) {
        return 22.0f;
    }

    /* renamed from: a */
    public final void mo4911a() {
    }

    /* renamed from: d */
    public final float mo4931d() {
        return 0.0f;
    }

    /* renamed from: e */
    public final /* synthetic */ C5149a mo4932e() {
        return m29585b();
    }

    public C6641c(C6642d c6642d, Resources resources, Handler handler) {
        this.f24863b = c6642d;
        this.f24865d = handler;
        this.f24864c = Math.max(1.0d, Math.floor((double) resources.getDisplayMetrics().density));
    }

    /* renamed from: a */
    public final void mo4923a(C5545m c5545m) {
        this.f24867f = c5545m;
    }

    /* renamed from: b */
    public final void mo4927b(C5545m c5545m) {
        this.f24868g.add(c5545m);
    }

    /* renamed from: c */
    public final void mo4930c(C5545m c5545m) {
        this.f24868g.remove(c5545m);
    }

    /* renamed from: a */
    public final void mo4917a(C5179a c5179a, int i, C5536d c5536d, cb cbVar) {
        boolean z;
        if (i == 0) {
            if (c5536d != null) {
                z = null;
                C5571j.m24298a(z, (Object) "Callback supplied with instantaneous camera movement");
                C5571j.m24302b(true, (Object) "Camera moved during a cancellation");
                c5179a.mo5312a(this, i, cbVar);
            }
        }
        z = true;
        C5571j.m24298a(z, (Object) "Callback supplied with instantaneous camera movement");
        C5571j.m24302b(true, (Object) "Camera moved during a cancellation");
        c5179a.mo5312a(this, i, cbVar);
    }

    /* renamed from: a */
    private void m29569a(CameraPosition cameraPosition) {
        this.f24866e = C6641c.m29570b(cameraPosition);
        this.f24863b.m29602b();
        for (C5545m a : this.f24868g) {
            try {
                a.mo5313a(this.f24866e);
            } catch (CameraPosition cameraPosition2) {
                throw new RuntimeRemoteException(cameraPosition2);
            }
        }
        if (this.f24867f != null) {
            try {
                this.f24867f.mo5313a(this.f24866e);
            } catch (CameraPosition cameraPosition22) {
                throw new RuntimeRemoteException(cameraPosition22);
            }
        }
    }

    /* renamed from: c */
    public final CameraPosition mo4928c() {
        return this.f24866e;
    }

    /* renamed from: a */
    public final CameraPosition mo4910a(LatLngBounds latLngBounds) {
        int width = this.f24863b.getWidth();
        int height = this.f24863b.getHeight();
        double d = this.f24864c;
        latLngBounds.getCenter();
        double d2 = (double) 22.0f;
        C5211a a = C6647k.m29668a(latLngBounds.southwest, d2, d);
        C5211a a2 = C6647k.m29668a(latLngBounds.northeast, d2, d);
        if (latLngBounds.southwest.longitude > latLngBounds.northeast.longitude) {
            a2 = new C5211a(a2.f19408a + ((long) ((int) C6647k.m29667a(d2, d))), a2.f19409b);
        }
        long j = a2.f19408a - a.f19408a;
        long j2 = a.f19409b - a2.f19409b;
        while (true) {
            if (j <= ((long) width)) {
                if (j2 <= ((long) height)) {
                    return new CameraPosition(latLngBounds.getCenter(), (float) d2, 0.0f, 0.0f);
                }
            }
            d2 -= 1.0d;
            j >>= 1;
            j2 >>= 1;
        }
    }

    /* renamed from: a */
    public final void mo4913a(float f, int i) {
        m29569a(new CameraPosition(this.f24866e.target, this.f24866e.zoom + f, this.f24866e.tilt, this.f24866e.bearing));
    }

    /* renamed from: b */
    public final void mo4925b(float f, int i) {
        C4728u.m21048a(5, "zoomByCumulative is not supported in Lite Mode");
    }

    /* renamed from: a */
    public final void mo4914a(float f, int i, int i2, int i3) {
        C4728u.m21048a(5, "zoomBy with focus is not supported in Lite Mode");
    }

    /* renamed from: c */
    public final void mo4929c(float f, int i) {
        m29569a(new CameraPosition(this.f24866e.target, f, this.f24866e.tilt, this.f24866e.bearing));
    }

    /* renamed from: a */
    public final void mo4912a(float f, float f2, int i) {
        C4728u.m21048a((int) 7.0E-45f, "scrollBy is not supported in Lite Mode");
    }

    /* renamed from: a */
    public final void mo4918a(CameraPosition cameraPosition, int i) {
        m29569a(cameraPosition);
    }

    /* renamed from: a */
    public final void mo4920a(LatLng latLng, int i) {
        m29569a(new CameraPosition(latLng, this.f24866e.zoom, this.f24866e.tilt, this.f24866e.bearing));
    }

    /* renamed from: a */
    public final void mo4919a(LatLng latLng, float f, int i) {
        m29569a(new CameraPosition(latLng, f, this.f24866e.tilt, this.f24866e.bearing));
    }

    /* renamed from: a */
    public final void mo4921a(LatLngBounds latLngBounds, int i, int i2) {
        m29569a(mo4910a(latLngBounds));
    }

    /* renamed from: a */
    public final void mo4922a(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        C4728u.m21048a(5, "newLatLngBounds with size is not supported in Lite Mode");
    }

    /* renamed from: a */
    public final void mo4915a(int i, int i2, int i3, int i4) {
        this.f24869h = i;
        this.f24870i = i2;
        this.f24871j = i3;
        this.f24872k = i4;
    }

    /* renamed from: b */
    public final C6647k m29585b() {
        return new C6647k(this.f24866e, this.f24863b.getWidth(), this.f24863b.getHeight(), this.f24864c, this.f24869h, this.f24870i, this.f24871j, this.f24872k);
    }

    /* renamed from: b */
    private static CameraPosition m29570b(CameraPosition cameraPosition) {
        if (!(cameraPosition.tilt == 0.0f && cameraPosition.bearing == 0.0f)) {
            C4728u.m21048a(5, "Non zero bearing and tilt are not supported in Lite Mode");
        }
        if (!C4604a.m20691a((double) cameraPosition.zoom)) {
            C4728u.m21048a(5, "Non integer zooms are not supported in Lite Mode");
        }
        return new CameraPosition(cameraPosition.target, (float) Math.round(Math.max(0.0f, Math.min(22.0f, cameraPosition.zoom))), 0.0f, 0.0f);
    }
}
