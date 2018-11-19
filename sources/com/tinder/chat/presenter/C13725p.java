package com.tinder.chat.presenter;

import com.tinder.profile.model.Profile;
import rx.functions.Action1;

/* renamed from: com.tinder.chat.presenter.p */
final /* synthetic */ class C13725p implements Action1 {
    /* renamed from: a */
    private final C8442a f43608a;
    /* renamed from: b */
    private final Profile f43609b;

    C13725p(C8442a c8442a, Profile profile) {
        this.f43608a = c8442a;
        this.f43609b = profile;
    }

    public void call(Object obj) {
        this.f43608a.m36049a(this.f43609b, (Throwable) obj);
    }
}
