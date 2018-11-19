package com.tinder.boost.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.boost.presenter.d */
final class C13648d implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f43491a;

    C13648d(Function1 function1) {
        this.f43491a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f43491a.invoke(t), "invoke(...)");
    }
}
