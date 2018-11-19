package com.tinder.crashindicator.reporter;

import com.tinder.crashindicator.p321c.C10715c;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.crashindicator.reporter.b */
public final class C12821b implements Factory<C10716a> {
    /* renamed from: a */
    private final Provider<AppCloseOnUncaughtExceptionHandler> f41229a;
    /* renamed from: b */
    private final Provider<C10715c> f41230b;
    /* renamed from: c */
    private final Provider<Function0<DateTime>> f41231c;

    public /* synthetic */ Object get() {
        return m50346a();
    }

    public C12821b(Provider<AppCloseOnUncaughtExceptionHandler> provider, Provider<C10715c> provider2, Provider<Function0<DateTime>> provider3) {
        this.f41229a = provider;
        this.f41230b = provider2;
        this.f41231c = provider3;
    }

    /* renamed from: a */
    public C10716a m50346a() {
        return C12821b.m50344a(this.f41229a, this.f41230b, this.f41231c);
    }

    /* renamed from: a */
    public static C10716a m50344a(Provider<AppCloseOnUncaughtExceptionHandler> provider, Provider<C10715c> provider2, Provider<Function0<DateTime>> provider3) {
        return new C10716a((AppCloseOnUncaughtExceptionHandler) provider.get(), (C10715c) provider2.get(), (Function0) provider3.get());
    }

    /* renamed from: b */
    public static C12821b m50345b(Provider<AppCloseOnUncaughtExceptionHandler> provider, Provider<C10715c> provider2, Provider<Function0<DateTime>> provider3) {
        return new C12821b(provider, provider2, provider3);
    }
}
