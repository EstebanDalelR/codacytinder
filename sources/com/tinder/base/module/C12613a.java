package com.tinder.base.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import okhttp3.Interceptor;

/* renamed from: com.tinder.base.module.a */
public final class C12613a implements Factory<Interceptor> {
    /* renamed from: a */
    private final ImageNetworkModule f40713a;

    public /* synthetic */ Object get() {
        return m49821a();
    }

    /* renamed from: a */
    public Interceptor m49821a() {
        return C12613a.m49819a(this.f40713a);
    }

    /* renamed from: a */
    public static Interceptor m49819a(ImageNetworkModule imageNetworkModule) {
        return C12613a.m49820b(imageNetworkModule);
    }

    /* renamed from: b */
    public static Interceptor m49820b(ImageNetworkModule imageNetworkModule) {
        return (Interceptor) C15521i.a(imageNetworkModule.m35414a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
