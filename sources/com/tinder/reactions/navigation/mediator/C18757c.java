package com.tinder.reactions.navigation.mediator;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.navigation.mediator.c */
final class C18757c implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f58256a;

    C18757c(Function1 function1) {
        this.f58256a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f58256a.invoke(t), "invoke(...)");
    }
}
