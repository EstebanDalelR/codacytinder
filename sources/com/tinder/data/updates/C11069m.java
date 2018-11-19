package com.tinder.data.updates;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.m */
final class C11069m implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35842a;

    C11069m(Function1 function1) {
        this.f35842a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35842a.invoke(t);
    }
}
