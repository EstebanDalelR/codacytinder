package com.tinder.data.gif;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.gif.e */
final class C10783e implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35213a;

    C10783e(Function1 function1) {
        this.f35213a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35213a.invoke(t);
    }
}
