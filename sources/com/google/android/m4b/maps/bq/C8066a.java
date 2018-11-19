package com.google.android.m4b.maps.bq;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bd;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.bo.be;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bk;
import com.google.android.m4b.maps.bq.C7467b.C6533d;
import com.google.android.m4b.maps.bq.C7467b.C7466a;
import com.google.android.m4b.maps.bs.C4881d;
import com.google.android.m4b.maps.bs.C4904l;
import com.google.android.m4b.maps.bs.C6538c;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.de.ad;
import com.google.android.m4b.maps.p125y.C5571j;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.bq.a */
public abstract class C8066a extends C7467b {
    /* renamed from: e */
    private volatile boolean f28883e;
    /* renamed from: f */
    private final int f28884f;
    /* renamed from: g */
    private final List<Integer> f28885g;
    /* renamed from: h */
    private final int f28886h;
    /* renamed from: i */
    private final int f28887i;
    /* renamed from: j */
    private final float f28888j;

    /* renamed from: com.google.android.m4b.maps.bq.a$b */
    public enum C4861b {
        UNKNOWN(-1),
        NORMAL(1),
        PREFETCH_OFFLINE_MAP(4),
        PREFETCH_ROUTE(6),
        PREFETCH_AREA(12);
        
        /* renamed from: f */
        private final int f17864f;

        private C4861b(int i) {
            this.f17864f = i;
        }

        /* renamed from: a */
        public final int m21796a() {
            return this.f17864f;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bq.a$a */
    public abstract class C8065a extends C7466a {
        /* renamed from: a */
        protected int f28880a;
        /* renamed from: b */
        protected byte[][] f28881b = new byte[8][];
        /* renamed from: c */
        private /* synthetic */ C8066a f28882c;

        /* renamed from: g */
        public final int mo7034g() {
            return 108;
        }

        protected C8065a(C8066a c8066a, C5203e c5203e) {
            this.f28882c = c8066a;
            super(8, c5203e);
        }

        /* renamed from: h */
        protected int mo7075h() {
            return this.f28880a;
        }

        /* renamed from: a */
        public final void mo7032a(DataOutput dataOutput) {
            C4662a c4662a = new C4662a(ad.f19856b);
            C4662a c4662a2 = new C4662a(ad.f19857c);
            c4662a2.m20827b(1, c4662a);
            c4662a.m20841f(1, this.f28882c.f28884f);
            c4662a.m20841f(4, this.f28882c.f28887i);
            c4662a.m20841f(5, m34226k().m21796a());
            if (this.f28882c.f28888j > 1.0f) {
                c4662a.m20814a(6, r0.f28882c.f28888j);
            }
            for (Integer intValue : r0.f28882c.f28885g) {
                c4662a.m20820a(2, intValue.intValue());
            }
            if (r0.f28882c.f28883e) {
                c4662a.m20820a(3, 2);
            }
            if (ao.m22334a()) {
                c4662a.m20820a(3, 0);
            }
            if (r0.f28882c.c.m23223a().m23201a()) {
                c4662a.m20820a(3, 4);
            }
            if (m34226k() != C4861b.UNKNOWN) {
                c4662a.m20841f(5, m34226k().m21796a());
            }
            c4662a.m20820a(3, 6);
            if (r0.f28882c.b == bg.f17768x) {
                c4662a.m20820a(3, 7);
            }
            int i = m32294i();
            for (int i2 = 0; i2 < i; i2++) {
                C6533d a = m32287a(i2);
                ba baVar = a.f24237a;
                C4662a c4662a3 = new C4662a(ad.f19861g);
                c4662a3.m20815a(30, bk.m21696a(baVar.m21620c(), baVar.m21621d(), baVar.m21619b() + r0.f28882c.f28886h));
                c4662a3.m20841f(2, 0);
                c4662a3.m20841f(3, 0);
                c4662a3.m20841f(4, 0);
                c4662a3.m20841f(1, a.f24244h.f17771A);
                c4662a3.m20841f(7, a.f24244h.f17772B);
                baVar.m21617a(a.f24244h, c4662a3);
                if (r0.f28882c.c.m23223a().m23201a()) {
                    c4662a3.m20841f(8, a.f24245i);
                }
                String h = r0.f28882c.b.m21685h();
                if (h != null) {
                    c4662a3.m20828b(15, h);
                }
                c4662a2.m20821a(9, c4662a3);
            }
            C4665c.m20860a(dataOutput, c4662a2);
        }

        /* renamed from: k */
        private C4861b m34226k() {
            C4861b c4861b = C4861b.UNKNOWN;
            for (int i = 0; i < m32294i(); i++) {
                C4861b c4861b2 = m32287a(i).f24240d;
                if (c4861b == C4861b.UNKNOWN || c4861b2.m21796a() < c4861b.m21796a()) {
                    c4861b = c4861b2;
                }
            }
            return c4861b;
        }

        /* renamed from: a */
        protected byte[] mo7638a(int i, int i2) {
            return new byte[i];
        }

        /* renamed from: a */
        protected final boolean mo7548a(C6533d c6533d) {
            if (m32294i() == 0) {
                return true;
            }
            return m32287a(0).f24237a.m21619b() == c6533d.f24237a.m21619b() && m32287a(0).f24237a.m21627j() == c6533d.f24237a.m21627j();
        }

        /* renamed from: a */
        private void m34225a(InputStream inputStream) {
            C8065a c8065a = this;
            int i = m32294i();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                C4662a c4662a = new C4662a(null);
                int i4 = -1;
                if (C4665c.m20855a(ad.f19860f, inputStream, c4662a) == -1) {
                    break;
                }
                C4662a g = c4662a.m20842g(1);
                if (g.m20845j(8)) {
                    i4 = g.m20835d(8);
                }
                Object c = c4662a.m20834c(2);
                int length = c != null ? c.length : 0;
                Object a = mo7638a(length, i4);
                if (c != null) {
                    System.arraycopy(c, i2, a, a.length - length, length);
                }
                if (i3 < i) {
                    c4662a = g.m20845j(30) ? bk.m21697a(g.m20838e(30)) : g;
                    int d = c4662a.m20835d(2);
                    int d2 = c4662a.m20835d(3);
                    int d3 = c4662a.m20835d(4) - c8065a.f28882c.f28886h;
                    be beVar = new be();
                    C4839a[] values = C4839a.values();
                    int length2 = values.length;
                    while (i2 < length2) {
                        bd a2 = values[i2].mo5117a(g);
                        if (a2 != null) {
                            beVar.m21645a(a2);
                        }
                        i2++;
                    }
                    Pair a3 = C4733b.m21062a(bg.m21669a(g.m20835d(1)), new ba(d3, d, d2, beVar));
                    Integer a4 = m32288a(a3);
                    if (a4 == null) {
                        if (C4728u.m21050a(c8065a.f28882c.getName(), 6)) {
                            Log.e(c8065a.f28882c.getName(), "Received wrong tile");
                        }
                    } else if (length != 0) {
                        c8065a.f28881b[a4.intValue()] = a;
                    } else if (C4728u.m21050a(c8065a.f28882c.getName(), 3)) {
                        String name = c8065a.f28882c.getName();
                        String valueOf = String.valueOf(a3.first);
                        String str = (String) a3.second;
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(str).length());
                        stringBuilder.append("COMPACT-0 tile with key: ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(", ");
                        stringBuilder.append(str);
                        Log.d(name, stringBuilder.toString());
                    }
                }
                i3++;
                i2 = 0;
            }
            if (i3 != i && C4728u.m21050a(c8065a.f28882c.getName(), 3)) {
                str = c8065a.f28882c.getName();
                StringBuilder stringBuilder2 = new StringBuilder(48);
                stringBuilder2.append("Received ");
                stringBuilder2.append(i3);
                stringBuilder2.append(" tiles, expected ");
                stringBuilder2.append(i);
                Log.d(str, stringBuilder2.toString());
            }
        }

        /* renamed from: a */
        public final boolean mo7033a(DataInput dataInput) {
            InputStream a = C4665c.m20859a(dataInput);
            try {
                C4662a c4662a = new C4662a(null);
                C5571j.m24301b(C4665c.m20855a(ad.f19860f, a, c4662a) == 1);
                this.f28880a = c4662a.m20835d(1);
                int d = c4662a.m20835d(2);
                if (d != 0 && C4728u.m21050a(this.f28882c.getName(), 6)) {
                    String name = this.f28882c.getName();
                    StringBuilder stringBuilder = new StringBuilder(40);
                    stringBuilder.append("Received tile response code: ");
                    stringBuilder.append(d);
                    Log.e(name, stringBuilder.toString());
                }
                m34225a(a);
                return true;
            } finally {
                a.close();
            }
        }
    }

    protected C8066a(C4723n c4723n, String str, bg bgVar, int i, List<Integer> list, int i2, int i3, float f, boolean z, Locale locale, boolean z2, File file, C4881d c4881d, C5203e c5203e) {
        C5203e c5203e2;
        C6538c a;
        C7467b c7467b = this;
        bg bgVar2 = bgVar;
        List<Integer> list2 = list;
        C4904l b = bgVar.mo5127b();
        if (C4733b.m21066a()) {
            c5203e2 = c5203e;
            a = bgVar2.m21677a(str, z2, c4881d, c5203e2);
        } else {
            c5203e2 = c5203e;
            a = null;
        }
        super(c4723n, bgVar2, b, a, bgVar2 == bg.f17748d ? AdError.NETWORK_ERROR_CODE : 3000, z, i3, locale, file, c5203e2);
        int i4 = 0;
        c7467b.f28883e = false;
        int i5 = 256;
        c7467b.f28884f = 256;
        c7467b.f28885g = list2;
        c7467b.f28887i = i2;
        if (!(list2.contains(Integer.valueOf(7)) || list2.contains(Integer.valueOf(10)) || list2.contains(Integer.valueOf(11)) || list2.contains(Integer.valueOf(12)))) {
            if (!list2.contains(Integer.valueOf(9))) {
                while (i5 > ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                    i5 >>= 1;
                    i4++;
                }
                while (i5 < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                    i5 <<= 1;
                    i4--;
                }
                c7467b.f28886h = i4;
                c7467b.f28888j = f;
            }
        }
        c7467b.f28886h = 0;
        c7467b.f28888j = f;
    }
}
