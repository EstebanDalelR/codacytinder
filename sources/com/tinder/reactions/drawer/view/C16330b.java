package com.tinder.reactions.drawer.view;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.view.b */
final class C16330b implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f50820a;

    C16330b(Function1 function1) {
        this.f50820a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f50820a.invoke(t);
    }
}
