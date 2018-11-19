package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C4855t;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.aw;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.be;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bk;
import com.google.android.m4b.maps.bo.bo.C4842a;
import com.google.android.m4b.maps.bq.C7467b.C6533d;
import com.google.android.m4b.maps.bq.C7467b.C7466a;
import com.google.android.m4b.maps.br.C4875d;
import com.google.android.m4b.maps.bs.C6539g;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.de.C5340n;
import com.google.android.m4b.maps.de.ad;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.bq.e */
public final class C8068e extends C7467b {

    /* renamed from: com.google.android.m4b.maps.bq.e$b */
    public static class C6535b extends ba {
        /* renamed from: d */
        private final C4855t f24259d;

        private C6535b(ba baVar, C4855t c4855t) {
            super(baVar.m21619b(), baVar.m21620c(), baVar.m21621d(), baVar.m21627j());
            this.f24259d = c4855t;
        }

        /* renamed from: a */
        public final ba mo5149a(be beVar) {
            return new C6535b(super.mo5149a(beVar), this.f24259d);
        }

        /* renamed from: k */
        public final C4855t m28821k() {
            return this.f24259d;
        }

        public final int hashCode() {
            return (super.hashCode() * 37) + this.f24259d.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return ((obj instanceof C6535b) && super.equals(obj) && m28820a((C6535b) obj) != null) ? true : null;
        }

        /* renamed from: a */
        public final boolean m28820a(C6535b c6535b) {
            return this.f24259d == c6535b.f24259d ? true : null;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("[layer: ");
            stringBuilder.append(this.f24259d.m21783a());
            stringBuilder.append(" params: ");
            String[] b = this.f24259d.m21784b();
            for (int i = 0; i < b.length; i += 2) {
                stringBuilder.append(b[i]);
                stringBuilder.append('=');
                stringBuilder.append(b[i + 1]);
            }
            stringBuilder.append(" coords: ");
            stringBuilder.append(super.toString());
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bq.e$a */
    static class C8067a extends C7466a {
        /* renamed from: a */
        private C4662a[] f28889a = new C4662a[8];
        /* renamed from: b */
        private C4712d f28890b;
        /* renamed from: c */
        private final C5203e f28891c;

        /* renamed from: g */
        public final int mo7034g() {
            return 36;
        }

        C8067a(C5203e c5203e, C4712d c4712d) {
            super(8, c5203e);
            this.f28890b = c4712d;
            this.f28891c = c5203e;
        }

        /* renamed from: a */
        protected final boolean mo7548a(C6533d c6533d) {
            if (m32294i() != 0) {
                if (((C6535b) c6533d.f24237a).m28820a((C6535b) m32287a(0).f24237a) == null) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final az mo7549b(int i) {
            C4662a c4662a = this.f28889a[i];
            if (c4662a == null) {
                return 0;
            }
            aw awVar = new aw();
            ba baVar = (C6535b) m32287a(i).f24237a;
            int k = c4662a.m20846k(3);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < k; i2++) {
                C4848k a = C8068e.m34245a(c4662a.m20833c(3, i2), as.m21553a(), baVar);
                if (a != null) {
                    arrayList.add(a);
                    if (arrayList.size() == 20) {
                        break;
                    }
                }
            }
            C4848k[] c4848kArr = (C4848k[]) arrayList.toArray(new C4848k[arrayList.size()]);
            C4855t k2 = baVar.m28821k();
            long j = -1;
            if (k2.m21785c()) {
                j = C4712d.m20957c() + k2.m21786d();
            }
            return new C4842a(this.f28891c).m21717a(baVar).m21719a(c4848kArr).m21716a(j).m21721a();
        }

        /* renamed from: a */
        public final void mo7032a(DataOutput dataOutput) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m34239k().m20830b(byteArrayOutputStream);
            dataOutput.writeInt(byteArrayOutputStream.size());
            dataOutput.write(byteArrayOutputStream.toByteArray());
        }

        /* renamed from: a */
        public final boolean mo7033a(DataInput dataInput) {
            dataInput = C4665c.m20858a(C5340n.f20045b, dataInput);
            int k = dataInput.m20846k(2);
            if (k != m32294i()) {
                return true;
            }
            for (int i = 0; i < k; i++) {
                this.f28889a[i] = dataInput.m20833c(2, i);
            }
            return true;
        }

        /* renamed from: k */
        private C4662a m34239k() {
            C4662a c4662a = new C4662a(C5340n.f20044a);
            c4662a.m20841f(1, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            C4855t k = ((C6535b) m32287a(0).f24237a).m28821k();
            C4662a a = c4662a.m20813a(2);
            a.m20828b(21, k.m21783a());
            String[] b = k.m21784b();
            for (int i = 0; i < b.length; i += 2) {
                C4662a a2 = a.m20813a(22);
                a2.m20828b(1, b[i]);
                a2.m20828b(2, b[i + 1]);
                a.m20821a(22, a2);
            }
            c4662a.m20827b(2, a);
            for (int i2 = 0; i2 < m32294i(); i2++) {
                ba baVar = m32287a(i2).f24237a;
                C4662a c4662a2 = new C4662a(ad.f19861g);
                c4662a2.m20841f(1, 8);
                c4662a2.m20815a(30, bk.m21696a(baVar.m21620c(), baVar.m21621d(), baVar.m21619b()));
                c4662a2.m20841f(2, 0);
                c4662a2.m20841f(3, 0);
                c4662a2.m20841f(4, 0);
                c4662a.m20821a(3, c4662a2);
            }
            return c4662a;
        }
    }

    public C8068e(C4723n c4723n, int i, Locale locale, File file, C5203e c5203e) {
        super(c4723n, bg.f17752h, new C6539g(256), null, 0, true, i, locale, file, c5203e);
    }

    /* renamed from: a */
    public final void mo7079a(ba baVar, C4875d c4875d) {
        if (baVar instanceof C6535b) {
            super.mo7079a(baVar, c4875d);
            return;
        }
        throw new ClassCastException("DashServerLayerTileStore only supports LayerCoords");
    }

    /* renamed from: a */
    public final az mo7076a(ba baVar, boolean z) {
        if (baVar instanceof C6535b) {
            return super.mo7076a(baVar, z);
        }
        throw new ClassCastException("DashServerLayerTileStore only supports LayerCoords");
    }

    /* renamed from: e */
    public final bg mo7084e() {
        return bg.f17752h;
    }

    /* renamed from: d */
    protected final C7466a mo7550d() {
        return new C8067a(this.c, C4712d.m20955a());
    }

    /* renamed from: a */
    static com.google.android.m4b.maps.bo.C4848k m34245a(com.google.android.m4b.maps.ar.C4662a r31, com.google.android.m4b.maps.bo.as r32, com.google.android.m4b.maps.bo.ba r33) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r31;
        r1 = 1;
        r2 = r0.m20835d(r1);
        r3 = 0;
        if (r2 != 0) goto L_0x0134;
    L_0x000a:
        r2 = 3;
        r4 = r0.m20846k(r2);
        if (r4 == 0) goto L_0x0134;
    L_0x0011:
        r4 = 2;
        r5 = r0.m20846k(r4);
        if (r5 != 0) goto L_0x001a;
    L_0x0018:
        goto L_0x0134;
    L_0x001a:
        r5 = 0;
        r6 = r0.m20833c(r2, r5);
        r7 = 31;
        r8 = r6.m20845j(r7);
        if (r8 != 0) goto L_0x0028;
    L_0x0027:
        return r3;
    L_0x0028:
        r7 = r6.m20842g(r7);
        r7 = com.google.android.m4b.maps.bw.C4970c.m22238a(r7);
        r8 = r33.m21626i();
        r8 = r8.mo5090a(r7);
        if (r8 != 0) goto L_0x003b;
    L_0x003a:
        return r3;
    L_0x003b:
        r0 = r0.m20833c(r4, r5);
        r4 = r0.m20843h(r4);
        r2 = com.google.android.m4b.maps.bq.C8068e.m34246a(r0, r2);
        r8 = 4;
        r17 = com.google.android.m4b.maps.bq.C8068e.m34246a(r0, r8);
        r8 = 10;
        com.google.android.m4b.maps.bq.C8068e.m34246a(r0, r8);
        r9 = 7;
        r10 = r0.m20845j(r9);
        if (r10 == 0) goto L_0x0060;
    L_0x0058:
        r0 = r0.m20835d(r9);
        r0 = r0 / r8;
        r21 = r0;
        goto L_0x0062;
    L_0x0060:
        r21 = 0;
    L_0x0062:
        r0 = "";
        r8 = 34;
        r9 = r6.m20845j(r8);
        if (r9 == 0) goto L_0x0076;
    L_0x006c:
        r6 = r6.m20835d(r8);
        if (r6 < 0) goto L_0x0076;
    L_0x0072:
        r0 = java.lang.String.valueOf(r6);
    L_0x0076:
        r6 = new int[r5];
        r8 = com.google.android.m4b.maps.ax.C4699a.f17284a;
        r4 = com.google.android.m4b.maps.ax.C4699a.m20895a(r4);	 Catch:{ IllegalArgumentException -> 0x007f }
        goto L_0x0080;
    L_0x007f:
        r4 = r8;
    L_0x0080:
        r16 = new com.google.android.m4b.maps.bo.a;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r8 = r16;
        r9 = r7;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15);
        r1 = new com.google.android.m4b.maps.bo.C4834a[r1];
        r1[r5] = r16;
        if (r0 == 0) goto L_0x00bd;
    L_0x0094:
        r15 = new java.util.ArrayList;
        r15.<init>();
        r14 = new com.google.android.m4b.maps.bo.s$a;
        r9 = 1;
        r11 = 4;
        r12 = 0;
        r13 = 0;
        r16 = 0;
        r18 = 0;
        r19 = 0;
        r8 = r14;
        r10 = r0;
        r0 = r14;
        r14 = r16;
        r3 = r15;
        r15 = r18;
        r16 = r19;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16);
        r3.add(r0);
        r0 = new com.google.android.m4b.maps.bo.s;
        r8 = com.google.android.m4b.maps.bo.C4838b.f17701b;
        r0.<init>(r3, r8);
        goto L_0x00be;
    L_0x00bd:
        r0 = 0;
    L_0x00be:
        if (r2 == 0) goto L_0x00f5;
    L_0x00c0:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r15 = new com.google.android.m4b.maps.bo.s$a;
        r9 = 2;
        r10 = 0;
        r11 = 0;
        r13 = com.google.android.m4b.maps.bo.as.m21553a();
        r14 = 0;
        r16 = "styleid";
        r18 = 0;
        r8 = r15;
        r12 = r2;
        r5 = r15;
        r15 = r16;
        r16 = r18;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16);
        r3.add(r5);
        if (r0 != 0) goto L_0x00ea;
    L_0x00e2:
        r0 = new com.google.android.m4b.maps.bo.s;
        r5 = com.google.android.m4b.maps.bo.C4838b.f17701b;
        r0.<init>(r3, r5);
        goto L_0x00f5;
    L_0x00ea:
        r5 = new com.google.android.m4b.maps.bo.s;
        r8 = com.google.android.m4b.maps.bo.C4838b.f17701b;
        r5.<init>(r3, r8);
        r14 = r0;
        r29 = r5;
        goto L_0x00f8;
    L_0x00f5:
        r14 = r0;
        r29 = 0;
    L_0x00f8:
        if (r29 != 0) goto L_0x0108;
    L_0x00fa:
        r0 = new com.google.android.m4b.maps.bo.s;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r5 = com.google.android.m4b.maps.bo.C4838b.f17701b;
        r0.<init>(r3, r5);
        r15 = r0;
        goto L_0x010a;
    L_0x0108:
        r15 = r29;
    L_0x010a:
        r0 = new com.google.android.m4b.maps.bo.ag;
        r9 = -1;
        r3 = 0;
        r3 = new com.google.android.m4b.maps.bo.C4838b.C6492a[r3];
        r19 = 0;
        r20 = "styleid";
        r22 = 0;
        r23 = 20;
        r24 = 0;
        r25 = 0;
        if (r2 != 0) goto L_0x0120;
    L_0x011e:
        r2 = "";
    L_0x0120:
        r26 = r2;
        r27 = com.google.android.m4b.maps.bo.C4838b.C6492a.f24118c;
        r8 = r0;
        r10 = r33;
        r11 = r7;
        r12 = r4;
        r13 = r1;
        r16 = r3;
        r18 = r32;
        r28 = r6;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);
        return r0;
    L_0x0134:
        r0 = r3;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bq.e.a(com.google.android.m4b.maps.ar.a, com.google.android.m4b.maps.bo.as, com.google.android.m4b.maps.bo.ba):com.google.android.m4b.maps.bo.k");
    }

    /* renamed from: a */
    private static String m34246a(C4662a c4662a, int i) {
        return c4662a.m20845j(i) ? c4662a.m20843h(i) : "";
    }
}
