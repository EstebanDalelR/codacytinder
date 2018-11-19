package com.tinder.chat.view.message;

import com.tinder.chat.view.action.ah;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class bd implements MembersInjector<OutboundImageMessageView> {
    /* renamed from: a */
    private final Provider<ah> f34656a;
    /* renamed from: b */
    private final Provider<C8490z> f34657b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42808a((OutboundImageMessageView) obj);
    }

    /* renamed from: a */
    public void m42808a(OutboundImageMessageView outboundImageMessageView) {
        m42806a(outboundImageMessageView, (ah) this.f34656a.get());
        m42807a(outboundImageMessageView, (C8490z) this.f34657b.get());
    }

    /* renamed from: a */
    public static void m42806a(OutboundImageMessageView outboundImageMessageView, ah ahVar) {
        outboundImageMessageView.f34469a = ahVar;
    }

    /* renamed from: a */
    public static void m42807a(OutboundImageMessageView outboundImageMessageView, C8490z c8490z) {
        outboundImageMessageView.f34470b = c8490z;
    }
}
