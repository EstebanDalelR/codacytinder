package com.tinder.onboarding.presenter;

import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.target.CountdownTarget;
import com.tinder.presenters.PresenterBase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/onboarding/presenter/CountdownPresenter;", "Lcom/tinder/presenters/PresenterBase;", "Lcom/tinder/onboarding/target/CountdownTarget;", "onboardingAnalyticsInteractor", "Lcom/tinder/onboarding/interactor/OnboardingAnalyticsInteractor;", "(Lcom/tinder/onboarding/interactor/OnboardingAnalyticsInteractor;)V", "setup", "", "days", "", "Companion", "onboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.onboarding.presenter.x */
public final class C13525x extends PresenterBase<CountdownTarget> {
    @Deprecated
    /* renamed from: a */
    public static final C9983a f43200a = new C9983a();
    /* renamed from: b */
    private final OnboardingAnalyticsInteractor f43201b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/onboarding/presenter/CountdownPresenter$Companion;", "", "()V", "MAX_DAYS", "", "onboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.onboarding.presenter.x$a */
    private static final class C9983a {
        private C9983a() {
        }
    }

    @Inject
    public C13525x(@NotNull OnboardingAnalyticsInteractor onboardingAnalyticsInteractor) {
        C2668g.b(onboardingAnalyticsInteractor, "onboardingAnalyticsInteractor");
        this.f43201b = onboardingAnalyticsInteractor;
    }

    /* renamed from: a */
    public final void m52844a(int i) {
        int min = Math.min(i, 9999);
        if (min > 0) {
            CountdownTarget countdownTarget = (CountdownTarget) H();
            if (countdownTarget != null) {
                countdownTarget.setDays(min);
            }
        } else {
            CountdownTarget countdownTarget2 = (CountdownTarget) H();
            if (countdownTarget2 != null) {
                countdownTarget2.hideDays();
            }
        }
        this.f43201b.fireOnboardingAgeGateEvent(i);
    }
}
