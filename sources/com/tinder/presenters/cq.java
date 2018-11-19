package com.tinder.presenters;

import com.tinder.model.auth.AuthException;
import com.tinder.targets.LoginTarget;
import java8.util.Optional;
import rx.functions.Action1;

final /* synthetic */ class cq implements Action1 {
    /* renamed from: a */
    private final Throwable f57896a;

    cq(Throwable th) {
        this.f57896a = th;
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showLoginFailedDialog(Optional.m59120a(Integer.valueOf(((AuthException) this.f57896a).getErrorCode())));
    }
}
