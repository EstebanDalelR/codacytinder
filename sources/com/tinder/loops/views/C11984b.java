package com.tinder.loops.views;

import com.tinder.loops.p268b.C9760a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.views.b */
public final class C11984b implements MembersInjector<EmptyStateContainerView> {
    /* renamed from: a */
    private final Provider<C9760a> f38936a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48022a((EmptyStateContainerView) obj);
    }

    /* renamed from: a */
    public void m48022a(EmptyStateContainerView emptyStateContainerView) {
        C11984b.m48021a(emptyStateContainerView, (C9760a) this.f38936a.get());
    }

    /* renamed from: a */
    public static void m48021a(EmptyStateContainerView emptyStateContainerView, C9760a c9760a) {
        emptyStateContainerView.f38920b = c9760a;
    }
}
