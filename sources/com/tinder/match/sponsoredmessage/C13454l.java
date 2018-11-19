package com.tinder.match.sponsoredmessage;

import com.tinder.addy.AdAggregator;
import com.tinder.addy.Addy;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.l */
public final class C13454l implements Factory<AdAggregator> {
    /* renamed from: a */
    private final C9882h f42655a;
    /* renamed from: b */
    private final Provider<Addy> f42656b;

    public /* synthetic */ Object get() {
        return m51967a();
    }

    public C13454l(C9882h c9882h, Provider<Addy> provider) {
        this.f42655a = c9882h;
        this.f42656b = provider;
    }

    /* renamed from: a */
    public AdAggregator m51967a() {
        return C13454l.m51965a(this.f42655a, this.f42656b);
    }

    /* renamed from: a */
    public static AdAggregator m51965a(C9882h c9882h, Provider<Addy> provider) {
        return C13454l.m51964a(c9882h, (Addy) provider.get());
    }

    /* renamed from: b */
    public static C13454l m51966b(C9882h c9882h, Provider<Addy> provider) {
        return new C13454l(c9882h, provider);
    }

    /* renamed from: a */
    public static AdAggregator m51964a(C9882h c9882h, Addy addy) {
        return (AdAggregator) C15521i.a(c9882h.m40659a(addy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
