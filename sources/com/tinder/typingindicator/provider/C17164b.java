package com.tinder.typingindicator.provider;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.provider.b */
final class C17164b implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52695a;

    C17164b(Function1 function1) {
        this.f52695a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f52695a.invoke(t);
    }
}
