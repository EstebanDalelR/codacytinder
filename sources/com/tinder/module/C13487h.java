package com.tinder.module;

import com.tinder.addy.Addy;
import com.tinder.addy.tracker.AdUrlTracker;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.h */
public final class C13487h implements Factory<AdUrlTracker> {
    /* renamed from: a */
    private final C9940d f43040a;
    /* renamed from: b */
    private final Provider<Addy> f43041b;

    public /* synthetic */ Object get() {
        return m52540a();
    }

    public C13487h(C9940d c9940d, Provider<Addy> provider) {
        this.f43040a = c9940d;
        this.f43041b = provider;
    }

    /* renamed from: a */
    public AdUrlTracker m52540a() {
        return C13487h.m52538a(this.f43040a, this.f43041b);
    }

    /* renamed from: a */
    public static AdUrlTracker m52538a(C9940d c9940d, Provider<Addy> provider) {
        return C13487h.m52537a(c9940d, (Addy) provider.get());
    }

    /* renamed from: b */
    public static C13487h m52539b(C9940d c9940d, Provider<Addy> provider) {
        return new C13487h(c9940d, provider);
    }

    /* renamed from: a */
    public static AdUrlTracker m52537a(C9940d c9940d, Addy addy) {
        return (AdUrlTracker) C15521i.a(c9940d.m40871b(addy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
