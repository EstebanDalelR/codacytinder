package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

final /* synthetic */ class aw implements Action1 {
    /* renamed from: a */
    static final Action1 f57870a = new aw();

    private aw() {
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).finishActivityWithSuccess();
    }
}
