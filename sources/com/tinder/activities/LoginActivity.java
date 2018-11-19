package com.tinder.activities;

import android.app.Dialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import com.facebook.CallbackManager;
import com.facebook.accountkit.AccountKitLoginResult;
import com.facebook.accountkit.ui.AccountKitActivity;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.login.C1771d;
import com.tinder.R;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.model.C8292g;
import com.tinder.base.ActivityBase;
import com.tinder.dialogs.C11115g;
import com.tinder.dialogs.C8858i;
import com.tinder.dialogs.C8858i.C8857a;
import com.tinder.dialogs.C8867t;
import com.tinder.dialogs.DialogIsTween;
import com.tinder.events.EventLoggedOut;
import com.tinder.fragments.as;
import com.tinder.intro.IntroFragment;
import com.tinder.intro.IntroFragment$IntroCallbacks;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.onboarding.activities.OnboardingActivity;
import com.tinder.onboarding.activity.CountdownActivity;
import com.tinder.onboarding.view.SmsConfirmationActivity;
import com.tinder.presenters.bw;
import com.tinder.smsauth.sdk.C14986b;
import com.tinder.smsauth.sdk.C14987c;
import com.tinder.targets.LoginTarget;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import com.tinder.utils.av;
import java8.util.Optional;
import javax.inject.Inject;

public class LoginActivity extends ActivityBase implements IntroFragment$IntroCallbacks, LoginTarget {
    @Inject
    /* renamed from: a */
    bw f14889a;
    @Inject
    /* renamed from: b */
    LegacyBreadCrumbTracker f14890b;
    @Inject
    /* renamed from: c */
    CallbackManager f14891c;
    /* renamed from: d */
    private C8858i f14892d;
    /* renamed from: e */
    private IntroFragment f14893e = IntroFragment.a();
    /* renamed from: f */
    private as f14894f;
    /* renamed from: g */
    private C8858i f14895g;
    /* renamed from: h */
    private C8867t f14896h;
    /* renamed from: i */
    private boolean f14897i = false;

    public void onEvent(EventLoggedOut eventLoggedOut) {
        ManagerApp.m14858e().inject(this);
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ad.m10189a();
        setContentView(R.layout.activity_login);
        ManagerApp.m14858e().inject(this);
        this.f14894f = new as();
        AuthType authType = null;
        if (bundle == null) {
            bundle = getIntent();
            boolean hasExtra = bundle.hasExtra("show delete account dialog");
            if (hasExtra) {
                this.f14895g = new C11115g(this);
                this.f14895g.show();
            }
            if (!bundle.hasExtra("extra_show_intro")) {
                if (!hasExtra) {
                    hasExtra = false;
                    this.f14897i = hasExtra;
                    bundle = bundle.getStringExtra("extra_auth_type");
                    if (bundle != null) {
                        authType = AuthType.fromValue(bundle);
                    }
                    C1771d.m6112a().m6134a(this.f14891c, this.f14889a);
                }
            }
            hasExtra = true;
            this.f14897i = hasExtra;
            bundle = bundle.getStringExtra("extra_auth_type");
            if (bundle != null) {
                authType = AuthType.fromValue(bundle);
            }
            C1771d.m6112a().m6134a(this.f14891c, this.f14889a);
        }
        m18706i();
        this.f14889a.a(this);
        this.f14889a.a(this.f14897i, authType);
    }

    protected void onResume() {
        super.onResume();
        this.f14889a.a(this);
        this.f14890b.a(this);
    }

    public void onPause() {
        av.m10215a(this.f14892d);
        super.onPause();
        this.f14889a.a();
    }

    public void onBackPressed() {
        Object obj = (this.f14893e.isResumed() && this.f14893e.c()) ? 1 : null;
        if (obj == null) {
            super.onBackPressed();
        }
    }

    public void showIntroFragment() {
        m18702b(this.f14893e);
    }

    public void launchActivityMain() {
        if (!isFinishing()) {
            findViewById(R.id.splash_logo).animate().scaleX(0.0f).scaleY(0.0f).setInterpolator(new AnticipateInterpolator()).setDuration(300).setListener(new LoginActivity$1(this));
        }
    }

    public void relaunchLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addFlags(8421376);
        startActivity(intent);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f14889a.a(this);
        super.onActivityResult(i, i2, intent);
        if (i != 100 || intent == null) {
            if (i != 102 || intent == null) {
                if (i != 104 || intent == null) {
                    if (i == 101) {
                        if (-1 == i2) {
                            this.f14889a.a(AuthType.fromValue(intent.getStringExtra("authtype")));
                        } else if (i2 == 10001) {
                            this.f14889a.a(intent.getIntExtra("days_locked", 1));
                        }
                    } else if (i != 103) {
                        this.f14891c.onActivityResult(i, i2, intent);
                    } else if (-1 == i2) {
                        this.f14889a.j();
                    } else if (2 == i2) {
                        this.f14889a.i();
                    } else {
                        this.f14889a.k();
                    }
                } else if (-1 == i2) {
                    this.f14889a.a(C14986b.a(intent));
                }
            } else if (i2 == 0) {
                this.f14889a.d();
            } else {
                this.f14889a.b((AccountKitLoginResult) intent.getParcelableExtra(AccountKitLoginResult.RESULT_KEY));
            }
        } else if (i2 == 0) {
            this.f14889a.e();
        } else {
            this.f14889a.a((AccountKitLoginResult) intent.getParcelableExtra(AccountKitLoginResult.RESULT_KEY));
        }
    }

    public void launchFacebookAuth() {
        this.f14893e.b();
    }

    public void onDestroy() {
        ad.m10189a();
        dismissProgressDialog();
        av.m10215a(this.f14895g);
        super.onDestroy();
    }

    @MainThread
    public void showProgressDialog() {
        if (this.f14896h == null) {
            this.f14896h = new C8867t(this);
        }
        this.f14896h.show();
    }

    public void dismissProgressDialog() {
        av.m10215a(this.f14896h);
    }

    public void showFbAuthFixesDialog() {
        if (this.f14892d == null || !this.f14892d.isShowing()) {
            this.f14892d = new C8858i(this, 0, R.string.login_failed, R.string.fb_auth_fixes);
            this.f14892d.a(true);
            this.f14892d.c(R.string.ok, new C6165s(this));
            this.f14892d.show();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m18744a(View view) {
        av.m10215a(this.f14892d);
    }

    public void showLoginFailure() {
        if (!isFinishing() && this.f14889a.c()) {
            at.a(this, R.string.error_login);
        }
    }

    public void showVerificationNeeded(C8292g c8292g) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_age_verification_needed", c8292g.e());
        bundle.putBoolean("is_gender_verification_needed", c8292g.d());
        c8292g = new Intent(this, ActivityVerification.class);
        c8292g.putExtras(bundle);
        startActivity(c8292g);
        finish();
    }

    public void showNetworkDialog() {
        C8858i c8858i = new C8858i(this, 0, R.string.login_failed, R.string.error_network_missing);
        c8858i.a(false);
        c8858i.setCancelable(false);
        c8858i.setCanceledOnTouchOutside(false);
        c8858i.c(R.string.ok, new C6166t(this, c8858i));
        if (!isFinishing()) {
            c8858i.show();
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m18746b(C8858i c8858i, View view) {
        av.m10215a((Dialog) c8858i);
        moveTaskToBack(true);
        finish();
    }

    public boolean hasNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (VERSION.SDK_INT >= 21) {
            return connectivityManager.isDefaultNetworkActive();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void showLoginIsTween(boolean z) {
        if (!isFinishing()) {
            DialogIsTween dialogIsTween = new DialogIsTween(this);
            dialogIsTween.a(z);
            dialogIsTween.show();
        }
    }

    public void onTermsOfServiceClicked() {
        this.f14894f = as.a(getString(R.string.webview_url_terms));
        m18697a(this.f14894f, as.f42211a, R.anim.slide_up_fifty_percent_to_default, R.anim.slide_down_five_percent_from_default, R.anim.slide_up_five_percent_to_default, R.anim.slide_down_entirely_from_default);
        this.f14889a.g();
    }

    public void onPrivacyPolicyClicked() {
        this.f14894f = as.a(getString(R.string.webview_url_privacy));
        m18697a(this.f14894f, as.f42211a, R.anim.slide_up_fifty_percent_to_default, R.anim.slide_down_five_percent_from_default, R.anim.slide_up_five_percent_to_default, R.anim.slide_down_entirely_from_default);
        this.f14889a.h();
    }

    public void onStartAccountKitActivityForResult(Intent intent) {
        startActivityForResult(intent, 100);
    }

    public void onStartSmsAuthActivityForResult(C14987c c14987c) {
        C14986b.a(this, 104, c14987c);
    }

    public void onShowWebViewFragment(as asVar) {
        m18697a(asVar, as.f42211a, R.anim.slide_up_fifty_percent_to_default, R.anim.slide_down_five_percent_from_default, R.anim.slide_up_five_percent_to_default, R.anim.slide_down_entirely_from_default);
    }

    public void showOnBoardingScreen(AuthType authType) {
        startActivityForResult(OnboardingActivity.a(this, authType), 101);
    }

    public void showSmsConfirmationScreen() {
        startActivityForResult(SmsConfirmationActivity.a(this), 103);
    }

    public void showCountDownActivity(int i) {
        i = CountdownActivity.a(this, i);
        i.setFlags(268468224);
        startActivity(i);
    }

    public void showOutdatedClientDialog() {
        m18743a((int) R.string.please_update_tinder, getString(R.string.update_tinder_body));
    }

    public void showLoginFailedDialog(Optional<Integer> optional) {
        String format;
        if (optional.c()) {
            format = String.format(getString(R.string.error_login_with_error_code), new Object[]{optional.b()});
        } else {
            format = getString(R.string.error_login);
        }
        m18743a((int) R.string.oops, format);
    }

    public void showAccountKitSMSValidation(AccountKitConfiguration accountKitConfiguration) {
        Intent intent = new Intent(this, AccountKitActivity.class);
        intent.putExtra(AccountKitActivity.a, accountKitConfiguration);
        startActivityForResult(intent, 102);
    }

    /* renamed from: a */
    private void m18743a(@StringRes int i, @NonNull String str) {
        if (!isFinishing()) {
            i = new C8857a(this).a(i).a(str).a();
            i.c(R.string.ok, new C6167u(this, i));
            i.show();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m18745a(C8858i c8858i, View view) {
        av.m10215a((Dialog) c8858i);
        this.f14889a.f();
    }
}
