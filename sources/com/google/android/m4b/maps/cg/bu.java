package com.google.android.m4b.maps.cg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C4731z;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.ae;
import com.google.android.m4b.maps.p124x.ah;
import com.google.android.m4b.maps.p124x.aj.C6799a;

public final class bu extends C6799a {
    /* renamed from: a */
    private br f28003a;
    /* renamed from: b */
    private final Context f28004b;
    /* renamed from: c */
    private final StreetViewPanoramaOptions f28005c;
    /* renamed from: d */
    private final C5173d f28006d;

    /* renamed from: e */
    public final void mo7207e() {
    }

    public bu(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions, C5173d c5173d) {
        this.f28004b = context;
        if (streetViewPanoramaOptions == null) {
            streetViewPanoramaOptions = new StreetViewPanoramaOptions();
        }
        this.f28005c = streetViewPanoramaOptions;
        this.f28006d = c5173d;
    }

    @Deprecated
    /* renamed from: a */
    public final ah mo7200a() {
        if (!C5398g.m23589e(this.f28004b)) {
            return this.f28003a;
        }
        C4728u.m21049a("This device does not support the use of StreetViewPanoramaView.getStreetViewPanorama(). Please use StreetViewPanoramaView.getStreetViewPanoramaAsync() instead.");
        return null;
    }

    /* renamed from: a */
    public final void mo7201a(Bundle bundle) {
        this.f28003a = br.m32959a(this.f28005c, this.f28004b instanceof Activity ? C4731z.m21055a((Activity) this.f28004b) : false, this.f28006d);
        this.f28003a.m32967a(bundle);
    }

    /* renamed from: d */
    public final void mo7206d() {
        this.f28003a.m32991i();
    }

    /* renamed from: b */
    public final void mo7203b() {
        this.f28003a.m32989g();
    }

    /* renamed from: c */
    public final void mo7205c() {
        this.f28003a.m32990h();
    }

    /* renamed from: b */
    public final void mo7204b(Bundle bundle) {
        this.f28003a.m32979b(bundle);
    }

    /* renamed from: f */
    public final C5484b mo7208f() {
        return C7701d.m33407a(this.f28003a.m32992j());
    }

    /* renamed from: a */
    public final void mo7202a(ae aeVar) {
        if (this.f28003a != null) {
            this.f28003a.m32975a(aeVar);
        }
    }
}
