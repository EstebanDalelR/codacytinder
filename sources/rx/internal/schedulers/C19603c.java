package rx.internal.schedulers;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.C2671a;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;
import rx.p498c.C19401c;
import rx.p500e.C19407e;
import rx.p500e.C19573b;
import rx.p500e.C19574c;

/* renamed from: rx.internal.schedulers.c */
public final class C19603c extends C2671a {
    /* renamed from: a */
    final Executor f61266a;

    /* renamed from: rx.internal.schedulers.c$a */
    static final class C19753a extends a$a implements Runnable {
        /* renamed from: a */
        final Executor f61806a;
        /* renamed from: b */
        final C19573b f61807b = new C19573b();
        /* renamed from: c */
        final ConcurrentLinkedQueue<ScheduledAction> f61808c = new ConcurrentLinkedQueue();
        /* renamed from: d */
        final AtomicInteger f61809d = new AtomicInteger();
        /* renamed from: e */
        final ScheduledExecutorService f61810e = C19604d.m70616a();

        public C19753a(Executor executor) {
            this.f61806a = executor;
        }

        /* renamed from: a */
        public Subscription mo14740a(Action0 action0) {
            if (isUnsubscribed()) {
                return C19407e.m69855b();
            }
            Subscription scheduledAction = new ScheduledAction(C19401c.m69809a(action0), this.f61807b);
            this.f61807b.m70548a(scheduledAction);
            this.f61808c.offer(scheduledAction);
            if (this.f61809d.getAndIncrement() == null) {
                try {
                    this.f61806a.execute(this);
                } catch (Throwable e) {
                    this.f61807b.m70550b(scheduledAction);
                    this.f61809d.decrementAndGet();
                    C19401c.m69811a(e);
                    throw e;
                }
            }
            return scheduledAction;
        }

        public void run() {
            while (!this.f61807b.isUnsubscribed()) {
                ScheduledAction scheduledAction = (ScheduledAction) this.f61808c.poll();
                if (scheduledAction != null) {
                    if (!scheduledAction.isUnsubscribed()) {
                        if (this.f61807b.isUnsubscribed()) {
                            this.f61808c.clear();
                            return;
                        }
                        scheduledAction.run();
                    }
                    if (this.f61809d.decrementAndGet() == 0) {
                        return;
                    }
                }
                return;
            }
            this.f61808c.clear();
        }

        /* renamed from: a */
        public Subscription mo14741a(Action0 action0, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo14740a(action0);
            }
            if (isUnsubscribed()) {
                return C19407e.m69855b();
            }
            action0 = C19401c.m69809a(action0);
            Object c19574c = new C19574c();
            final Subscription c19574c2 = new C19574c();
            c19574c2.m70552a(c19574c);
            this.f61807b.m70548a(c19574c2);
            final Subscription a = C19407e.m69854a(new Action0(this) {
                /* renamed from: b */
                final /* synthetic */ C19753a f62116b;

                public void call() {
                    this.f62116b.f61807b.m70550b(c19574c2);
                }
            });
            ScheduledAction scheduledAction = new ScheduledAction(new Action0(this) {
                /* renamed from: d */
                final /* synthetic */ C19753a f62120d;

                public void call() {
                    if (!c19574c2.isUnsubscribed()) {
                        Subscription a = this.f62120d.mo14740a(action0);
                        c19574c2.m70552a(a);
                        if (a.getClass() == ScheduledAction.class) {
                            ((ScheduledAction) a).m70610a(a);
                        }
                    }
                }
            });
            c19574c.m70552a(scheduledAction);
            try {
                scheduledAction.m70609a(this.f61810e.schedule(scheduledAction, j, timeUnit));
                return a;
            } catch (Throwable e) {
                C19401c.m69811a(e);
                throw e;
            }
        }

        public boolean isUnsubscribed() {
            return this.f61807b.isUnsubscribed();
        }

        public void unsubscribe() {
            this.f61807b.unsubscribe();
            this.f61808c.clear();
        }
    }

    public C19603c(Executor executor) {
        this.f61266a = executor;
    }

    public a$a createWorker() {
        return new C19753a(this.f61266a);
    }
}
