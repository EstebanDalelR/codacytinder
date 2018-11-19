package com.tinder.module;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ci implements Factory<SharedPreferences> {
    /* renamed from: a */
    private final bs f42862a;
    /* renamed from: b */
    private final Provider<Application> f42863b;

    public /* synthetic */ Object get() {
        return m52264a();
    }

    public ci(bs bsVar, Provider<Application> provider) {
        this.f42862a = bsVar;
        this.f42863b = provider;
    }

    /* renamed from: a */
    public SharedPreferences m52264a() {
        return m52262a(this.f42862a, this.f42863b);
    }

    /* renamed from: a */
    public static SharedPreferences m52262a(bs bsVar, Provider<Application> provider) {
        return m52261a(bsVar, (Application) provider.get());
    }

    /* renamed from: b */
    public static ci m52263b(bs bsVar, Provider<Application> provider) {
        return new ci(bsVar, provider);
    }

    /* renamed from: a */
    public static SharedPreferences m52261a(bs bsVar, Application application) {
        return (SharedPreferences) C15521i.a(bsVar.m40798a(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
