package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.cg.bn.C5151a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.C5541i;
import com.google.android.m4b.maps.p124x.C5548p.C6824a;
import com.google.android.m4b.maps.p124x.C5556x;
import com.google.android.m4b.maps.p124x.C5557y;
import com.google.android.m4b.maps.p125y.C5571j;

public final class bc extends C6824a implements OnClickListener {
    /* renamed from: a */
    private final C5180j f27924a;
    /* renamed from: b */
    private final C5541i f27925b;
    /* renamed from: c */
    private final bb f27926c;
    /* renamed from: d */
    private final Context f27927d;
    /* renamed from: e */
    private final Resources f27928e;
    /* renamed from: f */
    private final C5146a f27929f;
    /* renamed from: g */
    private Location f27930g;
    /* renamed from: h */
    private C5541i f27931h;
    /* renamed from: i */
    private final cb f27932i;
    /* renamed from: j */
    private boolean f27933j;
    /* renamed from: k */
    private boolean f27934k = true;
    /* renamed from: l */
    private C5557y f27935l;
    /* renamed from: m */
    private C5556x f27936m;
    /* renamed from: n */
    private final C6413m f27937n;

    /* renamed from: com.google.android.m4b.maps.cg.bc$a */
    public interface C5146a {
        /* renamed from: a */
        void mo4980a();

        /* renamed from: a */
        void mo4981a(Location location);

        /* renamed from: b */
        void mo4982b();
    }

    public bc(Context context, Resources resources, C5180j c5180j, bb bbVar, C5146a c5146a, C5541i c5541i, cb cbVar, C6413m c6413m) {
        this.f27927d = (Context) C5571j.m24292a((Object) context);
        this.f27928e = (Resources) C5571j.m24292a((Object) resources);
        this.f27924a = (C5180j) C5571j.m24292a((Object) c5180j);
        this.f27926c = (bb) C5571j.m24292a((Object) bbVar);
        this.f27929f = (C5146a) C5571j.m24292a((Object) c5146a);
        this.f27925b = (C5541i) C5571j.m24292a((Object) c5541i);
        this.f27931h = (C5541i) C5571j.m24292a((Object) c5541i);
        this.f27932i = (cb) C5571j.m24292a((Object) cbVar);
        this.f27937n = c6413m;
    }

    /* renamed from: c */
    public final boolean m32900c() {
        return this.f27933j;
    }

    /* renamed from: a */
    public final void m32897a(boolean z) {
        if (this.f27934k != z) {
            this.f27934k = z;
            m32890f();
        }
    }

    /* renamed from: f */
    private void m32890f() {
        boolean z = this.f27934k && this.f27933j;
        this.f27926c.m22942a(z);
        this.f27926c.m22941a(z ? this : null);
    }

    /* renamed from: d */
    public final boolean m32901d() {
        return this.f27934k;
    }

    /* renamed from: a */
    public final void mo5799a(C5484b c5484b) {
        mo5798a((Location) C7701d.m33408a(c5484b));
    }

    /* renamed from: a */
    public final void mo5798a(Location location) {
        this.f27929f.mo4981a(location);
        if (this.f27935l != null) {
            try {
                this.f27935l.mo5811a(C7701d.m33407a(new Location(location)));
            } catch (Location location2) {
                throw new RuntimeRemoteException(location2);
            }
        }
        this.f27930g = location2;
    }

    @Deprecated
    /* renamed from: a */
    public final void m32896a(C5557y c5557y) {
        this.f27935l = c5557y;
    }

    /* renamed from: a */
    public final void m32895a(C5556x c5556x) {
        this.f27936m = c5556x;
    }

    public final void onClick(final View view) {
        this.f27932i.mo5309a(C5164a.MY_LOCATION_BUTTON_CLICK);
        if (this.f27936m != null) {
            try {
                if (this.f27936m.mo5810a()) {
                    return;
                }
            } catch (View view2) {
                throw new RuntimeRemoteException(view2);
            }
        }
        C5571j.m24302b(this.f27933j, (Object) "MyLocation layer not enabled");
        if (this.f27930g != null) {
            LatLng latLng = new LatLng(this.f27930g.getLatitude(), this.f27930g.getLongitude());
            this.f27924a.mo4918a(CameraPosition.builder(this.f27924a.mo4928c()).m23848a(latLng).m23847a(m32888a(latLng, this.f27930g.getAccuracy())).m23849a(), -1);
        }
        if (C5144b.m22921a(this.f27927d) && this.f27930g != null) {
            latLng = new LatLng(this.f27930g.getLatitude(), this.f27930g.getLongitude());
            C4718l bnVar = new bn(latLng, m32888a(latLng, this.f27930g.getAccuracy()));
            bnVar.m32939a(new C5151a(this) {
                /* renamed from: b */
                private /* synthetic */ bc f24774b;

                /* renamed from: a */
                public final void mo5169a(bn bnVar) {
                    if (bnVar.mo7075h() > 0) {
                        bnVar = bnVar.m32938a(0);
                        String valueOf = String.valueOf(this.f24774b.f27928e.getString(C4513R.string.maps_YOUR_LOCATION));
                        bnVar = bnVar.m22981a();
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(bnVar).length());
                        stringBuilder.append(valueOf);
                        stringBuilder.append(": ");
                        stringBuilder.append(bnVar);
                        C5144b.m22920a(view2, stringBuilder.toString());
                    }
                }
            });
            this.f27937n.mo4893c(bnVar);
        }
    }

    /* renamed from: a */
    private float m32888a(LatLng latLng, float f) {
        float f2 = this.f27924a.mo4928c().zoom;
        if (f2 <= 10.0f) {
            f2 = 15.0f;
        }
        double d = ((double) f) * 2.0d;
        latLng = this.f27924a.mo4910a(C5187r.m23182a(latLng, 0.5d, 0.5d, C5187r.m23177a(d), C5187r.m23179a(latLng, d))).zoom;
        if (latLng == -1.0f) {
            return f2;
        }
        return Math.min(f2, latLng);
    }

    /* renamed from: b */
    final void m32899b(boolean z) {
        if (this.f27934k && this.f27933j) {
            this.f27926c.m22942a(z ^ 1);
            if (z) {
                this.f27929f.mo4982b();
                return;
            }
            this.f27929f.mo4980a();
        }
    }

    /* renamed from: a */
    public final void m32891a() {
        if (!this.f27933j) {
            this.f27933j = true;
            this.f27929f.mo4980a();
            try {
                this.f27931h.mo5792a(this);
                m32890f();
                if (this.f27930g != null) {
                    mo5798a(this.f27930g);
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: b */
    public final void m32898b() {
        if (this.f27933j) {
            this.f27933j = false;
            m32890f();
            try {
                this.f27931h.mo5791a();
                this.f27929f.mo4982b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Deprecated
    /* renamed from: e */
    public final Location m32902e() {
        C5571j.m24302b(this.f27933j, (Object) "MyLocation layer not enabled");
        return this.f27930g;
    }

    /* renamed from: a */
    public final void m32894a(C5541i c5541i) {
        if (this.f27933j) {
            try {
                this.f27931h.mo5791a();
            } catch (C5541i c5541i2) {
                throw new RuntimeRemoteException(c5541i2);
            }
        }
        if (c5541i2 == null) {
            c5541i2 = this.f27925b;
        }
        this.f27931h = c5541i2;
        if (this.f27933j != null) {
            try {
                this.f27931h.mo5792a(this);
            } catch (C5541i c5541i22) {
                throw new RuntimeRemoteException(c5541i22);
            }
        }
    }
}
