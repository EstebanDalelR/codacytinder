package com.tinder.app.dagger.module;

import com.tinder.analytics.experiment.C6220a;
import com.tinder.auth.observer.LoginObserver;
import com.tinder.auth.repository.AuthSessionRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b */
public final class C12482b implements Factory<LoginObserver> {
    /* renamed from: a */
    private final C8244a f40255a;
    /* renamed from: b */
    private final Provider<AuthSessionRepository> f40256b;
    /* renamed from: c */
    private final Provider<C6220a> f40257c;

    public /* synthetic */ Object get() {
        return m49102a();
    }

    public C12482b(C8244a c8244a, Provider<AuthSessionRepository> provider, Provider<C6220a> provider2) {
        this.f40255a = c8244a;
        this.f40256b = provider;
        this.f40257c = provider2;
    }

    /* renamed from: a */
    public LoginObserver m49102a() {
        return C12482b.m49100a(this.f40255a, this.f40256b, this.f40257c);
    }

    /* renamed from: a */
    public static LoginObserver m49100a(C8244a c8244a, Provider<AuthSessionRepository> provider, Provider<C6220a> provider2) {
        return C12482b.m49099a(c8244a, (AuthSessionRepository) provider.get(), (C6220a) provider2.get());
    }

    /* renamed from: b */
    public static C12482b m49101b(C8244a c8244a, Provider<AuthSessionRepository> provider, Provider<C6220a> provider2) {
        return new C12482b(c8244a, provider, provider2);
    }

    /* renamed from: a */
    public static LoginObserver m49099a(C8244a c8244a, AuthSessionRepository authSessionRepository, C6220a c6220a) {
        return (LoginObserver) C15521i.a(c8244a.m35142a(authSessionRepository, c6220a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
