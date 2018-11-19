package rx.internal.operators;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Completable;
import rx.Completable$OnSubscribe;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.p498c.C19401c;
import rx.p500e.C19573b;

/* renamed from: rx.internal.operators.c */
public final class C19876c implements Completable$OnSubscribe {
    /* renamed from: a */
    final Observable<Completable> f62261a;
    /* renamed from: b */
    final int f62262b;
    /* renamed from: c */
    final boolean f62263c;

    /* renamed from: rx.internal.operators.c$a */
    static final class C19730a extends C19571c<Completable> {
        /* renamed from: a */
        final CompletableSubscriber f61720a;
        /* renamed from: b */
        final C19573b f61721b = new C19573b();
        /* renamed from: c */
        final boolean f61722c;
        /* renamed from: d */
        volatile boolean f61723d;
        /* renamed from: e */
        final AtomicReference<Queue<Throwable>> f61724e = new AtomicReference();
        /* renamed from: f */
        final AtomicBoolean f61725f = new AtomicBoolean();
        /* renamed from: g */
        final AtomicInteger f61726g = new AtomicInteger(true);

        /* renamed from: rx.internal.operators.c$a$1 */
        class C195901 implements CompletableSubscriber {
            /* renamed from: a */
            Subscription f61206a;
            /* renamed from: b */
            boolean f61207b;
            /* renamed from: c */
            final /* synthetic */ C19730a f61208c;

            C195901(C19730a c19730a) {
                this.f61208c = c19730a;
            }

            public void onSubscribe(Subscription subscription) {
                this.f61206a = subscription;
                this.f61208c.f61721b.m70548a(subscription);
            }

            public void onError(Throwable th) {
                if (this.f61207b) {
                    C19401c.m69811a(th);
                    return;
                }
                this.f61207b = true;
                this.f61208c.f61721b.m70550b(this.f61206a);
                this.f61208c.m70991a().offer(th);
                this.f61208c.m70993b();
                if (this.f61208c.f61722c != null && this.f61208c.f61723d == null) {
                    this.f61208c.request(1);
                }
            }

            public void onCompleted() {
                if (!this.f61207b) {
                    this.f61207b = true;
                    this.f61208c.f61721b.m70550b(this.f61206a);
                    this.f61208c.m70993b();
                    if (!this.f61208c.f61723d) {
                        this.f61208c.request(1);
                    }
                }
            }
        }

        public /* synthetic */ void onNext(Object obj) {
            m70992a((Completable) obj);
        }

        public C19730a(CompletableSubscriber completableSubscriber, int i, boolean z) {
            this.f61720a = completableSubscriber;
            this.f61722c = z;
            if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                request(-1);
            } else {
                request((long) i);
            }
        }

        /* renamed from: a */
        Queue<Throwable> m70991a() {
            Queue<Throwable> queue = (Queue) this.f61724e.get();
            if (queue != null) {
                return queue;
            }
            Queue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            if (this.f61724e.compareAndSet(null, concurrentLinkedQueue)) {
                return concurrentLinkedQueue;
            }
            return (Queue) this.f61724e.get();
        }

        /* renamed from: a */
        public void m70992a(Completable completable) {
            if (!this.f61723d) {
                this.f61726g.getAndIncrement();
                completable.a(new C195901(this));
            }
        }

        public void onError(Throwable th) {
            if (this.f61723d) {
                C19401c.m69811a(th);
                return;
            }
            m70991a().offer(th);
            this.f61723d = true;
            m70993b();
        }

        public void onCompleted() {
            if (!this.f61723d) {
                this.f61723d = true;
                m70993b();
            }
        }

        /* renamed from: b */
        void m70993b() {
            Queue queue;
            Throwable a;
            if (this.f61726g.decrementAndGet() == 0) {
                queue = (Queue) this.f61724e.get();
                if (queue != null) {
                    if (!queue.isEmpty()) {
                        a = C19876c.m71602a(queue);
                        if (this.f61725f.compareAndSet(false, true)) {
                            this.f61720a.onError(a);
                            return;
                        } else {
                            C19401c.m69811a(a);
                            return;
                        }
                    }
                }
                this.f61720a.onCompleted();
            } else if (!this.f61722c) {
                queue = (Queue) this.f61724e.get();
                if (queue != null && !queue.isEmpty()) {
                    a = C19876c.m71602a(queue);
                    if (this.f61725f.compareAndSet(false, true)) {
                        this.f61720a.onError(a);
                    } else {
                        C19401c.m69811a(a);
                    }
                }
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71603a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71603a(CompletableSubscriber completableSubscriber) {
        C19571c c19730a = new C19730a(completableSubscriber, this.f62262b, this.f62263c);
        completableSubscriber.onSubscribe(c19730a);
        this.f62261a.m69661a(c19730a);
    }

    /* renamed from: a */
    public static Throwable m71602a(Queue<Throwable> queue) {
        Collection arrayList = new ArrayList();
        while (true) {
            Throwable th = (Throwable) queue.poll();
            if (th == null) {
                break;
            }
            arrayList.add(th);
        }
        if (arrayList.isEmpty() != null) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (Throwable) arrayList.get(null);
        }
        return new CompositeException(arrayList);
    }
}
