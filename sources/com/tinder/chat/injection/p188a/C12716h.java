package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.provider.C10649u;
import com.tinder.chat.view.provider.ChatNewMessagesNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.h */
public final class C12716h implements Factory<ChatNewMessagesNotifier> {
    /* renamed from: a */
    private final C8440a f41020a;
    /* renamed from: b */
    private final Provider<C10649u> f41021b;

    public /* synthetic */ Object get() {
        return m50048a();
    }

    public C12716h(C8440a c8440a, Provider<C10649u> provider) {
        this.f41020a = c8440a;
        this.f41021b = provider;
    }

    /* renamed from: a */
    public ChatNewMessagesNotifier m50048a() {
        return C12716h.m50046a(this.f41020a, this.f41021b);
    }

    /* renamed from: a */
    public static ChatNewMessagesNotifier m50046a(C8440a c8440a, Provider<C10649u> provider) {
        return C12716h.m50045a(c8440a, (C10649u) provider.get());
    }

    /* renamed from: b */
    public static C12716h m50047b(C8440a c8440a, Provider<C10649u> provider) {
        return new C12716h(c8440a, provider);
    }

    /* renamed from: a */
    public static ChatNewMessagesNotifier m50045a(C8440a c8440a, C10649u c10649u) {
        return (ChatNewMessagesNotifier) C15521i.a(c8440a.m36029b(c10649u), "Cannot return null from a non-@Nullable @Provides method");
    }
}
