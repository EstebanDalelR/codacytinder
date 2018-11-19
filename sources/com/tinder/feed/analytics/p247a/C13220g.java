package com.tinder.feed.analytics.p247a;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.feed.analytics.a.g */
public final class C13220g implements Factory<C9426f> {
    /* renamed from: a */
    private final Provider<C9427h> f41936a;
    /* renamed from: b */
    private final Provider<Function0<DateTime>> f41937b;

    public /* synthetic */ Object get() {
        return m51214a();
    }

    public C13220g(Provider<C9427h> provider, Provider<Function0<DateTime>> provider2) {
        this.f41936a = provider;
        this.f41937b = provider2;
    }

    /* renamed from: a */
    public C9426f m51214a() {
        return C13220g.m51212a(this.f41936a, this.f41937b);
    }

    /* renamed from: a */
    public static C9426f m51212a(Provider<C9427h> provider, Provider<Function0<DateTime>> provider2) {
        return new C9426f((C9427h) provider.get(), (Function0) provider2.get());
    }

    /* renamed from: b */
    public static C13220g m51213b(Provider<C9427h> provider, Provider<Function0<DateTime>> provider2) {
        return new C13220g(provider, provider2);
    }
}
