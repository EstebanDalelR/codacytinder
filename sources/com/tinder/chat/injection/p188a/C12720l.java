package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.provider.C10645d;
import com.tinder.chat.view.provider.ChatEmptyStateNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.l */
public final class C12720l implements Factory<ChatEmptyStateNotifier> {
    /* renamed from: a */
    private final C8440a f41027a;
    /* renamed from: b */
    private final Provider<C10645d> f41028b;

    public /* synthetic */ Object get() {
        return m50063a();
    }

    public C12720l(C8440a c8440a, Provider<C10645d> provider) {
        this.f41027a = c8440a;
        this.f41028b = provider;
    }

    /* renamed from: a */
    public ChatEmptyStateNotifier m50063a() {
        return C12720l.m50061a(this.f41027a, this.f41028b);
    }

    /* renamed from: a */
    public static ChatEmptyStateNotifier m50061a(C8440a c8440a, Provider<C10645d> provider) {
        return C12720l.m50060a(c8440a, (C10645d) provider.get());
    }

    /* renamed from: b */
    public static C12720l m50062b(C8440a c8440a, Provider<C10645d> provider) {
        return new C12720l(c8440a, provider);
    }

    /* renamed from: a */
    public static ChatEmptyStateNotifier m50060a(C8440a c8440a, C10645d c10645d) {
        return (ChatEmptyStateNotifier) C15521i.a(c8440a.m36026b(c10645d), "Cannot return null from a non-@Nullable @Provides method");
    }
}
