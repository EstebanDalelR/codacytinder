package com.google.android.m4b.maps.bw;

/* renamed from: com.google.android.m4b.maps.bw.a */
public final class C4967a implements Comparable<C4967a> {
    /* renamed from: a */
    public static final C4967a f18341a = new C4967a(-1);
    /* renamed from: c */
    private static C4967a f18342c = C4967a.m22228a(new int[0]);
    /* renamed from: b */
    private final int f18343b;

    public final /* synthetic */ int compareTo(Object obj) {
        return m22230a((C4967a) obj);
    }

    /* renamed from: a */
    public static C4967a m22228a(int... iArr) {
        return new C4967a(C4967a.m22229b(iArr));
    }

    /* renamed from: b */
    private static int m22229b(int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i |= 1 << i2;
        }
        return i;
    }

    private C4967a(int i) {
        this.f18343b = i;
    }

    /* renamed from: a */
    public static C4967a m22227a(C4967a c4967a, C4967a c4967a2) {
        return new C4967a(c4967a.f18343b & (c4967a2.f18343b ^ -1));
    }

    /* renamed from: a */
    public final boolean m22231a(int i) {
        return ((1 << i) & this.f18343b) != 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        Object obj = 1;
        for (int i = 0; i <= 31; i++) {
            if (m22231a(i)) {
                if (obj == null) {
                    stringBuilder.append(", ");
                } else {
                    obj = null;
                }
                stringBuilder.append(i);
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C4967a) && ((C4967a) obj).f18343b == this.f18343b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18343b;
    }

    /* renamed from: a */
    public final int m22230a(C4967a c4967a) {
        return this.f18343b - c4967a.f18343b;
    }
}
