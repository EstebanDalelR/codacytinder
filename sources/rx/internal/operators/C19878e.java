package rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.Completable$OnSubscribe;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.internal.util.atomic.C19610c;
import rx.internal.util.unsafe.C19912h;
import rx.internal.util.unsafe.af;
import rx.p500e.C19573b;

/* renamed from: rx.internal.operators.e */
public final class C19878e implements Completable$OnSubscribe {
    /* renamed from: a */
    final Iterable<? extends Completable> f62265a;

    public /* synthetic */ void call(Object obj) {
        m71605a((CompletableSubscriber) obj);
    }

    public C19878e(Iterable<? extends Completable> iterable) {
        this.f62265a = iterable;
    }

    /* renamed from: a */
    public void m71605a(CompletableSubscriber completableSubscriber) {
        C19573b c19573b = new C19573b();
        completableSubscriber.onSubscribe(c19573b);
        try {
            Iterator it = this.f62265a.iterator();
            if (it == null) {
                completableSubscriber.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            C19912h c19912h;
            AtomicInteger atomicInteger = new AtomicInteger(1);
            if (af.m69984a()) {
                c19912h = new C19912h();
            } else {
                c19912h = new C19610c();
            }
            Queue queue = c19912h;
            while (!c19573b.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (queue.isEmpty()) {
                                completableSubscriber.onCompleted();
                            } else {
                                completableSubscriber.onError(C19876c.m71602a(queue));
                            }
                        }
                        return;
                    } else if (!c19573b.isUnsubscribed()) {
                        try {
                            Completable completable = (Completable) it.next();
                            if (!c19573b.isUnsubscribed()) {
                                if (completable == null) {
                                    queue.offer(new NullPointerException("A completable source is null"));
                                    if (atomicInteger.decrementAndGet() == 0) {
                                        if (queue.isEmpty()) {
                                            completableSubscriber.onCompleted();
                                        } else {
                                            completableSubscriber.onError(C19876c.m71602a(queue));
                                        }
                                    }
                                    return;
                                }
                                atomicInteger.getAndIncrement();
                                final C19573b c19573b2 = c19573b;
                                final Queue queue2 = queue;
                                final AtomicInteger atomicInteger2 = atomicInteger;
                                final CompletableSubscriber completableSubscriber2 = completableSubscriber;
                                completable.a(new CompletableSubscriber(this) {
                                    /* renamed from: e */
                                    final /* synthetic */ C19878e f61218e;

                                    public void onSubscribe(Subscription subscription) {
                                        c19573b2.m70548a(subscription);
                                    }

                                    public void onError(Throwable th) {
                                        queue2.offer(th);
                                        m70602a();
                                    }

                                    public void onCompleted() {
                                        m70602a();
                                    }

                                    /* renamed from: a */
                                    void m70602a() {
                                        if (atomicInteger2.decrementAndGet() != 0) {
                                            return;
                                        }
                                        if (queue2.isEmpty()) {
                                            completableSubscriber2.onCompleted();
                                        } else {
                                            completableSubscriber2.onError(C19876c.m71602a(queue2));
                                        }
                                    }
                                });
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            queue.offer(th);
                            if (atomicInteger.decrementAndGet() == 0) {
                                if (queue.isEmpty()) {
                                    completableSubscriber.onCompleted();
                                } else {
                                    completableSubscriber.onError(C19876c.m71602a(queue));
                                }
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    queue.offer(th2);
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (queue.isEmpty()) {
                            completableSubscriber.onCompleted();
                        } else {
                            completableSubscriber.onError(C19876c.m71602a(queue));
                        }
                    }
                    return;
                }
            }
        } catch (Throwable th22) {
            completableSubscriber.onError(th22);
        }
    }
}
