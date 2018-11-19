package com.tinder.data.loops.p223a;

import android.content.SharedPreferences;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.loops.a.b */
public final class C12907b implements Factory<AutoPlayVideoSettingsRepository> {
    /* renamed from: a */
    private final C8671a f41373a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f41374b;

    public /* synthetic */ Object get() {
        return m50585a();
    }

    public C12907b(C8671a c8671a, Provider<SharedPreferences> provider) {
        this.f41373a = c8671a;
        this.f41374b = provider;
    }

    /* renamed from: a */
    public AutoPlayVideoSettingsRepository m50585a() {
        return C12907b.m50583a(this.f41373a, this.f41374b);
    }

    /* renamed from: a */
    public static AutoPlayVideoSettingsRepository m50583a(C8671a c8671a, Provider<SharedPreferences> provider) {
        return C12907b.m50582a(c8671a, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12907b m50584b(C8671a c8671a, Provider<SharedPreferences> provider) {
        return new C12907b(c8671a, provider);
    }

    /* renamed from: a */
    public static AutoPlayVideoSettingsRepository m50582a(C8671a c8671a, SharedPreferences sharedPreferences) {
        return (AutoPlayVideoSettingsRepository) C15521i.a(c8671a.m36944a(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
