package com.tinder.data.message;

import com.tinder.domain.message.MessageDeliveryStatusUpdatesNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class aa implements Factory<MessageDeliveryStatusUpdatesNotifier> {
    /* renamed from: a */
    private final C8698t f41455a;
    /* renamed from: b */
    private final Provider<aj> f41456b;

    public /* synthetic */ Object get() {
        return m50631a();
    }

    public aa(C8698t c8698t, Provider<aj> provider) {
        this.f41455a = c8698t;
        this.f41456b = provider;
    }

    /* renamed from: a */
    public MessageDeliveryStatusUpdatesNotifier m50631a() {
        return m50629a(this.f41455a, this.f41456b);
    }

    /* renamed from: a */
    public static MessageDeliveryStatusUpdatesNotifier m50629a(C8698t c8698t, Provider<aj> provider) {
        return m50628a(c8698t, (aj) provider.get());
    }

    /* renamed from: b */
    public static aa m50630b(C8698t c8698t, Provider<aj> provider) {
        return new aa(c8698t, provider);
    }

    /* renamed from: a */
    public static MessageDeliveryStatusUpdatesNotifier m50628a(C8698t c8698t, aj ajVar) {
        return (MessageDeliveryStatusUpdatesNotifier) C15521i.a(c8698t.m37161b(ajVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
