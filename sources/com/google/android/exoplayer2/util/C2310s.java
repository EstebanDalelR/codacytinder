package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.Format;

/* renamed from: com.google.android.exoplayer2.util.s */
public final class C2310s {
    /* renamed from: a */
    private long f6952a;
    /* renamed from: b */
    private long f6953b;
    /* renamed from: c */
    private volatile long f6954c = -9223372036854775807L;

    public C2310s(long j) {
        m8439a(j);
    }

    /* renamed from: a */
    public synchronized void m8439a(long j) {
        C2289a.m8313b(this.f6954c == -9223372036854775807L);
        this.f6952a = j;
    }

    /* renamed from: a */
    public long m8438a() {
        return this.f6952a;
    }

    /* renamed from: b */
    public long m8440b() {
        if (this.f6954c != -9223372036854775807L) {
            return this.f6954c;
        }
        return this.f6952a != Format.OFFSET_SAMPLE_RELATIVE ? this.f6952a : -9223372036854775807L;
    }

    /* renamed from: c */
    public long m8442c() {
        if (this.f6952a == Format.OFFSET_SAMPLE_RELATIVE) {
            return 0;
        }
        return this.f6954c == -9223372036854775807L ? -9223372036854775807L : this.f6953b;
    }

    /* renamed from: d */
    public void m8444d() {
        this.f6954c = -9223372036854775807L;
    }

    /* renamed from: b */
    public long m8441b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f6954c != -9223372036854775807L) {
            long e = C2310s.m8437e(this.f6954c);
            long j2 = (e + 4294967296L) / 8589934592L;
            long j3 = j + ((j2 - 1) * 8589934592L);
            long j4 = j + (j2 * 8589934592L);
            j = Math.abs(j3 - e) < Math.abs(j4 - e) ? j3 : j4;
        }
        return m8443c(C2310s.m8436d(j));
    }

    /* renamed from: c */
    public long m8443c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f6954c != -9223372036854775807L) {
            this.f6954c = j;
        } else {
            if (this.f6952a != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f6953b = this.f6952a - j;
            }
            synchronized (this) {
                this.f6954c = j;
                notifyAll();
            }
        }
        return j + this.f6953b;
    }

    /* renamed from: e */
    public synchronized void m8445e() throws InterruptedException {
        while (this.f6954c == -9223372036854775807L) {
            wait();
        }
    }

    /* renamed from: d */
    public static long m8436d(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: e */
    public static long m8437e(long j) {
        return (j * 90000) / 1000000;
    }
}
