package com.tinder.auth.repository;

import android.content.ContentResolver;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.repository.l */
public final class C12604l implements Factory<C8297k> {
    /* renamed from: a */
    private final Provider<ContentResolver> f40696a;

    public /* synthetic */ Object get() {
        return m49790a();
    }

    public C12604l(Provider<ContentResolver> provider) {
        this.f40696a = provider;
    }

    /* renamed from: a */
    public C8297k m49790a() {
        return C12604l.m49788a(this.f40696a);
    }

    /* renamed from: a */
    public static C8297k m49788a(Provider<ContentResolver> provider) {
        return new C8297k((ContentResolver) provider.get());
    }

    /* renamed from: b */
    public static C12604l m49789b(Provider<ContentResolver> provider) {
        return new C12604l(provider);
    }
}
