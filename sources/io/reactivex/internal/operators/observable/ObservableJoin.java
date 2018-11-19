package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.operators.observable.ObservableGroupJoin.C15698a;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p079d.C2667a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends C18394a<TLeft, R> {
    /* renamed from: b */
    final ObservableSource<? extends TRight> f58942b;
    /* renamed from: c */
    final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f58943c;
    /* renamed from: d */
    final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f58944d;
    /* renamed from: e */
    final BiFunction<? super TLeft, ? super TRight, ? extends R> f58945e;

    static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, C15698a {
        /* renamed from: n */
        static final Integer f53549n = Integer.valueOf(1);
        /* renamed from: o */
        static final Integer f53550o = Integer.valueOf(2);
        /* renamed from: p */
        static final Integer f53551p = Integer.valueOf(3);
        /* renamed from: q */
        static final Integer f53552q = Integer.valueOf(4);
        private static final long serialVersionUID = -6071216598687999801L;
        /* renamed from: a */
        final Observer<? super R> f53553a;
        /* renamed from: b */
        final C18423a<Object> f53554b = new C18423a(C3959e.bufferSize());
        /* renamed from: c */
        final C17356a f53555c = new C17356a();
        /* renamed from: d */
        final Map<Integer, TLeft> f53556d = new LinkedHashMap();
        /* renamed from: e */
        final Map<Integer, TRight> f53557e = new LinkedHashMap();
        /* renamed from: f */
        final AtomicReference<Throwable> f53558f = new AtomicReference();
        /* renamed from: g */
        final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f53559g;
        /* renamed from: h */
        final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f53560h;
        /* renamed from: i */
        final BiFunction<? super TLeft, ? super TRight, ? extends R> f53561i;
        /* renamed from: j */
        final AtomicInteger f53562j;
        /* renamed from: k */
        int f53563k;
        /* renamed from: l */
        int f53564l;
        /* renamed from: m */
        volatile boolean f53565m;

        JoinDisposable(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.f53553a = observer;
            this.f53559g = function;
            this.f53560h = function2;
            this.f53561i = biFunction;
            this.f53562j = new AtomicInteger(2);
        }

        public void dispose() {
            if (!this.f53565m) {
                this.f53565m = true;
                m63592a();
                if (getAndIncrement() == 0) {
                    this.f53554b.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f53565m;
        }

        /* renamed from: a */
        void m63592a() {
            this.f53555c.dispose();
        }

        /* renamed from: a */
        void m63593a(Observer<?> observer) {
            Throwable a = ExceptionHelper.m58963a(this.f53558f);
            this.f53556d.clear();
            this.f53557e.clear();
            observer.onError(a);
        }

        /* renamed from: a */
        void m63596a(Throwable th, Observer<?> observer, C18423a<?> c18423a) {
            C15678a.m58850b(th);
            ExceptionHelper.m58964a(this.f53558f, th);
            c18423a.clear();
            m63592a();
            m63593a((Observer) observer);
        }

        /* renamed from: b */
        void m63599b() {
            if (getAndIncrement() == 0) {
                C18423a c18423a = this.f53554b;
                Observer observer = this.f53553a;
                int i = 1;
                while (!this.f53565m) {
                    if (((Throwable) this.f53558f.get()) != null) {
                        c18423a.clear();
                        m63592a();
                        m63593a(observer);
                        return;
                    }
                    Object obj = this.f53562j.get() == 0 ? 1 : null;
                    Integer num = (Integer) c18423a.poll();
                    Object obj2 = num == null ? 1 : null;
                    if (obj != null && obj2 != null) {
                        this.f53556d.clear();
                        this.f53557e.clear();
                        this.f53555c.dispose();
                        observer.onComplete();
                        return;
                    } else if (obj2 != null) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        obj = c18423a.poll();
                        if (num == f53549n) {
                            int i2 = this.f53563k;
                            this.f53563k = i2 + 1;
                            this.f53556d.put(Integer.valueOf(i2), obj);
                            try {
                                ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f53559g.apply(obj), "The leftEnd returned a null ObservableSource");
                                obj2 = new LeftRightEndObserver(this, true, i2);
                                this.f53555c.add(obj2);
                                observableSource.subscribe(obj2);
                                if (((Throwable) this.f53558f.get()) != null) {
                                    c18423a.clear();
                                    m63592a();
                                    m63593a(observer);
                                    return;
                                }
                                for (Object apply : this.f53557e.values()) {
                                    try {
                                        observer.onNext(C15684a.m58895a(this.f53561i.apply(obj, apply), "The resultSelector returned a null value"));
                                    } catch (Throwable th) {
                                        m63596a(th, observer, c18423a);
                                        return;
                                    }
                                }
                                continue;
                            } catch (Throwable th2) {
                                m63596a(th2, observer, c18423a);
                                return;
                            }
                        } else if (num == f53550o) {
                            int i3 = this.f53564l;
                            this.f53564l = i3 + 1;
                            this.f53557e.put(Integer.valueOf(i3), obj);
                            try {
                                ObservableSource observableSource2 = (ObservableSource) C15684a.m58895a(this.f53560h.apply(obj), "The rightEnd returned a null ObservableSource");
                                Object leftRightEndObserver = new LeftRightEndObserver(this, false, i3);
                                this.f53555c.add(leftRightEndObserver);
                                observableSource2.subscribe(leftRightEndObserver);
                                if (((Throwable) this.f53558f.get()) != null) {
                                    c18423a.clear();
                                    m63592a();
                                    m63593a(observer);
                                    return;
                                }
                                for (Object apply2 : this.f53556d.values()) {
                                    try {
                                        observer.onNext(C15684a.m58895a(this.f53561i.apply(apply2, obj), "The resultSelector returned a null value"));
                                    } catch (Throwable th22) {
                                        m63596a(th22, observer, c18423a);
                                        return;
                                    }
                                }
                                continue;
                            } catch (Throwable th222) {
                                m63596a(th222, observer, c18423a);
                                return;
                            }
                        } else if (num == f53551p) {
                            r4 = (LeftRightEndObserver) obj;
                            this.f53556d.remove(Integer.valueOf(r4.f53526c));
                            this.f53555c.remove(r4);
                        } else {
                            r4 = (LeftRightEndObserver) obj;
                            this.f53557e.remove(Integer.valueOf(r4.f53526c));
                            this.f53555c.remove(r4);
                        }
                    }
                }
                c18423a.clear();
            }
        }

        /* renamed from: a */
        public void mo12904a(Throwable th) {
            if (ExceptionHelper.m58964a(this.f53558f, th)) {
                this.f53562j.decrementAndGet();
                m63599b();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: a */
        public void mo12903a(LeftRightObserver leftRightObserver) {
            this.f53555c.delete(leftRightObserver);
            this.f53562j.decrementAndGet();
            m63599b();
        }

        /* renamed from: a */
        public void mo12906a(boolean z, Object obj) {
            synchronized (this) {
                this.f53554b.offer(z ? f53549n : f53550o, obj);
            }
            m63599b();
        }

        /* renamed from: a */
        public void mo12905a(boolean z, LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.f53554b.offer(z ? f53551p : f53552q, leftRightEndObserver);
            }
            m63599b();
        }

        /* renamed from: b */
        public void mo12907b(Throwable th) {
            if (ExceptionHelper.m58964a(this.f53558f, th)) {
                m63599b();
            } else {
                C2667a.a(th);
            }
        }
    }

    public ObservableJoin(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(observableSource);
        this.f58942b = observableSource2;
        this.f58943c = function;
        this.f58944d = function2;
        this.f58945e = biFunction;
    }

    protected void subscribeActual(Observer<? super R> observer) {
        Object joinDisposable = new JoinDisposable(observer, this.f58943c, this.f58944d, this.f58945e);
        observer.onSubscribe(joinDisposable);
        observer = new LeftRightObserver(joinDisposable, true);
        joinDisposable.f53555c.add(observer);
        Object leftRightObserver = new LeftRightObserver(joinDisposable, false);
        joinDisposable.f53555c.add(leftRightObserver);
        this.a.subscribe(observer);
        this.f58942b.subscribe(leftRightObserver);
    }
}
