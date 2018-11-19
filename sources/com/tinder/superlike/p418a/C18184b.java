package com.tinder.superlike.p418a;

import com.tinder.data.adapter.aq;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.superlike.a.b */
public final class C18184b implements Factory<C15066a> {
    /* renamed from: a */
    private final Provider<aq> f56377a;

    public /* synthetic */ Object get() {
        return m65937a();
    }

    public C18184b(Provider<aq> provider) {
        this.f56377a = provider;
    }

    /* renamed from: a */
    public C15066a m65937a() {
        return C18184b.m65935a(this.f56377a);
    }

    /* renamed from: a */
    public static C15066a m65935a(Provider<aq> provider) {
        return new C15066a((aq) provider.get());
    }

    /* renamed from: b */
    public static C18184b m65936b(Provider<aq> provider) {
        return new C18184b(provider);
    }
}
