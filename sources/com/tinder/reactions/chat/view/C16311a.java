package com.tinder.reactions.chat.view;

import com.tinder.reactions.chat.feature.C16298b;
import com.tinder.reactions.chat.feature.C16299d;
import com.tinder.reactions.chat.p386a.C14599c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.chat.view.a */
public final class C16311a implements MembersInjector<ChatInputExpandButtonView> {
    /* renamed from: a */
    private final Provider<C14599c> f50746a;
    /* renamed from: b */
    private final Provider<C16298b> f50747b;
    /* renamed from: c */
    private final Provider<C16299d> f50748c;

    public /* synthetic */ void injectMembers(Object obj) {
        m61517a((ChatInputExpandButtonView) obj);
    }

    /* renamed from: a */
    public void m61517a(ChatInputExpandButtonView chatInputExpandButtonView) {
        C16311a.m61514a(chatInputExpandButtonView, (C14599c) this.f50746a.get());
        C16311a.m61515a(chatInputExpandButtonView, (C16298b) this.f50747b.get());
        C16311a.m61516a(chatInputExpandButtonView, (C16299d) this.f50748c.get());
    }

    /* renamed from: a */
    public static void m61514a(ChatInputExpandButtonView chatInputExpandButtonView, C14599c c14599c) {
        chatInputExpandButtonView.f46101a = c14599c;
    }

    /* renamed from: a */
    public static void m61515a(ChatInputExpandButtonView chatInputExpandButtonView, C16298b c16298b) {
        chatInputExpandButtonView.f46102b = c16298b;
    }

    /* renamed from: a */
    public static void m61516a(ChatInputExpandButtonView chatInputExpandButtonView, C16299d c16299d) {
        chatInputExpandButtonView.f46103c = c16299d;
    }
}
