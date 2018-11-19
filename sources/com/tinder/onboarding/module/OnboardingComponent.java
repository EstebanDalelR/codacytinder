package com.tinder.onboarding.module;

import com.tinder.onboarding.activities.OnboardingActivity;
import com.tinder.onboarding.component.CountdownComponent.Parent;
import com.tinder.onboarding.view.BirthdayStepView;
import com.tinder.onboarding.view.EmailStepView;
import com.tinder.onboarding.view.GenderStepView;
import com.tinder.onboarding.view.NameStepView;
import com.tinder.onboarding.view.OnboardingDateWidgetView;
import com.tinder.onboarding.view.PasswordStepView;
import com.tinder.onboarding.view.PhotosStepView;
import com.tinder.scope.ActivityScope;
import dagger.Subcomponent;

@Subcomponent(modules = {C2655a.class})
@ActivityScope
public interface OnboardingComponent extends Parent {
    void inject(OnboardingActivity onboardingActivity);

    void inject(BirthdayStepView birthdayStepView);

    void inject(EmailStepView emailStepView);

    void inject(GenderStepView genderStepView);

    void inject(NameStepView nameStepView);

    void inject(OnboardingDateWidgetView onboardingDateWidgetView);

    void inject(PasswordStepView passwordStepView);

    void inject(PhotosStepView photosStepView);
}
