package com.tinder.toppicks.emptyview;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.emptyview.c */
final class C17021c implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52451a;

    C17021c(Function1 function1) {
        this.f52451a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f52451a.invoke(t), "invoke(...)");
    }
}
