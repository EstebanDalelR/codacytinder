package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.C2671a;
import rx.Completable;
import rx.Completable$OnSubscribe;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.operators.BufferUntilSubscriber;
import rx.observers.C19620d;
import rx.p500e.C19407e;
import rx.subjects.PublishSubject;

public class SchedulerWhen extends C2671a implements Subscription {
    /* renamed from: a */
    static final Subscription f61250a = new C196003();
    /* renamed from: b */
    static final Subscription f61251b = C19407e.m69855b();
    /* renamed from: c */
    private final C2671a f61252c;
    /* renamed from: d */
    private final Observer<Observable<Completable>> f61253d;
    /* renamed from: e */
    private final Subscription f61254e;

    /* renamed from: rx.internal.schedulers.SchedulerWhen$3 */
    static class C196003 implements Subscription {
        public boolean isUnsubscribed() {
            return false;
        }

        public void unsubscribe() {
        }

        C196003() {
        }
    }

    static abstract class ScheduledAction extends AtomicReference<Subscription> implements Subscription {
        /* renamed from: a */
        protected abstract Subscription mo14758a(a$a a_a, CompletableSubscriber completableSubscriber);

        public ScheduledAction() {
            super(SchedulerWhen.f61250a);
        }

        /* renamed from: b */
        private void m70613b(a$a a_a, CompletableSubscriber completableSubscriber) {
            Subscription subscription = (Subscription) get();
            if (subscription != SchedulerWhen.f61251b && subscription == SchedulerWhen.f61250a) {
                a_a = mo14758a(a_a, completableSubscriber);
                if (compareAndSet(SchedulerWhen.f61250a, a_a) == null) {
                    a_a.unsubscribe();
                }
            }
        }

        public boolean isUnsubscribed() {
            return ((Subscription) get()).isUnsubscribed();
        }

        public void unsubscribe() {
            Subscription subscription = SchedulerWhen.f61251b;
            Subscription subscription2;
            do {
                subscription2 = (Subscription) get();
                if (subscription2 == SchedulerWhen.f61251b) {
                    return;
                }
            } while (!compareAndSet(subscription2, subscription));
            if (subscription2 != SchedulerWhen.f61250a) {
                subscription2.unsubscribe();
            }
        }
    }

    static class DelayedAction extends ScheduledAction {
        /* renamed from: a */
        private final Action0 f61798a;
        /* renamed from: b */
        private final long f61799b;
        /* renamed from: c */
        private final TimeUnit f61800c;

        public DelayedAction(Action0 action0, long j, TimeUnit timeUnit) {
            this.f61798a = action0;
            this.f61799b = j;
            this.f61800c = timeUnit;
        }

        /* renamed from: a */
        protected Subscription mo14758a(a$a a_a, CompletableSubscriber completableSubscriber) {
            return a_a.mo14741a(new C19842a(this.f61798a, completableSubscriber), this.f61799b, this.f61800c);
        }
    }

    static class ImmediateAction extends ScheduledAction {
        /* renamed from: a */
        private final Action0 f61801a;

        public ImmediateAction(Action0 action0) {
            this.f61801a = action0;
        }

        /* renamed from: a */
        protected Subscription mo14758a(a$a a_a, CompletableSubscriber completableSubscriber) {
            return a_a.mo14740a(new C19842a(this.f61801a, completableSubscriber));
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$a */
    static class C19842a implements Action0 {
        /* renamed from: a */
        private CompletableSubscriber f62102a;
        /* renamed from: b */
        private Action0 f62103b;

        public C19842a(Action0 action0, CompletableSubscriber completableSubscriber) {
            this.f62103b = action0;
            this.f62102a = completableSubscriber;
        }

        public void call() {
            try {
                this.f62103b.call();
            } finally {
                this.f62102a.onCompleted();
            }
        }
    }

    public SchedulerWhen(Func1<Observable<Observable<Completable>>, Completable> func1, C2671a c2671a) {
        this.f61252c = c2671a;
        c2671a = PublishSubject.m71070w();
        this.f61253d = new C19620d(c2671a);
        this.f61254e = ((Completable) func1.call(c2671a.m69718k())).d();
    }

    public void unsubscribe() {
        this.f61254e.unsubscribe();
    }

    public boolean isUnsubscribed() {
        return this.f61254e.isUnsubscribed();
    }

    public a$a createWorker() {
        final a$a createWorker = this.f61252c.createWorker();
        Object w = BufferUntilSubscriber.m70894w();
        final Observer c19620d = new C19620d(w);
        Observable k = w.m69719k(new Func1<ScheduledAction, Completable>(this) {
            /* renamed from: b */
            final /* synthetic */ SchedulerWhen f61793b;

            public /* synthetic */ Object call(Object obj) {
                return m71016a((ScheduledAction) obj);
            }

            /* renamed from: a */
            public Completable m71016a(final ScheduledAction scheduledAction) {
                return Completable.a(new Completable$OnSubscribe(this) {
                    /* renamed from: b */
                    final /* synthetic */ C197501 f62326b;

                    public /* synthetic */ void call(Object obj) {
                        m71638a((CompletableSubscriber) obj);
                    }

                    /* renamed from: a */
                    public void m71638a(CompletableSubscriber completableSubscriber) {
                        completableSubscriber.onSubscribe(scheduledAction);
                        scheduledAction.m70613b(createWorker, completableSubscriber);
                    }
                });
            }
        });
        a$a c197512 = new a$a(this) {
            /* renamed from: c */
            final /* synthetic */ SchedulerWhen f61796c;
            /* renamed from: d */
            private final AtomicBoolean f61797d = new AtomicBoolean();

            public void unsubscribe() {
                if (this.f61797d.compareAndSet(false, true)) {
                    createWorker.unsubscribe();
                    c19620d.onCompleted();
                }
            }

            public boolean isUnsubscribed() {
                return this.f61797d.get();
            }

            /* renamed from: a */
            public Subscription mo14741a(Action0 action0, long j, TimeUnit timeUnit) {
                Subscription delayedAction = new DelayedAction(action0, j, timeUnit);
                c19620d.onNext(delayedAction);
                return delayedAction;
            }

            /* renamed from: a */
            public Subscription mo14740a(Action0 action0) {
                Subscription immediateAction = new ImmediateAction(action0);
                c19620d.onNext(immediateAction);
                return immediateAction;
            }
        };
        this.f61253d.onNext(k);
        return c197512;
    }
}
