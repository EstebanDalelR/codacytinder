package com.tinder.paywall.p304b;

import android.content.res.Resources;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.paywall.b.e */
public final class C12266e implements MembersInjector<C12265d> {
    /* renamed from: a */
    private final Provider<Resources> f39683a;
    /* renamed from: b */
    private final Provider<LikeStatusProvider> f39684b;
    /* renamed from: c */
    private final Provider<C15071e> f39685c;

    public /* synthetic */ void injectMembers(Object obj) {
        m48468a((C12265d) obj);
    }

    /* renamed from: a */
    public void m48468a(C12265d c12265d) {
        C12266e.m48465a(c12265d, (Resources) this.f39683a.get());
        C12266e.m48467a(c12265d, (LikeStatusProvider) this.f39684b.get());
        C12266e.m48466a(c12265d, (C15071e) this.f39685c.get());
    }

    /* renamed from: a */
    public static void m48465a(C12265d c12265d, Resources resources) {
        c12265d.f39676a = resources;
    }

    /* renamed from: a */
    public static void m48467a(C12265d c12265d, LikeStatusProvider likeStatusProvider) {
        c12265d.f39677b = likeStatusProvider;
    }

    /* renamed from: a */
    public static void m48466a(C12265d c12265d, C15071e c15071e) {
        c12265d.f39678c = c15071e;
    }
}
