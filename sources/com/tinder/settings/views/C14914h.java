package com.tinder.settings.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.settings.model.ExitSurveyReason;
import com.tinder.settings.views.SurveyReasonGridView.C16692a.C16691a;

/* renamed from: com.tinder.settings.views.h */
final /* synthetic */ class C14914h implements OnClickListener {
    /* renamed from: a */
    private final C16691a f46616a;
    /* renamed from: b */
    private final ExitSurveyReason f46617b;

    C14914h(C16691a c16691a, ExitSurveyReason exitSurveyReason) {
        this.f46616a = c16691a;
        this.f46617b = exitSurveyReason;
    }

    public void onClick(View view) {
        this.f46616a.m62177a(this.f46617b, view);
    }
}
