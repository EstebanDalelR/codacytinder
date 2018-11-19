package com.google.android.m4b.maps.cg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C4731z;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.C5538f;
import com.google.android.m4b.maps.p124x.C5542j.C6813a;
import com.google.android.m4b.maps.p124x.C5552t;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.ArrayList;
import java.util.List;

public class am extends C6813a {
    /* renamed from: a */
    private static final String f27850a = "am";
    /* renamed from: b */
    private final C5135a f27851b;
    /* renamed from: c */
    private C6635x f27852c;
    /* renamed from: d */
    private GoogleMapOptions f27853d;
    /* renamed from: e */
    private final List<C5552t> f27854e = new ArrayList();
    /* renamed from: f */
    private final Context f27855f;

    /* renamed from: com.google.android.m4b.maps.cg.am$a */
    public interface C5135a {
        /* renamed from: a */
        C6635x mo5297a(GoogleMapOptions googleMapOptions);
    }

    /* renamed from: com.google.android.m4b.maps.cg.am$1 */
    class C66011 implements C5135a {
        /* renamed from: a */
        private /* synthetic */ boolean f24764a;
        /* renamed from: b */
        private /* synthetic */ C5173d f24765b;

        C66011(boolean z, C5173d c5173d) {
            this.f24764a = z;
            this.f24765b = c5173d;
        }

        /* renamed from: a */
        public final C6635x mo5297a(GoogleMapOptions googleMapOptions) {
            return C7518t.m33058a(googleMapOptions, this.f24764a, this.f24765b);
        }
    }

    private am(C5135a c5135a, Context context) {
        this.f27851b = (C5135a) C5571j.m24292a((Object) c5135a);
        this.f27855f = context;
    }

    /* renamed from: a */
    public static am m32809a(Activity activity, C5173d c5173d) {
        return new am(new C66011(C4731z.m21055a(activity), c5173d), c5173d.m23113c());
    }

    @Deprecated
    /* renamed from: a */
    public final C5538f mo7156a() {
        if (!C5398g.m23589e(this.f27855f)) {
            return this.f27852c;
        }
        C4728u.m21049a("This device does not support the use of MapFragment.getMap(). Please use MapFragment.getMapAsync() instead.");
        return null;
    }

    /* renamed from: a */
    public final void mo7158a(C5484b c5484b, GoogleMapOptions googleMapOptions, Bundle bundle) {
        this.f27853d = googleMapOptions;
    }

    /* renamed from: a */
    public final void mo7157a(Bundle bundle) {
        if (this.f27853d == null) {
            this.f27853d = (GoogleMapOptions) com.google.android.m4b.maps.p124x.am.m24119a(bundle, "MapOptions");
        }
        if (this.f27853d == null) {
            this.f27853d = new GoogleMapOptions();
        }
    }

    /* renamed from: a */
    public final C5484b mo7155a(C5484b c5484b, C5484b c5484b2, Bundle bundle) {
        Object E;
        if (this.f27852c == null) {
            C7701d.m33408a(c5484b);
            this.f27852c = this.f27851b.mo5297a(this.f27853d);
            this.f27852c.mo5323a(bundle);
            E = this.f27852c.mo7220E();
            for (C5552t a : this.f27854e) {
                try {
                    this.f27852c.mo5760a(a);
                } catch (C5484b c5484b3) {
                    throw new RuntimeRemoteException(c5484b3);
                }
            }
            this.f27854e.clear();
        } else {
            E = this.f27852c.mo7220E();
            ViewGroup viewGroup = (ViewGroup) E.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(E);
            }
        }
        return C7701d.m33407a(E);
    }

    /* renamed from: b */
    public final void mo7160b() {
        this.f27852c.mo5325p();
    }

    /* renamed from: c */
    public final void mo7162c() {
        this.f27852c.mo5326q();
    }

    /* renamed from: d */
    public final void mo7164d() {
        if (this.f27852c.mo5329t()) {
            this.f27852c.mo5327r();
            this.f27852c = null;
        }
    }

    /* renamed from: e */
    public final void mo7165e() {
        if (this.f27852c != null) {
            this.f27852c.mo5327r();
            this.f27852c = null;
        }
        this.f27853d = null;
    }

    /* renamed from: f */
    public final void mo7166f() {
        this.f27852c.mo5328s();
    }

    /* renamed from: b */
    public final void mo7161b(Bundle bundle) {
        if (this.f27852c != null) {
            this.f27852c.mo5324b(bundle);
        } else if (this.f27853d != null) {
            com.google.android.m4b.maps.p124x.am.m24120a(bundle, "MapOptions", this.f27853d);
        }
    }

    /* renamed from: g */
    public final boolean mo7167g() {
        return this.f27852c != null;
    }

    /* renamed from: a */
    public final void mo7159a(C5552t c5552t) {
        if (this.f27852c != null) {
            try {
                this.f27852c.mo5760a(c5552t);
                return;
            } catch (C5552t c5552t2) {
                throw new RuntimeRemoteException(c5552t2);
            }
        }
        this.f27854e.add(c5552t2);
    }

    /* renamed from: c */
    public final void mo7163c(Bundle bundle) {
        if (this.f27852c != null) {
            try {
                this.f27852c.mo5773c(bundle);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }
    }

    /* renamed from: h */
    public final void mo7168h() {
        if (this.f27852c != null) {
            try {
                this.f27852c.mo5788u();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }
}
