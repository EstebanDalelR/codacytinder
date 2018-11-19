package com.tinder.module;

import com.tinder.messageads.C12113a;
import com.tinder.messageads.UserAgentCache;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.p */
public final class C13495p implements Factory<C12113a> {
    /* renamed from: a */
    private final C9940d f43065a;
    /* renamed from: b */
    private final Provider<UserAgentCache> f43066b;

    public /* synthetic */ Object get() {
        return m52571a();
    }

    public C13495p(C9940d c9940d, Provider<UserAgentCache> provider) {
        this.f43065a = c9940d;
        this.f43066b = provider;
    }

    /* renamed from: a */
    public C12113a m52571a() {
        return C13495p.m52569a(this.f43065a, this.f43066b);
    }

    /* renamed from: a */
    public static C12113a m52569a(C9940d c9940d, Provider<UserAgentCache> provider) {
        return C13495p.m52568a(c9940d, (UserAgentCache) provider.get());
    }

    /* renamed from: b */
    public static C13495p m52570b(C9940d c9940d, Provider<UserAgentCache> provider) {
        return new C13495p(c9940d, provider);
    }

    /* renamed from: a */
    public static C12113a m52568a(C9940d c9940d, UserAgentCache userAgentCache) {
        return (C12113a) C15521i.a(c9940d.m40862a(userAgentCache), "Cannot return null from a non-@Nullable @Provides method");
    }
}
