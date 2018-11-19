package com.tinder.feed.view.provider;

import com.tinder.domain.feed.usecase.ObserveFeed;
import com.tinder.domain.meta.usecase.ObserveCurrentUser;
import com.tinder.feed.p249d.C9463c;
import com.tinder.feed.p341b.C11695a;
import com.tinder.p204d.p205a.C8609a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.provider.f */
public final class C13296f implements Factory<C9545e> {
    /* renamed from: a */
    private final Provider<ObserveFeed> f42148a;
    /* renamed from: b */
    private final Provider<ObserveCurrentUser> f42149b;
    /* renamed from: c */
    private final Provider<C9543c> f42150c;
    /* renamed from: d */
    private final Provider<C9463c> f42151d;
    /* renamed from: e */
    private final Provider<C8609a> f42152e;
    /* renamed from: f */
    private final Provider<C11695a> f42153f;

    public /* synthetic */ Object get() {
        return m51452a();
    }

    public C13296f(Provider<ObserveFeed> provider, Provider<ObserveCurrentUser> provider2, Provider<C9543c> provider3, Provider<C9463c> provider4, Provider<C8609a> provider5, Provider<C11695a> provider6) {
        this.f42148a = provider;
        this.f42149b = provider2;
        this.f42150c = provider3;
        this.f42151d = provider4;
        this.f42152e = provider5;
        this.f42153f = provider6;
    }

    /* renamed from: a */
    public C9545e m51452a() {
        return C13296f.m51450a(this.f42148a, this.f42149b, this.f42150c, this.f42151d, this.f42152e, this.f42153f);
    }

    /* renamed from: a */
    public static C9545e m51450a(Provider<ObserveFeed> provider, Provider<ObserveCurrentUser> provider2, Provider<C9543c> provider3, Provider<C9463c> provider4, Provider<C8609a> provider5, Provider<C11695a> provider6) {
        return new C9545e((ObserveFeed) provider.get(), (ObserveCurrentUser) provider2.get(), (C9543c) provider3.get(), (C9463c) provider4.get(), (C8609a) provider5.get(), (C11695a) provider6.get());
    }

    /* renamed from: b */
    public static C13296f m51451b(Provider<ObserveFeed> provider, Provider<ObserveCurrentUser> provider2, Provider<C9543c> provider3, Provider<C9463c> provider4, Provider<C8609a> provider5, Provider<C11695a> provider6) {
        return new C13296f(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
