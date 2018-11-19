package com.tinder.interactors.p262a;

import com.tinder.data.meta.p226a.C10849m;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.interactors.a.j */
public final class C13339j implements Factory<C9712i> {
    /* renamed from: a */
    private final Provider<C9710e> f42312a;
    /* renamed from: b */
    private final Provider<C9711g> f42313b;
    /* renamed from: c */
    private final Provider<C9708a> f42314c;
    /* renamed from: d */
    private final Provider<C9709c> f42315d;
    /* renamed from: e */
    private final Provider<C10849m> f42316e;

    public /* synthetic */ Object get() {
        return m51609a();
    }

    public C13339j(Provider<C9710e> provider, Provider<C9711g> provider2, Provider<C9708a> provider3, Provider<C9709c> provider4, Provider<C10849m> provider5) {
        this.f42312a = provider;
        this.f42313b = provider2;
        this.f42314c = provider3;
        this.f42315d = provider4;
        this.f42316e = provider5;
    }

    /* renamed from: a */
    public C9712i m51609a() {
        return C13339j.m51607a(this.f42312a, this.f42313b, this.f42314c, this.f42315d, this.f42316e);
    }

    /* renamed from: a */
    public static C9712i m51607a(Provider<C9710e> provider, Provider<C9711g> provider2, Provider<C9708a> provider3, Provider<C9709c> provider4, Provider<C10849m> provider5) {
        return new C9712i((C9710e) provider.get(), (C9711g) provider2.get(), (C9708a) provider3.get(), (C9709c) provider4.get(), (C10849m) provider5.get());
    }

    /* renamed from: b */
    public static C13339j m51608b(Provider<C9710e> provider, Provider<C9711g> provider2, Provider<C9708a> provider3, Provider<C9709c> provider4, Provider<C10849m> provider5) {
        return new C13339j(provider, provider2, provider3, provider4, provider5);
    }
}
