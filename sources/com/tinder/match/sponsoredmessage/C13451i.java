package com.tinder.match.sponsoredmessage;

import com.tinder.sponsoredmessage.C15032a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.i */
public final class C13451i implements Factory<C15032a> {
    /* renamed from: a */
    private final C9882h f42645a;
    /* renamed from: b */
    private final Provider<C12084b> f42646b;
    /* renamed from: c */
    private final Provider<C12087e> f42647c;

    public /* synthetic */ Object get() {
        return m51955a();
    }

    public C13451i(C9882h c9882h, Provider<C12084b> provider, Provider<C12087e> provider2) {
        this.f42645a = c9882h;
        this.f42646b = provider;
        this.f42647c = provider2;
    }

    /* renamed from: a */
    public C15032a m51955a() {
        return C13451i.m51953a(this.f42645a, this.f42646b, this.f42647c);
    }

    /* renamed from: a */
    public static C15032a m51953a(C9882h c9882h, Provider<C12084b> provider, Provider<C12087e> provider2) {
        return C13451i.m51952a(c9882h, (C12084b) provider.get(), (C12087e) provider2.get());
    }

    /* renamed from: b */
    public static C13451i m51954b(C9882h c9882h, Provider<C12084b> provider, Provider<C12087e> provider2) {
        return new C13451i(c9882h, provider, provider2);
    }

    /* renamed from: a */
    public static C15032a m51952a(C9882h c9882h, C12084b c12084b, C12087e c12087e) {
        return (C15032a) C15521i.a(c9882h.m40665a(c12084b, c12087e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
