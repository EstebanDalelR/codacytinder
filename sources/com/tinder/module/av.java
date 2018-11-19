package com.tinder.module;

import android.content.Context;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.billing.C14484a;
import com.tinder.purchase.model.C14530a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class av implements Factory<Biller> {
    /* renamed from: a */
    private final au f42785a;
    /* renamed from: b */
    private final Provider<Context> f42786b;
    /* renamed from: c */
    private final Provider<C14530a> f42787c;
    /* renamed from: d */
    private final Provider<C14484a> f42788d;

    public /* synthetic */ Object get() {
        return m52126a();
    }

    public av(au auVar, Provider<Context> provider, Provider<C14530a> provider2, Provider<C14484a> provider3) {
        this.f42785a = auVar;
        this.f42786b = provider;
        this.f42787c = provider2;
        this.f42788d = provider3;
    }

    /* renamed from: a */
    public Biller m52126a() {
        return m52124a(this.f42785a, this.f42786b, this.f42787c, this.f42788d);
    }

    /* renamed from: a */
    public static Biller m52124a(au auVar, Provider<Context> provider, Provider<C14530a> provider2, Provider<C14484a> provider3) {
        return m52123a(auVar, (Context) provider.get(), (C14530a) provider2.get(), (C14484a) provider3.get());
    }

    /* renamed from: b */
    public static av m52125b(au auVar, Provider<Context> provider, Provider<C14530a> provider2, Provider<C14484a> provider3) {
        return new av(auVar, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static Biller m52123a(au auVar, Context context, C14530a c14530a, C14484a c14484a) {
        return (Biller) C15521i.a(auVar.m40781a(context, c14530a, c14484a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
