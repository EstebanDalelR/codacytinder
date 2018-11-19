package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.presenters.z */
final /* synthetic */ class C18587z implements Action1 {
    /* renamed from: a */
    static final Action1 f57954a = new C18587z();

    private C18587z() {
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).saveCurrentUserProfile();
    }
}
