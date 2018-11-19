package com.tinder.toppicks.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.toppicks.exhausted.C15267e;
import com.tinder.toppicks.presenter.C15292m;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.view.j */
public final class C17156j implements MembersInjector<TopPicksView> {
    /* renamed from: a */
    private final Provider<C15292m> f52681a;
    /* renamed from: b */
    private final Provider<C15267e> f52682b;
    /* renamed from: c */
    private final Provider<Lifecycle> f52683c;

    public /* synthetic */ void injectMembers(Object obj) {
        m63032a((TopPicksView) obj);
    }

    /* renamed from: a */
    public void m63032a(TopPicksView topPicksView) {
        C17156j.m63031a(topPicksView, (C15292m) this.f52681a.get());
        C17156j.m63030a(topPicksView, (C15267e) this.f52682b.get());
        C17156j.m63029a(topPicksView, (Lifecycle) this.f52683c.get());
    }

    /* renamed from: a */
    public static void m63031a(TopPicksView topPicksView, C15292m c15292m) {
        topPicksView.f14078a = c15292m;
    }

    /* renamed from: a */
    public static void m63030a(TopPicksView topPicksView, C15267e c15267e) {
        topPicksView.f14079b = c15267e;
    }

    /* renamed from: a */
    public static void m63029a(TopPicksView topPicksView, Lifecycle lifecycle) {
        topPicksView.f14080c = lifecycle;
    }
}
