package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

final /* synthetic */ class ba implements Action1 {
    /* renamed from: a */
    static final Action1 f57873a = new ba();

    private ba() {
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).showProgressDialog();
    }
}
