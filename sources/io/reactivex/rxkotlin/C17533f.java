package io.reactivex.rxkotlin;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 1}, k = 3, mv = {1, 1, 6})
/* renamed from: io.reactivex.rxkotlin.f */
final class C17533f implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f54166a;

    C17533f(Function1 function1) {
        this.f54166a = function1;
    }

    public final /* synthetic */ void accept(@NonNull T t) {
        C2668g.a(this.f54166a.invoke(t), "invoke(...)");
    }
}
