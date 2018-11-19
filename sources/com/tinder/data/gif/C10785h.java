package com.tinder.data.gif;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.gif.h */
final class C10785h implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35217a;

    C10785h(Function1 function1) {
        this.f35217a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35217a.invoke(t);
    }
}
