package com.tinder.domain.match.usecase;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class GetMessagesMatches$sam$rx_functions_Func2$0 implements Func2 {
    private final /* synthetic */ Function2 function;

    GetMessagesMatches$sam$rx_functions_Func2$0(Function2 function2) {
        this.function = function2;
    }

    public final /* synthetic */ R call(T1 t1, T2 t2) {
        return this.function.invoke(t1, t2);
    }
}
