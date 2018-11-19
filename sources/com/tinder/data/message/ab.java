package com.tinder.data.message;

import com.tinder.domain.message.MessageDeliveryStatusUpdatesProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ab implements Factory<MessageDeliveryStatusUpdatesProvider> {
    /* renamed from: a */
    private final C8698t f41457a;
    /* renamed from: b */
    private final Provider<aj> f41458b;

    public /* synthetic */ Object get() {
        return m50634a();
    }

    /* renamed from: a */
    public MessageDeliveryStatusUpdatesProvider m50634a() {
        return m50633a(this.f41457a, this.f41458b);
    }

    /* renamed from: a */
    public static MessageDeliveryStatusUpdatesProvider m50633a(C8698t c8698t, Provider<aj> provider) {
        return m50632a(c8698t, (aj) provider.get());
    }

    /* renamed from: a */
    public static MessageDeliveryStatusUpdatesProvider m50632a(C8698t c8698t, aj ajVar) {
        return (MessageDeliveryStatusUpdatesProvider) C15521i.a(c8698t.m37158a(ajVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
