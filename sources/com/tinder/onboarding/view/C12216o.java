package com.tinder.onboarding.view;

import android.view.inputmethod.InputMethodManager;
import com.tinder.onboarding.presenter.ex;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.view.o */
public final class C12216o implements MembersInjector<PasswordStepView> {
    /* renamed from: a */
    private final Provider<ex> f39572a;
    /* renamed from: b */
    private final Provider<InputMethodManager> f39573b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48378a((PasswordStepView) obj);
    }

    /* renamed from: a */
    public void m48378a(PasswordStepView passwordStepView) {
        C12216o.m48377a(passwordStepView, (ex) this.f39572a.get());
        C12216o.m48376a(passwordStepView, (InputMethodManager) this.f39573b.get());
    }

    /* renamed from: a */
    public static void m48377a(PasswordStepView passwordStepView, ex exVar) {
        passwordStepView.f43243a = exVar;
    }

    /* renamed from: a */
    public static void m48376a(PasswordStepView passwordStepView, InputMethodManager inputMethodManager) {
        passwordStepView.f43244b = inputMethodManager;
    }
}
