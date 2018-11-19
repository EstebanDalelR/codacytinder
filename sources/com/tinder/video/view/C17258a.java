package com.tinder.video.view;

import com.tinder.video.p445b.C15411b;
import com.tinder.video.p446c.C15412a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.video.view.a */
public final class C17258a implements MembersInjector<MediaView> {
    /* renamed from: a */
    private final Provider<C15412a> f52881a;
    /* renamed from: b */
    private final Provider<C15411b> f52882b;

    public /* synthetic */ void injectMembers(Object obj) {
        m63177a((MediaView) obj);
    }

    /* renamed from: a */
    public void m63177a(MediaView mediaView) {
        C17258a.m63176a(mediaView, (C15412a) this.f52881a.get());
        C17258a.m63175a(mediaView, (C15411b) this.f52882b.get());
    }

    /* renamed from: a */
    public static void m63176a(MediaView mediaView, C15412a c15412a) {
        mediaView.f56647a = c15412a;
    }

    /* renamed from: a */
    public static void m63175a(MediaView mediaView, C15411b c15411b) {
        mediaView.f56648b = c15411b;
    }
}
