package com.tinder.module;

import com.tinder.analytics.fireworks.BatchScheduleStrategy;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class as implements Factory<BatchScheduleStrategy> {
    /* renamed from: a */
    private final aa f42784a;

    public /* synthetic */ Object get() {
        return m52122a();
    }

    public as(aa aaVar) {
        this.f42784a = aaVar;
    }

    /* renamed from: a */
    public BatchScheduleStrategy m52122a() {
        return m52119a(this.f42784a);
    }

    /* renamed from: a */
    public static BatchScheduleStrategy m52119a(aa aaVar) {
        return m52121c(aaVar);
    }

    /* renamed from: b */
    public static as m52120b(aa aaVar) {
        return new as(aaVar);
    }

    /* renamed from: c */
    public static BatchScheduleStrategy m52121c(aa aaVar) {
        return (BatchScheduleStrategy) C15521i.a(aaVar.m40777c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
