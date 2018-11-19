package com.tinder.presenters;

import com.tinder.interfaces.InstagramLoginView;
import io.reactivex.functions.Action;

final /* synthetic */ class br implements Action {
    /* renamed from: a */
    private final InstagramLoginView f49861a;

    private br(InstagramLoginView instagramLoginView) {
        this.f49861a = instagramLoginView;
    }

    /* renamed from: a */
    static Action m60823a(InstagramLoginView instagramLoginView) {
        return new br(instagramLoginView);
    }

    public void run() {
        this.f49861a.hideProgress();
    }
}
