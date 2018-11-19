package com.tinder.onboarding.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class PasswordStepView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private PasswordStepView f39551b;
    /* renamed from: c */
    private View f39552c;
    /* renamed from: d */
    private View f39553d;

    @UiThread
    public PasswordStepView_ViewBinding(final PasswordStepView passwordStepView, View view) {
        this.f39551b = passwordStepView;
        View a = C0761c.a(view, R.id.onboarding_password_edit_text, "field 'passwordInput' and method 'onEditTextClicked'");
        passwordStepView.passwordInput = (EditText) C0761c.c(a, R.id.onboarding_password_edit_text, "field 'passwordInput'", EditText.class);
        this.f39552c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ PasswordStepView_ViewBinding f39548b;

            public void doClick(View view) {
                passwordStepView.onEditTextClicked();
            }
        });
        passwordStepView.hintTextView = (TextView) C0761c.b(view, R.id.onboarding_password_edit_text_hint, "field 'hintTextView'", TextView.class);
        a = C0761c.a(view, R.id.onboarding_password_action_button, "field 'submitButton' and method 'onSubmitButtonClicked'");
        passwordStepView.submitButton = (Button) C0761c.c(a, R.id.onboarding_password_action_button, "field 'submitButton'", Button.class);
        this.f39553d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ PasswordStepView_ViewBinding f39550b;

            public void doClick(View view) {
                passwordStepView.onSubmitButtonClicked();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        passwordStepView.errorHintColor = C0432b.c(view, R.color.onboarding_error_hint);
        passwordStepView.normalHintColor = C0432b.c(view, R.color.onboarding_name_field_underline_hint);
        passwordStepView.strongPasswordHintColor = C0432b.c(view, R.color.onboarding_strong_password_hint);
        passwordStepView.normalHint = resources.getString(R.string.onboarding_password_step_hint);
        passwordStepView.invalidPasswordHint = resources.getString(R.string.onboarding_password_step_invalid_password);
        passwordStepView.tooSimplePasswordHint = resources.getString(R.string.onboarding_password_step_too_simple_password);
        passwordStepView.strongPasswordHint = resources.getString(R.string.onboarding_password_step_strong_password);
    }

    @CallSuper
    public void unbind() {
        PasswordStepView passwordStepView = this.f39551b;
        if (passwordStepView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39551b = null;
        passwordStepView.passwordInput = null;
        passwordStepView.hintTextView = null;
        passwordStepView.submitButton = null;
        this.f39552c.setOnClickListener(null);
        this.f39552c = null;
        this.f39553d.setOnClickListener(null);
        this.f39553d = null;
    }
}
