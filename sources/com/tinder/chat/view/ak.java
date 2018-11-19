package com.tinder.chat.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.chat.analytics.af;
import com.tinder.chat.presenter.C8447u;
import com.tinder.chat.view.provider.C8507f;
import com.tinder.chat.view.provider.ChatInputGifSelectorStateUpdatesNotifier;
import com.tinder.data.keyboard.KeyboardHeightProvider;
import com.tinder.reactions.drawer.mediator.C14629b;
import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ak implements MembersInjector<ChatInputBoxContainer> {
    /* renamed from: a */
    private final Provider<C8447u> f34421a;
    /* renamed from: b */
    private final Provider<String> f34422b;
    /* renamed from: c */
    private final Provider<af> f34423c;
    /* renamed from: d */
    private final Provider<C8507f> f34424d;
    /* renamed from: e */
    private final Provider<ChatInputGifSelectorStateUpdatesNotifier> f34425e;
    /* renamed from: f */
    private final Provider<C14629b> f34426f;
    /* renamed from: g */
    private final Provider<TypingIndicatorExperimentUtility> f34427g;
    /* renamed from: h */
    private final Provider<Lifecycle> f34428h;
    /* renamed from: i */
    private final Provider<KeyboardHeightProvider> f34429i;

    public /* synthetic */ void injectMembers(Object obj) {
        m42687a((ChatInputBoxContainer) obj);
    }

    /* renamed from: a */
    public void m42687a(ChatInputBoxContainer chatInputBoxContainer) {
        m42680a(chatInputBoxContainer, (C8447u) this.f34421a.get());
        m42686a(chatInputBoxContainer, (String) this.f34422b.get());
        m42679a(chatInputBoxContainer, (af) this.f34423c.get());
        m42682a(chatInputBoxContainer, (C8507f) this.f34424d.get());
        m42681a(chatInputBoxContainer, (ChatInputGifSelectorStateUpdatesNotifier) this.f34425e.get());
        m42684a(chatInputBoxContainer, (C14629b) this.f34426f.get());
        m42685a(chatInputBoxContainer, (TypingIndicatorExperimentUtility) this.f34427g.get());
        m42678a(chatInputBoxContainer, (Lifecycle) this.f34428h.get());
        m42683a(chatInputBoxContainer, (KeyboardHeightProvider) this.f34429i.get());
    }

    /* renamed from: a */
    public static void m42680a(ChatInputBoxContainer chatInputBoxContainer, C8447u c8447u) {
        chatInputBoxContainer.f12241a = c8447u;
    }

    /* renamed from: a */
    public static void m42686a(ChatInputBoxContainer chatInputBoxContainer, String str) {
        chatInputBoxContainer.f12242b = str;
    }

    /* renamed from: a */
    public static void m42679a(ChatInputBoxContainer chatInputBoxContainer, af afVar) {
        chatInputBoxContainer.f12243c = afVar;
    }

    /* renamed from: a */
    public static void m42682a(ChatInputBoxContainer chatInputBoxContainer, C8507f c8507f) {
        chatInputBoxContainer.f12244d = c8507f;
    }

    /* renamed from: a */
    public static void m42681a(ChatInputBoxContainer chatInputBoxContainer, ChatInputGifSelectorStateUpdatesNotifier chatInputGifSelectorStateUpdatesNotifier) {
        chatInputBoxContainer.f12245e = chatInputGifSelectorStateUpdatesNotifier;
    }

    /* renamed from: a */
    public static void m42684a(ChatInputBoxContainer chatInputBoxContainer, C14629b c14629b) {
        chatInputBoxContainer.f12246f = c14629b;
    }

    /* renamed from: a */
    public static void m42685a(ChatInputBoxContainer chatInputBoxContainer, TypingIndicatorExperimentUtility typingIndicatorExperimentUtility) {
        chatInputBoxContainer.f12247g = typingIndicatorExperimentUtility;
    }

    /* renamed from: a */
    public static void m42678a(ChatInputBoxContainer chatInputBoxContainer, Lifecycle lifecycle) {
        chatInputBoxContainer.f12248h = lifecycle;
    }

    /* renamed from: a */
    public static void m42683a(ChatInputBoxContainer chatInputBoxContainer, KeyboardHeightProvider keyboardHeightProvider) {
        chatInputBoxContainer.f12249i = keyboardHeightProvider;
    }
}
