package com.tinder.onboarding.repository;

import rx.functions.Action1;
import rx.subjects.C19785a;

/* renamed from: com.tinder.onboarding.repository.w */
final /* synthetic */ class C14108w implements Action1 {
    /* renamed from: a */
    private final C19785a f44791a;

    private C14108w(C19785a c19785a) {
        this.f44791a = c19785a;
    }

    /* renamed from: a */
    static Action1 m53826a(C19785a c19785a) {
        return new C14108w(c19785a);
    }

    public void call(Object obj) {
        this.f44791a.onError((Throwable) obj);
    }
}
