package com.tinder.match.sponsoredmessage;

import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.sponsoredmessage.C15034e;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.match.sponsoredmessage.d */
public final class C13445d implements Factory<C12084b> {
    /* renamed from: a */
    private final Provider<C15034e> f42635a;
    /* renamed from: b */
    private final Provider<MatchRepository> f42636b;
    /* renamed from: c */
    private final Provider<Function0<DateTime>> f42637c;

    public /* synthetic */ Object get() {
        return m51944a();
    }

    public C13445d(Provider<C15034e> provider, Provider<MatchRepository> provider2, Provider<Function0<DateTime>> provider3) {
        this.f42635a = provider;
        this.f42636b = provider2;
        this.f42637c = provider3;
    }

    /* renamed from: a */
    public C12084b m51944a() {
        return C13445d.m51942a(this.f42635a, this.f42636b, this.f42637c);
    }

    /* renamed from: a */
    public static C12084b m51942a(Provider<C15034e> provider, Provider<MatchRepository> provider2, Provider<Function0<DateTime>> provider3) {
        return new C12084b((C15034e) provider.get(), (MatchRepository) provider2.get(), (Function0) provider3.get());
    }

    /* renamed from: b */
    public static C13445d m51943b(Provider<C15034e> provider, Provider<MatchRepository> provider2, Provider<Function0<DateTime>> provider3) {
        return new C13445d(provider, provider2, provider3);
    }
}
