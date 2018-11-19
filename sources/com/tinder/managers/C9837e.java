package com.tinder.managers;

import com.tinder.listeners.ListenerDeleteAccount;

/* renamed from: com.tinder.managers.e */
final /* synthetic */ class C9837e implements Runnable {
    /* renamed from: a */
    private final C2652a f32605a;
    /* renamed from: b */
    private final ListenerDeleteAccount f32606b;

    C9837e(C2652a c2652a, ListenerDeleteAccount listenerDeleteAccount) {
        this.f32605a = c2652a;
        this.f32606b = listenerDeleteAccount;
    }

    public void run() {
        this.f32605a.b(this.f32606b);
    }
}
