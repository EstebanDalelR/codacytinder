package com.tinder.feed.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.common.tracker.recyclerview.RecyclerViewItemTracker;
import com.tinder.common.tracker.recyclerview.p200c.C8576g;
import com.tinder.domain.feed.FeedRangeRepository;
import com.tinder.feed.p249d.C9462a;
import com.tinder.feed.p340a.C11682b;
import com.tinder.feed.presenter.C9468e;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.feed.view.tracker.C9548d;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.d */
public final class C11727d implements MembersInjector<FeedMainView> {
    /* renamed from: a */
    private final Provider<C9468e> f38246a;
    /* renamed from: b */
    private final Provider<C9542a> f38247b;
    /* renamed from: c */
    private final Provider<C11682b> f38248c;
    /* renamed from: d */
    private final Provider<C9548d> f38249d;
    /* renamed from: e */
    private final Provider<C9462a> f38250e;
    /* renamed from: f */
    private final Provider<FeedRangeRepository> f38251f;
    /* renamed from: g */
    private final Provider<Lifecycle> f38252g;
    /* renamed from: h */
    private final Provider<RecyclerViewItemTracker> f38253h;
    /* renamed from: i */
    private final Provider<C8576g> f38254i;

    public /* synthetic */ void injectMembers(Object obj) {
        m47562a((FeedMainView) obj);
    }

    /* renamed from: a */
    public void m47562a(FeedMainView feedMainView) {
        C11727d.m47559a(feedMainView, (C9468e) this.f38246a.get());
        C11727d.m47560a(feedMainView, (C9542a) this.f38247b.get());
        C11727d.m47557a(feedMainView, (C11682b) this.f38248c.get());
        C11727d.m47561a(feedMainView, (C9548d) this.f38249d.get());
        C11727d.m47558a(feedMainView, (C9462a) this.f38250e.get());
        C11727d.m47556a(feedMainView, (FeedRangeRepository) this.f38251f.get());
        C11727d.m47553a(feedMainView, (Lifecycle) this.f38252g.get());
        C11727d.m47554a(feedMainView, (RecyclerViewItemTracker) this.f38253h.get());
        C11727d.m47555a(feedMainView, (C8576g) this.f38254i.get());
    }

    /* renamed from: a */
    public static void m47559a(FeedMainView feedMainView, C9468e c9468e) {
        feedMainView.f12286a = c9468e;
    }

    /* renamed from: a */
    public static void m47560a(FeedMainView feedMainView, C9542a c9542a) {
        feedMainView.f12287b = c9542a;
    }

    /* renamed from: a */
    public static void m47557a(FeedMainView feedMainView, C11682b c11682b) {
        feedMainView.f12288c = c11682b;
    }

    /* renamed from: a */
    public static void m47561a(FeedMainView feedMainView, C9548d c9548d) {
        feedMainView.f12289d = c9548d;
    }

    /* renamed from: a */
    public static void m47558a(FeedMainView feedMainView, C9462a c9462a) {
        feedMainView.f12290e = c9462a;
    }

    /* renamed from: a */
    public static void m47556a(FeedMainView feedMainView, FeedRangeRepository feedRangeRepository) {
        feedMainView.f12291f = feedRangeRepository;
    }

    /* renamed from: a */
    public static void m47553a(FeedMainView feedMainView, Lifecycle lifecycle) {
        feedMainView.f12292g = lifecycle;
    }

    /* renamed from: a */
    public static void m47554a(FeedMainView feedMainView, RecyclerViewItemTracker recyclerViewItemTracker) {
        feedMainView.f12293h = recyclerViewItemTracker;
    }

    /* renamed from: a */
    public static void m47555a(FeedMainView feedMainView, C8576g c8576g) {
        feedMainView.f12294i = c8576g;
    }
}
