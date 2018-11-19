package com.tinder.loops.engine.extraction.retriever;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.engine.extraction.retriever.b */
public final class C13378b implements Factory<C11948a> {
    /* renamed from: a */
    private final Provider<Context> f42396a;

    public /* synthetic */ Object get() {
        return m51738a();
    }

    public C13378b(Provider<Context> provider) {
        this.f42396a = provider;
    }

    /* renamed from: a */
    public C11948a m51738a() {
        return C13378b.m51736a(this.f42396a);
    }

    /* renamed from: a */
    public static C11948a m51736a(Provider<Context> provider) {
        return new C11948a((Context) provider.get());
    }

    /* renamed from: b */
    public static C13378b m51737b(Provider<Context> provider) {
        return new C13378b(provider);
    }
}
