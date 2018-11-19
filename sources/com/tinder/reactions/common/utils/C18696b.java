package com.tinder.reactions.common.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.common.utils.b */
final class C18696b implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f58177a;

    C18696b(Function1 function1) {
        this.f58177a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f58177a.invoke(t), "invoke(...)");
    }
}
