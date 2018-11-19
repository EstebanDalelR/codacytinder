package com.tinder.onboarding.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tinder.R;
import com.tinder.onboarding.viewmodel.DateField;

public class OnboardingDateWidgetFieldDayView extends OnboardingDateWidgetFieldView {
    protected int getAllowedCharsCount() {
        return 2;
    }

    protected int getHintStringRes() {
        return R.string.onboarding_birthday_step_hint_short_day;
    }

    public OnboardingDateWidgetFieldDayView(Context context) {
        this(context, null);
    }

    public OnboardingDateWidgetFieldDayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected DateField getDateField() {
        return DateField.DAY_OF_MONTH;
    }
}
