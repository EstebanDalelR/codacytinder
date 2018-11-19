package com.tinder.presenters;

import io.reactivex.functions.Consumer;
import p000a.p001a.C0001a;

final /* synthetic */ class dw implements Consumer {
    /* renamed from: a */
    static final Consumer f49878a = new dw();

    private dw() {
    }

    public void accept(Object obj) {
        C0001a.c((Throwable) obj, "Couldn't show top picks from deeplink", new Object[0]);
    }
}
