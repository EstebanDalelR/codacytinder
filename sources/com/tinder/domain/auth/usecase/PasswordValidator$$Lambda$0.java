package com.tinder.domain.auth.usecase;

import rx.functions.Func1;

final /* synthetic */ class PasswordValidator$$Lambda$0 implements Func1 {
    private final PasswordValidator arg$1;

    PasswordValidator$$Lambda$0(PasswordValidator passwordValidator) {
        this.arg$1 = passwordValidator;
    }

    public Object call(Object obj) {
        return this.arg$1.validate((CharSequence) obj);
    }
}
