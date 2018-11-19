package com.google.android.m4b.maps.cu;

/* renamed from: com.google.android.m4b.maps.cu.d */
public final class C5303d implements Cloneable {
    /* renamed from: a */
    private static final C5304e f19687a = new C5304e();
    /* renamed from: b */
    private boolean f19688b;
    /* renamed from: c */
    private int[] f19689c;
    /* renamed from: d */
    private C5304e[] f19690d;
    /* renamed from: e */
    private int f19691e;

    /* renamed from: b */
    private static int m23522b(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        return m23525b();
    }

    C5303d() {
        this(10);
    }

    private C5303d(int i) {
        this.f19688b = false;
        i = C5303d.m23522b(i * 4) / 4;
        this.f19689c = new int[i];
        this.f19690d = new C5304e[i];
        this.f19691e = 0;
    }

    /* renamed from: a */
    final int m23523a() {
        return this.f19691e;
    }

    /* renamed from: a */
    final C5304e m23524a(int i) {
        return this.f19690d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5303d)) {
            return false;
        }
        C5303d c5303d = (C5303d) obj;
        if (this.f19691e != c5303d.f19691e) {
            return false;
        }
        Object obj2;
        int[] iArr = this.f19689c;
        int[] iArr2 = c5303d.f19689c;
        int i = this.f19691e;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            C5304e[] c5304eArr = this.f19690d;
            obj = c5303d.f19690d;
            int i3 = this.f19691e;
            for (i = 0; i < i3; i++) {
                if (!c5304eArr[i].equals(obj[i])) {
                    obj = null;
                    break;
                }
            }
            obj = true;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f19691e; i2++) {
            i = (((i * 31) + this.f19689c[i2]) * 31) + this.f19690d[i2].hashCode();
        }
        return i;
    }

    /* renamed from: b */
    public final C5303d m23525b() {
        int i = this.f19691e;
        C5303d c5303d = new C5303d(i);
        int i2 = 0;
        System.arraycopy(this.f19689c, 0, c5303d.f19689c, 0, i);
        while (i2 < i) {
            if (this.f19690d[i2] != null) {
                c5303d.f19690d[i2] = this.f19690d[i2].m23529b();
            }
            i2++;
        }
        c5303d.f19691e = i;
        return c5303d;
    }
}
