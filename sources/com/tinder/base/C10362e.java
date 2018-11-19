package com.tinder.base;

import com.tinder.pushnotifications.model.TinderNotification;
import java8.util.function.Predicate;

/* renamed from: com.tinder.base.e */
final /* synthetic */ class C10362e implements Predicate {
    /* renamed from: a */
    static final Predicate f33814a = new C10362e();

    private C10362e() {
    }

    public boolean test(Object obj) {
        return ActivitySignedInBase.a((TinderNotification) obj);
    }
}
