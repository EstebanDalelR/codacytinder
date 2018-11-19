package com.tinder.reactions.drawer.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.chat.presenter.C8450z;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesNotifier;
import com.tinder.reactions.chat.feature.C16298b;
import com.tinder.reactions.drawer.provider.C14637a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.drawer.view.c */
public final class C16331c implements MembersInjector<ChatInputEditText> {
    /* renamed from: a */
    private final Provider<C14637a> f50821a;
    /* renamed from: b */
    private final Provider<ChatInputTextStateUpdatesNotifier> f50822b;
    /* renamed from: c */
    private final Provider<C16298b> f50823c;
    /* renamed from: d */
    private final Provider<C8450z> f50824d;
    /* renamed from: e */
    private final Provider<Lifecycle> f50825e;

    public /* synthetic */ void injectMembers(Object obj) {
        m61623a((ChatInputEditText) obj);
    }

    /* renamed from: a */
    public void m61623a(ChatInputEditText chatInputEditText) {
        C16331c.m61622a(chatInputEditText, (C14637a) this.f50821a.get());
        C16331c.m61620a(chatInputEditText, (ChatInputTextStateUpdatesNotifier) this.f50822b.get());
        C16331c.m61621a(chatInputEditText, (C16298b) this.f50823c.get());
        C16331c.m61619a(chatInputEditText, (C8450z) this.f50824d.get());
        C16331c.m61618a(chatInputEditText, (Lifecycle) this.f50825e.get());
    }

    /* renamed from: a */
    public static void m61622a(ChatInputEditText chatInputEditText, C14637a c14637a) {
        chatInputEditText.f14706a = c14637a;
    }

    /* renamed from: a */
    public static void m61620a(ChatInputEditText chatInputEditText, ChatInputTextStateUpdatesNotifier chatInputTextStateUpdatesNotifier) {
        chatInputEditText.f14707b = chatInputTextStateUpdatesNotifier;
    }

    /* renamed from: a */
    public static void m61621a(ChatInputEditText chatInputEditText, C16298b c16298b) {
        chatInputEditText.f14708c = c16298b;
    }

    /* renamed from: a */
    public static void m61619a(ChatInputEditText chatInputEditText, C8450z c8450z) {
        chatInputEditText.f14709d = c8450z;
    }

    /* renamed from: a */
    public static void m61618a(ChatInputEditText chatInputEditText, Lifecycle lifecycle) {
        chatInputEditText.f14710e = lifecycle;
    }
}
