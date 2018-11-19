package com.tinder.bitmoji.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.presenter.e */
final class C10389e implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f33873a;

    C10389e(Function1 function1) {
        this.f33873a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f33873a.invoke(t), "invoke(...)");
    }
}
