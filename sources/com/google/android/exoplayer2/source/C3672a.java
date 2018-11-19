package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.C2165q.C2164b;

/* renamed from: com.google.android.exoplayer2.source.a */
abstract class C3672a extends C2165q {
    /* renamed from: b */
    private final int f11358b;
    /* renamed from: c */
    private final ShuffleOrder f11359c;
    /* renamed from: d */
    private final boolean f11360d;

    /* renamed from: a */
    protected abstract int mo3501a(int i);

    /* renamed from: b */
    protected abstract int mo3502b(int i);

    /* renamed from: b */
    protected abstract int mo3503b(Object obj);

    /* renamed from: c */
    protected abstract C2165q mo3504c(int i);

    /* renamed from: d */
    protected abstract int mo3505d(int i);

    /* renamed from: e */
    protected abstract int mo3506e(int i);

    /* renamed from: f */
    protected abstract Object mo3507f(int i);

    public C3672a(boolean z, ShuffleOrder shuffleOrder) {
        this.f11360d = z;
        this.f11359c = shuffleOrder;
        this.f11358b = shuffleOrder.getLength();
    }

    /* renamed from: a */
    public int mo2334a(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f11360d) {
            if (i2 == true) {
                i2 = 2;
            }
            z = false;
        }
        int b = mo3502b(i);
        int e = mo3506e(b);
        C2165q c = mo3504c(b);
        i -= e;
        if (i2 != 2) {
            i3 = i2;
        }
        i = c.mo2334a(i, i3, z);
        if (i != -1) {
            return e + i;
        }
        i = m13892a(b, z);
        while (i != -1 && mo3504c(i).m7802a()) {
            i = m13892a(i, z);
        }
        if (i != -1) {
            return mo3506e(i) + mo3504c(i).mo2337b(z);
        }
        if (i2 == 2) {
            return mo2337b(z);
        }
        return -1;
    }

    /* renamed from: b */
    public int mo2336b(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f11360d) {
            if (i2 == true) {
                i2 = 2;
            }
            z = false;
        }
        int b = mo3502b(i);
        int e = mo3506e(b);
        C2165q c = mo3504c(b);
        i -= e;
        if (i2 != 2) {
            i3 = i2;
        }
        i = c.mo2336b(i, i3, z);
        if (i != -1) {
            return e + i;
        }
        i = m13893b(b, z);
        while (i != -1 && mo3504c(i).m7802a()) {
            i = m13893b(i, z);
        }
        if (i != -1) {
            return mo3506e(i) + mo3504c(i).mo2335a(z);
        }
        if (i2 == 2) {
            return mo2335a(z);
        }
        return -1;
    }

    /* renamed from: a */
    public int mo2335a(boolean z) {
        if (this.f11358b == 0) {
            return -1;
        }
        if (this.f11360d) {
            z = false;
        }
        int lastIndex = z ? this.f11359c.getLastIndex() : this.f11358b - 1;
        while (mo3504c(lastIndex).m7802a()) {
            lastIndex = m13893b(lastIndex, z);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return mo3506e(lastIndex) + mo3504c(lastIndex).mo2335a(z);
    }

    /* renamed from: b */
    public int mo2337b(boolean z) {
        if (this.f11358b == 0) {
            return -1;
        }
        int i = 0;
        if (this.f11360d) {
            z = false;
        }
        if (z) {
            i = this.f11359c.getFirstIndex();
        }
        while (mo3504c(i).m7802a()) {
            i = m13892a(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo3506e(i) + mo3504c(i).mo2337b(z);
    }

    /* renamed from: a */
    public final C2164b mo2317a(int i, C2164b c2164b, boolean z, long j) {
        int b = mo3502b(i);
        int e = mo3506e(b);
        int d = mo3505d(b);
        mo3504c(b).mo2317a(i - e, c2164b, z, j);
        c2164b.f6214f += d;
        c2164b.f6215g += d;
        return c2164b;
    }

    /* renamed from: a */
    public final C2163a mo2316a(int i, C2163a c2163a, boolean z) {
        int a = mo3501a(i);
        int e = mo3506e(a);
        mo3504c(a).mo2316a(i - mo3505d(a), c2163a, z);
        c2163a.f6205c += e;
        if (z) {
            c2163a.f6204b = Pair.create(mo3507f(a), c2163a.f6204b);
        }
        return c2163a;
    }

    /* renamed from: a */
    public final int mo2315a(Object obj) {
        int i = -1;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        obj = pair.second;
        int b = mo3503b(obj2);
        if (b == -1) {
            return -1;
        }
        obj = mo3504c(b).mo2315a(obj);
        if (obj != -1) {
            i = mo3505d(b) + obj;
        }
        return i;
    }

    /* renamed from: a */
    private int m13892a(int i, boolean z) {
        if (z) {
            return this.f11359c.getNextIndex(i);
        }
        return i < this.f11358b + -1 ? i + 1 : -1;
    }

    /* renamed from: b */
    private int m13893b(int i, boolean z) {
        if (z) {
            return this.f11359c.getPreviousIndex(i);
        }
        return i > 0 ? i - 1 : -1;
    }
}
