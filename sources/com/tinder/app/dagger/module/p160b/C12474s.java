package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.C11813p;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.s */
public final class C12474s implements Factory<C11813p> {
    /* renamed from: a */
    private final C8245a f40235a;
    /* renamed from: b */
    private final Provider<C11809n> f40236b;

    public /* synthetic */ Object get() {
        return m49070a();
    }

    /* renamed from: a */
    public C11813p m49070a() {
        return C12474s.m49069a(this.f40235a, this.f40236b);
    }

    /* renamed from: a */
    public static C11813p m49069a(C8245a c8245a, Provider<C11809n> provider) {
        return C12474s.m49068a(c8245a, (C11809n) provider.get());
    }

    /* renamed from: a */
    public static C11813p m49068a(C8245a c8245a, C11809n c11809n) {
        return (C11813p) C15521i.a(c8245a.m35180b(c11809n), "Cannot return null from a non-@Nullable @Provides method");
    }
}
