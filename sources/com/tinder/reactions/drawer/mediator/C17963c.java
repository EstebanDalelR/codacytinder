package com.tinder.reactions.drawer.mediator;

import com.tinder.chat.view.provider.ChatInputGifSelectorStateUpdatesProvider;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.drawer.mediator.c */
public final class C17963c implements Factory<C14629b> {
    /* renamed from: a */
    private final Provider<ChatInputTextStateUpdatesProvider> f55895a;
    /* renamed from: b */
    private final Provider<ChatInputGifSelectorStateUpdatesProvider> f55896b;

    public /* synthetic */ Object get() {
        return m65298a();
    }

    public C17963c(Provider<ChatInputTextStateUpdatesProvider> provider, Provider<ChatInputGifSelectorStateUpdatesProvider> provider2) {
        this.f55895a = provider;
        this.f55896b = provider2;
    }

    /* renamed from: a */
    public C14629b m65298a() {
        return C17963c.m65296a(this.f55895a, this.f55896b);
    }

    /* renamed from: a */
    public static C14629b m65296a(Provider<ChatInputTextStateUpdatesProvider> provider, Provider<ChatInputGifSelectorStateUpdatesProvider> provider2) {
        return new C14629b((ChatInputTextStateUpdatesProvider) provider.get(), (ChatInputGifSelectorStateUpdatesProvider) provider2.get());
    }

    /* renamed from: b */
    public static C17963c m65297b(Provider<ChatInputTextStateUpdatesProvider> provider, Provider<ChatInputGifSelectorStateUpdatesProvider> provider2) {
        return new C17963c(provider, provider2);
    }
}
