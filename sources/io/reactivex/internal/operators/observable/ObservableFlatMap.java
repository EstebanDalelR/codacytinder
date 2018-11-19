package io.reactivex.internal.operators.observable;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p079d.C2667a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMap<T, U> extends C18394a<T, U> {
    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends U>> f58923b;
    /* renamed from: c */
    final boolean f58924c;
    /* renamed from: d */
    final int f58925d;
    /* renamed from: e */
    final int f58926e;

    static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        /* renamed from: a */
        final long f53437a;
        /* renamed from: b */
        final MergeObserver<T, U> f53438b;
        /* renamed from: c */
        volatile boolean f53439c;
        /* renamed from: d */
        volatile SimpleQueue<U> f53440d;
        /* renamed from: e */
        int f53441e;

        InnerObserver(MergeObserver<T, U> mergeObserver, long j) {
            this.f53437a = j;
            this.f53438b = mergeObserver;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int requestFusion = queueDisposable.requestFusion(7);
                if (requestFusion == 1) {
                    this.f53441e = requestFusion;
                    this.f53440d = queueDisposable;
                    this.f53439c = true;
                    this.f53438b.m63542a();
                } else if (requestFusion == 2) {
                    this.f53441e = requestFusion;
                    this.f53440d = queueDisposable;
                }
            }
        }

        public void onNext(U u) {
            if (this.f53441e == 0) {
                this.f53438b.m63544a(u, this);
            } else {
                this.f53438b.m63542a();
            }
        }

        public void onError(Throwable th) {
            if (this.f53438b.f53451h.m58961a(th)) {
                if (this.f53438b.f53446c == null) {
                    this.f53438b.m63550d();
                }
                this.f53439c = true;
                this.f53438b.m63542a();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f53439c = true;
            this.f53438b.m63542a();
        }

        /* renamed from: a */
        public void m63541a() {
            DisposableHelper.dispose(this);
        }
    }

    static final class MergeObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        /* renamed from: k */
        static final InnerObserver<?, ?>[] f53442k = new InnerObserver[0];
        /* renamed from: l */
        static final InnerObserver<?, ?>[] f53443l = new InnerObserver[0];
        private static final long serialVersionUID = -2117620485640801370L;
        /* renamed from: a */
        final Observer<? super U> f53444a;
        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<? extends U>> f53445b;
        /* renamed from: c */
        final boolean f53446c;
        /* renamed from: d */
        final int f53447d;
        /* renamed from: e */
        final int f53448e;
        /* renamed from: f */
        volatile SimplePlainQueue<U> f53449f;
        /* renamed from: g */
        volatile boolean f53450g;
        /* renamed from: h */
        final AtomicThrowable f53451h = new AtomicThrowable();
        /* renamed from: i */
        volatile boolean f53452i;
        /* renamed from: j */
        final AtomicReference<InnerObserver<?, ?>[]> f53453j;
        /* renamed from: m */
        Disposable f53454m;
        /* renamed from: n */
        long f53455n;
        /* renamed from: o */
        long f53456o;
        /* renamed from: p */
        int f53457p;
        /* renamed from: q */
        Queue<ObservableSource<? extends U>> f53458q;
        /* renamed from: r */
        int f53459r;

        MergeObserver(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
            this.f53444a = observer;
            this.f53445b = function;
            this.f53446c = z;
            this.f53447d = i;
            this.f53448e = i2;
            if (i != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                this.f53458q = new ArrayDeque(i);
            }
            this.f53453j = new AtomicReference(f53442k);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53454m, disposable)) {
                this.f53454m = disposable;
                this.f53444a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53450g) {
                try {
                    ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f53445b.apply(t), "The mapper returned a null ObservableSource");
                    if (this.f53447d != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                        synchronized (this) {
                            if (this.f53459r == this.f53447d) {
                                this.f53458q.offer(observableSource);
                                return;
                            }
                            this.f53459r++;
                        }
                    }
                    m63543a(observableSource);
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53454m.dispose();
                    onError(t2);
                }
            }
        }

        /* renamed from: a */
        void m63543a(ObservableSource<? extends U> observableSource) {
            while (observableSource instanceof Callable) {
                m63545a((Callable) observableSource);
                if (this.f53447d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        observableSource = (ObservableSource) this.f53458q.poll();
                        if (observableSource == null) {
                            this.f53459r--;
                            return;
                        }
                    }
                }
                return;
            }
            long j = this.f53455n;
            this.f53455n = j + 1;
            InnerObserver innerObserver = new InnerObserver(this, j);
            if (m63546a(innerObserver)) {
                observableSource.subscribe(innerObserver);
            }
        }

        /* renamed from: a */
        boolean m63546a(InnerObserver<T, U> innerObserver) {
            InnerObserver[] innerObserverArr;
            Object obj;
            do {
                innerObserverArr = (InnerObserver[]) this.f53453j.get();
                if (innerObserverArr == f53443l) {
                    innerObserver.m63541a();
                    return false;
                }
                int length = innerObserverArr.length;
                obj = new InnerObserver[(length + 1)];
                System.arraycopy(innerObserverArr, 0, obj, 0, length);
                obj[length] = innerObserver;
            } while (!this.f53453j.compareAndSet(innerObserverArr, obj));
            return true;
        }

        /* renamed from: b */
        void m63548b(InnerObserver<T, U> innerObserver) {
            InnerObserver[] innerObserverArr;
            Object obj;
            do {
                innerObserverArr = (InnerObserver[]) this.f53453j.get();
                int length = innerObserverArr.length;
                if (length != 0) {
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (innerObserverArr[i2] == innerObserver) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f53442k;
                        } else {
                            Object obj2 = new InnerObserver[(length - 1)];
                            System.arraycopy(innerObserverArr, 0, obj2, 0, i);
                            System.arraycopy(innerObserverArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
                return;
            } while (!this.f53453j.compareAndSet(innerObserverArr, obj));
        }

        /* renamed from: a */
        void m63545a(Callable<? extends U> callable) {
            try {
                callable = callable.call();
                if (callable != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.f53444a.onNext(callable);
                        if (decrementAndGet() == null) {
                            return;
                        }
                    }
                    SimplePlainQueue simplePlainQueue = this.f53449f;
                    if (simplePlainQueue == null) {
                        if (this.f53447d == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                            simplePlainQueue = new C18423a(this.f53448e);
                        } else {
                            simplePlainQueue = new SpscArrayQueue(this.f53447d);
                        }
                        this.f53449f = simplePlainQueue;
                    }
                    if (simplePlainQueue.offer(callable) == null) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != null) {
                        return;
                    }
                    m63547b();
                }
            } catch (Callable<? extends U> callable2) {
                C15678a.m58850b(callable2);
                this.f53451h.m58961a(callable2);
                m63542a();
            }
        }

        /* renamed from: a */
        void m63544a(U u, InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f53444a.onNext(u);
                if (decrementAndGet() == null) {
                    return;
                }
            }
            SimpleQueue simpleQueue = innerObserver.f53440d;
            if (simpleQueue == null) {
                simpleQueue = new C18423a(this.f53448e);
                innerObserver.f53440d = simpleQueue;
            }
            simpleQueue.offer(u);
            if (getAndIncrement() != null) {
                return;
            }
            m63547b();
        }

        public void onError(Throwable th) {
            if (this.f53450g) {
                C2667a.a(th);
                return;
            }
            if (this.f53451h.m58961a(th)) {
                this.f53450g = true;
                m63542a();
            } else {
                C2667a.a(th);
            }
        }

        public void onComplete() {
            if (!this.f53450g) {
                this.f53450g = true;
                m63542a();
            }
        }

        public void dispose() {
            if (!this.f53452i) {
                this.f53452i = true;
                if (m63550d()) {
                    Throwable a = this.f53451h.m58960a();
                    if (a != null && a != ExceptionHelper.f48655a) {
                        C2667a.a(a);
                    }
                }
            }
        }

        public boolean isDisposed() {
            return this.f53452i;
        }

        /* renamed from: a */
        void m63542a() {
            if (getAndIncrement() == 0) {
                m63547b();
            }
        }

        /* renamed from: b */
        void m63547b() {
            Observer observer = this.f53444a;
            int i = 1;
            while (!m63549c()) {
                SimplePlainQueue simplePlainQueue = this.f53449f;
                if (simplePlainQueue != null) {
                    while (!m63549c()) {
                        Object poll = simplePlainQueue.poll();
                        if (poll != null) {
                            observer.onNext(poll);
                        } else if (poll == null) {
                        }
                    }
                    return;
                }
                boolean z = this.f53450g;
                SimplePlainQueue simplePlainQueue2 = this.f53449f;
                InnerObserver[] innerObserverArr = (InnerObserver[]) this.f53453j.get();
                int length = innerObserverArr.length;
                if (z && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    Throwable a = this.f53451h.m58960a();
                    if (a != ExceptionHelper.f48655a) {
                        if (a == null) {
                            observer.onComplete();
                        } else {
                            observer.onError(a);
                        }
                    }
                    return;
                }
                Object obj = null;
                if (length != 0) {
                    long j = this.f53456o;
                    int i2 = this.f53457p;
                    if (length <= i2 || innerObserverArr[i2].f53437a != j) {
                        if (length <= i2) {
                            i2 = 0;
                        }
                        int i3 = i2;
                        for (i2 = 0; i2 < length; i2++) {
                            if (innerObserverArr[i3].f53437a == j) {
                                break;
                            }
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                            }
                        }
                        this.f53457p = i3;
                        this.f53456o = innerObserverArr[i3].f53437a;
                        i2 = i3;
                    }
                    int i4 = i2;
                    i2 = 0;
                    Object obj2 = null;
                    while (i2 < length) {
                        if (!m63549c()) {
                            InnerObserver innerObserver = innerObserverArr[i4];
                            while (!m63549c()) {
                                SimpleQueue simpleQueue = innerObserver.f53440d;
                                if (simpleQueue != null) {
                                    Object poll2;
                                    while (true) {
                                        try {
                                            poll2 = simpleQueue.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            observer.onNext(poll2);
                                            if (m63549c()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C15678a.m58850b(th);
                                            innerObserver.m63541a();
                                            this.f53451h.m58961a(th);
                                            if (!m63549c()) {
                                                m63548b(innerObserver);
                                                i2++;
                                                obj2 = 1;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    if (poll2 == null) {
                                    }
                                }
                                boolean z2 = innerObserver.f53439c;
                                SimpleQueue simpleQueue2 = innerObserver.f53440d;
                                if (z2 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                    m63548b(innerObserver);
                                    if (!m63549c()) {
                                        obj2 = 1;
                                    } else {
                                        return;
                                    }
                                }
                                i4++;
                                if (i4 == length) {
                                    i4 = 0;
                                }
                                i2++;
                            }
                            return;
                        }
                        return;
                    }
                    this.f53457p = i4;
                    this.f53456o = innerObserverArr[i4].f53437a;
                    obj = obj2;
                }
                if (obj == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (this.f53447d != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    synchronized (this) {
                        ObservableSource observableSource = (ObservableSource) this.f53458q.poll();
                        if (observableSource == null) {
                            this.f53459r--;
                        } else {
                            m63543a(observableSource);
                        }
                    }
                } else {
                    continue;
                }
            }
        }

        /* renamed from: c */
        boolean m63549c() {
            if (this.f53452i) {
                return true;
            }
            Throwable th = (Throwable) this.f53451h.get();
            if (this.f53446c || th == null) {
                return false;
            }
            m63550d();
            th = this.f53451h.m58960a();
            if (th != ExceptionHelper.f48655a) {
                this.f53444a.onError(th);
            }
            return true;
        }

        /* renamed from: d */
        boolean m63550d() {
            this.f53454m.dispose();
            int i = 0;
            if (((InnerObserver[]) this.f53453j.get()) != f53443l) {
                InnerObserver[] innerObserverArr = (InnerObserver[]) this.f53453j.getAndSet(f53443l);
                if (innerObserverArr != f53443l) {
                    int length = innerObserverArr.length;
                    while (i < length) {
                        innerObserverArr[i].m63541a();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public ObservableFlatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
        super(observableSource);
        this.f58923b = function;
        this.f58924c = z;
        this.f58925d = i;
        this.f58926e = i2;
    }

    public void subscribeActual(Observer<? super U> observer) {
        if (!ObservableScalarXMap.m58934a(this.a, observer, this.f58923b)) {
            this.a.subscribe(new MergeObserver(observer, this.f58923b, this.f58924c, this.f58925d, this.f58926e));
        }
    }
}
