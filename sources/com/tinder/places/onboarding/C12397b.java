package com.tinder.places.onboarding;

import dagger.MembersInjector;
import java.util.List;
import javax.inject.Provider;

/* renamed from: com.tinder.places.onboarding.b */
public final class C12397b implements MembersInjector<C12394a> {
    /* renamed from: a */
    private final Provider<List<String>> f40036a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48820a((C12394a) obj);
    }

    /* renamed from: a */
    public void m48820a(C12394a c12394a) {
        C12397b.m48819a(c12394a, (List) this.f40036a.get());
    }

    /* renamed from: a */
    public static void m48819a(C12394a c12394a, List<String> list) {
        c12394a.f40030a = list;
    }
}
