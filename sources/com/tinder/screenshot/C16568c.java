package com.tinder.screenshot;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshot.c */
final class C16568c implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51261a;

    C16568c(Function1 function1) {
        this.f51261a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f51261a.invoke(t), "invoke(...)");
    }
}
