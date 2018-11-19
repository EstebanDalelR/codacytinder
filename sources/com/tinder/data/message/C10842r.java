package com.tinder.data.message;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.r */
final class C10842r implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35459a;

    C10842r(Function1 function1) {
        this.f35459a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35459a.invoke(t);
    }
}
