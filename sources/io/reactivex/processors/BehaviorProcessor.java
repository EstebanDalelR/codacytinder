package io.reactivex.processors;

import com.google.android.exoplayer2.Format;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import io.reactivex.internal.util.C15735a;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class BehaviorProcessor<T> extends C18430a<T> {
    /* renamed from: c */
    static final Object[] f59104c = new Object[0];
    /* renamed from: d */
    static final BehaviorSubscription[] f59105d = new BehaviorSubscription[0];
    /* renamed from: e */
    static final BehaviorSubscription[] f59106e = new BehaviorSubscription[0];
    /* renamed from: a */
    final AtomicReference<BehaviorSubscription<T>[]> f59107a;
    /* renamed from: f */
    final ReadWriteLock f59108f;
    /* renamed from: g */
    final Lock f59109g;
    /* renamed from: h */
    final Lock f59110h;
    /* renamed from: i */
    final AtomicReference<Object> f59111i;
    /* renamed from: j */
    final AtomicReference<Throwable> f59112j;
    /* renamed from: k */
    long f59113k;

    static final class BehaviorSubscription<T> extends AtomicLong implements NonThrowingPredicate<Object>, Subscription {
        private static final long serialVersionUID = 3293175281126227086L;
        /* renamed from: a */
        final Subscriber<? super T> f57413a;
        /* renamed from: b */
        final BehaviorProcessor<T> f57414b;
        /* renamed from: c */
        boolean f57415c;
        /* renamed from: d */
        boolean f57416d;
        /* renamed from: e */
        AppendOnlyLinkedArrayList<Object> f57417e;
        /* renamed from: f */
        boolean f57418f;
        /* renamed from: g */
        volatile boolean f57419g;
        /* renamed from: h */
        long f57420h;

        BehaviorSubscription(Subscriber<? super T> subscriber, BehaviorProcessor<T> behaviorProcessor) {
            this.f57413a = subscriber;
            this.f57414b = behaviorProcessor;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            if (!this.f57419g) {
                this.f57419g = true;
                this.f57414b.m67657b(this);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m66599a() {
            /*
            r4 = this;
            r0 = r4.f57419g;
            if (r0 == 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            monitor-enter(r4);
            r0 = r4.f57419g;	 Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000c;
        L_0x000a:
            monitor-exit(r4);	 Catch:{ all -> 0x003e }
            return;
        L_0x000c:
            r0 = r4.f57415c;	 Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0012;
        L_0x0010:
            monitor-exit(r4);	 Catch:{ all -> 0x003e }
            return;
        L_0x0012:
            r0 = r4.f57414b;	 Catch:{ all -> 0x003e }
            r1 = r0.f59109g;	 Catch:{ all -> 0x003e }
            r1.lock();	 Catch:{ all -> 0x003e }
            r2 = r0.f59113k;	 Catch:{ all -> 0x003e }
            r4.f57420h = r2;	 Catch:{ all -> 0x003e }
            r0 = r0.f59111i;	 Catch:{ all -> 0x003e }
            r0 = r0.get();	 Catch:{ all -> 0x003e }
            r1.unlock();	 Catch:{ all -> 0x003e }
            r1 = 1;
            if (r0 == 0) goto L_0x002b;
        L_0x0029:
            r2 = 1;
            goto L_0x002c;
        L_0x002b:
            r2 = 0;
        L_0x002c:
            r4.f57416d = r2;	 Catch:{ all -> 0x003e }
            r4.f57415c = r1;	 Catch:{ all -> 0x003e }
            monitor-exit(r4);	 Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d;
        L_0x0033:
            r0 = r4.test(r0);
            if (r0 == 0) goto L_0x003a;
        L_0x0039:
            return;
        L_0x003a:
            r4.m66601b();
        L_0x003d:
            return;
        L_0x003e:
            r0 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x003e }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.a():void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m66600a(java.lang.Object r4, long r5) {
            /*
            r3 = this;
            r0 = r3.f57419g;
            if (r0 == 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            r0 = r3.f57418f;
            if (r0 != 0) goto L_0x0037;
        L_0x0009:
            monitor-enter(r3);
            r0 = r3.f57419g;	 Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0010;
        L_0x000e:
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            return;
        L_0x0010:
            r0 = r3.f57420h;	 Catch:{ all -> 0x0034 }
            r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
            if (r2 != 0) goto L_0x0018;
        L_0x0016:
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            return;
        L_0x0018:
            r5 = r3.f57416d;	 Catch:{ all -> 0x0034 }
            if (r5 == 0) goto L_0x002d;
        L_0x001c:
            r5 = r3.f57417e;	 Catch:{ all -> 0x0034 }
            if (r5 != 0) goto L_0x0028;
        L_0x0020:
            r5 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList;	 Catch:{ all -> 0x0034 }
            r6 = 4;
            r5.<init>(r6);	 Catch:{ all -> 0x0034 }
            r3.f57417e = r5;	 Catch:{ all -> 0x0034 }
        L_0x0028:
            r5.m58956a(r4);	 Catch:{ all -> 0x0034 }
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            return;
        L_0x002d:
            r5 = 1;
            r3.f57415c = r5;	 Catch:{ all -> 0x0034 }
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            r3.f57418f = r5;
            goto L_0x0037;
        L_0x0034:
            r4 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            throw r4;
        L_0x0037:
            r3.test(r4);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.a(java.lang.Object, long):void");
        }

        public boolean test(Object obj) {
            if (this.f57419g) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.f57413a.onComplete();
                return true;
            } else if (NotificationLite.isError(obj)) {
                this.f57413a.onError(NotificationLite.getError(obj));
                return true;
            } else {
                long j = get();
                if (j != 0) {
                    this.f57413a.onNext(NotificationLite.getValue(obj));
                    if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                        decrementAndGet();
                    }
                    return null;
                }
                cancel();
                this.f57413a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        void m66601b() {
            /*
            r2 = this;
        L_0x0000:
            r0 = r2.f57419g;
            if (r0 == 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            monitor-enter(r2);
            r0 = r2.f57417e;	 Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x000f;
        L_0x000a:
            r0 = 0;
            r2.f57416d = r0;	 Catch:{ all -> 0x0017 }
            monitor-exit(r2);	 Catch:{ all -> 0x0017 }
            return;
        L_0x000f:
            r1 = 0;
            r2.f57417e = r1;	 Catch:{ all -> 0x0017 }
            monitor-exit(r2);	 Catch:{ all -> 0x0017 }
            r0.m58955a(r2);
            goto L_0x0000;
        L_0x0017:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0017 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.b():void");
        }
    }

    @CheckReturnValue
    /* renamed from: q */
    public static <T> BehaviorProcessor<T> m67654q() {
        return new BehaviorProcessor();
    }

    @CheckReturnValue
    /* renamed from: d */
    public static <T> BehaviorProcessor<T> m67653d(T t) {
        C15684a.m58895a((Object) t, "defaultValue is null");
        return new BehaviorProcessor(t);
    }

    BehaviorProcessor() {
        this.f59111i = new AtomicReference();
        this.f59108f = new ReentrantReadWriteLock();
        this.f59109g = this.f59108f.readLock();
        this.f59110h = this.f59108f.writeLock();
        this.f59107a = new AtomicReference(f59105d);
        this.f59112j = new AtomicReference();
    }

    BehaviorProcessor(T t) {
        this();
        this.f59111i.lazySet(C15684a.m58895a((Object) t, "defaultValue is null"));
    }

    /* renamed from: a */
    protected void m67655a(Subscriber<? super T> subscriber) {
        BehaviorSubscription behaviorSubscription = new BehaviorSubscription(subscriber, this);
        subscriber.onSubscribe(behaviorSubscription);
        if (!m67656a(behaviorSubscription)) {
            Throwable th = (Throwable) this.f59112j.get();
            if (th == ExceptionHelper.f48655a) {
                subscriber.onComplete();
            } else {
                subscriber.onError(th);
            }
        } else if (behaviorSubscription.f57419g != null) {
            m67657b(behaviorSubscription);
        } else {
            behaviorSubscription.m66599a();
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (this.f59112j.get() != null) {
            subscription.cancel();
        } else {
            subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
        }
    }

    public void onNext(T t) {
        C15684a.m58895a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f59112j.get() == null) {
            t = NotificationLite.next(t);
            m67659f(t);
            for (BehaviorSubscription a : (BehaviorSubscription[]) this.f59107a.get()) {
                a.m66600a(t, this.f59113k);
            }
        }
    }

    public void onError(Throwable th) {
        C15684a.m58895a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f59112j.compareAndSet(null, th)) {
            th = NotificationLite.error(th);
            for (BehaviorSubscription a : m67658e(th)) {
                a.m66600a(th, this.f59113k);
            }
            return;
        }
        C2667a.a(th);
    }

    public void onComplete() {
        if (this.f59112j.compareAndSet(null, ExceptionHelper.f48655a)) {
            Object complete = NotificationLite.complete();
            for (BehaviorSubscription a : m67658e(complete)) {
                a.m66600a(complete, this.f59113k);
            }
        }
    }

    /* renamed from: r */
    public boolean mo14002r() {
        return ((BehaviorSubscription[]) this.f59107a.get()).length != 0;
    }

    /* renamed from: s */
    public T m67661s() {
        Object obj = this.f59111i.get();
        if (!NotificationLite.isComplete(obj)) {
            if (!NotificationLite.isError(obj)) {
                return NotificationLite.getValue(obj);
            }
        }
        return null;
    }

    /* renamed from: t */
    public boolean m67662t() {
        Object obj = this.f59111i.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    /* renamed from: a */
    boolean m67656a(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription[] behaviorSubscriptionArr;
        Object obj;
        do {
            behaviorSubscriptionArr = (BehaviorSubscription[]) this.f59107a.get();
            if (behaviorSubscriptionArr == f59106e) {
                return false;
            }
            int length = behaviorSubscriptionArr.length;
            obj = new BehaviorSubscription[(length + 1)];
            System.arraycopy(behaviorSubscriptionArr, 0, obj, 0, length);
            obj[length] = behaviorSubscription;
        } while (!this.f59107a.compareAndSet(behaviorSubscriptionArr, obj));
        return true;
    }

    /* renamed from: b */
    void m67657b(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription[] behaviorSubscriptionArr;
        Object obj;
        do {
            behaviorSubscriptionArr = (BehaviorSubscription[]) this.f59107a.get();
            if (behaviorSubscriptionArr != f59106e) {
                if (behaviorSubscriptionArr != f59105d) {
                    int length = behaviorSubscriptionArr.length;
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (behaviorSubscriptionArr[i2] == behaviorSubscription) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f59105d;
                        } else {
                            Object obj2 = new BehaviorSubscription[(length - 1)];
                            System.arraycopy(behaviorSubscriptionArr, 0, obj2, 0, i);
                            System.arraycopy(behaviorSubscriptionArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        } while (!this.f59107a.compareAndSet(behaviorSubscriptionArr, obj));
    }

    /* renamed from: e */
    BehaviorSubscription<T>[] m67658e(Object obj) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr = (BehaviorSubscription[]) this.f59107a.get();
        if (behaviorSubscriptionArr != f59106e) {
            behaviorSubscriptionArr = (BehaviorSubscription[]) this.f59107a.getAndSet(f59106e);
            if (behaviorSubscriptionArr != f59106e) {
                m67659f(obj);
            }
        }
        return behaviorSubscriptionArr;
    }

    /* renamed from: f */
    void m67659f(Object obj) {
        Lock lock = this.f59110h;
        lock.lock();
        this.f59113k++;
        this.f59111i.lazySet(obj);
        lock.unlock();
    }
}
