package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableWindow<T> extends C18394a<T, C3959e<T>> {
    /* renamed from: b */
    final long f59012b;
    /* renamed from: c */
    final long f59013c;
    /* renamed from: d */
    final int f59014d;

    static final class WindowExactObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        /* renamed from: a */
        final Observer<? super C3959e<T>> f53803a;
        /* renamed from: b */
        final long f53804b;
        /* renamed from: c */
        final int f53805c;
        /* renamed from: d */
        long f53806d;
        /* renamed from: e */
        Disposable f53807e;
        /* renamed from: f */
        UnicastSubject<T> f53808f;
        /* renamed from: g */
        volatile boolean f53809g;

        WindowExactObserver(Observer<? super C3959e<T>> observer, long j, int i) {
            this.f53803a = observer;
            this.f53804b = j;
            this.f53805c = i;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53807e, disposable)) {
                this.f53807e = disposable;
                this.f53803a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            UnicastSubject unicastSubject = this.f53808f;
            if (unicastSubject == null && !this.f53809g) {
                unicastSubject = UnicastSubject.m67687a(this.f53805c, (Runnable) this);
                this.f53808f = unicastSubject;
                this.f53803a.onNext(unicastSubject);
            }
            if (unicastSubject != null) {
                unicastSubject.onNext(t);
                long j = this.f53806d + 1;
                this.f53806d = j;
                if (j >= this.f53804b) {
                    this.f53806d = 0;
                    this.f53808f = null;
                    unicastSubject.onComplete();
                    if (this.f53809g != null) {
                        this.f53807e.dispose();
                    }
                }
            }
        }

        public void onError(Throwable th) {
            UnicastSubject unicastSubject = this.f53808f;
            if (unicastSubject != null) {
                this.f53808f = null;
                unicastSubject.onError(th);
            }
            this.f53803a.onError(th);
        }

        public void onComplete() {
            UnicastSubject unicastSubject = this.f53808f;
            if (unicastSubject != null) {
                this.f53808f = null;
                unicastSubject.onComplete();
            }
            this.f53803a.onComplete();
        }

        public void dispose() {
            this.f53809g = true;
        }

        public boolean isDisposed() {
            return this.f53809g;
        }

        public void run() {
            if (this.f53809g) {
                this.f53807e.dispose();
            }
        }
    }

    static final class WindowSkipObserver<T> extends AtomicBoolean implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        /* renamed from: a */
        final Observer<? super C3959e<T>> f53810a;
        /* renamed from: b */
        final long f53811b;
        /* renamed from: c */
        final long f53812c;
        /* renamed from: d */
        final int f53813d;
        /* renamed from: e */
        final ArrayDeque<UnicastSubject<T>> f53814e;
        /* renamed from: f */
        long f53815f;
        /* renamed from: g */
        volatile boolean f53816g;
        /* renamed from: h */
        long f53817h;
        /* renamed from: i */
        Disposable f53818i;
        /* renamed from: j */
        final AtomicInteger f53819j = new AtomicInteger();

        WindowSkipObserver(Observer<? super C3959e<T>> observer, long j, long j2, int i) {
            this.f53810a = observer;
            this.f53811b = j;
            this.f53812c = j2;
            this.f53813d = i;
            this.f53814e = new ArrayDeque();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53818i, disposable)) {
                this.f53818i = disposable;
                this.f53810a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            ArrayDeque arrayDeque = this.f53814e;
            long j = this.f53815f;
            long j2 = this.f53812c;
            if (j % j2 == 0 && !this.f53816g) {
                this.f53819j.getAndIncrement();
                UnicastSubject a = UnicastSubject.m67687a(this.f53813d, (Runnable) this);
                arrayDeque.offer(a);
                this.f53810a.onNext(a);
            }
            long j3 = this.f53817h + 1;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((UnicastSubject) it.next()).onNext(t);
            }
            if (j3 >= this.f53811b) {
                ((UnicastSubject) arrayDeque.poll()).onComplete();
                if (arrayDeque.isEmpty() == null || this.f53816g == null) {
                    this.f53817h = j3 - j2;
                } else {
                    this.f53818i.dispose();
                    return;
                }
            }
            this.f53817h = j3;
            this.f53815f = j + 1;
        }

        public void onError(Throwable th) {
            ArrayDeque arrayDeque = this.f53814e;
            while (!arrayDeque.isEmpty()) {
                ((UnicastSubject) arrayDeque.poll()).onError(th);
            }
            this.f53810a.onError(th);
        }

        public void onComplete() {
            ArrayDeque arrayDeque = this.f53814e;
            while (!arrayDeque.isEmpty()) {
                ((UnicastSubject) arrayDeque.poll()).onComplete();
            }
            this.f53810a.onComplete();
        }

        public void dispose() {
            this.f53816g = true;
        }

        public boolean isDisposed() {
            return this.f53816g;
        }

        public void run() {
            if (this.f53819j.decrementAndGet() == 0 && this.f53816g) {
                this.f53818i.dispose();
            }
        }
    }

    public ObservableWindow(ObservableSource<T> observableSource, long j, long j2, int i) {
        super(observableSource);
        this.f59012b = j;
        this.f59013c = j2;
        this.f59014d = i;
    }

    public void subscribeActual(Observer<? super C3959e<T>> observer) {
        if (this.f59012b == this.f59013c) {
            this.a.subscribe(new WindowExactObserver(observer, this.f59012b, this.f59014d));
            return;
        }
        this.a.subscribe(new WindowSkipObserver(observer, this.f59012b, this.f59013c, this.f59014d));
    }
}
