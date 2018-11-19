package com.tinder.common.tracker.recyclerview.p200c;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.common.tracker.recyclerview.c.d */
public final class C12801d<T> implements Factory<C8574c<T>> {
    /* renamed from: a */
    private final Provider<C2642a> f41202a;

    public /* synthetic */ Object get() {
        return m50298a();
    }

    public C12801d(Provider<C2642a> provider) {
        this.f41202a = provider;
    }

    /* renamed from: a */
    public C8574c<T> m50298a() {
        return C12801d.m50296a(this.f41202a);
    }

    /* renamed from: a */
    public static <T> C8574c<T> m50296a(Provider<C2642a> provider) {
        return new C8574c((C2642a) provider.get());
    }

    /* renamed from: b */
    public static <T> C12801d<T> m50297b(Provider<C2642a> provider) {
        return new C12801d(provider);
    }
}
