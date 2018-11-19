package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.formats.C2356c.C2354a;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzzv
public final class aoc extends NativeContentAd {
    /* renamed from: a */
    private final zzqi f26758a;
    /* renamed from: b */
    private final List<C2355b> f26759b = new ArrayList();
    /* renamed from: c */
    private final anq f26760c;
    /* renamed from: d */
    private final C2412j f26761d = new C2412j();
    /* renamed from: e */
    private final C2354a f26762e;

    public aoc(zzqi zzqi) {
        anq anq;
        this.f26758a = zzqi;
        C2354a c2354a = null;
        try {
            List images = this.f26758a.getImages();
            if (images != null) {
                for (Object next : images) {
                    zzpq anp;
                    if (next instanceof IBinder) {
                        IBinder iBinder = (IBinder) next;
                        if (iBinder != null) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            anp = queryLocalInterface instanceof zzpq ? (zzpq) queryLocalInterface : new anp(iBinder);
                            if (anp != null) {
                                this.f26759b.add(new anq(anp));
                            }
                        }
                    }
                    anp = null;
                    if (anp != null) {
                        this.f26759b.add(new anq(anp));
                    }
                }
            }
        } catch (Throwable e) {
            hx.m19912b("Failed to get image.", e);
        }
        try {
            zzpq zzjz = this.f26758a.zzjz();
            if (zzjz != null) {
                anq = new anq(zzjz);
                this.f26760c = anq;
                if (this.f26758a.zzjy() != null) {
                    c2354a = new ann(this.f26758a.zzjy());
                }
                this.f26762e = c2354a;
            }
        } catch (Throwable e2) {
            hx.m19912b("Failed to get image.", e2);
        }
        anq = null;
        this.f26760c = anq;
        try {
            if (this.f26758a.zzjy() != null) {
                c2354a = new ann(this.f26758a.zzjy());
            }
        } catch (Throwable e22) {
            hx.m19912b("Failed to get attribution info.", e22);
        }
        this.f26762e = c2354a;
    }

    /* renamed from: i */
    private final IObjectWrapper m31485i() {
        try {
            return this.f26758a.zzjt();
        } catch (Throwable e) {
            hx.m19912b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object m31486a() {
        return m31485i();
    }

    /* renamed from: b */
    public final CharSequence m31487b() {
        try {
            return this.f26758a.getHeadline();
        } catch (Throwable e) {
            hx.m19912b("Failed to get headline.", e);
            return null;
        }
    }

    /* renamed from: c */
    public final List<C2355b> m31488c() {
        return this.f26759b;
    }

    /* renamed from: d */
    public final CharSequence m31489d() {
        try {
            return this.f26758a.getBody();
        } catch (Throwable e) {
            hx.m19912b("Failed to get body.", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C2355b m31490e() {
        return this.f26760c;
    }

    /* renamed from: f */
    public final CharSequence m31491f() {
        try {
            return this.f26758a.getCallToAction();
        } catch (Throwable e) {
            hx.m19912b("Failed to get call to action.", e);
            return null;
        }
    }

    /* renamed from: g */
    public final CharSequence m31492g() {
        try {
            return this.f26758a.getAdvertiser();
        } catch (Throwable e) {
            hx.m19912b("Failed to get attribution.", e);
            return null;
        }
    }

    /* renamed from: h */
    public final C2412j m31493h() {
        try {
            if (this.f26758a.getVideoController() != null) {
                this.f26761d.a(this.f26758a.getVideoController());
            }
        } catch (Throwable e) {
            hx.m19912b("Exception occurred while getting video controller", e);
        }
        return this.f26761d;
    }
}
