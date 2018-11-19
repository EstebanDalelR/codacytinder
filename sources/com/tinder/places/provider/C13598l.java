package com.tinder.places.provider;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.provider.l */
public final class C13598l implements Factory<C10275k> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f43347a;

    public /* synthetic */ Object get() {
        return m53058a();
    }

    public C13598l(Provider<SharedPreferences> provider) {
        this.f43347a = provider;
    }

    /* renamed from: a */
    public C10275k m53058a() {
        return C13598l.m53056a(this.f43347a);
    }

    /* renamed from: a */
    public static C10275k m53056a(Provider<SharedPreferences> provider) {
        return new C10275k((SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C13598l m53057b(Provider<SharedPreferences> provider) {
        return new C13598l(provider);
    }
}
