package com.tinder.onboarding.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import butterknife.OnTextChanged.Callback;
import com.jakewharton.rxbinding.p130a.C5698c;
import com.tinder.R;
import com.tinder.dialogs.DialogError;
import com.tinder.onboarding.activities.OnboardingActivity;
import com.tinder.onboarding.activities.OnboardingActivity.OnboardingViewVisibleListener;
import com.tinder.onboarding.module.OnboardingComponentProvider;
import com.tinder.onboarding.presenter.C13526y;
import com.tinder.onboarding.target.EmailStepTarget;
import com.tinder.views.CustomButton;
import javax.inject.Inject;
import rx.Observable;

public class EmailStepView extends ConstraintLayout implements OnboardingViewVisibleListener, EmailStepTarget {
    @Inject
    /* renamed from: a */
    C13526y f43237a;
    @BindView(2131363053)
    EditText emailEditText;
    @BindView(2131363054)
    TextView emailHintTextView;
    @BindView(2131363055)
    CheckBox emailMarketingCheckbox;
    @BindView(2131363056)
    TextView emailMarketingTextView;
    @BindString(2131821473)
    String invalidEmailText;
    @BindColor(2131100038)
    int onboardingErrorHintColor;
    @BindColor(2131100044)
    int onboardingNormalHintColor;
    @BindView(2131363052)
    CustomButton submitButton;

    public EmailStepView(Context context) {
        super(context);
        if (context instanceof OnboardingComponentProvider) {
            ((OnboardingComponentProvider) context).provideComponent().inject(this);
            LayoutInflater.from(context).inflate(R.layout.view_onboarding_email, this);
            return;
        }
        throw new IllegalArgumentException("Parent activity doesn't provide an Onboarding component");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        this.f43237a.a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43237a.m52863a();
    }

    public void showKeyboard() {
        this.emailEditText.requestFocus();
    }

    public void enableSubmitButton() {
        setSubmitButtonEnabled(true);
    }

    public void disableSubmitButton() {
        setSubmitButtonEnabled(false);
    }

    public void showMarketingCheckbox(boolean z) {
        this.emailMarketingCheckbox.setVisibility(0);
        this.emailMarketingTextView.setVisibility(0);
        this.emailMarketingCheckbox.setChecked(z);
    }

    public void hideMarketingCheckbox() {
        this.emailMarketingCheckbox.setVisibility(8);
        this.emailMarketingTextView.setVisibility(8);
    }

    public void onVisibilityChanged(boolean z) {
        this.f43237a.m52873a(z);
    }

    public void showProgressDialog() {
        ((OnboardingActivity) getContext()).showProgressDialog();
    }

    public void hideProgressDialog() {
        ((OnboardingActivity) getContext()).hideProgressDialog();
    }

    public void showInvalidEmailErrorHint() {
        this.emailHintTextView.setText(this.invalidEmailText);
        this.emailHintTextView.setTextColor(this.onboardingErrorHintColor);
        ViewCompat.a(this.emailEditText, ColorStateList.valueOf(this.onboardingErrorHintColor));
    }

    public void showNormalHint() {
        this.emailHintTextView.setText("");
        this.emailHintTextView.setTextColor(this.onboardingNormalHintColor);
        ViewCompat.a(this.emailEditText, ColorStateList.valueOf(this.onboardingNormalHintColor));
    }

    public void showGenericErrorMessage() {
        DialogError.m37618a(getContext()).m37613a((int) R.string.onboarding_error_dialog_title).m37616a().show();
    }

    public void setEmail(@NonNull String str) {
        this.emailEditText.setText(str);
        this.emailEditText.setSelection(str.length());
    }

    public Observable<String> afterEmailInputChanges() {
        return C5698c.b(this.emailEditText).k(C13534d.f43256a);
    }

    public void disableEmailInput() {
        this.emailEditText.setFocusable(false);
        this.emailEditText.setFocusableInTouchMode(false);
        this.emailEditText.setEnabled(false);
    }

    @OnTextChanged(callback = Callback.AFTER_TEXT_CHANGED, value = {2131363053})
    void onEmailInputTextChanged(@NonNull CharSequence charSequence) {
        this.f43237a.m52867a(charSequence);
    }

    @OnClick({2131363052})
    void onActionButtonClicked() {
        this.f43237a.m52869a(this.emailEditText.getText().toString().trim(), this.emailMarketingCheckbox.isChecked());
    }

    private void setSubmitButtonEnabled(boolean z) {
        this.submitButton.setEnabled(z);
    }
}
