package com.tinder.feed.trigger;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.trigger.b */
final class C11703b implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f38212a;

    C11703b(Function1 function1) {
        this.f38212a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f38212a.invoke(t), "invoke(...)");
    }
}
