package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.feed.v */
public final class C11747v implements MembersInjector<C11746u> {
    /* renamed from: a */
    private final Provider<C9467d> f38381a;
    /* renamed from: b */
    private final Provider<C9486b> f38382b;
    /* renamed from: c */
    private final Provider<C9542a> f38383c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47616a((C11746u) obj);
    }

    /* renamed from: a */
    public void m47616a(C11746u c11746u) {
        C11747v.m47613a(c11746u, (C9467d) this.f38381a.get());
        C11747v.m47614a(c11746u, (C9486b) this.f38382b.get());
        C11747v.m47615a(c11746u, (C9542a) this.f38383c.get());
    }

    /* renamed from: a */
    public static void m47613a(C11746u c11746u, C9467d c9467d) {
        c11746u.f38370b = c9467d;
    }

    /* renamed from: a */
    public static void m47614a(C11746u c11746u, C9486b c9486b) {
        c11746u.f38371c = c9486b;
    }

    /* renamed from: a */
    public static void m47615a(C11746u c11746u, C9542a c9542a) {
        c11746u.f38372d = c9542a;
    }
}
