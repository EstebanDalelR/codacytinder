package java8.util;

import com.google.android.exoplayer2.Format;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;

public class LongSummaryStatistics implements IntConsumer, LongConsumer {
    /* renamed from: a */
    private long f54276a;
    /* renamed from: b */
    private long f54277b;
    /* renamed from: c */
    private long f54278c = Format.OFFSET_SAMPLE_RELATIVE;
    /* renamed from: d */
    private long f54279d = Long.MIN_VALUE;

    public void accept(int i) {
        accept((long) i);
    }

    public void accept(long j) {
        this.f54276a++;
        this.f54277b += j;
        this.f54278c = Math.min(this.f54278c, j);
        this.f54279d = Math.max(this.f54279d, j);
    }

    /* renamed from: a */
    public void m63857a(LongSummaryStatistics longSummaryStatistics) {
        this.f54276a += longSummaryStatistics.f54276a;
        this.f54277b += longSummaryStatistics.f54277b;
        this.f54278c = Math.min(this.f54278c, longSummaryStatistics.f54278c);
        this.f54279d = Math.max(this.f54279d, longSummaryStatistics.f54279d);
    }

    /* renamed from: a */
    public final long m63856a() {
        return this.f54276a;
    }

    /* renamed from: b */
    public final long m63858b() {
        return this.f54277b;
    }

    /* renamed from: c */
    public final long m63859c() {
        return this.f54278c;
    }

    /* renamed from: d */
    public final long m63860d() {
        return this.f54279d;
    }

    /* renamed from: e */
    public final double m63861e() {
        return m63856a() > 0 ? ((double) m63858b()) / ((double) m63856a()) : 0.0d;
    }

    public String toString() {
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", new Object[]{getClass().getSimpleName(), Long.valueOf(m63856a()), Long.valueOf(m63858b()), Long.valueOf(m63859c()), Double.valueOf(m63861e()), Long.valueOf(m63860d())});
    }
}
