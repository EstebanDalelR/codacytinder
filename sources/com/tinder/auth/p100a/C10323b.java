package com.tinder.auth.p100a;

import com.tinder.domain.experiments.Buckets;
import io.reactivex.functions.Function;

/* renamed from: com.tinder.auth.a.b */
final /* synthetic */ class C10323b implements Function {
    /* renamed from: a */
    private final C4304a f33725a;

    C10323b(C4304a c4304a) {
        this.f33725a = c4304a;
    }

    public Object apply(Object obj) {
        return this.f33725a.a((Buckets) obj);
    }
}
