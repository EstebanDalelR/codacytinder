package com.tinder.auth;

import com.tinder.api.EnvironmentProvider;
import com.tinder.api.buckets.BucketsService;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;

/* renamed from: com.tinder.auth.m */
public final class C12597m implements Factory<BucketsService> {
    /* renamed from: a */
    private final C8266a f40682a;
    /* renamed from: b */
    private final Provider<C17692o> f40683b;
    /* renamed from: c */
    private final Provider<EnvironmentProvider> f40684c;

    public /* synthetic */ Object get() {
        return m49767a();
    }

    /* renamed from: a */
    public BucketsService m49767a() {
        return C12597m.m49765a(this.f40682a, this.f40683b, this.f40684c);
    }

    /* renamed from: a */
    public static BucketsService m49765a(C8266a c8266a, Provider<C17692o> provider, Provider<EnvironmentProvider> provider2) {
        return C12597m.m49766a(c8266a, (C17692o) provider.get(), (EnvironmentProvider) provider2.get());
    }

    /* renamed from: a */
    public static BucketsService m49766a(C8266a c8266a, C17692o c17692o, EnvironmentProvider environmentProvider) {
        return (BucketsService) C15521i.a(c8266a.m35294a(c17692o, environmentProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
