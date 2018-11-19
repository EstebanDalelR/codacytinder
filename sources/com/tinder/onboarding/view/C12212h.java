package com.tinder.onboarding.view;

import android.view.inputmethod.InputMethodManager;
import com.tinder.onboarding.presenter.by;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.view.h */
public final class C12212h implements MembersInjector<GenderStepView> {
    /* renamed from: a */
    private final Provider<InputMethodManager> f39566a;
    /* renamed from: b */
    private final Provider<by> f39567b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48370a((GenderStepView) obj);
    }

    /* renamed from: a */
    public void m48370a(GenderStepView genderStepView) {
        C12212h.m48368a(genderStepView, (InputMethodManager) this.f39566a.get());
        C12212h.m48369a(genderStepView, (by) this.f39567b.get());
    }

    /* renamed from: a */
    public static void m48368a(GenderStepView genderStepView, InputMethodManager inputMethodManager) {
        genderStepView.f43238a = inputMethodManager;
    }

    /* renamed from: a */
    public static void m48369a(GenderStepView genderStepView, by byVar) {
        genderStepView.f43239b = byVar;
    }
}
