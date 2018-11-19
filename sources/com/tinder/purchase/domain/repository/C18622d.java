package com.tinder.purchase.domain.repository;

import java.util.Map;
import rx.functions.Action1;
import rx.subjects.C19785a;

/* renamed from: com.tinder.purchase.domain.repository.d */
final /* synthetic */ class C18622d implements Action1 {
    /* renamed from: a */
    private final C19785a f58058a;

    private C18622d(C19785a c19785a) {
        this.f58058a = c19785a;
    }

    /* renamed from: a */
    static Action1 m67074a(C19785a c19785a) {
        return new C18622d(c19785a);
    }

    public void call(Object obj) {
        this.f58058a.onNext((Map) obj);
    }
}
