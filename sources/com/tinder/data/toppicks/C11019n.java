package com.tinder.data.toppicks;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.n */
final class C11019n implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35768a;

    C11019n(Function1 function1) {
        this.f35768a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f35768a.invoke(t), "invoke(...)");
    }
}
