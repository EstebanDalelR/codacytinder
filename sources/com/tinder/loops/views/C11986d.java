package com.tinder.loops.views;

import com.tinder.loops.p268b.C9762c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.views.d */
public final class C11986d implements MembersInjector<MediaTabsView> {
    /* renamed from: a */
    private final Provider<C9762c> f38938a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48026a((MediaTabsView) obj);
    }

    /* renamed from: a */
    public void m48026a(MediaTabsView mediaTabsView) {
        C11986d.m48025a(mediaTabsView, (C9762c) this.f38938a.get());
    }

    /* renamed from: a */
    public static void m48025a(MediaTabsView mediaTabsView, C9762c c9762c) {
        mediaTabsView.f38932b = c9762c;
    }
}
