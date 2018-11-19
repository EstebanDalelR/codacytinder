package com.tinder.match.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.presenter.n */
final class C12074n implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f39219a;

    C12074n(Function1 function1) {
        this.f39219a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f39219a.invoke(t), "invoke(...)");
    }
}
