package com.tinder.feed.p248c;

import com.tinder.feed.view.provider.C9545e;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.d */
public final class C13254d implements Factory<C9545e> {
    /* renamed from: a */
    private final C9461b f41995a;
    /* renamed from: b */
    private final Provider<C9545e> f41996b;

    public /* synthetic */ Object get() {
        return m51277a();
    }

    public C13254d(C9461b c9461b, Provider<C9545e> provider) {
        this.f41995a = c9461b;
        this.f41996b = provider;
    }

    /* renamed from: a */
    public C9545e m51277a() {
        return C13254d.m51275a(this.f41995a, this.f41996b);
    }

    /* renamed from: a */
    public static C9545e m51275a(C9461b c9461b, Provider<C9545e> provider) {
        return C13254d.m51274a(c9461b, (C9545e) provider.get());
    }

    /* renamed from: b */
    public static C13254d m51276b(C9461b c9461b, Provider<C9545e> provider) {
        return new C13254d(c9461b, provider);
    }

    /* renamed from: a */
    public static C9545e m51274a(C9461b c9461b, C9545e c9545e) {
        return (C9545e) C15521i.a(c9461b.m39564a(c9545e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
