package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.presenters.u */
final /* synthetic */ class C18585u implements Action1 {
    /* renamed from: a */
    static final Action1 f57952a = new C18585u();

    private C18585u() {
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).showGalleryIntentNotAvailableSnackbar();
    }
}
