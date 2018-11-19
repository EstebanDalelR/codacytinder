package com.tinder.utils;

import p000a.p001a.C0001a;
import rx.CompletableSubscriber;
import rx.Subscription;

class RxUtils$2 implements CompletableSubscriber {
    /* renamed from: a */
    final /* synthetic */ String f52813a;

    public void onCompleted() {
    }

    public void onSubscribe(Subscription subscription) {
    }

    RxUtils$2(String str) {
        this.f52813a = str;
    }

    public void onError(Throwable th) {
        C0001a.c(th, this.f52813a, new Object[0]);
    }
}
