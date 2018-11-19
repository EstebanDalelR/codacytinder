package com.tinder.loops.views;

import com.tinder.loops.p268b.C9761b;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.views.c */
public final class C11985c implements MembersInjector<MediaSelectorView> {
    /* renamed from: a */
    private final Provider<C9761b> f38937a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48024a((MediaSelectorView) obj);
    }

    /* renamed from: a */
    public void m48024a(MediaSelectorView mediaSelectorView) {
        C11985c.m48023a(mediaSelectorView, (C9761b) this.f38937a.get());
    }

    /* renamed from: a */
    public static void m48023a(MediaSelectorView mediaSelectorView, C9761b c9761b) {
        mediaSelectorView.f38925b = c9761b;
    }
}
