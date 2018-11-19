package com.tinder.p204d.p205a;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.feed.p341b.C11695a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.d.a.b */
public final class C12824b implements Factory<C8609a> {
    /* renamed from: a */
    private final Provider<AbTestUtility> f41237a;
    /* renamed from: b */
    private final Provider<C11695a> f41238b;

    public /* synthetic */ Object get() {
        return m50357a();
    }

    public C12824b(Provider<AbTestUtility> provider, Provider<C11695a> provider2) {
        this.f41237a = provider;
        this.f41238b = provider2;
    }

    /* renamed from: a */
    public C8609a m50357a() {
        return C12824b.m50355a(this.f41237a, this.f41238b);
    }

    /* renamed from: a */
    public static C8609a m50355a(Provider<AbTestUtility> provider, Provider<C11695a> provider2) {
        return new C8609a((AbTestUtility) provider.get(), (C11695a) provider2.get());
    }

    /* renamed from: b */
    public static C12824b m50356b(Provider<AbTestUtility> provider, Provider<C11695a> provider2) {
        return new C12824b(provider, provider2);
    }
}
