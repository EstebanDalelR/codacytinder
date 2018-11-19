package com.tinder.onboarding.view;

import android.view.inputmethod.InputMethodManager;
import com.tinder.onboarding.presenter.BirthdayStepPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.view.b */
public final class C12209b implements MembersInjector<BirthdayStepView> {
    /* renamed from: a */
    private final Provider<BirthdayStepPresenter> f39563a;
    /* renamed from: b */
    private final Provider<InputMethodManager> f39564b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48358a((BirthdayStepView) obj);
    }

    /* renamed from: a */
    public void m48358a(BirthdayStepView birthdayStepView) {
        C12209b.m48357a(birthdayStepView, (BirthdayStepPresenter) this.f39563a.get());
        C12209b.m48356a(birthdayStepView, (InputMethodManager) this.f39564b.get());
    }

    /* renamed from: a */
    public static void m48357a(BirthdayStepView birthdayStepView, BirthdayStepPresenter birthdayStepPresenter) {
        birthdayStepView.f43233a = birthdayStepPresenter;
    }

    /* renamed from: a */
    public static void m48356a(BirthdayStepView birthdayStepView, InputMethodManager inputMethodManager) {
        birthdayStepView.f43234b = inputMethodManager;
    }
}
