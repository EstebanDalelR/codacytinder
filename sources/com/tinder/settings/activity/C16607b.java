package com.tinder.settings.activity;

import com.tinder.settings.model.ExitSurveyReason;
import com.tinder.settings.views.SurveyReasonGridView.OnExitSurveyReasonSelectedListener;

/* renamed from: com.tinder.settings.activity.b */
final /* synthetic */ class C16607b implements OnExitSurveyReasonSelectedListener {
    /* renamed from: a */
    private final ExitSurveyActivity f51362a;

    C16607b(ExitSurveyActivity exitSurveyActivity) {
        this.f51362a = exitSurveyActivity;
    }

    public void reasonSelected(ExitSurveyReason exitSurveyReason) {
        this.f51362a.m68685a(exitSurveyReason);
    }
}
