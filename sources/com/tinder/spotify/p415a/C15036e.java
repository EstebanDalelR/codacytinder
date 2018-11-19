package com.tinder.spotify.p415a;

import com.tinder.model.User;
import java.util.concurrent.Callable;

/* renamed from: com.tinder.spotify.a.e */
final /* synthetic */ class C15036e implements Callable {
    /* renamed from: a */
    private final C15035a f46832a;
    /* renamed from: b */
    private final User f46833b;

    C15036e(C15035a c15035a, User user) {
        this.f46832a = c15035a;
        this.f46833b = user;
    }

    public Object call() {
        return this.f46832a.m56670b(this.f46833b);
    }
}
