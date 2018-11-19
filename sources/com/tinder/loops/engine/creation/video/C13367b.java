package com.tinder.loops.engine.creation.video;

import com.tinder.loops.engine.creation.p276c.C9777a;
import com.tinder.loops.engine.creation.p276c.C9778c;
import com.tinder.loops.engine.creation.p278e.C9785a;
import com.tinder.loops.engine.extraction.p279a.C9790a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.engine.creation.video.b */
public final class C13367b implements Factory<C11936a> {
    /* renamed from: a */
    private final Provider<C9778c> f42376a;
    /* renamed from: b */
    private final Provider<C9777a> f42377b;
    /* renamed from: c */
    private final Provider<C9790a> f42378c;
    /* renamed from: d */
    private final Provider<C9785a> f42379d;

    public /* synthetic */ Object get() {
        return m51705a();
    }

    public C13367b(Provider<C9778c> provider, Provider<C9777a> provider2, Provider<C9790a> provider3, Provider<C9785a> provider4) {
        this.f42376a = provider;
        this.f42377b = provider2;
        this.f42378c = provider3;
        this.f42379d = provider4;
    }

    /* renamed from: a */
    public C11936a m51705a() {
        return C13367b.m51703a(this.f42376a, this.f42377b, this.f42378c, this.f42379d);
    }

    /* renamed from: a */
    public static C11936a m51703a(Provider<C9778c> provider, Provider<C9777a> provider2, Provider<C9790a> provider3, Provider<C9785a> provider4) {
        return new C11936a((C9778c) provider.get(), (C9777a) provider2.get(), (C9790a) provider3.get(), (C9785a) provider4.get());
    }

    /* renamed from: b */
    public static C13367b m51704b(Provider<C9778c> provider, Provider<C9777a> provider2, Provider<C9790a> provider3, Provider<C9785a> provider4) {
        return new C13367b(provider, provider2, provider3, provider4);
    }
}
