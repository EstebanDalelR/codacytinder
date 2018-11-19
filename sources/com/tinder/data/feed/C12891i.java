package com.tinder.data.feed;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.feed.i */
final class C12891i implements Func1 {
    /* renamed from: a */
    private final /* synthetic */ Function1 f41346a;

    C12891i(Function1 function1) {
        this.f41346a = function1;
    }

    public final /* synthetic */ R call(T t) {
        return this.f41346a.invoke(t);
    }
}
