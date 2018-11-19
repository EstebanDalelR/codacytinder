package com.tinder.chat.presenter;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class ab implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f34286a;

    ab(Function1 function1) {
        this.f34286a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f34286a.invoke(t);
    }
}
