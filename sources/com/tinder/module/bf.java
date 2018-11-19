package com.tinder.module;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.tinder.common.C8540g;
import com.tinder.common.CrashReporter;
import com.tinder.data.user.CurrentUserProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bf implements Factory<CrashReporter> {
    /* renamed from: a */
    private final be f42802a;
    /* renamed from: b */
    private final Provider<C8540g> f42803b;
    /* renamed from: c */
    private final Provider<CrashlyticsCore> f42804c;
    /* renamed from: d */
    private final Provider<Beta> f42805d;
    /* renamed from: e */
    private final Provider<Answers> f42806e;
    /* renamed from: f */
    private final Provider<CurrentUserProvider> f42807f;

    public /* synthetic */ Object get() {
        return m52162a();
    }

    public bf(be beVar, Provider<C8540g> provider, Provider<CrashlyticsCore> provider2, Provider<Beta> provider3, Provider<Answers> provider4, Provider<CurrentUserProvider> provider5) {
        this.f42802a = beVar;
        this.f42803b = provider;
        this.f42804c = provider2;
        this.f42805d = provider3;
        this.f42806e = provider4;
        this.f42807f = provider5;
    }

    /* renamed from: a */
    public CrashReporter m52162a() {
        return m52160a(this.f42802a, this.f42803b, this.f42804c, this.f42805d, this.f42806e, this.f42807f);
    }

    /* renamed from: a */
    public static CrashReporter m52160a(be beVar, Provider<C8540g> provider, Provider<CrashlyticsCore> provider2, Provider<Beta> provider3, Provider<Answers> provider4, Provider<CurrentUserProvider> provider5) {
        return m52159a(beVar, (C8540g) provider.get(), (CrashlyticsCore) provider2.get(), (Beta) provider3.get(), (Answers) provider4.get(), (CurrentUserProvider) provider5.get());
    }

    /* renamed from: b */
    public static bf m52161b(be beVar, Provider<C8540g> provider, Provider<CrashlyticsCore> provider2, Provider<Beta> provider3, Provider<Answers> provider4, Provider<CurrentUserProvider> provider5) {
        return new bf(beVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static CrashReporter m52159a(be beVar, C8540g c8540g, CrashlyticsCore crashlyticsCore, Beta beta, Answers answers, CurrentUserProvider currentUserProvider) {
        return (CrashReporter) C15521i.a(beVar.m40789a(c8540g, crashlyticsCore, beta, answers, currentUserProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
