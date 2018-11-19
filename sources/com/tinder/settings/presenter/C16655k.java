package com.tinder.settings.presenter;

import com.tinder.R;
import com.tinder.settings.model.ExitSurveyReason;
import java8.util.function.Consumer;

/* renamed from: com.tinder.settings.presenter.k */
final /* synthetic */ class C16655k implements Consumer {
    /* renamed from: a */
    static final Consumer f51573a = new C16655k();

    private C16655k() {
    }

    public void accept(Object obj) {
        ((ExitSurveyReason) obj).setNameResourceId(R.string.exit_survey_something_broken_v2);
    }
}
