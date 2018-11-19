package com.tinder.feed.view.feed;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ab implements MembersInjector<aa> {
    /* renamed from: a */
    private final Provider<C9467d> f38279a;
    /* renamed from: b */
    private final Provider<C9486b> f38280b;
    /* renamed from: c */
    private final Provider<C9542a> f38281c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47574a((aa) obj);
    }

    /* renamed from: a */
    public void m47574a(aa aaVar) {
        m47571a(aaVar, (C9467d) this.f38279a.get());
        m47572a(aaVar, (C9486b) this.f38280b.get());
        m47573a(aaVar, (C9542a) this.f38281c.get());
    }

    /* renamed from: a */
    public static void m47571a(aa aaVar, C9467d c9467d) {
        aaVar.f38270b = c9467d;
    }

    /* renamed from: a */
    public static void m47572a(aa aaVar, C9486b c9486b) {
        aaVar.f38271c = c9486b;
    }

    /* renamed from: a */
    public static void m47573a(aa aaVar, C9542a c9542a) {
        aaVar.f38272d = c9542a;
    }
}
