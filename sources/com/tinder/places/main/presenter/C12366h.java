package com.tinder.places.main.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.places.main.presenter.h */
final class C12366h implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f39982a;

    C12366h(Function1 function1) {
        this.f39982a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f39982a.invoke(t), "invoke(...)");
    }
}
