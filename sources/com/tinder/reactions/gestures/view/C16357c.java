package com.tinder.reactions.gestures.view;

import com.tinder.reactions.gestures.p394b.C14653c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.gestures.view.c */
public final class C16357c implements MembersInjector<GrandGestureMatchAvatarView> {
    /* renamed from: a */
    private final Provider<C14653c> f50888a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61711a((GrandGestureMatchAvatarView) obj);
    }

    /* renamed from: a */
    public void m61711a(GrandGestureMatchAvatarView grandGestureMatchAvatarView) {
        C16357c.m61710a(grandGestureMatchAvatarView, (C14653c) this.f50888a.get());
    }

    /* renamed from: a */
    public static void m61710a(GrandGestureMatchAvatarView grandGestureMatchAvatarView, C14653c c14653c) {
        grandGestureMatchAvatarView.f50871a = c14653c;
    }
}
