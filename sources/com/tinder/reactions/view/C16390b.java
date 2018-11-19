package com.tinder.reactions.view;

import com.tinder.chat.view.provider.ChatInputTextStateUpdatesProvider;
import com.tinder.reactions.audio.C14589a;
import com.tinder.reactions.drawer.mediator.C14633g;
import com.tinder.reactions.drawer.p464a.C16317a;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.p384b.C14594a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.view.b */
public final class C16390b implements MembersInjector<GrandGestureLayout> {
    /* renamed from: a */
    private final Provider<ChatInputTextStateUpdatesProvider> f50976a;
    /* renamed from: b */
    private final Provider<C14633g> f50977b;
    /* renamed from: c */
    private final Provider<C14641a> f50978c;
    /* renamed from: d */
    private final Provider<C16317a> f50979d;
    /* renamed from: e */
    private final Provider<C14594a> f50980e;
    /* renamed from: f */
    private final Provider<C14589a> f50981f;

    public /* synthetic */ void injectMembers(Object obj) {
        m61808a((GrandGestureLayout) obj);
    }

    /* renamed from: a */
    public void m61808a(GrandGestureLayout grandGestureLayout) {
        C16390b.m61802a(grandGestureLayout, (ChatInputTextStateUpdatesProvider) this.f50976a.get());
        C16390b.m61806a(grandGestureLayout, (C14633g) this.f50977b.get());
        C16390b.m61807a(grandGestureLayout, (C14641a) this.f50978c.get());
        C16390b.m61805a(grandGestureLayout, (C16317a) this.f50979d.get());
        C16390b.m61804a(grandGestureLayout, (C14594a) this.f50980e.get());
        C16390b.m61803a(grandGestureLayout, (C14589a) this.f50981f.get());
    }

    /* renamed from: a */
    public static void m61802a(GrandGestureLayout grandGestureLayout, ChatInputTextStateUpdatesProvider chatInputTextStateUpdatesProvider) {
        grandGestureLayout.f50958b = chatInputTextStateUpdatesProvider;
    }

    /* renamed from: a */
    public static void m61806a(GrandGestureLayout grandGestureLayout, C14633g c14633g) {
        grandGestureLayout.f50959c = c14633g;
    }

    /* renamed from: a */
    public static void m61807a(GrandGestureLayout grandGestureLayout, C14641a c14641a) {
        grandGestureLayout.f50960d = c14641a;
    }

    /* renamed from: a */
    public static void m61805a(GrandGestureLayout grandGestureLayout, C16317a c16317a) {
        grandGestureLayout.f50961e = c16317a;
    }

    /* renamed from: a */
    public static void m61804a(GrandGestureLayout grandGestureLayout, C14594a c14594a) {
        grandGestureLayout.f50962f = c14594a;
    }

    /* renamed from: a */
    public static void m61803a(GrandGestureLayout grandGestureLayout, C14589a c14589a) {
        grandGestureLayout.f50963g = c14589a;
    }
}
