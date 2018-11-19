package com.tinder.onboarding.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomButton;

public class EmailStepView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private EmailStepView f39508b;
    /* renamed from: c */
    private View f39509c;
    /* renamed from: d */
    private TextWatcher f39510d;
    /* renamed from: e */
    private View f39511e;

    @UiThread
    public EmailStepView_ViewBinding(final EmailStepView emailStepView, View view) {
        this.f39508b = emailStepView;
        View a = C0761c.a(view, R.id.onboarding_email_edit_text, "field 'emailEditText' and method 'onEmailInputTextChanged'");
        emailStepView.emailEditText = (EditText) C0761c.c(a, R.id.onboarding_email_edit_text, "field 'emailEditText'", EditText.class);
        this.f39509c = a;
        this.f39510d = new TextWatcher(this) {
            /* renamed from: b */
            final /* synthetic */ EmailStepView_ViewBinding f32840b;

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                emailStepView.onEmailInputTextChanged((CharSequence) C0761c.a(editable, "afterTextChanged", 0, "onEmailInputTextChanged", 0, CharSequence.class));
            }
        };
        ((TextView) a).addTextChangedListener(this.f39510d);
        a = C0761c.a(view, R.id.onboarding_email_action_button, "field 'submitButton' and method 'onActionButtonClicked'");
        emailStepView.submitButton = (CustomButton) C0761c.c(a, R.id.onboarding_email_action_button, "field 'submitButton'", CustomButton.class);
        this.f39511e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ EmailStepView_ViewBinding f39507b;

            public void doClick(View view) {
                emailStepView.onActionButtonClicked();
            }
        });
        emailStepView.emailHintTextView = (TextView) C0761c.b(view, R.id.onboarding_email_edit_text_hint, "field 'emailHintTextView'", TextView.class);
        emailStepView.emailMarketingCheckbox = (CheckBox) C0761c.b(view, R.id.onboarding_email_marketing_checkbox, "field 'emailMarketingCheckbox'", CheckBox.class);
        emailStepView.emailMarketingTextView = (TextView) C0761c.b(view, R.id.onboarding_email_marketing_text, "field 'emailMarketingTextView'", TextView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        emailStepView.onboardingErrorHintColor = C0432b.c(view, R.color.onboarding_error_hint);
        emailStepView.onboardingNormalHintColor = C0432b.c(view, R.color.onboarding_name_field_underline_hint);
        emailStepView.invalidEmailText = resources.getString(R.string.onboarding_email_invalid_email);
    }

    @CallSuper
    public void unbind() {
        EmailStepView emailStepView = this.f39508b;
        if (emailStepView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39508b = null;
        emailStepView.emailEditText = null;
        emailStepView.submitButton = null;
        emailStepView.emailHintTextView = null;
        emailStepView.emailMarketingCheckbox = null;
        emailStepView.emailMarketingTextView = null;
        ((TextView) this.f39509c).removeTextChangedListener(this.f39510d);
        this.f39510d = null;
        this.f39509c = null;
        this.f39511e.setOnClickListener(null);
        this.f39511e = null;
    }
}
