package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ax implements MembersInjector<aw> {
    /* renamed from: a */
    private final Provider<ae> f34618a;
    /* renamed from: b */
    private final Provider<C8490z> f34619b;
    /* renamed from: c */
    private final Provider<C8458c> f34620c;
    /* renamed from: d */
    private final Provider<ac> f34621d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42784a((aw) obj);
    }

    /* renamed from: a */
    public void m42784a(aw awVar) {
        m42781a(awVar, (ae) this.f34618a.get());
        m42783a(awVar, (C8490z) this.f34619b.get());
        m42782a(awVar, (C8458c) this.f34620c.get());
        m42780a(awVar, (ac) this.f34621d.get());
    }

    /* renamed from: a */
    public static void m42781a(aw awVar, ae aeVar) {
        awVar.f34608a = aeVar;
    }

    /* renamed from: a */
    public static void m42783a(aw awVar, C8490z c8490z) {
        awVar.f34609b = c8490z;
    }

    /* renamed from: a */
    public static void m42782a(aw awVar, C8458c c8458c) {
        awVar.f34610c = c8458c;
    }

    /* renamed from: a */
    public static void m42780a(aw awVar, ac acVar) {
        awVar.f34611d = acVar;
    }
}
