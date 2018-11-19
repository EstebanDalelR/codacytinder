package com.tinder.match.p292c;

import com.tinder.match.provider.MatchesSearchQueryProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.match.c.i */
public final class C13422i implements Factory<MatchesSearchQueryProvider> {
    /* renamed from: a */
    private final C9851g f42571a;

    public /* synthetic */ Object get() {
        return m51891a();
    }

    public C13422i(C9851g c9851g) {
        this.f42571a = c9851g;
    }

    /* renamed from: a */
    public MatchesSearchQueryProvider m51891a() {
        return C13422i.m51888a(this.f42571a);
    }

    /* renamed from: a */
    public static MatchesSearchQueryProvider m51888a(C9851g c9851g) {
        return C13422i.m51890c(c9851g);
    }

    /* renamed from: b */
    public static C13422i m51889b(C9851g c9851g) {
        return new C13422i(c9851g);
    }

    /* renamed from: c */
    public static MatchesSearchQueryProvider m51890c(C9851g c9851g) {
        return (MatchesSearchQueryProvider) C15521i.a(c9851g.m40546a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
