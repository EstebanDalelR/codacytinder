package com.tinder.places.onboarding;

import dagger.MembersInjector;
import java.util.List;
import javax.inject.Provider;

/* renamed from: com.tinder.places.onboarding.g */
public final class C12402g implements MembersInjector<C12401f> {
    /* renamed from: a */
    private final Provider<List<String>> f40046a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48833a((C12401f) obj);
    }

    /* renamed from: a */
    public void m48833a(C12401f c12401f) {
        C12402g.m48832a(c12401f, (List) this.f40046a.get());
    }

    /* renamed from: a */
    public static void m48832a(C12401f c12401f, List<String> list) {
        c12401f.f40043a = list;
    }
}
