package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8458c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.j */
public final class C10619j implements MembersInjector<C10618i> {
    /* renamed from: a */
    private final Provider<C10588n> f34748a;
    /* renamed from: b */
    private final Provider<C8490z> f34749b;
    /* renamed from: c */
    private final Provider<C8458c> f34750c;

    public /* synthetic */ void injectMembers(Object obj) {
        m42848a((C10618i) obj);
    }

    /* renamed from: a */
    public void m42848a(C10618i c10618i) {
        C10619j.m42846a(c10618i, (C10588n) this.f34748a.get());
        C10619j.m42847a(c10618i, (C8490z) this.f34749b.get());
        C10619j.m42845a(c10618i, (C8458c) this.f34750c.get());
    }

    /* renamed from: a */
    public static void m42846a(C10618i c10618i, C10588n c10588n) {
        c10618i.f34738a = c10588n;
    }

    /* renamed from: a */
    public static void m42847a(C10618i c10618i, C8490z c8490z) {
        c10618i.f34739b = c8490z;
    }

    /* renamed from: a */
    public static void m42845a(C10618i c10618i, C8458c c8458c) {
        c10618i.f34740c = c8458c;
    }
}
