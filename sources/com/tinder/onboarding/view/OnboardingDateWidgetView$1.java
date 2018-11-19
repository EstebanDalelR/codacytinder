package com.tinder.onboarding.view;

import android.widget.EditText;
import com.tinder.onboarding.view.OnboardingDateWidgetFieldView.KeyboardActionListener;
import java8.util.Optional;

class OnboardingDateWidgetView$1 implements KeyboardActionListener {
    /* renamed from: a */
    final /* synthetic */ OnboardingDateWidgetView f39545a;

    OnboardingDateWidgetView$1(OnboardingDateWidgetView onboardingDateWidgetView) {
        this.f39545a = onboardingDateWidgetView;
    }

    public void onKeyboardAction(int i, OnboardingDateWidgetFieldView onboardingDateWidgetFieldView, EditText editText, Optional<Integer> optional) {
        switch (i) {
            case 1:
                if (optional.c() != 0) {
                    this.f39545a.f12427a.m52801a(OnboardingDateWidgetView.a(this.f39545a).indexOf(onboardingDateWidgetFieldView), onboardingDateWidgetFieldView.m40997a(editText), onboardingDateWidgetFieldView.getDateField(), OnboardingDateWidgetView.b(this.f39545a).getFieldValue(), OnboardingDateWidgetView.c(this.f39545a).getFieldValue(), OnboardingDateWidgetView.d(this.f39545a).getFieldValue(), OnboardingDateWidgetView.e(this.f39545a));
                    return;
                }
                return;
            case 2:
                this.f39545a.f12427a.m52804a(editText.getText().toString(), OnboardingDateWidgetView.a(this.f39545a).indexOf(onboardingDateWidgetFieldView), onboardingDateWidgetFieldView.m40997a(editText));
                return;
            default:
                return;
        }
    }
}
