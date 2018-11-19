package com.tinder.data.match;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.match.n */
final class C10797n implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35247a;

    C10797n(Function1 function1) {
        this.f35247a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35247a.invoke(t);
    }
}
