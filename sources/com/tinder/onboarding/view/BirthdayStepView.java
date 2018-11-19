package com.tinder.onboarding.view;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;
import android.widget.ViewFlipper;
import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.dialogs.DialogError;
import com.tinder.onboarding.activities.OnboardingActivity;
import com.tinder.onboarding.activities.OnboardingActivity.OnBackPressedListener;
import com.tinder.onboarding.activities.OnboardingActivity.OnboardingViewVisibleListener;
import com.tinder.onboarding.module.OnboardingComponentProvider;
import com.tinder.onboarding.presenter.BirthdayStepPresenter;
import com.tinder.onboarding.target.BirthdayStepTarget;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomTextView;
import java8.util.Optional;
import javax.inject.Inject;
import org.joda.time.LocalDate;

public class BirthdayStepView extends ViewFlipper implements OnBackPressedListener, OnboardingViewVisibleListener, BirthdayStepTarget {
    @Inject
    /* renamed from: a */
    BirthdayStepPresenter f43233a;
    @Inject
    /* renamed from: b */
    InputMethodManager f43234b;
    @BindView(2131363043)
    CustomButton birthdayButton;
    @NonNull
    /* renamed from: c */
    private Optional<LocalDate> f43235c = Optional.a();
    /* renamed from: d */
    private final OnboardingDateWidgetView$DateWidgetInputCompleteListener f43236d = new C12208a(this);
    @BindView(2131363045)
    CustomTextView hintTextView;
    @BindView(2131363047)
    OnboardingDateWidgetView onboardingDateWidgetView;
    @BindColor(2131100038)
    int onboardingErrorHintColor;
    @BindColor(2131100044)
    int onboardingHintColor;

    /* renamed from: a */
    final /* synthetic */ void m52898a(boolean z, Optional optional) {
        if (!z) {
            optional = Optional.a();
        }
        this.f43235c = optional;
        this.f43233a.m52682a(this.f43235c);
    }

    public BirthdayStepView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.view_onboarding_birthday, this);
        if (context instanceof OnboardingComponentProvider) {
            ((OnboardingComponentProvider) context).provideComponent().inject(this);
            return;
        }
        throw new IllegalArgumentException("Parent activity doesn't provide an Onboarding component");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        m52895a();
        this.f43233a.a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43233a.a();
        m52897b();
    }

    public void onVisibilityChanged(boolean z) {
        this.f43233a.m52686a(z);
        this.onboardingDateWidgetView.a(z);
    }

    public boolean onBackPressed() {
        return this.f43233a.m52688b();
    }

    public void setBirthday(@NonNull LocalDate localDate) {
        this.onboardingDateWidgetView.a(localDate);
    }

    public void showBirthdayWidgetView() {
        setDisplayedChild(0);
        this.onboardingDateWidgetView.a();
    }

    public void enableContinueButton() {
        this.birthdayButton.setEnabled(true);
    }

    public void disableContinueButton() {
        this.birthdayButton.setEnabled(false);
    }

    public void showGenericErrorMessage() {
        DialogError.m37618a(getContext()).m37613a((int) R.string.onboarding_error_dialog_title).m37616a().show();
    }

    public void showInvalidBirthDayMessage() {
        this.hintTextView.setText(R.string.onboarding_birthday_step_invalid_date);
        this.hintTextView.setTextColor(this.onboardingErrorHintColor);
    }

    public void showBirthdayHint() {
        this.hintTextView.setText(R.string.onboarding_birthday_step_hint);
        this.hintTextView.setTextColor(this.onboardingHintColor);
    }

    public void showUnderageError() {
        this.f43234b.hideSoftInputFromWindow(getWindowToken(), 0);
        setDisplayedChild(1);
    }

    public void showCertification() {
        this.f43234b.hideSoftInputFromWindow(getWindowToken(), 0);
        setDisplayedChild(2);
    }

    public void finishOnboardingProcess() {
        Activity activity = (Activity) getContext();
        if (activity != null) {
            activity.finish();
        }
    }

    @OnClick({2131363043})
    public void onBirthdayButtonClick() {
        m52896a(this.f43235c);
    }

    @OnClick({2131363071})
    public void onStayTunedButtonClicked() {
        this.f43233a.m52689c();
    }

    @OnClick({2131363044})
    public void onCertificationButtonClicked() {
        this.f43233a.m52687b((LocalDate) this.f43235c.b());
    }

    /* renamed from: a */
    private void m52896a(Optional<LocalDate> optional) {
        if (optional.c()) {
            this.f43233a.m52683a((LocalDate) optional.b());
        }
    }

    /* renamed from: a */
    private void m52895a() {
        this.onboardingDateWidgetView.setWidgetInputCompleteListener(this.f43236d);
    }

    /* renamed from: b */
    private void m52897b() {
        this.onboardingDateWidgetView.b();
    }

    public void showProgressDialog() {
        ((OnboardingActivity) getContext()).showProgressDialog();
    }

    public void hideProgressDialog() {
        ((OnboardingActivity) getContext()).hideProgressDialog();
    }

    public void focusInputField() {
        this.onboardingDateWidgetView.a();
    }

    public void enableFocusForFields() {
        this.onboardingDateWidgetView.setFocusable(true);
    }

    public void disableFocusForFields() {
        this.onboardingDateWidgetView.setFocusable(false);
    }
}
