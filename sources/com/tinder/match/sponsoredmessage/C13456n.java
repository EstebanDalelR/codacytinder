package com.tinder.match.sponsoredmessage;

import com.tinder.addy.AdAggregator;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.sponsoredmessage.C15034e;
import com.tinder.sponsoredmessage.SponsoredMessageAdMonitor;
import com.tinder.sponsoredmessage.SponsoredMessageViewedCache;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.n */
public final class C13456n implements Factory<SponsoredMessageAdMonitor> {
    /* renamed from: a */
    private final C9882h f42660a;
    /* renamed from: b */
    private final Provider<AdAggregator> f42661b;
    /* renamed from: c */
    private final Provider<LoadProfileOptionData> f42662c;
    /* renamed from: d */
    private final Provider<SponsoredMessageViewedCache> f42663d;
    /* renamed from: e */
    private final Provider<Set<Listener>> f42664e;
    /* renamed from: f */
    private final Provider<C15034e> f42665f;

    public /* synthetic */ Object get() {
        return m51975a();
    }

    public C13456n(C9882h c9882h, Provider<AdAggregator> provider, Provider<LoadProfileOptionData> provider2, Provider<SponsoredMessageViewedCache> provider3, Provider<Set<Listener>> provider4, Provider<C15034e> provider5) {
        this.f42660a = c9882h;
        this.f42661b = provider;
        this.f42662c = provider2;
        this.f42663d = provider3;
        this.f42664e = provider4;
        this.f42665f = provider5;
    }

    /* renamed from: a */
    public SponsoredMessageAdMonitor m51975a() {
        return C13456n.m51973a(this.f42660a, this.f42661b, this.f42662c, this.f42663d, this.f42664e, this.f42665f);
    }

    /* renamed from: a */
    public static SponsoredMessageAdMonitor m51973a(C9882h c9882h, Provider<AdAggregator> provider, Provider<LoadProfileOptionData> provider2, Provider<SponsoredMessageViewedCache> provider3, Provider<Set<Listener>> provider4, Provider<C15034e> provider5) {
        return C13456n.m51972a(c9882h, (AdAggregator) provider.get(), (LoadProfileOptionData) provider2.get(), (SponsoredMessageViewedCache) provider3.get(), (Set) provider4.get(), (C15034e) provider5.get());
    }

    /* renamed from: b */
    public static C13456n m51974b(C9882h c9882h, Provider<AdAggregator> provider, Provider<LoadProfileOptionData> provider2, Provider<SponsoredMessageViewedCache> provider3, Provider<Set<Listener>> provider4, Provider<C15034e> provider5) {
        return new C13456n(c9882h, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static SponsoredMessageAdMonitor m51972a(C9882h c9882h, AdAggregator adAggregator, LoadProfileOptionData loadProfileOptionData, SponsoredMessageViewedCache sponsoredMessageViewedCache, Set<Listener> set, C15034e c15034e) {
        return (SponsoredMessageAdMonitor) C15521i.a(c9882h.m40663a(adAggregator, loadProfileOptionData, sponsoredMessageViewedCache, set, c15034e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
