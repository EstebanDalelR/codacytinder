package com.tinder.usecase;

import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.usecase.n */
public final class C18279n implements Factory<C17226m> {
    /* renamed from: a */
    private final Provider<FirebaseJobDispatcher> f56615a;

    public /* synthetic */ Object get() {
        return m66215a();
    }

    public C18279n(Provider<FirebaseJobDispatcher> provider) {
        this.f56615a = provider;
    }

    /* renamed from: a */
    public C17226m m66215a() {
        return C18279n.m66213a(this.f56615a);
    }

    /* renamed from: a */
    public static C17226m m66213a(Provider<FirebaseJobDispatcher> provider) {
        return new C17226m((FirebaseJobDispatcher) provider.get());
    }

    /* renamed from: b */
    public static C18279n m66214b(Provider<FirebaseJobDispatcher> provider) {
        return new C18279n(provider);
    }
}
