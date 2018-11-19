package com.tinder.onboarding.presenter;

import android.support.annotation.NonNull;
import com.tinder.common.utils.C8578a;
import com.tinder.onboarding.exception.OnboardingInvalidDataException;
import com.tinder.onboarding.exception.OnboardingUnderageException;
import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.onboarding.target.NameStepTarget;
import com.tinder.presenters.PresenterBase;
import com.tinder.scope.ActivityScope;
import java.util.HashSet;
import java8.util.Optional;
import java8.util.function.Consumer;
import javax.inject.Inject;
import rx.Completable;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@ActivityScope
public class cz extends PresenterBase<NameStepTarget> {
    @NonNull
    /* renamed from: a */
    private final C9965a f43160a;
    @NonNull
    /* renamed from: b */
    private final OnboardingAnalyticsInteractor f43161b;

    /* renamed from: a */
    final /* synthetic */ void m52739a(Optional optional) {
        m52735c(optional);
    }

    /* renamed from: b */
    final /* synthetic */ void m52743b(Optional optional) {
        m52736d(optional);
    }

    @Inject
    public cz(@NonNull C9965a c9965a, @NonNull OnboardingAnalyticsInteractor onboardingAnalyticsInteractor) {
        this.f43160a = c9965a;
        this.f43161b = onboardingAnalyticsInteractor;
    }

    /* renamed from: a */
    public void m52737a(@NonNull String str) {
        NameStepTarget nameStepTarget = (NameStepTarget) H();
        if (nameStepTarget != null) {
            if (C8578a.m36596a(str) != null) {
                nameStepTarget.disableContinueButton();
            } else {
                nameStepTarget.enableContinueButton();
            }
        }
    }

    /* renamed from: b */
    public void m52742b(@NonNull String str) {
        NameStepTarget nameStepTarget = (NameStepTarget) H();
        if (nameStepTarget != null) {
            nameStepTarget.showProgressDialog();
            Completable a = this.f43160a.m40935a(str).b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle().forCompletable());
            nameStepTarget.getClass();
            a.d(da.m53818a(nameStepTarget)).a(new db(this, str), new de(this, str));
        }
    }

    /* renamed from: d */
    final /* synthetic */ void m52745d(@NonNull String str) {
        m52732a(str, true);
    }

    /* renamed from: a */
    final /* synthetic */ void m52738a(@NonNull String str, Throwable th) {
        m52733a(th);
        m52732a(str, (boolean) null);
    }

    /* renamed from: c */
    private void m52734c() {
        this.f43160a.m40937a().k(df.f43162a).h().b(new dg(this)).b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle()).a(new dh(this), di.f44691a);
    }

    /* renamed from: c */
    private void m52735c(Optional<String> optional) {
        NameStepTarget nameStepTarget = (NameStepTarget) H();
        if (nameStepTarget != null) {
            nameStepTarget.getClass();
            Consumer a = dj.m48314a(nameStepTarget);
            nameStepTarget.getClass();
            optional.a(a, dk.m40952a(nameStepTarget));
        }
    }

    /* renamed from: a */
    private void m52733a(Throwable th) {
        NameStepTarget nameStepTarget = (NameStepTarget) H();
        if (nameStepTarget != null) {
            if (th instanceof OnboardingInvalidDataException) {
                OnboardingInvalidDataException onboardingInvalidDataException = (OnboardingInvalidDataException) th;
                switch (onboardingInvalidDataException.m40924a()) {
                    case INVALID_CHARACTERS:
                        nameStepTarget.showInvalidCharsHint(new HashSet(onboardingInvalidDataException.m40926b()));
                        return;
                    case INAPPROPRIATE_PHRASES:
                        nameStepTarget.showInappropriatePhrasesHint();
                        return;
                    default:
                        break;
                }
            }
            if ((th instanceof OnboardingUnderageException) != null) {
                this.f43160a.m40940d().b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle()).t();
            } else {
                nameStepTarget.showGenericErrorMessage();
            }
        }
    }

    /* renamed from: d */
    private void m52736d(Optional<String> optional) {
        optional.a(new dl(this), new dc(this));
    }

    /* renamed from: c */
    final /* synthetic */ void m52744c(String str) {
        this.f43161b.fireOnboardingViewEvent(OnboardingEventCode.NAME, str);
    }

    /* renamed from: b */
    final /* synthetic */ void m52741b() {
        this.f43161b.fireOnboardingViewEvent(OnboardingEventCode.NAME);
    }

    /* renamed from: a */
    private void m52732a(@NonNull String str, boolean z) {
        this.f43161b.fireOnboardingSubmitEvent(OnboardingEventCode.NAME, str, z);
    }

    /* renamed from: a */
    public void m52740a(boolean z) {
        if (z) {
            m52734c();
            this.f43161b.fireOnboardingViewEvent(OnboardingEventCode.NAME);
            a(dd.f44686a);
        }
    }
}
