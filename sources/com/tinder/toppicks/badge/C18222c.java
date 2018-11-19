package com.tinder.toppicks.badge;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.subjects.C18432c;

/* renamed from: com.tinder.toppicks.badge.c */
public final class C18222c implements Factory<C18432c<Boolean>> {
    /* renamed from: a */
    private final TopPicksTriggerModule f56484a;

    public /* synthetic */ Object get() {
        return m66050a();
    }

    public C18222c(TopPicksTriggerModule topPicksTriggerModule) {
        this.f56484a = topPicksTriggerModule;
    }

    /* renamed from: a */
    public C18432c<Boolean> m66050a() {
        return C18222c.m66047a(this.f56484a);
    }

    /* renamed from: a */
    public static C18432c<Boolean> m66047a(TopPicksTriggerModule topPicksTriggerModule) {
        return C18222c.m66049c(topPicksTriggerModule);
    }

    /* renamed from: b */
    public static C18222c m66048b(TopPicksTriggerModule topPicksTriggerModule) {
        return new C18222c(topPicksTriggerModule);
    }

    /* renamed from: c */
    public static C18432c<Boolean> m66049c(TopPicksTriggerModule topPicksTriggerModule) {
        return (C18432c) C15521i.m58001a(topPicksTriggerModule.m57298a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
