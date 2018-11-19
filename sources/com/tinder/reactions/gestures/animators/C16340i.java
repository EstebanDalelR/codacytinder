package com.tinder.reactions.gestures.animators;

import com.tinder.reactions.analytics.C16280l;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.gestures.animators.i */
public final class C16340i implements MembersInjector<C16339h> {
    /* renamed from: a */
    private final Provider<C16280l> f50835a;
    /* renamed from: b */
    private final Provider<String> f50836b;

    public /* synthetic */ void injectMembers(Object obj) {
        m61642a((C16339h) obj);
    }

    /* renamed from: a */
    public void m61642a(C16339h c16339h) {
        C16340i.m61640a(c16339h, (C16280l) this.f50835a.get());
        C16340i.m61641a(c16339h, (String) this.f50836b.get());
    }

    /* renamed from: a */
    public static void m61640a(C16339h c16339h, C16280l c16280l) {
        c16339h.f50833a = c16280l;
    }

    /* renamed from: a */
    public static void m61641a(C16339h c16339h, String str) {
        c16339h.f50834b = str;
    }
}
