package com.tinder.onboarding.presenter;

import com.tinder.domain.auth.usecase.RegexEmailValidator;
import rx.functions.Func1;

final /* synthetic */ class az implements Func1 {
    /* renamed from: a */
    private final RegexEmailValidator f43137a;

    private az(RegexEmailValidator regexEmailValidator) {
        this.f43137a = regexEmailValidator;
    }

    /* renamed from: a */
    static Func1 m52694a(RegexEmailValidator regexEmailValidator) {
        return new az(regexEmailValidator);
    }

    public Object call(Object obj) {
        return Boolean.valueOf(this.f43137a.isValid((String) obj));
    }
}
