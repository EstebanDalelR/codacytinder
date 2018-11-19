package com.tinder.session.usecase;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.session.usecase.g */
final class C16590g implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51292a;

    C16590g(Function1 function1) {
        this.f51292a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f51292a.invoke(t), "invoke(...)");
    }
}
