package com.tinder.settings.model;

import android.support.annotation.StringRes;
import com.tinder.R;

public enum ExitSurveyFreshStartReason implements ExitSurveyDetailReason {
    NOBODY_TO_SWIPE(R.string.exit_survey_feedback_nobody_to_swipe, 1),
    NO_MATCHES(R.string.exit_survey_feedback_no_matches, 2),
    RESET_MATCHES(R.string.exit_survey_fresh_start_reset_matches, 3),
    INFO_SYNC(R.string.exit_survey_fresh_start_info_sync, 4);
    
    private final int analyticsId;
    @StringRes
    private final int stringRes;

    private ExitSurveyFreshStartReason(int i, int i2) {
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
