package com.tinder.places.main.view;

import com.tinder.places.main.presenter.C10217a;
import dagger.MembersInjector;
import java.util.List;
import javax.inject.Provider;

/* renamed from: com.tinder.places.main.view.b */
public final class C12371b implements MembersInjector<C12370a> {
    /* renamed from: a */
    private final Provider<C10217a> f39992a;
    /* renamed from: b */
    private final Provider<List<String>> f39993b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48771a((C12370a) obj);
    }

    /* renamed from: a */
    public void m48771a(C12370a c12370a) {
        C12371b.m48769a(c12370a, (C10217a) this.f39992a.get());
        C12371b.m48770a(c12370a, (List) this.f39993b.get());
    }

    /* renamed from: a */
    public static void m48769a(C12370a c12370a, C10217a c10217a) {
        c12370a.f39989a = c10217a;
    }

    /* renamed from: a */
    public static void m48770a(C12370a c12370a, List<String> list) {
        c12370a.f39990b = list;
    }
}
