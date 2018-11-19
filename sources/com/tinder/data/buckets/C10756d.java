package com.tinder.data.buckets;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.buckets.d */
final class C10756d implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35153a;

    C10756d(Function1 function1) {
        this.f35153a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35153a.invoke(t);
    }
}
