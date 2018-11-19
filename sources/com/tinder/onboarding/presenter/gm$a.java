package com.tinder.onboarding.presenter;

import com.tinder.onboarding.exception.OnboardingInternalErrorException;
import p000a.p001a.C0001a;
import rx.CompletableSubscriber;
import rx.Subscription;

class gm$a implements CompletableSubscriber {
    /* renamed from: a */
    final /* synthetic */ gm f39461a;

    public void onCompleted() {
    }

    public void onSubscribe(Subscription subscription) {
    }

    private gm$a(gm gmVar) {
        this.f39461a = gmVar;
    }

    public void onError(Throwable th) {
        if (th instanceof OnboardingInternalErrorException) {
            gm.a(this.f39461a, new gx(th));
        }
        C0001a.c(th);
    }
}
