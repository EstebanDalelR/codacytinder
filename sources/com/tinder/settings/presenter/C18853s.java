package com.tinder.settings.presenter;

import p000a.p001a.C0001a;
import rx.functions.Action1;

/* renamed from: com.tinder.settings.presenter.s */
final /* synthetic */ class C18853s implements Action1 {
    /* renamed from: a */
    static final Action1 f58440a = new C18853s();

    private C18853s() {
    }

    public void call(Object obj) {
        C0001a.c((Throwable) obj, "error subscribing to placesAvailableProvider", new Object[0]);
    }
}
