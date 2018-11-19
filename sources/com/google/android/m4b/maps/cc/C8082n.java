package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import com.google.android.m4b.maps.ab.C4590a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.bb.C4749e;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.C4834a;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C4854s;
import com.google.android.m4b.maps.bo.C4854s.C4853a;
import com.google.android.m4b.maps.bo.C7462l;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.ao;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.br;
import com.google.android.m4b.maps.bx.ai;
import com.google.android.m4b.maps.bx.ak;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C5056h;
import com.google.android.m4b.maps.ca.C7490k.C6574a;
import com.google.android.m4b.maps.cc.C6585i.C5076c;
import com.google.android.m4b.maps.ce.C5094b;
import com.google.android.m4b.maps.ce.C5095c;
import com.google.android.m4b.maps.ce.C6590a;

/* renamed from: com.google.android.m4b.maps.cc.n */
public class C8082n extends C7498h {
    /* renamed from: H */
    private static final C5087b[] f29006H = new C5087b[0];
    /* renamed from: I */
    private static final C5087b[] f29007I = new C5087b[]{new C5087b(C5086a.BELOW_CENTER, C5076c.CENTER), new C5087b(C5086a.ABOVE_CENTER, C5076c.CENTER), new C5087b(C5086a.LEFT_OF_CENTER, C5076c.RIGHT), new C5087b(C5086a.RIGHT_OF_CENTER, C5076c.LEFT)};
    /* renamed from: A */
    private boolean f29008A;
    /* renamed from: B */
    private float f29009B;
    /* renamed from: C */
    private final float f29010C;
    /* renamed from: D */
    private final float[] f29011D = new float[8];
    /* renamed from: E */
    private final boolean f29012E;
    /* renamed from: F */
    private final C4590a f29013F;
    /* renamed from: G */
    private boolean f29014G;
    /* renamed from: h */
    protected C4834a f29015h;
    /* renamed from: i */
    protected C6585i f29016i;
    /* renamed from: j */
    protected C6585i f29017j;
    /* renamed from: k */
    protected C5087b f29018k;
    /* renamed from: l */
    protected float f29019l;
    /* renamed from: m */
    protected float f29020m;
    /* renamed from: n */
    protected float f29021n;
    /* renamed from: o */
    protected float f29022o;
    /* renamed from: p */
    private C4834a f29023p;
    /* renamed from: q */
    private C7462l f29024q;
    /* renamed from: r */
    private C7462l f29025r;
    /* renamed from: s */
    private final String f29026s;
    /* renamed from: t */
    private final boolean f29027t;
    /* renamed from: u */
    private boolean f29028u;
    /* renamed from: v */
    private float f29029v = -1.0f;
    /* renamed from: w */
    private boolean f29030w;
    /* renamed from: x */
    private final C5087b[] f29031x;
    /* renamed from: y */
    private int f29032y;
    /* renamed from: z */
    private C4749e f29033z;

    /* renamed from: com.google.android.m4b.maps.cc.n$a */
    public enum C5086a {
        AT_CENTER,
        ABOVE_CENTER,
        RIGHT_OF_CENTER,
        BELOW_CENTER,
        LEFT_OF_CENTER,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_RIGHT,
        TOP_LEFT;

        /* renamed from: a */
        public static C5086a m22742a(int i) {
            switch (i) {
                case 5:
                    return AT_CENTER;
                case 6:
                    return LEFT_OF_CENTER;
                case 7:
                    return RIGHT_OF_CENTER;
                case 9:
                    return ABOVE_CENTER;
                case 10:
                    return TOP_LEFT;
                case 11:
                    return TOP_RIGHT;
                case 13:
                    return BELOW_CENTER;
                case 14:
                    return BOTTOM_LEFT;
                case 15:
                    return BOTTOM_RIGHT;
                default:
                    throw new IllegalArgumentException("Unknown position");
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.n$b */
    public static class C5087b {
        /* renamed from: a */
        public final C5086a f18851a;
        /* renamed from: b */
        public final C5076c f18852b;

        public C5087b(C5086a c5086a, C5076c c5076c) {
            this.f18851a = c5086a;
            this.f18852b = c5076c;
        }
    }

    /* renamed from: a */
    public static C8082n m34372a(ag agVar, C5094b c5094b, boolean z, C6570b c6570b, C6574a<Bitmap> c6574a, ak akVar, C5095c c5095c, C4590a c4590a) {
        C5095c c5095c2 = c5095c;
        C6585i a = C6585i.m29382a(agVar.m28557p(), agVar, c6570b, c6574a, akVar, c5095c2);
        if (a != null) {
            if (!a.m29391c()) {
                C6585i c6585i;
                C5087b[] c5087bArr;
                int i;
                C5087b[] c5087bArr2;
                boolean z2;
                C4834a c4834a;
                af b;
                StringBuilder stringBuilder;
                int i2;
                C4853a a2;
                String stringBuilder2;
                boolean z3;
                C8082n c8082n;
                if (agVar.m28558q() != null) {
                    C6585i a3 = C6585i.m29382a(agVar.m28558q(), agVar, c6570b, c6574a, akVar, c5095c2);
                    if (a3 == null) {
                        return null;
                    }
                    if (!a3.m29391c()) {
                        c6585i = a3;
                        if (agVar.m28559r().length == 0 || c6585i == null) {
                            c5087bArr = new C5087b[agVar.m28559r().length];
                            for (i = 0; i < c5087bArr.length; i++) {
                                c5087bArr[i] = new C5087b(C5086a.m22742a(agVar.m28559r()[i].m28600d()), C5076c.m22718a(agVar.m28559r()[i].m21601a()));
                            }
                        } else {
                            c5087bArr = f29007I;
                        }
                        c5087bArr2 = c5087bArr;
                        if (c6585i != null) {
                            if (c5087bArr2.length == 1) {
                                z2 = false;
                                c4834a = agVar.m28556o()[0];
                                b = c4834a.m21424b();
                                stringBuilder = new StringBuilder();
                                for (i2 = 0; i2 < agVar.m28557p().m21780b(); i2++) {
                                    a2 = agVar.m28557p().m21778a(i2);
                                    if (!a2.m21765b()) {
                                        stringBuilder.append(a2.m21770g());
                                    }
                                }
                                for (i2 = 0; i2 < agVar.m28558q().m21780b(); i2++) {
                                    a2 = agVar.m28558q().m21778a(i2);
                                    if (!a2.m21765b()) {
                                        stringBuilder.append(a2.m21770g());
                                    }
                                }
                                if (agVar.mo5107a() != null) {
                                    stringBuilder.append(agVar.mo5107a().mo4870a());
                                }
                                if (agVar.m28545d().length() <= 0) {
                                    stringBuilder.append(agVar.m28545d());
                                } else if (agVar.m28542b().m21619b() > 13) {
                                    stringBuilder.append(b.toString());
                                }
                                stringBuilder2 = stringBuilder.toString();
                                z3 = agVar.m28560s() && agVar.m28545d().length() > 0 && c5095c2.f18897p;
                                if (z3) {
                                    c8082n = new C8082n(agVar, c5094b, stringBuilder2, c4834a, null, agVar.m28552k(), agVar.m28555n(), z, z2, a, c6585i, c5087bArr2, c5095c2.f18898q, z3, c4590a);
                                } else {
                                    c8082n = new C8206g(agVar, c5094b, stringBuilder2, c4834a, null, agVar.m28552k(), agVar.m28555n(), z, z2, a, c6585i, c5087bArr2, c5095c2.f18898q);
                                }
                                return r0;
                            }
                        }
                        z2 = true;
                        c4834a = agVar.m28556o()[0];
                        b = c4834a.m21424b();
                        stringBuilder = new StringBuilder();
                        for (i2 = 0; i2 < agVar.m28557p().m21780b(); i2++) {
                            a2 = agVar.m28557p().m21778a(i2);
                            if (!a2.m21765b()) {
                                stringBuilder.append(a2.m21770g());
                            }
                        }
                        for (i2 = 0; i2 < agVar.m28558q().m21780b(); i2++) {
                            a2 = agVar.m28558q().m21778a(i2);
                            if (!a2.m21765b()) {
                                stringBuilder.append(a2.m21770g());
                            }
                        }
                        if (agVar.mo5107a() != null) {
                            stringBuilder.append(agVar.mo5107a().mo4870a());
                        }
                        if (agVar.m28545d().length() <= 0) {
                            stringBuilder.append(agVar.m28545d());
                        } else if (agVar.m28542b().m21619b() > 13) {
                            stringBuilder.append(b.toString());
                        }
                        stringBuilder2 = stringBuilder.toString();
                        if (!agVar.m28560s()) {
                        }
                        if (z3) {
                            c8082n = new C8082n(agVar, c5094b, stringBuilder2, c4834a, null, agVar.m28552k(), agVar.m28555n(), z, z2, a, c6585i, c5087bArr2, c5095c2.f18898q, z3, c4590a);
                        } else {
                            c8082n = new C8206g(agVar, c5094b, stringBuilder2, c4834a, null, agVar.m28552k(), agVar.m28555n(), z, z2, a, c6585i, c5087bArr2, c5095c2.f18898q);
                        }
                        return r0;
                    }
                }
                c6585i = null;
                if (agVar.m28559r().length == 0) {
                }
                c5087bArr = new C5087b[agVar.m28559r().length];
                for (i = 0; i < c5087bArr.length; i++) {
                    c5087bArr[i] = new C5087b(C5086a.m22742a(agVar.m28559r()[i].m28600d()), C5076c.m22718a(agVar.m28559r()[i].m21601a()));
                }
                c5087bArr2 = c5087bArr;
                if (c6585i != null) {
                    if (c5087bArr2.length == 1) {
                        z2 = false;
                        c4834a = agVar.m28556o()[0];
                        b = c4834a.m21424b();
                        stringBuilder = new StringBuilder();
                        for (i2 = 0; i2 < agVar.m28557p().m21780b(); i2++) {
                            a2 = agVar.m28557p().m21778a(i2);
                            if (!a2.m21765b()) {
                                stringBuilder.append(a2.m21770g());
                            }
                        }
                        for (i2 = 0; i2 < agVar.m28558q().m21780b(); i2++) {
                            a2 = agVar.m28558q().m21778a(i2);
                            if (!a2.m21765b()) {
                                stringBuilder.append(a2.m21770g());
                            }
                        }
                        if (agVar.mo5107a() != null) {
                            stringBuilder.append(agVar.mo5107a().mo4870a());
                        }
                        if (agVar.m28545d().length() <= 0) {
                            stringBuilder.append(agVar.m28545d());
                        } else if (agVar.m28542b().m21619b() > 13) {
                            stringBuilder.append(b.toString());
                        }
                        stringBuilder2 = stringBuilder.toString();
                        if (agVar.m28560s()) {
                        }
                        if (z3) {
                            c8082n = new C8206g(agVar, c5094b, stringBuilder2, c4834a, null, agVar.m28552k(), agVar.m28555n(), z, z2, a, c6585i, c5087bArr2, c5095c2.f18898q);
                        } else {
                            c8082n = new C8082n(agVar, c5094b, stringBuilder2, c4834a, null, agVar.m28552k(), agVar.m28555n(), z, z2, a, c6585i, c5087bArr2, c5095c2.f18898q, z3, c4590a);
                        }
                        return r0;
                    }
                }
                z2 = true;
                c4834a = agVar.m28556o()[0];
                b = c4834a.m21424b();
                stringBuilder = new StringBuilder();
                for (i2 = 0; i2 < agVar.m28557p().m21780b(); i2++) {
                    a2 = agVar.m28557p().m21778a(i2);
                    if (!a2.m21765b()) {
                        stringBuilder.append(a2.m21770g());
                    }
                }
                for (i2 = 0; i2 < agVar.m28558q().m21780b(); i2++) {
                    a2 = agVar.m28558q().m21778a(i2);
                    if (!a2.m21765b()) {
                        stringBuilder.append(a2.m21770g());
                    }
                }
                if (agVar.mo5107a() != null) {
                    stringBuilder.append(agVar.mo5107a().mo4870a());
                }
                if (agVar.m28545d().length() <= 0) {
                    stringBuilder.append(agVar.m28545d());
                } else if (agVar.m28542b().m21619b() > 13) {
                    stringBuilder.append(b.toString());
                }
                stringBuilder2 = stringBuilder.toString();
                if (agVar.m28560s()) {
                }
                if (z3) {
                    c8082n = new C8082n(agVar, c5094b, stringBuilder2, c4834a, null, agVar.m28552k(), agVar.m28555n(), z, z2, a, c6585i, c5087bArr2, c5095c2.f18898q, z3, c4590a);
                } else {
                    c8082n = new C8206g(agVar, c5094b, stringBuilder2, c4834a, null, agVar.m28552k(), agVar.m28555n(), z, z2, a, c6585i, c5087bArr2, c5095c2.f18898q);
                }
                return r0;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C8082n m34373a(ao aoVar, int i, C5094b c5094b, af afVar, af afVar2, boolean z, C5095c c5095c, C6570b c6570b, C6574a<Bitmap> c6574a) {
        C4854s a = aoVar.m28578a(i);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < a.m21780b(); i2++) {
            C4853a a2 = a.m21778a(i2);
            if (a2.m21764a()) {
                return null;
            }
            if (a2.m21765b()) {
                stringBuilder.append(a2.m21770g());
            }
        }
        if (stringBuilder.length() == 0) {
            return null;
        }
        C6585i a3 = C6585i.m29382a(a, aoVar, c6570b, c6574a, null, c5095c);
        if (a3 == null) {
            return null;
        }
        C4834a c4834a;
        String stringBuilder2 = stringBuilder.toString();
        C4834a c4834a2 = new C4834a(afVar, 0, 0.0f, null, 0.0f, 0.0f, 0.0f);
        if (afVar2 == null) {
            c4834a = null;
        } else {
            c4834a = new C4834a(afVar2, 0, 0.0f, null, 0.0f, 0.0f, 0.0f);
        }
        return new C8082n(aoVar, c5094b, stringBuilder2, c4834a2, c4834a, -1.0f, -1.0f, z, false, a3, null, f29006H, c5095c.f18898q, false, null);
    }

    C8082n(C4848k c4848k, C5094b c5094b, String str, C4834a c4834a, C4834a c4834a2, float f, float f2, boolean z, boolean z2, C6585i c6585i, C6585i c6585i2, C5087b[] c5087bArr, boolean z3, boolean z4, C4590a c4590a) {
        C6585i c6585i3 = c6585i;
        C6585i c6585i4 = c6585i2;
        super(c4848k, c5094b, c4848k.mo5108e(), f, f2, c4848k.mo5110i(), z, z3);
        this.f29026s = str;
        this.f29015h = c4834a;
        this.f29023p = c4834a2;
        this.f29016i = c6585i3;
        this.f29017j = c6585i4;
        this.f29027t = z2;
        r9.f29031x = this.f29017j == null ? f29006H : c5087bArr;
        r9.f29012E = z4;
        r9.f29013F = c4590a;
        r9.f29032y = 0;
        if (r9.f29017j != null) {
            r9.f29018k = r9.f29031x[r9.f29032y];
            r9.f29017j.m29387a(r9.f29018k.f18852b);
        }
        r9.f29030w = false;
        float f3 = 0.0f;
        if (c6585i3 != null) {
            f3 = 0.0f + (c6585i.m29385a() * c6585i.m29388b());
        }
        if (c6585i4 != null) {
            f3 += c6585i2.m29385a() * c6585i2.m29388b();
        }
        r9.f29010C = f3;
    }

    /* renamed from: m */
    public final float mo7568m() {
        return this.f29010C;
    }

    /* renamed from: s */
    public final String mo7571s() {
        return this.f29026s;
    }

    /* renamed from: a */
    public boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        if (m32657l() == null || this.f == null || this.f29029v <= null) {
            this.g = 65536;
            c5052d = (c6570b.m29255k() == null && c6570b.m29254j() == null) ? true : null;
            float l = c6570b.m29256l();
            if (this.f29024q != null && this.f29008A && c5052d != null && l == this.f29009B) {
                return true;
            }
            if (this.f29024q != null && this.f29015h.m21423a() && l == this.f29009B) {
                this.f29025r = this.f29024q;
                return true;
            }
            int b;
            this.f29008A = c5052d;
            this.f29009B = l;
            if (this.f29016i != null) {
                c5052d = ((int) this.f29016i.m29385a()) >> 1;
                b = ((int) this.f29016i.m29388b()) >> 1;
            } else {
                c5052d = null;
                b = 0;
            }
            if (this.f29017j != null) {
                int a = ((int) this.f29017j.m29385a()) >> 1;
                int b2 = ((int) this.f29017j.m29388b()) >> 1;
                int i = c5052d > a ? c5052d : a;
                int i2 = b > b2 ? b : b2;
                switch (this.f29018k.f18851a) {
                    case RIGHT_OF_CENTER:
                        this.f29019l = (float) (-c5052d);
                        this.f29020m = (float) ((a * 2) + c5052d);
                        this.f29021n = (float) (-i2);
                        this.f29022o = (float) i2;
                        break;
                    case LEFT_OF_CENTER:
                        this.f29019l = (float) ((-c5052d) - (a * 2));
                        this.f29020m = (float) c5052d;
                        this.f29021n = (float) (-i2);
                        this.f29022o = (float) i2;
                        break;
                    case BELOW_CENTER:
                        this.f29021n = (float) (-b);
                        this.f29022o = (float) (b + (b2 * 2));
                        break;
                    case ABOVE_CENTER:
                        this.f29021n = (float) ((-b) - (b2 * 2));
                        this.f29022o = (float) b;
                        break;
                    case BOTTOM_RIGHT:
                        this.f29019l = (float) (-c5052d);
                        this.f29020m = (float) ((a * 2) + c5052d);
                        this.f29021n = (float) (-b);
                        this.f29022o = (float) (b + (b2 * 2));
                        break;
                    case BOTTOM_LEFT:
                        this.f29019l = (float) ((-c5052d) - (a * 2));
                        this.f29020m = (float) c5052d;
                        this.f29021n = (float) (-b);
                        this.f29022o = (float) (b + (b2 * 2));
                        break;
                    case TOP_RIGHT:
                        this.f29019l = (float) (-c5052d);
                        this.f29020m = (float) ((a * 2) + c5052d);
                        this.f29021n = (float) ((-b) - (b2 * 2));
                        this.f29022o = (float) b;
                        break;
                    case TOP_LEFT:
                        this.f29019l = (float) ((-c5052d) - (a * 2));
                        this.f29020m = (float) c5052d;
                        this.f29021n = (float) ((-b) - (b2 * 2));
                        this.f29022o = (float) b;
                        break;
                    default:
                        this.f29019l = (float) (-i);
                        this.f29020m = (float) i;
                        this.f29021n = (float) (-i2);
                        this.f29022o = (float) i2;
                        break;
                }
                if (this.f29018k.f18851a == C5086a.BELOW_CENTER || this.f29018k.f18851a == C5086a.ABOVE_CENTER) {
                    switch (this.f29018k.f18852b) {
                        case LEFT:
                            this.f29019l = (float) ((-c5052d) - 10);
                            this.f29020m = Math.max(this.f29019l + ((float) (a * 2)), (float) c5052d);
                            break;
                        case RIGHT:
                            this.f29020m = (float) (c5052d + 10);
                            this.f29019l = Math.min(this.f29020m - ((float) (a * 2)), (float) (-c5052d));
                            break;
                        case CENTER:
                            this.f29019l = (float) (-i);
                            this.f29020m = (float) i;
                            break;
                        default:
                            break;
                    }
                }
            }
            this.f29019l = (float) (-c5052d);
            this.f29020m = (float) c5052d;
            this.f29021n = (float) (-b);
            this.f29022o = (float) b;
            af.m21468b(c6570b.m29258n(), this.f29015h.m21424b(), ((C5056h) ai.f24418b.get()).f18735a);
            this.f29029v = m34370a(c6570b);
            if (this.f29027t == null) {
                c5052d = c6570b.m29253i() / c6570b.m29232a(this.f29015h.m21424b(), true);
                this.f29019l *= c5052d;
                this.f29020m *= c5052d;
                this.f29021n *= c5052d;
                this.f29022o *= c5052d;
            }
            if (!(this.c == null || (this.c instanceof C6590a) == null)) {
                c5052d = ((C6590a) this.c).m29455a();
                if (c5052d != null && (c5052d instanceof C7436c)) {
                    c5052d = C6487i.m28476a().m28504d((C7436c) c5052d);
                    if (c5052d != null) {
                        this.f29015h.m21424b().m21476a((int) c5052d.m28449a(c6570b, this.f29015h.m21424b()));
                    }
                }
            }
            this.f29025r = this.f29024q;
            if (this.f29015h.m21423a() != null) {
                if (this.f29015h.m21423a() == null) {
                    c6570b = null;
                } else {
                    c5052d = this.f29015h.m21425c();
                    float f = c5052d < 1132920832 ? c5052d + 1119092736 : c5052d - 1132920832;
                    float f2 = f < 1132920832 ? 90.0f + f : f - 270.0f;
                    l = c6570b.m29232a(this.f29015h.m21424b(), true);
                    C5056h c5056h = (C5056h) ai.f24418b.get();
                    af afVar = c5056h.f18735a;
                    afVar.m21475a(f, c6570b.m29231a(this.f29019l, l));
                    af afVar2 = c5056h.f18736b;
                    afVar2.m21475a(f, c6570b.m29231a(this.f29020m, l));
                    af afVar3 = c5056h.f18737c;
                    afVar3.m21475a(f2, c6570b.m29231a(this.f29021n, l));
                    af afVar4 = c5056h.f18738d;
                    afVar4.m21475a(f2, c6570b.m29231a(this.f29022o, l));
                    af afVar5 = c5056h.f18739e;
                    af.m21463a(this.f29015h.m21424b(), afVar3, afVar5);
                    afVar3 = c5056h.f18740f;
                    af.m21463a(this.f29015h.m21424b(), afVar4, afVar3);
                    c6570b = C7462l.m32256a(afVar3.m21489e(afVar), afVar3.m21489e(afVar2), afVar5.m21489e(afVar), afVar5.m21489e(afVar2));
                }
                this.f29024q = c6570b;
            } else {
                c6570b.m29238a(this.f29015h.m21424b(), this.f29011D);
                c5052d = this.f29011D[0];
                l = this.f29011D[1];
                this.f29024q = c6570b.m29235a(this.f29019l + c5052d, c5052d + this.f29020m, this.f29021n + l, l + this.f29022o);
            }
            return this.f29024q != null;
        } else {
            c6570b = m34370a(c6570b) / this.f29029v;
            this.g = C7498h.m32644a((float) c6570b);
            return c6570b >= 1048576000 && c6570b <= 1073741824;
        }
    }

    /* renamed from: n */
    public final am mo7569n() {
        return this.f29024q;
    }

    /* renamed from: a */
    private float m34370a(C6570b c6570b) {
        if (this.f29027t) {
            return c6570b.m29231a(1.0f, c6570b.m29232a(this.f29015h.m21424b(), true));
        }
        return c6570b.m29231a(1.0f, c6570b.m29253i());
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        super.mo5223b(c5052d);
        if (this.f29016i != null) {
            this.f29016i.mo5223b(c5052d);
        }
        if (this.f29017j != null) {
            this.f29017j.mo5223b(c5052d);
        }
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        super.mo5224c(c5052d);
        if (this.f29016i != null) {
            this.f29016i.mo5224c(c5052d);
        }
        if (this.f29017j != null) {
            this.f29017j.mo5224c(c5052d);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo5222a(com.google.android.m4b.maps.ca.C5052d r12, com.google.android.m4b.maps.bz.C6570b r13, com.google.android.m4b.maps.bx.C5009j r14) {
        /*
        r11 = this;
        r0 = r11.f29030w;
        r1 = 1;
        if (r0 != 0) goto L_0x002e;
    L_0x0005:
        r0 = r14.m22385a();
        r2 = r11.e;
        if (r2 == 0) goto L_0x0018;
    L_0x000d:
        r2 = new com.google.android.m4b.maps.bb.e;
        r3 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r5 = com.google.android.m4b.maps.bb.C4749e.C4748a.FADE_IN;
        r2.<init>(r3, r5);
        r11.f29033z = r2;
    L_0x0018:
        r2 = com.google.android.m4b.maps.bx.C5008i.AMBIENT;
        if (r0 != r2) goto L_0x002c;
    L_0x001c:
        r0 = r11.a;
        r0 = r0 instanceof com.google.android.m4b.maps.bo.ag;
        if (r0 == 0) goto L_0x002c;
    L_0x0022:
        r0 = r11.a;
        r0 = (com.google.android.m4b.maps.bo.ag) r0;
        r0 = r0.m28561t();
        r11.f29014G = r0;
    L_0x002c:
        r11.f29030w = r1;
    L_0x002e:
        r0 = r11.f29014G;
        if (r0 == 0) goto L_0x0033;
    L_0x0032:
        return;
    L_0x0033:
        r0 = r12.m22635x();
        r0.glPushMatrix();
        r2 = r12.m22635x();
        r3 = r11.f29015h;
        r3 = r3.m21424b();
        r4 = r13.m29248d();
        r5 = 0;
        if (r4 != 0) goto L_0x008c;
    L_0x004b:
        r4 = r11.f29015h;
        r4 = r4.m21423a();
        if (r4 == 0) goto L_0x0062;
    L_0x0053:
        r4 = r11.f29015h;
        r4 = r4.m21425c();
        r6 = r13.m29254j();
        r4 = r4 - r6;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 != 0) goto L_0x008c;
    L_0x0062:
        r4 = r13.m29255k();
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 != 0) goto L_0x008c;
    L_0x006a:
        r3 = r11.f29015h;
        r3 = r3.m21424b();
        r4 = r11.f29011D;
        r13.m29238a(r3, r4);
        r3 = r11.f29011D;
        r4 = 0;
        r3 = r3[r4];
        r3 = java.lang.Math.round(r3);
        r3 = (float) r3;
        r4 = r11.f29011D;
        r1 = r4[r1];
        r1 = java.lang.Math.round(r1);
        r1 = (float) r1;
        r3 = r13.m29247d(r3, r1);
    L_0x008c:
        r1 = r11.f29029v;
        com.google.android.m4b.maps.bx.an.m22324a(r12, r13, r3, r1);
        r1 = r11.f29033z;
        if (r1 == 0) goto L_0x00a3;
    L_0x0095:
        r1 = r11.f29033z;
        r1 = r1.m21087a(r12);
        r3 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r1 != r3) goto L_0x00a5;
    L_0x009f:
        r3 = 0;
        r11.f29033z = r3;
        goto L_0x00a5;
    L_0x00a3:
        r1 = r11.g;
    L_0x00a5:
        r3 = r12.m22635x();
        r3.glColor4x(r1, r1, r1, r1);
        r1 = r11.f29015h;
        r1 = r1.m21423a();
        if (r1 == 0) goto L_0x00f1;
    L_0x00b4:
        r1 = r11.f29015h;
        r1 = r1.m21425c();
        r3 = r13.m29254j();
        r1 = r1 - r3;
        r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        r4 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        if (r3 >= 0) goto L_0x00c6;
    L_0x00c5:
        r1 = r1 + r4;
    L_0x00c6:
        r3 = r11.f29015h;
        r3 = r3.m21425c();
        r6 = r11.f29028u;
        if (r6 != 0) goto L_0x00df;
    L_0x00d0:
        r6 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x00df;
    L_0x00d6:
        r6 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r1 >= 0) goto L_0x00df;
    L_0x00dc:
        r1 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r3 = r3 + r1;
    L_0x00df:
        r1 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r1 < 0) goto L_0x00e4;
    L_0x00e3:
        r3 = r3 - r4;
    L_0x00e4:
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2.glRotatef(r3, r5, r5, r1);
        r1 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.glRotatef(r1, r3, r5, r5);
        goto L_0x00f4;
    L_0x00f1:
        com.google.android.m4b.maps.bx.an.m22327a(r2, r13);
    L_0x00f4:
        r1 = r11.f29016i;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 == 0) goto L_0x011f;
    L_0x00fa:
        r1 = r11.f29016i;
        r1 = r1.m29385a();
        r4 = r11.f29016i;
        r4 = r4.m29388b();
        r6 = r11.f29016i;
        r6 = r6.m29385a();
        r6 = r6 / r3;
        r7 = r11.f29016i;
        r7 = r7.m29388b();
        r7 = r7 / r3;
        r8 = -r6;
        r9 = -r7;
        r2.glTranslatef(r8, r5, r9);
        r8 = r11.f29016i;
        r8.mo5222a(r12, r13, r14);
        goto L_0x0123;
    L_0x011f:
        r1 = 0;
        r4 = 0;
        r6 = 0;
        r7 = 0;
    L_0x0123:
        r8 = r11.f29017j;
        if (r8 == 0) goto L_0x01d2;
    L_0x0127:
        r8 = com.google.android.m4b.maps.cc.C8082n.C50851.f18839a;
        r9 = r11.f29018k;
        r9 = r9.f18851a;
        r9 = r9.ordinal();
        r8 = r8[r9];
        switch(r8) {
            case 1: goto L_0x0181;
            case 2: goto L_0x0175;
            case 3: goto L_0x0165;
            case 4: goto L_0x015b;
            case 5: goto L_0x0162;
            case 6: goto L_0x0153;
            case 7: goto L_0x0144;
            case 8: goto L_0x017e;
            case 9: goto L_0x0139;
            default: goto L_0x0136;
        };
    L_0x0136:
        r4 = 0;
        r7 = 0;
        goto L_0x0192;
    L_0x0139:
        r7 = r11.f29017j;
        r7 = r7.m29385a();
        r7 = -r7;
        r10 = r7;
        r7 = r4;
        r4 = r10;
        goto L_0x0192;
    L_0x0144:
        r4 = r11.f29017j;
        r4 = r4.m29385a();
        r4 = -r4;
        r7 = r11.f29017j;
        r7 = r7.m29388b();
        r7 = -r7;
        goto L_0x0192;
    L_0x0153:
        r4 = r11.f29017j;
        r4 = r4.m29388b();
        r4 = -r4;
        goto L_0x017e;
    L_0x015b:
        r4 = r11.f29017j;
        r4 = r4.m29388b();
        r4 = -r4;
    L_0x0162:
        r7 = r4;
        r4 = 0;
        goto L_0x0192;
    L_0x0165:
        r4 = r11.f29017j;
        r4 = r4.m29385a();
        r4 = -r4;
        r8 = r11.f29017j;
        r8 = r8.m29388b();
        r8 = r8 / r3;
        r7 = r7 - r8;
        goto L_0x0192;
    L_0x0175:
        r4 = r11.f29017j;
        r4 = r4.m29388b();
        r4 = r4 / r3;
        r4 = r7 - r4;
    L_0x017e:
        r7 = r4;
        r4 = r1;
        goto L_0x0192;
    L_0x0181:
        r4 = r11.f29017j;
        r4 = r4.m29385a();
        r4 = r4 / r3;
        r4 = r6 - r4;
        r8 = r11.f29017j;
        r8 = r8.m29388b();
        r8 = r8 / r3;
        r7 = r7 - r8;
    L_0x0192:
        r8 = r11.f29018k;
        r8 = r8.f18851a;
        r9 = com.google.android.m4b.maps.cc.C8082n.C5086a.BELOW_CENTER;
        if (r8 == r9) goto L_0x01a2;
    L_0x019a:
        r8 = r11.f29018k;
        r8 = r8.f18851a;
        r9 = com.google.android.m4b.maps.cc.C8082n.C5086a.ABOVE_CENTER;
        if (r8 != r9) goto L_0x01ca;
    L_0x01a2:
        r8 = com.google.android.m4b.maps.cc.C8082n.C50851.f18840b;
        r9 = r11.f29018k;
        r9 = r9.f18852b;
        r9 = r9.ordinal();
        r8 = r8[r9];
        switch(r8) {
            case 1: goto L_0x01c8;
            case 2: goto L_0x01bc;
            case 3: goto L_0x01b2;
            default: goto L_0x01b1;
        };
    L_0x01b1:
        goto L_0x01ca;
    L_0x01b2:
        r1 = r11.f29017j;
        r1 = r1.m29385a();
        r1 = r1 / r3;
        r4 = r6 - r1;
        goto L_0x01ca;
    L_0x01bc:
        r3 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;
        r1 = r1 + r3;
        r3 = r11.f29017j;
        r3 = r3.m29385a();
        r4 = r1 - r3;
        goto L_0x01ca;
    L_0x01c8:
        r4 = -1054867456; // 0xffffffffc1200000 float:-10.0 double:NaN;
    L_0x01ca:
        r2.glTranslatef(r4, r5, r7);
        r1 = r11.f29017j;
        r1.mo5222a(r12, r13, r14);
    L_0x01d2:
        r0.glPopMatrix();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cc.n.a(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.bx.j):void");
    }

    /* renamed from: a */
    static int m34371a(as asVar, C5095c c5095c, float f) {
        return (int) C7498h.m32643a(asVar, c5095c.f18886e, c5095c.f18887f, c5095c.f18888g, f);
    }

    /* renamed from: a */
    public final boolean mo7566a(br brVar) {
        return brVar.mo5131a(this.f29015h.m21424b());
    }

    /* renamed from: b */
    public final boolean mo7567b(C6570b c6570b, C5052d c5052d) {
        if (this.f29032y + 1 < this.f29031x.length) {
            C5087b[] c5087bArr = this.f29031x;
            int i = this.f29032y + 1;
            this.f29032y = i;
            this.f29018k = c5087bArr[i];
            this.f29017j.m29387a(this.f29018k.f18852b);
            this.f29024q = null;
            mo7044a(c6570b, c5052d);
            return true;
        } else if (this.f29023p == null) {
            return false;
        } else {
            this.f29015h = this.f29023p;
            this.f29023p = null;
            if (this.f29031x.length > 1) {
                this.f29032y = 0;
                this.f29018k = this.f29031x[0];
                this.f29017j.m29387a(this.f29018k.f18852b);
            }
            this.f29024q = null;
            mo7044a(c6570b, c5052d);
            return true;
        }
    }

    /* renamed from: v */
    public final boolean m34383v() {
        if (this.f29015h == null) {
            return false;
        }
        return this.f29015h.m21423a();
    }
}
