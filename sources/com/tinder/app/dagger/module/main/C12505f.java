package com.tinder.app.dagger.module.main;

import com.tinder.discovery.analytics.DiscoverySegmentNotificationLedger;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.main.f */
public final class C12505f implements Factory<DiscoverySegmentNotificationLedger> {
    /* renamed from: a */
    private final C8251a f40319a;

    public /* synthetic */ Object get() {
        return m49216a();
    }

    public C12505f(C8251a c8251a) {
        this.f40319a = c8251a;
    }

    /* renamed from: a */
    public DiscoverySegmentNotificationLedger m49216a() {
        return C12505f.m49213a(this.f40319a);
    }

    /* renamed from: a */
    public static DiscoverySegmentNotificationLedger m49213a(C8251a c8251a) {
        return C12505f.m49215c(c8251a);
    }

    /* renamed from: b */
    public static C12505f m49214b(C8251a c8251a) {
        return new C12505f(c8251a);
    }

    /* renamed from: c */
    public static DiscoverySegmentNotificationLedger m49215c(C8251a c8251a) {
        return (DiscoverySegmentNotificationLedger) C15521i.a(c8251a.m35216e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
