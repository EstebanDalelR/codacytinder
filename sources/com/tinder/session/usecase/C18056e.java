package com.tinder.session.usecase;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.domain.profile.usecase.SyncProfileData;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.session.usecase.e */
public final class C18056e implements Factory<C14837d> {
    /* renamed from: a */
    private final Provider<AppVisibilityTracker> f56070a;
    /* renamed from: b */
    private final Provider<SyncProfileData> f56071b;
    /* renamed from: c */
    private final Provider<AbTestUtility> f56072c;
    /* renamed from: d */
    private final Provider<AuthStatusRepository> f56073d;

    public /* synthetic */ Object get() {
        return m65544a();
    }

    public C18056e(Provider<AppVisibilityTracker> provider, Provider<SyncProfileData> provider2, Provider<AbTestUtility> provider3, Provider<AuthStatusRepository> provider4) {
        this.f56070a = provider;
        this.f56071b = provider2;
        this.f56072c = provider3;
        this.f56073d = provider4;
    }

    /* renamed from: a */
    public C14837d m65544a() {
        return C18056e.m65542a(this.f56070a, this.f56071b, this.f56072c, this.f56073d);
    }

    /* renamed from: a */
    public static C14837d m65542a(Provider<AppVisibilityTracker> provider, Provider<SyncProfileData> provider2, Provider<AbTestUtility> provider3, Provider<AuthStatusRepository> provider4) {
        return new C14837d((AppVisibilityTracker) provider.get(), (SyncProfileData) provider2.get(), (AbTestUtility) provider3.get(), (AuthStatusRepository) provider4.get());
    }

    /* renamed from: b */
    public static C18056e m65543b(Provider<AppVisibilityTracker> provider, Provider<SyncProfileData> provider2, Provider<AbTestUtility> provider3, Provider<AuthStatusRepository> provider4) {
        return new C18056e(provider, provider2, provider3, provider4);
    }
}
