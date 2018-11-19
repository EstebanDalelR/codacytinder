package com.tinder.scarlet.internal.servicemethod;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.servicemethod.d */
final class C16541d implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51219a;

    C16541d(Function1 function1) {
        this.f51219a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f51219a.invoke(t);
    }
}
