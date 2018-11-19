package com.tinder.fragments;

import com.tinder.api.ManagerNetwork;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.usecase.C17223f;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fragments.u */
public final class C11852u implements MembersInjector<C13310q> {
    /* renamed from: a */
    private final Provider<FacebookManager> f38665a;
    /* renamed from: b */
    private final Provider<ManagerNetwork> f38666b;
    /* renamed from: c */
    private final Provider<LegacyBreadCrumbTracker> f38667c;
    /* renamed from: d */
    private final Provider<C17223f> f38668d;

    public /* synthetic */ void injectMembers(Object obj) {
        m47822a((C13310q) obj);
    }

    /* renamed from: a */
    public void m47822a(C13310q c13310q) {
        C11852u.m47819a(c13310q, (FacebookManager) this.f38665a.get());
        C11852u.m47818a(c13310q, (ManagerNetwork) this.f38666b.get());
        C11852u.m47820a(c13310q, (LegacyBreadCrumbTracker) this.f38667c.get());
        C11852u.m47821a(c13310q, (C17223f) this.f38668d.get());
    }

    /* renamed from: a */
    public static void m47819a(C13310q c13310q, FacebookManager facebookManager) {
        c13310q.f42242a = facebookManager;
    }

    /* renamed from: a */
    public static void m47818a(C13310q c13310q, ManagerNetwork managerNetwork) {
        c13310q.f42243b = managerNetwork;
    }

    /* renamed from: a */
    public static void m47820a(C13310q c13310q, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        c13310q.f42244c = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m47821a(C13310q c13310q, C17223f c17223f) {
        c13310q.f42245d = c17223f;
    }
}
