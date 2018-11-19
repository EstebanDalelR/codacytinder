package com.tinder.match.views;

import com.tinder.chat.activity.C8406b;
import com.tinder.match.presenter.C9874q;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.match.views.n */
public final class C12111n implements MembersInjector<NewMatchRowView> {
    /* renamed from: a */
    private final Provider<C9874q> f39287a;
    /* renamed from: b */
    private final Provider<C8406b> f39288b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48251a((NewMatchRowView) obj);
    }

    /* renamed from: a */
    public void m48251a(NewMatchRowView newMatchRowView) {
        C12111n.m48250a(newMatchRowView, (C9874q) this.f39287a.get());
        C12111n.m48249a(newMatchRowView, (C8406b) this.f39288b.get());
    }

    /* renamed from: a */
    public static void m48250a(NewMatchRowView newMatchRowView, C9874q c9874q) {
        newMatchRowView.f39267a = c9874q;
    }

    /* renamed from: a */
    public static void m48249a(NewMatchRowView newMatchRowView, C8406b c8406b) {
        newMatchRowView.f39268b = c8406b;
    }
}
