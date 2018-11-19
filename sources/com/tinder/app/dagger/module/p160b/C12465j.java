package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11800b;
import com.tinder.fireboarding.domain.C11806k;
import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.C9567m;
import com.tinder.fireboarding.domain.FireboardingGame;
import com.tinder.fireboarding.domain.FireboardingGame.GameListener;
import com.tinder.purchase.usecase.C16248i;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.j */
public final class C12465j implements Factory<FireboardingGame> {
    /* renamed from: a */
    private final C8245a f40210a;
    /* renamed from: b */
    private final Provider<C11811o> f40211b;
    /* renamed from: c */
    private final Provider<SwipeCountRepository> f40212c;
    /* renamed from: d */
    private final Provider<C11806k> f40213d;
    /* renamed from: e */
    private final Provider<C9567m> f40214e;
    /* renamed from: f */
    private final Provider<Set<GameListener>> f40215f;
    /* renamed from: g */
    private final Provider<C11800b> f40216g;
    /* renamed from: h */
    private final Provider<C16248i> f40217h;
    /* renamed from: i */
    private final Provider<C11809n> f40218i;

    public /* synthetic */ Object get() {
        return m49035a();
    }

    public C12465j(C8245a c8245a, Provider<C11811o> provider, Provider<SwipeCountRepository> provider2, Provider<C11806k> provider3, Provider<C9567m> provider4, Provider<Set<GameListener>> provider5, Provider<C11800b> provider6, Provider<C16248i> provider7, Provider<C11809n> provider8) {
        this.f40210a = c8245a;
        this.f40211b = provider;
        this.f40212c = provider2;
        this.f40213d = provider3;
        this.f40214e = provider4;
        this.f40215f = provider5;
        this.f40216g = provider6;
        this.f40217h = provider7;
        this.f40218i = provider8;
    }

    /* renamed from: a */
    public FireboardingGame m49035a() {
        return C12465j.m49033a(this.f40210a, this.f40211b, this.f40212c, this.f40213d, this.f40214e, this.f40215f, this.f40216g, this.f40217h, this.f40218i);
    }

    /* renamed from: a */
    public static FireboardingGame m49033a(C8245a c8245a, Provider<C11811o> provider, Provider<SwipeCountRepository> provider2, Provider<C11806k> provider3, Provider<C9567m> provider4, Provider<Set<GameListener>> provider5, Provider<C11800b> provider6, Provider<C16248i> provider7, Provider<C11809n> provider8) {
        return C12465j.m49032a(c8245a, (C11811o) provider.get(), (SwipeCountRepository) provider2.get(), (C11806k) provider3.get(), (C9567m) provider4.get(), (Set) provider5.get(), (C11800b) provider6.get(), (C16248i) provider7.get(), (C11809n) provider8.get());
    }

    /* renamed from: b */
    public static C12465j m49034b(C8245a c8245a, Provider<C11811o> provider, Provider<SwipeCountRepository> provider2, Provider<C11806k> provider3, Provider<C9567m> provider4, Provider<Set<GameListener>> provider5, Provider<C11800b> provider6, Provider<C16248i> provider7, Provider<C11809n> provider8) {
        return new C12465j(c8245a, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: a */
    public static FireboardingGame m49032a(C8245a c8245a, C11811o c11811o, SwipeCountRepository swipeCountRepository, C11806k c11806k, C9567m c9567m, Set<GameListener> set, C11800b c11800b, C16248i c16248i, C11809n c11809n) {
        return (FireboardingGame) C15521i.a(c8245a.m35164a(c11811o, swipeCountRepository, c11806k, c9567m, set, c11800b, c16248i, c11809n), "Cannot return null from a non-@Nullable @Provides method");
    }
}
