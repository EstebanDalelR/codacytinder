package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.concurrent.TimeUnit;

@zzzv
public final class kd {
    /* renamed from: a */
    private final Context f16248a;
    /* renamed from: b */
    private final String f16249b;
    /* renamed from: c */
    private final zzakd f16250c;
    @Nullable
    /* renamed from: d */
    private final alz f16251d;
    @Nullable
    /* renamed from: e */
    private final amb f16252e;
    /* renamed from: f */
    private final gn f16253f = new gq().m19828a("min_1", Double.MIN_VALUE, 1.0d).m19828a("1_5", 1.0d, 5.0d).m19828a("5_10", 5.0d, 10.0d).m19828a("10_20", 10.0d, 20.0d).m19828a("20_30", 20.0d, 30.0d).m19828a("30_max", 30.0d, Double.MAX_VALUE).m19827a();
    /* renamed from: g */
    private final long[] f16254g;
    /* renamed from: h */
    private final String[] f16255h;
    /* renamed from: i */
    private boolean f16256i;
    /* renamed from: j */
    private boolean f16257j;
    /* renamed from: k */
    private boolean f16258k;
    /* renamed from: l */
    private boolean f16259l;
    /* renamed from: m */
    private boolean f16260m;
    /* renamed from: n */
    private jp f16261n;
    /* renamed from: o */
    private boolean f16262o;
    /* renamed from: p */
    private boolean f16263p;
    /* renamed from: q */
    private long f16264q;

    public kd(Context context, zzakd zzakd, String str, @Nullable amb amb, @Nullable alz alz) {
        int i = 0;
        this.f16256i = false;
        this.f16257j = false;
        this.f16258k = false;
        this.f16259l = false;
        this.f16264q = -1;
        this.f16248a = context;
        this.f16250c = zzakd;
        this.f16249b = str;
        this.f16252e = amb;
        this.f16251d = alz;
        String str2 = (String) aja.m19221f().m19334a(alo.f15466q);
        if (str2 == null) {
            r1.f16255h = new String[0];
            r1.f16254g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        r1.f16255h = new String[split.length];
        r1.f16254g = new long[split.length];
        while (i < split.length) {
            try {
                r1.f16254g[i] = Long.parseLong(split[i]);
            } catch (Throwable e) {
                hx.m19914c("Unable to parse frame hash target time number.", e);
                r1.f16254g[i] = -1;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final void m19963a() {
        if (this.f16256i && !this.f16257j) {
            alu.m19353a(this.f16252e, this.f16251d, "vfr2");
            this.f16257j = true;
        }
    }

    /* renamed from: a */
    public final void m19964a(jp jpVar) {
        alu.m19353a(this.f16252e, this.f16251d, "vpc2");
        this.f16256i = true;
        if (this.f16252e != null) {
            this.f16252e.m19365a("vpn", jpVar.mo6875a());
        }
        this.f16261n = jpVar;
    }

    /* renamed from: b */
    public final void m19965b() {
        if (((Boolean) aja.m19221f().m19334a(alo.f15465p)).booleanValue() && !this.f16262o) {
            String valueOf;
            String valueOf2;
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f16249b);
            bundle.putString("player", this.f16261n.mo6875a());
            for (gp gpVar : this.f16253f.m19822a()) {
                valueOf = String.valueOf("fps_c_");
                valueOf2 = String.valueOf(gpVar.f16109a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(gpVar.f16111c));
                valueOf = String.valueOf("fps_p_");
                valueOf2 = String.valueOf(gpVar.f16109a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Double.toString(gpVar.f16110b));
            }
            for (int i = 0; i < this.f16254g.length; i++) {
                String str = this.f16255h[i];
                if (str != null) {
                    valueOf = "fh_";
                    valueOf2 = String.valueOf(Long.valueOf(this.f16254g[i]));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                    stringBuilder.append(valueOf);
                    stringBuilder.append(valueOf2);
                    bundle.putString(stringBuilder.toString(), str);
                }
            }
            ar.e().m19749a(this.f16248a, this.f16250c.zzcv, "gmob-apps", bundle, true);
            this.f16262o = true;
        }
    }

    /* renamed from: b */
    public final void m19966b(jp jpVar) {
        if (this.f16258k && !r0.f16259l) {
            alu.m19353a(r0.f16252e, r0.f16251d, "vff2");
            r0.f16259l = true;
        }
        long nanoTime = ar.k().nanoTime();
        if (r0.f16260m && r0.f16263p && r0.f16264q != -1) {
            r0.f16253f.m19823a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (nanoTime - r0.f16264q)));
        }
        r0.f16263p = r0.f16260m;
        r0.f16264q = nanoTime;
        nanoTime = ((Long) aja.m19221f().m19334a(alo.f15467r)).longValue();
        long currentPosition = (long) jpVar.getCurrentPosition();
        int i = 0;
        while (i < r0.f16255h.length) {
            if (r0.f16255h[i] != null || nanoTime <= Math.abs(currentPosition - r0.f16254g[i])) {
                jp jpVar2 = jpVar;
                i++;
            } else {
                String[] strArr = r0.f16255h;
                int i2 = 8;
                Bitmap bitmap = jpVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    j = j2;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        long j4 = j | (((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > ProfileEditingConfig.DEFAULT_MAX_LENGTH ? 1 : 0) << ((int) j3));
                        i4++;
                        j3--;
                        j = j4;
                        i2 = 8;
                    }
                    i3++;
                    j2 = j;
                    i2 = 8;
                    j = j3;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m19967c() {
        this.f16260m = true;
        if (this.f16257j && !this.f16258k) {
            alu.m19353a(this.f16252e, this.f16251d, "vfp2");
            this.f16258k = true;
        }
    }

    /* renamed from: d */
    public final void m19968d() {
        this.f16260m = false;
    }
}
