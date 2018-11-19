package com.tinder.reactions.chat.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.chat.presenter.e */
final class C16308e implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f50745a;

    C16308e(Function1 function1) {
        this.f50745a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f50745a.invoke(t), "invoke(...)");
    }
}
