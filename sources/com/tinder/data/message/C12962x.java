package com.tinder.data.message;

import com.tinder.data.gif.C10781a;
import com.tinder.data.gif.GifApiClient;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.message.x */
public final class C12962x implements Factory<GifApiClient> {
    /* renamed from: a */
    private final C8698t f41517a;
    /* renamed from: b */
    private final Provider<C10781a> f41518b;

    public /* synthetic */ Object get() {
        return m50693a();
    }

    public C12962x(C8698t c8698t, Provider<C10781a> provider) {
        this.f41517a = c8698t;
        this.f41518b = provider;
    }

    /* renamed from: a */
    public GifApiClient m50693a() {
        return C12962x.m50691a(this.f41517a, this.f41518b);
    }

    /* renamed from: a */
    public static GifApiClient m50691a(C8698t c8698t, Provider<C10781a> provider) {
        return C12962x.m50690a(c8698t, (C10781a) provider.get());
    }

    /* renamed from: b */
    public static C12962x m50692b(C8698t c8698t, Provider<C10781a> provider) {
        return new C12962x(c8698t, provider);
    }

    /* renamed from: a */
    public static GifApiClient m50690a(C8698t c8698t, C10781a c10781a) {
        return (GifApiClient) C15521i.a(c8698t.m37155a(c10781a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
