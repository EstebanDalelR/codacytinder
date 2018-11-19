package com.tinder.managers;

import io.reactivex.functions.Consumer;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.managers.v */
final /* synthetic */ class C3938v implements Consumer {
    /* renamed from: a */
    static final Consumer f12412a = new C3938v();

    private C3938v() {
    }

    public void accept(Object obj) {
        C0001a.m30c((Throwable) obj, "Error while observing app visibility for %s", "AppVisibilityLogger");
    }
}
