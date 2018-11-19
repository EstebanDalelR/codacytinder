package com.tinder.reactions.gestures.animators;

import com.tinder.reactions.analytics.C16280l;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.gestures.animators.b */
public final class C16336b implements MembersInjector<C16335a> {
    /* renamed from: a */
    private final Provider<C16280l> f50829a;
    /* renamed from: b */
    private final Provider<String> f50830b;

    public /* synthetic */ void injectMembers(Object obj) {
        m61634a((C16335a) obj);
    }

    /* renamed from: a */
    public void m61634a(C16335a c16335a) {
        C16336b.m61632a(c16335a, (C16280l) this.f50829a.get());
        C16336b.m61633a(c16335a, (String) this.f50830b.get());
    }

    /* renamed from: a */
    public static void m61632a(C16335a c16335a, C16280l c16280l) {
        c16335a.f50827a = c16280l;
    }

    /* renamed from: a */
    public static void m61633a(C16335a c16335a, String str) {
        c16335a.f50828b = str;
    }
}
