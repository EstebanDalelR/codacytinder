package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.feed.n */
public final class C11739n implements MembersInjector<C11738m> {
    /* renamed from: a */
    private final Provider<C9467d> f38321a;
    /* renamed from: b */
    private final Provider<C9486b> f38322b;
    /* renamed from: c */
    private final Provider<C9542a> f38323c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47592a((C11738m) obj);
    }

    /* renamed from: a */
    public void m47592a(C11738m c11738m) {
        C11739n.m47589a(c11738m, (C9467d) this.f38321a.get());
        C11739n.m47590a(c11738m, (C9486b) this.f38322b.get());
        C11739n.m47591a(c11738m, (C9542a) this.f38323c.get());
    }

    /* renamed from: a */
    public static void m47589a(C11738m c11738m, C9467d c9467d) {
        c11738m.f38310b = c9467d;
    }

    /* renamed from: a */
    public static void m47590a(C11738m c11738m, C9486b c9486b) {
        c11738m.f38311c = c9486b;
    }

    /* renamed from: a */
    public static void m47591a(C11738m c11738m, C9542a c9542a) {
        c11738m.f38312d = c9542a;
    }
}
