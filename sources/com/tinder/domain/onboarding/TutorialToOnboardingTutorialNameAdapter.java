package com.tinder.domain.onboarding;

import com.tinder.domain.onboarding.Onboarding.Tutorial.Name;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorial.TopPicksIntro;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/onboarding/TutorialToOnboardingTutorialNameAdapter;", "", "()V", "toOnboardingTutorialName", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Name;", "tutorial", "Lcom/tinder/domain/profile/model/Tutorial;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TutorialToOnboardingTutorialNameAdapter {
    @NotNull
    public final Name toOnboardingTutorialName(@NotNull Tutorial tutorial) {
        C2668g.b(tutorial, "tutorial");
        if ((tutorial instanceof TopPicksIntro) != null) {
            return Name.TOP_PICKS_INTRO;
        }
        return Name.NONE;
    }
}
