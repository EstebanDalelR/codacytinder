package com.tinder.chat.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.presenter.w */
final class C10564w implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f34317a;

    C10564w(Function1 function1) {
        this.f34317a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f34317a.invoke(t), "invoke(...)");
    }
}
