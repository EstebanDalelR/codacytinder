package com.tinder.chat.view.message;

import com.tinder.chat.presenter.aq;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class bi implements MembersInjector<bh> {
    /* renamed from: a */
    private final Provider<aq> f34680a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42819a((bh) obj);
    }

    /* renamed from: a */
    public void m42819a(bh bhVar) {
        m42818a(bhVar, (aq) this.f34680a.get());
    }

    /* renamed from: a */
    public static void m42818a(bh bhVar, aq aqVar) {
        bhVar.f34677b = aqVar;
    }
}
