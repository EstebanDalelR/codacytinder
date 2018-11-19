package com.tinder.onboarding.presenter;

import android.net.Uri;
import com.tinder.onboarding.target.PhotosStepTarget;
import rx.functions.Action1;

final /* synthetic */ class gp implements Action1 {
    /* renamed from: a */
    private final Uri f44754a;

    gp(Uri uri) {
        this.f44754a = uri;
    }

    public void call(Object obj) {
        gm.a(this.f44754a, (PhotosStepTarget) obj);
    }
}
