package com.tinder.profile.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.presenter.b */
final class C16110b implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f50174a;

    C16110b(Function1 function1) {
        this.f50174a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f50174a.invoke(t), "invoke(...)");
    }
}
