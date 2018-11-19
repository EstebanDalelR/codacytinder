package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8460f;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.h */
public final class C10617h implements MembersInjector<C10616g> {
    /* renamed from: a */
    private final Provider<C10588n> f34734a;
    /* renamed from: b */
    private final Provider<C8490z> f34735b;
    /* renamed from: c */
    private final Provider<C8460f> f34736c;
    /* renamed from: d */
    private final Provider<C10587l> f34737d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42842a((C10616g) obj);
    }

    /* renamed from: a */
    public void m42842a(C10616g c10616g) {
        C10617h.m42840a(c10616g, (C10588n) this.f34734a.get());
        C10617h.m42841a(c10616g, (C8490z) this.f34735b.get());
        C10617h.m42838a(c10616g, (C8460f) this.f34736c.get());
        C10617h.m42839a(c10616g, (C10587l) this.f34737d.get());
    }

    /* renamed from: a */
    public static void m42840a(C10616g c10616g, C10588n c10588n) {
        c10616g.f34723a = c10588n;
    }

    /* renamed from: a */
    public static void m42841a(C10616g c10616g, C8490z c8490z) {
        c10616g.f34724b = c8490z;
    }

    /* renamed from: a */
    public static void m42838a(C10616g c10616g, C8460f c8460f) {
        c10616g.f34725c = c8460f;
    }

    /* renamed from: a */
    public static void m42839a(C10616g c10616g, C10587l c10587l) {
        c10616g.f34726d = c10587l;
    }
}
