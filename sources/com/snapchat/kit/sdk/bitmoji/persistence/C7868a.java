package com.snapchat.kit.sdk.bitmoji.persistence;

import com.google.gson.Gson;
import dagger.internal.Factory;
import java.io.File;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.persistence.a */
public final class C7868a implements Factory<StickerPacksCache> {
    /* renamed from: a */
    private final Provider<ExecutorService> f28377a;
    /* renamed from: b */
    private final Provider<File> f28378b;
    /* renamed from: c */
    private final Provider<Gson> f28379c;

    public /* synthetic */ Object get() {
        return m33668a();
    }

    public C7868a(Provider<ExecutorService> provider, Provider<File> provider2, Provider<Gson> provider3) {
        this.f28377a = provider;
        this.f28378b = provider2;
        this.f28379c = provider3;
    }

    /* renamed from: a */
    public StickerPacksCache m33668a() {
        return new StickerPacksCache((ExecutorService) this.f28377a.get(), (File) this.f28378b.get(), (Gson) this.f28379c.get());
    }

    /* renamed from: a */
    public static Factory<StickerPacksCache> m33667a(Provider<ExecutorService> provider, Provider<File> provider2, Provider<Gson> provider3) {
        return new C7868a(provider, provider2, provider3);
    }
}
