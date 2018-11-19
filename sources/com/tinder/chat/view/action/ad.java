package com.tinder.chat.view.action;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class ad implements Factory<ac> {
    /* renamed from: a */
    private final Provider<ae> f41087a;

    public /* synthetic */ Object get() {
        return m50132a();
    }

    public ad(Provider<ae> provider) {
        this.f41087a = provider;
    }

    /* renamed from: a */
    public ac m50132a() {
        return m50130a(this.f41087a);
    }

    /* renamed from: a */
    public static ac m50130a(Provider<ae> provider) {
        return new ac((ae) provider.get());
    }

    /* renamed from: b */
    public static ad m50131b(Provider<ae> provider) {
        return new ad(provider);
    }
}
