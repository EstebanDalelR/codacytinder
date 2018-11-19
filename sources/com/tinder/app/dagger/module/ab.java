package com.tinder.app.dagger.module;

import android.content.SharedPreferences;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ab implements Factory<SwipeCountRepository> {
    /* renamed from: a */
    private final aa f40165a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f40166b;

    public /* synthetic */ Object get() {
        return m48968a();
    }

    public ab(aa aaVar, Provider<SharedPreferences> provider) {
        this.f40165a = aaVar;
        this.f40166b = provider;
    }

    /* renamed from: a */
    public SwipeCountRepository m48968a() {
        return m48966a(this.f40165a, this.f40166b);
    }

    /* renamed from: a */
    public static SwipeCountRepository m48966a(aa aaVar, Provider<SharedPreferences> provider) {
        return m48965a(aaVar, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static ab m48967b(aa aaVar, Provider<SharedPreferences> provider) {
        return new ab(aaVar, provider);
    }

    /* renamed from: a */
    public static SwipeCountRepository m48965a(aa aaVar, SharedPreferences sharedPreferences) {
        return (SwipeCountRepository) C15521i.a(aaVar.m35148a(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
