package com.tinder.data.loops.p223a;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.loops.a.c */
public final class C12908c implements Factory<SharedPreferences> {
    /* renamed from: a */
    private final C8671a f41375a;
    /* renamed from: b */
    private final Provider<Application> f41376b;

    public /* synthetic */ Object get() {
        return m50589a();
    }

    public C12908c(C8671a c8671a, Provider<Application> provider) {
        this.f41375a = c8671a;
        this.f41376b = provider;
    }

    /* renamed from: a */
    public SharedPreferences m50589a() {
        return C12908c.m50587a(this.f41375a, this.f41376b);
    }

    /* renamed from: a */
    public static SharedPreferences m50587a(C8671a c8671a, Provider<Application> provider) {
        return C12908c.m50586a(c8671a, (Application) provider.get());
    }

    /* renamed from: b */
    public static C12908c m50588b(C8671a c8671a, Provider<Application> provider) {
        return new C12908c(c8671a, provider);
    }

    /* renamed from: a */
    public static SharedPreferences m50586a(C8671a c8671a, Application application) {
        return (SharedPreferences) C15521i.a(c8671a.m36943a(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
