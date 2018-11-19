package io.reactivex.processors;

import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.processors.b */
final class C19039b<T> extends C18430a<T> {
    /* renamed from: a */
    final C18430a<T> f59129a;
    /* renamed from: c */
    boolean f59130c;
    /* renamed from: d */
    AppendOnlyLinkedArrayList<Object> f59131d;
    /* renamed from: e */
    volatile boolean f59132e;

    C19039b(C18430a<T> c18430a) {
        this.f59129a = c18430a;
    }

    /* renamed from: a */
    protected void m67676a(Subscriber<? super T> subscriber) {
        this.f59129a.subscribe(subscriber);
    }

    public void onSubscribe(Subscription subscription) {
        boolean z = true;
        if (!this.f59132e) {
            synchronized (this) {
                if (!this.f59132e) {
                    if (this.f59130c) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f59131d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                            this.f59131d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.m58956a(NotificationLite.subscription(subscription));
                        return;
                    }
                    this.f59130c = true;
                    z = false;
                }
            }
        }
        if (z) {
            subscription.cancel();
        } else {
            this.f59129a.onSubscribe(subscription);
            m67677q();
        }
    }

    public void onNext(T t) {
        if (!this.f59132e) {
            synchronized (this) {
                if (this.f59132e) {
                } else if (this.f59130c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f59131d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f59131d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m58956a(NotificationLite.next(t));
                } else {
                    this.f59130c = true;
                    this.f59129a.onNext(t);
                    m67677q();
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
        r2 = this;
        r0 = r2.f59132e;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        io.reactivex.p079d.C2667a.a(r3);
        return;
    L_0x0008:
        monitor-enter(r2);
        r0 = r2.f59132e;	 Catch:{ all -> 0x003b }
        r1 = 1;
        if (r0 == 0) goto L_0x0010;
    L_0x000e:
        r0 = 1;
        goto L_0x002e;
    L_0x0010:
        r2.f59132e = r1;	 Catch:{ all -> 0x003b }
        r0 = r2.f59130c;	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x002b;
    L_0x0016:
        r0 = r2.f59131d;	 Catch:{ all -> 0x003b }
        if (r0 != 0) goto L_0x0022;
    L_0x001a:
        r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList;	 Catch:{ all -> 0x003b }
        r1 = 4;
        r0.<init>(r1);	 Catch:{ all -> 0x003b }
        r2.f59131d = r0;	 Catch:{ all -> 0x003b }
    L_0x0022:
        r3 = io.reactivex.internal.util.NotificationLite.error(r3);	 Catch:{ all -> 0x003b }
        r0.m58959b(r3);	 Catch:{ all -> 0x003b }
        monitor-exit(r2);	 Catch:{ all -> 0x003b }
        return;
    L_0x002b:
        r0 = 0;
        r2.f59130c = r1;	 Catch:{ all -> 0x003b }
    L_0x002e:
        monitor-exit(r2);	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x0035;
    L_0x0031:
        io.reactivex.p079d.C2667a.a(r3);
        return;
    L_0x0035:
        r0 = r2.f59129a;
        r0.onError(r3);
        return;
    L_0x003b:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003b }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.b.onError(java.lang.Throwable):void");
    }

    public void onComplete() {
        if (!this.f59132e) {
            synchronized (this) {
                if (this.f59132e) {
                    return;
                }
                this.f59132e = true;
                if (this.f59130c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f59131d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f59131d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m58956a(NotificationLite.complete());
                    return;
                }
                this.f59130c = true;
                this.f59129a.onComplete();
            }
        }
    }

    /* renamed from: q */
    void m67677q() {
        while (true) {
            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f59131d;
                if (appendOnlyLinkedArrayList == null) {
                    this.f59130c = false;
                    return;
                }
                this.f59131d = null;
            }
            appendOnlyLinkedArrayList.m58958a(this.f59129a);
        }
    }

    /* renamed from: r */
    public boolean mo14002r() {
        return this.f59129a.mo14002r();
    }
}
