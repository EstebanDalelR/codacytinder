package com.tinder.domain.message.usecase;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class SendImageMessage$sam$rx_functions_Func1$0 implements Func1 {
    private final /* synthetic */ Function1 function;

    SendImageMessage$sam$rx_functions_Func1$0(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ R call(T t) {
        return this.function.invoke(t);
    }
}
