package com.tinder.common.navigation;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.common.navigation.c */
final class C10695c implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35037a;

    C10695c(Function1 function1) {
        this.f35037a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35037a.invoke(t);
    }
}
