package com.google.android.gms.ads.formats;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.zzpu;

/* renamed from: com.google.android.gms.ads.formats.d */
public class C2357d extends FrameLayout {
    /* renamed from: a */
    private final FrameLayout f7062a;
    /* renamed from: b */
    private final zzpu f7063b = m8604a();

    public C2357d(Context context) {
        super(context);
        this.f7062a = m8603a(context);
    }

    /* renamed from: a */
    private final FrameLayout m8603a(Context context) {
        View frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: a */
    private final zzpu m8604a() {
        ad.m9046a(this.f7062a, (Object) "createDelegate must be called after mOverlayFrame has been created");
        return isInEditMode() ? null : aja.b().a(this.f7062a.getContext(), this, this.f7062a);
    }

    /* renamed from: a */
    protected final View m8605a(String str) {
        try {
            IObjectWrapper zzal = this.f7063b.zzal(str);
            if (zzal != null) {
                return (View) C4296b.m17262a(zzal);
            }
        } catch (Throwable e) {
            hx.b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    /* renamed from: a */
    protected final void m8606a(String str, View view) {
        try {
            this.f7063b.zzb(str, C4296b.m17261a((Object) view));
        } catch (Throwable e) {
            hx.b("Unable to call setAssetView on delegate", e);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f7062a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f7062a != view) {
            super.bringChildToFront(this.f7062a);
        }
    }

    public C2352a getAdChoicesView() {
        View a = m8605a("1098");
        return a instanceof C2352a ? (C2352a) a : null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f7063b != null) {
            try {
                this.f7063b.zzb(C4296b.m17261a((Object) view), i);
            } catch (Throwable e) {
                hx.b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f7062a);
    }

    public void removeView(View view) {
        if (this.f7062a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(C2352a c2352a) {
        m8606a("1098", c2352a);
    }

    public void setNativeAd(C2356c c2356c) {
        try {
            this.f7063b.zza((IObjectWrapper) c2356c.m8602a());
        } catch (Throwable e) {
            hx.b("Unable to call setNativeAd on delegate", e);
        }
    }
}
