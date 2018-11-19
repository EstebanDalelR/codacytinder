package com.tinder.scarlet.lifecycle;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.lifecycle.c */
final class C16543c implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51221a;

    C16543c(Function1 function1) {
        this.f51221a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f51221a.invoke(t);
    }
}
