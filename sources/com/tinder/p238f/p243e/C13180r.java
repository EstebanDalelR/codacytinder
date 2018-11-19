package com.tinder.p238f.p243e;

import com.tinder.common.logger.Logger;
import com.tinder.p238f.p239a.C9363a;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.r */
public final class C13180r implements Factory<C11611q> {
    /* renamed from: a */
    private final Provider<C9363a> f41868a;
    /* renamed from: b */
    private final Provider<C2664c> f41869b;
    /* renamed from: c */
    private final Provider<Logger> f41870c;

    public /* synthetic */ Object get() {
        return m51124a();
    }

    public C13180r(Provider<C9363a> provider, Provider<C2664c> provider2, Provider<Logger> provider3) {
        this.f41868a = provider;
        this.f41869b = provider2;
        this.f41870c = provider3;
    }

    /* renamed from: a */
    public C11611q m51124a() {
        return C13180r.m51122a(this.f41868a, this.f41869b, this.f41870c);
    }

    /* renamed from: a */
    public static C11611q m51122a(Provider<C9363a> provider, Provider<C2664c> provider2, Provider<Logger> provider3) {
        return new C11611q((C9363a) provider.get(), (C2664c) provider2.get(), (Logger) provider3.get());
    }

    /* renamed from: b */
    public static C13180r m51123b(Provider<C9363a> provider, Provider<C2664c> provider2, Provider<Logger> provider3) {
        return new C13180r(provider, provider2, provider3);
    }
}
