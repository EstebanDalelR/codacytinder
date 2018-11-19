package com.tinder.base.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import okhttp3.Interceptor;

/* renamed from: com.tinder.base.module.b */
public final class C12614b implements Factory<Interceptor> {
    /* renamed from: a */
    private final ImageNetworkModule f40714a;

    public /* synthetic */ Object get() {
        return m49824a();
    }

    /* renamed from: a */
    public Interceptor m49824a() {
        return C12614b.m49822a(this.f40714a);
    }

    /* renamed from: a */
    public static Interceptor m49822a(ImageNetworkModule imageNetworkModule) {
        return C12614b.m49823b(imageNetworkModule);
    }

    /* renamed from: b */
    public static Interceptor m49823b(ImageNetworkModule imageNetworkModule) {
        return (Interceptor) C15521i.a(imageNetworkModule.m35416b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
