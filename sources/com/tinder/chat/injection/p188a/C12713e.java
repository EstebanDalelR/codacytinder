package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.provider.C10646h;
import com.tinder.chat.view.provider.ChatInputGifSelectorStateUpdatesProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.e */
public final class C12713e implements Factory<ChatInputGifSelectorStateUpdatesProvider> {
    /* renamed from: a */
    private final C8440a f41014a;
    /* renamed from: b */
    private final Provider<C10646h> f41015b;

    public /* synthetic */ Object get() {
        return m50037a();
    }

    public C12713e(C8440a c8440a, Provider<C10646h> provider) {
        this.f41014a = c8440a;
        this.f41015b = provider;
    }

    /* renamed from: a */
    public ChatInputGifSelectorStateUpdatesProvider m50037a() {
        return C12713e.m50035a(this.f41014a, this.f41015b);
    }

    /* renamed from: a */
    public static ChatInputGifSelectorStateUpdatesProvider m50035a(C8440a c8440a, Provider<C10646h> provider) {
        return C12713e.m50034a(c8440a, (C10646h) provider.get());
    }

    /* renamed from: b */
    public static C12713e m50036b(C8440a c8440a, Provider<C10646h> provider) {
        return new C12713e(c8440a, provider);
    }

    /* renamed from: a */
    public static ChatInputGifSelectorStateUpdatesProvider m50034a(C8440a c8440a, C10646h c10646h) {
        return (ChatInputGifSelectorStateUpdatesProvider) C15521i.a(c8440a.m36017a(c10646h), "Cannot return null from a non-@Nullable @Provides method");
    }
}
