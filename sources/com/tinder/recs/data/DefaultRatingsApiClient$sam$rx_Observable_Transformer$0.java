package com.tinder.recs.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import rx.Observable;
import rx.Observable$Transformer;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class DefaultRatingsApiClient$sam$rx_Observable_Transformer$0 implements Observable$Transformer {
    private final /* synthetic */ Function1 function;

    DefaultRatingsApiClient$sam$rx_Observable_Transformer$0(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ Observable<R> call(Observable<T> observable) {
        return (Observable) this.function.invoke(observable);
    }
}
