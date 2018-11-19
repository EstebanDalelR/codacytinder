package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.C19036a;
import io.reactivex.internal.subscribers.C19037b;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.p */
public final class C19010p<T, U> extends C18364a<T, U> {
    /* renamed from: c */
    final Function<? super T, ? extends U> f58886c;

    /* renamed from: io.reactivex.internal.operators.flowable.p$a */
    static final class C19181a<T, U> extends C19036a<T, U> {
        /* renamed from: a */
        final Function<? super T, ? extends U> f59511a;

        C19181a(ConditionalSubscriber<? super U> conditionalSubscriber, Function<? super T, ? extends U> function) {
            super(conditionalSubscriber);
            this.f59511a = function;
        }

        public void onNext(T t) {
            if (!this.h) {
                if (this.i != 0) {
                    this.e.onNext(null);
                    return;
                }
                try {
                    this.e.onNext(C15684a.m58895a(this.f59511a.apply(t), "The mapper function returned a null value."));
                } catch (T t2) {
                    m67646a((Throwable) t2);
                }
            }
        }

        public boolean tryOnNext(T t) {
            if (this.h) {
                return null;
            }
            try {
                return this.e.tryOnNext(C15684a.m58895a(this.f59511a.apply(t), "The mapper function returned a null value."));
            } catch (T t2) {
                m67646a((Throwable) t2);
                return true;
            }
        }

        public int requestFusion(int i) {
            return m67645a(i);
        }

        @Nullable
        public U poll() throws Exception {
            Object poll = this.g.poll();
            return poll != null ? C15684a.m58895a(this.f59511a.apply(poll), "The mapper function returned a null value.") : null;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.p$b */
    static final class C19182b<T, U> extends C19037b<T, U> {
        /* renamed from: a */
        final Function<? super T, ? extends U> f59512a;

        C19182b(Subscriber<? super U> subscriber, Function<? super T, ? extends U> function) {
            super(subscriber);
            this.f59512a = function;
        }

        public void onNext(T t) {
            if (!this.h) {
                if (this.i != 0) {
                    this.e.onNext(null);
                    return;
                }
                try {
                    this.e.onNext(C15684a.m58895a(this.f59512a.apply(t), "The mapper function returned a null value."));
                } catch (T t2) {
                    m67650a((Throwable) t2);
                }
            }
        }

        public int requestFusion(int i) {
            return m67649a(i);
        }

        @Nullable
        public U poll() throws Exception {
            Object poll = this.g.poll();
            return poll != null ? C15684a.m58895a(this.f59512a.apply(poll), "The mapper function returned a null value.") : null;
        }
    }

    public C19010p(C3957b<T> c3957b, Function<? super T, ? extends U> function) {
        super(c3957b);
        this.f58886c = function;
    }

    /* renamed from: a */
    protected void m67612a(Subscriber<? super U> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.a.a(new C19181a((ConditionalSubscriber) subscriber, this.f58886c));
        } else {
            this.a.a(new C19182b(subscriber, this.f58886c));
        }
    }
}
