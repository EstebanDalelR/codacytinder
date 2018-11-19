package com.tinder.onboarding.view;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

/* renamed from: com.tinder.onboarding.view.k */
final /* synthetic */ class C10003k implements OnFocusChangeListener {
    /* renamed from: a */
    private final OnboardingDateWidgetFieldView f32862a;
    /* renamed from: b */
    private final EditText f32863b;

    C10003k(OnboardingDateWidgetFieldView onboardingDateWidgetFieldView, EditText editText) {
        this.f32862a = onboardingDateWidgetFieldView;
        this.f32863b = editText;
    }

    public void onFocusChange(View view, boolean z) {
        this.f32862a.m41000a(this.f32863b, view, z);
    }
}
