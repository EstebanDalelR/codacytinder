package com.tinder.account.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class UpdateEmailView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private UpdateEmailView f26179b;
    /* renamed from: c */
    private View f26180c;
    /* renamed from: d */
    private TextWatcher f26181d;

    @UiThread
    public UpdateEmailView_ViewBinding(final UpdateEmailView updateEmailView, View view) {
        this.f26179b = updateEmailView;
        View a = C0761c.a(view, R.id.account_update_email_edit_text, "field 'emailEditText' and method 'onEmailInputTextChanged'");
        updateEmailView.emailEditText = (EditText) C0761c.c(a, R.id.account_update_email_edit_text, "field 'emailEditText'", EditText.class);
        this.f26180c = a;
        this.f26181d = new TextWatcher(this) {
            /* renamed from: b */
            final /* synthetic */ UpdateEmailView_ViewBinding f22656b;

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                updateEmailView.onEmailInputTextChanged((CharSequence) C0761c.a(editable, "afterTextChanged", 0, "onEmailInputTextChanged", 0, CharSequence.class));
            }
        };
        ((TextView) a).addTextChangedListener(this.f26181d);
        updateEmailView.emailHintTextView = (TextView) C0761c.b(view, R.id.account_email_edit_text_hint, "field 'emailHintTextView'", TextView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        updateEmailView.onboardingErrorHintColor = C0432b.c(view, R.color.onboarding_error_hint);
        updateEmailView.onboardingNormalHintColor = C0432b.c(view, R.color.onboarding_name_field_underline_hint);
        updateEmailView.invalidEmailText = resources.getString(R.string.onboarding_email_invalid_email);
    }

    @CallSuper
    public void unbind() {
        UpdateEmailView updateEmailView = this.f26179b;
        if (updateEmailView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26179b = null;
        updateEmailView.emailEditText = null;
        updateEmailView.emailHintTextView = null;
        ((TextView) this.f26180c).removeTextChangedListener(this.f26181d);
        this.f26181d = null;
        this.f26180c = null;
    }
}
