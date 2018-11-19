package com.tinder.crashindicator.p321c;

import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.crashindicator.c.d */
public final class C12820d implements Factory<C10715c> {
    /* renamed from: a */
    private final Provider<CrashTimeStampGateway> f41228a;

    public /* synthetic */ Object get() {
        return m50343a();
    }

    public C12820d(Provider<CrashTimeStampGateway> provider) {
        this.f41228a = provider;
    }

    /* renamed from: a */
    public C10715c m50343a() {
        return C12820d.m50341a(this.f41228a);
    }

    /* renamed from: a */
    public static C10715c m50341a(Provider<CrashTimeStampGateway> provider) {
        return new C10715c((CrashTimeStampGateway) provider.get());
    }

    /* renamed from: b */
    public static C12820d m50342b(Provider<CrashTimeStampGateway> provider) {
        return new C12820d(provider);
    }
}
