package com.tinder.auth.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.content.C0432b;
import android.text.Html;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.facebook.accountkit.ui.AccountKitActivity;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.LoginButton;
import com.tinder.R;
import com.tinder.auth.p100a.C4304a;
import com.tinder.auth.target.LoginButtonGroupTarget;
import com.tinder.fragments.as;
import com.tinder.managers.ManagerApp;
import com.tinder.smsauth.sdk.C14987c;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomTextView;
import javax.inject.Inject;

public class LoginButtonGroupView extends LinearLayout implements LoginButtonGroupTarget {
    @Inject
    /* renamed from: a */
    C4304a f33786a;
    /* renamed from: b */
    private Unbinder f33787b = ButterKnife.a(this, this);
    /* renamed from: c */
    private OnScreenLaunchListener f33788c;
    @BindView(2131361877)
    CustomButton mAltLoginButton;
    @BindView(2131361900)
    CustomTextView mAuthDisclaimer;
    @BindView(2131362486)
    CustomTextView mFBDisclaimer;
    @BindView(2131362456)
    LoginButton mFBLoginButton;
    @BindView(2131363393)
    CustomButton mRealFBLoginButton;

    /* renamed from: com.tinder.auth.view.LoginButtonGroupView$1 */
    class C82981 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ LoginButtonGroupView f29572a;

        C82981(LoginButtonGroupView loginButtonGroupView) {
            this.f29572a = loginButtonGroupView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f29572a.m42163a(this.f29572a.mAuthDisclaimer, 4);
            this.f29572a.mAuthDisclaimer.animate().setListener(null);
        }
    }

    public interface OnScreenLaunchListener {
        void onFBDisclaimerTextClicked();

        void onLaunchAccountKit(Intent intent);

        void onLaunchSmsAuth(C14987c c14987c);

        void onLaunchWebView(as asVar);
    }

    public LoginButtonGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.auth_v2_login_buttons_view, this);
        if (isInEditMode() == null) {
            ManagerApp.e().inject(this);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33786a.a(this);
        this.f33786a.b();
    }

    public void setOnScreenLaunchListener(OnScreenLaunchListener onScreenLaunchListener) {
        this.f33788c = onScreenLaunchListener;
    }

    public void setFBLoginButtonFragment(Fragment fragment) {
        this.mFBLoginButton.setFragment(fragment);
    }

    public void setUpFBLoginButton(@NonNull String[] strArr, @NonNull LoginBehavior loginBehavior) {
        this.mFBLoginButton.setReadPermissions(strArr);
        this.mFBLoginButton.setLoginBehavior(loginBehavior);
    }

    @OnClick({2131363393})
    public void onRealFBLoginButtonClicked() {
        this.f33786a.c();
    }

    @OnClick({2131361877})
    public void onAltLoginButtonClicked() {
        this.f33786a.d();
    }

    @OnClick({2131362486})
    public void onFBDisclaimerTextClicked() {
        this.f33786a.e();
    }

    /* renamed from: a */
    public void m42166a() {
        this.mFBDisclaimer.setClickable(true);
        m42164a(this.mFBDisclaimer, true, null);
        m42164a(this.mAuthDisclaimer, true, null);
        m42163a(this.mAuthDisclaimer, 0);
        this.mAuthDisclaimer.setAlpha(0.0f);
        this.mAuthDisclaimer.animate().alpha(1.0f).setDuration(400).start();
    }

    public void launchFBLoginScreen() {
        this.mFBLoginButton.performClick();
    }

    public void launchAccountKitLoginScreen(AccountKitConfiguration accountKitConfiguration) {
        Intent intent = new Intent(getContext(), AccountKitActivity.class);
        intent.putExtra(AccountKitActivity.a, accountKitConfiguration);
        if (this.f33788c != null) {
            this.f33788c.onLaunchAccountKit(intent);
        }
    }

    public void launchSMSAuthLoginScreen(C14987c c14987c) {
        this.f33788c.onLaunchSmsAuth(c14987c);
    }

    public void setAuthDisclaimerText(@StringRes int i, @Nullable MovementMethod movementMethod, @ColorRes int i2) {
        this.mAuthDisclaimer.setText(Html.fromHtml(getResources().getString(i)));
        this.mAuthDisclaimer.setMovementMethod(movementMethod);
        this.mAuthDisclaimer.setHighlightColor(C0432b.c(getContext(), i2));
    }

    public void launchWebView(@StringRes int i) {
        i = as.m51516a(getResources().getString(i));
        if (this.f33788c != null) {
            this.f33788c.onLaunchWebView(i);
        }
    }

    public void showFBDisclaimerContent() {
        if (this.f33788c != null) {
            this.f33788c.onFBDisclaimerTextClicked();
        }
    }

    public void hideDisclaimerText() {
        this.mFBDisclaimer.setClickable(false);
        m42164a(this.mFBDisclaimer, false, null);
        m42164a(this.mAuthDisclaimer, false, new C82981(this));
    }

    protected void onDetachedFromWindow() {
        this.f33786a.a();
        this.f33787b.unbind();
        this.f33788c = null;
        super.onDetachedFromWindow();
    }

    public void setAltAuthButtonTextColor(@ColorRes int i) {
        this.mAltLoginButton.setTextColor(C0432b.c(getContext(), i));
    }

    public void setAltAuthButtonBackground(@DrawableRes int i) {
        this.mAltLoginButton.setBackgroundResource(i);
    }

    public void setDisclaimerTextColor(@ColorRes int i) {
        i = C0432b.c(getContext(), i);
        this.mAuthDisclaimer.setTextColor(i);
        this.mAuthDisclaimer.setHighlightColor(i);
        this.mFBDisclaimer.setTextColor(i);
    }

    /* renamed from: a */
    private void m42164a(@NonNull View view, boolean z, @Nullable AnimatorListener animatorListener) {
        view.animate().alpha(z ? true : false).setDuration(400).setListener(animatorListener).start();
    }

    /* renamed from: a */
    private void m42163a(@NonNull View view, int i) {
        view.setVisibility(i);
    }
}
