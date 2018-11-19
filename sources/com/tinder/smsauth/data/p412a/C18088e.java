package com.tinder.smsauth.data.p412a;

import com.squareup.moshi.C5987p;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* renamed from: com.tinder.smsauth.data.a.e */
public final class C18088e implements Factory<MoshiConverterFactory> {
    /* renamed from: a */
    private final C14966b f56178a;
    /* renamed from: b */
    private final Provider<C5987p> f56179b;

    public /* synthetic */ Object get() {
        return m65676a();
    }

    /* renamed from: a */
    public MoshiConverterFactory m65676a() {
        return C18088e.m65675a(this.f56178a, this.f56179b);
    }

    /* renamed from: a */
    public static MoshiConverterFactory m65675a(C14966b c14966b, Provider<C5987p> provider) {
        return C18088e.m65674a(c14966b, (C5987p) provider.get());
    }

    /* renamed from: a */
    public static MoshiConverterFactory m65674a(C14966b c14966b, C5987p c5987p) {
        return (MoshiConverterFactory) C15521i.m58001a(c14966b.m56549a(c5987p), "Cannot return null from a non-@Nullable @Provides method");
    }
}
