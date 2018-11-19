package com.tinder.presenters;

import rx.functions.Func1;

final /* synthetic */ class gf implements Func1 {
    /* renamed from: a */
    private final PresenterBase f55372a;

    gf(PresenterBase presenterBase) {
        this.f55372a = presenterBase;
    }

    public Object call(Object obj) {
        return this.f55372a.b((PresenterBase$LifecycleEvent) obj);
    }
}
