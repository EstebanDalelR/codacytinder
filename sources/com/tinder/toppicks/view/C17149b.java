package com.tinder.toppicks.view;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.view.b */
final class C17149b implements Function {
    /* renamed from: a */
    private final /* synthetic */ Function1 f52667a;

    C17149b(Function1 function1) {
        this.f52667a = function1;
    }

    public final /* synthetic */ R apply(@NonNull T t) {
        return this.f52667a.invoke(t);
    }
}
