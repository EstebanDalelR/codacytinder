package com.tinder.settings.model;

import android.support.annotation.StringRes;
import com.tinder.R;

public enum ExitSurveyDislikeReason implements ExitSurveyDetailReason {
    NOBODY_TO_SWIPE(R.string.exit_survey_feedback_nobody_to_swipe, 1),
    NO_MATCHES(R.string.exit_survey_feedback_no_matches, 2),
    PREFER_OTHER_APPS(R.string.exit_survey_dislike_prefer_other_apps, 3),
    NOT_MET_ANYBODY(R.string.exit_survey_dislike_not_met_anybody, 4),
    APP_CRASHES(R.string.exit_survey_feedback_app_crashes, 5),
    POOR_EXPERIENCE(R.string.exit_survey_dislike_bad_experience, 6);
    
    private final int analyticsId;
    @StringRes
    private final int stringRes;

    private ExitSurveyDislikeReason(int i, int i2) {
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
