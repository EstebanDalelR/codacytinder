package com.tinder.domain.common.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class RetryOnErrorTransformer$sam$io_reactivex_functions_Function$0 implements Function {
    private final /* synthetic */ Function1 function;

    RetryOnErrorTransformer$sam$io_reactivex_functions_Function$0(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.function.invoke(t);
    }
}
