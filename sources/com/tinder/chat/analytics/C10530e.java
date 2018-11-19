package com.tinder.chat.analytics;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.e */
final class C10530e implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f34260a;

    C10530e(Function1 function1) {
        this.f34260a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f34260a.invoke(t);
    }
}
