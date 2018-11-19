package com.tinder.onboarding.presenter;

import android.support.annotation.NonNull;
import com.tinder.common.utils.C8578a;
import com.tinder.domain.auth.usecase.MaskEmail;
import com.tinder.domain.auth.usecase.RegexEmailValidator;
import com.tinder.onboarding.exception.OnboardingInvalidDataException;
import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingEmail;
import com.tinder.onboarding.model.OnboardingEmail.Builder;
import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.onboarding.model.OnboardingInvalidDataType;
import com.tinder.onboarding.target.EmailStepTarget;
import com.tinder.presenters.PresenterBase;
import com.tinder.scope.ActivityScope;
import java.util.concurrent.TimeUnit;
import java8.util.Optional;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@ActivityScope
/* renamed from: com.tinder.onboarding.presenter.y */
public class C13526y extends PresenterBase<EmailStepTarget> {
    @NonNull
    /* renamed from: a */
    private final C9965a f43202a;
    @NonNull
    /* renamed from: b */
    private final OnboardingAnalyticsInteractor f43203b;
    @NonNull
    /* renamed from: c */
    private final RegexEmailValidator f43204c;
    @NonNull
    /* renamed from: d */
    private final MaskEmail f43205d;
    @NonNull
    /* renamed from: e */
    private final C19573b f43206e = new C19573b();

    /* renamed from: d */
    static final /* synthetic */ void m52856d() {
    }

    /* renamed from: a */
    final /* synthetic */ void m52870a(Throwable th) {
        m52853b(th);
    }

    /* renamed from: b */
    final /* synthetic */ void m52876b(Optional optional) {
        m52860f(optional);
    }

    @Inject
    C13526y(@NonNull C9965a c9965a, @NonNull OnboardingAnalyticsInteractor onboardingAnalyticsInteractor, @NonNull RegexEmailValidator regexEmailValidator, @NonNull MaskEmail maskEmail) {
        this.f43202a = c9965a;
        this.f43203b = onboardingAnalyticsInteractor;
        this.f43204c = regexEmailValidator;
        this.f43205d = maskEmail;
    }

    /* renamed from: a */
    public void m52863a() {
        super.a();
        this.f43206e.a();
    }

    /* renamed from: a */
    public void m52867a(@NonNull CharSequence charSequence) {
        a(new C14104z(this, charSequence));
    }

    /* renamed from: a */
    final /* synthetic */ void m52868a(@NonNull CharSequence charSequence, EmailStepTarget emailStepTarget) {
        emailStepTarget.showNormalHint();
        if (this.f43204c.isValid(charSequence.toString()) != null) {
            emailStepTarget.enableSubmitButton();
        } else {
            emailStepTarget.disableSubmitButton();
        }
    }

    /* renamed from: a */
    public void m52873a(boolean z) {
        if (z) {
            a(aa.f44630a);
            this.f43202a.m40937a().k(al.f43135a).h().b(new aw(this)).b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle()).b(new bh(this)).c(new bn(this)).a(new bo(this), bp.f44656a);
            m52861h();
            return;
        }
        this.f43206e.a();
    }

    /* renamed from: g */
    final /* synthetic */ void m52883g() {
        a(bm.f44653a);
    }

    /* renamed from: f */
    final /* synthetic */ void m52882f() {
        a(bl.f44652a);
    }

    /* renamed from: a */
    final /* synthetic */ void m52871a(Optional optional) {
        m52854c(optional);
        m52857d(optional);
    }

    /* renamed from: a */
    public void m52869a(@NonNull String str, boolean z) {
        if (this.f43204c.isValid(str)) {
            a(br.f44658a);
            this.f43202a.m40937a().h().a().d(ab.f43130a).d(ac.f43131a).c(new ad(this, str, z)).a(bindToLifecycle().forCompletable()).b(Schedulers.io()).a(C19397a.a()).d(new ae(this)).a(af.f44632a, new ag(this));
            return;
        }
        a(bq.f44657a);
    }

    /* renamed from: a */
    final /* synthetic */ Completable m52862a(@NonNull String str, boolean z, OnboardingEmail onboardingEmail) {
        Builder builder = OnboardingEmail.builder();
        Boolean bool = null;
        if (!onboardingEmail.emailEditable()) {
            str = null;
        }
        str = builder.email(str);
        if (onboardingEmail.allowMarketingEditable() != null) {
            bool = Boolean.valueOf(z);
        }
        OnboardingEmail build = str.allowMarketing(bool).build();
        return this.f43202a.m40932a(build).c(new bj(this, build)).b(new bk(this, build));
    }

    /* renamed from: a */
    final /* synthetic */ void m52864a(OnboardingEmail onboardingEmail, Throwable th) {
        m52847a(onboardingEmail, (boolean) null);
    }

    /* renamed from: d */
    final /* synthetic */ void m52880d(OnboardingEmail onboardingEmail) {
        m52847a(onboardingEmail, true);
    }

    /* renamed from: e */
    final /* synthetic */ void m52881e() {
        a(bi.f44647a);
    }

    /* renamed from: h */
    private void m52861h() {
        a(new ah(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m52865a(EmailStepTarget emailStepTarget) {
        emailStepTarget = emailStepTarget.afterEmailInputChanges().f(ay.f43136a).r();
        C19573b c19573b = this.f43206e;
        RegexEmailValidator regexEmailValidator = this.f43204c;
        regexEmailValidator.getClass();
        Observable e = emailStepTarget.f(az.m52694a(regexEmailValidator)).h().e(emailStepTarget);
        RegexEmailValidator regexEmailValidator2 = this.f43204c;
        regexEmailValidator2.getClass();
        e = e.k(ba.m52698a(regexEmailValidator2)).f(bb.f43140a);
        emailStepTarget = emailStepTarget.c(2, TimeUnit.SECONDS);
        regexEmailValidator2 = this.f43204c;
        regexEmailValidator2.getClass();
        c19573b.a(e.h(emailStepTarget.k(bc.m52699a(regexEmailValidator2)).f(bd.f43142a).a(C19397a.a())).a(new be(this), bf.f44644a));
    }

    /* renamed from: c */
    final /* synthetic */ void m52879c(Boolean bool) {
        a(bg.f44645a);
    }

    /* renamed from: c */
    private void m52854c(Optional<OnboardingEmail> optional) {
        a(ai.f44635a);
        optional.a(new aj(this));
    }

    /* renamed from: c */
    final /* synthetic */ void m52878c(OnboardingEmail onboardingEmail) {
        a(new ax(onboardingEmail.email(), onboardingEmail));
    }

    /* renamed from: a */
    static final /* synthetic */ void m52849a(String str, OnboardingEmail onboardingEmail, EmailStepTarget emailStepTarget) {
        if (!C8578a.m36596a(str)) {
            emailStepTarget.setEmail(str);
        }
        if (onboardingEmail.emailEditable() == null) {
            emailStepTarget.disableEmailInput();
        }
    }

    /* renamed from: d */
    private void m52857d(Optional<OnboardingEmail> optional) {
        m52859e((Optional) optional).a(new ak(this), new am(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m52875b(Boolean bool) {
        a(new av(bool));
    }

    /* renamed from: c */
    final /* synthetic */ void m52877c() {
        a(au.f44638a);
    }

    /* renamed from: e */
    private Optional<Boolean> m52859e(@NonNull Optional<OnboardingEmail> optional) {
        return optional.b(an.f39443a);
    }

    /* renamed from: a */
    static final /* synthetic */ Optional m52846a(OnboardingEmail onboardingEmail) {
        if (onboardingEmail.allowMarketingEditable()) {
            return Optional.b(onboardingEmail.allowMarketing()).a(new at(onboardingEmail));
        }
        return Optional.a();
    }

    /* renamed from: b */
    private void m52853b(@NonNull Throwable th) {
        C0001a.b(th, "Error updating email", new Object[0]);
        if ((th instanceof OnboardingInvalidDataException) && ((OnboardingInvalidDataException) th).m40924a() == OnboardingInvalidDataType.INVALID_EMAIL) {
            a(ao.f44636a);
        } else {
            a(ap.f44637a);
        }
    }

    /* renamed from: f */
    private void m52860f(Optional<OnboardingEmail> optional) {
        optional.a(new aq(this, optional), new ar(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m52872a(Optional optional, OnboardingEmail onboardingEmail) {
        this.f43203b.fireOnboardingViewEvent(OnboardingEventCode.EMAIL, this.f43205d.invoke(onboardingEmail.email()));
        m52859e(optional).a(new as(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m52866a(Boolean bool) {
        this.f43203b.fireOnboardingViewEvent(OnboardingEventCode.ALLOW_EMAIL_MARKETING, String.valueOf(bool));
    }

    /* renamed from: b */
    final /* synthetic */ void m52874b() {
        this.f43203b.fireOnboardingViewEvent(OnboardingEventCode.EMAIL);
    }

    /* renamed from: a */
    private void m52847a(OnboardingEmail onboardingEmail, boolean z) {
        String email = onboardingEmail.email();
        onboardingEmail = onboardingEmail.allowMarketing();
        if (email != null) {
            m52852b(email, z);
        }
        if (onboardingEmail != null) {
            m52850a(onboardingEmail.booleanValue(), z);
        }
    }

    /* renamed from: b */
    private void m52852b(@NonNull String str, boolean z) {
        this.f43203b.fireOnboardingSubmitEvent(OnboardingEventCode.EMAIL, this.f43205d.invoke(str), z);
    }

    /* renamed from: a */
    private void m52850a(boolean z, boolean z2) {
        this.f43203b.fireOnboardingSubmitEvent(OnboardingEventCode.ALLOW_EMAIL_MARKETING, String.valueOf(z), z2);
    }
}
