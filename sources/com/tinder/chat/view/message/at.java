package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class at implements MembersInjector<as> {
    /* renamed from: a */
    private final Provider<ae> f34590a;
    /* renamed from: b */
    private final Provider<C8490z> f34591b;
    /* renamed from: c */
    private final Provider<C8458c> f34592c;
    /* renamed from: d */
    private final Provider<ac> f34593d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42770a((as) obj);
    }

    /* renamed from: a */
    public void m42770a(as asVar) {
        m42767a(asVar, (ae) this.f34590a.get());
        m42769a(asVar, (C8490z) this.f34591b.get());
        m42768a(asVar, (C8458c) this.f34592c.get());
        m42766a(asVar, (ac) this.f34593d.get());
    }

    /* renamed from: a */
    public static void m42767a(as asVar, ae aeVar) {
        asVar.f34580a = aeVar;
    }

    /* renamed from: a */
    public static void m42769a(as asVar, C8490z c8490z) {
        asVar.f34581b = c8490z;
    }

    /* renamed from: a */
    public static void m42768a(as asVar, C8458c c8458c) {
        asVar.f34582c = c8458c;
    }

    /* renamed from: a */
    public static void m42766a(as asVar, ac acVar) {
        asVar.f34583d = acVar;
    }
}
