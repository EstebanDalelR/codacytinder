package com.tinder.data.fastmatch;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.fastmatch.c */
public final class C12865c implements Factory<C8649b> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f41313a;

    public /* synthetic */ Object get() {
        return m50505a();
    }

    public C12865c(Provider<SharedPreferences> provider) {
        this.f41313a = provider;
    }

    /* renamed from: a */
    public C8649b m50505a() {
        return C12865c.m50503a(this.f41313a);
    }

    /* renamed from: a */
    public static C8649b m50503a(Provider<SharedPreferences> provider) {
        return new C8649b((SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12865c m50504b(Provider<SharedPreferences> provider) {
        return new C12865c(provider);
    }
}
