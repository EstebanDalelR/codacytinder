package com.tinder.onboarding.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import butterknife.OnTextChanged;
import butterknife.OnTextChanged.Callback;
import com.tinder.R;
import com.tinder.dialogs.DialogError;
import com.tinder.dialogs.DialogError.C8846a;
import com.tinder.onboarding.activities.OnboardingActivity;
import com.tinder.onboarding.activities.OnboardingActivity.OnboardingViewVisibleListener;
import com.tinder.onboarding.module.OnboardingComponentProvider;
import com.tinder.onboarding.presenter.cz;
import com.tinder.onboarding.target.NameStepTarget;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomEditText;
import com.tinder.views.CustomTextView;
import java.util.Set;
import javax.inject.Inject;

public class NameStepView extends ConstraintLayout implements OnboardingViewVisibleListener, NameStepTarget {
    @Inject
    /* renamed from: a */
    cz f43240a;
    @Inject
    /* renamed from: b */
    InputMethodManager f43241b;
    /* renamed from: c */
    private final StringBuilder f43242c = new StringBuilder();
    @BindString(2131821490)
    String invalidCharsHint;
    @BindView(2131363063)
    CustomButton nameButton;
    @BindView(2131363064)
    CustomEditText nameEditText;
    @BindView(2131363065)
    CustomTextView nameEditTextHint;
    @BindString(2131821491)
    String nameNotAllowedHint;
    @BindString(2131821489)
    String normalCaseHint;
    @BindColor(2131100038)
    int onboardingErrorHintColor;
    @BindColor(2131100044)
    int onboardingNormalHintColor;

    public NameStepView(Context context) {
        super(context);
        if (context instanceof OnboardingComponentProvider) {
            ((OnboardingComponentProvider) context).provideComponent().inject(this);
            LayoutInflater.from(getContext()).inflate(R.layout.view_onboarding_name, this);
            return;
        }
        throw new IllegalArgumentException("Parent activity doesn't provide an Onboarding component");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        this.f43240a.a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43240a.a();
    }

    public void setNameText(@NonNull String str) {
        this.nameEditText.setText(str);
        this.nameEditText.setSelection(str.length());
    }

    public void enableContinueButton() {
        this.nameButton.setEnabled(true);
    }

    public void disableContinueButton() {
        this.nameButton.setEnabled(false);
    }

    public void showErrorMessage(@Nullable String str) {
        C8846a a = DialogError.m37618a(getContext()).m37613a((int) R.string.onboarding_error_dialog_title);
        if (str != null) {
            a.m37615a(str);
        }
        a.m37616a().show();
    }

    @OnClick({2131363063})
    public void onNameButtonClick() {
        this.f43240a.m52742b(getNameText());
    }

    @OnTextChanged(callback = Callback.AFTER_TEXT_CHANGED, value = {2131363064})
    public void onNameTextChanged(Editable editable) {
        m52901b();
        this.f43240a.m52737a(editable.toString());
    }

    @OnEditorAction({2131363064})
    public boolean onNameEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.f43240a.m52742b(textView.getText().toString());
        }
        return true;
    }

    public void showInvalidCharsHint(@NonNull Set<String> set) {
        StringBuilder stringBuilder = getStringBuilder();
        for (String append : set) {
            stringBuilder.append(append);
            stringBuilder.append(",");
        }
        setErrorHint(String.format(this.invalidCharsHint, new Object[]{stringBuilder.toString()}));
    }

    public void showInappropriatePhrasesHint() {
        setErrorHint(this.nameNotAllowedHint);
    }

    public void showGenericErrorMessage() {
        showErrorMessage(null);
    }

    @NonNull
    private String getNameText() {
        return this.nameEditText.getText().toString();
    }

    private StringBuilder getStringBuilder() {
        this.f43242c.setLength(0);
        return this.f43242c;
    }

    private void setErrorHint(@NonNull String str) {
        this.nameEditTextHint.setText(str);
        this.nameEditTextHint.setTextColor(this.onboardingErrorHintColor);
    }

    /* renamed from: b */
    private void m52901b() {
        this.nameEditTextHint.setText(this.normalCaseHint);
        this.nameEditTextHint.setTextColor(this.onboardingNormalHintColor);
    }

    public void onVisibilityChanged(boolean z) {
        this.f43240a.m52740a(z);
    }

    public void showProgressDialog() {
        ((OnboardingActivity) getContext()).showProgressDialog();
    }

    public void hideProgressDialog() {
        ((OnboardingActivity) getContext()).hideProgressDialog();
    }

    public void showKeyboard() {
        post(new C10002i(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m52902a() {
        this.nameEditText.requestFocus();
        this.f43241b.showSoftInput(this.nameEditText, 1);
    }
}
