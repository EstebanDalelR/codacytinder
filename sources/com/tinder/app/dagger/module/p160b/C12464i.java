package com.tinder.app.dagger.module.p160b;

import android.content.SharedPreferences;
import com.tinder.fireboarding.domain.FireboardingEnabledRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.i */
public final class C12464i implements Factory<FireboardingEnabledRepository> {
    /* renamed from: a */
    private final C8245a f40208a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f40209b;

    public /* synthetic */ Object get() {
        return m49031a();
    }

    public C12464i(C8245a c8245a, Provider<SharedPreferences> provider) {
        this.f40208a = c8245a;
        this.f40209b = provider;
    }

    /* renamed from: a */
    public FireboardingEnabledRepository m49031a() {
        return C12464i.m49029a(this.f40208a, this.f40209b);
    }

    /* renamed from: a */
    public static FireboardingEnabledRepository m49029a(C8245a c8245a, Provider<SharedPreferences> provider) {
        return C12464i.m49028a(c8245a, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12464i m49030b(C8245a c8245a, Provider<SharedPreferences> provider) {
        return new C12464i(c8245a, provider);
    }

    /* renamed from: a */
    public static FireboardingEnabledRepository m49028a(C8245a c8245a, SharedPreferences sharedPreferences) {
        return (FireboardingEnabledRepository) C15521i.a(c8245a.m35160a(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
