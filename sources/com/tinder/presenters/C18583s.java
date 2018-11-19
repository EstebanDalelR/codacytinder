package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.presenters.s */
final /* synthetic */ class C18583s implements Action1 {
    /* renamed from: a */
    static final Action1 f57950a = new C18583s();

    private C18583s() {
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).selectPhotosWithFacebook();
    }
}
