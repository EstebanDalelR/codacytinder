package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C9567m;
import com.tinder.fireboarding.domain.Level;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.LinkedHashMap;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.p */
public final class C12471p implements Factory<C9567m> {
    /* renamed from: a */
    private final C8245a f40229a;
    /* renamed from: b */
    private final Provider<LinkedHashMap<Level, Integer>> f40230b;

    public /* synthetic */ Object get() {
        return m49059a();
    }

    public C12471p(C8245a c8245a, Provider<LinkedHashMap<Level, Integer>> provider) {
        this.f40229a = c8245a;
        this.f40230b = provider;
    }

    /* renamed from: a */
    public C9567m m49059a() {
        return C12471p.m49057a(this.f40229a, this.f40230b);
    }

    /* renamed from: a */
    public static C9567m m49057a(C8245a c8245a, Provider<LinkedHashMap<Level, Integer>> provider) {
        return C12471p.m49056a(c8245a, (LinkedHashMap) provider.get());
    }

    /* renamed from: b */
    public static C12471p m49058b(C8245a c8245a, Provider<LinkedHashMap<Level, Integer>> provider) {
        return new C12471p(c8245a, provider);
    }

    /* renamed from: a */
    public static C9567m m49056a(C8245a c8245a, LinkedHashMap<Level, Integer> linkedHashMap) {
        return (C9567m) C15521i.a(c8245a.m35169a((LinkedHashMap) linkedHashMap), "Cannot return null from a non-@Nullable @Provides method");
    }
}
