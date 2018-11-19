package com.tinder.di;

import com.tinder.domain.recs.GlobalRecsConsumptionListenerRegistry;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.di.g */
public final class C13136g implements Factory<GlobalRecsConsumptionListenerRegistry> {
    /* renamed from: a */
    private final C8839d f41789a;

    public /* synthetic */ Object get() {
        return m51047a();
    }

    public C13136g(C8839d c8839d) {
        this.f41789a = c8839d;
    }

    /* renamed from: a */
    public GlobalRecsConsumptionListenerRegistry m51047a() {
        return (GlobalRecsConsumptionListenerRegistry) C15521i.a(this.f41789a.m37596a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C13136g m51046a(C8839d c8839d) {
        return new C13136g(c8839d);
    }
}
