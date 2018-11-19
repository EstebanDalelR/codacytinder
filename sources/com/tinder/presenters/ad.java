package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

final /* synthetic */ class ad implements Action1 {
    /* renamed from: a */
    private final String f57857a;

    ad(String str) {
        this.f57857a = str;
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).delegateLocalPhotoAdded(this.f57857a);
    }
}
