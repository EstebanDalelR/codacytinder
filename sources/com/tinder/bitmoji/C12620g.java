package com.tinder.bitmoji;

import com.tinder.bitmoji.repository.BitmojiImageUrlRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.bitmoji.g */
public final class C12620g implements Factory<C10377f> {
    /* renamed from: a */
    private final Provider<BitmojiImageUrlRepository> f40722a;

    public /* synthetic */ Object get() {
        return m49844a();
    }

    public C12620g(Provider<BitmojiImageUrlRepository> provider) {
        this.f40722a = provider;
    }

    /* renamed from: a */
    public C10377f m49844a() {
        return C12620g.m49842a(this.f40722a);
    }

    /* renamed from: a */
    public static C10377f m49842a(Provider<BitmojiImageUrlRepository> provider) {
        return new C10377f((BitmojiImageUrlRepository) provider.get());
    }

    /* renamed from: b */
    public static C12620g m49843b(Provider<BitmojiImageUrlRepository> provider) {
        return new C12620g(provider);
    }
}
