package com.tinder.screenshot.analytics;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshot.analytics.e */
final class C16567e implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51260a;

    C16567e(Function1 function1) {
        this.f51260a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f51260a.invoke(t), "invoke(...)");
    }
}
