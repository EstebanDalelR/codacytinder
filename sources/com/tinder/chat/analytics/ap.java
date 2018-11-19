package com.tinder.chat.analytics;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class ap implements BiFunction {
    /* renamed from: a */
    private final /* synthetic */ Function2 f34243a;

    ap(Function2 function2) {
        this.f34243a = function2;
    }

    @NonNull
    public final /* synthetic */ R apply(@NonNull T1 t1, @NonNull T2 t2) {
        return this.f34243a.invoke(t1, t2);
    }
}
