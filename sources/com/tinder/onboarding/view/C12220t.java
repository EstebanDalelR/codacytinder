package com.tinder.onboarding.view;

import android.view.inputmethod.InputMethodManager;
import com.tinder.onboarding.presenter.gm;
import com.tinder.utils.C15377z;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.view.t */
public final class C12220t implements MembersInjector<PhotosStepView> {
    /* renamed from: a */
    private final Provider<gm> f39577a;
    /* renamed from: b */
    private final Provider<C15377z> f39578b;
    /* renamed from: c */
    private final Provider<InputMethodManager> f39579c;

    public /* synthetic */ void injectMembers(Object obj) {
        m48382a((PhotosStepView) obj);
    }

    /* renamed from: a */
    public void m48382a(PhotosStepView photosStepView) {
        C12220t.m48380a(photosStepView, (gm) this.f39577a.get());
        C12220t.m48381a(photosStepView, (C15377z) this.f39578b.get());
        C12220t.m48379a(photosStepView, (InputMethodManager) this.f39579c.get());
    }

    /* renamed from: a */
    public static void m48380a(PhotosStepView photosStepView, gm gmVar) {
        photosStepView.f43245a = gmVar;
    }

    /* renamed from: a */
    public static void m48381a(PhotosStepView photosStepView, C15377z c15377z) {
        photosStepView.f43246b = c15377z;
    }

    /* renamed from: a */
    public static void m48379a(PhotosStepView photosStepView, InputMethodManager inputMethodManager) {
        photosStepView.f43247c = inputMethodManager;
    }
}
