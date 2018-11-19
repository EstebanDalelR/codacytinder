package com.tinder.intropricing.p263a;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.intropricing.a.b */
public final class C13347b implements Factory<C9727a> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f42346a;

    public /* synthetic */ Object get() {
        return m51642a();
    }

    public C13347b(Provider<SharedPreferences> provider) {
        this.f42346a = provider;
    }

    /* renamed from: a */
    public C9727a m51642a() {
        return C13347b.m51640a(this.f42346a);
    }

    /* renamed from: a */
    public static C9727a m51640a(Provider<SharedPreferences> provider) {
        return new C9727a((SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C13347b m51641b(Provider<SharedPreferences> provider) {
        return new C13347b(provider);
    }
}
