package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import com.facebook.ads.AdNetwork;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAd.Image;
import com.facebook.ads.NativeAd.Rating;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.y */
public abstract class C3276y implements AdAdapter {
    /* renamed from: A */
    public abstract List<NativeAd> mo3289A();

    /* renamed from: B */
    public abstract int mo3290B();

    /* renamed from: C */
    public abstract int mo3291C();

    /* renamed from: D */
    public abstract String mo3292D();

    /* renamed from: E */
    public abstract AdNetwork mo3293E();

    /* renamed from: H */
    public String mo3333H() {
        return mo3317p();
    }

    /* renamed from: a */
    public abstract void mo3295a();

    /* renamed from: a */
    public abstract void mo3296a(int i);

    /* renamed from: a */
    public abstract void mo3297a(Context context, C1369z c1369z, C1425f c1425f, Map<String, Object> map);

    /* renamed from: a */
    public abstract void mo3298a(View view, List<View> list);

    /* renamed from: a */
    public abstract void mo3299a(C1369z c1369z);

    /* renamed from: a */
    public abstract void mo3300a(Map<String, String> map);

    /* renamed from: b */
    public abstract void mo3301b(Map<String, String> map);

    /* renamed from: b */
    public abstract boolean mo3302b();

    /* renamed from: c */
    public abstract boolean mo3303c();

    /* renamed from: d */
    public abstract boolean mo3304d();

    /* renamed from: e */
    public abstract boolean mo3305e();

    /* renamed from: f */
    public abstract boolean mo3306f();

    /* renamed from: g */
    public abstract boolean mo3307g();

    public final AdPlacementType getPlacementType() {
        return AdPlacementType.NATIVE;
    }

    /* renamed from: h */
    public abstract int mo3308h();

    /* renamed from: i */
    public abstract int mo3309i();

    /* renamed from: j */
    public abstract int mo3310j();

    /* renamed from: k */
    public abstract Image mo3311k();

    /* renamed from: l */
    public abstract Image mo3312l();

    /* renamed from: m */
    public abstract NativeAdViewAttributes mo3313m();

    /* renamed from: n */
    public abstract String mo3314n();

    /* renamed from: o */
    public abstract String mo3315o();

    /* renamed from: p */
    public abstract String mo3317p();

    /* renamed from: q */
    public abstract String mo3318q();

    /* renamed from: r */
    public abstract String mo3319r();

    /* renamed from: s */
    public abstract Rating mo3320s();

    /* renamed from: t */
    public abstract Image mo3321t();

    /* renamed from: u */
    public abstract String mo3322u();

    /* renamed from: v */
    public abstract String mo3323v();

    /* renamed from: w */
    public abstract String mo3324w();

    /* renamed from: x */
    public abstract String mo3325x();

    /* renamed from: y */
    public abstract VideoAutoplayBehavior mo3326y();

    /* renamed from: z */
    public abstract String mo3327z();
}
