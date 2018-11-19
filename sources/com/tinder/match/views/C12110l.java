package com.tinder.match.views;

import com.tinder.match.presenter.C9872m;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.match.views.l */
public final class C12110l implements MembersInjector<MatchesSearchView> {
    /* renamed from: a */
    private final Provider<C9872m> f39286a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48248a((MatchesSearchView) obj);
    }

    /* renamed from: a */
    public void m48248a(MatchesSearchView matchesSearchView) {
        C12110l.m48247a(matchesSearchView, (C9872m) this.f39286a.get());
    }

    /* renamed from: a */
    public static void m48247a(MatchesSearchView matchesSearchView, C9872m c9872m) {
        matchesSearchView.f39265a = c9872m;
    }
}
