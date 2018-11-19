package com.tinder.data.user;

import com.tinder.api.model.common.User;
import com.tinder.data.adapter.C10745y;
import rx.functions.Func1;

/* renamed from: com.tinder.data.user.c */
final /* synthetic */ class C13131c implements Func1 {
    /* renamed from: a */
    private final C10745y f41784a;

    private C13131c(C10745y c10745y) {
        this.f41784a = c10745y;
    }

    /* renamed from: a */
    static Func1 m51040a(C10745y c10745y) {
        return new C13131c(c10745y);
    }

    public Object call(Object obj) {
        return this.f41784a.m43149a((User) obj);
    }
}
