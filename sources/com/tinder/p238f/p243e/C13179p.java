package com.tinder.p238f.p243e;

import com.tinder.common.logger.Logger;
import com.tinder.managers.bk;
import com.tinder.p088c.p089a.p090a.C3923a;
import com.tinder.tinderplus.C2657a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.p */
public final class C13179p implements Factory<C11610o> {
    /* renamed from: a */
    private final Provider<bk> f41864a;
    /* renamed from: b */
    private final Provider<C3923a> f41865b;
    /* renamed from: c */
    private final Provider<C2657a> f41866c;
    /* renamed from: d */
    private final Provider<Logger> f41867d;

    public /* synthetic */ Object get() {
        return m51121a();
    }

    public C13179p(Provider<bk> provider, Provider<C3923a> provider2, Provider<C2657a> provider3, Provider<Logger> provider4) {
        this.f41864a = provider;
        this.f41865b = provider2;
        this.f41866c = provider3;
        this.f41867d = provider4;
    }

    /* renamed from: a */
    public C11610o m51121a() {
        return C13179p.m51119a(this.f41864a, this.f41865b, this.f41866c, this.f41867d);
    }

    /* renamed from: a */
    public static C11610o m51119a(Provider<bk> provider, Provider<C3923a> provider2, Provider<C2657a> provider3, Provider<Logger> provider4) {
        return new C11610o((bk) provider.get(), (C3923a) provider2.get(), (C2657a) provider3.get(), (Logger) provider4.get());
    }

    /* renamed from: b */
    public static C13179p m51120b(Provider<bk> provider, Provider<C3923a> provider2, Provider<C2657a> provider3, Provider<Logger> provider4) {
        return new C13179p(provider, provider2, provider3, provider4);
    }
}
