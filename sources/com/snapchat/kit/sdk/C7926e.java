package com.snapchat.kit.sdk;

import com.squareup.okhttp.C5997b;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.e */
public final class C7926e implements Factory<C5997b> {
    /* renamed from: a */
    private final C5951d f28512a;

    public /* synthetic */ Object get() {
        return m33770a();
    }

    public C7926e(C5951d c5951d) {
        this.f28512a = c5951d;
    }

    /* renamed from: a */
    public C5997b m33770a() {
        return (C5997b) C15521i.a(this.f28512a.m25566f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5997b> m33769a(C5951d c5951d) {
        return new C7926e(c5951d);
    }
}
