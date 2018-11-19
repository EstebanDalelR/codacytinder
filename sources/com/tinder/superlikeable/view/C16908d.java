package com.tinder.superlikeable.view;

import com.tinder.superlikeable.analytics.C18200e;
import com.tinder.superlikeable.p423c.C15140a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.superlikeable.view.d */
public final class C16908d implements MembersInjector<SuperLikeableViewContainer> {
    /* renamed from: a */
    private final Provider<C15140a> f52107a;
    /* renamed from: b */
    private final Provider<C18200e> f52108b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62554a((SuperLikeableViewContainer) obj);
    }

    /* renamed from: a */
    public void m62554a(SuperLikeableViewContainer superLikeableViewContainer) {
        C16908d.m62553a(superLikeableViewContainer, (C15140a) this.f52107a.get());
        C16908d.m62552a(superLikeableViewContainer, (C18200e) this.f52108b.get());
    }

    /* renamed from: a */
    public static void m62553a(SuperLikeableViewContainer superLikeableViewContainer, C15140a c15140a) {
        superLikeableViewContainer.f52074a = c15140a;
    }

    /* renamed from: a */
    public static void m62552a(SuperLikeableViewContainer superLikeableViewContainer, C18200e c18200e) {
        superLikeableViewContainer.f52075b = c18200e;
    }
}
