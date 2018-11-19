package io.reactivex.internal.operators.observable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableConcatMapCompletable<T> extends C3956a {
    /* renamed from: a */
    final ObservableSource<T> f57169a;
    /* renamed from: b */
    final Function<? super T, ? extends CompletableSource> f57170b;
    /* renamed from: c */
    final int f57171c;

    static final class SourceObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 6893587405571511048L;
        /* renamed from: a */
        final CompletableObserver f53392a;
        /* renamed from: b */
        final Function<? super T, ? extends CompletableSource> f53393b;
        /* renamed from: c */
        final InnerObserver f53394c;
        /* renamed from: d */
        final int f53395d;
        /* renamed from: e */
        SimpleQueue<T> f53396e;
        /* renamed from: f */
        Disposable f53397f;
        /* renamed from: g */
        volatile boolean f53398g;
        /* renamed from: h */
        volatile boolean f53399h;
        /* renamed from: i */
        volatile boolean f53400i;
        /* renamed from: j */
        int f53401j;

        static final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -5987419458390772447L;
            /* renamed from: a */
            final CompletableObserver f53390a;
            /* renamed from: b */
            final SourceObserver<?> f53391b;

            InnerObserver(CompletableObserver completableObserver, SourceObserver<?> sourceObserver) {
                this.f53390a = completableObserver;
                this.f53391b = sourceObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.set(this, disposable);
            }

            public void onError(Throwable th) {
                this.f53391b.dispose();
                this.f53390a.onError(th);
            }

            public void onComplete() {
                this.f53391b.m63536a();
            }

            /* renamed from: a */
            void m63535a() {
                DisposableHelper.dispose(this);
            }
        }

        SourceObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, int i) {
            this.f53392a = completableObserver;
            this.f53393b = function;
            this.f53395d = i;
            this.f53394c = new InnerObserver(completableObserver, this);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53397f, disposable)) {
                this.f53397f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f53401j = requestFusion;
                        this.f53396e = queueDisposable;
                        this.f53400i = true;
                        this.f53392a.onSubscribe(this);
                        m63537b();
                        return;
                    } else if (requestFusion == 2) {
                        this.f53401j = requestFusion;
                        this.f53396e = queueDisposable;
                        this.f53392a.onSubscribe(this);
                        return;
                    }
                }
                this.f53396e = new C18423a(this.f53395d);
                this.f53392a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53400i) {
                if (this.f53401j == 0) {
                    this.f53396e.offer(t);
                }
                m63537b();
            }
        }

        public void onError(Throwable th) {
            if (this.f53400i) {
                C2667a.a(th);
                return;
            }
            this.f53400i = true;
            dispose();
            this.f53392a.onError(th);
        }

        public void onComplete() {
            if (!this.f53400i) {
                this.f53400i = true;
                m63537b();
            }
        }

        /* renamed from: a */
        void m63536a() {
            this.f53398g = false;
            m63537b();
        }

        public boolean isDisposed() {
            return this.f53399h;
        }

        public void dispose() {
            this.f53399h = true;
            this.f53394c.m63535a();
            this.f53397f.dispose();
            if (getAndIncrement() == 0) {
                this.f53396e.clear();
            }
        }

        /* renamed from: b */
        void m63537b() {
            if (getAndIncrement() == 0) {
                while (!this.f53399h) {
                    if (!this.f53398g) {
                        boolean z = this.f53400i;
                        try {
                            Object poll = this.f53396e.poll();
                            Object obj = poll == null ? 1 : null;
                            if (z && obj != null) {
                                this.f53399h = true;
                                this.f53392a.onComplete();
                                return;
                            } else if (obj == null) {
                                try {
                                    CompletableSource completableSource = (CompletableSource) C15684a.m58895a(this.f53393b.apply(poll), "The mapper returned a null CompletableSource");
                                    this.f53398g = true;
                                    completableSource.subscribe(this.f53394c);
                                } catch (Throwable th) {
                                    C15678a.m58850b(th);
                                    dispose();
                                    this.f53396e.clear();
                                    this.f53392a.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C15678a.m58850b(th2);
                            dispose();
                            this.f53396e.clear();
                            this.f53392a.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f53396e.clear();
            }
        }
    }

    public ObservableConcatMapCompletable(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, int i) {
        this.f57169a = observableSource;
        this.f57170b = function;
        this.f57171c = Math.max(8, i);
    }

    /* renamed from: a */
    public void m66489a(CompletableObserver completableObserver) {
        this.f57169a.subscribe(new SourceObserver(completableObserver, this.f57170b, this.f57171c));
    }
}
