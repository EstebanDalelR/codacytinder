package com.tinder.settings.module;

import com.tinder.scope.ActivityScope;
import com.tinder.settings.activity.ExitSurveyActivity;
import com.tinder.settings.activity.ExitSurveyFeedbackActivity;
import dagger.Subcomponent;

@Subcomponent(modules = {C2656a.class})
@ActivityScope
public interface ExitSurveyComponent {
    void inject(ExitSurveyActivity exitSurveyActivity);

    void inject(ExitSurveyFeedbackActivity exitSurveyFeedbackActivity);
}
