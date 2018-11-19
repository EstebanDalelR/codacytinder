package com.google.android.m4b.maps.bc;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C5007g;
import com.google.android.m4b.maps.bx.ad;
import com.google.android.m4b.maps.bx.ap;
import com.google.android.m4b.maps.bx.ap.C4995e;
import com.google.android.m4b.maps.bz.C5044d;
import com.google.android.m4b.maps.bz.C6571c;
import com.google.android.m4b.maps.cg.C5180j;
import com.google.android.m4b.maps.cg.C5180j.C5179a;
import com.google.android.m4b.maps.cg.bj.C5149a;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p124x.C5536d;
import com.google.android.m4b.maps.p124x.C5545m;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.m4b.maps.bc.a */
public class C6429a implements ad, C4995e, C5007g, C5180j {
    /* renamed from: b */
    private static final double f23851b = (1.0d / Math.log(2.0d));
    /* renamed from: c */
    private final C4769u f23852c;
    /* renamed from: d */
    private final C6450v f23853d;
    /* renamed from: e */
    private final Handler f23854e;
    /* renamed from: f */
    private C5536d f23855f;
    /* renamed from: g */
    private C5545m f23856g;
    /* renamed from: h */
    private final Collection<C5545m> f23857h = new ArrayList();
    /* renamed from: i */
    private int f23858i;

    /* renamed from: a */
    private static int m28080a(int i) {
        return i == -1 ? 330 : Math.max(0, i);
    }

    /* renamed from: b */
    private static int m28084b(int i) {
        return i == -1 ? -1 : Math.max(0, i);
    }

    public C6429a(C6450v c6450v, C4769u c4769u, Handler handler) {
        this.f23853d = c6450v;
        this.f23852c = c4769u;
        this.f23854e = handler;
        this.f23852c.m21136a((C5007g) this);
        this.f23852c.m21134a((ad) this);
        this.f23852c.m21135a((C4995e) this);
    }

    /* renamed from: f */
    private C5536d m28086f() {
        C5536d c5536d = this.f23855f;
        this.f23855f = null;
        return c5536d;
    }

    /* renamed from: a */
    public final void mo4923a(C5545m c5545m) {
        this.f23856g = c5545m;
    }

    /* renamed from: b */
    public final void mo4927b(C5545m c5545m) {
        this.f23857h.add(c5545m);
    }

    /* renamed from: c */
    public final void mo4930c(C5545m c5545m) {
        this.f23857h.remove(c5545m);
    }

    /* renamed from: a */
    public final void mo4917a(C5179a c5179a, int i, C5536d c5536d, cb cbVar) {
        boolean z;
        boolean z2 = true;
        if (i == 0) {
            if (c5536d != null) {
                z = false;
                C5571j.m24298a(z, (Object) "Callback supplied with instantaneous camera movement");
                if (this.f23858i == 0) {
                    z2 = false;
                }
                C5571j.m24302b(z2, (Object) "Camera moved during a cancellation");
                c5179a.mo5312a(this, i, cbVar);
                if (this.f23858i == null) {
                    throw new AssertionError();
                }
                this.f23855f = c5536d;
                return;
            }
        }
        z = true;
        C5571j.m24298a(z, (Object) "Callback supplied with instantaneous camera movement");
        if (this.f23858i == 0) {
            z2 = false;
        }
        C5571j.m24302b(z2, (Object) "Camera moved during a cancellation");
        c5179a.mo5312a(this, i, cbVar);
        if (this.f23858i == null) {
            this.f23855f = c5536d;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo4911a() {
        C5571j.m24302b(this.f23858i == 0, (Object) "Camera stopped during a cancellation");
        this.f23852c.m21131a(0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo4916a(final C6571c c6571c) {
        this.f23854e.post(new Runnable(this) {
            /* renamed from: b */
            private /* synthetic */ C6429a f17421b;

            public final void run() {
                C6429a.m28083a(this.f17421b, C4754b.m21096a(this.f17421b.f23852c.m21130a(c6571c, -1.0f)));
            }
        });
    }

    /* renamed from: b */
    public final void mo4926b(final C6571c c6571c) {
        this.f23854e.post(new Runnable(this) {
            /* renamed from: b */
            private /* synthetic */ C6429a f17423b;

            public final void run() {
                C6429a.m28085b(this.f17423b, C4754b.m21096a(this.f17423b.f23852c.m21130a(c6571c, -1.0f)));
            }
        });
    }

    /* renamed from: c */
    public final CameraPosition mo4928c() {
        return C4754b.m21096a(this.f23852c.m21142d());
    }

    /* renamed from: a */
    public final CameraPosition mo4910a(LatLngBounds latLngBounds) {
        return C4754b.m21096a(C6429a.m28082a(latLngBounds, (double) (this.f23853d.getWidth() - this.f23852c.m21139b()), (double) (this.f23853d.getHeight() - this.f23852c.m21141c()), (double) this.f23853d.getResources().getDisplayMetrics().density));
    }

    /* renamed from: a */
    public final void mo4913a(float f, int i) {
        this.f23852c.m21128a(f, C6429a.m28080a(i));
    }

    /* renamed from: b */
    public final void mo4925b(float f, int i) {
        this.f23852c.m21140b(Math.min(mo4909a(mo4928c().target), Math.max(this.f23852c.m21143e(), this.f23852c.m21144f())) + f, C6429a.m28080a(-1));
    }

    /* renamed from: a */
    public final void mo4914a(float f, int i, int i2, int i3) {
        this.f23852c.m21127a(f, (float) i, (float) i2, C6429a.m28080a(i3));
    }

    /* renamed from: c */
    public final void mo4929c(float f, int i) {
        this.f23852c.m21140b(f, C6429a.m28080a(i));
    }

    /* renamed from: a */
    public final void mo4912a(float f, float f2, int i) {
        f = ap.m29041a(this.f23852c.m21142d(), this.f23853d.m28301o(), f, f2);
        f2 = C6429a.m28084b(i);
        this.f23852c.m21137a(f, f2, f2);
    }

    /* renamed from: a */
    public final void mo4918a(CameraPosition cameraPosition, int i) {
        i = C6429a.m28084b(i);
        this.f23852c.m21137a(new C6571c(C4754b.m21094a(cameraPosition.target), cameraPosition.zoom, cameraPosition.tilt, cameraPosition.bearing, 0.0f), i, i);
    }

    /* renamed from: a */
    public final void mo4920a(LatLng latLng, int i) {
        C6571c d = this.f23852c.m21142d();
        C5044d c6571c = new C6571c(C4754b.m21094a(latLng), d.m29269a(), d.m29273d(), d.m29274e(), d.m29275f());
        latLng = C6429a.m28084b(i);
        this.f23852c.m21137a(c6571c, latLng, latLng);
    }

    /* renamed from: a */
    public final void mo4919a(LatLng latLng, float f, int i) {
        C6571c d = this.f23852c.m21142d();
        C5044d c6571c = new C6571c(C4754b.m21094a(latLng), f, d.m29273d(), d.m29274e(), d.m29275f());
        latLng = C6429a.m28084b(i);
        this.f23852c.m21137a(c6571c, latLng, latLng);
    }

    /* renamed from: a */
    public final void mo4921a(LatLngBounds latLngBounds, int i, int i2) {
        int width = this.f23853d.getWidth();
        int height = this.f23853d.getHeight();
        boolean z = (width == 0 || height == 0) ? false : true;
        C5571j.m24302b(z, (Object) "Error using newLatLngBounds(LatLngBounds, int): Map size can't be 0. Most likely, layout has not yet occured for the map view.  Either wait until layout has occurred or use newLatLngBounds(LatLngBounds, int, int, int) which allows you to specify the map's dimensions.");
        mo4922a(latLngBounds, width, height, i, i2);
    }

    /* renamed from: a */
    public final void mo4922a(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        C6429a c6429a = this;
        double d = (double) (i3 * 2);
        double d2 = ((double) i) - d;
        double d3 = ((double) i2) - d;
        boolean z = d2 > 0.0d && d3 > 0.0d;
        C5571j.m24302b(z, (Object) "View size is too small after padding");
        C5044d a = C6429a.m28082a(latLngBounds, d2 - ((double) c6429a.f23852c.m21139b()), d3 - ((double) c6429a.f23852c.m21141c()), (double) c6429a.f23853d.getResources().getDisplayMetrics().density);
        int b = C6429a.m28084b(i4);
        c6429a.f23852c.m21137a(a, b, b);
    }

    /* renamed from: a */
    private static C6571c m28082a(LatLngBounds latLngBounds, double d, double d2, double d3) {
        int f;
        LatLngBounds latLngBounds2 = latLngBounds;
        double d4 = 256.0d * d3;
        af b = C4754b.m21100b(latLngBounds2.northeast);
        af b2 = C4754b.m21100b(latLngBounds2.southwest);
        if (b.m21490f() < b2.m21490f()) {
            f = (1073741824 - b2.m21490f()) + b.m21490f();
        } else {
            f = b.m21490f() - b2.m21490f();
        }
        int g = b.m21492g() - b2.m21492g();
        return new C6571c(new af((b2.m21490f() + (f / 2)) % 1073741824, b2.m21492g() + (g / 2)), (float) (30.0d - (Math.log(Math.max((((double) f) * d4) / d, (((double) g) * d4) / d2)) * f23851b)), 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final float mo4909a(LatLng latLng) {
        return this.f23852c.m21129a(C4754b.m21100b(latLng));
    }

    /* renamed from: d */
    public final float mo4931d() {
        return this.f23852c.m21143e();
    }

    /* renamed from: a */
    public final void mo4915a(int i, int i2, int i3, int i4) {
        this.f23852c.m21132a(i, i2, i3, i4);
        this.f23853d.mo7052b();
    }

    /* renamed from: b */
    public final void mo4924b() {
        if (this.f23855f != null) {
            this.f23858i++;
            try {
                m28086f().mo5737b();
                this.f23858i--;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (Throwable th) {
                this.f23858i--;
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ C5149a mo4932e() {
        int[] a = this.f23852c.m21138a();
        return new C6442p(this.f23853d.m28301o(), a[0], a[1], a[2], a[3]);
    }

    /* renamed from: a */
    static /* synthetic */ void m28083a(C6429a c6429a, CameraPosition cameraPosition) {
        if (c6429a.f23855f != null) {
            try {
                c6429a.m28086f().mo5736a();
            } catch (C6429a c6429a2) {
                throw new RuntimeRemoteException(c6429a2);
            }
        }
        if (c6429a2.f23856g != null) {
            try {
                c6429a2.f23856g.mo5313a(cameraPosition);
            } catch (C6429a c6429a22) {
                throw new RuntimeRemoteException(c6429a22);
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m28085b(C6429a c6429a, CameraPosition cameraPosition) {
        for (C5545m a : c6429a.f23857h) {
            try {
                a.mo5313a(cameraPosition);
            } catch (C6429a c6429a2) {
                throw new RuntimeRemoteException(c6429a2);
            }
        }
    }
}
