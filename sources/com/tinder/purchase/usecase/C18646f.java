package com.tinder.purchase.usecase;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.usecase.f */
final class C18646f implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f58107a;

    C18646f(Function1 function1) {
        this.f58107a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f58107a.invoke(t), "invoke(...)");
    }
}
