package com.tinder.analytics.fireworks;

import p000a.p001a.C0001a;
import rx.functions.Action1;

/* renamed from: com.tinder.analytics.fireworks.o */
final /* synthetic */ class C8141o implements Action1 {
    /* renamed from: a */
    private final C2632i f29152a;

    C8141o(C2632i c2632i) {
        this.f29152a = c2632i;
    }

    public void call(Object obj) {
        C0001a.c((Throwable) obj, "Error inserting event: %s", new Object[]{this.f29152a.b()});
    }
}
