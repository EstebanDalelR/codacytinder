package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.Completable$OnSubscribe;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.p500e.C19573b;

/* renamed from: rx.internal.operators.d */
public final class C19877d implements Completable$OnSubscribe {
    /* renamed from: a */
    final Completable[] f62264a;

    public /* synthetic */ void call(Object obj) {
        m71604a((CompletableSubscriber) obj);
    }

    public C19877d(Completable[] completableArr) {
        this.f62264a = completableArr;
    }

    /* renamed from: a */
    public void m71604a(CompletableSubscriber completableSubscriber) {
        C19573b c19573b = new C19573b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f62264a.length + 1);
        Queue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        completableSubscriber.onSubscribe(c19573b);
        Completable[] completableArr = this.f62264a;
        int length = completableArr.length;
        int i = 0;
        while (i < length) {
            Completable completable = completableArr[i];
            if (!c19573b.isUnsubscribed()) {
                if (completable == null) {
                    concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                    atomicInteger.decrementAndGet();
                } else {
                    final C19573b c19573b2 = c19573b;
                    final Queue queue = concurrentLinkedQueue;
                    final AtomicInteger atomicInteger2 = atomicInteger;
                    final CompletableSubscriber completableSubscriber2 = completableSubscriber;
                    completable.a(new CompletableSubscriber(this) {
                        /* renamed from: e */
                        final /* synthetic */ C19877d f61213e;

                        public void onSubscribe(Subscription subscription) {
                            c19573b2.m70548a(subscription);
                        }

                        public void onError(Throwable th) {
                            queue.offer(th);
                            m70601a();
                        }

                        public void onCompleted() {
                            m70601a();
                        }

                        /* renamed from: a */
                        void m70601a() {
                            if (atomicInteger2.decrementAndGet() != 0) {
                                return;
                            }
                            if (queue.isEmpty()) {
                                completableSubscriber2.onCompleted();
                            } else {
                                completableSubscriber2.onError(C19876c.m71602a(queue));
                            }
                        }
                    });
                }
                i++;
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                completableSubscriber.onCompleted();
            } else {
                completableSubscriber.onError(C19876c.m71602a(concurrentLinkedQueue));
            }
        }
    }
}
