package com.tinder.shimmy.mask;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.mask.d */
final class C18862d implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f58482a;

    C18862d(Function1 function1) {
        this.f58482a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f58482a.invoke(t), "invoke(...)");
    }
}
