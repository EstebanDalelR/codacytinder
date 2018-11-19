package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.support.annotation.CheckResult;
import com.google.android.exoplayer2.util.C2289a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public final class AdPlaybackState {
    /* renamed from: a */
    public static final AdPlaybackState f6284a = new AdPlaybackState(new long[0]);
    /* renamed from: b */
    public final int f6285b;
    /* renamed from: c */
    public final long[] f6286c;
    /* renamed from: d */
    public final C2183a[] f6287d;
    /* renamed from: e */
    public final long f6288e;
    /* renamed from: f */
    public final long f6289f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    /* renamed from: com.google.android.exoplayer2.source.ads.AdPlaybackState$a */
    public static final class C2183a {
        /* renamed from: a */
        public final int f6280a;
        /* renamed from: b */
        public final Uri[] f6281b;
        /* renamed from: c */
        public final int[] f6282c;
        /* renamed from: d */
        public final long[] f6283d;

        public C2183a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private C2183a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C2289a.m8311a(iArr.length == uriArr.length);
            this.f6280a = i;
            this.f6282c = iArr;
            this.f6281b = uriArr;
            this.f6283d = jArr;
        }

        /* renamed from: a */
        public int m7853a() {
            return m7854a(-1);
        }

        /* renamed from: a */
        public int m7854a(int i) {
            i++;
            while (i < this.f6282c.length && this.f6282c[i] != 0) {
                if (this.f6282c[i] == 1) {
                    break;
                }
                i++;
            }
            return i;
        }

        /* renamed from: b */
        public boolean m7856b() {
            if (this.f6280a != -1) {
                if (m7853a() >= this.f6280a) {
                    return false;
                }
            }
            return true;
        }

        @CheckResult
        /* renamed from: a */
        public C2183a m7855a(long[] jArr) {
            boolean z;
            if (this.f6280a != -1) {
                if (jArr.length > this.f6281b.length) {
                    z = false;
                    C2289a.m8311a(z);
                    if (jArr.length < this.f6281b.length) {
                        jArr = C2183a.m7852a(jArr, this.f6281b.length);
                    }
                    return new C2183a(this.f6280a, this.f6282c, this.f6281b, jArr);
                }
            }
            z = true;
            C2289a.m8311a(z);
            if (jArr.length < this.f6281b.length) {
                jArr = C2183a.m7852a(jArr, this.f6281b.length);
            }
            return new C2183a(this.f6280a, this.f6282c, this.f6281b, jArr);
        }

        @CheckResult
        /* renamed from: a */
        private static long[] m7852a(long[] jArr, int i) {
            int length = jArr.length;
            i = Math.max(i, length);
            jArr = Arrays.copyOf(jArr, i);
            Arrays.fill(jArr, length, i, -9223372036854775807L);
            return jArr;
        }
    }

    public AdPlaybackState(long... jArr) {
        int length = jArr.length;
        this.f6285b = length;
        this.f6286c = Arrays.copyOf(jArr, length);
        this.f6287d = new C2183a[length];
        for (jArr = null; jArr < length; jArr++) {
            this.f6287d[jArr] = new C2183a();
        }
        this.f6288e = 0;
        this.f6289f = -9223372036854775807L;
    }

    private AdPlaybackState(long[] jArr, C2183a[] c2183aArr, long j, long j2) {
        this.f6285b = c2183aArr.length;
        this.f6286c = jArr;
        this.f6287d = c2183aArr;
        this.f6288e = j;
        this.f6289f = j2;
    }

    /* renamed from: a */
    public int m7857a(long j) {
        int length = this.f6286c.length - 1;
        while (length >= 0 && (this.f6286c[length] == Long.MIN_VALUE || this.f6286c[length] > j)) {
            length--;
        }
        return (length < 0 || this.f6287d[length].m7856b() == null) ? -1 : length;
    }

    /* renamed from: b */
    public int m7859b(long j) {
        int i = 0;
        while (i < this.f6286c.length && this.f6286c[i] != Long.MIN_VALUE && (j >= this.f6286c[i] || !this.f6287d[i].m7856b())) {
            i++;
        }
        return i < this.f6286c.length ? i : -1;
    }

    @CheckResult
    /* renamed from: a */
    public AdPlaybackState m7858a(long[][] jArr) {
        C2183a[] c2183aArr = (C2183a[]) Arrays.copyOf(this.f6287d, this.f6287d.length);
        for (int i = 0; i < this.f6285b; i++) {
            c2183aArr[i] = c2183aArr[i].m7855a(jArr[i]);
        }
        return new AdPlaybackState(this.f6286c, c2183aArr, this.f6288e, this.f6289f);
    }
}
