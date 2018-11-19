package com.tinder.feed.usecase;

import com.tinder.common.navigation.CurrentScreenTracker;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.usecase.f */
public final class C13274f implements Factory<C11707c> {
    /* renamed from: a */
    private final Provider<CurrentScreenTracker> f42038a;

    public /* synthetic */ Object get() {
        return m51332a();
    }

    public C13274f(Provider<CurrentScreenTracker> provider) {
        this.f42038a = provider;
    }

    /* renamed from: a */
    public C11707c m51332a() {
        return C13274f.m51330a(this.f42038a);
    }

    /* renamed from: a */
    public static C11707c m51330a(Provider<CurrentScreenTracker> provider) {
        return new C11707c((CurrentScreenTracker) provider.get());
    }

    /* renamed from: b */
    public static C13274f m51331b(Provider<CurrentScreenTracker> provider) {
        return new C13274f(provider);
    }
}
