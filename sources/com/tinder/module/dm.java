package com.tinder.module;

import android.content.Context;
import com.tinder.purchase.logging.repository.PurchaseLogRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dm implements Factory<PurchaseLogRepository> {
    /* renamed from: a */
    private final bs f42926a;
    /* renamed from: b */
    private final Provider<Context> f42927b;

    public /* synthetic */ Object get() {
        return m52381a();
    }

    public dm(bs bsVar, Provider<Context> provider) {
        this.f42926a = bsVar;
        this.f42927b = provider;
    }

    /* renamed from: a */
    public PurchaseLogRepository m52381a() {
        return m52379a(this.f42926a, this.f42927b);
    }

    /* renamed from: a */
    public static PurchaseLogRepository m52379a(bs bsVar, Provider<Context> provider) {
        return m52378a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static dm m52380b(bs bsVar, Provider<Context> provider) {
        return new dm(bsVar, provider);
    }

    /* renamed from: a */
    public static PurchaseLogRepository m52378a(bs bsVar, Context context) {
        return (PurchaseLogRepository) C15521i.a(bsVar.m40840g(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
