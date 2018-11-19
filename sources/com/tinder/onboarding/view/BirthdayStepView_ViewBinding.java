package com.tinder.onboarding.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomTextView;

public class BirthdayStepView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private BirthdayStepView f39495b;
    /* renamed from: c */
    private View f39496c;
    /* renamed from: d */
    private View f39497d;
    /* renamed from: e */
    private View f39498e;

    @UiThread
    public BirthdayStepView_ViewBinding(final BirthdayStepView birthdayStepView, View view) {
        this.f39495b = birthdayStepView;
        birthdayStepView.onboardingDateWidgetView = (OnboardingDateWidgetView) C0761c.b(view, R.id.onboarding_birthday_widget, "field 'onboardingDateWidgetView'", OnboardingDateWidgetView.class);
        birthdayStepView.hintTextView = (CustomTextView) C0761c.b(view, R.id.onboarding_birthday_hint, "field 'hintTextView'", CustomTextView.class);
        View a = C0761c.a(view, R.id.onboarding_birthday_button, "field 'birthdayButton' and method 'onBirthdayButtonClick'");
        birthdayStepView.birthdayButton = (CustomButton) C0761c.c(a, R.id.onboarding_birthday_button, "field 'birthdayButton'", CustomButton.class);
        this.f39496c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BirthdayStepView_ViewBinding f39490b;

            public void doClick(View view) {
                birthdayStepView.onBirthdayButtonClick();
            }
        });
        a = C0761c.a(view, R.id.onboarding_stay_tuned_button, "method 'onStayTunedButtonClicked'");
        this.f39497d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BirthdayStepView_ViewBinding f39492b;

            public void doClick(View view) {
                birthdayStepView.onStayTunedButtonClicked();
            }
        });
        a = C0761c.a(view, R.id.onboarding_birthday_certification_button, "method 'onCertificationButtonClicked'");
        this.f39498e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BirthdayStepView_ViewBinding f39494b;

            public void doClick(View view) {
                birthdayStepView.onCertificationButtonClicked();
            }
        });
        view = view.getContext();
        birthdayStepView.onboardingErrorHintColor = C0432b.c(view, R.color.onboarding_error_hint);
        birthdayStepView.onboardingHintColor = C0432b.c(view, R.color.onboarding_name_field_underline_hint);
    }

    @CallSuper
    public void unbind() {
        BirthdayStepView birthdayStepView = this.f39495b;
        if (birthdayStepView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39495b = null;
        birthdayStepView.onboardingDateWidgetView = null;
        birthdayStepView.hintTextView = null;
        birthdayStepView.birthdayButton = null;
        this.f39496c.setOnClickListener(null);
        this.f39496c = null;
        this.f39497d.setOnClickListener(null);
        this.f39497d = null;
        this.f39498e.setOnClickListener(null);
        this.f39498e = null;
    }
}
