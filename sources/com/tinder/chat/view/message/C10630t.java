package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8457a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.t */
public final class C10630t implements MembersInjector<C10629s> {
    /* renamed from: a */
    private final Provider<C10588n> f34823a;
    /* renamed from: b */
    private final Provider<C8490z> f34824b;
    /* renamed from: c */
    private final Provider<C8457a> f34825c;

    public /* synthetic */ void injectMembers(Object obj) {
        m42882a((C10629s) obj);
    }

    /* renamed from: a */
    public void m42882a(C10629s c10629s) {
        C10630t.m42880a(c10629s, (C10588n) this.f34823a.get());
        C10630t.m42881a(c10629s, (C8490z) this.f34824b.get());
        C10630t.m42879a(c10629s, (C8457a) this.f34825c.get());
    }

    /* renamed from: a */
    public static void m42880a(C10629s c10629s, C10588n c10588n) {
        c10629s.f34813a = c10588n;
    }

    /* renamed from: a */
    public static void m42881a(C10629s c10629s, C8490z c8490z) {
        c10629s.f34814b = c8490z;
    }

    /* renamed from: a */
    public static void m42879a(C10629s c10629s, C8457a c8457a) {
        c10629s.f34815c = c8457a;
    }
}
