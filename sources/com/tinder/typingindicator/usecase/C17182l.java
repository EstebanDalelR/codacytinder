package com.tinder.typingindicator.usecase;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.l */
final class C17182l implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52725a;

    C17182l(Function1 function1) {
        this.f52725a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f52725a.invoke(t);
    }
}
