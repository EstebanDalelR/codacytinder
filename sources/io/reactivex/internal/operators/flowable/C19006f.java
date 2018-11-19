package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.C19036a;
import io.reactivex.internal.subscribers.C19037b;
import io.reactivex.p079d.C2667a;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.f */
public final class C19006f<T> extends C18364a<T, T> {
    /* renamed from: c */
    final Consumer<? super T> f58878c;
    /* renamed from: d */
    final Consumer<? super Throwable> f58879d;
    /* renamed from: e */
    final Action f58880e;
    /* renamed from: f */
    final Action f58881f;

    /* renamed from: io.reactivex.internal.operators.flowable.f$a */
    static final class C19177a<T> extends C19036a<T, T> {
        /* renamed from: a */
        final Consumer<? super T> f59501a;
        /* renamed from: b */
        final Consumer<? super Throwable> f59502b;
        /* renamed from: c */
        final Action f59503c;
        /* renamed from: d */
        final Action f59504d;

        C19177a(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.f59501a = consumer;
            this.f59502b = consumer2;
            this.f59503c = action;
            this.f59504d = action2;
        }

        public void onNext(T t) {
            if (!this.h) {
                if (this.i != 0) {
                    this.e.onNext(null);
                    return;
                }
                try {
                    this.f59501a.accept(t);
                    this.e.onNext(t);
                } catch (T t2) {
                    m67646a((Throwable) t2);
                }
            }
        }

        public boolean tryOnNext(T t) {
            if (this.h) {
                return false;
            }
            try {
                this.f59501a.accept(t);
                return this.e.tryOnNext(t);
            } catch (T t2) {
                m67646a((Throwable) t2);
                return false;
            }
        }

        public void onError(Throwable th) {
            if (this.h) {
                C2667a.a(th);
                return;
            }
            boolean z = true;
            this.h = true;
            try {
                this.f59502b.accept(th);
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                this.e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.e.onError(th);
            }
            try {
                this.f59504d.run();
            } catch (Throwable th3) {
                C15678a.m58850b(th3);
                C2667a.a(th3);
            }
        }

        public void onComplete() {
            if (!this.h) {
                try {
                    this.f59503c.run();
                    this.h = true;
                    this.e.onComplete();
                    try {
                        this.f59504d.run();
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        C2667a.a(th);
                    }
                } catch (Throwable th2) {
                    m67646a(th2);
                }
            }
        }

        public int requestFusion(int i) {
            return m67645a(i);
        }

        @Nullable
        public T poll() throws Exception {
            Exception b;
            CompositeException compositeException;
            try {
                T poll = this.g.poll();
                if (poll != null) {
                    try {
                        this.f59501a.accept(poll);
                        this.f59504d.run();
                    } catch (Throwable th) {
                        compositeException = new CompositeException(th, th);
                    }
                } else if (this.i == 1) {
                    this.f59503c.run();
                    this.f59504d.run();
                }
                return poll;
            } catch (Throwable th2) {
                compositeException = new CompositeException(th, th2);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.f$b */
    static final class C19178b<T> extends C19037b<T, T> {
        /* renamed from: a */
        final Consumer<? super T> f59505a;
        /* renamed from: b */
        final Consumer<? super Throwable> f59506b;
        /* renamed from: c */
        final Action f59507c;
        /* renamed from: d */
        final Action f59508d;

        C19178b(Subscriber<? super T> subscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(subscriber);
            this.f59505a = consumer;
            this.f59506b = consumer2;
            this.f59507c = action;
            this.f59508d = action2;
        }

        public void onNext(T t) {
            if (!this.h) {
                if (this.i != 0) {
                    this.e.onNext(null);
                    return;
                }
                try {
                    this.f59505a.accept(t);
                    this.e.onNext(t);
                } catch (T t2) {
                    m67650a((Throwable) t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.h) {
                C2667a.a(th);
                return;
            }
            boolean z = true;
            this.h = true;
            try {
                this.f59506b.accept(th);
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                this.e.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.e.onError(th);
            }
            try {
                this.f59508d.run();
            } catch (Throwable th3) {
                C15678a.m58850b(th3);
                C2667a.a(th3);
            }
        }

        public void onComplete() {
            if (!this.h) {
                try {
                    this.f59507c.run();
                    this.h = true;
                    this.e.onComplete();
                    try {
                        this.f59508d.run();
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        C2667a.a(th);
                    }
                } catch (Throwable th2) {
                    m67650a(th2);
                }
            }
        }

        public int requestFusion(int i) {
            return m67649a(i);
        }

        @Nullable
        public T poll() throws Exception {
            Exception b;
            CompositeException compositeException;
            try {
                T poll = this.g.poll();
                if (poll != null) {
                    try {
                        this.f59505a.accept(poll);
                        this.f59508d.run();
                    } catch (Throwable th) {
                        compositeException = new CompositeException(th, th);
                    }
                } else if (this.i == 1) {
                    this.f59507c.run();
                    this.f59508d.run();
                }
                return poll;
            } catch (Throwable th2) {
                compositeException = new CompositeException(th, th2);
            }
        }
    }

    public C19006f(C3957b<T> c3957b, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(c3957b);
        this.f58878c = consumer;
        this.f58879d = consumer2;
        this.f58880e = action;
        this.f58881f = action2;
    }

    /* renamed from: a */
    protected void m67608a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.a.a(new C19177a((ConditionalSubscriber) subscriber, this.f58878c, this.f58879d, this.f58880e, this.f58881f));
            return;
        }
        this.a.a(new C19178b(subscriber, this.f58878c, this.f58879d, this.f58880e, this.f58881f));
    }
}
