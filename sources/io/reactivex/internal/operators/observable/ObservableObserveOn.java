package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.schedulers.C17519i;
import io.reactivex.p079d.C2667a;

public final class ObservableObserveOn<T> extends C18394a<T, T> {
    /* renamed from: b */
    final C15679f f58949b;
    /* renamed from: c */
    final boolean f58950c;
    /* renamed from: d */
    final int f58951d;

    static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        /* renamed from: a */
        final Observer<? super T> f59525a;
        /* renamed from: b */
        final C17362c f59526b;
        /* renamed from: c */
        final boolean f59527c;
        /* renamed from: d */
        final int f59528d;
        /* renamed from: e */
        SimpleQueue<T> f59529e;
        /* renamed from: f */
        Disposable f59530f;
        /* renamed from: g */
        Throwable f59531g;
        /* renamed from: h */
        volatile boolean f59532h;
        /* renamed from: i */
        volatile boolean f59533i;
        /* renamed from: j */
        int f59534j;
        /* renamed from: k */
        boolean f59535k;

        ObserveOnObserver(Observer<? super T> observer, C17362c c17362c, boolean z, int i) {
            this.f59525a = observer;
            this.f59526b = c17362c;
            this.f59527c = z;
            this.f59528d = i;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59530f, disposable)) {
                this.f59530f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f59534j = requestFusion;
                        this.f59529e = queueDisposable;
                        this.f59532h = true;
                        this.f59525a.onSubscribe(this);
                        m68210a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f59534j = requestFusion;
                        this.f59529e = queueDisposable;
                        this.f59525a.onSubscribe(this);
                        return;
                    }
                }
                this.f59529e = new C18423a(this.f59528d);
                this.f59525a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f59532h) {
                if (this.f59534j != 2) {
                    this.f59529e.offer(t);
                }
                m68210a();
            }
        }

        public void onError(Throwable th) {
            if (this.f59532h) {
                C2667a.a(th);
                return;
            }
            this.f59531g = th;
            this.f59532h = true;
            m68210a();
        }

        public void onComplete() {
            if (!this.f59532h) {
                this.f59532h = true;
                m68210a();
            }
        }

        public void dispose() {
            if (!this.f59533i) {
                this.f59533i = true;
                this.f59530f.dispose();
                this.f59526b.dispose();
                if (getAndIncrement() == 0) {
                    this.f59529e.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f59533i;
        }

        /* renamed from: a */
        void m68210a() {
            if (getAndIncrement() == 0) {
                this.f59526b.mo13593a((Runnable) this);
            }
        }

        /* renamed from: b */
        void m68212b() {
            SimpleQueue simpleQueue = this.f59529e;
            Observer observer = this.f59525a;
            int i = 1;
            while (!m68211a(this.f59532h, simpleQueue.isEmpty(), observer)) {
                while (true) {
                    boolean z = this.f59532h;
                    try {
                        Object poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (!m68211a(z, z2, observer)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            }
                            observer.onNext(poll);
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        this.f59530f.dispose();
                        simpleQueue.clear();
                        observer.onError(th);
                        this.f59526b.dispose();
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        void m68213c() {
            int i = 1;
            while (!this.f59533i) {
                boolean z = this.f59532h;
                Throwable th = this.f59531g;
                if (this.f59527c || !z || th == null) {
                    this.f59525a.onNext(null);
                    if (z) {
                        Throwable th2 = this.f59531g;
                        if (th2 != null) {
                            this.f59525a.onError(th2);
                        } else {
                            this.f59525a.onComplete();
                        }
                        this.f59526b.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                this.f59525a.onError(this.f59531g);
                this.f59526b.dispose();
                return;
            }
        }

        public void run() {
            if (this.f59535k) {
                m68213c();
            } else {
                m68212b();
            }
        }

        /* renamed from: a */
        boolean m68211a(boolean z, boolean z2, Observer<? super T> observer) {
            if (this.f59533i) {
                this.f59529e.clear();
                return true;
            }
            if (z) {
                z = this.f59531g;
                if (this.f59527c) {
                    if (z2) {
                        if (z) {
                            observer.onError(z);
                        } else {
                            observer.onComplete();
                        }
                        this.f59526b.dispose();
                        return true;
                    }
                } else if (z) {
                    this.f59529e.clear();
                    observer.onError(z);
                    this.f59526b.dispose();
                    return true;
                } else if (z2) {
                    observer.onComplete();
                    this.f59526b.dispose();
                    return true;
                }
            }
            return false;
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f59535k = true;
            return 2;
        }

        @Nullable
        public T poll() throws Exception {
            return this.f59529e.poll();
        }

        public void clear() {
            this.f59529e.clear();
        }

        public boolean isEmpty() {
            return this.f59529e.isEmpty();
        }
    }

    public ObservableObserveOn(ObservableSource<T> observableSource, C15679f c15679f, boolean z, int i) {
        super(observableSource);
        this.f58949b = c15679f;
        this.f58950c = z;
        this.f58951d = i;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        if (this.f58949b instanceof C17519i) {
            this.a.subscribe(observer);
            return;
        }
        this.a.subscribe(new ObserveOnObserver(observer, this.f58949b.mo12872a(), this.f58950c, this.f58951d));
    }
}
