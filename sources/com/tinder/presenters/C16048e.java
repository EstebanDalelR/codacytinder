package com.tinder.presenters;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.meta.model.PlusControlSettings;
import io.reactivex.functions.BiFunction;

/* renamed from: com.tinder.presenters.e */
final /* synthetic */ class C16048e implements BiFunction {
    /* renamed from: a */
    private final C17744d f49879a;

    C16048e(C17744d c17744d) {
        this.f49879a = c17744d;
    }

    public Object apply(Object obj, Object obj2) {
        return this.f49879a.m64716a((Subscription) obj, (PlusControlSettings) obj2);
    }
}
