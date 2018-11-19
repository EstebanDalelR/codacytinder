package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8460f;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class an implements MembersInjector<am> {
    /* renamed from: a */
    private final Provider<ae> f34544a;
    /* renamed from: b */
    private final Provider<C8490z> f34545b;
    /* renamed from: c */
    private final Provider<C8460f> f34546c;
    /* renamed from: d */
    private final Provider<ac> f34547d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42749a((am) obj);
    }

    /* renamed from: a */
    public void m42749a(am amVar) {
        m42746a(amVar, (ae) this.f34544a.get());
        m42748a(amVar, (C8490z) this.f34545b.get());
        m42747a(amVar, (C8460f) this.f34546c.get());
        m42745a(amVar, (ac) this.f34547d.get());
    }

    /* renamed from: a */
    public static void m42746a(am amVar, ae aeVar) {
        amVar.f34534a = aeVar;
    }

    /* renamed from: a */
    public static void m42748a(am amVar, C8490z c8490z) {
        amVar.f34535b = c8490z;
    }

    /* renamed from: a */
    public static void m42747a(am amVar, C8460f c8460f) {
        amVar.f34536c = c8460f;
    }

    /* renamed from: a */
    public static void m42745a(am amVar, ac acVar) {
        amVar.f34537d = acVar;
    }
}
