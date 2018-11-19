package com.tinder.purchase.p371a;

import com.tinder.purchase.logging.C14522a;
import rx.functions.Action1;

/* renamed from: com.tinder.purchase.a.n */
final /* synthetic */ class C18617n implements Action1 {
    /* renamed from: a */
    private final C14522a f58048a;

    private C18617n(C14522a c14522a) {
        this.f58048a = c14522a;
    }

    /* renamed from: a */
    static Action1 m67069a(C14522a c14522a) {
        return new C18617n(c14522a);
    }

    public void call(Object obj) {
        this.f58048a.m55478a((Throwable) obj);
    }
}
