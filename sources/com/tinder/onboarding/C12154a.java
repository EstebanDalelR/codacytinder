package com.tinder.onboarding;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.onboarding.model.OnboardingExperiments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/onboarding/OnboardingAbTestExperiments;", "Lcom/tinder/onboarding/model/OnboardingExperiments;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/core/experiment/AbTestUtility;)V", "ageLimit", "", "isEmailStepRequired", "", "isMoreGenderEnabled", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.onboarding.a */
public final class C12154a implements OnboardingExperiments {
    /* renamed from: a */
    private final AbTestUtility f39401a;

    public int ageLimit() {
        return 18;
    }

    @Inject
    public C12154a(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        this.f39401a = abTestUtility;
    }

    public boolean isMoreGenderEnabled() {
        return this.f39401a.isMoreGenderEnabled();
    }

    public boolean isEmailStepRequired() {
        return this.f39401a.isOnboardingEmailRequired();
    }
}
