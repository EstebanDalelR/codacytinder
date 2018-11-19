package com.tinder.account.p072a;

import com.tinder.domain.auth.usecase.RegexEmailValidator;
import rx.functions.Func1;

/* renamed from: com.tinder.account.a.ab */
final /* synthetic */ class ab implements Func1 {
    /* renamed from: a */
    private final RegexEmailValidator f14005a;

    private ab(RegexEmailValidator regexEmailValidator) {
        this.f14005a = regexEmailValidator;
    }

    /* renamed from: a */
    static Func1 m17276a(RegexEmailValidator regexEmailValidator) {
        return new ab(regexEmailValidator);
    }

    public Object call(Object obj) {
        return Boolean.valueOf(this.f14005a.isValid((String) obj));
    }
}
