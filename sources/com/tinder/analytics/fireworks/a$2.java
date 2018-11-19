package com.tinder.analytics.fireworks;

import java.util.List;
import rx.functions.Func1;

class a$2 implements Func1<List<C2632i>, Boolean> {
    /* renamed from: a */
    final /* synthetic */ C2628a f28632a;

    a$2(C2628a c2628a) {
        this.f28632a = c2628a;
    }

    public /* synthetic */ Object call(Object obj) {
        return m33909a((List) obj);
    }

    /* renamed from: a */
    public Boolean m33909a(List<C2632i> list) {
        return Boolean.valueOf(list.isEmpty() ^ 1);
    }
}
