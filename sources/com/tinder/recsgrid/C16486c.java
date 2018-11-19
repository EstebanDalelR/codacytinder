package com.tinder.recsgrid;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recsgrid.c */
final class C16486c implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51162a;

    C16486c(Function1 function1) {
        this.f51162a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f51162a.invoke(t), "invoke(...)");
    }
}
