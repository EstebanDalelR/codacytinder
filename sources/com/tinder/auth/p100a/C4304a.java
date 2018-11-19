package com.tinder.auth.p100a;

import com.tinder.R;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8276b;
import com.tinder.auth.interactor.C8281o;
import com.tinder.auth.model.AuthAnalyticsConstants.Value.AuthFrom;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.target.LoginButtonGroupTarget;
import com.tinder.base.text.PrivacyLinkMovementMethod;
import com.tinder.base.text.PrivacyLinkMovementMethod$OnLinksClickedListener;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.experiments.Buckets;
import com.tinder.domain.experiments.Buckets.SmsAuthBucket;
import com.tinder.domain.experiments.GetBuckets;
import com.tinder.presenters.PresenterBase;
import com.tinder.smsauth.sdk.C14987c;
import io.reactivex.disposables.C17356a;
import javax.annotation.Nonnull;
import javax.inject.Inject;

/* renamed from: com.tinder.auth.a.a */
public class C4304a extends PresenterBase<LoginButtonGroupTarget> implements PrivacyLinkMovementMethod$OnLinksClickedListener {
    @Nonnull
    /* renamed from: a */
    private final C8276b f14024a;
    @Nonnull
    /* renamed from: b */
    private final C8281o f14025b;
    @Nonnull
    /* renamed from: c */
    private final C10333h f14026c;
    @Nonnull
    /* renamed from: d */
    private final AbTestUtility f14027d;
    @Nonnull
    /* renamed from: e */
    private final C14987c f14028e;
    @Nonnull
    /* renamed from: f */
    private final GetBuckets f14029f;
    @Nonnull
    /* renamed from: g */
    private final Schedulers f14030g;
    /* renamed from: h */
    private final C17356a f14031h = new C17356a();

    @Inject
    public C4304a(@Nonnull C8276b c8276b, @Nonnull C8281o c8281o, @Nonnull C10333h c10333h, @Nonnull C14987c c14987c, @Nonnull AbTestUtility abTestUtility, @Nonnull GetBuckets getBuckets, @Nonnull Schedulers schedulers) {
        this.f14024a = c8276b;
        this.f14025b = c8281o;
        this.f14026c = c10333h;
        this.f14027d = abTestUtility;
        this.f14028e = c14987c;
        this.f14029f = getBuckets;
        this.f14030g = schedulers;
    }

    /* renamed from: a */
    public void mo3589a() {
        super.mo3589a();
        this.f14031h.a();
    }

    /* renamed from: b */
    public void m17312b() {
        LoginButtonGroupTarget loginButtonGroupTarget = (LoginButtonGroupTarget) m15090H();
        loginButtonGroupTarget.setUpFBLoginButton(this.f14025b.a(), this.f14025b.b());
        loginButtonGroupTarget.setAuthDisclaimerText(R.string.terms_and_privacy_v2, new PrivacyLinkMovementMethod(this), R.color.transparent);
    }

    /* renamed from: c */
    public void m17314c() {
        LoginButtonGroupTarget loginButtonGroupTarget = (LoginButtonGroupTarget) m15090H();
        if (loginButtonGroupTarget != null) {
            loginButtonGroupTarget.launchFBLoginScreen();
        }
        this.f14026c.c();
        this.f14026c.a(AuthType.FACEBOOK, AuthFrom.LOGIN_BUTTON);
        this.f14026c.a(AuthType.FACEBOOK);
    }

    /* renamed from: d */
    public void m17315d() {
        this.f14026c.b();
        this.f14031h.add(this.f14029f.invoke().m15478e(new C10323b(this)).m15467b(this.f14030g.io()).m15459a(this.f14030g.mainThread()).m15456a(new C10324c(this), new C10325d(this)));
    }

    /* renamed from: a */
    final /* synthetic */ Boolean m17307a(Buckets buckets) throws Exception {
        if (buckets.getSmsAuth() != SmsAuthBucket.TINDER_SMS) {
            if (this.f14027d.isSmsAuthV2Enabled() == null) {
                buckets = null;
                return Boolean.valueOf(buckets);
            }
        }
        buckets = true;
        return Boolean.valueOf(buckets);
    }

    /* renamed from: a */
    final /* synthetic */ void m17310a(Boolean bool) throws Exception {
        if (bool.booleanValue() != null) {
            m17306g();
        } else {
            m17305f();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m17311a(Throwable th) throws Exception {
        m17305f();
    }

    /* renamed from: f */
    private void m17305f() {
        m15094a(new C13612e(this));
        this.f14026c.a(AuthType.ACCOUNTKIT, AuthFrom.LOGIN_BUTTON);
        this.f14026c.a(AuthType.ACCOUNTKIT);
    }

    /* renamed from: b */
    final /* synthetic */ void m17313b(LoginButtonGroupTarget loginButtonGroupTarget) {
        loginButtonGroupTarget.launchAccountKitLoginScreen(this.f14024a.a());
    }

    /* renamed from: g */
    private void m17306g() {
        m15094a(new C13613f(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m17309a(LoginButtonGroupTarget loginButtonGroupTarget) {
        loginButtonGroupTarget.launchSMSAuthLoginScreen(this.f14028e);
    }

    /* renamed from: e */
    public void m17316e() {
        LoginButtonGroupTarget loginButtonGroupTarget = (LoginButtonGroupTarget) m15090H();
        if (loginButtonGroupTarget != null) {
            loginButtonGroupTarget.hideDisclaimerText();
            loginButtonGroupTarget.showFBDisclaimerContent();
        }
    }

    public void onTermsOfServiceClicked() {
        LoginButtonGroupTarget loginButtonGroupTarget = (LoginButtonGroupTarget) m15090H();
        if (loginButtonGroupTarget != null) {
            loginButtonGroupTarget.launchWebView(R.string.webview_url_terms);
            this.f14026c.a(0);
        }
    }

    public void onPrivacyPolicyClicked() {
        LoginButtonGroupTarget loginButtonGroupTarget = (LoginButtonGroupTarget) m15090H();
        if (loginButtonGroupTarget != null) {
            loginButtonGroupTarget.launchWebView(R.string.webview_url_privacy);
            this.f14026c.b(0);
        }
    }
}
