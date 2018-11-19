package com.tinder.account.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;
import butterknife.OnTextChanged.Callback;
import com.jakewharton.rxbinding.p130a.C5698c;
import com.tinder.R;
import com.tinder.account.model.UpdateAccountException;
import com.tinder.account.p072a.C4300p;
import com.tinder.account.view.UpdateAccountEmailPasswordActivity.FlowResponder;
import com.tinder.managers.ManagerApp;
import java8.util.Optional;
import javax.inject.Inject;
import rx.Observable;

public class UpdateEmailView extends ConstraintLayout implements FlowResponder, UpdateEmailTarget {
    @Inject
    /* renamed from: a */
    C4300p f26177a;
    /* renamed from: b */
    private final C6152d f26178b;
    @BindView(2131361813)
    EditText emailEditText;
    @BindView(2131361804)
    TextView emailHintTextView;
    @BindString(2131821473)
    String invalidEmailText;
    @BindColor(2131100038)
    int onboardingErrorHintColor;
    @BindColor(2131100044)
    int onboardingNormalHintColor;

    public UpdateEmailView(Context context) {
        super(context);
        if (context instanceof C6152d) {
            this.f26178b = (C6152d) context;
            LayoutInflater.from(context).inflate(R.layout.view_account_update_email, this);
            ManagerApp.e().inject(this);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Activity should implement ");
        stringBuilder.append(C6152d.class.getSimpleName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        this.f26177a.a(this);
        this.f26177a.b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26177a.a();
    }

    public void enableSubmitButton() {
        setSubmitButtonEnabled(true);
    }

    public void disableSubmitButton() {
        setSubmitButtonEnabled(false);
    }

    public void showInvalidEmailErrorHint() {
        this.emailHintTextView.setText(this.invalidEmailText);
        this.emailHintTextView.setTextColor(this.onboardingErrorHintColor);
        ViewCompat.a(this.emailEditText, ColorStateList.valueOf(this.onboardingErrorHintColor));
    }

    public void showProgressDialog() {
        this.f26178b.showProgressDialog();
    }

    public void dismissProgressDialog() {
        this.f26178b.hideProgressDialog();
    }

    @OnTextChanged(callback = Callback.AFTER_TEXT_CHANGED, value = {2131361813})
    void onEmailInputTextChanged(@NonNull CharSequence charSequence) {
        m31092a();
        this.f26177a.a(charSequence);
    }

    public Observable<String> afterEmailInputChanges() {
        return C5698c.m24976b(this.emailEditText).k(C7958f.f28570a);
    }

    public Optional<String> onActionButtonClicked() {
        return this.f26177a.a(this.emailEditText.getText().toString().trim());
    }

    public boolean handleError(@NonNull UpdateAccountException updateAccountException) {
        return this.f26177a.a(updateAccountException);
    }

    private void setSubmitButtonEnabled(boolean z) {
        this.f26178b.mo8483a(z);
    }

    /* renamed from: a */
    private void m31092a() {
        this.emailHintTextView.setText("");
        this.emailHintTextView.setTextColor(this.onboardingNormalHintColor);
        ViewCompat.a(this.emailEditText, ColorStateList.valueOf(this.onboardingNormalHintColor));
    }
}
