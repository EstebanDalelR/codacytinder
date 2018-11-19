package io.reactivex.internal.util;

import com.google.android.exoplayer2.Format;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.reactivex.internal.util.a */
public final class C15735a {
    /* renamed from: a */
    public static long m58966a(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? Format.OFFSET_SAMPLE_RELATIVE : j3;
    }

    /* renamed from: a */
    public static long m58967a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Format.OFFSET_SAMPLE_RELATIVE) {
                return Format.OFFSET_SAMPLE_RELATIVE;
            }
        } while (!atomicLong.compareAndSet(j2, C15735a.m58966a(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m58968b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Format.OFFSET_SAMPLE_RELATIVE) {
                return Format.OFFSET_SAMPLE_RELATIVE;
            }
        } while (!atomicLong.compareAndSet(j2, C15735a.m58966a(j2, j)));
        return j2;
    }

    /* renamed from: c */
    public static long m58969c(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Format.OFFSET_SAMPLE_RELATIVE) {
                return Format.OFFSET_SAMPLE_RELATIVE;
            }
            j2 = j3 - j;
            if (j2 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("More produced than requested: ");
                stringBuilder.append(j2);
                C2667a.a(new IllegalStateException(stringBuilder.toString()));
                j2 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j2));
        return j2;
    }

    /* renamed from: d */
    public static long m58970d(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j3 == Format.OFFSET_SAMPLE_RELATIVE) {
                return Format.OFFSET_SAMPLE_RELATIVE;
            }
            j2 = j3 - j;
            if (j2 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("More produced than requested: ");
                stringBuilder.append(j2);
                C2667a.a(new IllegalStateException(stringBuilder.toString()));
                j2 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j2));
        return j2;
    }
}
