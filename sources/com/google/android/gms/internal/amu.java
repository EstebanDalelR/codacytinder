package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;

@zzzv
public final class amu extends amv {
    @Nullable
    /* renamed from: b */
    private zzvj f26723b;
    @Nullable
    /* renamed from: c */
    private zzvm f26724c;
    /* renamed from: d */
    private final zzot f26725d;
    @Nullable
    /* renamed from: e */
    private zzos f26726e;
    /* renamed from: f */
    private boolean f26727f;
    /* renamed from: g */
    private Object f26728g;

    private amu(Context context, zzot zzot, tb tbVar, zzou zzou) {
        super(context, zzot, null, tbVar, null, zzou, null, null);
        this.f26727f = false;
        this.f26728g = new Object();
        this.f26725d = zzot;
    }

    public amu(Context context, zzot zzot, tb tbVar, zzvj zzvj, zzou zzou) {
        this(context, zzot, tbVar, zzou);
        this.f26723b = zzvj;
    }

    public amu(Context context, zzot zzot, tb tbVar, zzvm zzvm, zzou zzou) {
        this(context, zzot, tbVar, zzou);
        this.f26724c = zzvm;
    }

    /* renamed from: a */
    public final void mo6848a(View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.f26728g) {
            this.f26727f = true;
            try {
                if (this.f26723b != null) {
                    this.f26723b.zzi(C4296b.a(view));
                } else if (this.f26724c != null) {
                    this.f26724c.zzi(C4296b.a(view));
                }
            } catch (Throwable e) {
                hx.m19914c("Failed to call prepareAd", e);
            }
            this.f26727f = false;
        }
    }

    /* renamed from: a */
    public final void m31453a(@Nullable zzos zzos) {
        synchronized (this.f26728g) {
            this.f26726e = zzos;
        }
    }

    /* renamed from: a */
    public final boolean m31454a() {
        boolean z;
        synchronized (this.f26728g) {
            z = this.f26727f;
        }
        return z;
    }

    /* renamed from: b */
    public final zzos m31455b() {
        zzos zzos;
        synchronized (this.f26728g) {
            zzos = this.f26726e;
        }
        return zzos;
    }

    @Nullable
    /* renamed from: c */
    public final zzanh mo6849c() {
        return null;
    }

    @Nullable
    public final View zza(OnClickListener onClickListener, boolean z) {
        synchronized (this.f26728g) {
            if (this.f26726e != null) {
                View zza = this.f26726e.zza(onClickListener, z);
                return zza;
            }
            IObjectWrapper zzmk;
            try {
                if (this.f26723b != null) {
                    zzmk = this.f26723b.zzmk();
                } else {
                    if (this.f26724c != null) {
                        zzmk = this.f26724c.zzmk();
                    }
                    zzmk = null;
                }
            } catch (Throwable e) {
                hx.m19914c("Failed to call getAdChoicesContent", e);
            }
            if (zzmk != null) {
                zza = (View) C4296b.a(zzmk);
                return zza;
            }
            return null;
        }
    }

    public final void zza(View view, Map<String, WeakReference<View>> map) {
        ad.b("recordImpression must be called on the main UI thread.");
        synchronized (this.f26728g) {
            this.f22995a = true;
            if (this.f26726e != null) {
                this.f26726e.zza(view, (Map) map);
                this.f26725d.recordImpression();
            } else {
                try {
                    zzot zzot;
                    if (this.f26723b != null && !this.f26723b.getOverrideImpressionRecording()) {
                        this.f26723b.recordImpression();
                        zzot = this.f26725d;
                    } else if (!(this.f26724c == null || this.f26724c.getOverrideImpressionRecording())) {
                        this.f26724c.recordImpression();
                        zzot = this.f26725d;
                    }
                    zzot.recordImpression();
                } catch (Throwable e) {
                    hx.m19914c("Failed to call recordImpression", e);
                }
            }
        }
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        ad.b("performClick must be called on the main UI thread.");
        synchronized (this.f26728g) {
            if (this.f26726e != null) {
                this.f26726e.zza(view, map, bundle, view2);
                this.f26725d.onAdClicked();
            } else {
                try {
                    if (!(this.f26723b == null || this.f26723b.getOverrideClickHandling())) {
                        this.f26723b.zzh(C4296b.a(view));
                        this.f26725d.onAdClicked();
                    }
                    if (!(this.f26724c == null || this.f26724c.getOverrideClickHandling())) {
                        this.f26724c.zzh(C4296b.a(view));
                        this.f26725d.onAdClicked();
                    }
                } catch (Throwable e) {
                    hx.m19914c("Failed to call performClick", e);
                }
            }
        }
    }

    public final void zzb(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f26728g) {
            try {
                if (this.f26723b != null) {
                    this.f26723b.zzj(C4296b.a(view));
                } else if (this.f26724c != null) {
                    this.f26724c.zzj(C4296b.a(view));
                }
            } catch (Throwable e) {
                hx.m19914c("Failed to call untrackView", e);
            }
        }
    }

    public final boolean zzkc() {
        synchronized (this.f26728g) {
            if (this.f26726e != null) {
                boolean zzkc = this.f26726e.zzkc();
                return zzkc;
            }
            zzkc = this.f26725d.zzcw();
            return zzkc;
        }
    }

    public final boolean zzkd() {
        synchronized (this.f26728g) {
            if (this.f26726e != null) {
                boolean zzkd = this.f26726e.zzkd();
                return zzkd;
            }
            zzkd = this.f26725d.zzcx();
            return zzkd;
        }
    }

    public final void zzkh() {
    }

    public final void zzki() {
    }
}
