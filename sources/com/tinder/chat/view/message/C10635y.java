package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10592s;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.y */
public final class C10635y implements MembersInjector<InboundTextMessageView> {
    /* renamed from: a */
    private final Provider<C10592s> f34842a;
    /* renamed from: b */
    private final Provider<C8490z> f34843b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42896a((InboundTextMessageView) obj);
    }

    /* renamed from: a */
    public void m42896a(InboundTextMessageView inboundTextMessageView) {
        C10635y.m42894a(inboundTextMessageView, (C10592s) this.f34842a.get());
        C10635y.m42895a(inboundTextMessageView, (C8490z) this.f34843b.get());
    }

    /* renamed from: a */
    public static void m42894a(InboundTextMessageView inboundTextMessageView, C10592s c10592s) {
        inboundTextMessageView.f34457a = c10592s;
    }

    /* renamed from: a */
    public static void m42895a(InboundTextMessageView inboundTextMessageView, C8490z c8490z) {
        inboundTextMessageView.f34458b = c8490z;
    }
}
