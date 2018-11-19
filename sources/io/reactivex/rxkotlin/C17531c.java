package io.reactivex.rxkotlin;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function3;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 1}, k = 3, mv = {1, 1, 6})
/* renamed from: io.reactivex.rxkotlin.c */
final class C17531c implements Function3 {
    /* renamed from: a */
    private final /* synthetic */ kotlin.jvm.functions.Function3 f54164a;

    C17531c(kotlin.jvm.functions.Function3 function3) {
        this.f54164a = function3;
    }

    @NonNull
    public final /* synthetic */ R apply(@NonNull T1 t1, @NonNull T2 t2, @NonNull T3 t3) {
        return this.f54164a.invoke(t1, t2, t3);
    }
}
