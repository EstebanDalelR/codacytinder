package com.tinder.data.updates;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.j */
final class C11060j implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35831a;

    C11060j(Function1 function1) {
        this.f35831a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35831a.invoke(t);
    }
}
