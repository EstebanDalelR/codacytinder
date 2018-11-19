package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

final /* synthetic */ class az implements Action1 {
    /* renamed from: a */
    static final Action1 f57872a = new az();

    private az() {
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).dismissProgressDialog();
    }
}
