package com.tinder.onboarding.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.utils.C8578a;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.onboarding.exception.OnboardingInvalidDataException;
import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.GenderSelection;
import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.onboarding.model.OnboardingExperiments;
import com.tinder.onboarding.model.OnboardingInvalidDataType;
import com.tinder.onboarding.target.GenderStepTarget;
import com.tinder.presenters.PresenterBase;
import com.tinder.scope.ActivityScope;
import java8.util.Optional;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@ActivityScope
public class by extends PresenterBase<GenderStepTarget> {
    @NonNull
    /* renamed from: a */
    private final OnboardingExperiments f43148a;
    @NonNull
    /* renamed from: b */
    private final OnboardingAnalyticsInteractor f43149b;
    @NonNull
    /* renamed from: c */
    private final C9965a f43150c;
    @Nullable
    /* renamed from: d */
    private Value f43151d;
    @Nullable
    /* renamed from: e */
    private String f43152e;

    /* renamed from: b */
    final /* synthetic */ void m52725b(GenderSelection genderSelection) {
        m52713d(genderSelection);
    }

    @Inject
    public by(@NonNull C9965a c9965a, @NonNull OnboardingExperiments onboardingExperiments, @NonNull OnboardingAnalyticsInteractor onboardingAnalyticsInteractor) {
        this.f43150c = c9965a;
        this.f43148a = onboardingExperiments;
        this.f43149b = onboardingAnalyticsInteractor;
    }

    /* renamed from: b */
    public void m52724b() {
        a(new bz(this));
        this.f43150c.m40937a().k(ca.f43153a).f(cl.f43155a).k(cr.f43156a).b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle()).a(new cs(this), ct.f44677a);
    }

    /* renamed from: b */
    final /* synthetic */ void m52726b(GenderStepTarget genderStepTarget) {
        if (this.f43148a.isMoreGenderEnabled()) {
            genderStepTarget.enableCustomGenderOption();
        } else {
            genderStepTarget.disableCustomGenderOption();
        }
    }

    /* renamed from: a */
    public void m52714a(@NonNull Value value) {
        this.f43151d = value;
        GenderStepTarget genderStepTarget = (GenderStepTarget) H();
        if (genderStepTarget != null) {
            genderStepTarget.enabledContinueButton();
            genderStepTarget.toggleGenderSelection(value);
            genderStepTarget.hideGenderTitle();
        }
    }

    /* renamed from: a */
    public void m52720a(@Nullable String str) {
        if (str != null) {
            this.f43152e = str;
            this.f43149b.fireOnboardingViewEvent(OnboardingEventCode.CUSTOM_GENDER);
            a(new cu(str));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m52709a(@Nullable String str, GenderStepTarget genderStepTarget) {
        genderStepTarget.enabledContinueButton();
        genderStepTarget.showCustomGenderView(str);
        genderStepTarget.showGenderTitle();
    }

    /* renamed from: a */
    public void m52722a(boolean z, boolean z2) {
        if (this.f43152e != null) {
            m52712c(GenderSelection.builder().gender(z ? Value.MALE : Value.FEMALE).customGender(this.f43152e).showGenderOnProfile(Boolean.valueOf(z2)).build());
        }
    }

    /* renamed from: c */
    public void m52727c() {
        if (this.f43151d != null) {
            m52712c(GenderSelection.builder().gender(this.f43151d).build());
        }
    }

    /* renamed from: a */
    public boolean m52723a(int i) {
        if (i != 0) {
            return false;
        }
        a(cv.f44679a);
        this.f43149b.fireOnboardingViewEvent(OnboardingEventCode.BINARY_GENDER);
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ void m52708a(GenderStepTarget genderStepTarget) {
        genderStepTarget.showBinaryGenderView();
        genderStepTarget.hideGenderTitle();
    }

    /* renamed from: c */
    private void m52712c(@NonNull GenderSelection genderSelection) {
        a(cw.f44680a);
        this.f43150c.m40931a(genderSelection).b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle().forCompletable()).d(new cx(this)).a(new cb(this, genderSelection), new cc(this, genderSelection));
    }

    /* renamed from: d */
    final /* synthetic */ void m52728d() {
        a(cq.f44675a);
    }

    /* renamed from: a */
    final /* synthetic */ void m52715a(@NonNull GenderSelection genderSelection) {
        m52707a(genderSelection, true);
    }

    /* renamed from: a */
    final /* synthetic */ void m52716a(@NonNull GenderSelection genderSelection, Throwable th) {
        C0001a.c(th);
        if (!(th instanceof OnboardingInvalidDataException)) {
            a(cp.f44674a);
        } else if (((OnboardingInvalidDataException) th).m40924a() == OnboardingInvalidDataType.INVALID_CUSTOM_GENDER) {
            a(cn.f44672a);
        } else {
            a(co.f44673a);
        }
        m52707a(genderSelection, (boolean) null);
    }

    /* renamed from: a */
    public void m52721a(boolean z, int i) {
        if (z) {
            a(cd.f44665a);
            z = i == 0;
            if (z) {
                a(ce.f44666a);
            }
            m52711b(z ? OnboardingEventCode.CUSTOM_GENDER : OnboardingEventCode.BINARY_GENDER);
        }
    }

    /* renamed from: b */
    private void m52711b(OnboardingEventCode onboardingEventCode) {
        this.f43150c.m40937a().h().k(cf.f43154a).b(Schedulers.io()).d(new cg(this, onboardingEventCode));
    }

    /* renamed from: a */
    final /* synthetic */ void m52719a(OnboardingEventCode onboardingEventCode, Optional optional) {
        optional.a(new ck(this, onboardingEventCode), new cm(this, onboardingEventCode));
    }

    /* renamed from: a */
    final /* synthetic */ void m52718a(OnboardingEventCode onboardingEventCode, GenderSelection genderSelection) {
        if (onboardingEventCode == OnboardingEventCode.BINARY_GENDER) {
            genderSelection = m52710b(genderSelection.gender());
        } else {
            genderSelection = genderSelection.customGender();
        }
        this.f43149b.fireOnboardingViewEvent(onboardingEventCode, genderSelection);
    }

    /* renamed from: a */
    final /* synthetic */ void m52717a(OnboardingEventCode onboardingEventCode) {
        this.f43149b.fireOnboardingViewEvent(onboardingEventCode);
    }

    /* renamed from: a */
    private void m52707a(@NonNull GenderSelection genderSelection, boolean z) {
        int a = C8578a.m36596a(genderSelection.customGender()) ^ 1;
        this.f43149b.fireOnboardingSubmitEvent(a != 0 ? OnboardingEventCode.CUSTOM_GENDER : OnboardingEventCode.BINARY_GENDER, a != 0 ? genderSelection.customGender() : m52710b(genderSelection.gender()), z);
    }

    @Nullable
    /* renamed from: b */
    private String m52710b(@Nullable Value value) {
        if (value == null) {
            return null;
        }
        switch (value) {
            case MALE:
                return "male";
            case FEMALE:
                return "female";
            case UNKNOWN:
                return "Unknown";
            default:
                return null;
        }
    }

    /* renamed from: d */
    private void m52713d(@NonNull GenderSelection genderSelection) {
        if (genderSelection.customGender() != null) {
            m52720a(genderSelection.customGender());
            a(new ch(genderSelection));
            if (Value.MALE == genderSelection.gender()) {
                a(ci.f44670a);
            } else {
                a(cj.f44671a);
            }
        } else if (genderSelection.gender() != null) {
            m52714a(genderSelection.gender());
        }
    }
}
