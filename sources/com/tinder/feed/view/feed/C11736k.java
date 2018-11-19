package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.feed.k */
public final class C11736k implements MembersInjector<C11735j> {
    /* renamed from: a */
    private final Provider<C9467d> f38306a;
    /* renamed from: b */
    private final Provider<C9486b> f38307b;
    /* renamed from: c */
    private final Provider<C9542a> f38308c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47584a((C11735j) obj);
    }

    /* renamed from: a */
    public void m47584a(C11735j c11735j) {
        C11736k.m47581a(c11735j, (C9467d) this.f38306a.get());
        C11736k.m47582a(c11735j, (C9486b) this.f38307b.get());
        C11736k.m47583a(c11735j, (C9542a) this.f38308c.get());
    }

    /* renamed from: a */
    public static void m47581a(C11735j c11735j, C9467d c9467d) {
        c11735j.f38295b = c9467d;
    }

    /* renamed from: a */
    public static void m47582a(C11735j c11735j, C9486b c9486b) {
        c11735j.f38296c = c9486b;
    }

    /* renamed from: a */
    public static void m47583a(C11735j c11735j, C9542a c9542a) {
        c11735j.f38297d = c9542a;
    }
}
