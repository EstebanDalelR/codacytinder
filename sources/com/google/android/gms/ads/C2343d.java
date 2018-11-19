package com.google.android.gms.ads;

import android.content.Context;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.zzjn;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: com.google.android.gms.ads.d */
public final class C2343d {
    /* renamed from: a */
    public static final C2343d f7033a = new C2343d(320, 50, "320x50_mb");
    /* renamed from: b */
    public static final C2343d f7034b = new C2343d(468, 60, "468x60_as");
    /* renamed from: c */
    public static final C2343d f7035c = new C2343d(320, 100, "320x100_as");
    /* renamed from: d */
    public static final C2343d f7036d = new C2343d(728, 90, "728x90_as");
    /* renamed from: e */
    public static final C2343d f7037e = new C2343d(MapboxConstants.ANIMATION_DURATION, Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");
    /* renamed from: f */
    public static final C2343d f7038f = new C2343d(160, 600, "160x600_as");
    /* renamed from: g */
    public static final C2343d f7039g = new C2343d(-1, -2, "smart_banner");
    /* renamed from: h */
    public static final C2343d f7040h = new C2343d(-3, -4, "fluid");
    /* renamed from: i */
    public static final C2343d f7041i = new C2343d(50, 50, "50x50_mb");
    /* renamed from: j */
    public static final C2343d f7042j = new C2343d(-3, 0, "search_v2");
    /* renamed from: k */
    private final int f7043k;
    /* renamed from: l */
    private final int f7044l;
    /* renamed from: m */
    private final String f7045m;

    public C2343d(int i, int i2) {
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        String str = "_as";
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()) + String.valueOf(str).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("x");
        stringBuilder.append(valueOf2);
        stringBuilder.append(str);
        this(i, i2, stringBuilder.toString());
    }

    C2343d(int i, int i2, String str) {
        StringBuilder stringBuilder;
        if (i < 0 && i != -1 && i != -3) {
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("Invalid width for AdSize: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f7043k = i;
            this.f7044l = i2;
            this.f7045m = str;
        } else {
            stringBuilder = new StringBuilder(38);
            stringBuilder.append("Invalid height for AdSize: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final int m8562a() {
        return this.f7044l;
    }

    /* renamed from: a */
    public final int m8563a(Context context) {
        switch (this.f7044l) {
            case -4:
            case -3:
                return -1;
            case -2:
                return zzjn.zzc(context.getResources().getDisplayMetrics());
            default:
                aja.a();
                return hn.a(context, this.f7044l);
        }
    }

    /* renamed from: b */
    public final int m8564b() {
        return this.f7043k;
    }

    /* renamed from: b */
    public final int m8565b(Context context) {
        int i = this.f7043k;
        if (i == -1) {
            return zzjn.zzb(context.getResources().getDisplayMetrics());
        }
        switch (i) {
            case -4:
            case -3:
                return -1;
            default:
                aja.a();
                return hn.a(context, this.f7043k);
        }
    }

    /* renamed from: c */
    public final boolean m8566c() {
        return this.f7043k == -3 && this.f7044l == -4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2343d)) {
            return false;
        }
        C2343d c2343d = (C2343d) obj;
        return this.f7043k == c2343d.f7043k && this.f7044l == c2343d.f7044l && this.f7045m.equals(c2343d.f7045m);
    }

    public final int hashCode() {
        return this.f7045m.hashCode();
    }

    public final String toString() {
        return this.f7045m;
    }
}
