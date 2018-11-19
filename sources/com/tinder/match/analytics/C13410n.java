package com.tinder.match.analytics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import rx.functions.Func3;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.analytics.n */
final class C13410n implements Func3 {
    /* renamed from: a */
    private final /* synthetic */ Function3 f42546a;

    C13410n(Function3 function3) {
        this.f42546a = function3;
    }

    public final /* synthetic */ R call(T1 t1, T2 t2, T3 t3) {
        return this.f42546a.invoke(t1, t2, t3);
    }
}
