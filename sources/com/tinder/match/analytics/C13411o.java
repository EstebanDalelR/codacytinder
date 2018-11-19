package com.tinder.match.analytics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import rx.functions.Func4;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.analytics.o */
final class C13411o implements Func4 {
    /* renamed from: a */
    private final /* synthetic */ Function4 f42547a;

    C13411o(Function4 function4) {
        this.f42547a = function4;
    }

    public final /* synthetic */ R call(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.f42547a.invoke(t1, t2, t3, t4);
    }
}
