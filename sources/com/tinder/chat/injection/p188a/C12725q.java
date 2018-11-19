package com.tinder.chat.injection.p188a;

import com.tinder.data.keyboard.C10789c;
import com.tinder.data.keyboard.KeyboardHeightProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.q */
public final class C12725q implements Factory<KeyboardHeightProvider> {
    /* renamed from: a */
    private final C8440a f41038a;
    /* renamed from: b */
    private final Provider<C10789c> f41039b;

    public /* synthetic */ Object get() {
        return m50082a();
    }

    public C12725q(C8440a c8440a, Provider<C10789c> provider) {
        this.f41038a = c8440a;
        this.f41039b = provider;
    }

    /* renamed from: a */
    public KeyboardHeightProvider m50082a() {
        return C12725q.m50080a(this.f41038a, this.f41039b);
    }

    /* renamed from: a */
    public static KeyboardHeightProvider m50080a(C8440a c8440a, Provider<C10789c> provider) {
        return C12725q.m50079a(c8440a, (C10789c) provider.get());
    }

    /* renamed from: b */
    public static C12725q m50081b(C8440a c8440a, Provider<C10789c> provider) {
        return new C12725q(c8440a, provider);
    }

    /* renamed from: a */
    public static KeyboardHeightProvider m50079a(C8440a c8440a, C10789c c10789c) {
        return (KeyboardHeightProvider) C15521i.a(c8440a.m36021a(c10789c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
