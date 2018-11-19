package com.tinder.data;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.b */
public final class C12843b implements Factory<SharedPreferences> {
    /* renamed from: a */
    private final Provider<Application> f41279a;

    public /* synthetic */ Object get() {
        return m50442a();
    }

    public C12843b(Provider<Application> provider) {
        this.f41279a = provider;
    }

    /* renamed from: a */
    public SharedPreferences m50442a() {
        return C12843b.m50440a(this.f41279a);
    }

    /* renamed from: a */
    public static SharedPreferences m50440a(Provider<Application> provider) {
        return C12843b.m50439a((Application) provider.get());
    }

    /* renamed from: b */
    public static C12843b m50441b(Provider<Application> provider) {
        return new C12843b(provider);
    }

    /* renamed from: a */
    public static SharedPreferences m50439a(Application application) {
        return (SharedPreferences) C15521i.a(C8611a.m36735a(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
