package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8458c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.p */
public final class C10625p implements MembersInjector<C10624o> {
    /* renamed from: a */
    private final Provider<C10588n> f34792a;
    /* renamed from: b */
    private final Provider<C8490z> f34793b;
    /* renamed from: c */
    private final Provider<C8458c> f34794c;
    /* renamed from: d */
    private final Provider<C10587l> f34795d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42869a((C10624o) obj);
    }

    /* renamed from: a */
    public void m42869a(C10624o c10624o) {
        C10625p.m42867a(c10624o, (C10588n) this.f34792a.get());
        C10625p.m42868a(c10624o, (C8490z) this.f34793b.get());
        C10625p.m42865a(c10624o, (C8458c) this.f34794c.get());
        C10625p.m42866a(c10624o, (C10587l) this.f34795d.get());
    }

    /* renamed from: a */
    public static void m42867a(C10624o c10624o, C10588n c10588n) {
        c10624o.f34781a = c10588n;
    }

    /* renamed from: a */
    public static void m42868a(C10624o c10624o, C8490z c8490z) {
        c10624o.f34782b = c8490z;
    }

    /* renamed from: a */
    public static void m42865a(C10624o c10624o, C8458c c8458c) {
        c10624o.f34783c = c8458c;
    }

    /* renamed from: a */
    public static void m42866a(C10624o c10624o, C10587l c10587l) {
        c10624o.f34784d = c10587l;
    }
}
