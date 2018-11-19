package com.tinder.common;

import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import rx.functions.Func5;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.common.r */
final class C12792r implements Func5 {
    /* renamed from: a */
    private final /* synthetic */ Function5 f41190a;

    C12792r(Function5 function5) {
        this.f41190a = function5;
    }

    public final /* synthetic */ R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.f41190a.invoke(t1, t2, t3, t4, t5);
    }
}
