package com.tinder.match.navigation;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.navigation.c */
final class C12058c implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f39200a;

    C12058c(Function1 function1) {
        this.f39200a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f39200a.invoke(t);
    }
}
