package com.google.android.exoplayer2;

import android.support.annotation.Nullable;
import android.util.Pair;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.q */
public abstract class C2165q {
    /* renamed from: a */
    public static final C2165q f6219a = new C36701();

    /* renamed from: com.google.android.exoplayer2.q$a */
    public static final class C2163a {
        /* renamed from: a */
        public Object f6203a;
        /* renamed from: b */
        public Object f6204b;
        /* renamed from: c */
        public int f6205c;
        /* renamed from: d */
        public long f6206d;
        /* renamed from: e */
        private long f6207e;
        /* renamed from: f */
        private AdPlaybackState f6208f;

        /* renamed from: a */
        public C2163a m7774a(Object obj, Object obj2, int i, long j, long j2) {
            return m7775a(obj, obj2, i, j, j2, AdPlaybackState.f6284a);
        }

        /* renamed from: a */
        public C2163a m7775a(Object obj, Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState) {
            this.f6203a = obj;
            this.f6204b = obj2;
            this.f6205c = i;
            this.f6206d = j;
            this.f6207e = j2;
            this.f6208f = adPlaybackState;
            return this;
        }

        /* renamed from: a */
        public long m7772a() {
            return this.f6206d;
        }

        /* renamed from: b */
        public long m7778b() {
            return C2005C.m7215a(this.f6207e);
        }

        /* renamed from: c */
        public long m7780c() {
            return this.f6207e;
        }

        /* renamed from: d */
        public int m7783d() {
            return this.f6208f.f6285b;
        }

        /* renamed from: a */
        public long m7773a(int i) {
            return this.f6208f.f6286c[i];
        }

        /* renamed from: b */
        public int m7776b(int i) {
            return this.f6208f.f6287d[i].m7853a();
        }

        /* renamed from: a */
        public int m7770a(int i, int i2) {
            return this.f6208f.f6287d[i].m7854a(i2);
        }

        /* renamed from: c */
        public boolean m7782c(int i) {
            return this.f6208f.f6287d[i].m7856b() ^ 1;
        }

        /* renamed from: a */
        public int m7771a(long j) {
            return this.f6208f.m7857a(j);
        }

        /* renamed from: b */
        public int m7777b(long j) {
            return this.f6208f.m7859b(j);
        }

        /* renamed from: d */
        public int m7784d(int i) {
            return this.f6208f.f6287d[i].f6280a;
        }

        /* renamed from: b */
        public boolean m7779b(int i, int i2) {
            i = this.f6208f.f6287d[i];
            return (i.f6280a == -1 || i.f6282c[i2] == 0) ? false : true;
        }

        /* renamed from: c */
        public long m7781c(int i, int i2) {
            i = this.f6208f.f6287d[i];
            return i.f6280a != -1 ? i.f6283d[i2] : -9223372036854775807L;
        }

        /* renamed from: e */
        public long m7785e() {
            return this.f6208f.f6288e;
        }
    }

    /* renamed from: com.google.android.exoplayer2.q$b */
    public static final class C2164b {
        @Nullable
        /* renamed from: a */
        public Object f6209a;
        /* renamed from: b */
        public long f6210b;
        /* renamed from: c */
        public long f6211c;
        /* renamed from: d */
        public boolean f6212d;
        /* renamed from: e */
        public boolean f6213e;
        /* renamed from: f */
        public int f6214f;
        /* renamed from: g */
        public int f6215g;
        /* renamed from: h */
        public long f6216h;
        /* renamed from: i */
        public long f6217i;
        /* renamed from: j */
        public long f6218j;

        /* renamed from: a */
        public C2164b m7787a(@Nullable Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.f6209a = obj;
            this.f6210b = j;
            this.f6211c = j2;
            this.f6212d = z;
            this.f6213e = z2;
            this.f6216h = j3;
            this.f6217i = j4;
            this.f6214f = i;
            this.f6215g = i2;
            this.f6218j = j5;
            return this;
        }

        /* renamed from: a */
        public long m7786a() {
            return C2005C.m7215a(this.f6216h);
        }

        /* renamed from: b */
        public long m7788b() {
            return this.f6216h;
        }

        /* renamed from: c */
        public long m7789c() {
            return C2005C.m7215a(this.f6217i);
        }

        /* renamed from: d */
        public long m7790d() {
            return this.f6218j;
        }
    }

    /* renamed from: com.google.android.exoplayer2.q$1 */
    static class C36701 extends C2165q {
        /* renamed from: a */
        public int mo2315a(Object obj) {
            return -1;
        }

        /* renamed from: b */
        public int mo2318b() {
            return 0;
        }

        /* renamed from: c */
        public int mo2319c() {
            return 0;
        }

        C36701() {
        }

        /* renamed from: a */
        public C2164b mo2317a(int i, C2164b c2164b, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        public C2163a mo2316a(int i, C2163a c2163a, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public abstract int mo2315a(Object obj);

    /* renamed from: a */
    public abstract C2163a mo2316a(int i, C2163a c2163a, boolean z);

    /* renamed from: a */
    public abstract C2164b mo2317a(int i, C2164b c2164b, boolean z, long j);

    /* renamed from: b */
    public abstract int mo2318b();

    /* renamed from: c */
    public abstract int mo2319c();

    /* renamed from: a */
    public final boolean m7802a() {
        return mo2318b() == 0;
    }

    /* renamed from: a */
    public int mo2334a(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                return i == mo2335a(z) ? -1 : i + 1;
            case 1:
                return i;
            case 2:
                if (i == mo2335a(z)) {
                    i = mo2337b(z);
                } else {
                    i++;
                }
                return i;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public int mo2336b(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                return i == mo2337b(z) ? -1 : i - 1;
            case 1:
                return i;
            case 2:
                if (i == mo2337b(z)) {
                    i = mo2335a(z);
                } else {
                    i--;
                }
                return i;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public int mo2335a(boolean z) {
        return m7802a() ? true : mo2318b() - 1;
    }

    /* renamed from: b */
    public int mo2337b(boolean z) {
        return m7802a() ? true : false;
    }

    /* renamed from: a */
    public final C2164b m7799a(int i, C2164b c2164b) {
        return m7800a(i, c2164b, false);
    }

    /* renamed from: a */
    public final C2164b m7800a(int i, C2164b c2164b, boolean z) {
        return mo2317a(i, c2164b, z, 0);
    }

    /* renamed from: a */
    public final int m7792a(int i, C2163a c2163a, C2164b c2164b, int i2, boolean z) {
        int i3 = m7797a(i, c2163a).f6205c;
        if (m7799a(i3, c2164b).f6215g != i) {
            return i + 1;
        }
        i = mo2334a(i3, i2, z);
        if (i == -1) {
            return -1;
        }
        return m7799a(i, c2164b).f6214f;
    }

    /* renamed from: b */
    public final boolean m7806b(int i, C2163a c2163a, C2164b c2164b, int i2, boolean z) {
        return m7792a(i, c2163a, c2164b, i2, z) == -1;
    }

    /* renamed from: a */
    public final Pair<Integer, Long> m7795a(C2164b c2164b, C2163a c2163a, int i, long j) {
        return m7796a(c2164b, c2163a, i, j, 0);
    }

    /* renamed from: a */
    public final Pair<Integer, Long> m7796a(C2164b c2164b, C2163a c2163a, int i, long j, long j2) {
        C2289a.m8308a(i, 0, mo2318b());
        mo2317a(i, c2164b, false, j2);
        if (j == -9223372036854775807L) {
            j = c2164b.m7788b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        i = c2164b.f6214f;
        long d = c2164b.m7790d() + j;
        j = m7797a(i, c2163a).m7772a();
        while (j != -9223372036854775807L && d >= j && i < c2164b.f6215g) {
            long j3 = d - j;
            i++;
            j = m7797a(i, c2163a).m7772a();
            d = j3;
        }
        return Pair.create(Integer.valueOf(i), Long.valueOf(d));
    }

    /* renamed from: a */
    public final C2163a m7797a(int i, C2163a c2163a) {
        return mo2316a(i, c2163a, false);
    }
}
