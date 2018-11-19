package com.tinder.smsauth.domain.usecase;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.domain.usecase.l */
final class C16724l implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51712a;

    C16724l(Function1 function1) {
        this.f51712a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f51712a.invoke(t);
    }
}
