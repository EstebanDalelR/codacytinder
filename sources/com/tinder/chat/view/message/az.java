package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class az implements MembersInjector<ay> {
    /* renamed from: a */
    private final Provider<ae> f34632a;
    /* renamed from: b */
    private final Provider<C8490z> f34633b;
    /* renamed from: c */
    private final Provider<C8458c> f34634c;
    /* renamed from: d */
    private final Provider<ac> f34635d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42791a((ay) obj);
    }

    /* renamed from: a */
    public void m42791a(ay ayVar) {
        m42788a(ayVar, (ae) this.f34632a.get());
        m42790a(ayVar, (C8490z) this.f34633b.get());
        m42789a(ayVar, (C8458c) this.f34634c.get());
        m42787a(ayVar, (ac) this.f34635d.get());
    }

    /* renamed from: a */
    public static void m42788a(ay ayVar, ae aeVar) {
        ayVar.f34622a = aeVar;
    }

    /* renamed from: a */
    public static void m42790a(ay ayVar, C8490z c8490z) {
        ayVar.f34623b = c8490z;
    }

    /* renamed from: a */
    public static void m42789a(ay ayVar, C8458c c8458c) {
        ayVar.f34624c = c8458c;
    }

    /* renamed from: a */
    public static void m42787a(ay ayVar, ac acVar) {
        ayVar.f34625d = acVar;
    }
}
