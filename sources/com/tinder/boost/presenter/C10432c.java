package com.tinder.boost.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.boost.presenter.c */
final class C10432c implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f34011a;

    C10432c(Function1 function1) {
        this.f34011a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f34011a.invoke(t), "invoke(...)");
    }
}
