package com.tinder.fastmatch.view;

import com.tinder.chat.activity.C8406b;
import com.tinder.fastmatch.presenter.C11648i;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.views.grid.C17264e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.view.h */
public final class C11678h implements MembersInjector<FastMatchRecsView> {
    /* renamed from: a */
    private final Provider<UserRecActivePhotoIndexProvider> f38168a;
    /* renamed from: b */
    private final Provider<C8406b> f38169b;
    /* renamed from: c */
    private final Provider<C11648i> f38170c;
    /* renamed from: d */
    private final Provider<C14548a> f38171d;
    /* renamed from: e */
    private final Provider<C14550a> f38172e;

    public /* synthetic */ void injectMembers(Object obj) {
        m47479a((FastMatchRecsView) obj);
    }

    /* renamed from: a */
    public void m47479a(FastMatchRecsView fastMatchRecsView) {
        C17264e.a(fastMatchRecsView, (UserRecActivePhotoIndexProvider) this.f38168a.get());
        C17264e.a(fastMatchRecsView, (C8406b) this.f38169b.get());
        C11678h.m47476a(fastMatchRecsView, (C11648i) this.f38170c.get());
        C11678h.m47477a(fastMatchRecsView, (C14548a) this.f38171d.get());
        C11678h.m47478a(fastMatchRecsView, (C14550a) this.f38172e.get());
    }

    /* renamed from: a */
    public static void m47476a(FastMatchRecsView fastMatchRecsView, C11648i c11648i) {
        fastMatchRecsView.f41915a = c11648i;
    }

    /* renamed from: a */
    public static void m47477a(FastMatchRecsView fastMatchRecsView, C14548a c14548a) {
        fastMatchRecsView.f41916b = c14548a;
    }

    /* renamed from: a */
    public static void m47478a(FastMatchRecsView fastMatchRecsView, C14550a c14550a) {
        fastMatchRecsView.f41917c = c14550a;
    }
}
