package com.tinder.data.updates;

import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.domain.updates.PollIntervalRepository;
import com.tinder.domain.updates.UpdateSignalRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.data.updates.t */
public final class C13127t implements Factory<UpdateSignalRepository> {
    /* renamed from: a */
    private final Provider<KeepAliveScarletApi> f41773a;
    /* renamed from: b */
    private final Provider<PollIntervalRepository> f41774b;
    /* renamed from: c */
    private final Provider<C8803e> f41775c;
    /* renamed from: d */
    private final Provider<C15679f> f41776d;

    public /* synthetic */ Object get() {
        return m51032a();
    }

    public C13127t(Provider<KeepAliveScarletApi> provider, Provider<PollIntervalRepository> provider2, Provider<C8803e> provider3, Provider<C15679f> provider4) {
        this.f41773a = provider;
        this.f41774b = provider2;
        this.f41775c = provider3;
        this.f41776d = provider4;
    }

    /* renamed from: a */
    public UpdateSignalRepository m51032a() {
        return C13127t.m51030a(this.f41773a, this.f41774b, this.f41775c, this.f41776d);
    }

    /* renamed from: a */
    public static UpdateSignalRepository m51030a(Provider<KeepAliveScarletApi> provider, Provider<PollIntervalRepository> provider2, Provider<C8803e> provider3, Provider<C15679f> provider4) {
        return C13127t.m51029a((KeepAliveScarletApi) provider.get(), (PollIntervalRepository) provider2.get(), (C8803e) provider3.get(), (C15679f) provider4.get());
    }

    /* renamed from: b */
    public static C13127t m51031b(Provider<KeepAliveScarletApi> provider, Provider<PollIntervalRepository> provider2, Provider<C8803e> provider3, Provider<C15679f> provider4) {
        return new C13127t(provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static UpdateSignalRepository m51029a(KeepAliveScarletApi keepAliveScarletApi, PollIntervalRepository pollIntervalRepository, C8803e c8803e, C15679f c15679f) {
        return (UpdateSignalRepository) C15521i.a(C8811p.m37505a(keepAliveScarletApi, pollIntervalRepository, c8803e, c15679f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
