package com.tinder.superlike.p421e;

import com.tinder.domain.superlike.SuperlikeStatus;
import rx.functions.Action1;
import rx.subjects.C19785a;

/* renamed from: com.tinder.superlike.e.g */
final /* synthetic */ class C18933g implements Action1 {
    /* renamed from: a */
    private final C19785a f58590a;

    private C18933g(C19785a c19785a) {
        this.f58590a = c19785a;
    }

    /* renamed from: a */
    static Action1 m67425a(C19785a c19785a) {
        return new C18933g(c19785a);
    }

    public void call(Object obj) {
        this.f58590a.onNext((SuperlikeStatus) obj);
    }
}
