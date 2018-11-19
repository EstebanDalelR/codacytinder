package com.tinder.feed.p341b;

import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.b.b */
public final class C13252b implements Factory<C11695a> {
    /* renamed from: a */
    private final Provider<AbTestUtility> f41990a;

    public /* synthetic */ Object get() {
        return m51270a();
    }

    public C13252b(Provider<AbTestUtility> provider) {
        this.f41990a = provider;
    }

    /* renamed from: a */
    public C11695a m51270a() {
        return C13252b.m51268a(this.f41990a);
    }

    /* renamed from: a */
    public static C11695a m51268a(Provider<AbTestUtility> provider) {
        return new C11695a((AbTestUtility) provider.get());
    }

    /* renamed from: b */
    public static C13252b m51269b(Provider<AbTestUtility> provider) {
        return new C13252b(provider);
    }
}
