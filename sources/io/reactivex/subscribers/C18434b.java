package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.subscribers.b */
public final class C18434b<T> implements FlowableSubscriber<T>, Subscription {
    /* renamed from: a */
    final Subscriber<? super T> f57441a;
    /* renamed from: b */
    final boolean f57442b;
    /* renamed from: c */
    Subscription f57443c;
    /* renamed from: d */
    boolean f57444d;
    /* renamed from: e */
    AppendOnlyLinkedArrayList<Object> f57445e;
    /* renamed from: f */
    volatile boolean f57446f;

    public C18434b(Subscriber<? super T> subscriber) {
        this(subscriber, false);
    }

    public C18434b(Subscriber<? super T> subscriber, boolean z) {
        this.f57441a = subscriber;
        this.f57442b = z;
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f57443c, subscription)) {
            this.f57443c = subscription;
            this.f57441a.onSubscribe(this);
        }
    }

    public void onNext(T t) {
        if (!this.f57446f) {
            if (t == null) {
                this.f57443c.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (this.f57446f) {
                } else if (this.f57444d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f57445e;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f57445e = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m58956a(NotificationLite.next(t));
                } else {
                    this.f57444d = true;
                    this.f57441a.onNext(t);
                    m66615a();
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
        r2 = this;
        r0 = r2.f57446f;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        io.reactivex.p079d.C2667a.a(r3);
        return;
    L_0x0008:
        monitor-enter(r2);
        r0 = r2.f57446f;	 Catch:{ all -> 0x0044 }
        r1 = 1;
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0037;
    L_0x000f:
        r0 = r2.f57444d;	 Catch:{ all -> 0x0044 }
        if (r0 == 0) goto L_0x0032;
    L_0x0013:
        r2.f57446f = r1;	 Catch:{ all -> 0x0044 }
        r0 = r2.f57445e;	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x0021;
    L_0x0019:
        r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList;	 Catch:{ all -> 0x0044 }
        r1 = 4;
        r0.<init>(r1);	 Catch:{ all -> 0x0044 }
        r2.f57445e = r0;	 Catch:{ all -> 0x0044 }
    L_0x0021:
        r3 = io.reactivex.internal.util.NotificationLite.error(r3);	 Catch:{ all -> 0x0044 }
        r1 = r2.f57442b;	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x002d;
    L_0x0029:
        r0.m58956a(r3);	 Catch:{ all -> 0x0044 }
        goto L_0x0030;
    L_0x002d:
        r0.m58959b(r3);	 Catch:{ all -> 0x0044 }
    L_0x0030:
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0032:
        r2.f57446f = r1;	 Catch:{ all -> 0x0044 }
        r2.f57444d = r1;	 Catch:{ all -> 0x0044 }
        r1 = 0;
    L_0x0037:
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x003e;
    L_0x003a:
        io.reactivex.p079d.C2667a.a(r3);
        return;
    L_0x003e:
        r0 = r2.f57441a;
        r0.onError(r3);
        return;
    L_0x0044:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subscribers.b.onError(java.lang.Throwable):void");
    }

    public void onComplete() {
        if (!this.f57446f) {
            synchronized (this) {
                if (this.f57446f) {
                } else if (this.f57444d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f57445e;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f57445e = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m58956a(NotificationLite.complete());
                } else {
                    this.f57446f = true;
                    this.f57444d = true;
                    this.f57441a.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    void m66615a() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f57445e;
                if (appendOnlyLinkedArrayList == null) {
                    this.f57444d = false;
                    return;
                }
                this.f57445e = null;
            }
        } while (!appendOnlyLinkedArrayList.m58958a(this.f57441a));
    }

    public void request(long j) {
        this.f57443c.request(j);
    }

    public void cancel() {
        this.f57443c.cancel();
    }
}
