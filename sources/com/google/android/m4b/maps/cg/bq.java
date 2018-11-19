package com.google.android.m4b.maps.cg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C4731z;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.ae;
import com.google.android.m4b.maps.p124x.ah;
import com.google.android.m4b.maps.p124x.ai.C6798a;
import com.google.android.m4b.maps.p124x.am;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.ArrayList;
import java.util.List;

public final class bq extends C6798a {
    /* renamed from: a */
    private final C5153a f27983a;
    /* renamed from: b */
    private br f27984b;
    /* renamed from: c */
    private StreetViewPanoramaOptions f27985c;
    /* renamed from: d */
    private final List<ae> f27986d = new ArrayList();
    /* renamed from: e */
    private Context f27987e;

    /* renamed from: com.google.android.m4b.maps.cg.bq$a */
    public interface C5153a {
        /* renamed from: a */
        br mo5298a(StreetViewPanoramaOptions streetViewPanoramaOptions);
    }

    /* renamed from: com.google.android.m4b.maps.cg.bq$1 */
    class C66041 implements C5153a {
        /* renamed from: a */
        private /* synthetic */ boolean f24775a;
        /* renamed from: b */
        private /* synthetic */ C5173d f24776b;

        C66041(boolean z, C5173d c5173d) {
            this.f24775a = z;
            this.f24776b = c5173d;
        }

        /* renamed from: a */
        public final br mo5298a(StreetViewPanoramaOptions streetViewPanoramaOptions) {
            return br.m32959a(streetViewPanoramaOptions, this.f24775a, this.f24776b);
        }
    }

    /* renamed from: f */
    public final void mo7198f() {
    }

    private bq(C5153a c5153a, Context context) {
        this.f27983a = (C5153a) C5571j.m24292a((Object) c5153a);
        this.f27987e = context;
    }

    /* renamed from: a */
    public static bq m32945a(Activity activity, C5173d c5173d) {
        return new bq(new C66041(C4731z.m21055a(activity), c5173d), c5173d.m23113c());
    }

    @Deprecated
    /* renamed from: a */
    public final ah mo7189a() {
        if (!C5398g.m23589e(this.f27987e)) {
            return this.f27984b;
        }
        C4728u.m21049a("This device does not support the use of StreetViewPanoramaFragment.getStreetViewPanorama(). Please use StreetViewPanoramaFragment.getStreetViewPanoramaAsync() instead.");
        return null;
    }

    /* renamed from: a */
    public final void mo7191a(C5484b c5484b, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) {
        this.f27985c = streetViewPanoramaOptions;
    }

    /* renamed from: a */
    public final void mo7190a(Bundle bundle) {
        if (this.f27985c == null) {
            this.f27985c = (StreetViewPanoramaOptions) am.m24119a(bundle, "StreetViewPanoramaOptions");
        }
        if (this.f27985c == null) {
            this.f27985c = new StreetViewPanoramaOptions();
        }
    }

    /* renamed from: a */
    public final C5484b mo7188a(C5484b c5484b, C5484b c5484b2, Bundle bundle) {
        Object j;
        if (this.f27984b == null) {
            C7701d.m33408a(c5484b);
            this.f27984b = this.f27983a.mo5298a(this.f27985c);
            this.f27984b.m32967a(bundle);
            j = this.f27984b.m32992j();
            for (ae a : this.f27986d) {
                this.f27984b.m32975a(a);
            }
            this.f27986d.clear();
        } else {
            j = this.f27984b.m32992j();
            ViewGroup viewGroup = (ViewGroup) j.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(j);
            }
        }
        return C7701d.m33407a(j);
    }

    /* renamed from: b */
    public final void mo7193b() {
        this.f27984b.m32989g();
    }

    /* renamed from: c */
    public final void mo7195c() {
        this.f27984b.m32990h();
    }

    /* renamed from: d */
    public final void mo7196d() {
        if (this.f27984b.m32993k()) {
            this.f27984b.m32991i();
            this.f27984b = null;
        }
    }

    /* renamed from: e */
    public final void mo7197e() {
        if (this.f27984b != null) {
            this.f27984b.m32991i();
            this.f27984b = null;
        }
        this.f27985c = null;
    }

    /* renamed from: b */
    public final void mo7194b(Bundle bundle) {
        if (this.f27984b != null) {
            this.f27984b.m32979b(bundle);
        } else if (this.f27985c != null) {
            am.m24120a(bundle, "StreetViewPanoramaOptions", this.f27985c);
        }
    }

    /* renamed from: g */
    public final boolean mo7199g() {
        return this.f27984b != null;
    }

    /* renamed from: a */
    public final void mo7192a(ae aeVar) {
        if (this.f27984b != null) {
            this.f27984b.m32975a(aeVar);
        } else {
            this.f27986d.add(aeVar);
        }
    }
}
