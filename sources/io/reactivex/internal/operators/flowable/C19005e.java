package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.C19036a;
import io.reactivex.internal.subscribers.C19037b;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.e */
public final class C19005e<T, K> extends C18364a<T, T> {
    /* renamed from: c */
    final Function<? super T, K> f58876c;
    /* renamed from: d */
    final BiPredicate<? super K, ? super K> f58877d;

    /* renamed from: io.reactivex.internal.operators.flowable.e$a */
    static final class C19175a<T, K> extends C19036a<T, T> {
        /* renamed from: a */
        final Function<? super T, K> f59493a;
        /* renamed from: b */
        final BiPredicate<? super K, ? super K> f59494b;
        /* renamed from: c */
        K f59495c;
        /* renamed from: d */
        boolean f59496d;

        C19175a(ConditionalSubscriber<? super T> conditionalSubscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.f59493a = function;
            this.f59494b = biPredicate;
        }

        public void onNext(T t) {
            if (tryOnNext(t) == null) {
                this.f.request(1);
            }
        }

        public boolean tryOnNext(T t) {
            if (this.h) {
                return false;
            }
            if (this.i != 0) {
                return this.e.tryOnNext(t);
            }
            try {
                Object apply = this.f59493a.apply(t);
                if (this.f59496d) {
                    boolean test = this.f59494b.test(this.f59495c, apply);
                    this.f59495c = apply;
                    if (test) {
                        return false;
                    }
                }
                this.f59496d = true;
                this.f59495c = apply;
                this.e.onNext(t);
                return true;
            } catch (T t2) {
                m67646a((Throwable) t2);
                return true;
            }
        }

        public int requestFusion(int i) {
            return m67645a(i);
        }

        @Nullable
        public T poll() throws Exception {
            while (true) {
                T poll = this.g.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f59493a.apply(poll);
                if (!this.f59496d) {
                    this.f59496d = true;
                    this.f59495c = apply;
                    return poll;
                } else if (this.f59494b.test(this.f59495c, apply)) {
                    this.f59495c = apply;
                    if (this.i != 1) {
                        this.f.request(1);
                    }
                } else {
                    this.f59495c = apply;
                    return poll;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.e$b */
    static final class C19176b<T, K> extends C19037b<T, T> implements ConditionalSubscriber<T> {
        /* renamed from: a */
        final Function<? super T, K> f59497a;
        /* renamed from: b */
        final BiPredicate<? super K, ? super K> f59498b;
        /* renamed from: c */
        K f59499c;
        /* renamed from: d */
        boolean f59500d;

        C19176b(Subscriber<? super T> subscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(subscriber);
            this.f59497a = function;
            this.f59498b = biPredicate;
        }

        public void onNext(T t) {
            if (tryOnNext(t) == null) {
                this.f.request(1);
            }
        }

        public boolean tryOnNext(T t) {
            if (this.h) {
                return false;
            }
            if (this.i != 0) {
                this.e.onNext(t);
                return true;
            }
            try {
                Object apply = this.f59497a.apply(t);
                if (this.f59500d) {
                    boolean test = this.f59498b.test(this.f59499c, apply);
                    this.f59499c = apply;
                    if (test) {
                        return false;
                    }
                }
                this.f59500d = true;
                this.f59499c = apply;
                this.e.onNext(t);
                return true;
            } catch (T t2) {
                m67650a((Throwable) t2);
                return true;
            }
        }

        public int requestFusion(int i) {
            return m67649a(i);
        }

        @Nullable
        public T poll() throws Exception {
            while (true) {
                T poll = this.g.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f59497a.apply(poll);
                if (!this.f59500d) {
                    this.f59500d = true;
                    this.f59499c = apply;
                    return poll;
                } else if (this.f59498b.test(this.f59499c, apply)) {
                    this.f59499c = apply;
                    if (this.i != 1) {
                        this.f.request(1);
                    }
                } else {
                    this.f59499c = apply;
                    return poll;
                }
            }
        }
    }

    public C19005e(C3957b<T> c3957b, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(c3957b);
        this.f58876c = function;
        this.f58877d = biPredicate;
    }

    /* renamed from: a */
    protected void m67607a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.a.a(new C19175a((ConditionalSubscriber) subscriber, this.f58876c, this.f58877d));
            return;
        }
        this.a.a(new C19176b(subscriber, this.f58876c, this.f58877d));
    }
}
