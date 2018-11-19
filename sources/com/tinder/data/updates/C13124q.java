package com.tinder.data.updates;

import android.app.Application;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.updates.q */
public final class C13124q implements Factory<LastActivityDateRepository> {
    /* renamed from: a */
    private final Provider<Application> f41770a;

    public /* synthetic */ Object get() {
        return m51020a();
    }

    public C13124q(Provider<Application> provider) {
        this.f41770a = provider;
    }

    /* renamed from: a */
    public LastActivityDateRepository m51020a() {
        return C13124q.m51018a(this.f41770a);
    }

    /* renamed from: a */
    public static LastActivityDateRepository m51018a(Provider<Application> provider) {
        return C13124q.m51017a((Application) provider.get());
    }

    /* renamed from: b */
    public static C13124q m51019b(Provider<Application> provider) {
        return new C13124q(provider);
    }

    /* renamed from: a */
    public static LastActivityDateRepository m51017a(Application application) {
        return (LastActivityDateRepository) C15521i.a(C8811p.m37504a(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
