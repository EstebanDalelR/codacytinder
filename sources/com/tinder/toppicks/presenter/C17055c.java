package com.tinder.toppicks.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.c */
final class C17055c implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52524a;

    C17055c(Function1 function1) {
        this.f52524a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f52524a.invoke(t), "invoke(...)");
    }
}
