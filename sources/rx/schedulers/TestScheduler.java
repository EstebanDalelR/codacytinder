package rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import rx.C2671a;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;
import rx.internal.schedulers.SchedulePeriodicHelper;
import rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier;
import rx.p500e.C19407e;
import rx.p500e.C19572a;

public class TestScheduler extends C2671a {
    /* renamed from: b */
    static long f61311b;
    /* renamed from: a */
    final Queue<C19452c> f61312a = new PriorityQueue(11, new C19451a());
    /* renamed from: c */
    long f61313c;

    /* renamed from: rx.schedulers.TestScheduler$a */
    static final class C19451a implements Comparator<C19452c> {
        C19451a() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m69992a((C19452c) obj, (C19452c) obj2);
        }

        /* renamed from: a */
        public int m69992a(C19452c c19452c, C19452c c19452c2) {
            int i = 0;
            if (c19452c.f60684a == c19452c2.f60684a) {
                if (c19452c.f60687d < c19452c2.f60687d) {
                    i = -1;
                } else if (c19452c.f60687d > c19452c2.f60687d) {
                    i = 1;
                }
                return i;
            }
            if (c19452c.f60684a < c19452c2.f60684a) {
                i = -1;
            } else if (c19452c.f60684a > c19452c2.f60684a) {
                i = 1;
            }
            return i;
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$c */
    static final class C19452c {
        /* renamed from: a */
        final long f60684a;
        /* renamed from: b */
        final Action0 f60685b;
        /* renamed from: c */
        final a$a f60686c;
        /* renamed from: d */
        private final long f60687d;

        C19452c(a$a a_a, long j, Action0 action0) {
            long j2 = TestScheduler.f61311b;
            TestScheduler.f61311b = j2 + 1;
            this.f60687d = j2;
            this.f60684a = j;
            this.f60685b = action0;
            this.f60686c = a_a;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", new Object[]{Long.valueOf(this.f60684a), this.f60685b.toString()});
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$b */
    final class C19784b extends a$a implements NowNanoSupplier {
        /* renamed from: a */
        final /* synthetic */ TestScheduler f61864a;
        /* renamed from: b */
        private final C19572a f61865b = new C19572a();

        C19784b(TestScheduler testScheduler) {
            this.f61864a = testScheduler;
        }

        public void unsubscribe() {
            this.f61865b.unsubscribe();
        }

        public boolean isUnsubscribed() {
            return this.f61865b.isUnsubscribed();
        }

        /* renamed from: a */
        public Subscription mo14741a(Action0 action0, long j, TimeUnit timeUnit) {
            final C19452c c19452c = new C19452c(this, this.f61864a.f61313c + timeUnit.toNanos(j), action0);
            this.f61864a.f61312a.add(c19452c);
            return C19407e.m69854a(new Action0(this) {
                /* renamed from: b */
                final /* synthetic */ C19784b f62140b;

                public void call() {
                    this.f62140b.f61864a.f61312a.remove(c19452c);
                }
            });
        }

        /* renamed from: a */
        public Subscription mo14740a(Action0 action0) {
            final C19452c c19452c = new C19452c(this, 0, action0);
            this.f61864a.f61312a.add(c19452c);
            return C19407e.m69854a(new Action0(this) {
                /* renamed from: b */
                final /* synthetic */ C19784b f62142b;

                public void call() {
                    this.f62142b.f61864a.f61312a.remove(c19452c);
                }
            });
        }

        /* renamed from: a */
        public Subscription mo14760a(Action0 action0, long j, long j2, TimeUnit timeUnit) {
            return SchedulePeriodicHelper.m69908a(this, action0, j, j2, timeUnit, this);
        }

        /* renamed from: a */
        public long mo14759a() {
            return this.f61864a.now();
        }

        public long nowNanos() {
            return this.f61864a.f61313c;
        }
    }

    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.f61313c);
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f61313c + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        m70651a(timeUnit.toNanos(j));
    }

    public void triggerActions() {
        m70651a(this.f61313c);
    }

    /* renamed from: a */
    private void m70651a(long j) {
        while (!this.f61312a.isEmpty()) {
            C19452c c19452c = (C19452c) this.f61312a.peek();
            if (c19452c.f60684a > j) {
                break;
            }
            this.f61313c = c19452c.f60684a == 0 ? this.f61313c : c19452c.f60684a;
            this.f61312a.remove();
            if (!c19452c.f60686c.isUnsubscribed()) {
                c19452c.f60685b.call();
            }
        }
        this.f61313c = j;
    }

    public a$a createWorker() {
        return new C19784b(this);
    }
}
