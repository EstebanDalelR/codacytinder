package com.tinder.discovery.analytics;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.c */
final class C11126c implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f36004a;

    C11126c(Function1 function1) {
        this.f36004a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f36004a.invoke(t), "invoke(...)");
    }
}
