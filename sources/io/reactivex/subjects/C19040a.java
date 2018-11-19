package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: io.reactivex.subjects.a */
public final class C19040a<T> extends C18432c<T> {
    /* renamed from: c */
    static final C18431a[] f59150c = new C18431a[0];
    /* renamed from: d */
    static final C18431a[] f59151d = new C18431a[0];
    /* renamed from: j */
    private static final Object[] f59152j = new Object[0];
    /* renamed from: a */
    final AtomicReference<Object> f59153a;
    /* renamed from: b */
    final AtomicReference<C18431a<T>[]> f59154b;
    /* renamed from: e */
    final ReadWriteLock f59155e;
    /* renamed from: f */
    final Lock f59156f;
    /* renamed from: g */
    final Lock f59157g;
    /* renamed from: h */
    final AtomicReference<Throwable> f59158h;
    /* renamed from: i */
    long f59159i;

    /* renamed from: io.reactivex.subjects.a$a */
    static final class C18431a<T> implements Disposable, NonThrowingPredicate<Object> {
        /* renamed from: a */
        final Observer<? super T> f57427a;
        /* renamed from: b */
        final C19040a<T> f57428b;
        /* renamed from: c */
        boolean f57429c;
        /* renamed from: d */
        boolean f57430d;
        /* renamed from: e */
        AppendOnlyLinkedArrayList<Object> f57431e;
        /* renamed from: f */
        boolean f57432f;
        /* renamed from: g */
        volatile boolean f57433g;
        /* renamed from: h */
        long f57434h;

        C18431a(Observer<? super T> observer, C19040a<T> c19040a) {
            this.f57427a = observer;
            this.f57428b = c19040a;
        }

        public void dispose() {
            if (!this.f57433g) {
                this.f57433g = true;
                this.f57428b.m67698b(this);
            }
        }

        public boolean isDisposed() {
            return this.f57433g;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m66608a() {
            /*
            r4 = this;
            r0 = r4.f57433g;
            if (r0 == 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            monitor-enter(r4);
            r0 = r4.f57433g;	 Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000c;
        L_0x000a:
            monitor-exit(r4);	 Catch:{ all -> 0x003e }
            return;
        L_0x000c:
            r0 = r4.f57429c;	 Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0012;
        L_0x0010:
            monitor-exit(r4);	 Catch:{ all -> 0x003e }
            return;
        L_0x0012:
            r0 = r4.f57428b;	 Catch:{ all -> 0x003e }
            r1 = r0.f59156f;	 Catch:{ all -> 0x003e }
            r1.lock();	 Catch:{ all -> 0x003e }
            r2 = r0.f59159i;	 Catch:{ all -> 0x003e }
            r4.f57434h = r2;	 Catch:{ all -> 0x003e }
            r0 = r0.f59153a;	 Catch:{ all -> 0x003e }
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
            r4.f57430d = r2;	 Catch:{ all -> 0x003e }
            r4.f57429c = r1;	 Catch:{ all -> 0x003e }
            monitor-exit(r4);	 Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d;
        L_0x0033:
            r0 = r4.test(r0);
            if (r0 == 0) goto L_0x003a;
        L_0x0039:
            return;
        L_0x003a:
            r4.m66610b();
        L_0x003d:
            return;
        L_0x003e:
            r0 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x003e }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.a.a.a():void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m66609a(java.lang.Object r4, long r5) {
            /*
            r3 = this;
            r0 = r3.f57433g;
            if (r0 == 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            r0 = r3.f57432f;
            if (r0 != 0) goto L_0x0037;
        L_0x0009:
            monitor-enter(r3);
            r0 = r3.f57433g;	 Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0010;
        L_0x000e:
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            return;
        L_0x0010:
            r0 = r3.f57434h;	 Catch:{ all -> 0x0034 }
            r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
            if (r2 != 0) goto L_0x0018;
        L_0x0016:
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            return;
        L_0x0018:
            r5 = r3.f57430d;	 Catch:{ all -> 0x0034 }
            if (r5 == 0) goto L_0x002d;
        L_0x001c:
            r5 = r3.f57431e;	 Catch:{ all -> 0x0034 }
            if (r5 != 0) goto L_0x0028;
        L_0x0020:
            r5 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList;	 Catch:{ all -> 0x0034 }
            r6 = 4;
            r5.<init>(r6);	 Catch:{ all -> 0x0034 }
            r3.f57431e = r5;	 Catch:{ all -> 0x0034 }
        L_0x0028:
            r5.m58956a(r4);	 Catch:{ all -> 0x0034 }
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            return;
        L_0x002d:
            r5 = 1;
            r3.f57429c = r5;	 Catch:{ all -> 0x0034 }
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            r3.f57432f = r5;
            goto L_0x0037;
        L_0x0034:
            r4 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0034 }
            throw r4;
        L_0x0037:
            r3.test(r4);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.a.a.a(java.lang.Object, long):void");
        }

        public boolean test(Object obj) {
            if (!this.f57433g) {
                if (NotificationLite.accept(obj, this.f57427a) == null) {
                    return null;
                }
            }
            return true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        void m66610b() {
            /*
            r2 = this;
        L_0x0000:
            r0 = r2.f57433g;
            if (r0 == 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            monitor-enter(r2);
            r0 = r2.f57431e;	 Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x000f;
        L_0x000a:
            r0 = 0;
            r2.f57430d = r0;	 Catch:{ all -> 0x0017 }
            monitor-exit(r2);	 Catch:{ all -> 0x0017 }
            return;
        L_0x000f:
            r1 = 0;
            r2.f57431e = r1;	 Catch:{ all -> 0x0017 }
            monitor-exit(r2);	 Catch:{ all -> 0x0017 }
            r0.m58955a(r2);
            goto L_0x0000;
        L_0x0017:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0017 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.a.a.b():void");
        }
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> C19040a<T> m67694a() {
        return new C19040a();
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> C19040a<T> m67695a(T t) {
        return new C19040a(t);
    }

    C19040a() {
        this.f59155e = new ReentrantReadWriteLock();
        this.f59156f = this.f59155e.readLock();
        this.f59157g = this.f59155e.writeLock();
        this.f59154b = new AtomicReference(f59150c);
        this.f59153a = new AtomicReference();
        this.f59158h = new AtomicReference();
    }

    C19040a(T t) {
        this();
        this.f59153a.lazySet(C15684a.m58895a((Object) t, "defaultValue is null"));
    }

    protected void subscribeActual(Observer<? super T> observer) {
        C18431a c18431a = new C18431a(observer, this);
        observer.onSubscribe(c18431a);
        if (!m67696a(c18431a)) {
            Throwable th = (Throwable) this.f59158h.get();
            if (th == ExceptionHelper.f48655a) {
                observer.onComplete();
            } else {
                observer.onError(th);
            }
        } else if (c18431a.f57433g != null) {
            m67698b(c18431a);
        } else {
            c18431a.m66608a();
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f59158h.get() != null) {
            disposable.dispose();
        }
    }

    public void onNext(T t) {
        C15684a.m58895a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f59158h.get() == null) {
            t = NotificationLite.next(t);
            m67700c(t);
            for (C18431a a : (C18431a[]) this.f59154b.get()) {
                a.m66609a(t, this.f59159i);
            }
        }
    }

    public void onError(Throwable th) {
        C15684a.m58895a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f59158h.compareAndSet(null, th)) {
            Object error = NotificationLite.error(th);
            for (C18431a a : m67699b(error)) {
                a.m66609a(error, this.f59159i);
            }
            return;
        }
        C2667a.a(th);
    }

    public void onComplete() {
        if (this.f59158h.compareAndSet(null, ExceptionHelper.f48655a)) {
            Object complete = NotificationLite.complete();
            for (C18431a a : m67699b(complete)) {
                a.m66609a(complete, this.f59159i);
            }
        }
    }

    /* renamed from: b */
    public T m67697b() {
        Object obj = this.f59153a.get();
        if (!NotificationLite.isComplete(obj)) {
            if (!NotificationLite.isError(obj)) {
                return NotificationLite.getValue(obj);
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean m67701c() {
        Object obj = this.f59153a.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    /* renamed from: a */
    boolean m67696a(C18431a<T> c18431a) {
        C18431a[] c18431aArr;
        Object obj;
        do {
            c18431aArr = (C18431a[]) this.f59154b.get();
            if (c18431aArr == f59151d) {
                return false;
            }
            int length = c18431aArr.length;
            obj = new C18431a[(length + 1)];
            System.arraycopy(c18431aArr, 0, obj, 0, length);
            obj[length] = c18431a;
        } while (!this.f59154b.compareAndSet(c18431aArr, obj));
        return true;
    }

    /* renamed from: b */
    void m67698b(C18431a<T> c18431a) {
        C18431a[] c18431aArr;
        Object obj;
        do {
            c18431aArr = (C18431a[]) this.f59154b.get();
            if (c18431aArr != f59151d) {
                if (c18431aArr != f59150c) {
                    int length = c18431aArr.length;
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (c18431aArr[i2] == c18431a) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f59150c;
                        } else {
                            Object obj2 = new C18431a[(length - 1)];
                            System.arraycopy(c18431aArr, 0, obj2, 0, i);
                            System.arraycopy(c18431aArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        } while (!this.f59154b.compareAndSet(c18431aArr, obj));
    }

    /* renamed from: b */
    C18431a<T>[] m67699b(Object obj) {
        C18431a<T>[] c18431aArr = (C18431a[]) this.f59154b.get();
        if (c18431aArr != f59151d) {
            c18431aArr = (C18431a[]) this.f59154b.getAndSet(f59151d);
            if (c18431aArr != f59151d) {
                m67700c(obj);
            }
        }
        return c18431aArr;
    }

    /* renamed from: c */
    void m67700c(Object obj) {
        this.f59157g.lock();
        try {
            this.f59159i++;
            this.f59153a.lazySet(obj);
        } finally {
            this.f59157g.unlock();
        }
    }
}
