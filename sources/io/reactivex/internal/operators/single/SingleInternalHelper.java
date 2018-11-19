package io.reactivex.internal.operators.single;

import io.reactivex.C3959e;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

public final class SingleInternalHelper {

    enum NoSuchElementCallable implements Callable<NoSuchElementException> {
        INSTANCE;

        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    enum ToFlowable implements Function<SingleSource, Publisher> {
        INSTANCE;

        public Publisher apply(SingleSource singleSource) {
            return new SingleToFlowable(singleSource);
        }
    }

    enum ToObservable implements Function<SingleSource, C3959e> {
        INSTANCE;

        public C3959e apply(SingleSource singleSource) {
            return new C18422k(singleSource);
        }
    }

    /* renamed from: a */
    public static <T> Function<SingleSource<? extends T>, Publisher<? extends T>> m58941a() {
        return ToFlowable.INSTANCE;
    }
}
