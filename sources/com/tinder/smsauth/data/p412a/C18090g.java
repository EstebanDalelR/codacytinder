package com.tinder.smsauth.data.p412a;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* renamed from: com.tinder.smsauth.data.a.g */
public final class C18090g implements Factory<Retrofit> {
    /* renamed from: a */
    private final C14966b f56182a;
    /* renamed from: b */
    private final Provider<C17692o> f56183b;
    /* renamed from: c */
    private final Provider<RxJava2CallAdapterFactory> f56184c;
    /* renamed from: d */
    private final Provider<MoshiConverterFactory> f56185d;

    public /* synthetic */ Object get() {
        return m65682a();
    }

    /* renamed from: a */
    public Retrofit m65682a() {
        return C18090g.m65680a(this.f56182a, this.f56183b, this.f56184c, this.f56185d);
    }

    /* renamed from: a */
    public static Retrofit m65680a(C14966b c14966b, Provider<C17692o> provider, Provider<RxJava2CallAdapterFactory> provider2, Provider<MoshiConverterFactory> provider3) {
        return C18090g.m65681a(c14966b, (C17692o) provider.get(), (RxJava2CallAdapterFactory) provider2.get(), (MoshiConverterFactory) provider3.get());
    }

    /* renamed from: a */
    public static Retrofit m65681a(C14966b c14966b, C17692o c17692o, RxJava2CallAdapterFactory rxJava2CallAdapterFactory, MoshiConverterFactory moshiConverterFactory) {
        return (Retrofit) C15521i.m58001a(c14966b.m56548a(c17692o, rxJava2CallAdapterFactory, moshiConverterFactory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
