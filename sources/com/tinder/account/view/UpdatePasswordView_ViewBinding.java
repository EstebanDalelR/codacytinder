package com.tinder.account.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class UpdatePasswordView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private UpdatePasswordView f26184b;

    @UiThread
    public UpdatePasswordView_ViewBinding(UpdatePasswordView updatePasswordView, View view) {
        this.f26184b = updatePasswordView;
        updatePasswordView.passwordInput = (EditText) C0761c.b(view, R.id.account_password_edit_text, "field 'passwordInput'", EditText.class);
        updatePasswordView.hintTextView = (TextView) C0761c.b(view, R.id.account_password_edit_text_hint, "field 'hintTextView'", TextView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        updatePasswordView.errorHintColor = C0432b.c(view, R.color.onboarding_error_hint);
        updatePasswordView.normalHintColor = C0432b.c(view, R.color.onboarding_name_field_underline_hint);
        updatePasswordView.strongPasswordHintColor = C0432b.c(view, R.color.onboarding_strong_password_hint);
        updatePasswordView.normalHint = resources.getString(R.string.onboarding_password_step_hint);
        updatePasswordView.invalidPasswordHint = resources.getString(R.string.onboarding_password_step_invalid_password);
        updatePasswordView.tooSimplePasswordHint = resources.getString(R.string.onboarding_password_step_too_simple_password);
        updatePasswordView.strongPasswordHint = resources.getString(R.string.onboarding_password_step_strong_password);
    }

    @CallSuper
    public void unbind() {
        UpdatePasswordView updatePasswordView = this.f26184b;
        if (updatePasswordView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26184b = null;
        updatePasswordView.passwordInput = null;
        updatePasswordView.hintTextView = null;
    }
}
