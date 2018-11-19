package com.tinder.scarlet.websocket.okhttp;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.websocket.okhttp.e */
final class C16556e implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51243a;

    C16556e(Function1 function1) {
        this.f51243a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f51243a.invoke(t), "invoke(...)");
    }
}
