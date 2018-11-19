package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.aw.C6403c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.ay.C6418w;
import com.google.android.m4b.maps.ay.C6418w.C4730a;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.ay.ae;
import com.google.android.m4b.maps.cg.C5180j.C5179a;
import com.google.android.m4b.maps.cg.C5186o.C5185a;
import com.google.android.m4b.maps.cg.ba.C5145a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.cg.cg.C5172a;
import com.google.android.m4b.maps.ch.C5197a;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.CircleOptions;
import com.google.android.m4b.maps.model.GroundOverlayOptions;
import com.google.android.m4b.maps.model.MapsEngineLayerOptions;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.PolygonOptions;
import com.google.android.m4b.maps.model.PolylineOptions;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.TileOverlayOptions;
import com.google.android.m4b.maps.model.internal.ICircleDelegate;
import com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate;
import com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.model.internal.IPolygonDelegate;
import com.google.android.m4b.maps.model.internal.IPolylineDelegate;
import com.google.android.m4b.maps.model.internal.ITileOverlayDelegate;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p110j.C5439e;
import com.google.android.m4b.maps.p113m.C5475a;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.C5536d;
import com.google.android.m4b.maps.p124x.C5538f.C6807a;
import com.google.android.m4b.maps.p124x.C5539g;
import com.google.android.m4b.maps.p124x.C5541i;
import com.google.android.m4b.maps.p124x.C5544l;
import com.google.android.m4b.maps.p124x.C5545m;
import com.google.android.m4b.maps.p124x.C5545m.C6818a;
import com.google.android.m4b.maps.p124x.C5546n;
import com.google.android.m4b.maps.p124x.C5547o;
import com.google.android.m4b.maps.p124x.C5549q;
import com.google.android.m4b.maps.p124x.C5550r;
import com.google.android.m4b.maps.p124x.C5550r.C6828a;
import com.google.android.m4b.maps.p124x.C5551s;
import com.google.android.m4b.maps.p124x.C5552t;
import com.google.android.m4b.maps.p124x.C5553u;
import com.google.android.m4b.maps.p124x.C5554v;
import com.google.android.m4b.maps.p124x.C5555w;
import com.google.android.m4b.maps.p124x.C5556x;
import com.google.android.m4b.maps.p124x.C5557y;
import com.google.android.m4b.maps.p124x.C5558z;
import com.google.android.m4b.maps.p124x.af;
import com.google.android.m4b.maps.p124x.ag;
import com.google.android.m4b.maps.p124x.ak;
import com.google.android.m4b.maps.p124x.ak.C6801a;
import com.google.android.m4b.maps.p124x.am;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.m4b.maps.cg.t */
public final class C7518t extends C6807a implements C6635x, ak, C5544l {
    /* renamed from: a */
    private static final boolean f28052a = (C5475a.m23831b(C5439e.f20391a) ^ 1);
    /* renamed from: A */
    private final C6403c f28053A;
    /* renamed from: B */
    private int f28054B = 1;
    /* renamed from: C */
    private ak f28055C;
    /* renamed from: D */
    private final C5172a f28056D = new C66331(this);
    /* renamed from: E */
    private C7517a f28057E;
    /* renamed from: F */
    private boolean f28058F;
    /* renamed from: G */
    private boolean f28059G;
    /* renamed from: H */
    private boolean f28060H = true;
    /* renamed from: I */
    private C5544l f28061I;
    /* renamed from: J */
    private final af f28062J;
    /* renamed from: K */
    private boolean f28063K;
    /* renamed from: L */
    private boolean f28064L;
    /* renamed from: M */
    private boolean f28065M;
    /* renamed from: b */
    private final C5180j f28066b;
    /* renamed from: c */
    private final ao f28067c;
    /* renamed from: d */
    private volatile boolean f28068d = false;
    /* renamed from: e */
    private final C5176g f28069e;
    /* renamed from: f */
    private final ba f28070f;
    /* renamed from: g */
    private final bd f28071g;
    /* renamed from: h */
    private final be f28072h;
    /* renamed from: i */
    private final ak f28073i;
    /* renamed from: j */
    private final bc f28074j;
    /* renamed from: k */
    private final cf f28075k;
    /* renamed from: l */
    private final C5177h f28076l;
    /* renamed from: m */
    private final av f28077m;
    /* renamed from: n */
    private final an f28078n;
    /* renamed from: o */
    private final aa f28079o;
    /* renamed from: p */
    private final View f28080p;
    /* renamed from: q */
    private final cb f28081q;
    /* renamed from: r */
    private final GoogleMapOptions f28082r;
    /* renamed from: s */
    private final C5186o f28083s;
    /* renamed from: t */
    private final ac f28084t;
    /* renamed from: u */
    private final ScheduledExecutorService f28085u;
    /* renamed from: v */
    private final bo f28086v;
    /* renamed from: w */
    private final Executor f28087w;
    /* renamed from: x */
    private final C6413m f28088x;
    /* renamed from: y */
    private final Context f28089y;
    /* renamed from: z */
    private final Resources f28090z;

    /* renamed from: com.google.android.m4b.maps.cg.t$4 */
    class C51894 implements OnClickListener {
        /* renamed from: a */
        private /* synthetic */ C7518t f19295a;

        C51894(C7518t c7518t) {
            this.f19295a = c7518t;
        }

        public final void onClick(View view) {
            this.f19295a.f28081q.mo5310b(C5164a.COMPASS_BUTTON_CLICK);
            view = this.f19295a.f28066b.mo4928c();
            this.f19295a.f28066b.mo4918a(new CameraPosition(view.target, view.zoom, 0.0f, 0.0f), 400);
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.t$1 */
    class C66331 implements C5172a {
        /* renamed from: a */
        private /* synthetic */ C7518t f24855a;

        C66331(C7518t c7518t) {
            this.f24855a = c7518t;
        }

        /* renamed from: a */
        public final void mo5321a() {
            this.f24855a.f28081q.mo5310b(C5164a.ZOOM_IN_BUTTON_CLICK);
            this.f24855a.f28066b.mo4925b(1.0f, -1);
        }

        /* renamed from: b */
        public final void mo5322b() {
            this.f24855a.f28081q.mo5310b(C5164a.ZOOM_OUT_BUTTON_CLICK);
            this.f24855a.f28066b.mo4925b(-1.0f, -1);
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.t$2 */
    class C75152 extends C6828a {
        /* renamed from: a */
        private /* synthetic */ C5186o f28046a;
        /* renamed from: b */
        private /* synthetic */ C5185a f28047b;
        /* renamed from: c */
        private /* synthetic */ ap f28048c;

        C75152(C5186o c5186o, C5185a c5185a, ap apVar) {
            this.f28046a = c5186o;
            this.f28047b = c5185a;
            this.f28048c = apVar;
        }

        /* renamed from: a */
        public final void mo5801a() {
            this.f28046a.mo5316a(this.f28047b);
            this.f28046a.mo5317b();
            this.f28048c.m32834c();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.t$3 */
    class C75163 extends C6801a {
        /* renamed from: a */
        private /* synthetic */ C7518t f28049a;

        C75163(C7518t c7518t) {
            this.f28049a = c7518t;
        }

        /* renamed from: e */
        public final void mo5721e(boolean z) {
            this.f28049a.mo5721e(z);
        }

        /* renamed from: f */
        public final void mo5722f(boolean z) {
            this.f28049a.mo5722f(z);
        }

        /* renamed from: g */
        public final void mo5723g(boolean z) {
            this.f28049a.mo5723g(z);
        }

        /* renamed from: m */
        public final void mo5729m(boolean z) {
            this.f28049a.mo5729m(z);
        }

        /* renamed from: h */
        public final void mo5724h(boolean z) {
            this.f28049a.mo5724h(z);
        }

        /* renamed from: i */
        public final void mo5725i(boolean z) {
            this.f28049a.mo5725i(z);
        }

        /* renamed from: j */
        public final void mo5726j(boolean z) {
            this.f28049a.mo5726j(z);
        }

        /* renamed from: k */
        public final void mo5727k(boolean z) {
            this.f28049a.mo5727k(z);
        }

        /* renamed from: l */
        public final void mo5728l(boolean z) {
            this.f28049a.mo5728l(z);
        }

        /* renamed from: n */
        public final void mo5730n(boolean z) {
            this.f28049a.mo5730n(z);
        }

        /* renamed from: v */
        public final boolean mo5731v() {
            return this.f28049a.mo5731v();
        }

        /* renamed from: w */
        public final boolean mo5732w() {
            return this.f28049a.mo5732w();
        }

        /* renamed from: x */
        public final boolean mo5733x() {
            return this.f28049a.mo5733x();
        }

        /* renamed from: C */
        public final boolean mo5719C() {
            return this.f28049a.mo5719C();
        }

        /* renamed from: y */
        public final boolean mo5734y() {
            return this.f28049a.mo5734y();
        }

        /* renamed from: z */
        public final boolean mo5735z() {
            return this.f28049a.mo5735z();
        }

        /* renamed from: A */
        public final boolean mo5717A() {
            return this.f28049a.mo5717A();
        }

        /* renamed from: B */
        public final boolean mo5718B() {
            return this.f28049a.mo5718B();
        }

        /* renamed from: D */
        public final boolean mo5720D() {
            return this.f28049a.mo5720D();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.t$a */
    static final class C7517a extends C6818a {
        /* renamed from: a */
        private final cg f28050a;
        /* renamed from: b */
        private final C5180j f28051b;

        C7517a(C5180j c5180j, cg cgVar) {
            this.f28050a = cgVar;
            this.f28051b = c5180j;
        }

        /* renamed from: a */
        public final void mo5313a(CameraPosition cameraPosition) {
            boolean z = false;
            this.f28050a.m23108b(cameraPosition.zoom < this.f28051b.mo4909a(cameraPosition.target));
            cg cgVar = this.f28050a;
            if (cameraPosition.zoom > this.f28051b.mo4931d()) {
                z = true;
            }
            cgVar.m23109c(z);
        }
    }

    private C7518t(View view, ao aoVar, C5176g c5176g, ba baVar, ak akVar, bc bcVar, be beVar, bd bdVar, C5180j c5180j, cf cfVar, C5177h c5177h, av avVar, an anVar, aa aaVar, cb cbVar, GoogleMapOptions googleMapOptions, C5186o c5186o, ac acVar, bo boVar, ScheduledExecutorService scheduledExecutorService, af afVar, Executor executor, C6413m c6413m, Resources resources, Context context, C6403c c6403c) {
        this.f28080p = view;
        this.f28067c = aoVar;
        this.f28069e = c5176g;
        this.f28070f = baVar;
        this.f28073i = akVar;
        this.f28074j = bcVar;
        this.f28072h = beVar;
        this.f28071g = bdVar;
        this.f28066b = c5180j;
        this.f28075k = cfVar;
        this.f28076l = c5177h;
        this.f28077m = avVar;
        this.f28078n = anVar;
        this.f28079o = aaVar;
        this.f28081q = cbVar;
        this.f28082r = googleMapOptions;
        this.f28083s = c5186o;
        this.f28084t = acVar;
        this.f28086v = boVar;
        this.f28085u = scheduledExecutorService;
        this.f28062J = afVar;
        this.f28087w = executor;
        this.f28088x = c6413m;
        this.f28090z = resources;
        this.f28089y = context;
        this.f28053A = c6403c;
    }

    /* renamed from: a */
    public final void mo5323a(Bundle bundle) {
        this.f28068d = false;
        C5185a a = this.f28083s.mo5314a("on_create");
        CameraPosition cameraPosition = (CameraPosition) am.m24119a(bundle, "camera");
        if (cameraPosition == null) {
            if (this.f28082r.getCamera() != null) {
                cameraPosition = this.f28082r.getCamera();
            } else {
                cameraPosition = C5180j.f19271a;
            }
        }
        this.f28066b.mo4918a(cameraPosition, 0);
        this.f28083s.mo5316a(a);
    }

    /* renamed from: r */
    public final void mo5327r() {
        this.f28068d = true;
        this.f28081q.mo5308a();
        this.f28067c.mo5331a();
    }

    /* renamed from: p */
    public final void mo5325p() {
        C5185a a = this.f28083s.mo5314a("on_resume");
        this.f28067c.mo5354s();
        this.f28073i.mo7151b();
        this.f28083s.mo5316a(a);
    }

    /* renamed from: q */
    public final void mo5326q() {
        this.f28073i.mo7152c();
        this.f28067c.mo5353r();
    }

    /* renamed from: s */
    public final void mo5328s() {
        this.f28067c.mo5355t();
    }

    /* renamed from: b */
    public final void mo5324b(Bundle bundle) {
        am.m24120a(bundle, "MapOptions", this.f28082r);
        am.m24120a(bundle, "camera", this.f28066b.mo4928c());
    }

    /* renamed from: b */
    public final CameraPosition mo5768b() {
        this.f28079o.mo4875a();
        return this.f28066b.mo4928c();
    }

    /* renamed from: c */
    public final float mo5772c() {
        this.f28079o.mo4875a();
        return this.f28066b.mo4909a(this.f28066b.mo4928c().target);
    }

    /* renamed from: d */
    public final float mo5775d() {
        this.f28079o.mo4875a();
        return this.f28066b.mo4931d();
    }

    /* renamed from: a */
    public final void mo5747a(C5484b c5484b) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_MOVE_CAMERA);
        this.f28066b.mo4917a((C5179a) C7701d.m33408a(c5484b), 0, null, this.f28081q);
    }

    /* renamed from: b */
    public final void mo5769b(C5484b c5484b) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ANIMATE_CAMERA);
        this.f28066b.mo4917a((C5179a) C7701d.m33408a(c5484b), -1, null, this.f28081q);
    }

    /* renamed from: a */
    public final void mo5749a(C5484b c5484b, C5536d c5536d) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ANIMATE_CAMERA_WITH_CALLBACK);
        this.f28066b.mo4917a((C5179a) C7701d.m33408a(c5484b), -1, c5536d, this.f28081q);
    }

    /* renamed from: a */
    public final void mo5748a(C5484b c5484b, int i, C5536d c5536d) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ANIMATE_CAMERA_WITH_CALLBACK_AND_CUSTOM_DURATION);
        C5179a c5179a = (C5179a) C7701d.m33408a(c5484b);
        C5571j.m24298a(i > 0, (Object) "durationMs must be positive");
        this.f28066b.mo4917a(c5179a, i, c5536d, this.f28081q);
    }

    /* renamed from: e */
    public final void mo5777e() {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_STOP_ANIMATION);
        this.f28066b.mo4911a();
    }

    /* renamed from: a */
    public final void mo5754a(C5545m c5545m) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_CAMERA_CHANGE_LISTENER);
        this.f28066b.mo4923a(c5545m);
    }

    /* renamed from: a */
    public final void mo5757a(C5549q c5549q) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_MAP_CLICK_LISTENER);
        this.f28067c.mo5333a(c5549q);
    }

    /* renamed from: a */
    public final void mo5759a(C5551s c5551s) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_MAP_LONG_CLICK_LISTENER);
        this.f28067c.mo5334a(c5551s);
    }

    /* renamed from: a */
    public final IPolylineDelegate mo5743a(PolylineOptions polylineOptions) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ADD_POLYLINE);
        Object biVar = new bi(polylineOptions, this.f28071g, this.f28081q, this.f28079o);
        biVar.m32919a(this.f28072h.mo5361a(biVar, false));
        this.f28071g.m22948a(biVar);
        return biVar;
    }

    /* renamed from: a */
    public final IPolygonDelegate mo5742a(PolygonOptions polygonOptions) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ADD_POLYGON);
        Object bhVar = new bh(polygonOptions, this.f28071g, this.f28081q, this.f28079o);
        bhVar.m32907a(this.f28072h.mo5361a(bhVar, true));
        this.f28071g.m22948a(bhVar);
        return bhVar;
    }

    /* renamed from: a */
    public final ICircleDelegate mo5738a(CircleOptions circleOptions) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ADD_CIRCLE);
        Object c7513l = new C7513l(circleOptions, this.f28071g, this.f28081q, this.f28079o);
        c7513l.m33025a(this.f28072h.mo5361a(c7513l, true));
        this.f28071g.m22948a(c7513l);
        return c7513l;
    }

    /* renamed from: a */
    public final IMarkerDelegate mo5741a(MarkerOptions markerOptions) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ADD_MARKER);
        return this.f28070f.m22924a(markerOptions);
    }

    /* renamed from: a */
    public final void mo5762a(C5554v c5554v) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_MARKER_CLICK_LISTENER);
        this.f28070f.m22928a(c5554v);
    }

    /* renamed from: a */
    public final void mo5763a(C5555w c5555w) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_MARKER_DRAG_LISTENER);
        this.f28070f.m22929a(c5555w);
    }

    /* renamed from: a */
    public final void mo5756a(C5547o c5547o) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_BUBBLE_CLICK_LISTENER);
        this.f28070f.m22927a(c5547o);
    }

    /* renamed from: a */
    public final void mo5758a(C5550r c5550r) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_MAP_IDLE_LISTENER);
        this.f28078n.m22860a(c5550r);
    }

    /* renamed from: a */
    public final void mo5751a(C5539g c5539g) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MARKER_SET_INFO_CONTENTS_ADAPTER);
        this.f28062J.m32790a(c5539g);
    }

    /* renamed from: a */
    public final IGroundOverlayDelegate mo5739a(GroundOverlayOptions groundOverlayOptions) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ADD_GROUND_OVERLAY);
        C7520v c7520v = new C7520v(groundOverlayOptions, this.f28071g, this.f28069e, this.f28081q, this.f28079o, this.f28090z);
        c7520v.m33169a(this.f28072h.mo5363a(c7520v));
        this.f28071g.m22948a(c7520v);
        return c7520v;
    }

    /* renamed from: a */
    public final ITileOverlayDelegate mo5744a(TileOverlayOptions tileOverlayOptions) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ADD_TILE_OVERLAY);
        ca caVar = new ca(tileOverlayOptions, this.f28071g, this.f28081q, this.f28079o);
        caVar.m33005a(this.f28072h.mo5362a(caVar));
        this.f28071g.m22948a(caVar);
        return caVar;
    }

    /* renamed from: a */
    public final IMapsEngineLayerDelegate mo5740a(MapsEngineLayerOptions mapsEngineLayerOptions) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_ADD_TILE_OVERLAY);
        ax a = ax.m32854a(mapsEngineLayerOptions, this, this.f28085u, this.f28088x, this.f28071g, this.f28081q, this.f28079o);
        a.m32858a(this.f28072h.mo5360a(a));
        this.f28071g.m22948a(a);
        return a;
    }

    /* renamed from: a */
    public final void mo5761a(C5553u c5553u) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAPS_ENGINE_OVERLAY_CLICK_LISTENER);
        this.f28072h.mo5366a(c5553u);
    }

    /* renamed from: a */
    public final void mo5753a(C5544l c5544l) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_OAUTH_TOKEN_PROVIDER);
        this.f28061I = c5544l;
    }

    /* renamed from: a */
    public final String mo5793a() {
        return this.f28061I != null ? this.f28061I.mo5793a() : null;
    }

    /* renamed from: a */
    public final void mo5794a(String str) {
        if (this.f28061I != null) {
            this.f28061I.mo5794a(str);
        }
    }

    /* renamed from: a */
    public final void mo5755a(C5546n c5546n) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_INDOOR_LISTENER);
        this.f28084t.mo4970a(c5546n);
    }

    /* renamed from: a */
    public final void mo5746a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_VISIBLE_REGION);
        this.f28066b.mo4915a(i, i2, i3, i4);
        this.f28076l.m23136a(i, i2, i3, i4);
        this.f28075k.m23098a(i, i2, i3, i4);
    }

    /* renamed from: h */
    public final boolean mo5780h() {
        this.f28079o.mo4875a();
        return this.f28063K;
    }

    /* renamed from: a */
    public final void mo5767a(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_SET_TRAFFIC_ENABLED : C5164a.MAP_SET_TRAFFIC_DISABLED);
        this.f28063K = this.f28067c.mo5336a(z);
    }

    /* renamed from: i */
    public final boolean mo5781i() {
        this.f28079o.mo4875a();
        return this.f28064L;
    }

    /* renamed from: b */
    public final boolean mo5771b(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_INDOOR : C5164a.MAP_DISABLE_INDOOR);
        return m33066o(z);
    }

    /* renamed from: o */
    private boolean m33066o(boolean z) {
        this.f28064L = this.f28067c.mo5337b(z);
        if (this.f28064L) {
            if (this.f28060H) {
                this.f28076l.m23139d().m22847a(0);
            }
            this.f28076l.m23139d().m22848a(this.f28084t);
        } else {
            this.f28076l.m23139d().m22848a(null);
            this.f28076l.m23139d().m22847a(8);
        }
        return this.f28064L;
    }

    /* renamed from: m */
    public final void mo5729m(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_INDOOR_LEVEL_PICKER : C5164a.MAP_DISABLE_INDOOR_LEVEL_PICKER);
        if (C7518t.m33061b(this.f28082r)) {
            z = false;
        }
        if (C5475a.m23830a(this.f28080p.getContext())) {
            z = false;
        }
        if (this.f28064L) {
            if (z) {
                this.f28076l.m23139d().m22847a(0);
            } else {
                this.f28076l.m23139d().m22847a(8);
            }
        }
        this.f28060H = z;
    }

    /* renamed from: C */
    public final boolean mo5719C() {
        this.f28079o.mo4875a();
        return this.f28060H;
    }

    /* renamed from: n */
    public final boolean mo5786n() {
        this.f28079o.mo4875a();
        return this.f28065M;
    }

    /* renamed from: d */
    public final void mo5776d(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_SET_BUILDINGS_ENABLED : C5164a.MAP_SET_BUILDINGS_DISABLED);
        m33067p(z);
    }

    /* renamed from: p */
    private void m33067p(boolean z) {
        this.f28065M = this.f28067c.mo5338c(z);
    }

    /* renamed from: j */
    public final boolean mo5782j() {
        this.f28079o.mo4875a();
        return this.f28074j.m32900c();
    }

    /* renamed from: c */
    public final void mo5774c(boolean z) {
        this.f28079o.mo4875a();
        if (z) {
            this.f28081q.mo5310b(C5164a.MAP_SET_MY_LOCATION_ENABLED);
            this.f28074j.m32891a();
            return;
        }
        this.f28081q.mo5310b(C5164a.MAP_SET_MY_LOCATION_DISABLED);
        this.f28074j.m32898b();
    }

    @Deprecated
    /* renamed from: k */
    public final Location mo5783k() {
        this.f28079o.mo4875a();
        return this.f28074j.m32902e();
    }

    /* renamed from: a */
    public final void mo5752a(C5541i c5541i) {
        if (c5541i != null) {
            this.f28081q.mo5310b(C5164a.MAP_SET_LOCATION_SOURCE);
        } else {
            this.f28081q.mo5310b(C5164a.MAP_CLEAR_LOCATION_SOURCE);
        }
        this.f28079o.mo4875a();
        this.f28074j.m32894a(c5541i);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo5765a(C5557y c5557y) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_MY_LOCATION_CHANGE_LISTENER);
        this.f28074j.m32896a(c5557y);
    }

    /* renamed from: a */
    public final void mo5764a(C5556x c5556x) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_MY_LOCATION_BUTTON_CLICK_LISTENER);
        this.f28074j.m32895a(c5556x);
    }

    /* renamed from: g */
    public final int mo5779g() {
        this.f28079o.mo4875a();
        return this.f28054B;
    }

    /* renamed from: a */
    public final void mo5745a(int i) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_MAP_TYPE);
        boolean z = true;
        boolean z2 = i == 2 || i == 4;
        this.f28067c.mo5332a(i);
        cf cfVar = this.f28075k;
        if (i == 0) {
            z = false;
        }
        cfVar.m23101b(z);
        this.f28075k.m23099a(z2);
        this.f28054B = i;
    }

    /* renamed from: f */
    public final void mo5778f() {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_CLEAR);
        this.f28070f.m22925a();
        this.f28071g.m22947a();
    }

    /* renamed from: m */
    public final af mo5785m() {
        this.f28079o.mo4875a();
        return new bj(this.f28081q, this.f28066b.mo4932e());
    }

    /* renamed from: l */
    public final ak mo5784l() {
        this.f28079o.mo4875a();
        if (this.f28055C == null) {
            this.f28055C = new C75163(this);
        }
        return this.f28055C;
    }

    /* renamed from: e */
    public final void mo5721e(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_ZOOM_CONTROLS : C5164a.MAP_DISABLE_ZOOM_CONTROLS);
        m33068q(z);
    }

    /* renamed from: q */
    private void m33068q(boolean z) {
        if (C7518t.m33061b(this.f28082r)) {
            z = false;
        }
        if (this.f28058F != z) {
            this.f28058F = z;
            cg b = this.f28076l.m23137b();
            if (z) {
                this.f28057E = new C7517a(this.f28066b, b);
                this.f28057E.mo5313a(mo5768b());
                this.f28066b.mo4927b(this.f28057E);
                b.m23106a(this.f28056D);
            } else {
                b.m23106a(null);
                this.f28066b.mo4930c(this.f28057E);
                this.f28057E = null;
            }
            b.m23107a(z);
        }
    }

    /* renamed from: D */
    public final boolean mo5720D() {
        this.f28079o.mo4875a();
        return this.f28076l.m23140e().m32828a().booleanValue();
    }

    /* renamed from: n */
    public final void mo5730n(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_MAP_TOOLBAR : C5164a.MAP_DISABLE_MAP_TOOLBAR);
        boolean a = C5475a.m23830a(this.f28089y);
        if (!C5398g.m23589e(this.f28089y)) {
            if (!a) {
                m33069r(z);
                return;
            }
        }
        if (z) {
            C4728u.m21048a((int) true, "The toolbar cannot be enabled on this device.");
        }
    }

    /* renamed from: r */
    private void m33069r(boolean z) {
        C5545m e = this.f28076l.m23140e();
        if (z != e.m32828a().booleanValue()) {
            e.m32831a(z);
            if (z) {
                this.f28066b.mo4927b(e);
            } else {
                this.f28066b.mo4930c(e);
            }
        }
    }

    /* renamed from: f */
    public final void mo5722f(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_COMPASS : C5164a.MAP_DISABLE_COMPASS);
        m33070s(z);
    }

    /* renamed from: s */
    private void m33070s(boolean z) {
        if (this.f28059G != z) {
            this.f28059G = z;
            Object f = this.f28076l.m23141f();
            f.m29540a(z, this.f28066b.mo4928c());
            if (z) {
                f.setOnClickListener(new C51894(this));
                this.f28066b.mo4927b(f);
                return;
            }
            this.f28066b.mo4930c(f);
            f.setOnClickListener(false);
        }
    }

    /* renamed from: g */
    public final void mo5723g(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_MY_LOCATION_BUTTON : C5164a.MAP_DISABLE_MY_LOCATION_BUTTON);
        m33071t(z);
    }

    /* renamed from: t */
    private void m33071t(boolean z) {
        if (C7518t.m33061b(this.f28082r)) {
            z = false;
        }
        this.f28074j.m32897a(z);
    }

    /* renamed from: h */
    public final void mo5724h(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_SCROLL : C5164a.MAP_DISABLE_SCROLL);
        m33072u(z);
    }

    /* renamed from: u */
    private void m33072u(boolean z) {
        this.f28067c.mo5341e(z);
    }

    /* renamed from: i */
    public final void mo5725i(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_ZOOM : C5164a.MAP_DISABLE_ZOOM);
        m33073v(z);
    }

    /* renamed from: v */
    private void m33073v(boolean z) {
        this.f28067c.mo5343f(z);
    }

    /* renamed from: j */
    public final void mo5726j(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_TILT : C5164a.MAP_DISABLE_TILT);
        m33074w(z);
    }

    /* renamed from: w */
    private void m33074w(boolean z) {
        this.f28067c.mo5345g(z);
    }

    /* renamed from: k */
    public final void mo5727k(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_ROTATE : C5164a.MAP_DISABLE_ROTATE);
        m33075x(z);
    }

    /* renamed from: x */
    private void m33075x(boolean z) {
        this.f28067c.mo5347h(z);
    }

    /* renamed from: l */
    public final void mo5728l(boolean z) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(z ? C5164a.MAP_ENABLE_ALL_GESTURES : C5164a.MAP_DISABLE_ALL_GESTURES);
        m33072u(z);
        m33073v(z);
        m33074w(z);
        m33075x(z);
    }

    /* renamed from: v */
    public final boolean mo5731v() {
        return this.f28058F;
    }

    /* renamed from: w */
    public final boolean mo5732w() {
        return this.f28059G;
    }

    /* renamed from: x */
    public final boolean mo5733x() {
        return this.f28074j.m32901d();
    }

    /* renamed from: y */
    public final boolean mo5734y() {
        return this.f28067c.mo5356w();
    }

    /* renamed from: z */
    public final boolean mo5735z() {
        return this.f28067c.mo5357x();
    }

    /* renamed from: A */
    public final boolean mo5717A() {
        return this.f28067c.mo5358y();
    }

    /* renamed from: B */
    public final boolean mo5718B() {
        return this.f28067c.mo5359z();
    }

    /* renamed from: a */
    public final void mo5750a(final ag agVar, C5484b c5484b) {
        C5571j.m24293a((Object) agVar, (Object) "Callback method is null.");
        final Bitmap bitmap = (Bitmap) (c5484b != null ? C7701d.m33408a(c5484b) : null);
        this.f28081q.mo5310b(bitmap == null ? C5164a.MAP_SNAPSHOT : C5164a.MAP_SNAPSHOT_ALLOCATED_BITMAP);
        new Thread(new Runnable(this) {
            /* renamed from: c */
            private /* synthetic */ C7518t f19298c;

            public final void run() {
                this.f19298c.f28086v.mo5296b(bitmap, agVar, false);
            }
        }).start();
    }

    /* renamed from: E */
    public final View mo7220E() {
        return this.f28080p;
    }

    /* renamed from: t */
    public final boolean mo5329t() {
        return C7518t.m33059a(this.f28082r);
    }

    /* renamed from: a */
    private static boolean m33059a(GoogleMapOptions googleMapOptions) {
        return googleMapOptions.getUseViewLifecycleInFragment() != null ? googleMapOptions.getUseViewLifecycleInFragment().booleanValue() : null;
    }

    /* renamed from: b */
    private static boolean m33061b(GoogleMapOptions googleMapOptions) {
        return googleMapOptions.getLiteMode() != null ? googleMapOptions.getLiteMode().booleanValue() : null;
    }

    /* renamed from: a */
    public final void mo5760a(final C5552t c5552t) {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.MAP_SET_ON_MAP_READY_CALLBACK);
        final Runnable c51916 = new Runnable(this) {
            /* renamed from: b */
            private /* synthetic */ C7518t f19300b;

            public final void run() {
                try {
                    if (!this.f19300b.f28068d) {
                        c5552t.mo5803a(this.f19300b);
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
        };
        if (C5398g.m23589e(this.f28089y) != null) {
            new C6418w(this.f28089y, "com.google.android.gms").m28039a(new C4730a(this) {
                /* renamed from: a */
                final /* synthetic */ C7518t f24856a;

                /* renamed from: com.google.android.m4b.maps.cg.t$7$1 */
                class C51921 implements Runnable {
                    /* renamed from: a */
                    private /* synthetic */ C66347 f19301a;

                    C51921(C66347 c66347) {
                        this.f19301a = c66347;
                    }

                    public final void run() {
                        C7518t.m33064e(this.f19301a.f24856a);
                    }
                }

                /* renamed from: a */
                public final void mo5300a(boolean z) {
                    if (z) {
                        C4728u.m21049a("The Maps API is blocked on this device.");
                        this.f24856a.f28087w.execute(new C51921(this));
                        return;
                    }
                    this.f24856a.f28087w.execute(c51916);
                }
            });
        } else {
            this.f28087w.execute(c51916);
        }
    }

    /* renamed from: b */
    public final void mo5770b(String str) {
        this.f28079o.mo4875a();
        this.f28067c.mo5339d().setContentDescription(str);
    }

    /* renamed from: c */
    public final void mo5773c(Bundle bundle) {
        this.f28079o.mo4875a();
        this.f28073i.mo7153d();
        C5162c l = this.f28067c.mo5351l();
        if (l != null) {
            l.m23076a(bundle);
            this.f28067c.mo5352m();
            this.f28074j.m32899b(true);
            this.f28070f.m22930a(true);
        }
    }

    /* renamed from: u */
    public final void mo5788u() {
        this.f28079o.mo4875a();
        C5162c l = this.f28067c.mo5351l();
        if (l != null) {
            l.m23080d();
            this.f28067c.mo5352m();
            this.f28074j.m32899b(false);
            this.f28070f.m22930a(false);
        }
        this.f28073i.mo7154e();
    }

    /* renamed from: a */
    public final void mo5766a(C5558z c5558z) {
        this.f28079o.mo4875a();
        this.f28067c.mo5335a(c5558z);
    }

    /* renamed from: a */
    public static C7518t m33058a(GoogleMapOptions googleMapOptions, boolean z, C5173d c5173d) {
        ce ceVar;
        boolean z2;
        String str = "";
        C5571j.m24292a((Object) googleMapOptions);
        C5197a d = c5173d.m23119i().m23228d();
        boolean z3 = d != null && d.m23198b();
        C5186o c6631p = new C6631p(new C4712d(), "map_start_up", z3, c5173d.m23111a());
        c6631p.mo5315a();
        C5185a a = c6631p.mo5314a("init");
        C5185a a2 = c6631p.mo5314a("map_load");
        Context c = c5173d.m23113c();
        Resources d2 = c5173d.m23114d();
        ag.m22842a(c5173d);
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(10);
        cf cfVar = new cf(c, d2);
        boolean b = C7518t.m33061b(googleMapOptions);
        c5173d.m23119i().m23227c();
        String a3 = bm.m22979a(b);
        ce b2 = c5173d.m23112b();
        C6413m a4 = c5173d.m23111a().m23167a();
        cb a5 = cd.m29513a(c, new ae(new C6632q(c, c.getPackageName()), a4), b2, a3);
        C5188s c5188s = new C5188s(c, a5, d2);
        ap a6 = ap.m32824a(c, d2, c5188s, b);
        C5177h c5177h = new C5177h(c, d2, a6);
        C5176g a7 = C5176g.m23129a(c);
        ap apVar = a6;
        an anVar = new an(by.m23061a());
        C5162c a8 = (googleMapOptions.getAmbientEnabled() == null || !googleMapOptions.getAmbientEnabled().booleanValue()) ? null : C5162c.m23074a(c);
        if (a8 != null) {
            a5.mo5309a(C5164a.MAP_ENABLE_AMBIENT_STYLING);
        }
        C5186o c5186o = c6631p;
        cb cbVar = a5;
        ap apVar2 = apVar;
        C6413m c6413m = a4;
        ce ceVar2 = b2;
        boolean z4 = b;
        cf cfVar2 = cfVar;
        C5177h c5177h2 = c5177h;
        Resources resources = d2;
        an anVar2 = anVar;
        an anVar3 = anVar;
        Context context = c;
        C5185a c5185a = a2;
        C5185a c5185a2 = a;
        ao a9 = bm.m22977a(a3, c5173d, newScheduledThreadPool, cfVar.m23097a(), c5177h, z, str, C7518t.m33059a(googleMapOptions), cfVar.m23100b(), anVar2, c5188s, cbVar, a8);
        View d3 = a9.mo5339d();
        if ((d3 instanceof SurfaceView) && googleMapOptions.getZOrderOnTop() != null) {
            ((SurfaceView) d3).setZOrderOnTop(googleMapOptions.getZOrderOnTop().booleanValue());
        }
        d3.setContentDescription(resources.getString(C4513R.string.maps_GOOGLE_MAP));
        C5180j e = a9.mo5340e();
        Executor g = c5173d.m23117g();
        ap apVar3 = apVar2;
        bf bfVar = new bf(g, apVar3, c6413m);
        aa f = c5173d.m23116f();
        C5145a f2 = a9.mo5342f();
        af a10 = af.m32788a(f, context, resources);
        C5177h c5177h3 = c5177h2;
        ba baVar = new ba(f2, a10, a7, f, cbVar, c5177h3.m23140e(), a9, z4, bfVar, resources);
        be g2 = a9.mo5344g();
        bd bdVar = new bd();
        Context context2 = context;
        Resources resources2 = resources;
        av avVar = new av(context2, resources2, g2, bdVar, a7, cbVar, f);
        g2.mo5364a(avVar);
        al a11 = al.m32796a(context);
        bc bcVar = new bc(context2, resources2, e, c5177h3.m23138c(), a9.mo5346h(), a11, cbVar, c6413m);
        ac i = a9.mo5348i();
        bo j = a9.mo5349j();
        C6413m c6413m2 = c6413m;
        Executor executor = g;
        Resources resources3 = resources;
        C5186o c5186o2 = c5186o;
        an anVar4 = anVar3;
        anVar4.m22862b(new C75152(c5186o2, c5185a, apVar3));
        View frameLayout = new FrameLayout(context);
        frameLayout.addView(d3);
        cf cfVar3 = cfVar2;
        frameLayout.addView(cfVar3.m23097a());
        frameLayout.addView(c5177h3.m23135a());
        frameLayout.addView(avVar.m22903d());
        frameLayout.setTag("GoogleMapView");
        C7518t c7518t = r15;
        C7518t c7518t2 = new C7518t(frameLayout, a9, a7, baVar, a11, bcVar, g2, bdVar, e, cfVar3, c5177h3, avVar, anVar4, f, cbVar, googleMapOptions, c5186o2, i, j, newScheduledThreadPool, a10, executor, c6413m2, resources3, context, c5173d.m23120j());
        C5544l c5544l = c7518t;
        boolean b3 = C7518t.m33061b(c5544l.f28082r);
        c5544l.f28072h.mo5365a(c5544l);
        if (c5544l.f28082r.getCompassEnabled() != null) {
            c5544l.mo5722f(c5544l.f28082r.getCompassEnabled().booleanValue());
        } else {
            boolean z5 = f28052a;
            if (C5475a.m23830a(c5544l.f28089y)) {
                z5 = false;
            }
            c5544l.m33070s(z5);
        }
        if (C5475a.m23830a(c5544l.f28080p.getContext())) {
            c5544l.f28060H = false;
        }
        if (!b3) {
            c5544l.m33067p(true);
            c5544l.m33066o(C5475a.m23830a(c5544l.f28080p.getContext()) ^ true);
        }
        if (c5544l.f28082r.getZoomControlsEnabled() != null) {
            c5544l.mo5721e(c5544l.f28082r.getZoomControlsEnabled().booleanValue());
            ceVar = ceVar2;
        } else {
            if (f28052a) {
                ceVar = ceVar2;
                if ((ceVar.m23095a(6500000) ^ 1) != 0) {
                    z2 = true;
                    c5544l.m33068q(z2);
                }
            } else {
                ceVar = ceVar2;
            }
            z2 = false;
            c5544l.m33068q(z2);
        }
        if (c5544l.f28082r.getMapType() != -1) {
            c5544l.mo5745a(c5544l.f28082r.getMapType());
        }
        z2 = b3 ^ 1;
        if (c5544l.f28082r.getZoomGesturesEnabled() != null) {
            c5544l.mo5725i(c5544l.f28082r.getZoomGesturesEnabled().booleanValue());
        } else {
            c5544l.m33073v(z2);
        }
        if (c5544l.f28082r.getScrollGesturesEnabled() != null) {
            c5544l.mo5724h(c5544l.f28082r.getScrollGesturesEnabled().booleanValue());
        } else {
            c5544l.m33072u(z2);
        }
        if (c5544l.f28082r.getTiltGesturesEnabled() != null) {
            c5544l.mo5726j(c5544l.f28082r.getTiltGesturesEnabled().booleanValue());
        } else {
            c5544l.m33074w(z2);
        }
        if (c5544l.f28082r.getRotateGesturesEnabled() != null) {
            c5544l.mo5727k(c5544l.f28082r.getRotateGesturesEnabled().booleanValue());
        } else {
            c5544l.m33075x(z2);
        }
        if (c5544l.f28082r.getMapToolbarEnabled() != null) {
            c5544l.mo5730n(c5544l.f28082r.getMapToolbarEnabled().booleanValue());
        } else {
            z2 = C5475a.m23830a(c5544l.f28089y);
            if (!C5398g.m23589e(c5544l.f28089y)) {
                if (!z2) {
                    if (b3) {
                        c5544l.m33069r(true);
                    } else {
                        c5544l.m33069r(ceVar.m23095a(6500000));
                    }
                }
            }
            c5544l.m33069r(false);
        }
        c5544l.m33071t(f28052a);
        cbVar.mo5309a(C5164a.MAP_CREATED);
        c5173d.m23118h().m22975a(1);
        c5186o2.mo5316a(c5185a2);
        return c5544l;
    }

    /* renamed from: o */
    public final /* synthetic */ IIndoorBuildingDelegate mo5787o() {
        this.f28079o.mo4875a();
        this.f28081q.mo5310b(C5164a.INDOOR_GET_FOCUSED_BULIDING);
        C5196z c = this.f28084t.mo4973c();
        return c != null ? new C7521y(this.f28084t, c, this.f28081q) : null;
    }

    /* renamed from: e */
    static /* synthetic */ void m33064e(C7518t c7518t) {
        c7518t.f28088x.mo4894f();
        c7518t.mo5745a(0);
        c7518t.f28067c.mo5350k();
        c7518t.f28053A.mo4869d();
    }
}
