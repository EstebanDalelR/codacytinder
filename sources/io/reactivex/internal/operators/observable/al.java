package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C19002b;
import java.util.Iterator;

public final class al<T> extends C3959e<T> {
    /* renamed from: a */
    final Iterable<? extends T> f57243a;

    /* renamed from: io.reactivex.internal.operators.observable.al$a */
    static final class C19185a<T> extends C19002b<T> {
        /* renamed from: a */
        final Observer<? super T> f59550a;
        /* renamed from: b */
        final Iterator<? extends T> f59551b;
        /* renamed from: c */
        volatile boolean f59552c;
        /* renamed from: d */
        boolean f59553d;
        /* renamed from: e */
        boolean f59554e;
        /* renamed from: f */
        boolean f59555f;

        C19185a(Observer<? super T> observer, Iterator<? extends T> it) {
            this.f59550a = observer;
            this.f59551b = it;
        }

        /* renamed from: a */
        void m68219a() {
            while (!isDisposed()) {
                try {
                    this.f59550a.onNext(C15684a.m58895a(this.f59551b.next(), "The iterator returned a null value"));
                    if (!isDisposed()) {
                        try {
                            if (!this.f59551b.hasNext()) {
                                if (!isDisposed()) {
                                    this.f59550a.onComplete();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C15678a.m58850b(th);
                            this.f59550a.onError(th);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    C15678a.m58850b(th2);
                    this.f59550a.onError(th2);
                    return;
                }
            }
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f59553d = true;
            return 1;
        }

        @Nullable
        public T poll() {
            if (this.f59554e) {
                return null;
            }
            if (!this.f59555f) {
                this.f59555f = true;
            } else if (!this.f59551b.hasNext()) {
                this.f59554e = true;
                return null;
            }
            return C15684a.m58895a(this.f59551b.next(), "The iterator returned a null value");
        }

        public boolean isEmpty() {
            return this.f59554e;
        }

        public void clear() {
            this.f59554e = true;
        }

        public void dispose() {
            this.f59552c = true;
        }

        public boolean isDisposed() {
            return this.f59552c;
        }
    }

    public al(Iterable<? extends T> iterable) {
        this.f57243a = iterable;
    }

    public void subscribeActual(Observer<? super T> observer) {
        try {
            Iterator it = this.f57243a.iterator();
            try {
                if (it.hasNext()) {
                    C19185a c19185a = new C19185a(observer, it);
                    observer.onSubscribe(c19185a);
                    if (c19185a.f59553d == null) {
                        c19185a.m68219a();
                    }
                    return;
                }
                EmptyDisposable.complete((Observer) observer);
            } catch (Throwable th) {
                C15678a.m58850b(th);
                EmptyDisposable.error(th, (Observer) observer);
            }
        } catch (Throwable th2) {
            C15678a.m58850b(th2);
            EmptyDisposable.error(th2, (Observer) observer);
        }
    }
}
