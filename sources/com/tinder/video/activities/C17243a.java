package com.tinder.video.activities;

import com.tinder.video.p445b.C15410a;
import com.tinder.video.p446c.C15412a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.video.activities.a */
public final class C17243a implements MembersInjector<FullscreenVideoActivity> {
    /* renamed from: a */
    private final Provider<C15410a> f52854a;
    /* renamed from: b */
    private final Provider<C15412a> f52855b;

    public /* synthetic */ void injectMembers(Object obj) {
        m63154a((FullscreenVideoActivity) obj);
    }

    /* renamed from: a */
    public void m63154a(FullscreenVideoActivity fullscreenVideoActivity) {
        C17243a.m63152a(fullscreenVideoActivity, (C15410a) this.f52854a.get());
        C17243a.m63153a(fullscreenVideoActivity, (C15412a) this.f52855b.get());
    }

    /* renamed from: a */
    public static void m63152a(FullscreenVideoActivity fullscreenVideoActivity, C15410a c15410a) {
        fullscreenVideoActivity.f59944a = c15410a;
    }

    /* renamed from: a */
    public static void m63153a(FullscreenVideoActivity fullscreenVideoActivity, C15412a c15412a) {
        fullscreenVideoActivity.f59945b = c15412a;
    }
}
