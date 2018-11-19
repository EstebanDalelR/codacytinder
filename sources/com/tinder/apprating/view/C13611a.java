package com.tinder.apprating.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.apprating.view.a */
final class C13611a implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f43386a;

    C13611a(Function1 function1) {
        this.f43386a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f43386a.invoke(t), "invoke(...)");
    }
}
