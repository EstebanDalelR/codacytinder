package com.tinder.chat.view.message;

import com.tinder.chat.view.action.aj;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class bg implements MembersInjector<OutboundTextMessageView> {
    /* renamed from: a */
    private final Provider<aj> f34674a;
    /* renamed from: b */
    private final Provider<C8490z> f34675b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42816a((OutboundTextMessageView) obj);
    }

    /* renamed from: a */
    public void m42816a(OutboundTextMessageView outboundTextMessageView) {
        m42814a(outboundTextMessageView, (aj) this.f34674a.get());
        m42815a(outboundTextMessageView, (C8490z) this.f34675b.get());
    }

    /* renamed from: a */
    public static void m42814a(OutboundTextMessageView outboundTextMessageView, aj ajVar) {
        outboundTextMessageView.f34474a = ajVar;
    }

    /* renamed from: a */
    public static void m42815a(OutboundTextMessageView outboundTextMessageView, C8490z c8490z) {
        outboundTextMessageView.f34475b = c8490z;
    }
}
