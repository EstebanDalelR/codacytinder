package com.tinder.data.recs;

import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.recs.b */
public final class C13096b implements Factory<C13095a> {
    /* renamed from: a */
    private final Provider<C10992i> f41707a;
    /* renamed from: b */
    private final Provider<RecsApiClient> f41708b;
    /* renamed from: c */
    private final Provider<C8776g> f41709c;
    /* renamed from: d */
    private final Provider<ConnectivityProvider> f41710d;
    /* renamed from: e */
    private final Provider<Rec$Source> f41711e;

    public /* synthetic */ Object get() {
        return m50950a();
    }

    public C13096b(Provider<C10992i> provider, Provider<RecsApiClient> provider2, Provider<C8776g> provider3, Provider<ConnectivityProvider> provider4, Provider<Rec$Source> provider5) {
        this.f41707a = provider;
        this.f41708b = provider2;
        this.f41709c = provider3;
        this.f41710d = provider4;
        this.f41711e = provider5;
    }

    /* renamed from: a */
    public C13095a m50950a() {
        return new C13095a((C10992i) this.f41707a.get(), (RecsApiClient) this.f41708b.get(), (C8776g) this.f41709c.get(), (ConnectivityProvider) this.f41710d.get(), (Rec$Source) this.f41711e.get());
    }

    /* renamed from: a */
    public static C13096b m50949a(Provider<C10992i> provider, Provider<RecsApiClient> provider2, Provider<C8776g> provider3, Provider<ConnectivityProvider> provider4, Provider<Rec$Source> provider5) {
        return new C13096b(provider, provider2, provider3, provider4, provider5);
    }
}
