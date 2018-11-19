package com.tinder.onboarding.presenter;

import com.tinder.domain.auth.usecase.PasswordValidator;
import rx.functions.Func1;

final /* synthetic */ class fl implements Func1 {
    /* renamed from: a */
    private final PasswordValidator f43188a;

    private fl(PasswordValidator passwordValidator) {
        this.f43188a = passwordValidator;
    }

    /* renamed from: a */
    static Func1 m52835a(PasswordValidator passwordValidator) {
        return new fl(passwordValidator);
    }

    public Object call(Object obj) {
        return this.f43188a.execute((CharSequence) (String) obj);
    }
}
