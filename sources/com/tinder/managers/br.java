package com.tinder.managers;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class br implements Factory<bq> {
    /* renamed from: a */
    private final Provider<bk> f42513a;
    /* renamed from: b */
    private final Provider<Context> f42514b;

    public /* synthetic */ Object get() {
        return m51823a();
    }

    public br(Provider<bk> provider, Provider<Context> provider2) {
        this.f42513a = provider;
        this.f42514b = provider2;
    }

    /* renamed from: a */
    public bq m51823a() {
        return m51821a(this.f42513a, this.f42514b);
    }

    /* renamed from: a */
    public static bq m51821a(Provider<bk> provider, Provider<Context> provider2) {
        return new bq((bk) provider.get(), (Context) provider2.get());
    }

    /* renamed from: b */
    public static br m51822b(Provider<bk> provider, Provider<Context> provider2) {
        return new br(provider, provider2);
    }
}
