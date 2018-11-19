package com.tinder.recs.analytics;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class RecsSessionTracker$sam$io_reactivex_functions_Consumer$0 implements Consumer {
    private final /* synthetic */ Function1 function;

    RecsSessionTracker$sam$io_reactivex_functions_Consumer$0(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.function.invoke(t), "invoke(...)");
    }
}
