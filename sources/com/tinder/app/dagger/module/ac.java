package com.tinder.app.dagger.module;

import com.tinder.recs.domain.repository.SwipeCountRepository;
import com.tinder.recs.domain.rule.SwipeCountSwipeTerminationRule;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ac implements Factory<SwipeCountSwipeTerminationRule> {
    /* renamed from: a */
    private final aa f40167a;
    /* renamed from: b */
    private final Provider<SwipeCountRepository> f40168b;

    public /* synthetic */ Object get() {
        return m48972a();
    }

    public ac(aa aaVar, Provider<SwipeCountRepository> provider) {
        this.f40167a = aaVar;
        this.f40168b = provider;
    }

    /* renamed from: a */
    public SwipeCountSwipeTerminationRule m48972a() {
        return m48970a(this.f40167a, this.f40168b);
    }

    /* renamed from: a */
    public static SwipeCountSwipeTerminationRule m48970a(aa aaVar, Provider<SwipeCountRepository> provider) {
        return m48969a(aaVar, (SwipeCountRepository) provider.get());
    }

    /* renamed from: b */
    public static ac m48971b(aa aaVar, Provider<SwipeCountRepository> provider) {
        return new ac(aaVar, provider);
    }

    /* renamed from: a */
    public static SwipeCountSwipeTerminationRule m48969a(aa aaVar, SwipeCountRepository swipeCountRepository) {
        return (SwipeCountSwipeTerminationRule) C15521i.a(aaVar.m35149a(swipeCountRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
