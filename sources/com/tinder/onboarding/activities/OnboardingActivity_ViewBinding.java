package com.tinder.onboarding.activities;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.base.view.LockableViewPager;
import com.tinder.views.CustomTextView;

public class OnboardingActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private OnboardingActivity f39410b;
    /* renamed from: c */
    private View f39411c;
    /* renamed from: d */
    private View f39412d;

    @UiThread
    public OnboardingActivity_ViewBinding(final OnboardingActivity onboardingActivity, View view) {
        this.f39410b = onboardingActivity;
        onboardingActivity.viewFlipper = (ViewFlipper) C0761c.b(view, R.id.onboarding_view_flipper, "field 'viewFlipper'", ViewFlipper.class);
        onboardingActivity.progressBar = (ProgressBar) C0761c.b(view, R.id.progress_bar, "field 'progressBar'", ProgressBar.class);
        onboardingActivity.titleText = (TextView) C0761c.b(view, R.id.title_text, "field 'titleText'", TextView.class);
        onboardingActivity.viewPager = (LockableViewPager) C0761c.b(view, R.id.pager, "field 'viewPager'", LockableViewPager.class);
        onboardingActivity.toolbar = (Toolbar) C0761c.b(view, R.id.toolbar_onboarding, "field 'toolbar'", Toolbar.class);
        View a = C0761c.a(view, R.id.onboarding_skip_button, "field 'skipButton' and method 'onSkipButtonClicked'");
        onboardingActivity.skipButton = (CustomTextView) C0761c.c(a, R.id.onboarding_skip_button, "field 'skipButton'", CustomTextView.class);
        this.f39411c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ OnboardingActivity_ViewBinding f39407b;

            public void doClick(View view) {
                onboardingActivity.onSkipButtonClicked();
            }
        });
        onboardingActivity.errorText = (TextView) C0761c.b(view, R.id.onboarding_error_text, "field 'errorText'", TextView.class);
        a = C0761c.a(view, R.id.onboarding_error_try_again_button, "method 'onTryAgainButtonClicked'");
        this.f39412d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ OnboardingActivity_ViewBinding f39409b;

            public void doClick(View view) {
                onboardingActivity.onTryAgainButtonClicked();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        onboardingActivity.navIconColor = C0432b.c(view, R.color.onboarding_cancel_button_color);
        onboardingActivity.closeIcon = C0432b.a(view, R.drawable.ic_close_48dp);
        onboardingActivity.leftChevron = C0432b.a(view, R.drawable.ic_chevron_left_48dp);
        onboardingActivity.loadingString = resources.getString(R.string.mad_ave_loading);
        onboardingActivity.errorString = resources.getString(R.string.onboarding_last_step_error_body);
    }

    @CallSuper
    public void unbind() {
        OnboardingActivity onboardingActivity = this.f39410b;
        if (onboardingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39410b = null;
        onboardingActivity.viewFlipper = null;
        onboardingActivity.progressBar = null;
        onboardingActivity.titleText = null;
        onboardingActivity.viewPager = null;
        onboardingActivity.toolbar = null;
        onboardingActivity.skipButton = null;
        onboardingActivity.errorText = null;
        this.f39411c.setOnClickListener(null);
        this.f39411c = null;
        this.f39412d.setOnClickListener(null);
        this.f39412d = null;
    }
}
