package com.tinder.presenters;

import com.tinder.targets.MainActivityTarget;
import io.reactivex.functions.Action;

final /* synthetic */ class fn implements Action {
    /* renamed from: a */
    private final MainActivityTarget f49903a;

    private fn(MainActivityTarget mainActivityTarget) {
        this.f49903a = mainActivityTarget;
    }

    /* renamed from: a */
    static Action m60824a(MainActivityTarget mainActivityTarget) {
        return new fn(mainActivityTarget);
    }

    public void run() {
        this.f49903a.hideProgressBar();
    }
}
