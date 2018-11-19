package com.tinder.data.p206a.p207a;

import android.content.SharedPreferences;
import com.tinder.domain.apprating.AppRatingRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.a.a.b */
public final class C12825b implements Factory<AppRatingRepository> {
    /* renamed from: a */
    private final C8610a f41239a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f41240b;

    public /* synthetic */ Object get() {
        return m50361a();
    }

    public C12825b(C8610a c8610a, Provider<SharedPreferences> provider) {
        this.f41239a = c8610a;
        this.f41240b = provider;
    }

    /* renamed from: a */
    public AppRatingRepository m50361a() {
        return C12825b.m50359a(this.f41239a, this.f41240b);
    }

    /* renamed from: a */
    public static AppRatingRepository m50359a(C8610a c8610a, Provider<SharedPreferences> provider) {
        return C12825b.m50358a(c8610a, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12825b m50360b(C8610a c8610a, Provider<SharedPreferences> provider) {
        return new C12825b(c8610a, provider);
    }

    /* renamed from: a */
    public static AppRatingRepository m50358a(C8610a c8610a, SharedPreferences sharedPreferences) {
        return (AppRatingRepository) C15521i.a(c8610a.m36734a(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
