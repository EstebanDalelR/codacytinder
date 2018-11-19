package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.Level;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.LinkedHashMap;

/* renamed from: com.tinder.app.dagger.module.b.k */
public final class C12466k implements Factory<LinkedHashMap<Level, Integer>> {
    /* renamed from: a */
    private final C8245a f40219a;

    public /* synthetic */ Object get() {
        return m49039a();
    }

    public C12466k(C8245a c8245a) {
        this.f40219a = c8245a;
    }

    /* renamed from: a */
    public LinkedHashMap<Level, Integer> m49039a() {
        return C12466k.m49036a(this.f40219a);
    }

    /* renamed from: a */
    public static LinkedHashMap<Level, Integer> m49036a(C8245a c8245a) {
        return C12466k.m49038c(c8245a);
    }

    /* renamed from: b */
    public static C12466k m49037b(C8245a c8245a) {
        return new C12466k(c8245a);
    }

    /* renamed from: c */
    public static LinkedHashMap<Level, Integer> m49038c(C8245a c8245a) {
        return (LinkedHashMap) C15521i.a(c8245a.m35174a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
