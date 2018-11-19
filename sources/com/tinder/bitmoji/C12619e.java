package com.tinder.bitmoji;

import com.tinder.bitmoji.repository.BitmojiAuthRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.bitmoji.e */
public final class C12619e implements Factory<C10376d> {
    /* renamed from: a */
    private final Provider<BitmojiAuthRepository> f40721a;

    public /* synthetic */ Object get() {
        return m49841a();
    }

    public C12619e(Provider<BitmojiAuthRepository> provider) {
        this.f40721a = provider;
    }

    /* renamed from: a */
    public C10376d m49841a() {
        return C12619e.m49839a(this.f40721a);
    }

    /* renamed from: a */
    public static C10376d m49839a(Provider<BitmojiAuthRepository> provider) {
        return new C10376d((BitmojiAuthRepository) provider.get());
    }

    /* renamed from: b */
    public static C12619e m49840b(Provider<BitmojiAuthRepository> provider) {
        return new C12619e(provider);
    }
}
