package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ar implements MembersInjector<aq> {
    /* renamed from: a */
    private final Provider<ae> f34577a;
    /* renamed from: b */
    private final Provider<C8490z> f34578b;
    /* renamed from: c */
    private final Provider<C8458c> f34579c;

    public /* synthetic */ void injectMembers(Object obj) {
        m42763a((aq) obj);
    }

    /* renamed from: a */
    public void m42763a(aq aqVar) {
        m42760a(aqVar, (ae) this.f34577a.get());
        m42762a(aqVar, (C8490z) this.f34578b.get());
        m42761a(aqVar, (C8458c) this.f34579c.get());
    }

    /* renamed from: a */
    public static void m42760a(aq aqVar, ae aeVar) {
        aqVar.f34568a = aeVar;
    }

    /* renamed from: a */
    public static void m42762a(aq aqVar, C8490z c8490z) {
        aqVar.f34569b = c8490z;
    }

    /* renamed from: a */
    public static void m42761a(aq aqVar, C8458c c8458c) {
        aqVar.f34570c = c8458c;
    }
}
