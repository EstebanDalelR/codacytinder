package com.tinder.chat.injection.p188a;

import com.tinder.data.keyboard.C10789c;
import com.tinder.data.keyboard.KeyboardHeightNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.p */
public final class C12724p implements Factory<KeyboardHeightNotifier> {
    /* renamed from: a */
    private final C8440a f41036a;
    /* renamed from: b */
    private final Provider<C10789c> f41037b;

    public /* synthetic */ Object get() {
        return m50078a();
    }

    public C12724p(C8440a c8440a, Provider<C10789c> provider) {
        this.f41036a = c8440a;
        this.f41037b = provider;
    }

    /* renamed from: a */
    public KeyboardHeightNotifier m50078a() {
        return C12724p.m50076a(this.f41036a, this.f41037b);
    }

    /* renamed from: a */
    public static KeyboardHeightNotifier m50076a(C8440a c8440a, Provider<C10789c> provider) {
        return C12724p.m50075a(c8440a, (C10789c) provider.get());
    }

    /* renamed from: b */
    public static C12724p m50077b(C8440a c8440a, Provider<C10789c> provider) {
        return new C12724p(c8440a, provider);
    }

    /* renamed from: a */
    public static KeyboardHeightNotifier m50075a(C8440a c8440a, C10789c c10789c) {
        return (KeyboardHeightNotifier) C15521i.a(c8440a.m36030b(c10789c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
