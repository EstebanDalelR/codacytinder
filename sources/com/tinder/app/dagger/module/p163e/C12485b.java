package com.tinder.app.dagger.module.p163e;

import com.tinder.data.superlikeable.SuperLikeableGameApiClient.C8790a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.e.b */
public final class C12485b implements Factory<C8790a> {
    /* renamed from: a */
    private static final C12485b f40262a = new C12485b();

    public /* synthetic */ Object get() {
        return m49114a();
    }

    /* renamed from: a */
    public C8790a m49114a() {
        return C12485b.m49111b();
    }

    /* renamed from: b */
    public static C8790a m49111b() {
        return C12485b.m49113d();
    }

    /* renamed from: c */
    public static C12485b m49112c() {
        return f40262a;
    }

    /* renamed from: d */
    public static C8790a m49113d() {
        return (C8790a) C15521i.a(C8248a.m35190b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
