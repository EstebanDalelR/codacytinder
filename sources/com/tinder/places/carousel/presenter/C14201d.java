package com.tinder.places.carousel.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.places.carousel.presenter.d */
final class C14201d implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f44990a;

    C14201d(Function1 function1) {
        this.f44990a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f44990a.invoke(t), "invoke(...)");
    }
}
