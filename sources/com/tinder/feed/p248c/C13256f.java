package com.tinder.feed.p248c;

import com.tinder.feed.analytics.C9433c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.f */
public final class C13256f implements Factory<C9433c> {
    /* renamed from: a */
    private final C9461b f42002a;
    /* renamed from: b */
    private final Provider<C9433c> f42003b;

    public /* synthetic */ Object get() {
        return m51285a();
    }

    public C13256f(C9461b c9461b, Provider<C9433c> provider) {
        this.f42002a = c9461b;
        this.f42003b = provider;
    }

    /* renamed from: a */
    public C9433c m51285a() {
        return C13256f.m51283a(this.f42002a, this.f42003b);
    }

    /* renamed from: a */
    public static C9433c m51283a(C9461b c9461b, Provider<C9433c> provider) {
        return C13256f.m51282a(c9461b, (C9433c) provider.get());
    }

    /* renamed from: b */
    public static C13256f m51284b(C9461b c9461b, Provider<C9433c> provider) {
        return new C13256f(c9461b, provider);
    }

    /* renamed from: a */
    public static C9433c m51282a(C9461b c9461b, C9433c c9433c) {
        return (C9433c) C15521i.a(c9461b.m39561a(c9433c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
