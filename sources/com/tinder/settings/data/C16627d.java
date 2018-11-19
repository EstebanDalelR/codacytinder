package com.tinder.settings.data;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.data.d */
final class C16627d implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51499a;

    C16627d(Function1 function1) {
        this.f51499a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f51499a.invoke(t);
    }
}
