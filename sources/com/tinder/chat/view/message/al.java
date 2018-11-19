package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class al implements MembersInjector<ak> {
    /* renamed from: a */
    private final Provider<ae> f34524a;
    /* renamed from: b */
    private final Provider<C8490z> f34525b;
    /* renamed from: c */
    private final Provider<C8458c> f34526c;
    /* renamed from: d */
    private final Provider<ac> f34527d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42741a((ak) obj);
    }

    /* renamed from: a */
    public void m42741a(ak akVar) {
        m42738a(akVar, (ae) this.f34524a.get());
        m42740a(akVar, (C8490z) this.f34525b.get());
        m42739a(akVar, (C8458c) this.f34526c.get());
        m42737a(akVar, (ac) this.f34527d.get());
    }

    /* renamed from: a */
    public static void m42738a(ak akVar, ae aeVar) {
        akVar.f34514a = aeVar;
    }

    /* renamed from: a */
    public static void m42740a(ak akVar, C8490z c8490z) {
        akVar.f34515b = c8490z;
    }

    /* renamed from: a */
    public static void m42739a(ak akVar, C8458c c8458c) {
        akVar.f34516c = c8458c;
    }

    /* renamed from: a */
    public static void m42737a(ak akVar, ac acVar) {
        akVar.f34517d = acVar;
    }
}
