package com.tinder.settingsemail.email.shadowrepository;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.settingsemail.email.shadowrepository.b */
final class C16704b implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f51683a;

    C16704b(Function1 function1) {
        this.f51683a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f51683a.invoke(t), "invoke(...)");
    }
}
