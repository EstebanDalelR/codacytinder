package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;
import rx.internal.subscriptions.SequentialSubscription;

public final class SchedulePeriodicHelper {
    /* renamed from: a */
    public static final long f60625a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    public interface NowNanoSupplier {
        long nowNanos();
    }

    /* renamed from: a */
    public static Subscription m69908a(a$a a_a, Action0 action0, long j, long j2, TimeUnit timeUnit, NowNanoSupplier nowNanoSupplier) {
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        final long toNanos = timeUnit2.toNanos(j2);
        final long nowNanos = nowNanoSupplier != null ? nowNanoSupplier.nowNanos() : TimeUnit.MILLISECONDS.toNanos(a_a.mo14759a());
        long toNanos2 = nowNanos + timeUnit2.toNanos(j3);
        Object sequentialSubscription = new SequentialSubscription();
        SequentialSubscription sequentialSubscription2 = new SequentialSubscription(sequentialSubscription);
        final long j4 = toNanos2;
        final Action0 action02 = action0;
        final SequentialSubscription sequentialSubscription3 = sequentialSubscription2;
        final NowNanoSupplier nowNanoSupplier2 = nowNanoSupplier;
        SequentialSubscription sequentialSubscription4 = sequentialSubscription2;
        C198411 c198411 = r3;
        final a$a a_a2 = a_a;
        C198411 c1984112 = new Action0() {
            /* renamed from: a */
            long f62092a;
            /* renamed from: b */
            long f62093b = nowNanos;
            /* renamed from: c */
            long f62094c = j4;

            public void call() {
                action02.call();
                if (!sequentialSubscription3.isUnsubscribed()) {
                    long j;
                    long j2;
                    long nowNanos = nowNanoSupplier2 != null ? nowNanoSupplier2.nowNanos() : TimeUnit.MILLISECONDS.toNanos(a_a2.mo14759a());
                    if (nowNanos + SchedulePeriodicHelper.f60625a >= this.f62093b) {
                        if (nowNanos < (this.f62093b + toNanos) + SchedulePeriodicHelper.f60625a) {
                            j = this.f62094c;
                            long j3 = this.f62092a + 1;
                            this.f62092a = j3;
                            j2 = j + (j3 * toNanos);
                            this.f62093b = nowNanos;
                            sequentialSubscription3.m70620b(a_a2.mo14741a(this, j2 - nowNanos, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j4 = nowNanos + toNanos;
                    j = toNanos;
                    long j5 = this.f62092a + 1;
                    this.f62092a = j5;
                    this.f62094c = j4 - (j * j5);
                    j2 = j4;
                    this.f62093b = nowNanos;
                    sequentialSubscription3.m70620b(a_a2.mo14741a(this, j2 - nowNanos, TimeUnit.NANOSECONDS));
                }
            }
        };
        sequentialSubscription.m70620b(a_a.mo14741a(c198411, j3, timeUnit2));
        return sequentialSubscription4;
    }
}
