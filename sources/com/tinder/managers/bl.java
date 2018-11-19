package com.tinder.managers;

import android.content.SharedPreferences;
import com.tinder.data.user.CurrentUserIdProvider;
import com.tinder.data.user.CurrentUserProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bl implements Factory<bk> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f42508a;
    /* renamed from: b */
    private final Provider<CurrentUserProvider> f42509b;
    /* renamed from: c */
    private final Provider<CurrentUserIdProvider> f42510c;

    public /* synthetic */ Object get() {
        return m51817a();
    }

    public bl(Provider<SharedPreferences> provider, Provider<CurrentUserProvider> provider2, Provider<CurrentUserIdProvider> provider3) {
        this.f42508a = provider;
        this.f42509b = provider2;
        this.f42510c = provider3;
    }

    /* renamed from: a */
    public bk m51817a() {
        return m51815a(this.f42508a, this.f42509b, this.f42510c);
    }

    /* renamed from: a */
    public static bk m51815a(Provider<SharedPreferences> provider, Provider<CurrentUserProvider> provider2, Provider<CurrentUserIdProvider> provider3) {
        return new bk((SharedPreferences) provider.get(), (CurrentUserProvider) provider2.get(), (CurrentUserIdProvider) provider3.get());
    }

    /* renamed from: b */
    public static bl m51816b(Provider<SharedPreferences> provider, Provider<CurrentUserProvider> provider2, Provider<CurrentUserIdProvider> provider3) {
        return new bl(provider, provider2, provider3);
    }
}
