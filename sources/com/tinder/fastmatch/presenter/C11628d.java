package com.tinder.fastmatch.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.d */
final class C11628d implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f38053a;

    C11628d(Function1 function1) {
        this.f38053a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f38053a.invoke(t), "invoke(...)");
    }
}
