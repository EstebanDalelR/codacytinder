package com.tinder.profile.view;

import com.tinder.profile.presenter.C14424c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.a */
public final class C16156a implements MembersInjector<BasicInfoShareRecView> {
    /* renamed from: a */
    private final Provider<C14424c> f50314a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61055a((BasicInfoShareRecView) obj);
    }

    /* renamed from: a */
    public void m61055a(BasicInfoShareRecView basicInfoShareRecView) {
        C16156a.m61054a(basicInfoShareRecView, (C14424c) this.f50314a.get());
    }

    /* renamed from: a */
    public static void m61054a(BasicInfoShareRecView basicInfoShareRecView, C14424c c14424c) {
        basicInfoShareRecView.f50198a = c14424c;
    }
}
