package com.tinder.domain.onboarding;

import com.tinder.domain.onboarding.Onboarding.Tutorial.Asset;
import com.tinder.domain.onboarding.Onboarding.Tutorial.Name;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorial.EmptyTutorial;
import com.tinder.domain.profile.model.Tutorial.TopPicksIntro;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/onboarding/OnboardingTutorialAdapter;", "", "()V", "toDomainTutorial", "Lcom/tinder/domain/profile/model/Tutorial;", "onboardingTutorial", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class OnboardingTutorialAdapter {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Name.values().length];

        static {
            $EnumSwitchMapping$0[Name.TOP_PICKS_INTRO.ordinal()] = 1;
        }
    }

    @NotNull
    public final Tutorial toDomainTutorial(@NotNull Onboarding.Tutorial tutorial) {
        C2668g.b(tutorial, "onboardingTutorial");
        if (WhenMappings.$EnumSwitchMapping$0[tutorial.getName().ordinal()] != 1) {
            return (Tutorial) EmptyTutorial.INSTANCE;
        }
        Asset asset = (Asset) C19301m.g(tutorial.getAssets());
        if (asset != null) {
            tutorial = asset.getUrl();
            if (tutorial != null) {
                return new TopPicksIntro(tutorial);
            }
        }
        tutorial = "";
        return new TopPicksIntro(tutorial);
    }
}
