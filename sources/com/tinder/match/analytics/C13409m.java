package com.tinder.match.analytics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.analytics.m */
final class C13409m implements Func2 {
    /* renamed from: a */
    private final /* synthetic */ Function2 f42545a;

    C13409m(Function2 function2) {
        this.f42545a = function2;
    }

    public final /* synthetic */ R call(T1 t1, T2 t2) {
        return this.f42545a.invoke(t1, t2);
    }
}
