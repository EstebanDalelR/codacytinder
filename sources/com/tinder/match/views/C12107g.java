package com.tinder.match.views;

import com.tinder.chat.activity.C8406b;
import com.tinder.match.presenter.C9868e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.match.views.g */
public final class C12107g implements MembersInjector<MatchMessagesRowView> {
    /* renamed from: a */
    private final Provider<C9868e> f39277a;
    /* renamed from: b */
    private final Provider<C8406b> f39278b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48241a((MatchMessagesRowView) obj);
    }

    /* renamed from: a */
    public void m48241a(MatchMessagesRowView matchMessagesRowView) {
        C12107g.m48240a(matchMessagesRowView, (C9868e) this.f39277a.get());
        C12107g.m48239a(matchMessagesRowView, (C8406b) this.f39278b.get());
    }

    /* renamed from: a */
    public static void m48240a(MatchMessagesRowView matchMessagesRowView, C9868e c9868e) {
        matchMessagesRowView.f39261a = c9868e;
    }

    /* renamed from: a */
    public static void m48239a(MatchMessagesRowView matchMessagesRowView, C8406b c8406b) {
        matchMessagesRowView.f39262b = c8406b;
    }
}
