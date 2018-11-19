package com.tinder.scarlet.utils;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.utils.c */
final class C16550c implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51233a;

    C16550c(Function1 function1) {
        this.f51233a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f51233a.invoke(t), "invoke(...)");
    }
}
