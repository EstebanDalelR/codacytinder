package com.tinder.verification.worker;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.verification.worker.b */
final class C17241b implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52852a;

    C17241b(Function1 function1) {
        this.f52852a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f52852a.invoke(t), "invoke(...)");
    }
}
