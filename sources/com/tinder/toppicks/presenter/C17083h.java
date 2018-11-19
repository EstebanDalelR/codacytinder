package com.tinder.toppicks.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.h */
final class C17083h implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52582a;

    C17083h(Function1 function1) {
        this.f52582a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f52582a.invoke(t), "invoke(...)");
    }
}
