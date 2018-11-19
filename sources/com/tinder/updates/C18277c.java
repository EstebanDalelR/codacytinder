package com.tinder.updates;

import com.tinder.managers.C2652a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.updates.c */
public final class C18277c implements Factory<C3949b> {
    /* renamed from: a */
    private final Provider<UpdatesScheduler> f56612a;
    /* renamed from: b */
    private final Provider<C2652a> f56613b;

    public /* synthetic */ Object get() {
        return m66209a();
    }

    /* renamed from: a */
    public C3949b m66209a() {
        return C18277c.m66208a(this.f56612a, this.f56613b);
    }

    /* renamed from: a */
    public static C3949b m66208a(Provider<UpdatesScheduler> provider, Provider<C2652a> provider2) {
        return new C3949b((UpdatesScheduler) provider.get(), (C2652a) provider2.get());
    }

    /* renamed from: a */
    public static C3949b m66207a(UpdatesScheduler updatesScheduler, C2652a c2652a) {
        return new C3949b(updatesScheduler, c2652a);
    }
}
