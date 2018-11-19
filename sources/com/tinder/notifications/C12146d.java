package com.tinder.notifications;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.notifications.d */
final class C12146d implements BiFunction {
    /* renamed from: a */
    private final /* synthetic */ Function2 f39389a;

    C12146d(Function2 function2) {
        this.f39389a = function2;
    }

    @NonNull
    public final /* synthetic */ R apply(@NonNull T1 t1, @NonNull T2 t2) {
        return this.f39389a.invoke(t1, t2);
    }
}
