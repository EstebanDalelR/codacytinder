package com.tinder.recs.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class RecsPresenterKt$sam$rx_functions_Action1$0 implements Action1 {
    private final /* synthetic */ Function1 function;

    RecsPresenterKt$sam$rx_functions_Action1$0(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.function.invoke(t), "invoke(...)");
    }
}
