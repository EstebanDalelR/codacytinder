package com.tinder.bitmoji;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.j */
final class C10379j implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f33861a;

    C10379j(Function1 function1) {
        this.f33861a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f33861a.invoke(t), "invoke(...)");
    }
}
