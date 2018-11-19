package com.tinder.settings.model;

import android.support.annotation.StringRes;
import com.tinder.R;

public enum ExitSurveyFeedbackReason implements ExitSurveyDetailReason {
    NOBODY_TO_SWIPE(R.string.exit_survey_feedback_nobody_to_swipe, 1),
    NO_MATCHES(R.string.exit_survey_feedback_no_matches, 2),
    MATCHES_GONE(R.string.exit_survey_feedback_matches_gone, 3),
    APP_CRASHES(R.string.exit_survey_feedback_app_crashes, 4),
    REPEAT_PEOPLE(R.string.exit_survey_feedback_repeat_people, 5);
    
    private final int analyticsId;
    @StringRes
    private final int stringRes;

    private ExitSurveyFeedbackReason(int i, int i2) {
        this.stringRes = i;
        this.analyticsId = i2;
    }

    @StringRes
    public int getNameResourceId() {
        return this.stringRes;
    }

    public int getAnalyticsId() {
        return this.analyticsId;
    }
}
