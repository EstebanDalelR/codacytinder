package com.tinder.profile.presenter;

import com.tinder.model.User;
import com.tinder.profile.adapters.C14367k;
import rx.functions.Func1;

/* renamed from: com.tinder.profile.presenter.o */
final /* synthetic */ class C17767o implements Func1 {
    /* renamed from: a */
    private final C14367k f55442a;

    private C17767o(C14367k c14367k) {
        this.f55442a = c14367k;
    }

    /* renamed from: a */
    static Func1 m64956a(C14367k c14367k) {
        return new C17767o(c14367k);
    }

    public Object call(Object obj) {
        return this.f55442a.m54736a((User) obj);
    }
}
