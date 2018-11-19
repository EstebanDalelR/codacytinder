package com.google.ads;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.android.gms.ads.C2343d;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.tinder.fragments.as;

@Deprecated
/* renamed from: com.google.ads.a */
public final class C2003a {
    /* renamed from: a */
    public static final C2003a f5431a = new C2003a(-1, -2, "mb");
    /* renamed from: b */
    public static final C2003a f5432b = new C2003a(320, 50, "mb");
    /* renamed from: c */
    public static final C2003a f5433c = new C2003a(MapboxConstants.ANIMATION_DURATION, Callback.DEFAULT_SWIPE_ANIMATION_DURATION, as.f42211a);
    /* renamed from: d */
    public static final C2003a f5434d = new C2003a(468, 60, as.f42211a);
    /* renamed from: e */
    public static final C2003a f5435e = new C2003a(728, 90, as.f42211a);
    /* renamed from: f */
    public static final C2003a f5436f = new C2003a(160, 600, as.f42211a);
    /* renamed from: g */
    private final C2343d f5437g;

    private C2003a(int i, int i2, String str) {
        this(new C2343d(i, i2));
    }

    public C2003a(C2343d c2343d) {
        this.f5437g = c2343d;
    }

    /* renamed from: a */
    public final int m7212a() {
        return this.f5437g.m8564b();
    }

    /* renamed from: b */
    public final int m7213b() {
        return this.f5437g.m8562a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2003a)) {
            return false;
        }
        return this.f5437g.equals(((C2003a) obj).f5437g);
    }

    public final int hashCode() {
        return this.f5437g.hashCode();
    }

    public final String toString() {
        return this.f5437g.toString();
    }
}
