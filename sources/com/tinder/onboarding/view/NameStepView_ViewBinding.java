package com.tinder.onboarding.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomEditText;
import com.tinder.views.CustomTextView;

public class NameStepView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private NameStepView f39539b;
    /* renamed from: c */
    private View f39540c;
    /* renamed from: d */
    private TextWatcher f39541d;
    /* renamed from: e */
    private View f39542e;

    @UiThread
    public NameStepView_ViewBinding(final NameStepView nameStepView, View view) {
        this.f39539b = nameStepView;
        View a = C0761c.a(view, R.id.onboarding_name_edit_text, "field 'nameEditText', method 'onNameEditorAction', and method 'onNameTextChanged'");
        nameStepView.nameEditText = (CustomEditText) C0761c.c(a, R.id.onboarding_name_edit_text, "field 'nameEditText'", CustomEditText.class);
        this.f39540c = a;
        TextView textView = (TextView) a;
        textView.setOnEditorActionListener(new OnEditorActionListener(this) {
            /* renamed from: b */
            final /* synthetic */ NameStepView_ViewBinding f32842b;

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return nameStepView.onNameEditorAction(textView, i, keyEvent);
            }
        });
        this.f39541d = new TextWatcher(this) {
            /* renamed from: b */
            final /* synthetic */ NameStepView_ViewBinding f32844b;

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                nameStepView.onNameTextChanged(editable);
            }
        };
        textView.addTextChangedListener(this.f39541d);
        a = C0761c.a(view, R.id.onboarding_name_add_button, "field 'nameButton' and method 'onNameButtonClick'");
        nameStepView.nameButton = (CustomButton) C0761c.c(a, R.id.onboarding_name_add_button, "field 'nameButton'", CustomButton.class);
        this.f39542e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ NameStepView_ViewBinding f39538b;

            public void doClick(View view) {
                nameStepView.onNameButtonClick();
            }
        });
        nameStepView.nameEditTextHint = (CustomTextView) C0761c.b(view, R.id.onboarding_name_edit_text_hint, "field 'nameEditTextHint'", CustomTextView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        nameStepView.onboardingErrorHintColor = C0432b.c(view, R.color.onboarding_error_hint);
        nameStepView.onboardingNormalHintColor = C0432b.c(view, R.color.onboarding_name_field_underline_hint);
        nameStepView.normalCaseHint = resources.getString(R.string.onboarding_name_step_hint);
        nameStepView.invalidCharsHint = resources.getString(R.string.onboarding_name_step_invalid_characters);
        nameStepView.nameNotAllowedHint = resources.getString(R.string.onboarding_name_step_name_not_allowed);
    }

    @CallSuper
    public void unbind() {
        NameStepView nameStepView = this.f39539b;
        if (nameStepView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39539b = null;
        nameStepView.nameEditText = null;
        nameStepView.nameButton = null;
        nameStepView.nameEditTextHint = null;
        ((TextView) this.f39540c).setOnEditorActionListener(null);
        ((TextView) this.f39540c).removeTextChangedListener(this.f39541d);
        this.f39541d = null;
        this.f39540c = null;
        this.f39542e.setOnClickListener(null);
        this.f39542e = null;
    }
}
