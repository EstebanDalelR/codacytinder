package com.tinder.settings.feed.provider;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.feed.provider.b */
final class C16633b implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51507a;

    C16633b(Function1 function1) {
        this.f51507a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f51507a.invoke(t), "invoke(...)");
    }
}
