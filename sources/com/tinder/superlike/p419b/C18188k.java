package com.tinder.superlike.p419b;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.usecase.SyncProfileData;
import com.tinder.superlike.p421e.C15080a;
import com.tinder.superlike.p421e.C15081c;
import com.tinder.superlike.p421e.C15082f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.superlike.b.k */
public final class C18188k implements Factory<C15071e> {
    /* renamed from: a */
    private final Provider<C15082f> f56385a;
    /* renamed from: b */
    private final Provider<C15080a> f56386b;
    /* renamed from: c */
    private final Provider<C15081c> f56387c;
    /* renamed from: d */
    private final Provider<AbTestUtility> f56388d;
    /* renamed from: e */
    private final Provider<SyncProfileData> f56389e;

    public /* synthetic */ Object get() {
        return m65943a();
    }

    public C18188k(Provider<C15082f> provider, Provider<C15080a> provider2, Provider<C15081c> provider3, Provider<AbTestUtility> provider4, Provider<SyncProfileData> provider5) {
        this.f56385a = provider;
        this.f56386b = provider2;
        this.f56387c = provider3;
        this.f56388d = provider4;
        this.f56389e = provider5;
    }

    /* renamed from: a */
    public C15071e m65943a() {
        return C18188k.m65941a(this.f56385a, this.f56386b, this.f56387c, this.f56388d, this.f56389e);
    }

    /* renamed from: a */
    public static C15071e m65941a(Provider<C15082f> provider, Provider<C15080a> provider2, Provider<C15081c> provider3, Provider<AbTestUtility> provider4, Provider<SyncProfileData> provider5) {
        return new C15071e((C15082f) provider.get(), (C15080a) provider2.get(), (C15081c) provider3.get(), (AbTestUtility) provider4.get(), (SyncProfileData) provider5.get());
    }

    /* renamed from: b */
    public static C18188k m65942b(Provider<C15082f> provider, Provider<C15080a> provider2, Provider<C15081c> provider3, Provider<AbTestUtility> provider4, Provider<SyncProfileData> provider5) {
        return new C18188k(provider, provider2, provider3, provider4, provider5);
    }
}
