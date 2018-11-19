package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.feed.z */
public final class C11751z implements MembersInjector<C11750y> {
    /* renamed from: a */
    private final Provider<C9467d> f38409a;
    /* renamed from: b */
    private final Provider<C9486b> f38410b;
    /* renamed from: c */
    private final Provider<C9542a> f38411c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47628a((C11750y) obj);
    }

    /* renamed from: a */
    public void m47628a(C11750y c11750y) {
        C11751z.m47625a(c11750y, (C9467d) this.f38409a.get());
        C11751z.m47626a(c11750y, (C9486b) this.f38410b.get());
        C11751z.m47627a(c11750y, (C9542a) this.f38411c.get());
    }

    /* renamed from: a */
    public static void m47625a(C11750y c11750y, C9467d c9467d) {
        c11750y.f38400b = c9467d;
    }

    /* renamed from: a */
    public static void m47626a(C11750y c11750y, C9486b c9486b) {
        c11750y.f38401c = c9486b;
    }

    /* renamed from: a */
    public static void m47627a(C11750y c11750y, C9542a c9542a) {
        c11750y.f38402d = c9542a;
    }
}
