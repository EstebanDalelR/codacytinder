package com.tinder.analytics.attribution;

import com.appsflyer.C3010d;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.analytics.attribution.m */
public final class C7997m implements Factory<C3010d> {
    /* renamed from: a */
    private static final C7997m f28611a = new C7997m();

    public /* synthetic */ Object get() {
        return m33883a();
    }

    /* renamed from: a */
    public C3010d m33883a() {
        return C7997m.m33880b();
    }

    /* renamed from: b */
    public static C3010d m33880b() {
        return C7997m.m33882d();
    }

    /* renamed from: c */
    public static C7997m m33881c() {
        return f28611a;
    }

    /* renamed from: d */
    public static C3010d m33882d() {
        return (C3010d) C15521i.a(C6209l.m26837a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
