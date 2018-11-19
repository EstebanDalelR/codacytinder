package com.tinder.fastmatch;

import com.tinder.domain.fastmatch.repository.FastMatchRecsResponseRepository;
import com.tinder.fastmatch.p244b.C11621a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.b */
public final class C13188b implements Factory<FastMatchRecsResponseRepository> {
    /* renamed from: a */
    private final C9370a f41879a;
    /* renamed from: b */
    private final Provider<C11621a> f41880b;

    public /* synthetic */ Object get() {
        return m51141a();
    }

    public C13188b(C9370a c9370a, Provider<C11621a> provider) {
        this.f41879a = c9370a;
        this.f41880b = provider;
    }

    /* renamed from: a */
    public FastMatchRecsResponseRepository m51141a() {
        return C13188b.m51139a(this.f41879a, this.f41880b);
    }

    /* renamed from: a */
    public static FastMatchRecsResponseRepository m51139a(C9370a c9370a, Provider<C11621a> provider) {
        return C13188b.m51138a(c9370a, (C11621a) provider.get());
    }

    /* renamed from: b */
    public static C13188b m51140b(C9370a c9370a, Provider<C11621a> provider) {
        return new C13188b(c9370a, provider);
    }

    /* renamed from: a */
    public static FastMatchRecsResponseRepository m51138a(C9370a c9370a, C11621a c11621a) {
        return (FastMatchRecsResponseRepository) C15521i.a(c9370a.m39225a(c11621a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
