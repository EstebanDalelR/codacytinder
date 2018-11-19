package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.de.C5343q;
import com.google.android.m4b.maps.de.ad;
import com.google.android.m4b.maps.model.MapsEngineLayerInfo;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.concurrent.TimeUnit;

final class ah extends C6409f {
    /* renamed from: a */
    private static final long f27836a = TimeUnit.HOURS.toMillis(1);
    /* renamed from: b */
    private final MapsEngineLayerInfo f27837b;
    /* renamed from: c */
    private final ay f27838c;
    /* renamed from: d */
    private int f27839d;
    /* renamed from: e */
    private C4662a f27840e;
    /* renamed from: f */
    private long f27841f;

    /* renamed from: g */
    public final int mo7034g() {
        return 148;
    }

    ah(MapsEngineLayerInfo mapsEngineLayerInfo, ay ayVar) {
        this.f27837b = mapsEngineLayerInfo;
        this.f27838c = ayVar;
    }

    /* renamed from: a */
    public final void mo7032a(DataOutput dataOutput) {
        C4662a c4662a = new C4662a(C5343q.f20071a);
        C4662a c4662a2;
        if (this.f27837b.getMapId() != null) {
            c4662a2 = new C4662a(C5343q.f20072b);
            c4662a2.m20828b(1, this.f27837b.getMapId());
            c4662a2.m20828b(2, this.f27837b.getLayerKey());
            c4662a2.m20828b(3, this.f27837b.getVersion());
            c4662a.m20827b(2, c4662a2);
        } else {
            c4662a2 = new C4662a(C5343q.f20073c);
            c4662a2.m20828b(1, this.f27837b.getLayerId());
            c4662a2.m20828b(2, this.f27837b.getVersion());
            c4662a.m20827b(4, c4662a2);
        }
        C4665c.m20860a(dataOutput, c4662a);
    }

    /* renamed from: a */
    public final boolean mo7033a(DataInput dataInput) {
        C4662a a = C4665c.m20858a(C5343q.f20074d, dataInput);
        this.f27839d = a.m20835d(1);
        if (this.f27839d == 1) {
            C4662a c4662a = new C4662a(ad.f19862h);
            C4662a g;
            if (a.m20845j(4)) {
                g = a.m20842g(4);
                String valueOf;
                if (g.m20845j(1)) {
                    valueOf = String.valueOf("ft:cw:");
                    long e = g.m20838e(1);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    stringBuilder.append(valueOf);
                    stringBuilder.append(e);
                    c4662a.m20828b(1, stringBuilder.toString());
                    m32791a(c4662a, "y", String.valueOf(g.m20838e(2)));
                    m32791a(c4662a, "tmplt", String.valueOf(g.m20838e(3)));
                    if (a.m20845j(2)) {
                        m32791a(c4662a, "cw_token", a.m20843h(2));
                    }
                } else {
                    valueOf = String.valueOf("vdb:");
                    String valueOf2 = String.valueOf(g.m20843h(5));
                    c4662a.m20828b(1, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                }
            } else if (a.m20845j(5)) {
                g = a.m20842g(5);
                c4662a.m20828b(1, g.m20843h(1));
                m32791a(c4662a, "v", String.valueOf(g.m20835d(2)));
                if (a.m20845j(2)) {
                    m32791a(c4662a, "authToken", a.m20843h(2));
                }
            }
            this.f27840e = c4662a;
            this.f27841f = C4665c.m20856a(a, 3, f27836a);
        } else {
            this.f27840e = null;
            this.f27841f = -1;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo4881d() {
        super.mo4881d();
        int i = this.f27839d;
        if (i == 1) {
            this.f27838c.m22906a(this.f27840e, this.f27841f);
        } else if (i != 3) {
            this.f27838c.m22910d();
        } else {
            this.f27838c.m22909c();
        }
    }

    /* renamed from: a */
    private static void m32791a(C4662a c4662a, String str, String str2) {
        C4662a c4662a2 = new C4662a(ad.f19863i);
        c4662a2.m20828b(1, str);
        c4662a2.m20828b(2, str2);
        c4662a.m20821a(2, c4662a2);
    }
}
