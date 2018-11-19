package com.tinder.purchase.p371a;

import com.tinder.purchase.logging.C14522a;
import rx.functions.Action1;

/* renamed from: com.tinder.purchase.a.d */
final /* synthetic */ class C18612d implements Action1 {
    /* renamed from: a */
    private final C14522a f58041a;

    private C18612d(C14522a c14522a) {
        this.f58041a = c14522a;
    }

    /* renamed from: a */
    static Action1 m67068a(C14522a c14522a) {
        return new C18612d(c14522a);
    }

    public void call(Object obj) {
        this.f58041a.m55478a((Throwable) obj);
    }
}
