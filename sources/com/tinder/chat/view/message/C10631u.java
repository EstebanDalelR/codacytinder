package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10589p;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.u */
public final class C10631u implements MembersInjector<InboundGifMessageView> {
    /* renamed from: a */
    private final Provider<C10589p> f34826a;
    /* renamed from: b */
    private final Provider<C8490z> f34827b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42885a((InboundGifMessageView) obj);
    }

    /* renamed from: a */
    public void m42885a(InboundGifMessageView inboundGifMessageView) {
        C10631u.m42883a(inboundGifMessageView, (C10589p) this.f34826a.get());
        C10631u.m42884a(inboundGifMessageView, (C8490z) this.f34827b.get());
    }

    /* renamed from: a */
    public static void m42883a(InboundGifMessageView inboundGifMessageView, C10589p c10589p) {
        inboundGifMessageView.f34449a = c10589p;
    }

    /* renamed from: a */
    public static void m42884a(InboundGifMessageView inboundGifMessageView, C8490z c8490z) {
        inboundGifMessageView.f34450b = c8490z;
    }
}
