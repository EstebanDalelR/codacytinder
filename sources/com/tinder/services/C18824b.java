package com.tinder.services;

import p000a.p001a.C0001a;
import rx.functions.Action1;

/* renamed from: com.tinder.services.b */
final /* synthetic */ class C18824b implements Action1 {
    /* renamed from: a */
    static final Action1 f58364a = new C18824b();

    private C18824b() {
    }

    public void call(Object obj) {
        C0001a.e("Error registering push token!!", new Object[]{(Throwable) obj});
    }
}
