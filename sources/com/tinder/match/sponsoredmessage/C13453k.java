package com.tinder.match.sponsoredmessage;

import com.tinder.ads.DfpFieldsResolverImpl;
import com.tinder.ads.MessageAd.SponsoredMessageAdFactory;
import com.tinder.ads.NativeDfpSourceBuilderFactory;
import com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor.C12080a;
import com.tinder.sponsoredmessage.C15034e;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.k */
public final class C13453k implements Factory<C12080a> {
    /* renamed from: a */
    private final C9882h f42650a;
    /* renamed from: b */
    private final Provider<C15034e> f42651b;
    /* renamed from: c */
    private final Provider<SponsoredMessageAdFactory> f42652c;
    /* renamed from: d */
    private final Provider<DfpFieldsResolverImpl> f42653d;
    /* renamed from: e */
    private final Provider<NativeDfpSourceBuilderFactory> f42654e;

    public /* synthetic */ Object get() {
        return m51963a();
    }

    public C13453k(C9882h c9882h, Provider<C15034e> provider, Provider<SponsoredMessageAdFactory> provider2, Provider<DfpFieldsResolverImpl> provider3, Provider<NativeDfpSourceBuilderFactory> provider4) {
        this.f42650a = c9882h;
        this.f42651b = provider;
        this.f42652c = provider2;
        this.f42653d = provider3;
        this.f42654e = provider4;
    }

    /* renamed from: a */
    public C12080a m51963a() {
        return C13453k.m51961a(this.f42650a, this.f42651b, this.f42652c, this.f42653d, this.f42654e);
    }

    /* renamed from: a */
    public static C12080a m51961a(C9882h c9882h, Provider<C15034e> provider, Provider<SponsoredMessageAdFactory> provider2, Provider<DfpFieldsResolverImpl> provider3, Provider<NativeDfpSourceBuilderFactory> provider4) {
        return C13453k.m51960a(c9882h, (C15034e) provider.get(), (SponsoredMessageAdFactory) provider2.get(), (DfpFieldsResolverImpl) provider3.get(), (NativeDfpSourceBuilderFactory) provider4.get());
    }

    /* renamed from: b */
    public static C13453k m51962b(C9882h c9882h, Provider<C15034e> provider, Provider<SponsoredMessageAdFactory> provider2, Provider<DfpFieldsResolverImpl> provider3, Provider<NativeDfpSourceBuilderFactory> provider4) {
        return new C13453k(c9882h, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static C12080a m51960a(C9882h c9882h, C15034e c15034e, SponsoredMessageAdFactory sponsoredMessageAdFactory, DfpFieldsResolverImpl dfpFieldsResolverImpl, NativeDfpSourceBuilderFactory nativeDfpSourceBuilderFactory) {
        return (C12080a) C15521i.a(c9882h.m40662a(c15034e, sponsoredMessageAdFactory, dfpFieldsResolverImpl, nativeDfpSourceBuilderFactory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
