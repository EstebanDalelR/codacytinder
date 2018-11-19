package com.tinder.bitmoji.analytics;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.analytics.d */
final class C10375d implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f33855a;

    C10375d(Function1 function1) {
        this.f33855a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f33855a.invoke(t), "invoke(...)");
    }
}
