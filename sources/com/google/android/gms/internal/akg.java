package com.google.android.gms.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C2338a;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.ads.C2362g;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.C2414k;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

@zzzv
public final class akg {
    /* renamed from: a */
    private final arv f15364a;
    /* renamed from: b */
    private final ain f15365b;
    /* renamed from: c */
    private final AtomicBoolean f15366c;
    /* renamed from: d */
    private final C2412j f15367d;
    /* renamed from: e */
    private ajc f15368e;
    /* renamed from: f */
    private zzje f15369f;
    /* renamed from: g */
    private C2338a f15370g;
    /* renamed from: h */
    private C2343d[] f15371h;
    /* renamed from: i */
    private AppEventListener f15372i;
    /* renamed from: j */
    private C2362g f15373j;
    /* renamed from: k */
    private zzks f15374k;
    /* renamed from: l */
    private OnCustomRenderedAdLoadedListener f15375l;
    /* renamed from: m */
    private C2414k f15376m;
    /* renamed from: n */
    private String f15377n;
    /* renamed from: o */
    private ViewGroup f15378o;
    /* renamed from: p */
    private int f15379p;
    /* renamed from: q */
    private boolean f15380q;

    public akg(ViewGroup viewGroup) {
        this(viewGroup, null, false, ain.f15308a, 0);
    }

    public akg(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, ain.f15308a, i);
    }

    private akg(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, ain ain, int i) {
        this(viewGroup, attributeSet, z, ain, null, i);
    }

    private akg(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, ain ain, zzks zzks, int i) {
        this.f15364a = new arv();
        this.f15367d = new C2412j();
        this.f15368e = new akh(this);
        this.f15378o = viewGroup;
        this.f15365b = ain;
        this.f15374k = null;
        this.f15366c = new AtomicBoolean(false);
        this.f15379p = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzjq zzjq = new zzjq(context, attributeSet);
                this.f15371h = zzjq.m20336a(z);
                this.f15377n = zzjq.m20335a();
                if (viewGroup.isInEditMode()) {
                    hn a = aja.m19216a();
                    C2343d c2343d = this.f15371h[0];
                    int i2 = this.f15379p;
                    zzjn zzjn = new zzjn(context, c2343d);
                    zzjn.zzbep = m19269a(i2);
                    a.m19885a(viewGroup, zzjn, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                aja.m19216a().m19886a(viewGroup, new zzjn(context, C2343d.f7033a), e.getMessage(), e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private static zzjn m19268a(Context context, C2343d[] c2343dArr, int i) {
        zzjn zzjn = new zzjn(context, c2343dArr);
        zzjn.zzbep = m19269a(i);
        return zzjn;
    }

    /* renamed from: a */
    private static boolean m19269a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final void m19270a() {
        try {
            if (this.f15374k != null) {
                this.f15374k.destroy();
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to destroy AdView.", e);
        }
    }

    /* renamed from: a */
    public final void m19271a(C2338a c2338a) {
        this.f15370g = c2338a;
        this.f15368e.m27110a(c2338a);
    }

    /* renamed from: a */
    public final void m19272a(AppEventListener appEventListener) {
        try {
            this.f15372i = appEventListener;
            if (this.f15374k != null) {
                this.f15374k.zza(appEventListener != null ? new aip(appEventListener) : null);
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set the AppEventListener.", e);
        }
    }

    /* renamed from: a */
    public final void m19273a(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f15375l = onCustomRenderedAdLoadedListener;
        try {
            if (this.f15374k != null) {
                this.f15374k.zza(onCustomRenderedAdLoadedListener != null ? new ami(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    /* renamed from: a */
    public final void m19274a(C2362g c2362g) {
        this.f15373j = c2362g;
        try {
            if (this.f15374k != null) {
                this.f15374k.zza(this.f15373j == null ? null : this.f15373j.a());
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set correlator.", e);
        }
    }

    /* renamed from: a */
    public final void m19275a(C2414k c2414k) {
        this.f15376m = c2414k;
        try {
            if (this.f15374k != null) {
                this.f15374k.zza(c2414k == null ? null : new zzmr(c2414k));
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set video options.", e);
        }
    }

    /* renamed from: a */
    public final void m19276a(ake ake) {
        try {
            if (this.f15374k == null) {
                if ((this.f15371h == null || this.f15377n == null) && this.f15374k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Object a;
                Context context = this.f15378o.getContext();
                zzjn a2 = m19268a(context, this.f15371h, this.f15379p);
                if ("search_v2".equals(a2.zzbek)) {
                    a = aiq.m19203a(context, false, new ais(aja.m19217b(), context, a2, this.f15377n));
                } else {
                    a = aiq.m19203a(context, false, new air(aja.m19217b(), context, a2, this.f15377n, this.f15364a));
                }
                this.f15374k = (zzks) a;
                this.f15374k.zza(new aii(this.f15368e));
                if (this.f15369f != null) {
                    this.f15374k.zza(new aih(this.f15369f));
                }
                if (this.f15372i != null) {
                    this.f15374k.zza(new aip(this.f15372i));
                }
                if (this.f15375l != null) {
                    this.f15374k.zza(new ami(this.f15375l));
                }
                if (this.f15373j != null) {
                    this.f15374k.zza(this.f15373j.a());
                }
                if (this.f15376m != null) {
                    this.f15374k.zza(new zzmr(this.f15376m));
                }
                this.f15374k.setManualImpressionsEnabled(this.f15380q);
                try {
                    IObjectWrapper zzbr = this.f15374k.zzbr();
                    if (zzbr != null) {
                        this.f15378o.addView((View) C4296b.a(zzbr));
                    }
                } catch (Throwable e) {
                    hx.m19914c("Failed to get an ad frame.", e);
                }
            }
            if (this.f15374k.zzb(ain.m19196a(this.f15378o.getContext(), ake))) {
                this.f15364a.m31507a(ake.m19236j());
            }
        } catch (Throwable e2) {
            hx.m19914c("Failed to load ad.", e2);
        }
    }

    /* renamed from: a */
    public final void m19277a(zzje zzje) {
        try {
            this.f15369f = zzje;
            if (this.f15374k != null) {
                this.f15374k.zza(zzje != null ? new aih(zzje) : null);
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set the AdClickListener.", e);
        }
    }

    /* renamed from: a */
    public final void m19278a(String str) {
        if (this.f15377n != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f15377n = str;
    }

    /* renamed from: a */
    public final void m19279a(boolean z) {
        this.f15380q = z;
        try {
            if (this.f15374k != null) {
                this.f15374k.setManualImpressionsEnabled(this.f15380q);
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set manual impressions.", e);
        }
    }

    /* renamed from: a */
    public final void m19280a(C2343d... c2343dArr) {
        if (this.f15371h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m19282b(c2343dArr);
    }

    /* renamed from: b */
    public final C2338a m19281b() {
        return this.f15370g;
    }

    /* renamed from: b */
    public final void m19282b(C2343d... c2343dArr) {
        this.f15371h = c2343dArr;
        try {
            if (this.f15374k != null) {
                this.f15374k.zza(m19268a(this.f15378o.getContext(), this.f15371h, this.f15379p));
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set the ad size.", e);
        }
        this.f15378o.requestLayout();
    }

    /* renamed from: c */
    public final C2343d m19283c() {
        try {
            if (this.f15374k != null) {
                zzjn zzbs = this.f15374k.zzbs();
                if (zzbs != null) {
                    return zzbs.zzht();
                }
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to get the current AdSize.", e);
        }
        return this.f15371h != null ? this.f15371h[0] : null;
    }

    /* renamed from: d */
    public final C2343d[] m19284d() {
        return this.f15371h;
    }

    /* renamed from: e */
    public final String m19285e() {
        if (this.f15377n == null && this.f15374k != null) {
            try {
                this.f15377n = this.f15374k.getAdUnitId();
            } catch (Throwable e) {
                hx.m19914c("Failed to get ad unit id.", e);
            }
        }
        return this.f15377n;
    }

    /* renamed from: f */
    public final AppEventListener m19286f() {
        return this.f15372i;
    }

    /* renamed from: g */
    public final OnCustomRenderedAdLoadedListener m19287g() {
        return this.f15375l;
    }

    /* renamed from: h */
    public final void m19288h() {
        try {
            if (this.f15374k != null) {
                this.f15374k.pause();
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to call pause.", e);
        }
    }

    /* renamed from: i */
    public final void m19289i() {
        try {
            if (this.f15374k != null) {
                this.f15374k.resume();
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to call resume.", e);
        }
    }

    /* renamed from: j */
    public final String m19290j() {
        try {
            if (this.f15374k != null) {
                return this.f15374k.zzcp();
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    /* renamed from: k */
    public final C2412j m19291k() {
        return this.f15367d;
    }

    /* renamed from: l */
    public final zzll m19292l() {
        if (this.f15374k == null) {
            return null;
        }
        try {
            return this.f15374k.getVideoController();
        } catch (Throwable e) {
            hx.m19914c("Failed to retrieve VideoController.", e);
            return null;
        }
    }

    /* renamed from: m */
    public final C2414k m19293m() {
        return this.f15376m;
    }
}
