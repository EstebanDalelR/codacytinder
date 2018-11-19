package com.tinder.di;

import com.tinder.domain.recs.GlobalRecsConsumptionEventPublisher;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.di.f */
public final class C13135f implements Factory<GlobalRecsConsumptionEventPublisher> {
    /* renamed from: a */
    private final C8839d f41788a;

    public /* synthetic */ Object get() {
        return m51045a();
    }

    public C13135f(C8839d c8839d) {
        this.f41788a = c8839d;
    }

    /* renamed from: a */
    public GlobalRecsConsumptionEventPublisher m51045a() {
        return (GlobalRecsConsumptionEventPublisher) C15521i.a(this.f41788a.m37598b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C13135f m51044a(C8839d c8839d) {
        return new C13135f(c8839d);
    }
}
