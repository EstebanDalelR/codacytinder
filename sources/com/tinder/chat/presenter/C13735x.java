package com.tinder.chat.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.presenter.x */
final class C13735x implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f43628a;

    C13735x(Function1 function1) {
        this.f43628a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f43628a.invoke(t), "invoke(...)");
    }
}
