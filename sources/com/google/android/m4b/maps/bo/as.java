package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.util.Arrays;

public final class as {
    /* renamed from: a */
    private static final int[] f17674a = new int[0];
    /* renamed from: b */
    private static as f17675b = new as(-1, 0, f17674a, new ar[0], ay.m21583a(), ax.m21580a(), ar.m21544a(), null);
    /* renamed from: c */
    private final int f17676c;
    /* renamed from: d */
    private final int f17677d;
    /* renamed from: e */
    private final int[] f17678e;
    /* renamed from: f */
    private final ar[] f17679f;
    /* renamed from: g */
    private final ay f17680g;
    /* renamed from: h */
    private final ax f17681h;
    /* renamed from: i */
    private final ar f17682i;
    /* renamed from: j */
    private final C4850n f17683j;

    /* renamed from: a */
    public static as m21554a(int i, DataInput dataInput, int i2) {
        int a;
        int[] iArr;
        ar[] arVarArr;
        ay a2;
        ax a3;
        ar a4;
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (ac.m21434a(readUnsignedByte, 1)) {
            a = bl.m21698a(dataInput);
            iArr = new int[a];
            for (int i3 = 0; i3 < a; i3++) {
                iArr[i3] = dataInput.readInt();
            }
        } else {
            iArr = null;
        }
        if (ac.m21434a(readUnsignedByte, 2)) {
            a = bl.m21698a(dataInput);
            arVarArr = new ar[a];
            for (int i4 = 0; i4 < a; i4++) {
                arVarArr[i4] = ar.m21545a(dataInput);
            }
        } else {
            arVarArr = null;
        }
        if (ac.m21434a(readUnsignedByte, 4)) {
            a2 = ay.m21584a(dataInput);
        } else {
            a2 = null;
        }
        if (ac.m21434a(readUnsignedByte, 8)) {
            a3 = ax.m21581a(dataInput, i2);
        } else {
            a3 = null;
        }
        if (ac.m21434a(readUnsignedByte, 16)) {
            a4 = ar.m21545a(dataInput);
        } else {
            a4 = null;
        }
        dataInput = (i2 != 11 || ac.m21434a(readUnsignedByte, 32) == 0) ? null : new C4850n(dataInput.readUTF(), dataInput.readUnsignedByte());
        return new as(i, readUnsignedByte, iArr, arVarArr, a2, a3, a4, dataInput);
    }

    /* renamed from: a */
    public static as m21553a() {
        return f17675b;
    }

    public as(int i, int i2, int[] iArr, ar[] arVarArr, ay ayVar, ax axVar, ar arVar, C4850n c4850n) {
        this.f17676c = i;
        this.f17677d = i2;
        this.f17678e = iArr;
        this.f17679f = arVarArr;
        this.f17680g = ayVar;
        this.f17681h = axVar;
        this.f17682i = arVar;
        this.f17683j = c4850n;
    }

    /* renamed from: b */
    public final int m21557b() {
        return this.f17679f == null ? 0 : this.f17679f.length;
    }

    /* renamed from: c */
    public final int m21559c() {
        return this.f17678e == null ? 0 : this.f17678e.length;
    }

    /* renamed from: a */
    public final int m21556a(int i) {
        return this.f17678e[i];
    }

    /* renamed from: d */
    public final boolean m21560d() {
        return ac.m21434a(this.f17677d, 2);
    }

    /* renamed from: e */
    public final boolean m21561e() {
        return ac.m21434a(this.f17677d, 4);
    }

    /* renamed from: f */
    public final boolean m21562f() {
        return ac.m21434a(this.f17677d, 8);
    }

    /* renamed from: g */
    public final boolean m21563g() {
        return ac.m21434a(this.f17677d, 16);
    }

    /* renamed from: h */
    public final boolean m21564h() {
        return ac.m21434a(this.f17677d, 32);
    }

    /* renamed from: b */
    public final ar m21558b(int i) {
        return this.f17679f[i];
    }

    /* renamed from: i */
    public final ay m21565i() {
        return this.f17680g;
    }

    /* renamed from: j */
    public final ax m21566j() {
        return this.f17681h;
    }

    /* renamed from: k */
    public final ar m21567k() {
        return this.f17682i;
    }

    /* renamed from: l */
    public final C4850n m21568l() {
        return this.f17683j;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((this.f17682i == null ? 0 : this.f17682i.hashCode()) + 31) * 31) + this.f17677d) * 31) + Arrays.hashCode(this.f17678e)) * 31) + this.f17676c) * 31) + Arrays.hashCode(this.f17679f)) * 31) + (this.f17681h == null ? 0 : this.f17681h.hashCode())) * 31;
        if (this.f17680g != null) {
            i = this.f17680g.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Style{id=");
        stringBuilder.append(this.f17676c);
        stringBuilder.append(", ");
        m21555a("fillColors", this.f17678e, stringBuilder);
        stringBuilder.append(", ");
        stringBuilder.append(", components=");
        stringBuilder.append(this.f17677d);
        stringBuilder.append(", strokes=");
        stringBuilder.append(this.f17679f == null ? null : Arrays.asList(this.f17679f));
        stringBuilder.append(", textStyle=");
        stringBuilder.append(this.f17680g);
        stringBuilder.append(", textBoxStyle=");
        stringBuilder.append(this.f17681h);
        stringBuilder.append(", arrowStyle=");
        stringBuilder.append(this.f17682i);
        stringBuilder.append(", icon=");
        stringBuilder.append(this.f17683j);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static void m21555a(String str, int[] iArr, StringBuilder stringBuilder) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (iArr == null) {
            stringBuilder.append(iArr);
            return;
        }
        stringBuilder.append("[");
        Object obj = 1;
        for (int i : iArr) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(",");
            }
            stringBuilder.append(Integer.toHexString(i));
        }
        stringBuilder.append("]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        as asVar = (as) obj;
        if (this.f17682i == null) {
            if (asVar.f17682i != null) {
                return false;
            }
        } else if (!this.f17682i.equals(asVar.f17682i)) {
            return false;
        }
        if (this.f17677d != asVar.f17677d || !Arrays.equals(this.f17678e, asVar.f17678e) || this.f17676c != asVar.f17676c || !Arrays.equals(this.f17679f, asVar.f17679f)) {
            return false;
        }
        if (this.f17681h == null) {
            if (asVar.f17681h != null) {
                return false;
            }
        } else if (!this.f17681h.equals(asVar.f17681h)) {
            return false;
        }
        if (this.f17680g == null) {
            if (asVar.f17680g != null) {
                return false;
            }
        } else if (this.f17680g.equals(asVar.f17680g) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final int m21569m() {
        int i;
        int i2 = 0;
        int length = this.f17678e == null ? 0 : this.f17678e.length * 4;
        if (this.f17679f != null) {
            i = 0;
            for (ar h : this.f17679f) {
                i += h.m21552h();
            }
        } else {
            i = 0;
        }
        ar arVar = this.f17682i;
        if (arVar != null) {
            i2 = arVar.m21552h();
        }
        return ((length + 60) + i) + i2;
    }
}
