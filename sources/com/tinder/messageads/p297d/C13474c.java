package com.tinder.messageads.p297d;

import com.tinder.messageads.p350g.C12127a;
import com.tinder.messageads.provider.C9913a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.messageads.d.c */
public final class C13474c implements Factory<C9913a> {
    /* renamed from: a */
    private final C9907a f42736a;
    /* renamed from: b */
    private final Provider<C12127a> f42737b;

    public /* synthetic */ Object get() {
        return m52040a();
    }

    public C13474c(C9907a c9907a, Provider<C12127a> provider) {
        this.f42736a = c9907a;
        this.f42737b = provider;
    }

    /* renamed from: a */
    public C9913a m52040a() {
        return C13474c.m52038a(this.f42736a, this.f42737b);
    }

    /* renamed from: a */
    public static C9913a m52038a(C9907a c9907a, Provider<C12127a> provider) {
        return C13474c.m52037a(c9907a, (C12127a) provider.get());
    }

    /* renamed from: b */
    public static C13474c m52039b(C9907a c9907a, Provider<C12127a> provider) {
        return new C13474c(c9907a, provider);
    }

    /* renamed from: a */
    public static C9913a m52037a(C9907a c9907a, C12127a c12127a) {
        return (C9913a) C15521i.a(c9907a.m40720a(c12127a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
