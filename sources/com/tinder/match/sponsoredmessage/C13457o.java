package com.tinder.match.sponsoredmessage;

import com.tinder.addy.AdAggregator;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.C6191a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.messageads.p296c.C13472c;
import com.tinder.sponsoredmessage.C15032a;
import com.tinder.sponsoredmessage.C15033d;
import com.tinder.sponsoredmessage.C15034e;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.o */
public final class C13457o implements Factory<C15033d> {
    /* renamed from: a */
    private final C9882h f42666a;
    /* renamed from: b */
    private final Provider<C15034e> f42667b;
    /* renamed from: c */
    private final Provider<AdAggregator> f42668c;
    /* renamed from: d */
    private final Provider<C13472c> f42669d;
    /* renamed from: e */
    private final Provider<C6191a> f42670e;
    /* renamed from: f */
    private final Provider<PublisherAdRequestFactory> f42671f;
    /* renamed from: g */
    private final Provider<C15032a> f42672g;

    public /* synthetic */ Object get() {
        return m51978a();
    }

    /* renamed from: a */
    public C15033d m51978a() {
        return C13457o.m51977a(this.f42666a, this.f42667b, this.f42668c, this.f42669d, this.f42670e, this.f42671f, this.f42672g);
    }

    /* renamed from: a */
    public static C15033d m51977a(C9882h c9882h, Provider<C15034e> provider, Provider<AdAggregator> provider2, Provider<C13472c> provider3, Provider<C6191a> provider4, Provider<PublisherAdRequestFactory> provider5, Provider<C15032a> provider6) {
        return C13457o.m51976a(c9882h, (C15034e) provider.get(), (AdAggregator) provider2.get(), (C13472c) provider3.get(), (Provider) provider4, (PublisherAdRequestFactory) provider5.get(), (C15032a) provider6.get());
    }

    /* renamed from: a */
    public static C15033d m51976a(C9882h c9882h, C15034e c15034e, AdAggregator adAggregator, C13472c c13472c, Provider<C6191a> provider, PublisherAdRequestFactory publisherAdRequestFactory, C15032a c15032a) {
        return (C15033d) C15521i.a(c9882h.m40666a(c15034e, adAggregator, c13472c, (Provider) provider, publisherAdRequestFactory, c15032a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
