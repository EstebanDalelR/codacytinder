package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.provider.C10645d;
import com.tinder.chat.view.provider.ChatEmptyStateProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.m */
public final class C12721m implements Factory<ChatEmptyStateProvider> {
    /* renamed from: a */
    private final C8440a f41029a;
    /* renamed from: b */
    private final Provider<C10645d> f41030b;

    public /* synthetic */ Object get() {
        return m50067a();
    }

    public C12721m(C8440a c8440a, Provider<C10645d> provider) {
        this.f41029a = c8440a;
        this.f41030b = provider;
    }

    /* renamed from: a */
    public ChatEmptyStateProvider m50067a() {
        return C12721m.m50065a(this.f41029a, this.f41030b);
    }

    /* renamed from: a */
    public static ChatEmptyStateProvider m50065a(C8440a c8440a, Provider<C10645d> provider) {
        return C12721m.m50064a(c8440a, (C10645d) provider.get());
    }

    /* renamed from: b */
    public static C12721m m50066b(C8440a c8440a, Provider<C10645d> provider) {
        return new C12721m(c8440a, provider);
    }

    /* renamed from: a */
    public static ChatEmptyStateProvider m50064a(C8440a c8440a, C10645d c10645d) {
        return (ChatEmptyStateProvider) C15521i.a(c8440a.m36016a(c10645d), "Cannot return null from a non-@Nullable @Provides method");
    }
}
