package com.tinder.account.p072a;

import com.tinder.domain.auth.usecase.RegexEmailValidator;
import rx.functions.Func1;

/* renamed from: com.tinder.account.a.z */
final /* synthetic */ class C4303z implements Func1 {
    /* renamed from: a */
    private final RegexEmailValidator f14023a;

    private C4303z(RegexEmailValidator regexEmailValidator) {
        this.f14023a = regexEmailValidator;
    }

    /* renamed from: a */
    static Func1 m17304a(RegexEmailValidator regexEmailValidator) {
        return new C4303z(regexEmailValidator);
    }

    public Object call(Object obj) {
        return Boolean.valueOf(this.f14023a.isValid((String) obj));
    }
}
