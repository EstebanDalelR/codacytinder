package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.feed.b */
public final class C11730b implements MembersInjector<C11729a> {
    /* renamed from: a */
    private final Provider<C9467d> f38282a;
    /* renamed from: b */
    private final Provider<C9486b> f38283b;
    /* renamed from: c */
    private final Provider<C9542a> f38284c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47578a((C11729a) obj);
    }

    /* renamed from: a */
    public void m47578a(C11729a c11729a) {
        C11730b.m47575a(c11729a, (C9467d) this.f38282a.get());
        C11730b.m47576a(c11729a, (C9486b) this.f38283b.get());
        C11730b.m47577a(c11729a, (C9542a) this.f38284c.get());
    }

    /* renamed from: a */
    public static void m47575a(C11729a c11729a, C9467d c9467d) {
        c11729a.f38260b = c9467d;
    }

    /* renamed from: a */
    public static void m47576a(C11729a c11729a, C9486b c9486b) {
        c11729a.f38261c = c9486b;
    }

    /* renamed from: a */
    public static void m47577a(C11729a c11729a, C9542a c9542a) {
        c11729a.f38262d = c9542a;
    }
}
