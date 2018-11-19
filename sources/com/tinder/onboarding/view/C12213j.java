package com.tinder.onboarding.view;

import android.view.inputmethod.InputMethodManager;
import com.tinder.onboarding.presenter.cz;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.view.j */
public final class C12213j implements MembersInjector<NameStepView> {
    /* renamed from: a */
    private final Provider<cz> f39568a;
    /* renamed from: b */
    private final Provider<InputMethodManager> f39569b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48373a((NameStepView) obj);
    }

    /* renamed from: a */
    public void m48373a(NameStepView nameStepView) {
        C12213j.m48372a(nameStepView, (cz) this.f39568a.get());
        C12213j.m48371a(nameStepView, (InputMethodManager) this.f39569b.get());
    }

    /* renamed from: a */
    public static void m48372a(NameStepView nameStepView, cz czVar) {
        nameStepView.f43240a = czVar;
    }

    /* renamed from: a */
    public static void m48371a(NameStepView nameStepView, InputMethodManager inputMethodManager) {
        nameStepView.f43241b = inputMethodManager;
    }
}
