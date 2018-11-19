package com.tinder.places.settings.presenter;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.places.settings.presenter.e */
final class C16021e implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f49788a;

    C16021e(Function1 function1) {
        this.f49788a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f49788a.invoke(t), "invoke(...)");
    }
}
