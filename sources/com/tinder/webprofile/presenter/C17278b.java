package com.tinder.webprofile.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.webprofile.presenter.b */
final class C17278b implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52948a;

    C17278b(Function1 function1) {
        this.f52948a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f52948a.invoke(t), "invoke(...)");
    }
}
