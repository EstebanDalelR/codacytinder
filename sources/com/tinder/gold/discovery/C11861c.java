package com.tinder.gold.discovery;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.gold.discovery.c */
final class C11861c implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f38687a;

    C11861c(Function1 function1) {
        this.f38687a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f38687a.invoke(t);
    }
}
