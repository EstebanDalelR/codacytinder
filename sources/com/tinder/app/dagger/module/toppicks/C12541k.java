package com.tinder.app.dagger.module.toppicks;

import com.tinder.toppicks.C15256e;
import com.tinder.toppicks.C15275j;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;

/* renamed from: com.tinder.app.dagger.module.toppicks.k */
public final class C12541k implements Factory<C15256e> {
    /* renamed from: a */
    private final C8254a f40402a;
    /* renamed from: b */
    private final Provider<Function0<Long>> f40403b;
    /* renamed from: c */
    private final Provider<C15275j> f40404c;

    public /* synthetic */ Object get() {
        return m49355a();
    }

    public C12541k(C8254a c8254a, Provider<Function0<Long>> provider, Provider<C15275j> provider2) {
        this.f40402a = c8254a;
        this.f40403b = provider;
        this.f40404c = provider2;
    }

    /* renamed from: a */
    public C15256e m49355a() {
        return C12541k.m49352a(this.f40402a, this.f40403b, this.f40404c);
    }

    /* renamed from: a */
    public static C15256e m49352a(C8254a c8254a, Provider<Function0<Long>> provider, Provider<C15275j> provider2) {
        return C12541k.m49353a(c8254a, (Function0) provider.get(), (C15275j) provider2.get());
    }

    /* renamed from: b */
    public static C12541k m49354b(C8254a c8254a, Provider<Function0<Long>> provider, Provider<C15275j> provider2) {
        return new C12541k(c8254a, provider, provider2);
    }

    /* renamed from: a */
    public static C15256e m49353a(C8254a c8254a, Function0<Long> function0, C15275j c15275j) {
        return (C15256e) C15521i.a(c8254a.m35234a(function0, c15275j), "Cannot return null from a non-@Nullable @Provides method");
    }
}
