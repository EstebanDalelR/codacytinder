package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.provider.C10649u;
import com.tinder.chat.view.provider.ChatNewMessagesProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.i */
public final class C12717i implements Factory<ChatNewMessagesProvider> {
    /* renamed from: a */
    private final C8440a f41022a;
    /* renamed from: b */
    private final Provider<C10649u> f41023b;

    public /* synthetic */ Object get() {
        return m50052a();
    }

    public C12717i(C8440a c8440a, Provider<C10649u> provider) {
        this.f41022a = c8440a;
        this.f41023b = provider;
    }

    /* renamed from: a */
    public ChatNewMessagesProvider m50052a() {
        return C12717i.m50050a(this.f41022a, this.f41023b);
    }

    /* renamed from: a */
    public static ChatNewMessagesProvider m50050a(C8440a c8440a, Provider<C10649u> provider) {
        return C12717i.m50049a(c8440a, (C10649u) provider.get());
    }

    /* renamed from: b */
    public static C12717i m50051b(C8440a c8440a, Provider<C10649u> provider) {
        return new C12717i(c8440a, provider);
    }

    /* renamed from: a */
    public static ChatNewMessagesProvider m50049a(C8440a c8440a, C10649u c10649u) {
        return (ChatNewMessagesProvider) C15521i.a(c8440a.m36019a(c10649u), "Cannot return null from a non-@Nullable @Provides method");
    }
}
