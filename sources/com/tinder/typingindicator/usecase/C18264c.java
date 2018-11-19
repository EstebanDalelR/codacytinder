package com.tinder.typingindicator.usecase;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.logger.Logger;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.usecase.c */
public final class C18264c implements Factory<C17172a> {
    /* renamed from: a */
    private final Provider<TypingIndicatorEventFactory> f56582a;
    /* renamed from: b */
    private final Provider<C2630h> f56583b;
    /* renamed from: c */
    private final Provider<C15679f> f56584c;
    /* renamed from: d */
    private final Provider<Logger> f56585d;

    public /* synthetic */ Object get() {
        return m66170a();
    }

    public C18264c(Provider<TypingIndicatorEventFactory> provider, Provider<C2630h> provider2, Provider<C15679f> provider3, Provider<Logger> provider4) {
        this.f56582a = provider;
        this.f56583b = provider2;
        this.f56584c = provider3;
        this.f56585d = provider4;
    }

    /* renamed from: a */
    public C17172a m66170a() {
        return C18264c.m66168a(this.f56582a, this.f56583b, this.f56584c, this.f56585d);
    }

    /* renamed from: a */
    public static C17172a m66168a(Provider<TypingIndicatorEventFactory> provider, Provider<C2630h> provider2, Provider<C15679f> provider3, Provider<Logger> provider4) {
        return new C17172a((TypingIndicatorEventFactory) provider.get(), (C2630h) provider2.get(), (C15679f) provider3.get(), (Logger) provider4.get());
    }

    /* renamed from: b */
    public static C18264c m66169b(Provider<TypingIndicatorEventFactory> provider, Provider<C2630h> provider2, Provider<C15679f> provider3, Provider<Logger> provider4) {
        return new C18264c(provider, provider2, provider3, provider4);
    }
}
