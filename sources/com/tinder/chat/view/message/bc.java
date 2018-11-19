package com.tinder.chat.view.message;

import com.tinder.chat.view.action.ag;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class bc implements MembersInjector<OutboundGifMessageView> {
    /* renamed from: a */
    private final Provider<ag> f34654a;
    /* renamed from: b */
    private final Provider<C8490z> f34655b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42805a((OutboundGifMessageView) obj);
    }

    /* renamed from: a */
    public void m42805a(OutboundGifMessageView outboundGifMessageView) {
        m42803a(outboundGifMessageView, (ag) this.f34654a.get());
        m42804a(outboundGifMessageView, (C8490z) this.f34655b.get());
    }

    /* renamed from: a */
    public static void m42803a(OutboundGifMessageView outboundGifMessageView, ag agVar) {
        outboundGifMessageView.f34466a = agVar;
    }

    /* renamed from: a */
    public static void m42804a(OutboundGifMessageView outboundGifMessageView, C8490z c8490z) {
        outboundGifMessageView.f34467b = c8490z;
    }
}
