package com.tinder.match.views;

import com.tinder.feed.p341b.C11695a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.match.views.e */
public final class C12106e implements MembersInjector<MatchMainView> {
    /* renamed from: a */
    private final Provider<C11695a> f39276a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48238a((MatchMainView) obj);
    }

    /* renamed from: a */
    public void m48238a(MatchMainView matchMainView) {
        C12106e.m48237a(matchMainView, (C11695a) this.f39276a.get());
    }

    /* renamed from: a */
    public static void m48237a(MatchMainView matchMainView, C11695a c11695a) {
        matchMainView.f32732a = c11695a;
    }
}
