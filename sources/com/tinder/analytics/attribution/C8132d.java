package com.tinder.analytics.attribution;

import com.appsflyer.C3010d;
import rx.functions.Action1;

/* renamed from: com.tinder.analytics.attribution.d */
final /* synthetic */ class C8132d implements Action1 {
    /* renamed from: a */
    private final C3010d f29138a;

    private C8132d(C3010d c3010d) {
        this.f29138a = c3010d;
    }

    /* renamed from: a */
    static Action1 m34537a(C3010d c3010d) {
        return new C8132d(c3010d);
    }

    public void call(Object obj) {
        this.f29138a.b((String) obj);
    }
}
