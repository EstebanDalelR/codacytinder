package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.ads.C2416m;

@zzzv
public class zzjn extends zzbfm {
    public static final Creator<zzjn> CREATOR = new aio();
    public final int height;
    public final int heightPixels;
    public final int width;
    public final int widthPixels;
    public final String zzbek;
    public final boolean zzbel;
    public final zzjn[] zzbem;
    public final boolean zzben;
    public final boolean zzbeo;
    public boolean zzbep;

    public zzjn() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzjn(Context context, C2343d c2343d) {
        this(context, new C2343d[]{c2343d});
    }

    public zzjn(Context context, C2343d[] c2343dArr) {
        int a;
        int i;
        int i2;
        String c2343d;
        int i3;
        C2343d c2343d2 = c2343dArr[0];
        this.zzbel = false;
        this.zzbeo = c2343d2.c();
        if (this.zzbeo) {
            this.width = C2343d.f7033a.b();
            a = C2343d.f7033a.a();
        } else {
            this.width = c2343d2.b();
            a = c2343d2.a();
        }
        this.height = a;
        Object obj = this.width == -1 ? 1 : null;
        Object obj2 = this.height == -2 ? 1 : null;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (obj != null) {
            double d;
            aja.m19216a();
            if (hn.m19881g(context)) {
                aja.m19216a();
                if (hn.m19882h(context)) {
                    i = displayMetrics.widthPixels;
                    aja.m19216a();
                    i -= hn.m19883i(context);
                    this.widthPixels = i;
                    d = (double) (((float) this.widthPixels) / displayMetrics.density);
                    i2 = (int) d;
                    if (d - ((double) i2) >= 0.01d) {
                        i2++;
                    }
                }
            }
            i = displayMetrics.widthPixels;
            this.widthPixels = i;
            d = (double) (((float) this.widthPixels) / displayMetrics.density);
            i2 = (int) d;
            if (d - ((double) i2) >= 0.01d) {
                i2++;
            }
        } else {
            i2 = this.width;
            aja.m19216a();
            this.widthPixels = hn.m19862a(displayMetrics, this.width);
        }
        i = obj2 != null ? zzd(displayMetrics) : this.height;
        aja.m19216a();
        this.heightPixels = hn.m19862a(displayMetrics, i);
        if (obj == null) {
            if (obj2 == null) {
                c2343d = this.zzbeo ? "320x50_mb" : c2343d2.toString();
                this.zzbek = c2343d;
                if (c2343dArr.length <= 1) {
                    this.zzbem = new zzjn[c2343dArr.length];
                    for (i3 = 0; i3 < c2343dArr.length; i3++) {
                        this.zzbem[i3] = new zzjn(context, c2343dArr[i3]);
                    }
                } else {
                    this.zzbem = null;
                }
                this.zzben = false;
                this.zzbep = false;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(26);
        stringBuilder.append(i2);
        stringBuilder.append("x");
        stringBuilder.append(i);
        stringBuilder.append("_as");
        c2343d = stringBuilder.toString();
        this.zzbek = c2343d;
        if (c2343dArr.length <= 1) {
            this.zzbem = null;
        } else {
            this.zzbem = new zzjn[c2343dArr.length];
            for (i3 = 0; i3 < c2343dArr.length; i3++) {
                this.zzbem[i3] = new zzjn(context, c2343dArr[i3]);
            }
        }
        this.zzben = false;
        this.zzbep = false;
    }

    public zzjn(zzjn zzjn, zzjn[] zzjnArr) {
        this(zzjn.zzbek, zzjn.height, zzjn.heightPixels, zzjn.zzbel, zzjn.width, zzjn.widthPixels, zzjnArr, zzjn.zzben, zzjn.zzbeo, zzjn.zzbep);
    }

    zzjn(String str, int i, int i2, boolean z, int i3, int i4, zzjn[] zzjnArr, boolean z2, boolean z3, boolean z4) {
        this.zzbek = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzbel = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzbem = zzjnArr;
        this.zzben = z2;
        this.zzbeo = z3;
        this.zzbep = z4;
    }

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (((float) zzd(displayMetrics)) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public static zzjn zzf(Context context) {
        return new zzjn("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static zzjn zzhs() {
        return new zzjn("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20098a(parcel, 2, this.zzbek, false);
        oj.m20091a(parcel, 3, this.height);
        oj.m20091a(parcel, 4, this.heightPixels);
        oj.m20101a(parcel, 5, this.zzbel);
        oj.m20091a(parcel, 6, this.width);
        oj.m20091a(parcel, 7, this.widthPixels);
        oj.m20104a(parcel, 8, this.zzbem, i, false);
        oj.m20101a(parcel, 9, this.zzben);
        oj.m20101a(parcel, 10, this.zzbeo);
        oj.m20101a(parcel, 11, this.zzbep);
        oj.m20088a(parcel, a);
    }

    public final C2343d zzht() {
        return C2416m.a(this.width, this.height, this.zzbek);
    }
}
