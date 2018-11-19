package com.tinder.analytics.fireworks;

import p000a.p001a.C0001a;
import rx.functions.Action0;

/* renamed from: com.tinder.analytics.fireworks.n */
final /* synthetic */ class C8140n implements Action0 {
    /* renamed from: a */
    private final C2632i f29151a;

    C8140n(C2632i c2632i) {
        this.f29151a = c2632i;
    }

    public void call() {
        C0001a.b("Inserted event: %s", new Object[]{this.f29151a.b()});
    }
}
