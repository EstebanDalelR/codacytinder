package com.tinder.usecase;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.usecase.e */
final class C17222e implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52799a;

    C17222e(Function1 function1) {
        this.f52799a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f52799a.invoke(t), "invoke(...)");
    }
}
