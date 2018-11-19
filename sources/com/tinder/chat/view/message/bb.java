package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8457a;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class bb implements MembersInjector<ba> {
    /* renamed from: a */
    private final Provider<ae> f34651a;
    /* renamed from: b */
    private final Provider<C8490z> f34652b;
    /* renamed from: c */
    private final Provider<C8457a> f34653c;

    public /* synthetic */ void injectMembers(Object obj) {
        m42802a((ba) obj);
    }

    /* renamed from: a */
    public void m42802a(ba baVar) {
        m42800a(baVar, (ae) this.f34651a.get());
        m42801a(baVar, (C8490z) this.f34652b.get());
        m42799a(baVar, (C8457a) this.f34653c.get());
    }

    /* renamed from: a */
    public static void m42800a(ba baVar, ae aeVar) {
        baVar.f34642a = aeVar;
    }

    /* renamed from: a */
    public static void m42801a(ba baVar, C8490z c8490z) {
        baVar.f34643b = c8490z;
    }

    /* renamed from: a */
    public static void m42799a(ba baVar, C8457a c8457a) {
        baVar.f34644c = c8457a;
    }
}
