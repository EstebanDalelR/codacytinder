package com.tinder.account.p072a;

import com.tinder.domain.auth.usecase.RegexEmailValidator;
import rx.functions.Func1;

/* renamed from: com.tinder.account.a.y */
final /* synthetic */ class C4302y implements Func1 {
    /* renamed from: a */
    private final RegexEmailValidator f14022a;

    private C4302y(RegexEmailValidator regexEmailValidator) {
        this.f14022a = regexEmailValidator;
    }

    /* renamed from: a */
    static Func1 m17303a(RegexEmailValidator regexEmailValidator) {
        return new C4302y(regexEmailValidator);
    }

    public Object call(Object obj) {
        return Boolean.valueOf(this.f14022a.isValid((String) obj));
    }
}
