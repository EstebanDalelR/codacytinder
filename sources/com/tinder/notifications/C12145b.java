package com.tinder.notifications;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.notifications.b */
final class C12145b implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f39388a;

    C12145b(Function1 function1) {
        this.f39388a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f39388a.invoke(t), "invoke(...)");
    }
}
