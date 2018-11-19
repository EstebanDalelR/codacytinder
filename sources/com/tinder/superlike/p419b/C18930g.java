package com.tinder.superlike.p419b;

import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.superlike.p421e.C15082f;
import rx.functions.Action1;

/* renamed from: com.tinder.superlike.b.g */
final /* synthetic */ class C18930g implements Action1 {
    /* renamed from: a */
    private final C15082f f58587a;

    private C18930g(C15082f c15082f) {
        this.f58587a = c15082f;
    }

    /* renamed from: a */
    static Action1 m67424a(C15082f c15082f) {
        return new C18930g(c15082f);
    }

    public void call(Object obj) {
        this.f58587a.m56833a((SuperlikeStatus) obj);
    }
}
