package com.tinder.data.profile;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.v */
final class C10983v implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f35706a;

    C10983v(Function1 function1) {
        this.f35706a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f35706a.invoke(t), "invoke(...)");
    }
}
