package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8458c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.l */
public final class C10621l implements MembersInjector<C10620k> {
    /* renamed from: a */
    private final Provider<C10588n> f34762a;
    /* renamed from: b */
    private final Provider<C8490z> f34763b;
    /* renamed from: c */
    private final Provider<C8458c> f34764c;
    /* renamed from: d */
    private final Provider<C10587l> f34765d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42855a((C10620k) obj);
    }

    /* renamed from: a */
    public void m42855a(C10620k c10620k) {
        C10621l.m42853a(c10620k, (C10588n) this.f34762a.get());
        C10621l.m42854a(c10620k, (C8490z) this.f34763b.get());
        C10621l.m42851a(c10620k, (C8458c) this.f34764c.get());
        C10621l.m42852a(c10620k, (C10587l) this.f34765d.get());
    }

    /* renamed from: a */
    public static void m42853a(C10620k c10620k, C10588n c10588n) {
        c10620k.f34751a = c10588n;
    }

    /* renamed from: a */
    public static void m42854a(C10620k c10620k, C8490z c8490z) {
        c10620k.f34752b = c8490z;
    }

    /* renamed from: a */
    public static void m42851a(C10620k c10620k, C8458c c8458c) {
        c10620k.f34753c = c8458c;
    }

    /* renamed from: a */
    public static void m42852a(C10620k c10620k, C10587l c10587l) {
        c10620k.f34754d = c10587l;
    }
}
