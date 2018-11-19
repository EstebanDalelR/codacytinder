package com.tinder.data.updates;

import com.tinder.domain.updates.PollIntervalRepository;
import com.tinder.domain.updates.UpdateSignalRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.updates.s */
public final class C13126s implements Factory<UpdateSignalRepository> {
    /* renamed from: a */
    private final Provider<PollIntervalRepository> f41772a;

    public /* synthetic */ Object get() {
        return m51028a();
    }

    public C13126s(Provider<PollIntervalRepository> provider) {
        this.f41772a = provider;
    }

    /* renamed from: a */
    public UpdateSignalRepository m51028a() {
        return C13126s.m51026a(this.f41772a);
    }

    /* renamed from: a */
    public static UpdateSignalRepository m51026a(Provider<PollIntervalRepository> provider) {
        return C13126s.m51025a((PollIntervalRepository) provider.get());
    }

    /* renamed from: b */
    public static C13126s m51027b(Provider<PollIntervalRepository> provider) {
        return new C13126s(provider);
    }

    /* renamed from: a */
    public static UpdateSignalRepository m51025a(PollIntervalRepository pollIntervalRepository) {
        return (UpdateSignalRepository) C15521i.a(C8811p.m37506a(pollIntervalRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
