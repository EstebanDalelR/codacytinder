package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.feed.t */
public final class C11745t implements MembersInjector<C11744s> {
    /* renamed from: a */
    private final Provider<C9467d> f38366a;
    /* renamed from: b */
    private final Provider<C9486b> f38367b;
    /* renamed from: c */
    private final Provider<C9542a> f38368c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47610a((C11744s) obj);
    }

    /* renamed from: a */
    public void m47610a(C11744s c11744s) {
        C11745t.m47607a(c11744s, (C9467d) this.f38366a.get());
        C11745t.m47608a(c11744s, (C9486b) this.f38367b.get());
        C11745t.m47609a(c11744s, (C9542a) this.f38368c.get());
    }

    /* renamed from: a */
    public static void m47607a(C11744s c11744s, C9467d c9467d) {
        c11744s.f38355b = c9467d;
    }

    /* renamed from: a */
    public static void m47608a(C11744s c11744s, C9486b c9486b) {
        c11744s.f38356c = c9486b;
    }

    /* renamed from: a */
    public static void m47609a(C11744s c11744s, C9542a c9542a) {
        c11744s.f38357d = c9542a;
    }
}
