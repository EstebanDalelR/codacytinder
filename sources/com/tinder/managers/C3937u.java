package com.tinder.managers;

import io.reactivex.functions.Consumer;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.managers.u */
final /* synthetic */ class C3937u implements Consumer {
    /* renamed from: a */
    static final Consumer f12411a = new C3937u();

    private C3937u() {
    }

    public void accept(Object obj) {
        C0001a.m30c((Throwable) obj, "Error while observing app visibility for %s", "UpdatesScheduler");
    }
}
