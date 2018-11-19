package com.tinder.managers;

import com.tinder.model.User;
import rx.functions.Func1;

final /* synthetic */ class ao implements Func1 {
    /* renamed from: a */
    private final ManagerProfile f42485a;

    ao(ManagerProfile managerProfile) {
        this.f42485a = managerProfile;
    }

    public Object call(Object obj) {
        return this.f42485a.c((User) obj);
    }
}
