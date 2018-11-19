package com.tinder.managers;

import java.util.concurrent.Callable;

final /* synthetic */ class ap implements Callable {
    /* renamed from: a */
    private final ManagerProfile f32593a;

    ap(ManagerProfile managerProfile) {
        this.f32593a = managerProfile;
    }

    public Object call() {
        return this.f32593a.g();
    }
}
