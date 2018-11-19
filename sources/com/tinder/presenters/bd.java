package com.tinder.presenters;

import com.tinder.domain.common.model.User;
import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

final /* synthetic */ class bd implements Action1 {
    /* renamed from: a */
    private final C17744d f57874a;
    /* renamed from: b */
    private final User f57875b;

    bd(C17744d c17744d, User user) {
        this.f57874a = c17744d;
        this.f57875b = user;
    }

    public void call(Object obj) {
        this.f57874a.m64717a(this.f57875b, (FragmentViewProfileTarget) obj);
    }
}
