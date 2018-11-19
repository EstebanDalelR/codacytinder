package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class aj implements MembersInjector<ai> {
    /* renamed from: a */
    private final Provider<ae> f34510a;
    /* renamed from: b */
    private final Provider<C8490z> f34511b;
    /* renamed from: c */
    private final Provider<C8458c> f34512c;
    /* renamed from: d */
    private final Provider<ac> f34513d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42734a((ai) obj);
    }

    /* renamed from: a */
    public void m42734a(ai aiVar) {
        m42731a(aiVar, (ae) this.f34510a.get());
        m42733a(aiVar, (C8490z) this.f34511b.get());
        m42732a(aiVar, (C8458c) this.f34512c.get());
        m42730a(aiVar, (ac) this.f34513d.get());
    }

    /* renamed from: a */
    public static void m42731a(ai aiVar, ae aeVar) {
        aiVar.f34500a = aeVar;
    }

    /* renamed from: a */
    public static void m42733a(ai aiVar, C8490z c8490z) {
        aiVar.f34501b = c8490z;
    }

    /* renamed from: a */
    public static void m42732a(ai aiVar, C8458c c8458c) {
        aiVar.f34502c = c8458c;
    }

    /* renamed from: a */
    public static void m42730a(ai aiVar, ac acVar) {
        aiVar.f34503d = acVar;
    }
}
