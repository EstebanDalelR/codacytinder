package com.tinder.data.adapter;

import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.data.adapter.d */
public final class C12830d implements Factory<C3925u> {
    /* renamed from: a */
    private static final C12830d f41263a = new C12830d();

    public /* synthetic */ Object get() {
        return m50401a();
    }

    /* renamed from: a */
    public C3925u m50401a() {
        return C12830d.m50398b();
    }

    /* renamed from: b */
    public static C3925u m50398b() {
        return C12830d.m50400d();
    }

    /* renamed from: c */
    public static C12830d m50399c() {
        return f41263a;
    }

    /* renamed from: d */
    public static C3925u m50400d() {
        return (C3925u) C15521i.a(C8614a.m36756a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
