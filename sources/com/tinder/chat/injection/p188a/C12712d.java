package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.provider.C10646h;
import com.tinder.chat.view.provider.ChatInputGifSelectorStateUpdatesNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.d */
public final class C12712d implements Factory<ChatInputGifSelectorStateUpdatesNotifier> {
    /* renamed from: a */
    private final C8440a f41012a;
    /* renamed from: b */
    private final Provider<C10646h> f41013b;

    public /* synthetic */ Object get() {
        return m50033a();
    }

    /* renamed from: a */
    public ChatInputGifSelectorStateUpdatesNotifier m50033a() {
        return C12712d.m50032a(this.f41012a, this.f41013b);
    }

    /* renamed from: a */
    public static ChatInputGifSelectorStateUpdatesNotifier m50032a(C8440a c8440a, Provider<C10646h> provider) {
        return C12712d.m50031a(c8440a, (C10646h) provider.get());
    }

    /* renamed from: a */
    public static ChatInputGifSelectorStateUpdatesNotifier m50031a(C8440a c8440a, C10646h c10646h) {
        return (ChatInputGifSelectorStateUpdatesNotifier) C15521i.a(c8440a.m36027b(c10646h), "Cannot return null from a non-@Nullable @Provides method");
    }
}
