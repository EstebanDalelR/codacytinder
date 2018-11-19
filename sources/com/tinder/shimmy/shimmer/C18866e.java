package com.tinder.shimmy.shimmer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.shimmer.e */
final class C18866e implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f58494a;

    C18866e(Function1 function1) {
        this.f58494a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f58494a.invoke(t), "invoke(...)");
    }
}
