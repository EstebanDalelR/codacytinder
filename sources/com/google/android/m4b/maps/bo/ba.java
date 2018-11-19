package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bo.bd.C4839a;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;

public class ba implements Comparable<ba> {
    /* renamed from: a */
    final int f17703a;
    /* renamed from: b */
    final int f17704b;
    /* renamed from: c */
    final int f17705c;
    /* renamed from: d */
    private final int f17706d;
    /* renamed from: e */
    private final int f17707e;
    /* renamed from: f */
    private final int f17708f;
    /* renamed from: g */
    private final be f17709g;
    /* renamed from: h */
    private ba f17710h;
    /* renamed from: i */
    private al f17711i;

    public /* synthetic */ int compareTo(Object obj) {
        ba baVar = (ba) obj;
        if (this.f17706d != baVar.f17706d) {
            return this.f17706d - baVar.f17706d;
        }
        if (this.f17707e != baVar.f17707e) {
            return this.f17707e - baVar.f17707e;
        }
        if (this.f17708f == baVar.f17708f) {
            return this.f17709g.m21641a(baVar.f17709g);
        }
        return this.f17708f - baVar.f17708f;
    }

    public ba(int i, int i2, int i3, be beVar) {
        this.f17710h = null;
        this.f17706d = i;
        this.f17707e = i2;
        this.f17708f = i3;
        if (beVar == null) {
            beVar = new be();
        }
        this.f17709g = beVar;
        this.f17705c = 18 - i;
        i = 1073741824 >> i;
        this.f17703a = (this.f17707e * i) - 536870912;
        this.f17704b = -((i * (this.f17708f + 1)) - 536870912);
    }

    public ba(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    /* renamed from: a */
    public final ba m21613a(int i, int i2, int i3) {
        return new ba(i, i2, i3, this.f17709g);
    }

    /* renamed from: a */
    public final ba m21611a() {
        if (this.f17710h == null) {
            this.f17710h = new ba(this.f17706d, this.f17707e, this.f17708f, null);
        }
        return this.f17710h;
    }

    /* renamed from: a */
    private static ba m21603a(int i, int i2, int i3, be beVar) {
        int i4 = 0;
        if (i <= 0) {
            return new ba(0, 0, 0);
        }
        if (i > 30) {
            i = 30;
        }
        int i5 = 30 - i;
        i2 = (i2 + 536870912) >> i5;
        i3 = ((-i3) + 536870912) >> i5;
        int i6 = 1 << i;
        if (i2 < 0) {
            i2 += i6;
        } else if (i2 >= i6) {
            i2 -= i6;
        }
        if (i3 >= 0) {
            i4 = i3 >= i6 ? i6 - 1 : i3;
        }
        return new ba(i, i2, i4, beVar);
    }

    /* renamed from: b */
    private static ba m21608b(int i, int i2, int i3, be beVar) {
        if (i <= 0) {
            return new ba(0, 0, 0);
        }
        if (i > 30) {
            i = 30;
        }
        int i4 = 30 - i;
        return new ba(i, (i2 + 536870912) >> i4, ((-i3) + 536870912) >> i4, beVar);
    }

    /* renamed from: b */
    public final int m21619b() {
        return this.f17706d;
    }

    /* renamed from: c */
    public final int m21620c() {
        return this.f17707e;
    }

    /* renamed from: d */
    public final int m21621d() {
        return this.f17708f;
    }

    /* renamed from: e */
    public final int m21622e() {
        return this.f17703a;
    }

    /* renamed from: f */
    public final int m21623f() {
        return this.f17704b;
    }

    /* renamed from: g */
    public final af m21624g() {
        return new af(this.f17703a, this.f17704b);
    }

    /* renamed from: h */
    public final af m21625h() {
        int i = 1073741824 >> this.f17706d;
        return new af(this.f17703a + i, this.f17704b + i);
    }

    /* renamed from: i */
    public final al m21626i() {
        if (this.f17711i == null) {
            int i = 1073741824 >> this.f17706d;
            this.f17711i = new al(new af(this.f17703a, this.f17704b), new af(this.f17703a + i, this.f17704b + i));
        }
        return this.f17711i;
    }

    /* renamed from: a */
    public final ba m21612a(int i) {
        int i2 = this.f17706d - i;
        if (i2 <= 0) {
            return this;
        }
        return m21613a(i, this.f17707e >> i2, this.f17708f >> i2);
    }

    /* renamed from: a */
    public final void m21618a(DataOutput dataOutput) {
        bl.m21699a(dataOutput, this.f17706d);
        bl.m21699a(dataOutput, this.f17707e);
        bl.m21699a(dataOutput, this.f17708f);
    }

    /* renamed from: a */
    public static ba m21605a(DataInput dataInput) {
        return new ba(bl.m21698a(dataInput), bl.m21698a(dataInput), bl.m21698a(dataInput));
    }

    /* renamed from: a */
    public static ArrayList<ba> m21606a(bq bqVar, int i) {
        return m21607a(bqVar, 15, null);
    }

    /* renamed from: a */
    public static ArrayList<ba> m21607a(bq bqVar, int i, be beVar) {
        int i2 = 0;
        if (i < 0) {
            return new ArrayList(0);
        }
        ba a = m21603a(i, bqVar.m28680f().f17658a, bqVar.m28681g().f17659b, beVar);
        bqVar = m21603a(i, bqVar.m28681g().f17658a - 1, bqVar.m28680f().f17659b + 1, beVar);
        int i3 = a.f17707e;
        int i4 = a.f17708f;
        int i5 = bqVar.f17707e;
        int i6 = bqVar.f17708f;
        int i7 = 1 << i;
        int i8 = i3 > i5 ? (((i7 - i3) + i5) + 1) * ((i6 - i4) + 1) : ((i5 - i3) + 1) * ((i6 - i4) + 1);
        if (i8 < 0) {
            return new ArrayList();
        }
        ArrayList<ba> arrayList = new ArrayList(i8);
        if (i8 <= 2) {
            arrayList.add(a);
            if (i8 == 2) {
                arrayList.add(bqVar);
            }
        } else if (i3 > i5) {
            while (i3 < i7) {
                for (bqVar = i4; bqVar <= i6; bqVar++) {
                    arrayList.add(new ba(i, i3, bqVar, beVar));
                }
                i3++;
            }
            while (i2 <= i5) {
                for (bqVar = i4; bqVar <= i6; bqVar++) {
                    arrayList.add(new ba(i, i2, bqVar, beVar));
                }
                i2++;
            }
        } else {
            while (i3 <= i5) {
                for (bqVar = i4; bqVar <= i6; bqVar++) {
                    arrayList.add(new ba(i, i3, bqVar, beVar));
                }
                i3++;
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if (this.f17707e == baVar.f17707e && this.f17708f == baVar.f17708f && this.f17706d == baVar.f17706d) {
            return this.f17709g.equals(baVar.f17709g);
        }
        return false;
    }

    public int hashCode() {
        int i = (((this.f17706d * 31) + this.f17707e) * 31) + this.f17708f;
        return !this.f17709g.m21647b() ? (i * 31) + this.f17709g.hashCode() : i;
    }

    /* renamed from: a */
    public final bd m21616a(C4839a c4839a) {
        return this.f17709g.m21642a(c4839a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(this.f17706d);
        stringBuilder.append(",");
        stringBuilder.append(this.f17707e);
        stringBuilder.append(",");
        stringBuilder.append(this.f17708f);
        stringBuilder.append(",");
        stringBuilder.append(this.f17709g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public ba mo5149a(be beVar) {
        return new ba(this.f17706d, this.f17707e, this.f17708f, beVar);
    }

    /* renamed from: a */
    public final void m21617a(bg bgVar, C4662a c4662a) {
        this.f17709g.m21646a(bgVar, c4662a);
    }

    /* renamed from: j */
    public final be m21627j() {
        return this.f17709g;
    }

    /* renamed from: a */
    public static ba m21604a(int i, af afVar) {
        i = afVar.f17658a;
        afVar = afVar.f17659b;
        if (afVar > -536870912) {
            if (afVar <= 536870912) {
                i = (i + 536870912) >> 0;
                afVar = ((-afVar) + 536870912) >> 0;
                if (i < 0) {
                    i += 1073741824;
                } else if (i >= 1073741824) {
                    i -= 1073741824;
                }
                return new ba(30, i, afVar);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static ba m21609b(int i, af afVar) {
        return m21603a(15, afVar.f17658a, afVar.f17659b, null);
    }

    /* renamed from: b */
    public static ArrayList<ba> m21610b(bq bqVar, int i) {
        ba b = m21608b(i, bqVar.m28680f().f17658a, bqVar.m28681g().f17659b, null);
        bqVar = m21608b(i, bqVar.m28681g().f17658a - 1, bqVar.m28680f().f17659b + 1, null);
        int i2 = b.f17707e;
        int i3 = b.f17708f;
        int i4 = bqVar.f17707e;
        int i5 = bqVar.f17708f;
        if (!af.m21472e(b.f17703a, b.f17704b) && af.m21472e(bqVar.f17703a, bqVar.f17704b) == null) {
            return new ArrayList();
        }
        bqVar = 1 << i;
        ArrayList<ba> arrayList = new ArrayList();
        int i6;
        if (i2 > i4) {
            while (i2 < bqVar) {
                for (i6 = i3; i6 < 0; i6++) {
                    arrayList.add(new ba(i, i2, i6, null));
                }
                for (i6 = bqVar; i6 <= i5; i6++) {
                    arrayList.add(new ba(i, i2, i6, null));
                }
                i2++;
            }
            for (i2 = 0; i2 <= i4; i2++) {
                for (i6 = i3; i6 < 0; i6++) {
                    arrayList.add(new ba(i, i2, i6, null));
                }
                for (i6 = bqVar; i6 <= i5; i6++) {
                    arrayList.add(new ba(i, i2, i6, null));
                }
            }
        } else {
            while (i2 <= i4) {
                for (i6 = i3; i6 < 0; i6++) {
                    arrayList.add(new ba(i, i2, i6, null));
                }
                for (i6 = bqVar; i6 <= i5; i6++) {
                    arrayList.add(new ba(i, i2, i6, null));
                }
                i2++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final ba m21615a(bg bgVar) {
        return mo5149a(this.f17709g.m21643a(bgVar));
    }
}
