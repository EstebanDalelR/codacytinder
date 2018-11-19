package com.tinder.onboarding.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tinder.R;
import com.tinder.onboarding.viewmodel.DateField;

public class OnboardingDateWidgetFieldYearView extends OnboardingDateWidgetFieldView {
    protected int getAllowedCharsCount() {
        return 4;
    }

    protected int getHintStringRes() {
        return R.string.onboarding_birthday_step_hint_short_year;
    }

    public OnboardingDateWidgetFieldYearView(Context context) {
        this(context, null);
    }

    public OnboardingDateWidgetFieldYearView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected DateField getDateField() {
        return DateField.YEAR;
    }
}
