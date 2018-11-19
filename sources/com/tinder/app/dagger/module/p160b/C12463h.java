package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C9562d;
import com.tinder.fireboarding.domain.Level;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.LinkedHashMap;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.h */
public final class C12463h implements Factory<C9562d> {
    /* renamed from: a */
    private final C8245a f40206a;
    /* renamed from: b */
    private final Provider<LinkedHashMap<Level, Integer>> f40207b;

    public /* synthetic */ Object get() {
        return m49027a();
    }

    public C12463h(C8245a c8245a, Provider<LinkedHashMap<Level, Integer>> provider) {
        this.f40206a = c8245a;
        this.f40207b = provider;
    }

    /* renamed from: a */
    public C9562d m49027a() {
        return C12463h.m49025a(this.f40206a, this.f40207b);
    }

    /* renamed from: a */
    public static C9562d m49025a(C8245a c8245a, Provider<LinkedHashMap<Level, Integer>> provider) {
        return C12463h.m49024a(c8245a, (LinkedHashMap) provider.get());
    }

    /* renamed from: b */
    public static C12463h m49026b(C8245a c8245a, Provider<LinkedHashMap<Level, Integer>> provider) {
        return new C12463h(c8245a, provider);
    }

    /* renamed from: a */
    public static C9562d m49024a(C8245a c8245a, LinkedHashMap<Level, Integer> linkedHashMap) {
        return (C9562d) C15521i.a(c8245a.m35177b((LinkedHashMap) linkedHashMap), "Cannot return null from a non-@Nullable @Provides method");
    }
}
