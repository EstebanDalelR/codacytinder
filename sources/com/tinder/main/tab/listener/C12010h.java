package com.tinder.main.tab.listener;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.main.tab.listener.h */
final class C12010h implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f38972a;

    C12010h(Function1 function1) {
        this.f38972a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f38972a.invoke(t), "invoke(...)");
    }
}
