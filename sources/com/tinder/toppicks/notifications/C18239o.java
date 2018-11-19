package com.tinder.toppicks.notifications;

import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.notifications.o */
public final class C18239o implements Factory<C3947n> {
    /* renamed from: a */
    private final Provider<TopPicksNotificationScheduler> f56533a;
    /* renamed from: b */
    private final Provider<TopPicksApplicationRepository> f56534b;
    /* renamed from: c */
    private final Provider<C17041d> f56535c;

    public /* synthetic */ Object get() {
        return m66103a();
    }

    public C18239o(Provider<TopPicksNotificationScheduler> provider, Provider<TopPicksApplicationRepository> provider2, Provider<C17041d> provider3) {
        this.f56533a = provider;
        this.f56534b = provider2;
        this.f56535c = provider3;
    }

    /* renamed from: a */
    public C3947n m66103a() {
        return C18239o.m66101a(this.f56533a, this.f56534b, this.f56535c);
    }

    /* renamed from: a */
    public static C3947n m66101a(Provider<TopPicksNotificationScheduler> provider, Provider<TopPicksApplicationRepository> provider2, Provider<C17041d> provider3) {
        return new C3947n((TopPicksNotificationScheduler) provider.get(), (TopPicksApplicationRepository) provider2.get(), (C17041d) provider3.get());
    }

    /* renamed from: b */
    public static C18239o m66102b(Provider<TopPicksNotificationScheduler> provider, Provider<TopPicksApplicationRepository> provider2, Provider<C17041d> provider3) {
        return new C18239o(provider, provider2, provider3);
    }
}
