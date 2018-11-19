package com.tinder.app.dagger.module.main;

import com.tinder.common.logger.Logger;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.p234c.C8890a;
import com.tinder.places.provider.C10271c;
import com.tinder.places.provider.C12421h;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.w */
public final class C12522w implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private final Provider<C12421h> f40357a;
    /* renamed from: b */
    private final Provider<C8890a> f40358b;
    /* renamed from: c */
    private final Provider<C10271c> f40359c;
    /* renamed from: d */
    private final Provider<Logger> f40360d;

    public /* synthetic */ Object get() {
        return m49282a();
    }

    public C12522w(Provider<C12421h> provider, Provider<C8890a> provider2, Provider<C10271c> provider3, Provider<Logger> provider4) {
        this.f40357a = provider;
        this.f40358b = provider2;
        this.f40359c = provider3;
        this.f40360d = provider4;
    }

    /* renamed from: a */
    public OnPageSelectedListener m49282a() {
        return C12522w.m49280a(this.f40357a, this.f40358b, this.f40359c, this.f40360d);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49280a(Provider<C12421h> provider, Provider<C8890a> provider2, Provider<C10271c> provider3, Provider<Logger> provider4) {
        return C12522w.m49279a((C12421h) provider.get(), (C8890a) provider2.get(), (C10271c) provider3.get(), (Logger) provider4.get());
    }

    /* renamed from: b */
    public static C12522w m49281b(Provider<C12421h> provider, Provider<C8890a> provider2, Provider<C10271c> provider3, Provider<Logger> provider4) {
        return new C12522w(provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49279a(C12421h c12421h, C8890a c8890a, C10271c c10271c, Logger logger) {
        return (OnPageSelectedListener) C15521i.a(MainViewModule.a(c12421h, c8890a, c10271c, logger), "Cannot return null from a non-@Nullable @Provides method");
    }
}
