package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

final /* synthetic */ class aa implements Action1 {
    /* renamed from: a */
    static final Action1 f57853a = new aa();

    private aa() {
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).delegatePhotoAddedWithFacebookConnected();
    }
}
