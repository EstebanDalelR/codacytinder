package com.tinder.onboarding.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class OnboardingCancelConfirmDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private OnboardingCancelConfirmDialog f39428b;
    /* renamed from: c */
    private View f39429c;
    /* renamed from: d */
    private View f39430d;

    @UiThread
    public OnboardingCancelConfirmDialog_ViewBinding(final OnboardingCancelConfirmDialog onboardingCancelConfirmDialog, View view) {
        this.f39428b = onboardingCancelConfirmDialog;
        View a = C0761c.a(view, R.id.onboarding_cancel_no_button, "method 'onNoButtonClicked'");
        this.f39429c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ OnboardingCancelConfirmDialog_ViewBinding f39425b;

            public void doClick(View view) {
                onboardingCancelConfirmDialog.onNoButtonClicked();
            }
        });
        view = C0761c.a(view, R.id.onboarding_cancel_yes_button, "method 'onYesButtonClicked'");
        this.f39430d = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ OnboardingCancelConfirmDialog_ViewBinding f39427b;

            public void doClick(View view) {
                onboardingCancelConfirmDialog.onYesButtonClicked();
            }
        });
    }

    @CallSuper
    public void unbind() {
        if (this.f39428b == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39428b = null;
        this.f39429c.setOnClickListener(null);
        this.f39429c = null;
        this.f39430d.setOnClickListener(null);
        this.f39430d = null;
    }
}
