package com.tinder.data.p206a.p207a;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.a.a.c */
public final class C12826c implements Factory<SharedPreferences> {
    /* renamed from: a */
    private final C8610a f41241a;
    /* renamed from: b */
    private final Provider<Application> f41242b;

    public /* synthetic */ Object get() {
        return m50365a();
    }

    public C12826c(C8610a c8610a, Provider<Application> provider) {
        this.f41241a = c8610a;
        this.f41242b = provider;
    }

    /* renamed from: a */
    public SharedPreferences m50365a() {
        return C12826c.m50363a(this.f41241a, this.f41242b);
    }

    /* renamed from: a */
    public static SharedPreferences m50363a(C8610a c8610a, Provider<Application> provider) {
        return C12826c.m50362a(c8610a, (Application) provider.get());
    }

    /* renamed from: b */
    public static C12826c m50364b(C8610a c8610a, Provider<Application> provider) {
        return new C12826c(c8610a, provider);
    }

    /* renamed from: a */
    public static SharedPreferences m50362a(C8610a c8610a, Application application) {
        return (SharedPreferences) C15521i.a(c8610a.m36733a(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
