package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.operators.a */
public final class C19419a {
    /* renamed from: a */
    public static long m69899a(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? Format.OFFSET_SAMPLE_RELATIVE : j3;
    }

    /* renamed from: a */
    public static long m69900a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, C19419a.m69899a(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m69902b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Format.OFFSET_SAMPLE_RELATIVE) {
                return Format.OFFSET_SAMPLE_RELATIVE;
            }
            j2 = j3 - j;
            if (j2 < 0) {
                j = new StringBuilder();
                j.append("More produced than requested: ");
                j.append(j2);
                throw new IllegalStateException(j.toString());
            }
        } while (!atomicLong.compareAndSet(j3, j2));
        return j2;
    }

    /* renamed from: a */
    public static boolean m69901a(long j) {
        if (j >= 0) {
            return j != 0 ? 1 : 0;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
