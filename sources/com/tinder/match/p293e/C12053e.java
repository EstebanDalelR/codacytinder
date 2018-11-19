package com.tinder.match.p293e;

import com.tinder.domain.match.model.Match;
import java8.util.function.Predicate;

/* renamed from: com.tinder.match.e.e */
final /* synthetic */ class C12053e implements Predicate {
    /* renamed from: a */
    static final Predicate f39194a = new C12053e();

    private C12053e() {
    }

    public boolean test(Object obj) {
        return (((Match) obj).getTouched() ^ 1);
    }
}
