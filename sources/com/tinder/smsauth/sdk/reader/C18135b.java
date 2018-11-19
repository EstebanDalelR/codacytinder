package com.tinder.smsauth.sdk.reader;

import android.content.Context;
import com.tinder.common.logger.Logger;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.sdk.reader.b */
public final class C18135b implements Factory<C16769a> {
    /* renamed from: a */
    private final Provider<Context> f56270a;
    /* renamed from: b */
    private final Provider<Logger> f56271b;

    public /* synthetic */ Object get() {
        return m65802a();
    }

    public C18135b(Provider<Context> provider, Provider<Logger> provider2) {
        this.f56270a = provider;
        this.f56271b = provider2;
    }

    /* renamed from: a */
    public C16769a m65802a() {
        return C18135b.m65800a(this.f56270a, this.f56271b);
    }

    /* renamed from: a */
    public static C16769a m65800a(Provider<Context> provider, Provider<Logger> provider2) {
        return new C16769a((Context) provider.get(), (Logger) provider2.get());
    }

    /* renamed from: b */
    public static C18135b m65801b(Provider<Context> provider, Provider<Logger> provider2) {
        return new C18135b(provider, provider2);
    }
}
