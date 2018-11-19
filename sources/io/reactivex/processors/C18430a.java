package io.reactivex.processors;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import org.reactivestreams.Processor;

/* renamed from: io.reactivex.processors.a */
public abstract class C18430a<T> extends C3957b<T> implements FlowableSubscriber<T>, Processor<T, T> {
    /* renamed from: r */
    public abstract boolean mo14002r();

    @CheckReturnValue
    @NonNull
    /* renamed from: u */
    public final C18430a<T> m66603u() {
        if (this instanceof C19039b) {
            return this;
        }
        return new C19039b(this);
    }
}
