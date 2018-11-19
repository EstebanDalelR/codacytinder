package com.tinder.match.dialog;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.dialog.i */
final class C12047i implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f39185a;

    C12047i(Function1 function1) {
        this.f39185a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f39185a.invoke(t), "invoke(...)");
    }
}
