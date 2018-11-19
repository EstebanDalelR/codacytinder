package com.tinder.toppicks.teasers;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.teasers.e */
final class C17133e implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52642a;

    C17133e(Function1 function1) {
        this.f52642a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f52642a.invoke(t), "invoke(...)");
    }
}
