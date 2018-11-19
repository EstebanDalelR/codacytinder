package com.tinder.application;

import com.tinder.api.EnvironmentProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.application.f */
public final class C12558f implements Factory<EnvironmentProvider> {
    /* renamed from: a */
    private static final C12558f f40587a = new C12558f();

    public /* synthetic */ Object get() {
        return m49638a();
    }

    /* renamed from: a */
    public EnvironmentProvider m49638a() {
        return C12558f.m49635b();
    }

    /* renamed from: b */
    public static EnvironmentProvider m49635b() {
        return C12558f.m49637d();
    }

    /* renamed from: c */
    public static C12558f m49636c() {
        return f40587a;
    }

    /* renamed from: d */
    public static EnvironmentProvider m49637d() {
        return (EnvironmentProvider) C15521i.a(C8256b.m35244b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
