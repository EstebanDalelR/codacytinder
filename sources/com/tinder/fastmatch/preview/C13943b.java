package com.tinder.fastmatch.preview;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.preview.b */
final class C13943b implements Action1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f44068a;

    C13943b(Function1 function1) {
        this.f44068a = function1;
    }

    public final /* synthetic */ void call(T t) {
        C2668g.a(this.f44068a.invoke(t), "invoke(...)");
    }
}
