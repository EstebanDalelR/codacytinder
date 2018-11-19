package com.tinder.chat.presenter;

import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.chat.presenter.f */
final /* synthetic */ class C10549f implements Consumer {
    /* renamed from: a */
    private final C8442a f34299a;
    /* renamed from: b */
    private final String f34300b;

    C10549f(C8442a c8442a, String str) {
        this.f34299a = c8442a;
        this.f34300b = str;
    }

    public void accept(Object obj) {
        this.f34299a.m36061b(this.f34300b, (Throwable) obj);
    }
}
