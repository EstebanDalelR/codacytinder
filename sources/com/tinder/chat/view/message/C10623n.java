package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8458c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.n */
public final class C10623n implements MembersInjector<C10622m> {
    /* renamed from: a */
    private final Provider<C10588n> f34777a;
    /* renamed from: b */
    private final Provider<C8490z> f34778b;
    /* renamed from: c */
    private final Provider<C8458c> f34779c;
    /* renamed from: d */
    private final Provider<C10587l> f34780d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42862a((C10622m) obj);
    }

    /* renamed from: a */
    public void m42862a(C10622m c10622m) {
        C10623n.m42860a(c10622m, (C10588n) this.f34777a.get());
        C10623n.m42861a(c10622m, (C8490z) this.f34778b.get());
        C10623n.m42858a(c10622m, (C8458c) this.f34779c.get());
        C10623n.m42859a(c10622m, (C10587l) this.f34780d.get());
    }

    /* renamed from: a */
    public static void m42860a(C10622m c10622m, C10588n c10588n) {
        c10622m.f34766a = c10588n;
    }

    /* renamed from: a */
    public static void m42861a(C10622m c10622m, C8490z c8490z) {
        c10622m.f34767b = c8490z;
    }

    /* renamed from: a */
    public static void m42858a(C10622m c10622m, C8458c c8458c) {
        c10622m.f34768c = c8458c;
    }

    /* renamed from: a */
    public static void m42859a(C10622m c10622m, C10587l c10587l) {
        c10622m.f34769d = c10587l;
    }
}
