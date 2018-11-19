package com.tinder.onboarding;

import com.tinder.auth.interactor.C10333h;
import com.tinder.onboarding.repository.OnboardingErrorHandler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/onboarding/OnboardingAuthErrorHandler;", "Lcom/tinder/onboarding/repository/OnboardingErrorHandler;", "authAnalyticsInteractor", "Lcom/tinder/auth/interactor/AuthAnalyticsInteractor;", "(Lcom/tinder/auth/interactor/AuthAnalyticsInteractor;)V", "handleApiError", "", "errorCode", "", "handleApiParseError", "json", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.onboarding.c */
public final class C12162c implements OnboardingErrorHandler {
    /* renamed from: a */
    private final C10333h f39423a;

    @Inject
    public C12162c(@NotNull C10333h c10333h) {
        C2668g.b(c10333h, "authAnalyticsInteractor");
        this.f39423a = c10333h;
    }

    public void handleApiError(int i) {
        this.f39423a.fireOnboardingErrorEvent(i);
    }

    public void handleApiParseError(@Nullable String str) {
        this.f39423a.fireOnboardingJsonUnparsableError(str);
    }
}
