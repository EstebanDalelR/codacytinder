package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

final /* synthetic */ class ac implements Action1 {
    /* renamed from: a */
    static final Action1 f57856a = new ac();

    private ac() {
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).delegateLegacyPhotoAddedWithFacebookConnected();
    }
}
