package com.tinder.feed.usecase;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.usecase.e */
final class C11708e implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f38218a;

    C11708e(Function1 function1) {
        this.f38218a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f38218a.invoke(t);
    }
}
