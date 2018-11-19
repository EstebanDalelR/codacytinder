package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Emitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;

public final class ao<T, S> extends C3959e<T> {
    /* renamed from: a */
    final Callable<S> f57248a;
    /* renamed from: b */
    final BiFunction<S, Emitter<T>, S> f57249b;
    /* renamed from: c */
    final Consumer<? super S> f57250c;

    /* renamed from: io.reactivex.internal.operators.observable.ao$a */
    static final class C17460a<T, S> implements Emitter<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53871a;
        /* renamed from: b */
        final BiFunction<S, ? super Emitter<T>, S> f53872b;
        /* renamed from: c */
        final Consumer<? super S> f53873c;
        /* renamed from: d */
        S f53874d;
        /* renamed from: e */
        volatile boolean f53875e;
        /* renamed from: f */
        boolean f53876f;
        /* renamed from: g */
        boolean f53877g;

        C17460a(Observer<? super T> observer, BiFunction<S, ? super Emitter<T>, S> biFunction, Consumer<? super S> consumer, S s) {
            this.f53871a = observer;
            this.f53872b = biFunction;
            this.f53873c = consumer;
            this.f53874d = s;
        }

        /* renamed from: a */
        public void m63707a() {
            Object obj = this.f53874d;
            if (this.f53875e) {
                this.f53874d = null;
                m63706a(obj);
                return;
            }
            BiFunction biFunction = this.f53872b;
            while (!this.f53875e) {
                this.f53877g = false;
                try {
                    Object apply = biFunction.apply(obj, this);
                    if (this.f53876f) {
                        this.f53875e = true;
                        this.f53874d = null;
                        m63706a(apply);
                        return;
                    }
                    obj = apply;
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    this.f53874d = null;
                    this.f53875e = true;
                    onError(th);
                    m63706a(obj);
                    return;
                }
            }
            this.f53874d = null;
            m63706a(obj);
        }

        /* renamed from: a */
        private void m63706a(S s) {
            try {
                this.f53873c.accept(s);
            } catch (S s2) {
                C15678a.m58850b(s2);
                C2667a.a(s2);
            }
        }

        public void dispose() {
            this.f53875e = true;
        }

        public boolean isDisposed() {
            return this.f53875e;
        }

        public void onNext(T t) {
            if (!this.f53876f) {
                if (this.f53877g) {
                    onError(new IllegalStateException("onNext already called in this generate turn"));
                } else if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f53877g = true;
                    this.f53871a.onNext(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53876f) {
                C2667a.a(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f53876f = true;
            this.f53871a.onError(th);
        }

        public void onComplete() {
            if (!this.f53876f) {
                this.f53876f = true;
                this.f53871a.onComplete();
            }
        }
    }

    public ao(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.f57248a = callable;
        this.f57249b = biFunction;
        this.f57250c = consumer;
    }

    public void subscribeActual(Observer<? super T> observer) {
        try {
            Object c17460a = new C17460a(observer, this.f57249b, this.f57250c, this.f57248a.call());
            observer.onSubscribe(c17460a);
            c17460a.m63707a();
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (Observer) observer);
        }
    }
}
