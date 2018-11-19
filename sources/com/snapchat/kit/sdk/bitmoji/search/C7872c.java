package com.snapchat.kit.sdk.bitmoji.search;

import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5891c;
import com.snapchat.kit.sdk.bitmoji.search.StickerIndexingTask.OnIndexCompleteListener;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.search.c */
public final class C7872c implements Factory<StickerIndexingTask> {
    /* renamed from: a */
    private final Provider<OnIndexCompleteListener> f28383a;
    /* renamed from: b */
    private final Provider<C5891c> f28384b;

    public /* synthetic */ Object get() {
        return m33676a();
    }

    public C7872c(Provider<OnIndexCompleteListener> provider, Provider<C5891c> provider2) {
        this.f28383a = provider;
        this.f28384b = provider2;
    }

    /* renamed from: a */
    public StickerIndexingTask m33676a() {
        return new StickerIndexingTask((OnIndexCompleteListener) this.f28383a.get(), (C5891c) this.f28384b.get());
    }

    /* renamed from: a */
    public static Factory<StickerIndexingTask> m33675a(Provider<OnIndexCompleteListener> provider, Provider<C5891c> provider2) {
        return new C7872c(provider, provider2);
    }
}
