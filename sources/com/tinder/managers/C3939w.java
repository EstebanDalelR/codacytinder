package com.tinder.managers;

import io.reactivex.functions.Consumer;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.managers.w */
final /* synthetic */ class C3939w implements Consumer {
    /* renamed from: a */
    static final Consumer f12413a = new C3939w();

    private C3939w() {
    }

    public void accept(Object obj) {
        C0001a.m30c((Throwable) obj, "Error while observing app visibility for %s", "TypingIndicatorWorker");
    }
}
