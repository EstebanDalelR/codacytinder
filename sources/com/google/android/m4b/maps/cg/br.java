package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.aw.C6403c;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.ay.C6418w;
import com.google.android.m4b.maps.ay.C6418w.C4730a;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.ay.ae;
import com.google.android.m4b.maps.cg.bn.C5151a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p113m.C5475a;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.ab;
import com.google.android.m4b.maps.p124x.ac;
import com.google.android.m4b.maps.p124x.ad;
import com.google.android.m4b.maps.p124x.ah.C6797a;
import com.google.android.m4b.maps.p124x.am;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.concurrent.Executor;

public final class br extends C6797a implements OnClickListener {
    /* renamed from: a */
    private static final String f27988a = "br";
    /* renamed from: o */
    private static StreetViewPanoramaCamera f27989o = new StreetViewPanoramaCamera(0.0f, 0.0f, 0.0f);
    /* renamed from: b */
    private final bt f27990b;
    /* renamed from: c */
    private final aa f27991c;
    /* renamed from: d */
    private final StreetViewPanoramaOptions f27992d;
    /* renamed from: e */
    private final FrameLayout f27993e;
    /* renamed from: f */
    private final bs f27994f;
    /* renamed from: g */
    private final Context f27995g;
    /* renamed from: h */
    private final Resources f27996h;
    /* renamed from: i */
    private final cb f27997i;
    /* renamed from: j */
    private C5156a f27998j = new C66051(this);
    /* renamed from: k */
    private final bv f27999k;
    /* renamed from: l */
    private final C6413m f28000l;
    /* renamed from: m */
    private final Executor f28001m;
    /* renamed from: n */
    private final C6403c f28002n;

    /* renamed from: com.google.android.m4b.maps.cg.br$a */
    public interface C5156a {
        /* renamed from: a */
        void mo5299a(String str, StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    /* renamed from: com.google.android.m4b.maps.cg.br$1 */
    class C66051 implements C5156a {
        /* renamed from: a */
        private /* synthetic */ br f24777a;

        C66051(br brVar) {
            this.f24777a = brVar;
        }

        /* renamed from: a */
        public final void mo5299a(String str, StreetViewPanoramaLocation streetViewPanoramaLocation) {
            Object obj = streetViewPanoramaLocation != null ? 1 : null;
            if (C5475a.m23830a(this.f24777a.f27995g)) {
                obj = null;
            }
            if (obj != null) {
                this.f24777a.f27994f.m23015a(str);
                this.f24777a.f27994f.m23016a(true);
            } else {
                this.f24777a.f27994f.m23016a(false);
            }
            if (streetViewPanoramaLocation != null && C5144b.m22921a(this.f24777a.f27995g) != null) {
                this.f24777a.m32980b(streetViewPanoramaLocation.position);
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.br$2 */
    class C66062 implements C5151a {
        /* renamed from: a */
        private /* synthetic */ br f24778a;

        C66062(br brVar) {
            this.f24778a = brVar;
        }

        /* renamed from: a */
        public final void mo5169a(bn bnVar) {
            if (bnVar.mo7075h() > 0) {
                bnVar = bnVar.m32938a(0);
                String valueOf = String.valueOf(this.f24778a.f27996h.getString(C4513R.string.maps_YOUR_LOCATION));
                bnVar = bnVar.m22981a();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(bnVar).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(": ");
                stringBuilder.append(bnVar);
                C5144b.m22920a(this.f24778a.f27990b.mo5200k(), stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public static br m32959a(StreetViewPanoramaOptions streetViewPanoramaOptions, boolean z, C5173d c5173d) {
        ag.m22842a(c5173d);
        Context c = c5173d.m23113c();
        FrameLayout frameLayout = new FrameLayout(c);
        C5184n a = c5173d.m23111a();
        C6413m a2 = a.m23167a();
        String str = "G";
        bt a3 = bm.m22978a(str, c5173d);
        bs bsVar = new bs(c, c5173d.m23114d());
        C5571j.m24292a((Object) streetViewPanoramaOptions);
        StreetViewPanoramaCamera streetViewPanoramaCamera = streetViewPanoramaOptions.getStreetViewPanoramaCamera();
        if (streetViewPanoramaCamera == null) {
            streetViewPanoramaCamera = f27989o;
        }
        a3.mo5184a(streetViewPanoramaOptions.getPanoramaId(), streetViewPanoramaOptions.getPosition(), streetViewPanoramaOptions.getRadius(), bw.m23045a(streetViewPanoramaCamera));
        c5173d.m23118h().m22975a(1);
        bv bvVar = new bv(c);
        frameLayout.addView(a3.mo5200k());
        frameLayout.addView(bsVar.m23014a());
        cb a4 = cd.m29513a(c, new ae(new C6632q(c, c.getPackageName()), a2), c5173d.m23112b(), str);
        a4.mo5309a(C5164a.PANORAMA_CREATED);
        return new br(c, c5173d.m23114d(), a3, streetViewPanoramaOptions, c5173d.m23116f(), bsVar, frameLayout, a4, bvVar, a.m23167a(), c5173d.m23117g(), c5173d.m23120j());
    }

    private br(Context context, Resources resources, bt btVar, StreetViewPanoramaOptions streetViewPanoramaOptions, aa aaVar, bs bsVar, FrameLayout frameLayout, cb cbVar, bv bvVar, C6413m c6413m, Executor executor, C6403c c6403c) {
        this.f27995g = context;
        this.f27996h = resources;
        this.f27990b = btVar;
        this.f27992d = streetViewPanoramaOptions;
        this.f27991c = aaVar;
        this.f27994f = bsVar;
        this.f27993e = frameLayout;
        this.f27997i = cbVar;
        this.f27999k = bvVar;
        this.f28000l = c6413m;
        this.f28001m = executor;
        this.f28002n = c6403c;
        this.f27990b.mo5174a(this.f27998j);
        this.f27994f.m23017b().setOnClickListener(this);
        if (this.f27992d.getUserNavigationEnabled() != null) {
            mo5711c(this.f27992d.getUserNavigationEnabled().booleanValue());
        }
        if (this.f27992d.getZoomGesturesEnabled() != null) {
            mo5707a(this.f27992d.getZoomGesturesEnabled().booleanValue());
        }
        if (this.f27992d.getPanningGesturesEnabled() != null) {
            mo5709b(this.f27992d.getPanningGesturesEnabled().booleanValue());
        }
        if (this.f27992d.getStreetNamesEnabled() != null) {
            mo5713d(this.f27992d.getStreetNamesEnabled().booleanValue());
        }
    }

    /* renamed from: a */
    public final void m32967a(Bundle bundle) {
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) am.m24119a(bundle, "camera");
        if (streetViewPanoramaCamera == null) {
            if (this.f27992d.getStreetViewPanoramaCamera() != null) {
                streetViewPanoramaCamera = this.f27992d.getStreetViewPanoramaCamera();
            } else {
                streetViewPanoramaCamera = f27989o;
            }
        }
        bt btVar = this.f27990b;
        String string = (bundle == null || !bundle.containsKey("position")) ? "" : bundle.getString("position");
        btVar.mo5178a(streetViewPanoramaCamera, string);
    }

    /* renamed from: g */
    public final void m32989g() {
        this.f27990b.mo5192d();
    }

    /* renamed from: h */
    public final void m32990h() {
        this.f27990b.mo5190c();
    }

    /* renamed from: i */
    public final void m32991i() {
        this.f27997i.mo5308a();
    }

    /* renamed from: b */
    public final void m32979b(Bundle bundle) {
        am.m24120a(bundle, "StreetViewPanoramaOptions", this.f27992d);
        am.m24120a(bundle, "camera", mo5715e());
        if (this.f27990b.mo5194e() != null) {
            bundle.putString("position", this.f27990b.mo5194e().panoId);
        }
    }

    /* renamed from: j */
    public final View m32992j() {
        return this.f27993e;
    }

    /* renamed from: k */
    public final boolean m32993k() {
        return this.f27992d.getUseViewLifecycleInFragment() != null && this.f27992d.getUseViewLifecycleInFragment().booleanValue();
    }

    /* renamed from: b */
    final void m32980b(LatLng latLng) {
        C4718l bnVar = new bn(latLng, 21.0f);
        bnVar.m32939a(new C66062(this));
        this.f28000l.mo4893c(bnVar);
    }

    /* renamed from: a */
    public final boolean mo5708a() {
        this.f27991c.mo4875a();
        return this.f27990b.mo5196g();
    }

    /* renamed from: a */
    public final void mo5707a(boolean z) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_ENABLE_ZOOM);
        this.f27990b.mo5185a(z);
    }

    /* renamed from: b */
    public final boolean mo5710b() {
        this.f27991c.mo4875a();
        return this.f27990b.mo5197h();
    }

    /* renamed from: b */
    public final void mo5709b(boolean z) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_ENABLE_PANNING);
        this.f27990b.mo5189b(z);
    }

    /* renamed from: c */
    public final boolean mo5712c() {
        this.f27991c.mo4875a();
        return this.f27990b.mo5198i();
    }

    /* renamed from: c */
    public final void mo5711c(boolean z) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_ENABLE_NAVIGATION);
        this.f27990b.mo5191c(z);
    }

    /* renamed from: d */
    public final boolean mo5714d() {
        this.f27991c.mo4875a();
        return this.f27990b.mo5199j();
    }

    /* renamed from: d */
    public final void mo5713d(boolean z) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_ENABLE_STREET_NAMES);
        this.f27990b.mo5193d(z);
    }

    /* renamed from: a */
    public final void mo5701a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_ANIMATE_TO);
        this.f27990b.mo5177a(streetViewPanoramaCamera, j);
    }

    /* renamed from: e */
    public final StreetViewPanoramaCamera mo5715e() {
        this.f27991c.mo4875a();
        return this.f27990b.mo5195f();
    }

    /* renamed from: a */
    public final void mo5706a(String str) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_SET_POSITION_WITH_ID);
        this.f27990b.mo5183a(str);
    }

    /* renamed from: a */
    public final void mo5699a(LatLng latLng) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_SET_POSITION);
        this.f27990b.mo5175a(latLng);
    }

    /* renamed from: a */
    public final void mo5700a(LatLng latLng, int i) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_SET_POSITION_WITH_RADIUS);
        this.f27990b.mo5176a(latLng, i);
    }

    /* renamed from: f */
    public final StreetViewPanoramaLocation mo5716f() {
        this.f27991c.mo4875a();
        return this.f27990b.mo5194e();
    }

    /* renamed from: a */
    public final void mo5703a(ab abVar) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_SET_CHANGE_LISTENER);
        this.f27990b.mo5180a(abVar);
    }

    /* renamed from: a */
    public final void mo5702a(com.google.android.m4b.maps.p124x.aa aaVar) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_SET_CAMERA_CHANGE_LISTENER);
        this.f27990b.mo5179a(aaVar);
    }

    /* renamed from: a */
    public final void mo5704a(ac acVar) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_SET_CLICK_LISTENER);
        this.f27990b.mo5181a(acVar);
    }

    /* renamed from: a */
    public final void mo5705a(ad adVar) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_SET_LONG_CLICK_LISTENER);
        this.f27990b.mo5182a(adVar);
    }

    /* renamed from: a */
    public final StreetViewPanoramaOrientation mo5697a(C5484b c5484b) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_PROJECT_TO_ORIENTATION);
        Point point = (Point) C7701d.m33408a(c5484b);
        if (point == null) {
            return null;
        }
        return this.f27990b.mo5171a(point.x, point.y);
    }

    /* renamed from: a */
    public final C5484b mo5698a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_PROJECT_TO_POINT);
        return C7701d.m33407a(this.f27990b.mo5170a(streetViewPanoramaOrientation));
    }

    public final void onClick(View view) {
        if (view == this.f27994f.m23017b()) {
            this.f27999k.m23044a(this.f27990b.mo5194e(), this.f27990b.mo5195f());
        }
    }

    /* renamed from: a */
    public final void m32975a(final com.google.android.m4b.maps.p124x.ae aeVar) {
        this.f27991c.mo4875a();
        this.f27997i.mo5310b(C5164a.PANORAMA_SET_ON_PANORAMA_READY_CALLBACK);
        final Runnable c51543 = new Runnable(this) {
            /* renamed from: b */
            private /* synthetic */ br f19128b;

            public final void run() {
                try {
                    aeVar.mo5691a(this.f19128b);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
        };
        if (C5398g.m23589e(this.f27995g) != null) {
            new C6418w(this.f27995g, "com.google.android.gms").m28039a(new C4730a(this) {
                /* renamed from: a */
                final /* synthetic */ br f24779a;

                /* renamed from: com.google.android.m4b.maps.cg.br$4$1 */
                class C51551 implements Runnable {
                    /* renamed from: a */
                    private /* synthetic */ C66074 f19129a;

                    C51551(C66074 c66074) {
                        this.f19129a = c66074;
                    }

                    public final void run() {
                        br.m32963e(this.f19129a.f24779a);
                    }
                }

                /* renamed from: a */
                public final void mo5300a(boolean z) {
                    if (z) {
                        C4728u.m21049a("The Maps API is blocked on this device.");
                        this.f24779a.f28001m.execute(new C51551(this));
                        return;
                    }
                    this.f24779a.f28001m.execute(c51543);
                }
            });
        } else {
            this.f28001m.execute(c51543);
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m32963e(br brVar) {
        brVar.f28000l.mo4894f();
        brVar.f28002n.mo4869d();
    }
}
