package com.tinder.data.updates;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class ad implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35801a;

    ad(Function1 function1) {
        this.f35801a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35801a.invoke(t);
    }
}
