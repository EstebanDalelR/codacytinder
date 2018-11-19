package com.tinder.chat.view;

import com.tinder.chat.view.provider.C8508j;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class al implements MembersInjector<ChatInputSendButtonView> {
    /* renamed from: a */
    private final Provider<C8508j> f34430a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42689a((ChatInputSendButtonView) obj);
    }

    /* renamed from: a */
    public void m42689a(ChatInputSendButtonView chatInputSendButtonView) {
        m42688a(chatInputSendButtonView, (C8508j) this.f34430a.get());
    }

    /* renamed from: a */
    public static void m42688a(ChatInputSendButtonView chatInputSendButtonView, C8508j c8508j) {
        chatInputSendButtonView.f30090a = c8508j;
    }
}
