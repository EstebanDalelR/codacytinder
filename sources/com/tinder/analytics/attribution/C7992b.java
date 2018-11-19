package com.tinder.analytics.attribution;

import com.tinder.domain.common.model.ProfileUser;
import rx.functions.Func1;

/* renamed from: com.tinder.analytics.attribution.b */
final /* synthetic */ class C7992b implements Func1 {
    /* renamed from: a */
    static final Func1 f28602a = new C7992b();

    private C7992b() {
    }

    public Object call(Object obj) {
        return ((ProfileUser) obj).id();
    }
}
