package com.tinder.onboarding.view;

import com.tinder.onboarding.presenter.C13526y;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.view.e */
public final class C12211e implements MembersInjector<EmailStepView> {
    /* renamed from: a */
    private final Provider<C13526y> f39565a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48367a((EmailStepView) obj);
    }

    /* renamed from: a */
    public void m48367a(EmailStepView emailStepView) {
        C12211e.m48366a(emailStepView, (C13526y) this.f39565a.get());
    }

    /* renamed from: a */
    public static void m48366a(EmailStepView emailStepView, C13526y c13526y) {
        emailStepView.f43237a = c13526y;
    }
}
