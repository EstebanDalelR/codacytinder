package com.tinder.p071a;

import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.a.k */
public final class C3867k implements MembersInjector<C2603i> {
    /* renamed from: a */
    private final Provider<C2602d> f12122a;

    public /* synthetic */ void injectMembers(Object obj) {
        m14596a((C2603i) obj);
    }

    /* renamed from: a */
    public void m14596a(C2603i c2603i) {
        C3867k.m14595a(c2603i, (C2602d) this.f12122a.get());
    }

    /* renamed from: a */
    public static void m14595a(C2603i c2603i, C2602d c2602d) {
        c2603i.f8143a = c2602d;
    }
}
