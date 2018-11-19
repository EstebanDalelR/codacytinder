package com.tinder.base.module;

import com.tinder.base.p174d.p175a.C8308d;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.base.module.c */
public final class C12615c implements Factory<C8308d> {
    /* renamed from: a */
    private final ImageNetworkModule f40715a;

    public /* synthetic */ Object get() {
        return m49828a();
    }

    public C12615c(ImageNetworkModule imageNetworkModule) {
        this.f40715a = imageNetworkModule;
    }

    /* renamed from: a */
    public C8308d m49828a() {
        return C12615c.m49825a(this.f40715a);
    }

    /* renamed from: a */
    public static C8308d m49825a(ImageNetworkModule imageNetworkModule) {
        return C12615c.m49827c(imageNetworkModule);
    }

    /* renamed from: b */
    public static C12615c m49826b(ImageNetworkModule imageNetworkModule) {
        return new C12615c(imageNetworkModule);
    }

    /* renamed from: c */
    public static C8308d m49827c(ImageNetworkModule imageNetworkModule) {
        return (C8308d) C15521i.a(imageNetworkModule.m35417c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
