package com.tinder.account.p072a;

import android.support.annotation.NonNull;
import com.tinder.account.model.UpdateAccountErrorType;
import com.tinder.account.model.UpdateAccountException;
import com.tinder.account.view.UpdateEmailTarget;
import com.tinder.domain.auth.usecase.RegexEmailValidator;
import com.tinder.presenters.PresenterBase;
import java.util.concurrent.TimeUnit;
import java8.util.Optional;
import javax.inject.Inject;
import rx.Observable;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;

/* renamed from: com.tinder.account.a.p */
public class C4300p extends PresenterBase<UpdateEmailTarget> {
    @NonNull
    /* renamed from: a */
    private final RegexEmailValidator f14019a;
    @NonNull
    /* renamed from: b */
    private final C19573b f14020b = new C19573b();

    @Inject
    public C4300p(@NonNull RegexEmailValidator regexEmailValidator) {
        this.f14019a = regexEmailValidator;
    }

    /* renamed from: a */
    public void mo3589a() {
        super.mo3589a();
        this.f14020b.a();
    }

    /* renamed from: b */
    public void m17302b() {
        m15094a(new C4416q(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m17298a(UpdateEmailTarget updateEmailTarget) {
        updateEmailTarget = updateEmailTarget.afterEmailInputChanges().f(C4301x.f14021a).r();
        C19573b c19573b = this.f14020b;
        RegexEmailValidator regexEmailValidator = this.f14019a;
        regexEmailValidator.getClass();
        Observable e = updateEmailTarget.f(C4302y.m17303a(regexEmailValidator)).h().e(updateEmailTarget);
        RegexEmailValidator regexEmailValidator2 = this.f14019a;
        regexEmailValidator2.getClass();
        e = e.k(C4303z.m17304a(regexEmailValidator2)).f(aa.f14004a);
        updateEmailTarget = updateEmailTarget.c(2, TimeUnit.SECONDS);
        regexEmailValidator2 = this.f14019a;
        regexEmailValidator2.getClass();
        c19573b.a(e.h(updateEmailTarget.k(ab.m17276a(regexEmailValidator2)).f(ac.f14006a).a(C19397a.a())).a(new C4418s(this), C4419t.f14620a));
    }

    /* renamed from: a */
    final /* synthetic */ void m17299a(Boolean bool) {
        m15094a((Action1) C4420u.f14621a);
    }

    /* renamed from: a */
    public void m17300a(@NonNull CharSequence charSequence) {
        m15094a(new C4417r(this.f14019a.isValid(charSequence.toString())));
    }

    /* renamed from: a */
    static final /* synthetic */ void m17292a(boolean z, UpdateEmailTarget updateEmailTarget) {
        if (z) {
            updateEmailTarget.enableSubmitButton();
        } else {
            updateEmailTarget.disableSubmitButton();
        }
    }

    @NonNull
    /* renamed from: a */
    public Optional<String> m17296a(@NonNull String str) {
        if (this.f14019a.isValid(str)) {
            return Optional.a(str);
        }
        m15094a((Action1) C4421v.f14622a);
        return Optional.a();
    }

    /* renamed from: a */
    public boolean m17301a(@NonNull UpdateAccountException updateAccountException) {
        if (updateAccountException.m9783a() != UpdateAccountErrorType.INVALID_EMAIL) {
            return null;
        }
        m15094a((Action1) C4422w.f14623a);
        return true;
    }
}
