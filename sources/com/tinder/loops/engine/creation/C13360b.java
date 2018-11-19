package com.tinder.loops.engine.creation;

import com.tinder.loops.engine.creation.video.VideoCreator;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.engine.creation.b */
public final class C13360b implements Factory<C11933a> {
    /* renamed from: a */
    private final Provider<VideoCreator> f42367a;
    /* renamed from: b */
    private final Provider<C9779c> f42368b;

    public /* synthetic */ Object get() {
        return m51684a();
    }

    public C13360b(Provider<VideoCreator> provider, Provider<C9779c> provider2) {
        this.f42367a = provider;
        this.f42368b = provider2;
    }

    /* renamed from: a */
    public C11933a m51684a() {
        return C13360b.m51682a(this.f42367a, this.f42368b);
    }

    /* renamed from: a */
    public static C11933a m51682a(Provider<VideoCreator> provider, Provider<C9779c> provider2) {
        return new C11933a((VideoCreator) provider.get(), (C9779c) provider2.get());
    }

    /* renamed from: b */
    public static C13360b m51683b(Provider<VideoCreator> provider, Provider<C9779c> provider2) {
        return new C13360b(provider, provider2);
    }
}
