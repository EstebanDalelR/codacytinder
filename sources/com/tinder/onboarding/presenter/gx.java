package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PhotosStepTarget;
import rx.functions.Action1;

final /* synthetic */ class gx implements Action1 {
    /* renamed from: a */
    private final Throwable f44762a;

    gx(Throwable th) {
        this.f44762a = th;
    }

    public void call(Object obj) {
        ((PhotosStepTarget) obj).showErrorMessage(this.f44762a.getMessage());
    }
}
