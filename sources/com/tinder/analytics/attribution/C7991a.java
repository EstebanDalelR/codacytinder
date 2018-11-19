package com.tinder.analytics.attribution;

import com.tinder.domain.common.model.ProfileUser;
import rx.functions.Func1;

/* renamed from: com.tinder.analytics.attribution.a */
final /* synthetic */ class C7991a implements Func1 {
    /* renamed from: a */
    static final Func1 f28601a = new C7991a();

    private C7991a() {
    }

    public Object call(Object obj) {
        return AppsFlyerAttributionTracker.m31214a((ProfileUser) obj);
    }
}
