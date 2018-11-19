package com.google.android.m4b.maps.p124x;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.MapsInitializer;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cg.C5173d;
import com.google.android.m4b.maps.cg.C7510e;
import com.google.android.m4b.maps.cg.C7512k;
import com.google.android.m4b.maps.cg.am;
import com.google.android.m4b.maps.cg.aq;
import com.google.android.m4b.maps.cg.bq;
import com.google.android.m4b.maps.cg.bu;
import com.google.android.m4b.maps.cg.ce;
import com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.C5537e.C6805a;
import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.x.b */
public class C7708b extends C6805a {
    /* renamed from: a */
    private boolean f28183a = false;
    /* renamed from: b */
    private ce f28184b = null;
    /* renamed from: c */
    private C5173d f28185c;
    /* renamed from: d */
    private Resources f28186d;

    /* renamed from: a */
    public final void mo7249a(C5484b c5484b) {
        mo7250a(c5484b, 0);
    }

    /* renamed from: a */
    public final void mo7250a(C5484b c5484b, int i) {
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("Google Play services client version: ");
        stringBuilder.append(i);
        C4728u.m21048a(4, stringBuilder.toString());
        this.f28186d = (Resources) C7701d.m33408a(c5484b);
        this.f28184b = new ce(i, true, false);
        MapsInitializer.m20403a((C5537e) this);
        this.f28183a = true;
    }

    /* renamed from: b */
    public final C5542j mo7252b(C5484b c5484b) {
        C5571j.m24302b(this.f28183a, (Object) "CreatorImpl not initialized properly.");
        Context context = (Activity) C7701d.m33408a(c5484b);
        C7708b.m33433a(context);
        return am.m32809a(context, m33434b(context.getApplicationContext()));
    }

    /* renamed from: a */
    public final C5543k mo7248a(C5484b c5484b, GoogleMapOptions googleMapOptions) {
        C5571j.m24302b(this.f28183a, (Object) "CreatorImpl not initialized properly.");
        Context context = (Context) C7701d.m33408a(c5484b);
        C7708b.m33433a(context);
        return new aq(context, googleMapOptions, m33434b(context.getApplicationContext()));
    }

    /* renamed from: c */
    public final ai mo7253c(C5484b c5484b) {
        C5571j.m24302b(this.f28183a, (Object) "CreatorImpl not initialized properly.");
        Context context = (Activity) C7701d.m33408a(c5484b);
        C7708b.m33433a(context);
        return bq.m32945a(context, m33434b(context.getApplicationContext()));
    }

    /* renamed from: a */
    public final aj mo7246a(C5484b c5484b, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        C5571j.m24302b(this.f28183a, (Object) "CreatorImpl not initialized properly.");
        Context context = (Context) C7701d.m33408a(c5484b);
        C7708b.m33433a(context);
        return new bu(context, streetViewPanoramaOptions, m33434b(context.getApplicationContext()));
    }

    /* renamed from: a */
    public final C5535c mo7247a() {
        return new C7512k();
    }

    /* renamed from: b */
    public final IBitmapDescriptorFactoryDelegate mo7251b() {
        return new C7510e(this.f28186d);
    }

    /* renamed from: a */
    private static void m33433a(Context context) {
        try {
            context = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            StringBuilder stringBuilder = new StringBuilder(49);
            stringBuilder.append("Google Play services package version: ");
            stringBuilder.append(context);
            C4728u.m21048a(4, stringBuilder.toString());
        } catch (Context context2) {
            throw new IllegalStateException(context2);
        }
    }

    /* renamed from: b */
    private C5173d m33434b(Context context) {
        if (this.f28185c == null) {
            this.f28185c = C5173d.m23110a(context, this.f28186d, context.getPackageName(), this.f28184b);
        }
        return this.f28185c;
    }
}
