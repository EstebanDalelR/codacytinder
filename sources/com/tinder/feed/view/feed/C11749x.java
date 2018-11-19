package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.feed.x */
public final class C11749x implements MembersInjector<C11748w> {
    /* renamed from: a */
    private final Provider<C9467d> f38396a;
    /* renamed from: b */
    private final Provider<C9486b> f38397b;
    /* renamed from: c */
    private final Provider<C9542a> f38398c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47622a((C11748w) obj);
    }

    /* renamed from: a */
    public void m47622a(C11748w c11748w) {
        C11749x.m47619a(c11748w, (C9467d) this.f38396a.get());
        C11749x.m47620a(c11748w, (C9486b) this.f38397b.get());
        C11749x.m47621a(c11748w, (C9542a) this.f38398c.get());
    }

    /* renamed from: a */
    public static void m47619a(C11748w c11748w, C9467d c9467d) {
        c11748w.f38385b = c9467d;
    }

    /* renamed from: a */
    public static void m47620a(C11748w c11748w, C9486b c9486b) {
        c11748w.f38386c = c9486b;
    }

    /* renamed from: a */
    public static void m47621a(C11748w c11748w, C9542a c9542a) {
        c11748w.f38387d = c9542a;
    }
}
