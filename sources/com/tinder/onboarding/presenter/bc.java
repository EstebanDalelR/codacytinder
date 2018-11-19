package com.tinder.onboarding.presenter;

import com.tinder.domain.auth.usecase.RegexEmailValidator;
import rx.functions.Func1;

final /* synthetic */ class bc implements Func1 {
    /* renamed from: a */
    private final RegexEmailValidator f43141a;

    private bc(RegexEmailValidator regexEmailValidator) {
        this.f43141a = regexEmailValidator;
    }

    /* renamed from: a */
    static Func1 m52699a(RegexEmailValidator regexEmailValidator) {
        return new bc(regexEmailValidator);
    }

    public Object call(Object obj) {
        return Boolean.valueOf(this.f43141a.isValid((String) obj));
    }
}
