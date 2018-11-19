package com.tinder.onboarding.presenter;

import javax.inject.Inject;
import org.joda.time.LocalDate;
import org.joda.time.format.C19315a;
import org.joda.time.format.C19316b;

/* renamed from: com.tinder.onboarding.presenter.a */
class C9974a {
    /* renamed from: a */
    private final C19316b f32810a = C19315a.a("'year:'yyyy 'month:'MM");

    @Inject
    C9974a() {
    }

    /* renamed from: a */
    public String m40947a(LocalDate localDate) {
        return m40946b(localDate).a(this.f32810a);
    }

    /* renamed from: b */
    private LocalDate m40946b(LocalDate localDate) {
        return localDate.d((((localDate.e() - 1) / 3) * 3) + 1);
    }
}
