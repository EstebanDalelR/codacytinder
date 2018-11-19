package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class av implements MembersInjector<au> {
    /* renamed from: a */
    private final Provider<ae> f34604a;
    /* renamed from: b */
    private final Provider<C8490z> f34605b;
    /* renamed from: c */
    private final Provider<C8458c> f34606c;
    /* renamed from: d */
    private final Provider<ac> f34607d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42777a((au) obj);
    }

    /* renamed from: a */
    public void m42777a(au auVar) {
        m42774a(auVar, (ae) this.f34604a.get());
        m42776a(auVar, (C8490z) this.f34605b.get());
        m42775a(auVar, (C8458c) this.f34606c.get());
        m42773a(auVar, (ac) this.f34607d.get());
    }

    /* renamed from: a */
    public static void m42774a(au auVar, ae aeVar) {
        auVar.f34594a = aeVar;
    }

    /* renamed from: a */
    public static void m42776a(au auVar, C8490z c8490z) {
        auVar.f34595b = c8490z;
    }

    /* renamed from: a */
    public static void m42775a(au auVar, C8458c c8458c) {
        auVar.f34596c = c8458c;
    }

    /* renamed from: a */
    public static void m42773a(au auVar, ac acVar) {
        auVar.f34597d = acVar;
    }
}
