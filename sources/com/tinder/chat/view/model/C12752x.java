package com.tinder.chat.view.model;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.feed.p341b.C11695a;
import com.tinder.p204d.p205a.C8609a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.model.x */
public final class C12752x implements Factory<C8502w> {
    /* renamed from: a */
    private final Provider<AbTestUtility> f41126a;
    /* renamed from: b */
    private final Provider<C11695a> f41127b;
    /* renamed from: c */
    private final Provider<C8609a> f41128c;

    public /* synthetic */ Object get() {
        return m50187a();
    }

    public C12752x(Provider<AbTestUtility> provider, Provider<C11695a> provider2, Provider<C8609a> provider3) {
        this.f41126a = provider;
        this.f41127b = provider2;
        this.f41128c = provider3;
    }

    /* renamed from: a */
    public C8502w m50187a() {
        return C12752x.m50185a(this.f41126a, this.f41127b, this.f41128c);
    }

    /* renamed from: a */
    public static C8502w m50185a(Provider<AbTestUtility> provider, Provider<C11695a> provider2, Provider<C8609a> provider3) {
        return new C8502w((AbTestUtility) provider.get(), (C11695a) provider2.get(), (C8609a) provider3.get());
    }

    /* renamed from: b */
    public static C12752x m50186b(Provider<AbTestUtility> provider, Provider<C11695a> provider2, Provider<C8609a> provider3) {
        return new C12752x(provider, provider2, provider3);
    }
}
