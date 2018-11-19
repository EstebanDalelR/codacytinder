package com.tinder.settings.data;

import com.tinder.toppicks.notifications.C3947n;
import com.tinder.toppicks.notifications.ScheduleTopPicksNotification;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.data.b */
public final class C18061b implements Factory<C16619a> {
    /* renamed from: a */
    private final Provider<ScheduleTopPicksNotification> f56093a;
    /* renamed from: b */
    private final Provider<C3947n> f56094b;

    public /* synthetic */ Object get() {
        return m65556a();
    }

    public C18061b(Provider<ScheduleTopPicksNotification> provider, Provider<C3947n> provider2) {
        this.f56093a = provider;
        this.f56094b = provider2;
    }

    /* renamed from: a */
    public C16619a m65556a() {
        return C18061b.m65554a(this.f56093a, this.f56094b);
    }

    /* renamed from: a */
    public static C16619a m65554a(Provider<ScheduleTopPicksNotification> provider, Provider<C3947n> provider2) {
        return new C16619a((ScheduleTopPicksNotification) provider.get(), (C3947n) provider2.get());
    }

    /* renamed from: b */
    public static C18061b m65555b(Provider<ScheduleTopPicksNotification> provider, Provider<C3947n> provider2) {
        return new C18061b(provider, provider2);
    }
}
