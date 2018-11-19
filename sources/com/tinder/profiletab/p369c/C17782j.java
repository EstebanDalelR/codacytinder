package com.tinder.profiletab.p369c;

import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.home.p259b.C9695a;
import com.tinder.profiletab.p367a.C14458a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profiletab.c.j */
public final class C17782j implements Factory<C16184i> {
    /* renamed from: a */
    private final Provider<C9695a> f55483a;
    /* renamed from: b */
    private final Provider<C14458a> f55484b;
    /* renamed from: c */
    private final Provider<CheckTutorialViewed> f55485c;

    public /* synthetic */ Object get() {
        return m64984a();
    }

    public C17782j(Provider<C9695a> provider, Provider<C14458a> provider2, Provider<CheckTutorialViewed> provider3) {
        this.f55483a = provider;
        this.f55484b = provider2;
        this.f55485c = provider3;
    }

    /* renamed from: a */
    public C16184i m64984a() {
        return C17782j.m64982a(this.f55483a, this.f55484b, this.f55485c);
    }

    /* renamed from: a */
    public static C16184i m64982a(Provider<C9695a> provider, Provider<C14458a> provider2, Provider<CheckTutorialViewed> provider3) {
        return new C16184i((C9695a) provider.get(), (C14458a) provider2.get(), (CheckTutorialViewed) provider3.get());
    }

    /* renamed from: b */
    public static C17782j m64983b(Provider<C9695a> provider, Provider<C14458a> provider2, Provider<CheckTutorialViewed> provider3) {
        return new C17782j(provider, provider2, provider3);
    }
}
