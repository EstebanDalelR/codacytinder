package com.tinder.analytics.fireworks;

import javax.annotation.Nonnull;
import rx.Completable;

/* renamed from: com.tinder.analytics.fireworks.a */
class C2628a {
    @Nonnull
    /* renamed from: a */
    private final EventQueue f8202a;
    @Nonnull
    /* renamed from: b */
    private final FireworksNetworkClient f8203b;

    C2628a(@Nonnull EventQueue eventQueue, @Nonnull FireworksNetworkClient fireworksNetworkClient) {
        this.f8202a = eventQueue;
        this.f8203b = fireworksNetworkClient;
    }

    /* renamed from: a */
    Completable m9850a() {
        return this.f8202a.flush().f(new a$2(this)).h(new a$1(this)).b();
    }
}
