package com.tinder.reactions.drawer.view;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.view.a */
final class C16329a implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f50819a;

    C16329a(Function1 function1) {
        this.f50819a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f50819a.invoke(t), "invoke(...)");
    }
}
