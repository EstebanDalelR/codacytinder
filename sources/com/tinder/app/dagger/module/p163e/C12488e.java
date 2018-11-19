package com.tinder.app.dagger.module.p163e;

import com.tinder.superlikeable.C15139b;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.e.e */
public final class C12488e implements Factory<C15139b> {
    /* renamed from: a */
    private static final C12488e f40268a = new C12488e();

    public /* synthetic */ Object get() {
        return m49125a();
    }

    /* renamed from: a */
    public C15139b m49125a() {
        return C12488e.m49122b();
    }

    /* renamed from: b */
    public static C15139b m49122b() {
        return C12488e.m49124d();
    }

    /* renamed from: c */
    public static C12488e m49123c() {
        return f40268a;
    }

    /* renamed from: d */
    public static C15139b m49124d() {
        return (C15139b) C15521i.a(C8248a.m35191c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
