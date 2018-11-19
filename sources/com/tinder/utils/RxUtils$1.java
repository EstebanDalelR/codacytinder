package com.tinder.utils;

import p000a.p001a.C0001a;
import rx.CompletableSubscriber;
import rx.Subscription;

class RxUtils$1 implements CompletableSubscriber {
    public void onCompleted() {
    }

    public void onSubscribe(Subscription subscription) {
    }

    RxUtils$1() {
    }

    public void onError(Throwable th) {
        C0001a.c(th);
    }
}
