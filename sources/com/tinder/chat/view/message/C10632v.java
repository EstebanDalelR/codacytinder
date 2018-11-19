package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10590q;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.v */
public final class C10632v implements MembersInjector<InboundImageMessageView> {
    /* renamed from: a */
    private final Provider<C10590q> f34828a;
    /* renamed from: b */
    private final Provider<C8490z> f34829b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42888a((InboundImageMessageView) obj);
    }

    /* renamed from: a */
    public void m42888a(InboundImageMessageView inboundImageMessageView) {
        C10632v.m42886a(inboundImageMessageView, (C10590q) this.f34828a.get());
        C10632v.m42887a(inboundImageMessageView, (C8490z) this.f34829b.get());
    }

    /* renamed from: a */
    public static void m42886a(InboundImageMessageView inboundImageMessageView, C10590q c10590q) {
        inboundImageMessageView.f34452a = c10590q;
    }

    /* renamed from: a */
    public static void m42887a(InboundImageMessageView inboundImageMessageView, C8490z c8490z) {
        inboundImageMessageView.f34453b = c8490z;
    }
}
