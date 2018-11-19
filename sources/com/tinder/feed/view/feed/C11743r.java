package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.feed.r */
public final class C11743r implements MembersInjector<C11742q> {
    /* renamed from: a */
    private final Provider<C9467d> f38351a;
    /* renamed from: b */
    private final Provider<C9486b> f38352b;
    /* renamed from: c */
    private final Provider<C9542a> f38353c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47604a((C11742q) obj);
    }

    /* renamed from: a */
    public void m47604a(C11742q c11742q) {
        C11743r.m47601a(c11742q, (C9467d) this.f38351a.get());
        C11743r.m47602a(c11742q, (C9486b) this.f38352b.get());
        C11743r.m47603a(c11742q, (C9542a) this.f38353c.get());
    }

    /* renamed from: a */
    public static void m47601a(C11742q c11742q, C9467d c9467d) {
        c11742q.f38340b = c9467d;
    }

    /* renamed from: a */
    public static void m47602a(C11742q c11742q, C9486b c9486b) {
        c11742q.f38341c = c9486b;
    }

    /* renamed from: a */
    public static void m47603a(C11742q c11742q, C9542a c9542a) {
        c11742q.f38342d = c9542a;
    }
}
