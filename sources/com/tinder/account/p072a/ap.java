package com.tinder.account.p072a;

import com.tinder.domain.auth.usecase.PasswordValidator;
import rx.functions.Func1;

/* renamed from: com.tinder.account.a.ap */
final /* synthetic */ class ap implements Func1 {
    /* renamed from: a */
    private final PasswordValidator f14010a;

    private ap(PasswordValidator passwordValidator) {
        this.f14010a = passwordValidator;
    }

    /* renamed from: a */
    static Func1 m17288a(PasswordValidator passwordValidator) {
        return new ap(passwordValidator);
    }

    public Object call(Object obj) {
        return this.f14010a.execute((String) obj);
    }
}
