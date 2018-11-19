package com.tinder.onboarding.presenter;

import com.tinder.domain.auth.usecase.RegexEmailValidator;
import rx.functions.Func1;

final /* synthetic */ class ba implements Func1 {
    /* renamed from: a */
    private final RegexEmailValidator f43139a;

    private ba(RegexEmailValidator regexEmailValidator) {
        this.f43139a = regexEmailValidator;
    }

    /* renamed from: a */
    static Func1 m52698a(RegexEmailValidator regexEmailValidator) {
        return new ba(regexEmailValidator);
    }

    public Object call(Object obj) {
        return Boolean.valueOf(this.f43139a.isValid((String) obj));
    }
}
