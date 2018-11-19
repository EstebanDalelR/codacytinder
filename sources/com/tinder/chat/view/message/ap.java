package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8460f;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ap implements MembersInjector<ao> {
    /* renamed from: a */
    private final Provider<ae> f34564a;
    /* renamed from: b */
    private final Provider<C8490z> f34565b;
    /* renamed from: c */
    private final Provider<C8460f> f34566c;
    /* renamed from: d */
    private final Provider<ac> f34567d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42757a((ao) obj);
    }

    /* renamed from: a */
    public void m42757a(ao aoVar) {
        m42754a(aoVar, (ae) this.f34564a.get());
        m42756a(aoVar, (C8490z) this.f34565b.get());
        m42755a(aoVar, (C8460f) this.f34566c.get());
        m42753a(aoVar, (ac) this.f34567d.get());
    }

    /* renamed from: a */
    public static void m42754a(ao aoVar, ae aeVar) {
        aoVar.f34554a = aeVar;
    }

    /* renamed from: a */
    public static void m42756a(ao aoVar, C8490z c8490z) {
        aoVar.f34555b = c8490z;
    }

    /* renamed from: a */
    public static void m42755a(ao aoVar, C8460f c8460f) {
        aoVar.f34556c = c8460f;
    }

    /* renamed from: a */
    public static void m42753a(ao aoVar, ac acVar) {
        aoVar.f34557d = acVar;
    }
}
