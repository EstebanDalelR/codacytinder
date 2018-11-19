package com.tinder.crashindicator.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.crashindicator.view.a */
final class C13793a implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f43789a;

    C13793a(Function1 function1) {
        this.f43789a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f43789a.invoke(t), "invoke(...)");
    }
}
