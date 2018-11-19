package com.tinder.settings.adapters;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tinder.settings.adapters.ExitSurveyFeedbackReasonAdapter.C16613a;
import com.tinder.settings.model.ExitSurveyDetailReason;

/* renamed from: com.tinder.settings.adapters.b */
final /* synthetic */ class C14859b implements OnCheckedChangeListener {
    /* renamed from: a */
    private final C16613a f46494a;
    /* renamed from: b */
    private final ExitSurveyDetailReason f46495b;

    C14859b(C16613a c16613a, ExitSurveyDetailReason exitSurveyDetailReason) {
        this.f46494a = c16613a;
        this.f46495b = exitSurveyDetailReason;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f46494a.m62043a(this.f46495b, compoundButton, z);
    }
}
