package com.tinder.auth.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.facebook.login.widget.LoginButton;
import com.tinder.R;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomTextView;

public class LoginButtonGroupView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private LoginButtonGroupView f33795b;
    /* renamed from: c */
    private View f33796c;
    /* renamed from: d */
    private View f33797d;
    /* renamed from: e */
    private View f33798e;

    @UiThread
    public LoginButtonGroupView_ViewBinding(final LoginButtonGroupView loginButtonGroupView, View view) {
        this.f33795b = loginButtonGroupView;
        loginButtonGroupView.mFBLoginButton = (LoginButton) C0761c.b(view, R.id.facebook_login_button, "field 'mFBLoginButton'", LoginButton.class);
        View a = C0761c.a(view, R.id.real_facebook_login_button, "field 'mRealFBLoginButton' and method 'onRealFBLoginButtonClicked'");
        loginButtonGroupView.mRealFBLoginButton = (CustomButton) C0761c.c(a, R.id.real_facebook_login_button, "field 'mRealFBLoginButton'", CustomButton.class);
        this.f33796c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ LoginButtonGroupView_ViewBinding f33790b;

            public void doClick(View view) {
                loginButtonGroupView.onRealFBLoginButtonClicked();
            }
        });
        a = C0761c.a(view, R.id.alternative_login_button, "field 'mAltLoginButton' and method 'onAltLoginButtonClicked'");
        loginButtonGroupView.mAltLoginButton = (CustomButton) C0761c.c(a, R.id.alternative_login_button, "field 'mAltLoginButton'", CustomButton.class);
        this.f33797d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ LoginButtonGroupView_ViewBinding f33792b;

            public void doClick(View view) {
                loginButtonGroupView.onAltLoginButtonClicked();
            }
        });
        loginButtonGroupView.mAuthDisclaimer = (CustomTextView) C0761c.b(view, R.id.auth_disclaimer_text, "field 'mAuthDisclaimer'", CustomTextView.class);
        view = C0761c.a(view, R.id.fb_disclaimer_text, "field 'mFBDisclaimer' and method 'onFBDisclaimerTextClicked'");
        loginButtonGroupView.mFBDisclaimer = (CustomTextView) C0761c.c(view, R.id.fb_disclaimer_text, "field 'mFBDisclaimer'", CustomTextView.class);
        this.f33798e = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ LoginButtonGroupView_ViewBinding f33794b;

            public void doClick(View view) {
                loginButtonGroupView.onFBDisclaimerTextClicked();
            }
        });
    }

    @CallSuper
    public void unbind() {
        LoginButtonGroupView loginButtonGroupView = this.f33795b;
        if (loginButtonGroupView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f33795b = null;
        loginButtonGroupView.mFBLoginButton = null;
        loginButtonGroupView.mRealFBLoginButton = null;
        loginButtonGroupView.mAltLoginButton = null;
        loginButtonGroupView.mAuthDisclaimer = null;
        loginButtonGroupView.mFBDisclaimer = null;
        this.f33796c.setOnClickListener(null);
        this.f33796c = null;
        this.f33797d.setOnClickListener(null);
        this.f33797d = null;
        this.f33798e.setOnClickListener(null);
        this.f33798e = null;
    }
}
