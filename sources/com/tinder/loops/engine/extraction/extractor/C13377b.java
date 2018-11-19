package com.tinder.loops.engine.extraction.extractor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.engine.extraction.extractor.b */
public final class C13377b implements Factory<C11947a> {
    /* renamed from: a */
    private final Provider<Context> f42395a;

    public /* synthetic */ Object get() {
        return m51735a();
    }

    public C13377b(Provider<Context> provider) {
        this.f42395a = provider;
    }

    /* renamed from: a */
    public C11947a m51735a() {
        return C13377b.m51733a(this.f42395a);
    }

    /* renamed from: a */
    public static C11947a m51733a(Provider<Context> provider) {
        return new C11947a((Context) provider.get());
    }

    /* renamed from: b */
    public static C13377b m51734b(Provider<Context> provider) {
        return new C13377b(provider);
    }
}
