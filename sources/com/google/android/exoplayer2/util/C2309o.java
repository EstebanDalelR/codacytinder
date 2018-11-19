package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.util.o */
public class C2309o {
    /* renamed from: a */
    private static final Comparator<C2308a> f6943a = new C23061();
    /* renamed from: b */
    private static final Comparator<C2308a> f6944b = new C23072();
    /* renamed from: c */
    private final int f6945c;
    /* renamed from: d */
    private final ArrayList<C2308a> f6946d = new ArrayList();
    /* renamed from: e */
    private final C2308a[] f6947e = new C2308a[5];
    /* renamed from: f */
    private int f6948f = -1;
    /* renamed from: g */
    private int f6949g;
    /* renamed from: h */
    private int f6950h;
    /* renamed from: i */
    private int f6951i;

    /* renamed from: com.google.android.exoplayer2.util.o$1 */
    static class C23061 implements Comparator<C2308a> {
        C23061() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m8430a((C2308a) obj, (C2308a) obj2);
        }

        /* renamed from: a */
        public int m8430a(C2308a c2308a, C2308a c2308a2) {
            return c2308a.f6940a - c2308a2.f6940a;
        }
    }

    /* renamed from: com.google.android.exoplayer2.util.o$2 */
    static class C23072 implements Comparator<C2308a> {
        C23072() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m8431a((C2308a) obj, (C2308a) obj2);
        }

        /* renamed from: a */
        public int m8431a(C2308a c2308a, C2308a c2308a2) {
            if (c2308a.f6942c < c2308a2.f6942c) {
                return -1;
            }
            return c2308a2.f6942c < c2308a.f6942c ? 1 : null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.util.o$a */
    private static class C2308a {
        /* renamed from: a */
        public int f6940a;
        /* renamed from: b */
        public int f6941b;
        /* renamed from: c */
        public float f6942c;

        private C2308a() {
        }
    }

    public C2309o(int i) {
        this.f6945c = i;
    }

    /* renamed from: a */
    public void m8435a(int i, float f) {
        int i2;
        C2308a c2308a;
        m8432a();
        if (this.f6951i > 0) {
            C2308a[] c2308aArr = this.f6947e;
            i2 = this.f6951i - 1;
            this.f6951i = i2;
            c2308a = c2308aArr[i2];
        } else {
            c2308a = new C2308a();
        }
        i2 = this.f6949g;
        this.f6949g = i2 + 1;
        c2308a.f6940a = i2;
        c2308a.f6941b = i;
        c2308a.f6942c = f;
        this.f6946d.add(c2308a);
        this.f6950h += i;
        while (this.f6950h > this.f6945c) {
            i = this.f6950h - this.f6945c;
            C2308a c2308a2 = (C2308a) this.f6946d.get(0);
            if (c2308a2.f6941b <= i) {
                this.f6950h -= c2308a2.f6941b;
                this.f6946d.remove(0);
                if (this.f6951i < 5) {
                    i = this.f6947e;
                    int i3 = this.f6951i;
                    this.f6951i = i3 + 1;
                    i[i3] = c2308a2;
                }
            } else {
                c2308a2.f6941b -= i;
                this.f6950h -= i;
            }
        }
    }

    /* renamed from: a */
    public float m8434a(float f) {
        m8433b();
        f *= (float) this.f6950h;
        int i = 0;
        for (int i2 = 0; i2 < this.f6946d.size(); i2++) {
            C2308a c2308a = (C2308a) this.f6946d.get(i2);
            i += c2308a.f6941b;
            if (((float) i) >= f) {
                return c2308a.f6942c;
            }
        }
        return this.f6946d.isEmpty() != null ? Float.NaN : ((C2308a) this.f6946d.get(this.f6946d.size() - 1)).f6942c;
    }

    /* renamed from: a */
    private void m8432a() {
        if (this.f6948f != 1) {
            Collections.sort(this.f6946d, f6943a);
            this.f6948f = 1;
        }
    }

    /* renamed from: b */
    private void m8433b() {
        if (this.f6948f != 0) {
            Collections.sort(this.f6946d, f6944b);
            this.f6948f = 0;
        }
    }
}
