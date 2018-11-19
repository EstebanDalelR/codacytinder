package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.observers.d */
public final class C17530d<T> implements Observer<T>, Disposable {
    /* renamed from: a */
    final Observer<? super T> f54156a;
    /* renamed from: b */
    final boolean f54157b;
    /* renamed from: c */
    Disposable f54158c;
    /* renamed from: d */
    boolean f54159d;
    /* renamed from: e */
    AppendOnlyLinkedArrayList<Object> f54160e;
    /* renamed from: f */
    volatile boolean f54161f;

    public C17530d(@NonNull Observer<? super T> observer) {
        this(observer, false);
    }

    public C17530d(@NonNull Observer<? super T> observer, boolean z) {
        this.f54156a = observer;
        this.f54157b = z;
    }

    public void onSubscribe(@NonNull Disposable disposable) {
        if (DisposableHelper.validate(this.f54158c, disposable)) {
            this.f54158c = disposable;
            this.f54156a.onSubscribe(this);
        }
    }

    public void dispose() {
        this.f54158c.dispose();
    }

    public boolean isDisposed() {
        return this.f54158c.isDisposed();
    }

    public void onNext(@NonNull T t) {
        if (!this.f54161f) {
            if (t == null) {
                this.f54158c.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (this.f54161f) {
                } else if (this.f54159d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f54160e;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f54160e = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m58956a(NotificationLite.next(t));
                } else {
                    this.f54159d = true;
                    this.f54156a.onNext(t);
                    m63758a();
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(@io.reactivex.annotations.NonNull java.lang.Throwable r3) {
        /*
        r2 = this;
        r0 = r2.f54161f;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        io.reactivex.p079d.C2667a.a(r3);
        return;
    L_0x0008:
        monitor-enter(r2);
        r0 = r2.f54161f;	 Catch:{ all -> 0x0044 }
        r1 = 1;
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0037;
    L_0x000f:
        r0 = r2.f54159d;	 Catch:{ all -> 0x0044 }
        if (r0 == 0) goto L_0x0032;
    L_0x0013:
        r2.f54161f = r1;	 Catch:{ all -> 0x0044 }
        r0 = r2.f54160e;	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x0021;
    L_0x0019:
        r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList;	 Catch:{ all -> 0x0044 }
        r1 = 4;
        r0.<init>(r1);	 Catch:{ all -> 0x0044 }
        r2.f54160e = r0;	 Catch:{ all -> 0x0044 }
    L_0x0021:
        r3 = io.reactivex.internal.util.NotificationLite.error(r3);	 Catch:{ all -> 0x0044 }
        r1 = r2.f54157b;	 Catch:{ all -> 0x0044 }
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
        r2.f54161f = r1;	 Catch:{ all -> 0x0044 }
        r2.f54159d = r1;	 Catch:{ all -> 0x0044 }
        r1 = 0;
    L_0x0037:
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x003e;
    L_0x003a:
        io.reactivex.p079d.C2667a.a(r3);
        return;
    L_0x003e:
        r0 = r2.f54156a;
        r0.onError(r3);
        return;
    L_0x0044:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.d.onError(java.lang.Throwable):void");
    }

    public void onComplete() {
        if (!this.f54161f) {
            synchronized (this) {
                if (this.f54161f) {
                } else if (this.f54159d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f54160e;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f54160e = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m58956a(NotificationLite.complete());
                } else {
                    this.f54161f = true;
                    this.f54159d = true;
                    this.f54156a.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    void m63758a() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f54160e;
                if (appendOnlyLinkedArrayList == null) {
                    this.f54159d = false;
                    return;
                }
                this.f54160e = null;
            }
        } while (!appendOnlyLinkedArrayList.m58957a(this.f54156a));
    }
}
