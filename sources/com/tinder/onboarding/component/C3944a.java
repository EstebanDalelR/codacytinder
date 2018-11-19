package com.tinder.onboarding.component;

import com.tinder.onboarding.activity.C12161a;
import com.tinder.onboarding.activity.CountdownActivity;
import com.tinder.onboarding.component.CountdownComponent.Parent;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.presenter.C13525x;
import dagger.internal.C15521i;

/* renamed from: com.tinder.onboarding.component.a */
public final class C3944a implements CountdownComponent {
    /* renamed from: a */
    private Parent f12426a;

    /* renamed from: com.tinder.onboarding.component.a$a */
    public static final class C2654a {
        /* renamed from: a */
        private Parent f8357a;

        private C2654a() {
        }

        /* renamed from: a */
        public CountdownComponent m10152a() {
            if (this.f8357a != null) {
                return new C3944a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C2654a m10153a(Parent parent) {
            this.f8357a = (Parent) C15521i.a(parent);
            return this;
        }
    }

    private C3944a(C2654a c2654a) {
        m15046a(c2654a);
    }

    /* renamed from: a */
    public static C2654a m15045a() {
        return new C2654a();
    }

    /* renamed from: b */
    private C13525x m15047b() {
        return new C13525x((OnboardingAnalyticsInteractor) C15521i.a(this.f12426a.provideOnboardingAnalyticsInteractor(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: a */
    private void m15046a(C2654a c2654a) {
        this.f12426a = c2654a.f8357a;
    }

    public void inject(CountdownActivity countdownActivity) {
        m15044a(countdownActivity);
    }

    /* renamed from: a */
    private CountdownActivity m15044a(CountdownActivity countdownActivity) {
        C12161a.a(countdownActivity, m15047b());
        return countdownActivity;
    }
}
