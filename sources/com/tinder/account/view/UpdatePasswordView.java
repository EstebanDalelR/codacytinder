package com.tinder.account.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.ColorInt;
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
import com.jakewharton.rxbinding.p130a.C5698c;
import com.tinder.R;
import com.tinder.account.model.UpdateAccountException;
import com.tinder.account.p072a.ad;
import com.tinder.account.view.UpdateAccountEmailPasswordActivity.FlowResponder;
import com.tinder.managers.ManagerApp;
import java8.util.Optional;
import javax.inject.Inject;
import rx.Observable;

public class UpdatePasswordView extends ConstraintLayout implements FlowResponder, UpdatePasswordTarget {
    @Inject
    /* renamed from: a */
    ad f26182a;
    /* renamed from: b */
    private final C6152d f26183b;
    @BindColor(2131100038)
    int errorHintColor;
    @BindView(2131361806)
    TextView hintTextView;
    @BindString(2131821495)
    String invalidPasswordHint;
    @BindString(2131821494)
    String normalHint;
    @BindColor(2131100044)
    int normalHintColor;
    @BindView(2131361805)
    EditText passwordInput;
    @BindString(2131821496)
    String strongPasswordHint;
    @BindColor(2131100047)
    int strongPasswordHintColor;
    @BindString(2131821498)
    String tooSimplePasswordHint;

    public UpdatePasswordView(Context context) {
        super(context);
        if (context instanceof C6152d) {
            this.f26183b = (C6152d) context;
            LayoutInflater.from(context).inflate(R.layout.view_account_update_password, this);
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
        this.f26182a.a(this);
        this.f26182a.b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26182a.a();
    }

    public Optional<String> onActionButtonClicked() {
        return this.f26182a.a(getInput());
    }

    public boolean handleError(@NonNull UpdateAccountException updateAccountException) {
        return this.f26182a.a(updateAccountException);
    }

    public void enableSubmitButton() {
        this.f26183b.mo8483a(true);
    }

    public void disableSubmitButton() {
        this.f26183b.mo8483a(false);
    }

    public void showStrongPasswordHint() {
        m31094a(this.strongPasswordHint, this.strongPasswordHintColor, this.strongPasswordHintColor);
    }

    public void showSimplePasswordHint() {
        m31094a(this.tooSimplePasswordHint, this.errorHintColor, this.errorHintColor);
    }

    public void showPasswordRequirementHint() {
        m31094a(this.invalidPasswordHint, this.errorHintColor, this.errorHintColor);
    }

    public void showPasswordNormalHint() {
        m31094a(this.normalHint, this.normalHintColor, this.normalHintColor);
    }

    public void showProgressDialog() {
        this.f26183b.showProgressDialog();
    }

    public void dismissProgressDialog() {
        this.f26183b.hideProgressDialog();
    }

    public Observable<String> editTextAfterTextChanges() {
        return C5698c.m24976b(this.passwordInput).k(C7959h.f28571a);
    }

    /* renamed from: a */
    private void m31094a(@NonNull String str, @ColorInt int i, @ColorInt int i2) {
        this.hintTextView.setText(str);
        this.hintTextView.setTextColor(i);
        ViewCompat.a(this.passwordInput, ColorStateList.valueOf(i2));
    }

    private String getInput() {
        return this.passwordInput.getText().toString();
    }
}
