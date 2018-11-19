package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.presenters.y */
final /* synthetic */ class C18586y implements Action1 {
    /* renamed from: a */
    static final Action1 f57953a = new C18586y();

    private C18586y() {
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).saveCurrentUserPhotos();
    }
}
