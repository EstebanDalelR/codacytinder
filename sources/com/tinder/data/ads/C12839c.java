package com.tinder.data.ads;

import com.tinder.data.match.an;
import com.tinder.domain.match.repository.TrackingUrlRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.ads.c */
public final class C12839c implements Factory<TrackingUrlRepository> {
    /* renamed from: a */
    private final C8618a f41273a;
    /* renamed from: b */
    private final Provider<TrackingUrlNotifier> f41274b;
    /* renamed from: c */
    private final Provider<an> f41275c;

    public /* synthetic */ Object get() {
        return m50431a();
    }

    public C12839c(C8618a c8618a, Provider<TrackingUrlNotifier> provider, Provider<an> provider2) {
        this.f41273a = c8618a;
        this.f41274b = provider;
        this.f41275c = provider2;
    }

    /* renamed from: a */
    public TrackingUrlRepository m50431a() {
        return C12839c.m50429a(this.f41273a, this.f41274b, this.f41275c);
    }

    /* renamed from: a */
    public static TrackingUrlRepository m50429a(C8618a c8618a, Provider<TrackingUrlNotifier> provider, Provider<an> provider2) {
        return C12839c.m50428a(c8618a, (TrackingUrlNotifier) provider.get(), (an) provider2.get());
    }

    /* renamed from: b */
    public static C12839c m50430b(C8618a c8618a, Provider<TrackingUrlNotifier> provider, Provider<an> provider2) {
        return new C12839c(c8618a, provider, provider2);
    }

    /* renamed from: a */
    public static TrackingUrlRepository m50428a(C8618a c8618a, TrackingUrlNotifier trackingUrlNotifier, an anVar) {
        return (TrackingUrlRepository) C15521i.a(c8618a.m36765a(trackingUrlNotifier, anVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
