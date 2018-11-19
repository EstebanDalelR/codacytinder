package com.tinder.settings.activity;

import com.tinder.settings.adapters.ExitSurveyFeedbackReasonAdapter.OnExitSurveyReasonSelectedListener;
import com.tinder.settings.model.ExitSurveyDetailReason;

/* renamed from: com.tinder.settings.activity.e */
final /* synthetic */ class C16609e implements OnExitSurveyReasonSelectedListener {
    /* renamed from: a */
    private final ExitSurveyFeedbackActivity f51383a;

    C16609e(ExitSurveyFeedbackActivity exitSurveyFeedbackActivity) {
        this.f51383a = exitSurveyFeedbackActivity;
    }

    public void reasonSelected(ExitSurveyDetailReason exitSurveyDetailReason, boolean z) {
        this.f51383a.m68689a(exitSurveyDetailReason, z);
    }
}
