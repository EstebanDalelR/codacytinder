package com.tinder.base.module;

import com.tinder.base.p174d.p175a.C8308d;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.Interceptor;

/* renamed from: com.tinder.base.module.d */
public final class C12616d implements Factory<Interceptor> {
    /* renamed from: a */
    private final ImageNetworkModule f40716a;
    /* renamed from: b */
    private final Provider<C8308d> f40717b;

    public /* synthetic */ Object get() {
        return m49831a();
    }

    /* renamed from: a */
    public Interceptor m49831a() {
        return C12616d.m49830a(this.f40716a, this.f40717b);
    }

    /* renamed from: a */
    public static Interceptor m49830a(ImageNetworkModule imageNetworkModule, Provider<C8308d> provider) {
        return C12616d.m49829a(imageNetworkModule, (C8308d) provider.get());
    }

    /* renamed from: a */
    public static Interceptor m49829a(ImageNetworkModule imageNetworkModule, C8308d c8308d) {
        return (Interceptor) C15521i.a(imageNetworkModule.m35415a(c8308d), "Cannot return null from a non-@Nullable @Provides method");
    }
}
