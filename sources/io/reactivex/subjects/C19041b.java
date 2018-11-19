package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.subjects.b */
final class C19041b<T> extends C18432c<T> implements NonThrowingPredicate<Object> {
    /* renamed from: a */
    final C18432c<T> f59160a;
    /* renamed from: b */
    boolean f59161b;
    /* renamed from: c */
    AppendOnlyLinkedArrayList<Object> f59162c;
    /* renamed from: d */
    volatile boolean f59163d;

    C19041b(C18432c<T> c18432c) {
        this.f59160a = c18432c;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.f59160a.subscribe(observer);
    }

    public void onSubscribe(Disposable disposable) {
        boolean z = true;
        if (!this.f59163d) {
            synchronized (this) {
                if (!this.f59163d) {
                    if (this.f59161b) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f59162c;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                            this.f59162c = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.m58956a(NotificationLite.disposable(disposable));
                        return;
                    }
                    this.f59161b = true;
                    z = false;
                }
            }
        }
        if (z) {
            disposable.dispose();
        } else {
            this.f59160a.onSubscribe(disposable);
            m67702a();
        }
    }

    public void onNext(T t) {
        if (!this.f59163d) {
            synchronized (this) {
                if (this.f59163d) {
                } else if (this.f59161b) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f59162c;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f59162c = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m58956a(NotificationLite.next(t));
                } else {
                    this.f59161b = true;
                    this.f59160a.onNext(t);
                    m67702a();
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
        r2 = this;
        r0 = r2.f59163d;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        io.reactivex.p079d.C2667a.a(r3);
        return;
    L_0x0008:
        monitor-enter(r2);
        r0 = r2.f59163d;	 Catch:{ all -> 0x003b }
        r1 = 1;
        if (r0 == 0) goto L_0x0010;
    L_0x000e:
        r0 = 1;
        goto L_0x002e;
    L_0x0010:
        r2.f59163d = r1;	 Catch:{ all -> 0x003b }
        r0 = r2.f59161b;	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x002b;
    L_0x0016:
        r0 = r2.f59162c;	 Catch:{ all -> 0x003b }
        if (r0 != 0) goto L_0x0022;
    L_0x001a:
        r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList;	 Catch:{ all -> 0x003b }
        r1 = 4;
        r0.<init>(r1);	 Catch:{ all -> 0x003b }
        r2.f59162c = r0;	 Catch:{ all -> 0x003b }
    L_0x0022:
        r3 = io.reactivex.internal.util.NotificationLite.error(r3);	 Catch:{ all -> 0x003b }
        r0.m58959b(r3);	 Catch:{ all -> 0x003b }
        monitor-exit(r2);	 Catch:{ all -> 0x003b }
        return;
    L_0x002b:
        r0 = 0;
        r2.f59161b = r1;	 Catch:{ all -> 0x003b }
    L_0x002e:
        monitor-exit(r2);	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x0035;
    L_0x0031:
        io.reactivex.p079d.C2667a.a(r3);
        return;
    L_0x0035:
        r0 = r2.f59160a;
        r0.onError(r3);
        return;
    L_0x003b:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003b }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.b.onError(java.lang.Throwable):void");
    }

    public void onComplete() {
        if (!this.f59163d) {
            synchronized (this) {
                if (this.f59163d) {
                    return;
                }
                this.f59163d = true;
                if (this.f59161b) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f59162c;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f59162c = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m58956a(NotificationLite.complete());
                    return;
                }
                this.f59161b = true;
                this.f59160a.onComplete();
            }
        }
    }

    /* renamed from: a */
    void m67702a() {
        while (true) {
            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f59162c;
                if (appendOnlyLinkedArrayList == null) {
                    this.f59161b = false;
                    return;
                }
                this.f59162c = null;
            }
            appendOnlyLinkedArrayList.m58955a((NonThrowingPredicate) this);
        }
    }

    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f59160a);
    }
}
