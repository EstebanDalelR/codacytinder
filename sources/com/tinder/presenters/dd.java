package com.tinder.presenters;

import com.tinder.presenters.bw.C17742a;
import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class dd implements Action1 {
    /* renamed from: a */
    private final C17742a f57907a;
    /* renamed from: b */
    private final Throwable f57908b;

    dd(C17742a c17742a, Throwable th) {
        this.f57907a = c17742a;
        this.f57908b = th;
    }

    public void call(Object obj) {
        this.f57907a.m64630a(this.f57908b, (LoginTarget) obj);
    }
}
