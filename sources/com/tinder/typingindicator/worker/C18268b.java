package com.tinder.typingindicator.worker;

import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.worker.b */
public final class C18268b implements Factory<C17192a> {
    /* renamed from: a */
    private final Provider<TypingIndicatorExperimentUtility> f56591a;
    /* renamed from: b */
    private final Provider<C17203e> f56592b;
    /* renamed from: c */
    private final Provider<C17193c> f56593c;

    public /* synthetic */ Object get() {
        return m66182a();
    }

    public C18268b(Provider<TypingIndicatorExperimentUtility> provider, Provider<C17203e> provider2, Provider<C17193c> provider3) {
        this.f56591a = provider;
        this.f56592b = provider2;
        this.f56593c = provider3;
    }

    /* renamed from: a */
    public C17192a m66182a() {
        return C18268b.m66180a(this.f56591a, this.f56592b, this.f56593c);
    }

    /* renamed from: a */
    public static C17192a m66180a(Provider<TypingIndicatorExperimentUtility> provider, Provider<C17203e> provider2, Provider<C17193c> provider3) {
        return new C17192a((TypingIndicatorExperimentUtility) provider.get(), C17281c.m63230b(provider2), C17281c.m63230b(provider3));
    }

    /* renamed from: b */
    public static C18268b m66181b(Provider<TypingIndicatorExperimentUtility> provider, Provider<C17203e> provider2, Provider<C17193c> provider3) {
        return new C18268b(provider, provider2, provider3);
    }
}
