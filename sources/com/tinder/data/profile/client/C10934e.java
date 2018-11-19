package com.tinder.data.profile.client;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.client.e */
final class C10934e implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35636a;

    C10934e(Function1 function1) {
        this.f35636a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f35636a.invoke(t);
    }
}
