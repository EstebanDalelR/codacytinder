package com.tinder.places.onboarding;

import dagger.MembersInjector;
import java.util.List;
import javax.inject.Provider;

/* renamed from: com.tinder.places.onboarding.i */
public final class C12404i implements MembersInjector<C12403h> {
    /* renamed from: a */
    private final Provider<List<String>> f40050a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48837a((C12403h) obj);
    }

    /* renamed from: a */
    public void m48837a(C12403h c12403h) {
        C12404i.m48836a(c12403h, (List) this.f40050a.get());
    }

    /* renamed from: a */
    public static void m48836a(C12403h c12403h, List<String> list) {
        c12403h.f40047a = list;
    }
}
