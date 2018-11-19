package com.tinder.settings.model;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import com.tinder.R;

public enum ExitSurveyReason {
    MET_SOMEONE(R.string.exit_survey_met_someone, R.drawable.exit_survey_heart, 1),
    FRESH_START(R.string.exit_survey_fresh_start, R.drawable.exit_survey_fresh_start, 2),
    NEED_BREAK(R.string.exit_survey_need_break, R.drawable.exit_survey_need_break, 3),
    DONT_LIKE(R.string.exit_survey_dont_like, R.drawable.exit_survey_dislike_tinder, 4),
    SOMETHING_BROKEN(R.string.exit_survey_something_broken, R.drawable.exit_survey_broken, 5),
    JUST_DELETE(R.string.exit_survey_just_delete, R.drawable.exit_survey_just_delete, 6),
    OTHER(R.string.other, R.drawable.exit_survey_other, 7);
    
    private final int analyticsId;
    @DrawableRes
    private final int drawableRes;
    @StringRes
    private int stringRes;

    private ExitSurveyReason(int i, int i2, @StringRes int i3) {
        this.stringRes = i;
        this.drawableRes = i2;
        this.analyticsId = i3;
    }

    @StringRes
    public int getNameResourceId() {
        return this.stringRes;
    }

    public void setNameResourceId(@StringRes int i) {
        this.stringRes = i;
    }

    @DrawableRes
    public int getDrawableResourceId() {
        return this.drawableRes;
    }

    public int getAnalyticsId() {
        return this.analyticsId;
    }
}
