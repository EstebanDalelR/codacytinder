package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.util.C19615i;
import rx.p498c.C19401c;
import rx.p500e.C19573b;

public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, Subscription {
    private static final long serialVersionUID = -3962399486978279857L;
    /* renamed from: a */
    final C19615i f61248a;
    /* renamed from: b */
    final Action0 f61249b;

    static final class Remover2 extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        /* renamed from: a */
        final ScheduledAction f61242a;
        /* renamed from: b */
        final C19615i f61243b;

        public Remover2(ScheduledAction scheduledAction, C19615i c19615i) {
            this.f61242a = scheduledAction;
            this.f61243b = c19615i;
        }

        public boolean isUnsubscribed() {
            return this.f61242a.isUnsubscribed();
        }

        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f61243b.m70648b(this.f61242a);
            }
        }
    }

    static final class Remover extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        /* renamed from: a */
        final ScheduledAction f61244a;
        /* renamed from: b */
        final C19573b f61245b;

        public Remover(ScheduledAction scheduledAction, C19573b c19573b) {
            this.f61244a = scheduledAction;
            this.f61245b = c19573b;
        }

        public boolean isUnsubscribed() {
            return this.f61244a.isUnsubscribed();
        }

        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f61245b.m70550b(this.f61244a);
            }
        }
    }

    /* renamed from: rx.internal.schedulers.ScheduledAction$a */
    final class C19599a implements Subscription {
        /* renamed from: a */
        final /* synthetic */ ScheduledAction f61246a;
        /* renamed from: b */
        private final Future<?> f61247b;

        C19599a(ScheduledAction scheduledAction, Future<?> future) {
            this.f61246a = scheduledAction;
            this.f61247b = future;
        }

        public void unsubscribe() {
            if (this.f61246a.get() != Thread.currentThread()) {
                this.f61247b.cancel(true);
            } else {
                this.f61247b.cancel(false);
            }
        }

        public boolean isUnsubscribed() {
            return this.f61247b.isCancelled();
        }
    }

    public ScheduledAction(Action0 action0) {
        this.f61249b = action0;
        this.f61248a = new C19615i();
    }

    public ScheduledAction(Action0 action0, C19573b c19573b) {
        this.f61249b = action0;
        this.f61248a = new C19615i(new Remover(this, c19573b));
    }

    public ScheduledAction(Action0 action0, C19615i c19615i) {
        this.f61249b = action0;
        this.f61248a = new C19615i(new Remover2(this, c19615i));
    }

    public void run() {
        try {
            lazySet(Thread.currentThread());
            this.f61249b.call();
        } catch (Throwable e) {
            m70608a(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable th) {
            unsubscribe();
        }
        unsubscribe();
    }

    /* renamed from: a */
    void m70608a(Throwable th) {
        C19401c.m69811a(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public boolean isUnsubscribed() {
        return this.f61248a.isUnsubscribed();
    }

    public void unsubscribe() {
        if (!this.f61248a.isUnsubscribed()) {
            this.f61248a.unsubscribe();
        }
    }

    /* renamed from: a */
    public void m70610a(Subscription subscription) {
        this.f61248a.m70647a(subscription);
    }

    /* renamed from: a */
    public void m70609a(Future<?> future) {
        this.f61248a.m70647a(new C19599a(this, future));
    }

    /* renamed from: a */
    public void m70611a(C19573b c19573b) {
        this.f61248a.m70647a(new Remover(this, c19573b));
    }
}
