package com.tinder.app.dagger.module.main;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ae implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private final Provider<CheckTutorialViewed> f40301a;
    /* renamed from: b */
    private final Provider<ConfirmTutorialsViewed> f40302b;
    /* renamed from: c */
    private final Provider<AppVisibilityTracker> f40303c;
    /* renamed from: d */
    private final Provider<AbTestUtility> f40304d;

    public /* synthetic */ Object get() {
        return m49193a();
    }

    public ae(Provider<CheckTutorialViewed> provider, Provider<ConfirmTutorialsViewed> provider2, Provider<AppVisibilityTracker> provider3, Provider<AbTestUtility> provider4) {
        this.f40301a = provider;
        this.f40302b = provider2;
        this.f40303c = provider3;
        this.f40304d = provider4;
    }

    /* renamed from: a */
    public OnPageSelectedListener m49193a() {
        return m49191a(this.f40301a, this.f40302b, this.f40303c, this.f40304d);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49191a(Provider<CheckTutorialViewed> provider, Provider<ConfirmTutorialsViewed> provider2, Provider<AppVisibilityTracker> provider3, Provider<AbTestUtility> provider4) {
        return m49190a((CheckTutorialViewed) provider.get(), (ConfirmTutorialsViewed) provider2.get(), (AppVisibilityTracker) provider3.get(), (AbTestUtility) provider4.get());
    }

    /* renamed from: b */
    public static ae m49192b(Provider<CheckTutorialViewed> provider, Provider<ConfirmTutorialsViewed> provider2, Provider<AppVisibilityTracker> provider3, Provider<AbTestUtility> provider4) {
        return new ae(provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49190a(CheckTutorialViewed checkTutorialViewed, ConfirmTutorialsViewed confirmTutorialsViewed, AppVisibilityTracker appVisibilityTracker, AbTestUtility abTestUtility) {
        return (OnPageSelectedListener) C15521i.a(MainViewModule.a(checkTutorialViewed, confirmTutorialsViewed, appVisibilityTracker, abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
