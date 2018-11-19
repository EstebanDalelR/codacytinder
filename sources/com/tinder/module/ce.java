package com.tinder.module;

import android.content.SharedPreferences;
import com.tinder.data.user.CurrentUserIdProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ce implements Factory<CurrentUserIdProvider> {
    /* renamed from: a */
    private final bs f42855a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f42856b;

    public /* synthetic */ Object get() {
        return m52248a();
    }

    public ce(bs bsVar, Provider<SharedPreferences> provider) {
        this.f42855a = bsVar;
        this.f42856b = provider;
    }

    /* renamed from: a */
    public CurrentUserIdProvider m52248a() {
        return m52246a(this.f42855a, this.f42856b);
    }

    /* renamed from: a */
    public static CurrentUserIdProvider m52246a(bs bsVar, Provider<SharedPreferences> provider) {
        return m52245a(bsVar, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static ce m52247b(bs bsVar, Provider<SharedPreferences> provider) {
        return new ce(bsVar, provider);
    }

    /* renamed from: a */
    public static CurrentUserIdProvider m52245a(bs bsVar, SharedPreferences sharedPreferences) {
        return (CurrentUserIdProvider) C15521i.a(bsVar.m40831c(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
