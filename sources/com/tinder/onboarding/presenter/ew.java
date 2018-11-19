package com.tinder.onboarding.presenter;

import com.tinder.onboarding.view.DateWidgetDateValidator;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ew implements Factory<es> {
    /* renamed from: a */
    private final Provider<DateWidgetDateValidator> f43179a;

    public /* synthetic */ Object get() {
        return m52808a();
    }

    public ew(Provider<DateWidgetDateValidator> provider) {
        this.f43179a = provider;
    }

    /* renamed from: a */
    public es m52808a() {
        return m52806a(this.f43179a);
    }

    /* renamed from: a */
    public static es m52806a(Provider<DateWidgetDateValidator> provider) {
        return new es((DateWidgetDateValidator) provider.get());
    }

    /* renamed from: b */
    public static ew m52807b(Provider<DateWidgetDateValidator> provider) {
        return new ew(provider);
    }
}
