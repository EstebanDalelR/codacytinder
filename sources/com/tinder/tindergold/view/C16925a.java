package com.tinder.tindergold.view;

import com.tinder.tindergold.p427b.C15184a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.tindergold.view.a */
public final class C16925a implements MembersInjector<TinderGoldIntroDialog> {
    /* renamed from: a */
    private final Provider<C15184a> f52144a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62597a((TinderGoldIntroDialog) obj);
    }

    /* renamed from: a */
    public void m62597a(TinderGoldIntroDialog tinderGoldIntroDialog) {
        C16925a.m62596a(tinderGoldIntroDialog, (C15184a) this.f52144a.get());
    }

    /* renamed from: a */
    public static void m62596a(TinderGoldIntroDialog tinderGoldIntroDialog, C15184a c15184a) {
        tinderGoldIntroDialog.f52136b = c15184a;
    }
}
