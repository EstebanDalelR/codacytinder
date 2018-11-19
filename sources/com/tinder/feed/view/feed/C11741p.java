package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.feed.p */
public final class C11741p implements MembersInjector<C11740o> {
    /* renamed from: a */
    private final Provider<C9467d> f38336a;
    /* renamed from: b */
    private final Provider<C9486b> f38337b;
    /* renamed from: c */
    private final Provider<C9542a> f38338c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47598a((C11740o) obj);
    }

    /* renamed from: a */
    public void m47598a(C11740o c11740o) {
        C11741p.m47595a(c11740o, (C9467d) this.f38336a.get());
        C11741p.m47596a(c11740o, (C9486b) this.f38337b.get());
        C11741p.m47597a(c11740o, (C9542a) this.f38338c.get());
    }

    /* renamed from: a */
    public static void m47595a(C11740o c11740o, C9467d c9467d) {
        c11740o.f38325b = c9467d;
    }

    /* renamed from: a */
    public static void m47596a(C11740o c11740o, C9486b c9486b) {
        c11740o.f38326c = c9486b;
    }

    /* renamed from: a */
    public static void m47597a(C11740o c11740o, C9542a c9542a) {
        c11740o.f38327d = c9542a;
    }
}
