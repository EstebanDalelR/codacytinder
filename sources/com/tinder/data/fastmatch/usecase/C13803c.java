package com.tinder.data.fastmatch.usecase;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.usecase.c */
final class C13803c implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f43810a;

    C13803c(Function1 function1) {
        this.f43810a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f43810a.invoke(t), "invoke(...)");
    }
}
