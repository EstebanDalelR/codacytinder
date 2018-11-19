package com.tinder.chat.injection.p188a;

import com.tinder.chat.analytics.am;
import com.tinder.typingindicator.worker.TypingIndicatorVisibilityAnalyticsWorker;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.u */
public final class C12729u implements Factory<TypingIndicatorVisibilityAnalyticsWorker> {
    /* renamed from: a */
    private final C8440a f41046a;
    /* renamed from: b */
    private final Provider<am> f41047b;

    public /* synthetic */ Object get() {
        return m50096a();
    }

    public C12729u(C8440a c8440a, Provider<am> provider) {
        this.f41046a = c8440a;
        this.f41047b = provider;
    }

    /* renamed from: a */
    public TypingIndicatorVisibilityAnalyticsWorker m50096a() {
        return C12729u.m50094a(this.f41046a, this.f41047b);
    }

    /* renamed from: a */
    public static TypingIndicatorVisibilityAnalyticsWorker m50094a(C8440a c8440a, Provider<am> provider) {
        return C12729u.m50093a(c8440a, (am) provider.get());
    }

    /* renamed from: b */
    public static C12729u m50095b(C8440a c8440a, Provider<am> provider) {
        return new C12729u(c8440a, provider);
    }

    /* renamed from: a */
    public static TypingIndicatorVisibilityAnalyticsWorker m50093a(C8440a c8440a, am amVar) {
        return (TypingIndicatorVisibilityAnalyticsWorker) C15521i.a(c8440a.m36022a(amVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
