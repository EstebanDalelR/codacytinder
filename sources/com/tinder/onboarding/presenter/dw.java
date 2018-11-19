package com.tinder.onboarding.presenter;

import com.tinder.onboarding.presenter.dn.C9979a;
import java8.util.function.Consumer;
import rx.subjects.C19785a;

final /* synthetic */ class dw implements Consumer {
    /* renamed from: a */
    private final C19785a f39458a;

    private dw(C19785a c19785a) {
        this.f39458a = c19785a;
    }

    /* renamed from: a */
    static Consumer m48315a(C19785a c19785a) {
        return new dw(c19785a);
    }

    public void accept(Object obj) {
        this.f39458a.onNext((C9979a) obj);
    }
}
