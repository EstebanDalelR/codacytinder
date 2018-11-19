package com.tinder.session.analytics;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function6;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.session.analytics.d */
final class C16581d implements Function6 {
    /* renamed from: a */
    private final /* synthetic */ kotlin.jvm.functions.Function6 f51283a;

    C16581d(kotlin.jvm.functions.Function6 function6) {
        this.f51283a = function6;
    }

    @NonNull
    public final /* synthetic */ R apply(@NonNull T1 t1, @NonNull T2 t2, @NonNull T3 t3, @NonNull T4 t4, @NonNull T5 t5, @NonNull T6 t6) {
        return this.f51283a.invoke(t1, t2, t3, t4, t5, t6);
    }
}
