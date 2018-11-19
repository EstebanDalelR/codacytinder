package com.tinder.data.message;

import com.tinder.domain.message.MessageDeliveryStatusUpdatesNotifier;
import com.tinder.domain.message.MessageRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ac implements Factory<MessageRepository> {
    /* renamed from: a */
    private final C8698t f41459a;
    /* renamed from: b */
    private final Provider<ag> f41460b;
    /* renamed from: c */
    private final Provider<C8697q> f41461c;
    /* renamed from: d */
    private final Provider<MessageDeliveryStatusUpdatesNotifier> f41462d;

    public /* synthetic */ Object get() {
        return m50638a();
    }

    public ac(C8698t c8698t, Provider<ag> provider, Provider<C8697q> provider2, Provider<MessageDeliveryStatusUpdatesNotifier> provider3) {
        this.f41459a = c8698t;
        this.f41460b = provider;
        this.f41461c = provider2;
        this.f41462d = provider3;
    }

    /* renamed from: a */
    public MessageRepository m50638a() {
        return m50636a(this.f41459a, this.f41460b, this.f41461c, this.f41462d);
    }

    /* renamed from: a */
    public static MessageRepository m50636a(C8698t c8698t, Provider<ag> provider, Provider<C8697q> provider2, Provider<MessageDeliveryStatusUpdatesNotifier> provider3) {
        return m50635a(c8698t, (ag) provider.get(), (C8697q) provider2.get(), (MessageDeliveryStatusUpdatesNotifier) provider3.get());
    }

    /* renamed from: b */
    public static ac m50637b(C8698t c8698t, Provider<ag> provider, Provider<C8697q> provider2, Provider<MessageDeliveryStatusUpdatesNotifier> provider3) {
        return new ac(c8698t, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static MessageRepository m50635a(C8698t c8698t, ag agVar, C8697q c8697q, MessageDeliveryStatusUpdatesNotifier messageDeliveryStatusUpdatesNotifier) {
        return (MessageRepository) C15521i.a(c8698t.m37159a(agVar, c8697q, messageDeliveryStatusUpdatesNotifier), "Cannot return null from a non-@Nullable @Provides method");
    }
}
