package com.snapchat.kit.sdk;

import com.squareup.okhttp.C6068p;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.k */
public final class C7932k implements Factory<C6068p> {
    /* renamed from: a */
    private final C5951d f28526a;

    public /* synthetic */ Object get() {
        return m33782a();
    }

    public C7932k(C5951d c5951d) {
        this.f28526a = c5951d;
    }

    /* renamed from: a */
    public C6068p m33782a() {
        return (C6068p) C15521i.a(this.f28526a.m25567g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C6068p> m33781a(C5951d c5951d) {
        return new C7932k(c5951d);
    }
}
