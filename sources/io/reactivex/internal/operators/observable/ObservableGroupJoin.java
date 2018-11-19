package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p079d.C2667a;
import io.reactivex.subjects.UnicastSubject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends C18394a<TLeft, R> {
    /* renamed from: b */
    final ObservableSource<? extends TRight> f58938b;
    /* renamed from: c */
    final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f58939c;
    /* renamed from: d */
    final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f58940d;
    /* renamed from: e */
    final BiFunction<? super TLeft, ? super C3959e<TRight>, ? extends R> f58941e;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableGroupJoin$a */
    interface C15698a {
        /* renamed from: a */
        void mo12903a(LeftRightObserver leftRightObserver);

        /* renamed from: a */
        void mo12904a(Throwable th);

        /* renamed from: a */
        void mo12905a(boolean z, LeftRightEndObserver leftRightEndObserver);

        /* renamed from: a */
        void mo12906a(boolean z, Object obj);

        /* renamed from: b */
        void mo12907b(Throwable th);
    }

    static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, C15698a {
        /* renamed from: n */
        static final Integer f53507n = Integer.valueOf(1);
        /* renamed from: o */
        static final Integer f53508o = Integer.valueOf(2);
        /* renamed from: p */
        static final Integer f53509p = Integer.valueOf(3);
        /* renamed from: q */
        static final Integer f53510q = Integer.valueOf(4);
        private static final long serialVersionUID = -6071216598687999801L;
        /* renamed from: a */
        final Observer<? super R> f53511a;
        /* renamed from: b */
        final C18423a<Object> f53512b = new C18423a(C3959e.bufferSize());
        /* renamed from: c */
        final C17356a f53513c = new C17356a();
        /* renamed from: d */
        final Map<Integer, UnicastSubject<TRight>> f53514d = new LinkedHashMap();
        /* renamed from: e */
        final Map<Integer, TRight> f53515e = new LinkedHashMap();
        /* renamed from: f */
        final AtomicReference<Throwable> f53516f = new AtomicReference();
        /* renamed from: g */
        final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f53517g;
        /* renamed from: h */
        final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f53518h;
        /* renamed from: i */
        final BiFunction<? super TLeft, ? super C3959e<TRight>, ? extends R> f53519i;
        /* renamed from: j */
        final AtomicInteger f53520j;
        /* renamed from: k */
        int f53521k;
        /* renamed from: l */
        int f53522l;
        /* renamed from: m */
        volatile boolean f53523m;

        GroupJoinDisposable(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super C3959e<TRight>, ? extends R> biFunction) {
            this.f53511a = observer;
            this.f53517g = function;
            this.f53518h = function2;
            this.f53519i = biFunction;
            this.f53520j = new AtomicInteger(2);
        }

        public void dispose() {
            if (!this.f53523m) {
                this.f53523m = true;
                m63572a();
                if (getAndIncrement() == 0) {
                    this.f53512b.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f53523m;
        }

        /* renamed from: a */
        void m63572a() {
            this.f53513c.dispose();
        }

        /* renamed from: a */
        void m63573a(Observer<?> observer) {
            Throwable a = ExceptionHelper.m58963a(this.f53516f);
            for (UnicastSubject onError : this.f53514d.values()) {
                onError.onError(a);
            }
            this.f53514d.clear();
            this.f53515e.clear();
            observer.onError(a);
        }

        /* renamed from: a */
        void m63576a(Throwable th, Observer<?> observer, C18423a<?> c18423a) {
            C15678a.m58850b(th);
            ExceptionHelper.m58964a(this.f53516f, th);
            c18423a.clear();
            m63572a();
            m63573a((Observer) observer);
        }

        /* renamed from: b */
        void m63579b() {
            if (getAndIncrement() == 0) {
                C18423a c18423a = this.f53512b;
                Observer observer = this.f53511a;
                int i = 1;
                while (!this.f53523m) {
                    if (((Throwable) this.f53516f.get()) != null) {
                        c18423a.clear();
                        m63572a();
                        m63573a(observer);
                        return;
                    }
                    Object obj = this.f53520j.get() == 0 ? 1 : null;
                    Integer num = (Integer) c18423a.poll();
                    Object obj2 = num == null ? 1 : null;
                    if (obj != null && obj2 != null) {
                        for (UnicastSubject onComplete : this.f53514d.values()) {
                            onComplete.onComplete();
                        }
                        this.f53514d.clear();
                        this.f53515e.clear();
                        this.f53513c.dispose();
                        observer.onComplete();
                        return;
                    } else if (obj2 != null) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        obj = c18423a.poll();
                        UnicastSubject a;
                        int i2;
                        ObservableSource observableSource;
                        Object leftRightEndObserver;
                        if (num == f53507n) {
                            a = UnicastSubject.m67685a();
                            i2 = this.f53521k;
                            this.f53521k = i2 + 1;
                            this.f53514d.put(Integer.valueOf(i2), a);
                            try {
                                observableSource = (ObservableSource) C15684a.m58895a(this.f53517g.apply(obj), "The leftEnd returned a null ObservableSource");
                                leftRightEndObserver = new LeftRightEndObserver(this, true, i2);
                                this.f53513c.add(leftRightEndObserver);
                                observableSource.subscribe(leftRightEndObserver);
                                if (((Throwable) this.f53516f.get()) != null) {
                                    c18423a.clear();
                                    m63572a();
                                    m63573a(observer);
                                    return;
                                }
                                try {
                                    observer.onNext(C15684a.m58895a(this.f53519i.apply(obj, a), "The resultSelector returned a null value"));
                                    for (Object onNext : this.f53515e.values()) {
                                        a.onNext(onNext);
                                    }
                                } catch (Throwable th) {
                                    m63576a(th, observer, c18423a);
                                    return;
                                }
                            } catch (Throwable th2) {
                                m63576a(th2, observer, c18423a);
                                return;
                            }
                        } else if (num == f53508o) {
                            i2 = this.f53522l;
                            this.f53522l = i2 + 1;
                            this.f53515e.put(Integer.valueOf(i2), obj);
                            try {
                                observableSource = (ObservableSource) C15684a.m58895a(this.f53518h.apply(obj), "The rightEnd returned a null ObservableSource");
                                leftRightEndObserver = new LeftRightEndObserver(this, false, i2);
                                this.f53513c.add(leftRightEndObserver);
                                observableSource.subscribe(leftRightEndObserver);
                                if (((Throwable) this.f53516f.get()) != null) {
                                    c18423a.clear();
                                    m63572a();
                                    m63573a(observer);
                                    return;
                                }
                                for (UnicastSubject onNext2 : this.f53514d.values()) {
                                    onNext2.onNext(obj);
                                }
                            } catch (Throwable th22) {
                                m63576a(th22, observer, c18423a);
                                return;
                            }
                        } else if (num == f53509p) {
                            r4 = (LeftRightEndObserver) obj;
                            a = (UnicastSubject) this.f53514d.remove(Integer.valueOf(r4.f53526c));
                            this.f53513c.remove(r4);
                            if (a != null) {
                                a.onComplete();
                            }
                        } else if (num == f53510q) {
                            r4 = (LeftRightEndObserver) obj;
                            this.f53515e.remove(Integer.valueOf(r4.f53526c));
                            this.f53513c.remove(r4);
                        }
                    }
                }
                c18423a.clear();
            }
        }

        /* renamed from: a */
        public void mo12904a(Throwable th) {
            if (ExceptionHelper.m58964a(this.f53516f, th)) {
                this.f53520j.decrementAndGet();
                m63579b();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: a */
        public void mo12903a(LeftRightObserver leftRightObserver) {
            this.f53513c.delete(leftRightObserver);
            this.f53520j.decrementAndGet();
            m63579b();
        }

        /* renamed from: a */
        public void mo12906a(boolean z, Object obj) {
            synchronized (this) {
                this.f53512b.offer(z ? f53507n : f53508o, obj);
            }
            m63579b();
        }

        /* renamed from: a */
        public void mo12905a(boolean z, LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.f53512b.offer(z ? f53509p : f53510q, leftRightEndObserver);
            }
            m63579b();
        }

        /* renamed from: b */
        public void mo12907b(Throwable th) {
            if (ExceptionHelper.m58964a(this.f53516f, th)) {
                m63579b();
            } else {
                C2667a.a(th);
            }
        }
    }

    static final class LeftRightEndObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        /* renamed from: a */
        final C15698a f53524a;
        /* renamed from: b */
        final boolean f53525b;
        /* renamed from: c */
        final int f53526c;

        LeftRightEndObserver(C15698a c15698a, boolean z, int i) {
            this.f53524a = c15698a;
            this.f53525b = z;
            this.f53526c = i;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onNext(Object obj) {
            if (DisposableHelper.dispose(this) != null) {
                this.f53524a.mo12905a(this.f53525b, this);
            }
        }

        public void onError(Throwable th) {
            this.f53524a.mo12907b(th);
        }

        public void onComplete() {
            this.f53524a.mo12905a(this.f53525b, this);
        }
    }

    static final class LeftRightObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        /* renamed from: a */
        final C15698a f53527a;
        /* renamed from: b */
        final boolean f53528b;

        LeftRightObserver(C15698a c15698a, boolean z) {
            this.f53527a = c15698a;
            this.f53528b = z;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onNext(Object obj) {
            this.f53527a.mo12906a(this.f53528b, obj);
        }

        public void onError(Throwable th) {
            this.f53527a.mo12904a(th);
        }

        public void onComplete() {
            this.f53527a.mo12903a(this);
        }
    }

    public ObservableGroupJoin(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super C3959e<TRight>, ? extends R> biFunction) {
        super(observableSource);
        this.f58938b = observableSource2;
        this.f58939c = function;
        this.f58940d = function2;
        this.f58941e = biFunction;
    }

    protected void subscribeActual(Observer<? super R> observer) {
        Object groupJoinDisposable = new GroupJoinDisposable(observer, this.f58939c, this.f58940d, this.f58941e);
        observer.onSubscribe(groupJoinDisposable);
        observer = new LeftRightObserver(groupJoinDisposable, true);
        groupJoinDisposable.f53513c.add(observer);
        Object leftRightObserver = new LeftRightObserver(groupJoinDisposable, false);
        groupJoinDisposable.f53513c.add(leftRightObserver);
        this.a.subscribe(observer);
        this.f58938b.subscribe(leftRightObserver);
    }
}
