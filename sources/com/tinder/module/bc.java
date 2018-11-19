package com.tinder.module;

import com.tinder.purchase.register.Register;
import com.tinder.purchase.register.RegisterImpl;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bc implements Factory<Register> {
    /* renamed from: a */
    private final au f42800a;
    /* renamed from: b */
    private final Provider<RegisterImpl> f42801b;

    public /* synthetic */ Object get() {
        return m52158a();
    }

    public bc(au auVar, Provider<RegisterImpl> provider) {
        this.f42800a = auVar;
        this.f42801b = provider;
    }

    /* renamed from: a */
    public Register m52158a() {
        return m52156a(this.f42800a, this.f42801b);
    }

    /* renamed from: a */
    public static Register m52156a(au auVar, Provider<RegisterImpl> provider) {
        return m52155a(auVar, (RegisterImpl) provider.get());
    }

    /* renamed from: b */
    public static bc m52157b(au auVar, Provider<RegisterImpl> provider) {
        return new bc(auVar, provider);
    }

    /* renamed from: a */
    public static Register m52155a(au auVar, RegisterImpl registerImpl) {
        return (Register) C15521i.a(auVar.m40785a(registerImpl), "Cannot return null from a non-@Nullable @Provides method");
    }
}
