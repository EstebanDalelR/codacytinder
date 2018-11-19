package com.tinder.module;

import com.tinder.common.repository.MyUserRepository;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cy implements Factory<MyUserRepository> {
    /* renamed from: a */
    private final bs f42897a;
    /* renamed from: b */
    private final Provider<bk> f42898b;
    /* renamed from: c */
    private final Provider<bj> f42899c;

    public /* synthetic */ Object get() {
        return m52326a();
    }

    /* renamed from: a */
    public MyUserRepository m52326a() {
        return m52325a(this.f42897a, this.f42898b, this.f42899c);
    }

    /* renamed from: a */
    public static MyUserRepository m52325a(bs bsVar, Provider<bk> provider, Provider<bj> provider2) {
        return m52324a(bsVar, (bk) provider.get(), (bj) provider2.get());
    }

    /* renamed from: a */
    public static MyUserRepository m52324a(bs bsVar, bk bkVar, bj bjVar) {
        return (MyUserRepository) C15521i.a(bsVar.m40804a(bkVar, bjVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
