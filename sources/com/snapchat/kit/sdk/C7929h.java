package com.snapchat.kit.sdk;

import com.google.gson.Gson;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.h */
public final class C7929h implements Factory<Gson> {
    /* renamed from: a */
    private final C5951d f28515a;

    public /* synthetic */ Object get() {
        return m33776a();
    }

    public C7929h(C5951d c5951d) {
        this.f28515a = c5951d;
    }

    /* renamed from: a */
    public Gson m33776a() {
        return (Gson) C15521i.a(this.f28515a.m25564d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<Gson> m33775a(C5951d c5951d) {
        return new C7929h(c5951d);
    }
}
