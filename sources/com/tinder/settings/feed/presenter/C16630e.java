package com.tinder.settings.feed.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.feed.presenter.e */
final class C16630e implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51504a;

    C16630e(Function1 function1) {
        this.f51504a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f51504a.invoke(t), "invoke(...)");
    }
}
