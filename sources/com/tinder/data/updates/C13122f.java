package com.tinder.data.updates;

import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.data.updates.f */
public final class C13122f implements Factory<C8803e> {
    /* renamed from: a */
    private final Provider<C15679f> f41767a;

    public /* synthetic */ Object get() {
        return m51013a();
    }

    public C13122f(Provider<C15679f> provider) {
        this.f41767a = provider;
    }

    /* renamed from: a */
    public C8803e m51013a() {
        return C13122f.m51011a(this.f41767a);
    }

    /* renamed from: a */
    public static C8803e m51011a(Provider<C15679f> provider) {
        return new C8803e((C15679f) provider.get());
    }

    /* renamed from: b */
    public static C13122f m51012b(Provider<C15679f> provider) {
        return new C13122f(provider);
    }
}
