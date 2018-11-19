package com.tinder.messageads.p297d;

import android.content.SharedPreferences;
import com.tinder.messageads.repository.MessageAdSettingsRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.messageads.d.b */
public final class C13473b implements Factory<MessageAdSettingsRepository> {
    /* renamed from: a */
    private final C9907a f42734a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f42735b;

    public /* synthetic */ Object get() {
        return m52036a();
    }

    public C13473b(C9907a c9907a, Provider<SharedPreferences> provider) {
        this.f42734a = c9907a;
        this.f42735b = provider;
    }

    /* renamed from: a */
    public MessageAdSettingsRepository m52036a() {
        return C13473b.m52034a(this.f42734a, this.f42735b);
    }

    /* renamed from: a */
    public static MessageAdSettingsRepository m52034a(C9907a c9907a, Provider<SharedPreferences> provider) {
        return C13473b.m52033a(c9907a, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C13473b m52035b(C9907a c9907a, Provider<SharedPreferences> provider) {
        return new C13473b(c9907a, provider);
    }

    /* renamed from: a */
    public static MessageAdSettingsRepository m52033a(C9907a c9907a, SharedPreferences sharedPreferences) {
        return (MessageAdSettingsRepository) C15521i.a(c9907a.m40721a(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
