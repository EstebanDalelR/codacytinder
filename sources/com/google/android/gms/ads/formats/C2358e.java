package com.google.android.gms.ads.formats;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.zzpz;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.formats.e */
public final class C2358e {
    /* renamed from: a */
    public static WeakHashMap<View, C2358e> f7064a = new WeakHashMap();
    /* renamed from: b */
    private zzpz f7065b;
    /* renamed from: c */
    private WeakReference<View> f7066c;

    /* renamed from: a */
    public final void m8607a(C2356c c2356c) {
        Object obj = this.f7066c != null ? (View) this.f7066c.get() : null;
        if (obj == null) {
            hx.e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f7064a.containsKey(obj)) {
            f7064a.put(obj, this);
        }
        if (this.f7065b != null) {
            try {
                this.f7065b.zza((IObjectWrapper) c2356c.m8602a());
            } catch (Throwable e) {
                hx.b("Unable to call setNativeAd on delegate", e);
            }
        }
    }
}
