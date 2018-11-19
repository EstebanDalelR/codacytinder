package java8.util;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java8.util.function.IntConsumer;

public class IntSummaryStatistics implements IntConsumer {
    /* renamed from: a */
    private long f54226a;
    /* renamed from: b */
    private long f54227b;
    /* renamed from: c */
    private int f54228c = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    /* renamed from: d */
    private int f54229d = Integer.MIN_VALUE;

    public void accept(int i) {
        this.f54226a++;
        this.f54227b += (long) i;
        this.f54228c = Math.min(this.f54228c, i);
        this.f54229d = Math.max(this.f54229d, i);
    }

    /* renamed from: a */
    public void m63826a(IntSummaryStatistics intSummaryStatistics) {
        this.f54226a += intSummaryStatistics.f54226a;
        this.f54227b += intSummaryStatistics.f54227b;
        this.f54228c = Math.min(this.f54228c, intSummaryStatistics.f54228c);
        this.f54229d = Math.max(this.f54229d, intSummaryStatistics.f54229d);
    }

    /* renamed from: a */
    public final long m63825a() {
        return this.f54226a;
    }

    /* renamed from: b */
    public final long m63827b() {
        return this.f54227b;
    }

    /* renamed from: c */
    public final int m63828c() {
        return this.f54228c;
    }

    /* renamed from: d */
    public final int m63829d() {
        return this.f54229d;
    }

    /* renamed from: e */
    public final double m63830e() {
        return m63825a() > 0 ? ((double) m63827b()) / ((double) m63825a()) : 0.0d;
    }

    public String toString() {
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", new Object[]{getClass().getSimpleName(), Long.valueOf(m63825a()), Long.valueOf(m63827b()), Integer.valueOf(m63828c()), Double.valueOf(m63830e()), Integer.valueOf(m63829d())});
    }
}
