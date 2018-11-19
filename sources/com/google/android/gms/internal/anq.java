package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;

@zzzv
public final class anq extends C2355b {
    /* renamed from: a */
    private final zzpq f23026a;
    /* renamed from: b */
    private final Drawable f23027b;
    /* renamed from: c */
    private final Uri f23028c;
    /* renamed from: d */
    private final double f23029d;

    public anq(zzpq zzpq) {
        Drawable drawable;
        double d;
        this.f23026a = zzpq;
        Uri uri = null;
        try {
            IObjectWrapper zzjr = this.f23026a.zzjr();
            if (zzjr != null) {
                drawable = (Drawable) C4296b.a(zzjr);
                this.f23027b = drawable;
                uri = this.f23026a.getUri();
                this.f23028c = uri;
                d = 1.0d;
                d = this.f23026a.getScale();
                this.f23029d = d;
            }
        } catch (Throwable e) {
            hx.m19912b("Failed to get drawable.", e);
        }
        drawable = null;
        this.f23027b = drawable;
        try {
            uri = this.f23026a.getUri();
        } catch (Throwable e2) {
            hx.m19912b("Failed to get uri.", e2);
        }
        this.f23028c = uri;
        d = 1.0d;
        try {
            d = this.f23026a.getScale();
        } catch (Throwable e3) {
            hx.m19912b("Failed to get scale.", e3);
        }
        this.f23029d = d;
    }

    /* renamed from: a */
    public final Drawable m27159a() {
        return this.f23027b;
    }

    /* renamed from: b */
    public final Uri m27160b() {
        return this.f23028c;
    }

    /* renamed from: c */
    public final double m27161c() {
        return this.f23029d;
    }
}
