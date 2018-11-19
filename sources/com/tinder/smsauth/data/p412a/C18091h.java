package com.tinder.smsauth.data.p412a;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* renamed from: com.tinder.smsauth.data.a.h */
public final class C18091h implements Factory<RxJava2CallAdapterFactory> {
    /* renamed from: a */
    private final C14966b f56186a;

    public /* synthetic */ Object get() {
        return m65685a();
    }

    /* renamed from: a */
    public RxJava2CallAdapterFactory m65685a() {
        return C18091h.m65683a(this.f56186a);
    }

    /* renamed from: a */
    public static RxJava2CallAdapterFactory m65683a(C14966b c14966b) {
        return C18091h.m65684b(c14966b);
    }

    /* renamed from: b */
    public static RxJava2CallAdapterFactory m65684b(C14966b c14966b) {
        return (RxJava2CallAdapterFactory) C15521i.m58001a(c14966b.m56550b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
