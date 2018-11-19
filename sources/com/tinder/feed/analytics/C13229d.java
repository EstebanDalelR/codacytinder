package com.tinder.feed.analytics;

import com.tinder.common.tracker.recyclerview.p200c.C8573a;
import com.tinder.feed.analytics.events.C11688b;
import com.tinder.feed.view.tracker.C9551g;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.analytics.d */
public final class C13229d implements Factory<C9433c> {
    /* renamed from: a */
    private final Provider<C11688b> f41947a;
    /* renamed from: b */
    private final Provider<C8573a> f41948b;
    /* renamed from: c */
    private final Provider<C9551g> f41949c;

    public /* synthetic */ Object get() {
        return m51229a();
    }

    public C13229d(Provider<C11688b> provider, Provider<C8573a> provider2, Provider<C9551g> provider3) {
        this.f41947a = provider;
        this.f41948b = provider2;
        this.f41949c = provider3;
    }

    /* renamed from: a */
    public C9433c m51229a() {
        return C13229d.m51227a(this.f41947a, this.f41948b, this.f41949c);
    }

    /* renamed from: a */
    public static C9433c m51227a(Provider<C11688b> provider, Provider<C8573a> provider2, Provider<C9551g> provider3) {
        return new C9433c((C11688b) provider.get(), (C8573a) provider2.get(), (C9551g) provider3.get());
    }

    /* renamed from: b */
    public static C13229d m51228b(Provider<C11688b> provider, Provider<C8573a> provider2, Provider<C9551g> provider3) {
        return new C13229d(provider, provider2, provider3);
    }
}
