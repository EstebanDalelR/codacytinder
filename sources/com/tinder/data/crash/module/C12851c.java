package com.tinder.data.crash.module;

import com.tinder.data.crash.p213a.C10762a;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.crash.module.c */
public final class C12851c implements Factory<CrashTimeStampGateway> {
    /* renamed from: a */
    private final C8639a f41288a;
    /* renamed from: b */
    private final Provider<C10762a> f41289b;

    public /* synthetic */ Object get() {
        return m50469a();
    }

    public C12851c(C8639a c8639a, Provider<C10762a> provider) {
        this.f41288a = c8639a;
        this.f41289b = provider;
    }

    /* renamed from: a */
    public CrashTimeStampGateway m50469a() {
        return C12851c.m50467a(this.f41288a, this.f41289b);
    }

    /* renamed from: a */
    public static CrashTimeStampGateway m50467a(C8639a c8639a, Provider<C10762a> provider) {
        return C12851c.m50466a(c8639a, (C10762a) provider.get());
    }

    /* renamed from: b */
    public static C12851c m50468b(C8639a c8639a, Provider<C10762a> provider) {
        return new C12851c(c8639a, provider);
    }

    /* renamed from: a */
    public static CrashTimeStampGateway m50466a(C8639a c8639a, C10762a c10762a) {
        return (CrashTimeStampGateway) C15521i.a(c8639a.m36796a(c10762a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
