package com.tinder.settings.model;

import android.support.annotation.StringRes;

public interface ExitSurveyDetailReason {
    int getAnalyticsId();

    @StringRes
    int getNameResourceId();
}
