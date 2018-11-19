package com.tinder.app.dagger.module;

import com.tinder.auth.observer.LoginObserver;
import com.tinder.typingindicator.worker.TypingIndicatorWorker;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.f */
public final class C12495f implements Factory<LoginObserver> {
    /* renamed from: a */
    private final C8244a f40286a;
    /* renamed from: b */
    private final Provider<TypingIndicatorWorker> f40287b;

    public /* synthetic */ Object get() {
        return m49153a();
    }

    public C12495f(C8244a c8244a, Provider<TypingIndicatorWorker> provider) {
        this.f40286a = c8244a;
        this.f40287b = provider;
    }

    /* renamed from: a */
    public LoginObserver m49153a() {
        return C12495f.m49151a(this.f40286a, this.f40287b);
    }

    /* renamed from: a */
    public static LoginObserver m49151a(C8244a c8244a, Provider<TypingIndicatorWorker> provider) {
        return C12495f.m49150a(c8244a, (TypingIndicatorWorker) provider.get());
    }

    /* renamed from: b */
    public static C12495f m49152b(C8244a c8244a, Provider<TypingIndicatorWorker> provider) {
        return new C12495f(c8244a, provider);
    }

    /* renamed from: a */
    public static LoginObserver m49150a(C8244a c8244a, TypingIndicatorWorker typingIndicatorWorker) {
        return (LoginObserver) C15521i.a(c8244a.m35146a(typingIndicatorWorker), "Cannot return null from a non-@Nullable @Provides method");
    }
}
