package com.tinder.toppicks.domain.worker;

import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.domain.worker.f */
public final class C18229f implements Factory<C15253e> {
    /* renamed from: a */
    private final Provider<Set<TopPicksWorker>> f56511a;

    public /* synthetic */ Object get() {
        return m66075a();
    }

    public C18229f(Provider<Set<TopPicksWorker>> provider) {
        this.f56511a = provider;
    }

    /* renamed from: a */
    public C15253e m66075a() {
        return C18229f.m66073a(this.f56511a);
    }

    /* renamed from: a */
    public static C15253e m66073a(Provider<Set<TopPicksWorker>> provider) {
        return new C15253e((Set) provider.get());
    }

    /* renamed from: b */
    public static C18229f m66074b(Provider<Set<TopPicksWorker>> provider) {
        return new C18229f(provider);
    }
}
