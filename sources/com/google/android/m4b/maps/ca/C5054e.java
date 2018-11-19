package com.google.android.m4b.maps.ca;

import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.bm;
import com.google.android.m4b.maps.cb.C5063d;
import com.google.android.m4b.maps.cb.C5065h;
import com.google.android.m4b.maps.cb.C5067l;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.ca.e */
public final class C5054e {
    /* renamed from: a */
    private static final float f18709a = ((float) Math.sqrt(2.0d));
    /* renamed from: t */
    private static final ThreadLocal<C5054e> f18710t = new C50531();
    /* renamed from: u */
    private static final int[] f18711u = new int[]{0, 65536, 65536, 65536, 0, 32768, 65536, 32768};
    /* renamed from: v */
    private static final int[] f18712v = new int[]{0, 32768, 65536, 32768, 0, 65536, 65536, 65536};
    /* renamed from: w */
    private static final int[] f18713w = new int[]{0, 16384, 65536, 16384};
    /* renamed from: x */
    private static final int[] f18714x = new int[]{0, 16384, 65536, 16384, 32768, 16384, 0, 16384, 65536, 16384};
    /* renamed from: y */
    private static final int[][] f18715y = new int[16][];
    /* renamed from: b */
    private final af f18716b;
    /* renamed from: c */
    private final af f18717c;
    /* renamed from: d */
    private final af f18718d;
    /* renamed from: e */
    private final af f18719e;
    /* renamed from: f */
    private final af f18720f;
    /* renamed from: g */
    private final af f18721g;
    /* renamed from: h */
    private final af f18722h;
    /* renamed from: i */
    private final af f18723i;
    /* renamed from: j */
    private final af f18724j;
    /* renamed from: k */
    private final af f18725k;
    /* renamed from: l */
    private final bm f18726l;
    /* renamed from: m */
    private final bm f18727m;
    /* renamed from: n */
    private final bm f18728n;
    /* renamed from: o */
    private final bm f18729o;
    /* renamed from: p */
    private final bm f18730p;
    /* renamed from: q */
    private final bm f18731q;
    /* renamed from: r */
    private final bm f18732r;
    /* renamed from: s */
    private final bm f18733s;

    /* renamed from: com.google.android.m4b.maps.ca.e$1 */
    class C50531 extends ThreadLocal<C5054e> {
        C50531() {
        }

        protected final /* synthetic */ Object initialValue() {
            return new C5054e();
        }
    }

    private C5054e() {
        this.f18716b = new af();
        this.f18717c = new af();
        this.f18718d = new af();
        this.f18719e = new af();
        this.f18720f = new af();
        this.f18721g = new af();
        this.f18722h = new af();
        this.f18723i = new af();
        this.f18724j = new af();
        this.f18725k = new af();
        this.f18726l = new bm();
        this.f18727m = new bm();
        this.f18728n = new bm();
        this.f18729o = new bm();
        this.f18730p = new bm();
        this.f18731q = new bm();
        this.f18732r = new bm();
        this.f18733s = new bm();
    }

    /* renamed from: a */
    public static C5054e m22640a() {
        return (C5054e) f18710t.get();
    }

    /* renamed from: a */
    public final int m22644a(aj ajVar, float f, af afVar, int i, C5067l c5067l, C5065h c5065h, C5063d c5063d, boolean z, boolean z2, byte b) {
        C5054e c5054e = this;
        aj ajVar2 = ajVar;
        float f2 = f;
        af afVar2 = afVar;
        int i2 = i;
        C5067l c5067l2 = c5067l;
        C5065h c5065h2 = c5065h;
        C5063d c5063d2 = c5063d;
        if (f2 < 1.0f) {
            return 0;
        }
        int b2 = ajVar.m21528b();
        af afVar3;
        af afVar4;
        af afVar5;
        af afVar6;
        af afVar7;
        af afVar8;
        int i3;
        int i4;
        if (b2 == 2) {
            int a = c5067l.mo5250a();
            af afVar9 = c5054e.f18716b;
            afVar3 = c5054e.f18717c;
            afVar4 = c5054e.f18718d;
            afVar5 = c5054e.f18719e;
            afVar6 = c5054e.f18720f;
            afVar7 = c5054e.f18721g;
            int i5 = a;
            afVar8 = c5054e.f18722h;
            ajVar2.m21525a(0, afVar2, afVar9);
            ajVar2.m21525a(1, afVar2, afVar3);
            ah.m21509d(afVar3, afVar9, afVar4);
            ah.m21501a(afVar4, f2, afVar5);
            ah.m21502a(afVar5, afVar6);
            if (z) {
                ah.m21508c(afVar9, afVar6, afVar9);
            }
            if (z2) {
                ah.m21509d(afVar3, afVar6, afVar3);
            }
            ah.m21508c(afVar9, afVar5, afVar8);
            c5067l2.mo5258a(afVar8, i2, (byte) 0);
            ah.m21509d(afVar9, afVar5, afVar8);
            c5067l2.mo5258a(afVar8, i2, (byte) 0);
            ah.m21510e(afVar9, afVar3, afVar7);
            ah.m21508c(afVar7, afVar5, afVar8);
            c5067l2.mo5258a(afVar8, i2, (byte) 0);
            ah.m21509d(afVar7, afVar5, afVar8);
            c5067l2.mo5258a(afVar8, i2, (byte) 0);
            ah.m21508c(afVar3, afVar5, afVar8);
            c5067l2.mo5258a(afVar8, i2, (byte) 0);
            ah.m21509d(afVar3, afVar5, afVar8);
            c5067l2.mo5258a(afVar8, i2, (byte) 0);
            int i6 = (int) ((((afVar4.m21496i() / f2) * -0.25f) + 0.5f) * 65536.0f);
            if (z) {
                c5065h2.mo5254a(0, 65536);
                c5065h2.mo5254a(65536, 65536);
            } else {
                c5065h2.mo5254a(0, i6);
                c5065h2.mo5254a(65536, i6);
            }
            c5065h2.mo5254a(0, i6);
            c5065h2.mo5254a(65536, i6);
            if (z2) {
                c5065h2.mo5254a(0, 65536);
                c5065h2.mo5254a(65536, 65536);
            } else {
                c5065h2.mo5254a(0, i6);
                c5065h2.mo5254a(65536, i6);
            }
            i3 = i5 + 2;
            i6 = i5 + 3;
            i4 = i5;
            c5063d2 = c5063d;
            c5063d2.mo5256a(i4, i5 + 1, i3, i6);
            c5063d2.mo5256a(i3, i6, i4 + 4, i4 + 5);
            return 6;
        } else if (b2 < 2) {
            return 0;
        } else {
            int i7;
            af afVar10;
            af afVar11;
            C5065h c5065h3;
            C5063d c5063d3;
            afVar6 = this.f18716b;
            afVar4 = this.f18717c;
            afVar3 = this.f18718d;
            afVar5 = this.f18719e;
            afVar8 = this.f18720f;
            af afVar12 = this.f18721g;
            af afVar13 = afVar8;
            af afVar14 = this.f18722h;
            afVar8 = this.f18723i;
            af afVar15 = afVar3;
            af afVar16 = this.f18724j;
            afVar3 = this.f18725k;
            i3 = c5067l.mo5250a();
            int i8 = b2;
            ajVar2.m21525a(0, afVar2, afVar6);
            ajVar2.m21525a(1, afVar2, afVar4);
            ah.m21509d(afVar4, afVar6, afVar5);
            ah.m21501a(afVar5, f2, afVar12);
            ah.m21502a(afVar12, afVar8);
            ah.m21508c(afVar6, afVar8, afVar6);
            ah.m21508c(afVar6, afVar12, afVar3);
            c5067l2.mo5258a(afVar3, i2, (byte) 0);
            ah.m21509d(afVar6, afVar12, afVar3);
            c5067l2.mo5258a(afVar3, i2, (byte) 0);
            ah.m21509d(afVar6, afVar8, afVar6);
            ah.m21508c(afVar6, afVar12, afVar3);
            c5067l2.mo5258a(afVar3, i2, (byte) 0);
            ah.m21509d(afVar6, afVar12, afVar3);
            c5067l2.mo5258a(afVar3, i2, (byte) 0);
            c5065h2.mo5259a(f18711u);
            if (z) {
                c5063d2.mo5256a(i3, i3 + 1, i3 + 2, i3 + 3);
            } else {
                i7 = i3 + 2;
                c5063d2.mo5256a(i7, i7, i7, i7);
            }
            b2 = i3 + 4;
            c5063d2.mo5256a(i3 + 2, i3 + 3, b2, i3 + 5);
            float f3 = f2 * f2;
            i7 = b2;
            int i9 = 1;
            b2 = 4;
            while (i9 < i8 - 1) {
                Object obj;
                float f4;
                af afVar17;
                int i10;
                int i11;
                Object obj2;
                i9++;
                afVar7 = afVar15;
                ajVar2.m21525a(i9, afVar2, afVar7);
                af afVar18 = afVar13;
                ah.m21509d(afVar7, afVar4, afVar18);
                afVar2 = afVar14;
                ah.m21501a(afVar18, f2, afVar2);
                if (ah.m21507c(afVar5, afVar18) > 0) {
                    afVar10 = afVar16;
                    obj = 1;
                } else {
                    afVar10 = afVar16;
                    obj = null;
                }
                ah.m21508c(afVar12, afVar2, afVar10);
                float a2 = af.m21453a(afVar2, afVar10);
                if (a2 <= 1.0f || af.m21453a(afVar5, afVar18) < 0.0f) {
                    f4 = f3;
                    afVar17 = afVar10;
                    i10 = i9;
                    afVar11 = afVar8;
                    c5065h3 = c5065h;
                    c5063d3 = c5063d;
                } else {
                    i10 = i9;
                    af.m21461a(afVar10, f3 / a2, afVar10);
                    ah.m21508c(afVar4, afVar10, afVar3);
                    ah.m21509d(afVar4, afVar10, afVar8);
                    af afVar19 = obj != null ? afVar3 : afVar8;
                    if (af.m21470c(afVar4, afVar6, afVar19) >= 0.5f || af.m21470c(afVar4, afVar7, afVar19) >= 0.5f) {
                        f4 = f3;
                        afVar17 = afVar10;
                        afVar11 = afVar8;
                        c5065h3 = c5065h;
                        c5063d3 = c5063d;
                    } else {
                        c5067l2.mo5258a(afVar3, i2, (byte) 0);
                        c5067l2.mo5258a(afVar8, i2, (byte) 0);
                        b2 += 2;
                        f4 = f3;
                        c5065h3 = c5065h;
                        c5065h3.mo5259a(f18713w);
                        afVar17 = afVar10;
                        i4 = i7 + 2;
                        i11 = b2;
                        afVar11 = afVar8;
                        c5063d3 = c5063d;
                        c5063d3.mo5256a(i7, i7 + 1, i4, i7 + 3);
                        i7 = i4;
                        obj2 = null;
                        if (obj2 != null) {
                            ah.m21508c(afVar4, afVar12, afVar3);
                            c5067l2.mo5258a(afVar3, i2, (byte) 0);
                            ah.m21509d(afVar4, afVar12, afVar3);
                            c5067l2.mo5258a(afVar3, i2, (byte) 0);
                            c5067l2.mo5258a(afVar4, i2, (byte) 0);
                            ah.m21508c(afVar4, afVar2, afVar3);
                            c5067l2.mo5258a(afVar3, i2, (byte) 0);
                            ah.m21509d(afVar4, afVar2, afVar3);
                            c5067l2.mo5258a(afVar3, i2, (byte) 0);
                            c5065h3.mo5259a(f18714x);
                            i11 += 5;
                            if (obj == null) {
                                c5063d3.mo5255a(i7 + 2, i7 + 1, i7 + 4);
                            } else {
                                c5063d3.mo5255a(i7 + 0, i7 + 2, i7 + 3);
                            }
                            b2 = i7 + 5;
                            c5063d3.mo5256a(i7 + 3, i7 + 4, b2, i7 + 6);
                            i7 = b2;
                        }
                        b2 = i11;
                        afVar12.m21482b(afVar2);
                        afVar5.m21482b(afVar18);
                        afVar6.m21482b(afVar4);
                        afVar4.m21482b(afVar7);
                        afVar13 = afVar18;
                        afVar14 = afVar2;
                        afVar15 = afVar7;
                        i9 = i10;
                        f3 = f4;
                        afVar16 = afVar17;
                        afVar8 = afVar11;
                        ajVar2 = ajVar;
                        f2 = f;
                        afVar2 = afVar;
                    }
                }
                i11 = b2;
                obj2 = 1;
                if (obj2 != null) {
                    ah.m21508c(afVar4, afVar12, afVar3);
                    c5067l2.mo5258a(afVar3, i2, (byte) 0);
                    ah.m21509d(afVar4, afVar12, afVar3);
                    c5067l2.mo5258a(afVar3, i2, (byte) 0);
                    c5067l2.mo5258a(afVar4, i2, (byte) 0);
                    ah.m21508c(afVar4, afVar2, afVar3);
                    c5067l2.mo5258a(afVar3, i2, (byte) 0);
                    ah.m21509d(afVar4, afVar2, afVar3);
                    c5067l2.mo5258a(afVar3, i2, (byte) 0);
                    c5065h3.mo5259a(f18714x);
                    i11 += 5;
                    if (obj == null) {
                        c5063d3.mo5255a(i7 + 0, i7 + 2, i7 + 3);
                    } else {
                        c5063d3.mo5255a(i7 + 2, i7 + 1, i7 + 4);
                    }
                    b2 = i7 + 5;
                    c5063d3.mo5256a(i7 + 3, i7 + 4, b2, i7 + 6);
                    i7 = b2;
                }
                b2 = i11;
                afVar12.m21482b(afVar2);
                afVar5.m21482b(afVar18);
                afVar6.m21482b(afVar4);
                afVar4.m21482b(afVar7);
                afVar13 = afVar18;
                afVar14 = afVar2;
                afVar15 = afVar7;
                i9 = i10;
                f3 = f4;
                afVar16 = afVar17;
                afVar8 = afVar11;
                ajVar2 = ajVar;
                f2 = f;
                afVar2 = afVar;
            }
            afVar11 = afVar8;
            afVar2 = afVar14;
            afVar7 = afVar15;
            c5065h3 = c5065h;
            c5063d3 = c5063d;
            ah.m21508c(afVar7, afVar2, afVar3);
            c5067l2.mo5258a(afVar3, i2, (byte) 0);
            ah.m21509d(afVar7, afVar2, afVar3);
            c5067l2.mo5258a(afVar3, i2, (byte) 0);
            afVar10 = afVar11;
            ah.m21502a(afVar2, afVar10);
            ah.m21509d(afVar7, afVar10, afVar7);
            ah.m21508c(afVar7, afVar2, afVar3);
            c5067l2.mo5258a(afVar3, i2, (byte) 0);
            ah.m21509d(afVar7, afVar2, afVar3);
            c5067l2.mo5258a(afVar3, i2, (byte) 0);
            c5065h3.mo5259a(f18712v);
            b2 += 4;
            if (z2) {
                c5063d3.mo5256a(i7, i7 + 1, i7 + 2, i7 + 3);
            } else {
                c5063d3.mo5256a(i7, i7, i7, i7);
            }
            return b2;
        }
    }

    /* renamed from: a */
    public static int m22638a(aj ajVar) {
        ajVar = ajVar.m21528b() - 1;
        return ajVar == 1 ? 6 : ((ajVar - 1) * 5) + 8;
    }

    /* renamed from: b */
    public static int m22642b(aj ajVar) {
        ajVar = ajVar.m21528b() - 1;
        return ajVar == 1 ? 12 : ((ajVar + 2) * 6) + ((ajVar - 1) * 3);
    }

    /* renamed from: a */
    public static int m22639a(List<aj> list) {
        int i = 0;
        for (aj b : list) {
            i += b.m21528b() * 5;
        }
        return i;
    }

    /* renamed from: b */
    public static int m22643b(List<aj> list) {
        int i = 0;
        for (aj ajVar : list) {
            int b = ajVar.m21528b() - 1;
            if (ajVar.m21536e()) {
                b++;
            }
            i += (b * 3) * 6;
        }
        return i;
    }

    /* renamed from: a */
    public final void m22647a(aj ajVar, float f, boolean z, af afVar, int i, float f2, C5067l c5067l, C5063d c5063d, C5065h c5065h) {
        C5054e c5054e = this;
        aj ajVar2 = ajVar;
        af afVar2 = afVar;
        int i2 = i;
        C5067l c5067l2 = c5067l;
        C5063d c5063d2 = c5063d;
        C5065h c5065h2 = c5065h;
        int b = ajVar.m21528b();
        int i3 = b - 1;
        int a = c5067l.mo5250a();
        if (i3 <= 0) {
            if (C4728u.m21050a("GeometryUtil", 6)) {
                Log.e("GeometryUtil", "Polyline has no segments.");
            }
            return;
        }
        af afVar3;
        int i4 = z ? 5 : 4;
        int i5 = i4 * i3;
        af afVar4 = c5054e.f18716b;
        af afVar5 = c5054e.f18717c;
        c5067l2.mo5253a(i5 + c5067l.mo5250a());
        af afVar6 = c5054e.f18718d;
        if (c5065h2 != null) {
            afVar3 = afVar4;
            c5065h2.mo5263c(i5 + c5065h.mo5265g());
        } else {
            afVar3 = afVar4;
        }
        ajVar2.m21524a(0, afVar5);
        ah.m21509d(afVar5, afVar2, afVar5);
        int i6 = i3;
        int i7 = i4;
        afVar4 = afVar3;
        float f3 = 0.0f;
        af afVar7 = afVar5;
        int i8 = 1;
        while (i8 < b) {
            ajVar2.m21524a(i8, afVar4);
            ah.m21509d(afVar4, afVar2, afVar4);
            afVar2 = c5054e.f18718d;
            int i9 = b;
            af afVar8 = c5054e.f18719e;
            ah.m21509d(afVar4, afVar7, afVar2);
            ah.m21501a(afVar2, f, afVar8);
            ah.m21508c(afVar7, afVar8, afVar2);
            c5067l2.mo5257a(afVar2, i2);
            ah.m21509d(afVar7, afVar8, afVar2);
            c5067l2.mo5257a(afVar2, i2);
            ah.m21509d(afVar4, afVar8, afVar2);
            c5067l2.mo5257a(afVar2, i2);
            ah.m21508c(afVar4, afVar8, afVar2);
            c5067l2.mo5257a(afVar2, i2);
            if (z) {
                c5067l2.mo5257a(afVar4, i2);
            }
            if (c5065h2 != null) {
                ah.m21509d(afVar4, afVar7, afVar6);
                float i10 = (afVar6.m21496i() / ((float) i2)) * f2;
                c5065h2.mo5251a(0.0f, f3);
                c5065h2.mo5251a(1.0f, f3);
                f3 += i10;
                c5065h2.mo5251a(1.0f, f3);
                c5065h2.mo5251a(0.0f, f3);
                if (z) {
                    c5065h2.mo5251a(0.5f, f3);
                }
            }
            i8++;
            b = i9;
            ajVar2 = ajVar;
            afVar2 = afVar;
            af afVar9 = afVar4;
            afVar4 = afVar7;
            afVar7 = afVar9;
        }
        if (c5063d2 != null) {
            i5 += a;
            if (i5 > 32767) {
                StringBuilder stringBuilder = new StringBuilder(50);
                stringBuilder.append(i5);
                stringBuilder.append(" required, but we can only store 32767");
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            af afVar10 = c5054e.f18718d;
            afVar2 = c5054e.f18719e;
            af afVar11 = c5054e.f18720f;
            i3 = i6 * 2;
            aj ajVar3 = ajVar;
            int e = i6 - (ajVar.m21536e() ^ 1);
            if (z) {
                c5063d2.mo5262b(c5063d.mo5261b() + ((i3 + e) * 3));
            } else {
                c5063d2.mo5262b(c5063d.mo5261b() + (i3 * 3));
            }
            b = i6;
            for (e = 0; e < b; e++) {
                i3 = (e * i7) + a;
                i8 = i3 + 2;
                c5063d2.mo5255a(i3, i3 + 1, i8);
                c5063d2.mo5255a(i3, i8, i3 + 3);
            }
            if (z) {
                int i11 = 0;
                while (true) {
                    i3 = b - 1;
                    if (i11 >= i3) {
                        break;
                    }
                    ajVar3.m21524a(i11, afVar7);
                    e = i11 + 1;
                    ajVar3.m21524a(e, afVar4);
                    ajVar3.m21524a(i11 + 2, afVar10);
                    ah.m21509d(afVar4, afVar7, afVar2);
                    ah.m21509d(afVar10, afVar4, afVar11);
                    i11 = (i11 * 5) + a;
                    int i12 = i11 + 5;
                    if ((ah.m21507c(afVar2, afVar11) > 0 ? 1 : null) != null) {
                        c5063d2.mo5255a(i11 + 2, i12 + 1, i11 + 4);
                    } else {
                        c5063d2.mo5255a(i11 + 3, i11 + 4, i12);
                    }
                    i11 = e;
                }
                if (ajVar.m21536e()) {
                    ajVar3.m21524a(i3, afVar7);
                    i11 = 0;
                    ajVar3.m21524a(0, afVar4);
                    ajVar3.m21524a(1, afVar10);
                    ah.m21509d(afVar4, afVar7, afVar2);
                    ah.m21509d(afVar10, afVar4, afVar11);
                    if (ah.m21507c(afVar2, afVar11) > 0) {
                        i11 = 1;
                    }
                    i3 = (i3 * 5) + a;
                    if (i11 != 0) {
                        c5063d2.mo5255a(i3 + 2, a + 1, i3 + 4);
                        return;
                    }
                    c5063d2.mo5255a(i3 + 3, i3 + 4, a);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m22641a(int i, boolean z, int i2, int[] iArr, C5065h c5065h) {
        c5065h.mo5263c(((i - 1) * 5) + c5065h.mo5265g());
        int i3 = 1;
        if (!f18715y[i2]) {
            z = f18715y;
            int i4 = 1 << i2;
            int[] iArr2 = new int[((i4 * 5) * 2)];
            int i5 = 32768 / i4;
            for (int i6 = 0; i6 < iArr2.length; i6 += 10) {
                iArr2[i6] = 0;
                iArr2[i6 + 1] = i5;
                iArr2[i6 + 2] = 65536;
                iArr2[i6 + 3] = i5;
                iArr2[i6 + 4] = 65536;
                iArr2[i6 + 5] = i5;
                iArr2[i6 + 6] = 0;
                iArr2[i6 + 7] = i5;
                iArr2[i6 + 8] = 32768;
                iArr2[i6 + 9] = i5;
                i5 += 65536 / i4;
            }
            z[i2] = iArr2;
        }
        z = f18715y[i2];
        i2 = iArr[0];
        while (i3 < i) {
            c5065h.mo5260a(z, (i2 * 5) * 2, 10);
            i3++;
        }
    }

    /* renamed from: a */
    public final void m22646a(aj ajVar, float f, af afVar, int i, float f2, C5067l c5067l, C5063d c5063d, C5065h c5065h, C5065h c5065h2) {
        aj ajVar2 = ajVar;
        float f3 = f;
        af afVar2 = afVar;
        int i2 = i;
        C5067l c5067l2 = c5067l;
        C5063d c5063d2 = c5063d;
        C5065h c5065h3 = c5065h;
        int b = ajVar.m21528b();
        int i3 = b - 1;
        int a = c5067l.mo5250a();
        int i4 = i3 * 4;
        af afVar3 = this.f18716b;
        af afVar4 = this.f18717c;
        af afVar5 = this.f18718d;
        af afVar6 = this.f18719e;
        af afVar7 = afVar4;
        afVar4 = this.f18720f;
        int i5 = a;
        c5067l2.mo5253a(i4 + c5067l.mo5250a());
        if (c5065h3 != null) {
            c5065h3.mo5263c(i4 + c5065h.mo5265g());
        }
        ajVar2.m21524a(0, afVar3);
        ah.m21509d(afVar3, afVar2, afVar3);
        af afVar8 = afVar3;
        af afVar9 = afVar7;
        float f4 = 0.0f;
        int i6 = 1;
        while (i6 < b) {
            ajVar2.m21524a(i6, afVar9);
            ah.m21509d(afVar9, afVar2, afVar9);
            ah.m21509d(afVar9, afVar8, afVar5);
            ah.m21501a(afVar5, -f3, afVar6);
            c5067l2.mo5257a(afVar8, i2);
            ah.m21508c(afVar8, afVar6, afVar4);
            c5067l2.mo5257a(afVar4, i2);
            ah.m21508c(afVar9, afVar6, afVar4);
            c5067l2.mo5257a(afVar4, i2);
            c5067l2.mo5257a(afVar9, i2);
            if (c5065h3 != null) {
                float i7 = (afVar5.m21496i() / ((float) i2)) * f2;
                c5065h3.mo5251a(0.0f, f4);
                c5065h3.mo5251a(1.0f, f4);
                f4 += i7;
                c5065h3.mo5251a(1.0f, f4);
                c5065h3.mo5251a(0.0f, f4);
            }
            i6++;
            afVar2 = afVar;
            i2 = i;
            c5067l2 = c5067l;
            af afVar10 = afVar8;
            afVar8 = afVar9;
            afVar9 = afVar10;
        }
        int i8 = i3 * 2;
        i3--;
        c5063d2.mo5262b(c5063d.mo5261b() + ((i8 + i3) * 3));
        afVar2 = this.f18718d;
        af afVar11 = this.f18719e;
        af afVar12 = this.f18720f;
        int i9 = 0;
        while (true) {
            b = i5 + (i9 * 4);
            if (f3 > 0.0f) {
                int i10 = b + 2;
                c5063d2.mo5255a(b, b + 1, i10);
                c5063d2.mo5255a(b, i10, b + 3);
            } else {
                i6 = b + 2;
                c5063d2.mo5255a(b, i6, b + 1);
                c5063d2.mo5255a(b, b + 3, i6);
            }
            if (i9 != i3) {
                ajVar2.m21524a(i9, afVar8);
                i6 = i9 + 1;
                ajVar2.m21524a(i6, afVar9);
                ajVar2.m21524a(i9 + 2, afVar2);
                ah.m21509d(afVar9, afVar8, afVar11);
                ah.m21509d(afVar2, afVar9, afVar12);
                if (((float) ah.m21507c(afVar11, afVar12)) * f3 > 0.0f) {
                    i9 = b + 4;
                    if (f3 > 0.0f) {
                        c5063d2.mo5255a(b + 3, b + 2, i9 + 1);
                    } else {
                        c5063d2.mo5255a(b + 2, b + 3, i9 + 1);
                    }
                }
                i9 = i6;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void m22645a(aj ajVar, float f, float f2, af afVar, int i, int i2, int i3, C5067l c5067l, C5063d c5063d, C5065h c5065h) {
        C5054e c5054e = this;
        aj ajVar2 = ajVar;
        float f3 = f;
        float f4 = f2;
        af afVar2 = afVar;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        C5067l c5067l2 = c5067l;
        C5063d c5063d2 = c5063d;
        C5065h c5065h2 = c5065h;
        int b = ajVar.m21528b();
        if (b > 1) {
            int i7 = b - 1;
            int a = c5067l.mo5250a();
            int i8 = b * 5;
            boolean e = ajVar.m21536e();
            c5067l2.mo5253a(a + i8);
            if (c5065h2 != null) {
                c5065h2.mo5263c(i8 + c5065h.mo5265g());
            }
            c5063d2.mo5262b(c5063d.mo5261b() + ((i7 * 3) * 6));
            af afVar3 = c5054e.f18716b;
            af afVar4 = c5054e.f18717c;
            int i9 = a;
            af afVar5 = c5054e.f18718d;
            af afVar6 = c5054e.f18719e;
            int i10 = i7;
            af afVar7 = c5054e.f18720f;
            af afVar8 = c5054e.f18721g;
            af afVar9 = c5054e.f18722h;
            bm bmVar = c5054e.f18726l;
            bm bmVar2 = c5054e.f18727m;
            bm bmVar3 = c5054e.f18728n;
            af afVar10 = afVar7;
            bm bmVar4 = c5054e.f18729o;
            bm bmVar5 = c5054e.f18730p;
            bm bmVar6 = c5054e.f18731q;
            af afVar11 = afVar6;
            int i11 = (int) (((((float) i5) * f4) + (((float) i6) * f3)) / (f3 + f4));
            i5 = i9;
            int i12 = 0;
            i9 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            while (i12 < b) {
                int i17;
                int i18;
                bm bmVar7;
                bm a2;
                bm bmVar8;
                Object obj;
                af afVar12;
                bm bmVar9;
                bm bmVar10;
                af afVar13;
                C5065h c5065h3;
                bm bmVar11;
                int i19;
                Object obj2;
                af afVar14;
                int i20;
                af afVar15;
                af afVar16;
                af afVar17;
                bm bmVar12;
                int i21;
                int i22;
                bm bmVar13;
                int i23;
                bm bmVar14;
                int i24;
                C5065h c5065h4;
                int i25;
                bm bmVar15;
                boolean d;
                bm bmVar16;
                float f5;
                float f6;
                bm bmVar17;
                float b2;
                float min;
                float f7;
                int i26;
                af afVar18;
                int i27;
                int i28;
                int i29;
                Object obj3;
                int i30;
                af afVar19;
                C5063d c5063d3;
                int i31;
                ajVar2.m21525a(i12, afVar2, afVar4);
                int i32 = i12 - 1;
                int i33 = i5;
                i5 = i12 + 1;
                if (e) {
                    if (i32 < 0) {
                        i32 = b - 2;
                    }
                    if (i5 >= b) {
                        i17 = i5;
                        i18 = i12;
                        i5 = i32;
                        i12 = 1;
                        bmVar7 = null;
                        if (i5 < 0) {
                            ajVar2.m21525a(i5, afVar2, afVar3);
                            a2 = c5054e.f18732r.m21704a(afVar4, afVar3);
                        } else {
                            a2 = null;
                        }
                        if (i12 < b) {
                            ajVar2.m21525a(i12, afVar2, afVar5);
                            bmVar7 = c5054e.f18733s.m21704a(afVar4, afVar5);
                        }
                        bmVar8 = bmVar7;
                        if (a2 == null && bmVar8 != null) {
                            bmVar.m21705a(a2).m21710c();
                            bmVar2.m21705a(bmVar8).m21710c();
                            bmVar3.m21705a(bmVar).m21708b(bmVar2);
                            if (bmVar3.m21706a(0.0f, 0.0f)) {
                                bmVar3.m21705a(bmVar).m21711d();
                            } else {
                                obj = null;
                                if (obj != null) {
                                    afVar6 = afVar11;
                                    bm.m21701a(afVar4, bmVar6.m21705a(bmVar3).m21703a(-f3), afVar6);
                                    afVar12 = afVar10;
                                    bm.m21701a(afVar4, bmVar6.m21705a(bmVar3).m21703a(f4), afVar12);
                                    bmVar9 = bmVar2;
                                    a2 = bmVar3;
                                    i4 = i;
                                    c5067l2 = c5067l;
                                    c5067l2.mo5257a(afVar6, i4);
                                    c5067l2.mo5257a(afVar12, i4);
                                    bmVar10 = bmVar;
                                    afVar13 = afVar8;
                                    c5065h3 = c5065h;
                                    if (c5065h3 != null) {
                                        bmVar11 = a2;
                                        i19 = b;
                                        c5065h3.mo5254a(i2, 0);
                                        c5065h3.mo5254a(i6, 0);
                                    } else {
                                        bmVar11 = a2;
                                        i19 = b;
                                        b = i2;
                                    }
                                    i5 = i33 + 1;
                                    obj2 = obj;
                                    afVar14 = afVar12;
                                    f4 = f3;
                                    i20 = i5;
                                    afVar15 = afVar3;
                                    afVar16 = afVar5;
                                    a = i5 + 1;
                                    afVar17 = afVar9;
                                    bmVar12 = bmVar4;
                                    i21 = i13;
                                    i22 = i33;
                                    bmVar13 = bmVar11;
                                    i23 = i20;
                                    afVar3 = afVar6;
                                    i12 = i9;
                                    bmVar14 = bmVar5;
                                    i5 = i22;
                                    i24 = i4;
                                    c5065h4 = c5065h3;
                                    i25 = i24;
                                } else {
                                    bmVar9 = bmVar2;
                                    bmVar10 = bmVar;
                                    i19 = b;
                                    afVar15 = afVar3;
                                    afVar16 = afVar5;
                                    afVar13 = afVar8;
                                    afVar12 = afVar10;
                                    afVar3 = afVar11;
                                    c5065h3 = c5065h;
                                    i4 = i;
                                    b = i2;
                                    bmVar15 = bmVar3;
                                    c5067l2 = c5067l;
                                    bmVar15.m21710c();
                                    d = a2.m21712d(bmVar8);
                                    obj2 = obj;
                                    bmVar16 = bmVar4;
                                    bmVar16.m21705a(bmVar8).m21711d().m21710c();
                                    f3 = bmVar15.m21709c(bmVar16);
                                    if (d) {
                                        bmVar12 = bmVar16;
                                        f5 = f;
                                    } else {
                                        bmVar12 = bmVar16;
                                        f5 = f4;
                                    }
                                    f6 = f5 / (-f3);
                                    bmVar17 = bmVar5;
                                    bmVar17.m21705a(bmVar15).m21703a(f6);
                                    b2 = a2.m21707b();
                                    f5 = bmVar8.m21707b();
                                    min = Math.min(b2 / Math.abs(bmVar17.m21709c(bmVar6.m21705a(a2).m21710c())), f5 / Math.abs(bmVar17.m21709c(bmVar6.m21705a(bmVar8).m21710c())));
                                    if (min < 1.0f) {
                                        f6 *= Math.max(Math.abs(f3), min);
                                    }
                                    if (d) {
                                        min = -f4;
                                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar15).m21703a(min), afVar3);
                                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar15).m21703a(-f6), afVar12);
                                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar8).m21711d().m21710c().m21703a(min), afVar13);
                                        afVar17 = afVar9;
                                        bm.m21701a(afVar4, bmVar6.m21705a(a2).m21711d().m21710c().m21703a(f4), afVar17);
                                        i25 = i;
                                        c5067l2.mo5257a(afVar3, i25);
                                        c5067l2.mo5257a(afVar12, i25);
                                        c5067l2.mo5257a(afVar13, i25);
                                        c5067l2.mo5257a(afVar17, i25);
                                        c5065h4 = c5065h;
                                        if (c5065h4 != null) {
                                            i6 = i3;
                                            c5065h4.mo5254a(i6, 0);
                                            bmVar14 = bmVar17;
                                            c5065h4.mo5254a(i2, 0);
                                            c5065h4.mo5254a(i6, 0);
                                            c5065h4.mo5254a(i6, 0);
                                        } else {
                                            bmVar14 = bmVar17;
                                            i6 = i3;
                                            b = i2;
                                        }
                                        i5 = i33 + 1;
                                        i21 = i5 + 1;
                                        i12 = i21 + 1;
                                        afVar14 = afVar12;
                                        i22 = i5;
                                        i20 = i12;
                                        bmVar13 = bmVar15;
                                        a = i12 + 1;
                                        f4 = f;
                                        i23 = i21;
                                    } else {
                                        bmVar14 = bmVar17;
                                        afVar17 = afVar9;
                                        i25 = i;
                                        c5065h4 = c5065h;
                                        i6 = i3;
                                        b = i2;
                                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar15).m21703a(f6), afVar12);
                                        bmVar16 = bmVar6.m21705a(bmVar15);
                                        bmVar13 = bmVar15;
                                        f4 = f;
                                        f7 = -f4;
                                        bm.m21701a(afVar4, bmVar16.m21703a(f7), afVar3);
                                        bm.m21701a(afVar4, bmVar6.m21705a(a2).m21711d().m21710c().m21703a(f7), afVar13);
                                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar8).m21711d().m21710c().m21703a(f4), afVar17);
                                        c5067l2.mo5257a(afVar3, i25);
                                        c5067l2.mo5257a(afVar12, i25);
                                        c5067l2.mo5257a(afVar13, i25);
                                        c5067l2.mo5257a(afVar17, i25);
                                        if (c5065h4 != null) {
                                            c5065h4.mo5254a(b, 0);
                                            c5065h4.mo5254a(i6, 0);
                                            c5065h4.mo5254a(b, 0);
                                            c5065h4.mo5254a(b, 0);
                                        }
                                        i5 = i33 + 1;
                                        i21 = i5 + 1;
                                        i12 = i21 + 1;
                                        a = i12 + 1;
                                        afVar14 = afVar12;
                                        i20 = i5;
                                        i23 = i20;
                                        i22 = i12;
                                        i5 = i21;
                                    }
                                }
                                i26 = a + 1;
                                c5067l2.mo5257a(afVar4, i25);
                                if (c5065h4 != null) {
                                    afVar18 = afVar17;
                                    i27 = i11;
                                    c5065h4.mo5254a(i27, 0);
                                } else {
                                    afVar18 = afVar17;
                                    i27 = i11;
                                }
                                if (e) {
                                    i28 = i27;
                                    i29 = i10;
                                    i27 = i18;
                                    if (i27 == i29) {
                                        obj3 = 1;
                                        if (obj2 == null || r19 != null) {
                                            i30 = i29;
                                            afVar19 = afVar3;
                                            c5063d3 = c5063d;
                                        } else {
                                            i30 = i29;
                                            afVar19 = afVar3;
                                            i29 = i33;
                                            c5063d3 = c5063d;
                                            c5063d3.mo5255a(i21, a, i29);
                                            c5063d3.mo5255a(a, i12, i29);
                                        }
                                        if (i27 <= 0) {
                                            i27 = i14;
                                            i29 = i15;
                                            c5063d3.mo5255a(i27, i29, a);
                                            i31 = i21;
                                            i21 = i16;
                                            c5063d3.mo5255a(i29, i21, a);
                                            c5063d3.mo5255a(i27, a, i5);
                                            c5063d3.mo5255a(a, i21, i20);
                                        } else {
                                            i31 = i21;
                                        }
                                        i15 = a;
                                        bmVar5 = bmVar14;
                                        afVar11 = afVar19;
                                        i16 = i23;
                                        i14 = i22;
                                        i5 = i26;
                                        bmVar2 = bmVar9;
                                        b = i19;
                                        afVar3 = afVar15;
                                        afVar5 = afVar16;
                                        bmVar4 = bmVar12;
                                        bmVar3 = bmVar13;
                                        afVar10 = afVar14;
                                        afVar9 = afVar18;
                                        i11 = i28;
                                        i10 = i30;
                                        i13 = i31;
                                        c5054e = this;
                                        ajVar2 = ajVar;
                                        f3 = f;
                                        f4 = f2;
                                        afVar2 = afVar;
                                        i9 = i12;
                                        afVar8 = afVar13;
                                        i12 = i17;
                                        bmVar = bmVar10;
                                    }
                                } else {
                                    i28 = i27;
                                    i29 = i10;
                                    i27 = i18;
                                }
                                obj3 = null;
                                if (obj2 == null) {
                                }
                                i30 = i29;
                                afVar19 = afVar3;
                                c5063d3 = c5063d;
                                if (i27 <= 0) {
                                    i31 = i21;
                                } else {
                                    i27 = i14;
                                    i29 = i15;
                                    c5063d3.mo5255a(i27, i29, a);
                                    i31 = i21;
                                    i21 = i16;
                                    c5063d3.mo5255a(i29, i21, a);
                                    c5063d3.mo5255a(i27, a, i5);
                                    c5063d3.mo5255a(a, i21, i20);
                                }
                                i15 = a;
                                bmVar5 = bmVar14;
                                afVar11 = afVar19;
                                i16 = i23;
                                i14 = i22;
                                i5 = i26;
                                bmVar2 = bmVar9;
                                b = i19;
                                afVar3 = afVar15;
                                afVar5 = afVar16;
                                bmVar4 = bmVar12;
                                bmVar3 = bmVar13;
                                afVar10 = afVar14;
                                afVar9 = afVar18;
                                i11 = i28;
                                i10 = i30;
                                i13 = i31;
                                c5054e = this;
                                ajVar2 = ajVar;
                                f3 = f;
                                f4 = f2;
                                afVar2 = afVar;
                                i9 = i12;
                                afVar8 = afVar13;
                                i12 = i17;
                                bmVar = bmVar10;
                            }
                        } else if (a2 == null) {
                            bmVar3.m21705a(a2).m21711d().m21710c();
                        } else {
                            bmVar3.m21705a(bmVar8).m21711d().m21710c().m21702a();
                        }
                        obj = 1;
                        if (obj != null) {
                            bmVar9 = bmVar2;
                            bmVar10 = bmVar;
                            i19 = b;
                            afVar15 = afVar3;
                            afVar16 = afVar5;
                            afVar13 = afVar8;
                            afVar12 = afVar10;
                            afVar3 = afVar11;
                            c5065h3 = c5065h;
                            i4 = i;
                            b = i2;
                            bmVar15 = bmVar3;
                            c5067l2 = c5067l;
                            bmVar15.m21710c();
                            d = a2.m21712d(bmVar8);
                            obj2 = obj;
                            bmVar16 = bmVar4;
                            bmVar16.m21705a(bmVar8).m21711d().m21710c();
                            f3 = bmVar15.m21709c(bmVar16);
                            if (d) {
                                bmVar12 = bmVar16;
                                f5 = f4;
                            } else {
                                bmVar12 = bmVar16;
                                f5 = f;
                            }
                            f6 = f5 / (-f3);
                            bmVar17 = bmVar5;
                            bmVar17.m21705a(bmVar15).m21703a(f6);
                            b2 = a2.m21707b();
                            f5 = bmVar8.m21707b();
                            min = Math.min(b2 / Math.abs(bmVar17.m21709c(bmVar6.m21705a(a2).m21710c())), f5 / Math.abs(bmVar17.m21709c(bmVar6.m21705a(bmVar8).m21710c())));
                            if (min < 1.0f) {
                                f6 *= Math.max(Math.abs(f3), min);
                            }
                            if (d) {
                                bmVar14 = bmVar17;
                                afVar17 = afVar9;
                                i25 = i;
                                c5065h4 = c5065h;
                                i6 = i3;
                                b = i2;
                                bm.m21701a(afVar4, bmVar6.m21705a(bmVar15).m21703a(f6), afVar12);
                                bmVar16 = bmVar6.m21705a(bmVar15);
                                bmVar13 = bmVar15;
                                f4 = f;
                                f7 = -f4;
                                bm.m21701a(afVar4, bmVar16.m21703a(f7), afVar3);
                                bm.m21701a(afVar4, bmVar6.m21705a(a2).m21711d().m21710c().m21703a(f7), afVar13);
                                bm.m21701a(afVar4, bmVar6.m21705a(bmVar8).m21711d().m21710c().m21703a(f4), afVar17);
                                c5067l2.mo5257a(afVar3, i25);
                                c5067l2.mo5257a(afVar12, i25);
                                c5067l2.mo5257a(afVar13, i25);
                                c5067l2.mo5257a(afVar17, i25);
                                if (c5065h4 != null) {
                                    c5065h4.mo5254a(b, 0);
                                    c5065h4.mo5254a(i6, 0);
                                    c5065h4.mo5254a(b, 0);
                                    c5065h4.mo5254a(b, 0);
                                }
                                i5 = i33 + 1;
                                i21 = i5 + 1;
                                i12 = i21 + 1;
                                a = i12 + 1;
                                afVar14 = afVar12;
                                i20 = i5;
                                i23 = i20;
                                i22 = i12;
                                i5 = i21;
                            } else {
                                min = -f4;
                                bm.m21701a(afVar4, bmVar6.m21705a(bmVar15).m21703a(min), afVar3);
                                bm.m21701a(afVar4, bmVar6.m21705a(bmVar15).m21703a(-f6), afVar12);
                                bm.m21701a(afVar4, bmVar6.m21705a(bmVar8).m21711d().m21710c().m21703a(min), afVar13);
                                afVar17 = afVar9;
                                bm.m21701a(afVar4, bmVar6.m21705a(a2).m21711d().m21710c().m21703a(f4), afVar17);
                                i25 = i;
                                c5067l2.mo5257a(afVar3, i25);
                                c5067l2.mo5257a(afVar12, i25);
                                c5067l2.mo5257a(afVar13, i25);
                                c5067l2.mo5257a(afVar17, i25);
                                c5065h4 = c5065h;
                                if (c5065h4 != null) {
                                    bmVar14 = bmVar17;
                                    i6 = i3;
                                    b = i2;
                                } else {
                                    i6 = i3;
                                    c5065h4.mo5254a(i6, 0);
                                    bmVar14 = bmVar17;
                                    c5065h4.mo5254a(i2, 0);
                                    c5065h4.mo5254a(i6, 0);
                                    c5065h4.mo5254a(i6, 0);
                                }
                                i5 = i33 + 1;
                                i21 = i5 + 1;
                                i12 = i21 + 1;
                                afVar14 = afVar12;
                                i22 = i5;
                                i20 = i12;
                                bmVar13 = bmVar15;
                                a = i12 + 1;
                                f4 = f;
                                i23 = i21;
                            }
                        } else {
                            afVar6 = afVar11;
                            bm.m21701a(afVar4, bmVar6.m21705a(bmVar3).m21703a(-f3), afVar6);
                            afVar12 = afVar10;
                            bm.m21701a(afVar4, bmVar6.m21705a(bmVar3).m21703a(f4), afVar12);
                            bmVar9 = bmVar2;
                            a2 = bmVar3;
                            i4 = i;
                            c5067l2 = c5067l;
                            c5067l2.mo5257a(afVar6, i4);
                            c5067l2.mo5257a(afVar12, i4);
                            bmVar10 = bmVar;
                            afVar13 = afVar8;
                            c5065h3 = c5065h;
                            if (c5065h3 != null) {
                                bmVar11 = a2;
                                i19 = b;
                                b = i2;
                            } else {
                                bmVar11 = a2;
                                i19 = b;
                                c5065h3.mo5254a(i2, 0);
                                c5065h3.mo5254a(i6, 0);
                            }
                            i5 = i33 + 1;
                            obj2 = obj;
                            afVar14 = afVar12;
                            f4 = f3;
                            i20 = i5;
                            afVar15 = afVar3;
                            afVar16 = afVar5;
                            a = i5 + 1;
                            afVar17 = afVar9;
                            bmVar12 = bmVar4;
                            i21 = i13;
                            i22 = i33;
                            bmVar13 = bmVar11;
                            i23 = i20;
                            afVar3 = afVar6;
                            i12 = i9;
                            bmVar14 = bmVar5;
                            i5 = i22;
                            i24 = i4;
                            c5065h4 = c5065h3;
                            i25 = i24;
                        }
                        i26 = a + 1;
                        c5067l2.mo5257a(afVar4, i25);
                        if (c5065h4 != null) {
                            afVar18 = afVar17;
                            i27 = i11;
                        } else {
                            afVar18 = afVar17;
                            i27 = i11;
                            c5065h4.mo5254a(i27, 0);
                        }
                        if (e) {
                            i28 = i27;
                            i29 = i10;
                            i27 = i18;
                        } else {
                            i28 = i27;
                            i29 = i10;
                            i27 = i18;
                            if (i27 == i29) {
                                obj3 = 1;
                                if (obj2 == null) {
                                }
                                i30 = i29;
                                afVar19 = afVar3;
                                c5063d3 = c5063d;
                                if (i27 <= 0) {
                                    i27 = i14;
                                    i29 = i15;
                                    c5063d3.mo5255a(i27, i29, a);
                                    i31 = i21;
                                    i21 = i16;
                                    c5063d3.mo5255a(i29, i21, a);
                                    c5063d3.mo5255a(i27, a, i5);
                                    c5063d3.mo5255a(a, i21, i20);
                                } else {
                                    i31 = i21;
                                }
                                i15 = a;
                                bmVar5 = bmVar14;
                                afVar11 = afVar19;
                                i16 = i23;
                                i14 = i22;
                                i5 = i26;
                                bmVar2 = bmVar9;
                                b = i19;
                                afVar3 = afVar15;
                                afVar5 = afVar16;
                                bmVar4 = bmVar12;
                                bmVar3 = bmVar13;
                                afVar10 = afVar14;
                                afVar9 = afVar18;
                                i11 = i28;
                                i10 = i30;
                                i13 = i31;
                                c5054e = this;
                                ajVar2 = ajVar;
                                f3 = f;
                                f4 = f2;
                                afVar2 = afVar;
                                i9 = i12;
                                afVar8 = afVar13;
                                i12 = i17;
                                bmVar = bmVar10;
                            }
                        }
                        obj3 = null;
                        if (obj2 == null) {
                        }
                        i30 = i29;
                        afVar19 = afVar3;
                        c5063d3 = c5063d;
                        if (i27 <= 0) {
                            i31 = i21;
                        } else {
                            i27 = i14;
                            i29 = i15;
                            c5063d3.mo5255a(i27, i29, a);
                            i31 = i21;
                            i21 = i16;
                            c5063d3.mo5255a(i29, i21, a);
                            c5063d3.mo5255a(i27, a, i5);
                            c5063d3.mo5255a(a, i21, i20);
                        }
                        i15 = a;
                        bmVar5 = bmVar14;
                        afVar11 = afVar19;
                        i16 = i23;
                        i14 = i22;
                        i5 = i26;
                        bmVar2 = bmVar9;
                        b = i19;
                        afVar3 = afVar15;
                        afVar5 = afVar16;
                        bmVar4 = bmVar12;
                        bmVar3 = bmVar13;
                        afVar10 = afVar14;
                        afVar9 = afVar18;
                        i11 = i28;
                        i10 = i30;
                        i13 = i31;
                        c5054e = this;
                        ajVar2 = ajVar;
                        f3 = f;
                        f4 = f2;
                        afVar2 = afVar;
                        i9 = i12;
                        afVar8 = afVar13;
                        i12 = i17;
                        bmVar = bmVar10;
                    }
                }
                i17 = i5;
                i18 = i12;
                i12 = i17;
                i5 = i32;
                bmVar7 = null;
                if (i5 < 0) {
                    a2 = null;
                } else {
                    ajVar2.m21525a(i5, afVar2, afVar3);
                    a2 = c5054e.f18732r.m21704a(afVar4, afVar3);
                }
                if (i12 < b) {
                    ajVar2.m21525a(i12, afVar2, afVar5);
                    bmVar7 = c5054e.f18733s.m21704a(afVar4, afVar5);
                }
                bmVar8 = bmVar7;
                if (a2 == null) {
                }
                if (a2 == null) {
                    bmVar3.m21705a(bmVar8).m21711d().m21710c().m21702a();
                } else {
                    bmVar3.m21705a(a2).m21711d().m21710c();
                }
                obj = 1;
                if (obj != null) {
                    afVar6 = afVar11;
                    bm.m21701a(afVar4, bmVar6.m21705a(bmVar3).m21703a(-f3), afVar6);
                    afVar12 = afVar10;
                    bm.m21701a(afVar4, bmVar6.m21705a(bmVar3).m21703a(f4), afVar12);
                    bmVar9 = bmVar2;
                    a2 = bmVar3;
                    i4 = i;
                    c5067l2 = c5067l;
                    c5067l2.mo5257a(afVar6, i4);
                    c5067l2.mo5257a(afVar12, i4);
                    bmVar10 = bmVar;
                    afVar13 = afVar8;
                    c5065h3 = c5065h;
                    if (c5065h3 != null) {
                        bmVar11 = a2;
                        i19 = b;
                        c5065h3.mo5254a(i2, 0);
                        c5065h3.mo5254a(i6, 0);
                    } else {
                        bmVar11 = a2;
                        i19 = b;
                        b = i2;
                    }
                    i5 = i33 + 1;
                    obj2 = obj;
                    afVar14 = afVar12;
                    f4 = f3;
                    i20 = i5;
                    afVar15 = afVar3;
                    afVar16 = afVar5;
                    a = i5 + 1;
                    afVar17 = afVar9;
                    bmVar12 = bmVar4;
                    i21 = i13;
                    i22 = i33;
                    bmVar13 = bmVar11;
                    i23 = i20;
                    afVar3 = afVar6;
                    i12 = i9;
                    bmVar14 = bmVar5;
                    i5 = i22;
                    i24 = i4;
                    c5065h4 = c5065h3;
                    i25 = i24;
                } else {
                    bmVar9 = bmVar2;
                    bmVar10 = bmVar;
                    i19 = b;
                    afVar15 = afVar3;
                    afVar16 = afVar5;
                    afVar13 = afVar8;
                    afVar12 = afVar10;
                    afVar3 = afVar11;
                    c5065h3 = c5065h;
                    i4 = i;
                    b = i2;
                    bmVar15 = bmVar3;
                    c5067l2 = c5067l;
                    bmVar15.m21710c();
                    d = a2.m21712d(bmVar8);
                    obj2 = obj;
                    bmVar16 = bmVar4;
                    bmVar16.m21705a(bmVar8).m21711d().m21710c();
                    f3 = bmVar15.m21709c(bmVar16);
                    if (d) {
                        bmVar12 = bmVar16;
                        f5 = f;
                    } else {
                        bmVar12 = bmVar16;
                        f5 = f4;
                    }
                    f6 = f5 / (-f3);
                    bmVar17 = bmVar5;
                    bmVar17.m21705a(bmVar15).m21703a(f6);
                    b2 = a2.m21707b();
                    f5 = bmVar8.m21707b();
                    min = Math.min(b2 / Math.abs(bmVar17.m21709c(bmVar6.m21705a(a2).m21710c())), f5 / Math.abs(bmVar17.m21709c(bmVar6.m21705a(bmVar8).m21710c())));
                    if (min < 1.0f) {
                        f6 *= Math.max(Math.abs(f3), min);
                    }
                    if (d) {
                        min = -f4;
                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar15).m21703a(min), afVar3);
                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar15).m21703a(-f6), afVar12);
                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar8).m21711d().m21710c().m21703a(min), afVar13);
                        afVar17 = afVar9;
                        bm.m21701a(afVar4, bmVar6.m21705a(a2).m21711d().m21710c().m21703a(f4), afVar17);
                        i25 = i;
                        c5067l2.mo5257a(afVar3, i25);
                        c5067l2.mo5257a(afVar12, i25);
                        c5067l2.mo5257a(afVar13, i25);
                        c5067l2.mo5257a(afVar17, i25);
                        c5065h4 = c5065h;
                        if (c5065h4 != null) {
                            i6 = i3;
                            c5065h4.mo5254a(i6, 0);
                            bmVar14 = bmVar17;
                            c5065h4.mo5254a(i2, 0);
                            c5065h4.mo5254a(i6, 0);
                            c5065h4.mo5254a(i6, 0);
                        } else {
                            bmVar14 = bmVar17;
                            i6 = i3;
                            b = i2;
                        }
                        i5 = i33 + 1;
                        i21 = i5 + 1;
                        i12 = i21 + 1;
                        afVar14 = afVar12;
                        i22 = i5;
                        i20 = i12;
                        bmVar13 = bmVar15;
                        a = i12 + 1;
                        f4 = f;
                        i23 = i21;
                    } else {
                        bmVar14 = bmVar17;
                        afVar17 = afVar9;
                        i25 = i;
                        c5065h4 = c5065h;
                        i6 = i3;
                        b = i2;
                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar15).m21703a(f6), afVar12);
                        bmVar16 = bmVar6.m21705a(bmVar15);
                        bmVar13 = bmVar15;
                        f4 = f;
                        f7 = -f4;
                        bm.m21701a(afVar4, bmVar16.m21703a(f7), afVar3);
                        bm.m21701a(afVar4, bmVar6.m21705a(a2).m21711d().m21710c().m21703a(f7), afVar13);
                        bm.m21701a(afVar4, bmVar6.m21705a(bmVar8).m21711d().m21710c().m21703a(f4), afVar17);
                        c5067l2.mo5257a(afVar3, i25);
                        c5067l2.mo5257a(afVar12, i25);
                        c5067l2.mo5257a(afVar13, i25);
                        c5067l2.mo5257a(afVar17, i25);
                        if (c5065h4 != null) {
                            c5065h4.mo5254a(b, 0);
                            c5065h4.mo5254a(i6, 0);
                            c5065h4.mo5254a(b, 0);
                            c5065h4.mo5254a(b, 0);
                        }
                        i5 = i33 + 1;
                        i21 = i5 + 1;
                        i12 = i21 + 1;
                        a = i12 + 1;
                        afVar14 = afVar12;
                        i20 = i5;
                        i23 = i20;
                        i22 = i12;
                        i5 = i21;
                    }
                }
                i26 = a + 1;
                c5067l2.mo5257a(afVar4, i25);
                if (c5065h4 != null) {
                    afVar18 = afVar17;
                    i27 = i11;
                    c5065h4.mo5254a(i27, 0);
                } else {
                    afVar18 = afVar17;
                    i27 = i11;
                }
                if (e) {
                    i28 = i27;
                    i29 = i10;
                    i27 = i18;
                    if (i27 == i29) {
                        obj3 = 1;
                        if (obj2 == null) {
                        }
                        i30 = i29;
                        afVar19 = afVar3;
                        c5063d3 = c5063d;
                        if (i27 <= 0) {
                            i27 = i14;
                            i29 = i15;
                            c5063d3.mo5255a(i27, i29, a);
                            i31 = i21;
                            i21 = i16;
                            c5063d3.mo5255a(i29, i21, a);
                            c5063d3.mo5255a(i27, a, i5);
                            c5063d3.mo5255a(a, i21, i20);
                        } else {
                            i31 = i21;
                        }
                        i15 = a;
                        bmVar5 = bmVar14;
                        afVar11 = afVar19;
                        i16 = i23;
                        i14 = i22;
                        i5 = i26;
                        bmVar2 = bmVar9;
                        b = i19;
                        afVar3 = afVar15;
                        afVar5 = afVar16;
                        bmVar4 = bmVar12;
                        bmVar3 = bmVar13;
                        afVar10 = afVar14;
                        afVar9 = afVar18;
                        i11 = i28;
                        i10 = i30;
                        i13 = i31;
                        c5054e = this;
                        ajVar2 = ajVar;
                        f3 = f;
                        f4 = f2;
                        afVar2 = afVar;
                        i9 = i12;
                        afVar8 = afVar13;
                        i12 = i17;
                        bmVar = bmVar10;
                    }
                } else {
                    i28 = i27;
                    i29 = i10;
                    i27 = i18;
                }
                obj3 = null;
                if (obj2 == null) {
                }
                i30 = i29;
                afVar19 = afVar3;
                c5063d3 = c5063d;
                if (i27 <= 0) {
                    i31 = i21;
                } else {
                    i27 = i14;
                    i29 = i15;
                    c5063d3.mo5255a(i27, i29, a);
                    i31 = i21;
                    i21 = i16;
                    c5063d3.mo5255a(i29, i21, a);
                    c5063d3.mo5255a(i27, a, i5);
                    c5063d3.mo5255a(a, i21, i20);
                }
                i15 = a;
                bmVar5 = bmVar14;
                afVar11 = afVar19;
                i16 = i23;
                i14 = i22;
                i5 = i26;
                bmVar2 = bmVar9;
                b = i19;
                afVar3 = afVar15;
                afVar5 = afVar16;
                bmVar4 = bmVar12;
                bmVar3 = bmVar13;
                afVar10 = afVar14;
                afVar9 = afVar18;
                i11 = i28;
                i10 = i30;
                i13 = i31;
                c5054e = this;
                ajVar2 = ajVar;
                f3 = f;
                f4 = f2;
                afVar2 = afVar;
                i9 = i12;
                afVar8 = afVar13;
                i12 = i17;
                bmVar = bmVar10;
            }
        }
    }
}
