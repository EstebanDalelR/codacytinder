package com.tinder.chat.view.action;

import com.tinder.chat.analytics.ad;
import com.tinder.domain.message.usecase.ResendFailedMessage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.action.z */
public final class C12746z implements Factory<C8467y> {
    /* renamed from: a */
    private final Provider<ResendFailedMessage> f41106a;
    /* renamed from: b */
    private final Provider<ad> f41107b;

    public /* synthetic */ Object get() {
        return m50159a();
    }

    public C12746z(Provider<ResendFailedMessage> provider, Provider<ad> provider2) {
        this.f41106a = provider;
        this.f41107b = provider2;
    }

    /* renamed from: a */
    public C8467y m50159a() {
        return C12746z.m50157a(this.f41106a, this.f41107b);
    }

    /* renamed from: a */
    public static C8467y m50157a(Provider<ResendFailedMessage> provider, Provider<ad> provider2) {
        return new C8467y((ResendFailedMessage) provider.get(), (ad) provider2.get());
    }

    /* renamed from: b */
    public static C12746z m50158b(Provider<ResendFailedMessage> provider, Provider<ad> provider2) {
        return new C12746z(provider, provider2);
    }
}
