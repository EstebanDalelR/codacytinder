package com.tinder.auth.interactor;

import com.tinder.auth.model.AuthType;
import io.reactivex.functions.Action;

/* renamed from: com.tinder.auth.interactor.m */
final /* synthetic */ class C10334m implements Action {
    /* renamed from: a */
    private final C8280l f33752a;
    /* renamed from: b */
    private final AuthType f33753b;

    C10334m(C8280l c8280l, AuthType authType) {
        this.f33752a = c8280l;
        this.f33753b = authType;
    }

    public void run() {
        this.f33752a.m35344b(this.f33753b);
    }
}
