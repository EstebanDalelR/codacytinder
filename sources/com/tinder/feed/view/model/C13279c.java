package com.tinder.feed.view.model;

import com.tinder.p204d.p205a.C8609a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.model.c */
public final class C13279c implements Factory<C9537a> {
    /* renamed from: a */
    private final Provider<C8609a> f42071a;

    public /* synthetic */ Object get() {
        return m51365a();
    }

    public C13279c(Provider<C8609a> provider) {
        this.f42071a = provider;
    }

    /* renamed from: a */
    public C9537a m51365a() {
        return C13279c.m51363a(this.f42071a);
    }

    /* renamed from: a */
    public static C9537a m51363a(Provider<C8609a> provider) {
        return new C9537a((C8609a) provider.get());
    }

    /* renamed from: b */
    public static C13279c m51364b(Provider<C8609a> provider) {
        return new C13279c(provider);
    }
}
