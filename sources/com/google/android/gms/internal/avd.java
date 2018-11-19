package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.aa;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.gmsg.C2377h;
import java.lang.ref.WeakReference;

@zzzv
public final class avd {
    /* renamed from: a */
    private final Object f15772a = new Object();
    /* renamed from: b */
    private final Context f15773b;
    /* renamed from: c */
    private final tb f15774c;
    /* renamed from: d */
    private final dm f15775d;
    /* renamed from: e */
    private final amb f15776e;
    /* renamed from: f */
    private final aa f15777f;
    /* renamed from: g */
    private OnGlobalLayoutListener f15778g;
    /* renamed from: h */
    private OnScrollChangedListener f15779h;
    /* renamed from: i */
    private he f15780i;
    /* renamed from: j */
    private int f15781j = -1;
    /* renamed from: k */
    private int f15782k = -1;

    public avd(Context context, tb tbVar, dm dmVar, amb amb, aa aaVar) {
        this.f15773b = context;
        this.f15774c = tbVar;
        this.f15775d = dmVar;
        this.f15776e = amb;
        this.f15777f = aaVar;
        this.f15780i = new he(200);
    }

    /* renamed from: a */
    private final OnGlobalLayoutListener m19526a(WeakReference<zzanh> weakReference) {
        if (this.f15778g == null) {
            this.f15778g = new avj(this, weakReference);
        }
        return this.f15778g;
    }

    /* renamed from: a */
    private final void m19530a(zzanh zzanh) {
        ku zzsz = zzanh.zzsz();
        zzsz.m20005a("/video", C2377h.f7252l);
        zzsz.m20005a("/videoMeta", C2377h.f7253m);
        zzsz.m20005a("/precache", new ks());
        zzsz.m20005a("/delayPageLoaded", C2377h.f7256p);
        zzsz.m20005a("/instrument", C2377h.f7254n);
        zzsz.m20005a("/log", C2377h.f7247g);
        zzsz.m20005a("/videoClicked", C2377h.f7248h);
        zzsz.m20005a("/trackActiveViewUnit", new avh(this));
        zzsz.m20005a("/untrackActiveViewUnit", new avi(this));
    }

    /* renamed from: a */
    private final void m19531a(WeakReference<zzanh> weakReference, boolean z) {
        if (weakReference != null) {
            zzanh zzanh = (zzanh) weakReference.get();
            if (zzanh == null) {
                return;
            }
            if (zzanh == null) {
                throw null;
            }
            View view = (View) zzanh;
            if (view != null) {
                if (z && !this.f15780i.m19841a()) {
                    return;
                }
                if (zzanh == null) {
                    throw null;
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                aja.m19216a();
                int b = hn.m19871b(this.f15773b, iArr[0]);
                aja.m19216a();
                int b2 = hn.m19871b(this.f15773b, iArr[1]);
                synchronized (this.f15772a) {
                    if (!(this.f15781j == b && this.f15782k == b2)) {
                        this.f15781j = b;
                        this.f15782k = b2;
                        zzanh.zzsz().m19997a(this.f15781j, this.f15782k, z ^ true);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final OnScrollChangedListener m19533b(WeakReference<zzanh> weakReference) {
        if (this.f15779h == null) {
            this.f15779h = new avk(this, weakReference);
        }
        return this.f15779h;
    }

    /* renamed from: a */
    final zzanh m19534a() throws zzanv {
        return ar.f().m20026a(this.f15773b, mb.m20043a(), "native-video", false, false, this.f15774c, this.f15775d.f15995a.zzaty, this.f15776e, null, this.f15777f.a(), this.f15775d.f16003i);
    }
}
