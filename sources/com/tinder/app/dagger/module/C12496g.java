package com.tinder.app.dagger.module;

import com.tinder.auth.observer.LoginObserver;
import com.tinder.updates.UpdatesScheduler;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.g */
public final class C12496g implements Factory<LoginObserver> {
    /* renamed from: a */
    private final C8244a f40288a;
    /* renamed from: b */
    private final Provider<UpdatesScheduler> f40289b;

    public /* synthetic */ Object get() {
        return m49157a();
    }

    public C12496g(C8244a c8244a, Provider<UpdatesScheduler> provider) {
        this.f40288a = c8244a;
        this.f40289b = provider;
    }

    /* renamed from: a */
    public LoginObserver m49157a() {
        return C12496g.m49155a(this.f40288a, this.f40289b);
    }

    /* renamed from: a */
    public static LoginObserver m49155a(C8244a c8244a, Provider<UpdatesScheduler> provider) {
        return C12496g.m49154a(c8244a, (UpdatesScheduler) provider.get());
    }

    /* renamed from: b */
    public static C12496g m49156b(C8244a c8244a, Provider<UpdatesScheduler> provider) {
        return new C12496g(c8244a, provider);
    }

    /* renamed from: a */
    public static LoginObserver m49154a(C8244a c8244a, UpdatesScheduler updatesScheduler) {
        return (LoginObserver) C15521i.a(c8244a.m35147a(updatesScheduler), "Cannot return null from a non-@Nullable @Provides method");
    }
}
