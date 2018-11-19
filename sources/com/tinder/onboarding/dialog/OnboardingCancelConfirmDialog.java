package com.tinder.onboarding.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatDialog;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;

public class OnboardingCancelConfirmDialog extends AppCompatDialog {
    @Nullable
    /* renamed from: a */
    private OnButtonClickedListener f43100a;

    public interface OnButtonClickedListener {
        void onNegativeButtonClicked();

        void onPositiveButtonClicked();
    }

    /* renamed from: a */
    public static OnboardingCancelConfirmDialog m52619a(@NonNull Context context) {
        return new OnboardingCancelConfirmDialog(context);
    }

    private OnboardingCancelConfirmDialog(@NonNull Context context) {
        super(context, R.style.SimpleCancelConfirmDialog);
        setContentView(R.layout.onboarding_cancel_confirm_dialog);
        ButterKnife.a(this);
    }

    /* renamed from: a */
    public void m52620a(@Nullable OnButtonClickedListener onButtonClickedListener) {
        this.f43100a = onButtonClickedListener;
    }

    @OnClick({2131363050})
    void onNoButtonClicked() {
        if (this.f43100a != null) {
            this.f43100a.onNegativeButtonClicked();
        }
    }

    @OnClick({2131363051})
    void onYesButtonClicked() {
        if (this.f43100a != null) {
            this.f43100a.onPositiveButtonClicked();
        }
    }
}
