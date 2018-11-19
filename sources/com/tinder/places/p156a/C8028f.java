package com.tinder.places.p156a;

import com.tinder.discovery.p235d.C11140a.C8891a;
import com.tinder.main.trigger.Trigger;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.a.f */
public final class C8028f implements Factory<Trigger> {
    /* renamed from: a */
    private final C6251e f28676a;
    /* renamed from: b */
    private final Provider<C8891a> f28677b;
    /* renamed from: c */
    private final Provider<C7357l> f28678c;
    /* renamed from: d */
    private final Provider<C7353j> f28679d;

    public /* synthetic */ Object get() {
        return m33944a();
    }

    public C8028f(C6251e c6251e, Provider<C8891a> provider, Provider<C7357l> provider2, Provider<C7353j> provider3) {
        this.f28676a = c6251e;
        this.f28677b = provider;
        this.f28678c = provider2;
        this.f28679d = provider3;
    }

    /* renamed from: a */
    public Trigger m33944a() {
        return C8028f.m33942a(this.f28676a, this.f28677b, this.f28678c, this.f28679d);
    }

    /* renamed from: a */
    public static Trigger m33942a(C6251e c6251e, Provider<C8891a> provider, Provider<C7357l> provider2, Provider<C7353j> provider3) {
        return C8028f.m33941a(c6251e, (C8891a) provider.get(), (C7357l) provider2.get(), (C7353j) provider3.get());
    }

    /* renamed from: b */
    public static C8028f m33943b(C6251e c6251e, Provider<C8891a> provider, Provider<C7357l> provider2, Provider<C7353j> provider3) {
        return new C8028f(c6251e, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static Trigger m33941a(C6251e c6251e, C8891a c8891a, C7357l c7357l, C7353j c7353j) {
        return (Trigger) C15521i.a(c6251e.m26960a(c8891a, c7357l, c7353j), "Cannot return null from a non-@Nullable @Provides method");
    }
}
