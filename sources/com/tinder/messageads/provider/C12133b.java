package com.tinder.messageads.provider;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.provider.b */
final class C12133b implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f39365a;

    C12133b(Function1 function1) {
        this.f39365a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f39365a.invoke(t), "invoke(...)");
    }
}
