package com.tinder.onboarding.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jakewharton.rxbinding.p130a.C5698c;
import com.tinder.R;
import com.tinder.onboarding.activities.OnboardingActivity;
import com.tinder.onboarding.activities.OnboardingActivity.OnboardingViewVisibleListener;
import com.tinder.onboarding.module.OnboardingComponentProvider;
import com.tinder.onboarding.presenter.ex;
import com.tinder.onboarding.target.PasswordStepTarget;
import javax.inject.Inject;
import rx.Observable;

public class PasswordStepView extends ConstraintLayout implements OnboardingViewVisibleListener, PasswordStepTarget {
    @Inject
    /* renamed from: a */
    ex f43243a;
    @Inject
    /* renamed from: b */
    InputMethodManager f43244b;
    @BindColor(2131100038)
    int errorHintColor;
    @BindView(2131363068)
    TextView hintTextView;
    @BindString(2131821495)
    String invalidPasswordHint;
    @BindString(2131821494)
    String normalHint;
    @BindColor(2131100044)
    int normalHintColor;
    @BindView(2131363067)
    EditText passwordInput;
    @BindString(2131821496)
    String strongPasswordHint;
    @BindColor(2131100047)
    int strongPasswordHintColor;
    @BindView(2131363066)
    Button submitButton;
    @BindString(2131821498)
    String tooSimplePasswordHint;

    public PasswordStepView(Context context) {
        super(context);
        if (context instanceof OnboardingComponentProvider) {
            ((OnboardingComponentProvider) context).provideComponent().inject(this);
            LayoutInflater.from(context).inflate(R.layout.view_onboarding_password, this);
            return;
        }
        throw new IllegalArgumentException("Parent activity doesn't provide an Onboarding component");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        this.f43243a.a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43243a.m52817a();
    }

    @OnClick({2131363066})
    void onSubmitButtonClicked() {
        this.f43243a.m52821a(this.passwordInput.getText().toString());
    }

    public void showKeyboard() {
        this.passwordInput.requestFocus();
        this.f43244b.showSoftInput(this.passwordInput, 1);
    }

    public void dismissKeyboard() {
        this.passwordInput.clearFocus();
        this.f43244b.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public void enableActionButton() {
        setSubmitButtonEnabled(true);
    }

    public void disableActionButton() {
        setSubmitButtonEnabled(false);
    }

    public void showStrongPasswordHint() {
        m52904a(this.strongPasswordHint, this.strongPasswordHintColor, this.strongPasswordHintColor);
    }

    public void showSimplePasswordHint() {
        m52904a(this.tooSimplePasswordHint, this.errorHintColor, this.errorHintColor);
    }

    public void showPasswordRequirementHint() {
        m52904a(this.invalidPasswordHint, this.errorHintColor, this.errorHintColor);
    }

    public void showPasswordNormalHint() {
        m52904a(this.normalHint, this.normalHintColor, this.normalHintColor);
    }

    public Observable<String> editTextAfterTextChanges() {
        return C5698c.b(this.passwordInput).k(C13535n.f43257a);
    }

    public void showGenericErrorDialog() {
        ((OnboardingActivity) getContext()).showGenericErrorMessage(false);
    }

    public void showProgressDialog() {
        ((OnboardingActivity) getContext()).showProgressDialog();
    }

    public void hideProgressDialog() {
        ((OnboardingActivity) getContext()).hideProgressDialog();
    }

    public void onVisibilityChanged(boolean z) {
        this.f43243a.m52824a(z);
    }

    public void setText(@NonNull String str) {
        this.passwordInput.setText(str);
        this.passwordInput.setSelection(str.length());
    }

    public void removeHintMessage() {
        m52904a(null, this.normalHintColor, this.normalHintColor);
    }

    @OnClick({2131363067})
    void onEditTextClicked() {
        this.f43243a.m52825b();
    }

    /* renamed from: a */
    private void m52904a(@Nullable String str, @ColorInt int i, @ColorInt int i2) {
        this.hintTextView.setText(str);
        this.hintTextView.setTextColor(i);
        ViewCompat.a(this.passwordInput, ColorStateList.valueOf(i2));
    }

    private void setSubmitButtonEnabled(boolean z) {
        this.submitButton.setEnabled(z);
    }
}
