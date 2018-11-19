package com.tinder.data.recs;

import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.recs.c */
public final class C13097c implements Factory<CardStackRecsDataRepository> {
    /* renamed from: a */
    private final Provider<C10992i> f41712a;
    /* renamed from: b */
    private final Provider<RecsApiClient> f41713b;
    /* renamed from: c */
    private final Provider<C8776g> f41714c;
    /* renamed from: d */
    private final Provider<ConnectivityProvider> f41715d;
    /* renamed from: e */
    private final Provider<Rec$Source> f41716e;

    public /* synthetic */ Object get() {
        return m50952a();
    }

    public C13097c(Provider<C10992i> provider, Provider<RecsApiClient> provider2, Provider<C8776g> provider3, Provider<ConnectivityProvider> provider4, Provider<Rec$Source> provider5) {
        this.f41712a = provider;
        this.f41713b = provider2;
        this.f41714c = provider3;
        this.f41715d = provider4;
        this.f41716e = provider5;
    }

    /* renamed from: a */
    public CardStackRecsDataRepository m50952a() {
        return new CardStackRecsDataRepository((C10992i) this.f41712a.get(), (RecsApiClient) this.f41713b.get(), (C8776g) this.f41714c.get(), (ConnectivityProvider) this.f41715d.get(), (Rec$Source) this.f41716e.get());
    }

    /* renamed from: a */
    public static C13097c m50951a(Provider<C10992i> provider, Provider<RecsApiClient> provider2, Provider<C8776g> provider3, Provider<ConnectivityProvider> provider4, Provider<Rec$Source> provider5) {
        return new C13097c(provider, provider2, provider3, provider4, provider5);
    }
}
