package com.tinder.chat.presenter;

import com.tinder.profile.model.Profile;
import rx.functions.Action1;

/* renamed from: com.tinder.chat.presenter.o */
final /* synthetic */ class C13724o implements Action1 {
    /* renamed from: a */
    private final C8442a f43606a;
    /* renamed from: b */
    private final Profile f43607b;

    C13724o(C8442a c8442a, Profile profile) {
        this.f43606a = c8442a;
        this.f43607b = profile;
    }

    public void call(Object obj) {
        this.f43606a.m36048a(this.f43607b, (String) obj);
    }
}
