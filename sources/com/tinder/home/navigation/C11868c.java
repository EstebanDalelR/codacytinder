package com.tinder.home.navigation;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.home.navigation.c */
final class C11868c implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f38705a;

    C11868c(Function1 function1) {
        this.f38705a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f38705a.invoke(t);
    }
}
