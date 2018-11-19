package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.p491c.C18341b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableGroupBy<T, K, V> extends C18394a<T, C18341b<K, V>> {
    /* renamed from: b */
    final Function<? super T, ? extends K> f58934b;
    /* renamed from: c */
    final Function<? super T, ? extends V> f58935c;
    /* renamed from: d */
    final int f58936d;
    /* renamed from: e */
    final boolean f58937e;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements Observer<T>, Disposable {
        /* renamed from: g */
        static final Object f53489g = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        /* renamed from: a */
        final Observer<? super C18341b<K, V>> f53490a;
        /* renamed from: b */
        final Function<? super T, ? extends K> f53491b;
        /* renamed from: c */
        final Function<? super T, ? extends V> f53492c;
        /* renamed from: d */
        final int f53493d;
        /* renamed from: e */
        final boolean f53494e;
        /* renamed from: f */
        final Map<Object, C19017a<K, V>> f53495f;
        /* renamed from: h */
        Disposable f53496h;
        /* renamed from: i */
        final AtomicBoolean f53497i = new AtomicBoolean();

        public GroupByObserver(Observer<? super C18341b<K, V>> observer, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i, boolean z) {
            this.f53490a = observer;
            this.f53491b = function;
            this.f53492c = function2;
            this.f53493d = i;
            this.f53494e = z;
            this.f53495f = new ConcurrentHashMap();
            lazySet(1);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53496h, disposable)) {
                this.f53496h = disposable;
                this.f53490a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            try {
                Object obj;
                Object apply = this.f53491b.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = f53489g;
                }
                C19017a c19017a = (C19017a) this.f53495f.get(obj);
                if (c19017a == null) {
                    if (!this.f53497i.get()) {
                        c19017a = C19017a.m67625a(apply, this.f53493d, this, this.f53494e);
                        this.f53495f.put(obj, c19017a);
                        getAndIncrement();
                        this.f53490a.onNext(c19017a);
                    } else {
                        return;
                    }
                }
                try {
                    c19017a.m67627a(C15684a.m58895a(this.f53492c.apply(t), "The value supplied is null"));
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53496h.dispose();
                    onError(t2);
                }
            } catch (T t22) {
                C15678a.m58850b(t22);
                this.f53496h.dispose();
                onError(t22);
            }
        }

        public void onError(Throwable th) {
            List<C19017a> arrayList = new ArrayList(this.f53495f.values());
            this.f53495f.clear();
            for (C19017a a : arrayList) {
                a.m67628a(th);
            }
            this.f53490a.onError(th);
        }

        public void onComplete() {
            List<C19017a> arrayList = new ArrayList(this.f53495f.values());
            this.f53495f.clear();
            for (C19017a a : arrayList) {
                a.m67626a();
            }
            this.f53490a.onComplete();
        }

        public void dispose() {
            if (this.f53497i.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f53496h.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f53497i.get();
        }

        /* renamed from: a */
        public void m63566a(K k) {
            if (k == null) {
                k = f53489g;
            }
            this.f53495f.remove(k);
            if (decrementAndGet() == null) {
                this.f53496h.dispose();
            }
        }
    }

    static final class State<T, K> extends AtomicInteger implements ObservableSource<T>, Disposable {
        private static final long serialVersionUID = -3852313036005250360L;
        /* renamed from: a */
        final K f53498a;
        /* renamed from: b */
        final C18423a<T> f53499b;
        /* renamed from: c */
        final GroupByObserver<?, K, T> f53500c;
        /* renamed from: d */
        final boolean f53501d;
        /* renamed from: e */
        volatile boolean f53502e;
        /* renamed from: f */
        Throwable f53503f;
        /* renamed from: g */
        final AtomicBoolean f53504g = new AtomicBoolean();
        /* renamed from: h */
        final AtomicBoolean f53505h = new AtomicBoolean();
        /* renamed from: i */
        final AtomicReference<Observer<? super T>> f53506i = new AtomicReference();

        State(int i, GroupByObserver<?, K, T> groupByObserver, K k, boolean z) {
            this.f53499b = new C18423a(i);
            this.f53500c = groupByObserver;
            this.f53498a = k;
            this.f53501d = z;
        }

        public void dispose() {
            if (this.f53504g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f53506i.lazySet(null);
                this.f53500c.m63566a(this.f53498a);
            }
        }

        public boolean isDisposed() {
            return this.f53504g.get();
        }

        public void subscribe(Observer<? super T> observer) {
            if (this.f53505h.compareAndSet(false, true)) {
                observer.onSubscribe(this);
                this.f53506i.lazySet(observer);
                if (this.f53504g.get() != null) {
                    this.f53506i.lazySet(null);
                    return;
                } else {
                    m63571b();
                    return;
                }
            }
            EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), (Observer) observer);
        }

        /* renamed from: a */
        public void m63568a(T t) {
            this.f53499b.offer(t);
            m63571b();
        }

        /* renamed from: a */
        public void m63569a(Throwable th) {
            this.f53503f = th;
            this.f53502e = true;
            m63571b();
        }

        /* renamed from: a */
        public void m63567a() {
            this.f53502e = true;
            m63571b();
        }

        /* renamed from: b */
        void m63571b() {
            if (getAndIncrement() == 0) {
                C18423a c18423a = this.f53499b;
                boolean z = this.f53501d;
                Observer observer = (Observer) this.f53506i.get();
                int i = 1;
                while (true) {
                    if (observer != null) {
                        while (true) {
                            boolean z2 = this.f53502e;
                            Object poll = c18423a.poll();
                            boolean z3 = poll == null;
                            if (!m63570a(z2, z3, observer, z)) {
                                if (z3) {
                                    break;
                                }
                                observer.onNext(poll);
                            } else {
                                return;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i != 0) {
                        if (observer == null) {
                            observer = (Observer) this.f53506i.get();
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        boolean m63570a(boolean z, boolean z2, Observer<? super T> observer, boolean z3) {
            if (this.f53504g.get()) {
                this.f53499b.clear();
                this.f53500c.m63566a(this.f53498a);
                this.f53506i.lazySet(null);
                return true;
            }
            if (z) {
                if (!z3) {
                    z = this.f53503f;
                    if (z) {
                        this.f53499b.clear();
                        this.f53506i.lazySet(null);
                        observer.onError(z);
                        return true;
                    } else if (z2) {
                        this.f53506i.lazySet(null);
                        observer.onComplete();
                        return true;
                    }
                } else if (z2) {
                    z = this.f53503f;
                    this.f53506i.lazySet(null);
                    if (z) {
                        observer.onError(z);
                    } else {
                        observer.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy$a */
    static final class C19017a<K, T> extends C18341b<K, T> {
        /* renamed from: a */
        final State<T, K> f58933a;

        /* renamed from: a */
        public static <T, K> C19017a<K, T> m67625a(K k, int i, GroupByObserver<?, K, T> groupByObserver, boolean z) {
            return new C19017a(k, new State(i, groupByObserver, k, z));
        }

        protected C19017a(K k, State<T, K> state) {
            super(k);
            this.f58933a = state;
        }

        protected void subscribeActual(Observer<? super T> observer) {
            this.f58933a.subscribe(observer);
        }

        /* renamed from: a */
        public void m67627a(T t) {
            this.f58933a.m63568a((Object) t);
        }

        /* renamed from: a */
        public void m67628a(Throwable th) {
            this.f58933a.m63569a(th);
        }

        /* renamed from: a */
        public void m67626a() {
            this.f58933a.m63567a();
        }
    }

    public ObservableGroupBy(ObservableSource<T> observableSource, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i, boolean z) {
        super(observableSource);
        this.f58934b = function;
        this.f58935c = function2;
        this.f58936d = i;
        this.f58937e = z;
    }

    public void subscribeActual(Observer<? super C18341b<K, V>> observer) {
        this.a.subscribe(new GroupByObserver(observer, this.f58934b, this.f58935c, this.f58936d, this.f58937e));
    }
}
