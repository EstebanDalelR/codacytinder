package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.provider.C10647l;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.g */
public final class C12715g implements Factory<ChatInputTextStateUpdatesProvider> {
    /* renamed from: a */
    private final C8440a f41018a;
    /* renamed from: b */
    private final Provider<C10647l> f41019b;

    public /* synthetic */ Object get() {
        return m50044a();
    }

    public C12715g(C8440a c8440a, Provider<C10647l> provider) {
        this.f41018a = c8440a;
        this.f41019b = provider;
    }

    /* renamed from: a */
    public ChatInputTextStateUpdatesProvider m50044a() {
        return C12715g.m50042a(this.f41018a, this.f41019b);
    }

    /* renamed from: a */
    public static ChatInputTextStateUpdatesProvider m50042a(C8440a c8440a, Provider<C10647l> provider) {
        return C12715g.m50041a(c8440a, (C10647l) provider.get());
    }

    /* renamed from: b */
    public static C12715g m50043b(C8440a c8440a, Provider<C10647l> provider) {
        return new C12715g(c8440a, provider);
    }

    /* renamed from: a */
    public static ChatInputTextStateUpdatesProvider m50041a(C8440a c8440a, C10647l c10647l) {
        return (ChatInputTextStateUpdatesProvider) C15521i.a(c8440a.m36018a(c10647l), "Cannot return null from a non-@Nullable @Provides method");
    }
}
