package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.formats.C2356c.C2354a;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzzv
public final class anz extends NativeAppInstallAd {
    /* renamed from: a */
    private final zzqe f26753a;
    /* renamed from: b */
    private final List<C2355b> f26754b = new ArrayList();
    /* renamed from: c */
    private final anq f26755c;
    /* renamed from: d */
    private final C2412j f26756d = new C2412j();
    /* renamed from: e */
    private final C2354a f26757e;

    public anz(zzqe zzqe) {
        anq anq;
        this.f26753a = zzqe;
        C2354a c2354a = null;
        try {
            List images = this.f26753a.getImages();
            if (images != null) {
                for (Object next : images) {
                    zzpq anp;
                    if (next instanceof IBinder) {
                        IBinder iBinder = (IBinder) next;
                        if (iBinder != null) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            anp = queryLocalInterface instanceof zzpq ? (zzpq) queryLocalInterface : new anp(iBinder);
                            if (anp != null) {
                                this.f26754b.add(new anq(anp));
                            }
                        }
                    }
                    anp = null;
                    if (anp != null) {
                        this.f26754b.add(new anq(anp));
                    }
                }
            }
        } catch (Throwable e) {
            hx.m19912b("Failed to get image.", e);
        }
        try {
            zzpq zzjs = this.f26753a.zzjs();
            if (zzjs != null) {
                anq = new anq(zzjs);
                this.f26755c = anq;
                if (this.f26753a.zzjy() != null) {
                    c2354a = new ann(this.f26753a.zzjy());
                }
                this.f26757e = c2354a;
            }
        } catch (Throwable e2) {
            hx.m19912b("Failed to get image.", e2);
        }
        anq = null;
        this.f26755c = anq;
        try {
            if (this.f26753a.zzjy() != null) {
                c2354a = new ann(this.f26753a.zzjy());
            }
        } catch (Throwable e22) {
            hx.m19912b("Failed to get attribution info.", e22);
        }
        this.f26757e = c2354a;
    }

    /* renamed from: k */
    private final IObjectWrapper m31474k() {
        try {
            return this.f26753a.zzjt();
        } catch (Throwable e) {
            hx.m19912b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object m31475a() {
        return m31474k();
    }

    /* renamed from: b */
    public final CharSequence m31476b() {
        try {
            return this.f26753a.getHeadline();
        } catch (Throwable e) {
            hx.m19912b("Failed to get headline.", e);
            return null;
        }
    }

    /* renamed from: c */
    public final List<C2355b> m31477c() {
        return this.f26754b;
    }

    /* renamed from: d */
    public final CharSequence m31478d() {
        try {
            return this.f26753a.getBody();
        } catch (Throwable e) {
            hx.m19912b("Failed to get body.", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C2355b m31479e() {
        return this.f26755c;
    }

    /* renamed from: f */
    public final CharSequence m31480f() {
        try {
            return this.f26753a.getCallToAction();
        } catch (Throwable e) {
            hx.m19912b("Failed to get call to action.", e);
            return null;
        }
    }

    /* renamed from: g */
    public final Double m31481g() {
        try {
            double starRating = this.f26753a.getStarRating();
            return starRating == -1.0d ? null : Double.valueOf(starRating);
        } catch (Throwable e) {
            hx.m19912b("Failed to get star rating.", e);
            return null;
        }
    }

    /* renamed from: h */
    public final CharSequence m31482h() {
        try {
            return this.f26753a.getStore();
        } catch (Throwable e) {
            hx.m19912b("Failed to get store", e);
            return null;
        }
    }

    /* renamed from: i */
    public final CharSequence m31483i() {
        try {
            return this.f26753a.getPrice();
        } catch (Throwable e) {
            hx.m19912b("Failed to get price.", e);
            return null;
        }
    }

    /* renamed from: j */
    public final C2412j m31484j() {
        try {
            if (this.f26753a.getVideoController() != null) {
                this.f26756d.a(this.f26753a.getVideoController());
            }
        } catch (Throwable e) {
            hx.m19912b("Exception occurred while getting video controller", e);
        }
        return this.f26756d;
    }
}
