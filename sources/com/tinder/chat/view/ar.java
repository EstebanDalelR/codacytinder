package com.tinder.chat.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.chat.adapter.C8411d;
import com.tinder.chat.adapter.ChatItemsAdapter;
import com.tinder.chat.presenter.ad;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ar implements MembersInjector<ChatViewContainer> {
    /* renamed from: a */
    private final Provider<String> f34435a;
    /* renamed from: b */
    private final Provider<ChatItemsAdapter> f34436b;
    /* renamed from: c */
    private final Provider<ad> f34437c;
    /* renamed from: d */
    private final Provider<C8411d> f34438d;
    /* renamed from: e */
    private final Provider<Lifecycle> f34439e;

    public /* synthetic */ void injectMembers(Object obj) {
        m42699a((ChatViewContainer) obj);
    }

    /* renamed from: a */
    public void m42699a(ChatViewContainer chatViewContainer) {
        m42698a(chatViewContainer, (String) this.f34435a.get());
        m42695a(chatViewContainer, (ChatItemsAdapter) this.f34436b.get());
        m42697a(chatViewContainer, (ad) this.f34437c.get());
        m42696a(chatViewContainer, (C8411d) this.f34438d.get());
        m42694a(chatViewContainer, (Lifecycle) this.f34439e.get());
    }

    /* renamed from: a */
    public static void m42698a(ChatViewContainer chatViewContainer, String str) {
        chatViewContainer.f12267a = str;
    }

    /* renamed from: a */
    public static void m42695a(ChatViewContainer chatViewContainer, ChatItemsAdapter chatItemsAdapter) {
        chatViewContainer.f12268b = chatItemsAdapter;
    }

    /* renamed from: a */
    public static void m42697a(ChatViewContainer chatViewContainer, ad adVar) {
        chatViewContainer.f12269c = adVar;
    }

    /* renamed from: a */
    public static void m42696a(ChatViewContainer chatViewContainer, C8411d c8411d) {
        chatViewContainer.f12270d = c8411d;
    }

    /* renamed from: a */
    public static void m42694a(ChatViewContainer chatViewContainer, Lifecycle lifecycle) {
        chatViewContainer.f12271e = lifecycle;
    }
}
