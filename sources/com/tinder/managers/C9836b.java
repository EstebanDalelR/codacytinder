package com.tinder.managers;

import com.tinder.model.auth.LogoutFrom;

/* renamed from: com.tinder.managers.b */
final /* synthetic */ class C9836b implements Runnable {
    /* renamed from: a */
    private final C2652a f32594a;
    /* renamed from: b */
    private final LogoutFrom f32595b;

    C9836b(C2652a c2652a, LogoutFrom logoutFrom) {
        this.f32594a = c2652a;
        this.f32595b = logoutFrom;
    }

    public void run() {
        this.f32594a.b(this.f32595b);
    }
}
