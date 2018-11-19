package com.tinder.onboarding.presenter;

import rx.functions.Action1;
import rx.subjects.C19785a;

/* renamed from: com.tinder.onboarding.presenter.k */
final /* synthetic */ class C14093k implements Action1 {
    /* renamed from: a */
    private final C19785a f44765a;

    private C14093k(C19785a c19785a) {
        this.f44765a = c19785a;
    }

    /* renamed from: a */
    static Action1 m53821a(C19785a c19785a) {
        return new C14093k(c19785a);
    }

    public void call(Object obj) {
        this.f44765a.onError((Throwable) obj);
    }
}
