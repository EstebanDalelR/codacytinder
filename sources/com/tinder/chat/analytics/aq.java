package com.tinder.chat.analytics;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.BiPredicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class aq implements BiPredicate {
    /* renamed from: a */
    private final /* synthetic */ Function2 f34244a;

    aq(Function2 function2) {
        this.f34244a = function2;
    }

    public final /* synthetic */ boolean test(@NonNull T1 t1, @NonNull T2 t2) {
        Object invoke = this.f34244a.invoke(t1, t2);
        C2668g.a(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
